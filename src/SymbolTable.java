import java.util.List;

import org.antlr.runtime.TokenStream;


public class SymbolTable {
    GlobalScope globals = new GlobalScope();
    ClassSymbol objectRoot;
    
    // these type indexes are used for automatic type promotion
    // for example, (1 + 2.5) would yield a float and ('a' + 6) would yield an int
    // the types are defined in order from the narrowest type to the widest type
    public static final int tBOOLEAN = 0;
    public static final int tCHAR = 1;
    public static final int tINT = 2;
    public static final int tFLOAT = 3;
    public static final int tVOID = 4;

    public static final BuiltInTypeSymbol _boolean = new BuiltInTypeSymbol("boolean", tBOOLEAN);
    public static final BuiltInTypeSymbol _char = new BuiltInTypeSymbol("char", tCHAR);
    public static final BuiltInTypeSymbol _int =  new BuiltInTypeSymbol("int", tINT);
    public static final BuiltInTypeSymbol _float = new BuiltInTypeSymbol("float", tFLOAT);
    public static final BuiltInTypeSymbol _void = new BuiltInTypeSymbol("void", tVOID);

    // arithmetic types defined in order of least to most 'complex'
    public static final Type[] indexToType = {
        null, _boolean, _char, _int, _float, _void
    };
    
    // map of (type1 operation type2) to a result type
    // _void means that it's an illegal operation
    // to get the result of an arithmetic operation on an integer and a float, just evaluate [tInt][tFloat]
    public static final Type[][] arithmeticResultType = new Type[][] {
    	// boolean, char, int, float, void
    	{_void, _void, _void, _void, _void},	// boolean
    	{_void, _char, _int, _float, _void},	// char
    	{_void, _void, _int, _float, _void},	// int
    	{_void, _float, _float, _float, _void},	// float
    	{_void, _void, _void, _void, _void}		// void
    };
    
    // map of (type1 comparison type2) to a result type
    // _void means that it's an illegal operation
    // to get the result of a comparison operation of an int and a float, just evaluate [tInt][tFloat]
    public static final Type[][] comparisonResultType = new Type[][] {
    	// boolean, char, int, float, void
        {_void,  _void,    _void,    _void,    _void},	// boolean
        {_void,  _boolean, _boolean, _boolean, _void},	// char
        {_void,  _boolean, _boolean, _boolean, _void},	// int
        {_void,  _boolean, _boolean, _boolean, _void},	// float
        {_void,  _void,    _void,    _void,    _void}	// void
    };

    // map of (type1 == type2) to a result type
    // _void means that it's an illegal operation
    // to get the result of 1 == 2.5, just evaluate [1][2.5]
    public static final Type[][] equalityResultType = new Type[][] {
    	// boolean, char, int, float, void
        {_boolean, _void, _void, _void, _void},			//boolean
        {_void, _boolean, _boolean, _boolean, _void},	// char
        {_void, _boolean, _boolean, _boolean, _void},	// int
        {_void, _boolean, _boolean, _boolean, _void},	// float
        {_void, _void, _void, _void, _void}				// void
    };
    
    // indicates if a type needs to a promotion to a wider type
    // if the result is not null, then there's a promotion that's needed
    // note that NULL does not mean an error, it means that there is no promotion needed
    public static final Type[][] promoteFromTo = new Type[][] {
    	// boolean, char, int, float, void
    	{null, null, null, null, null},			// boolean
    	{null, null, _int, _float, null},		// char
    	{null, null, null, _float, null},		// int
    	{null, null, null, null, null},			// float
    	{null, null, null, null, null}			// void
    };
    
    TokenStream tokens;

    public SymbolTable(TokenStream tokens) {
    	this.tokens = tokens;
    	initTypeSystem();
    }

    protected void initTypeSystem() {
        for (Type t : indexToType) {
            if (t != null) {
            	globals.define((BuiltInTypeSymbol)t);
            }
        }
    }
    
    public Type member(CeriumAST expr, CeriumAST field) {
        Type type = expr.evalType;
        if ( type.getClass() != ClassSymbol.class ) {
            System.err.println(text(expr) + " must have class type in " + text((CeriumAST)expr.getParent()));

            return _void;
        }    	
    	
        ClassSymbol scope = (ClassSymbol)expr.evalType;// get scope of left
        Symbol s = scope.resolveMember(field.getText());// resolve ID in scope
        field.symbol = s;
        return s.type;           // return ID's type
    }    
    
    /**
     * An initialization operation
     * Example: int x=3;
     * @param id The identifier/variable name
     * @param init The value for which the identifier is being initialized
     */
    public void declinit(CeriumAST id, CeriumAST init) {
    	int te = init.evalType.getTypeIndex(); 		// do we need to promote expr to decl type?
    	int tdecl = id.symbol.type.getTypeIndex();
    	
    	init.promoteToType = promoteFromTo[te][tdecl];
    	
    	// print an error if the identifier cannot be assigned the value because they are different types
    	if (!canAssignTo(init.evalType, id.symbol.type, init.promoteToType)) {
    		System.err.println(text(id) + " and " + text(init) + " have incompatible types in " + text((CeriumAST) id.getParent()));
    	}
    }
    
    public void ret(MethodSymbol ms, CeriumAST expr) {
    	Type retType = ms.type;	// do we need to promote return expr to decl type?
    	Type exprType = expr.evalType;
    	
    	int texpr = exprType.getTypeIndex();
    	int tret = retType.getTypeIndex();
    	
    	expr.promoteToType = promoteFromTo[texpr][tret];
    	
    	// check that the return type is compatible with the declared return type of the method signature
    	if (!canAssignTo(exprType, retType, expr.promoteToType)) {
    		System.err.println(text(expr) + ", " + ms.name + "():<" + ms.type + "> have incompatible types in " + text((CeriumAST)expr.getParent()));
    	}
    }
    
    /**
     * Assignment operation
     * Example: x=y;
     * This method will print an error if the type for the left hand side of the operation is not compatible
     * with the type for the right hand side of the operation
     * @param lhs the left hand side of the assignment
     * @param rhs the right hand side of the assignment
     */
    public void assign(CeriumAST lhs, CeriumAST rhs) {
    	int tlhs = lhs.evalType.getTypeIndex(); // do we need to promote from right to left?
    	int trhs = rhs.evalType.getTypeIndex();
    	
    	rhs.promoteToType = promoteFromTo[trhs][tlhs];
    	
        if ( !canAssignTo(rhs.evalType, lhs.evalType, rhs.promoteToType) ) {
            System.err.println(text(lhs) + ", " + text(rhs) + " have incompatible types in " + text((CeriumAST)lhs.getParent()));
        }    	
    }
    
    public void ifstat(CeriumAST cond) {
    	if (cond.evalType != _boolean) {
    		System.err.println("if condition " + text(cond) + " must have boolean type in " + text((CeriumAST)cond.getParent()));
    	}
    }
    
    public void whilestat(CeriumAST cond) {
    	if (cond.evalType != _boolean) {
    		System.err.println("while loop condition " + text(cond) + " must have boolean type in " + text((CeriumAST)cond.getParent()));
    	}
    }

    public Type getResultType(Type[][] typeTable, CeriumAST a, CeriumAST b) {
    	int ta = a.evalType.getTypeIndex();	// type index of the left operand
    	int tb = b.evalType.getTypeIndex();	// type index of the right operand
    	
    	Type result = typeTable[ta][tb];	// lookup the result type of the operation
    	
    	// if the operation on these two operands is illegal, throw an error
    	if (result == _void) {
    		System.err.println(text(a) + " and " + text(b) + " have incompatible types in " + text((CeriumAST) a.getParent()));
    	}
    	else {
	    	// check if we need to promote the left operand to the type of the right operand, or vice versa
	    	a.promoteToType = promoteFromTo[ta][result.getTypeIndex()];
	    	b.promoteToType = promoteFromTo[tb][result.getTypeIndex()];
    	}

    	return result;
    }

    public static Symbol resolveID(CeriumAST idAST) {
        Symbol s = idAST.scope.resolve(idAST.getText());
        
        System.out.println("line " + idAST.getLine() + ": resolve " + idAST.getText() + " to " + s);
        
        if (s.def==null) {
        	return s; // must be predefined symbol
        }

        // if resolves to local or global symbol, token index of definition
        // must be before token index of reference
        int idLocation = idAST.token.getTokenIndex();
        int defLocation = s.def.token.getTokenIndex();
        if ((idAST.scope instanceof BaseScope) && (s.scope instanceof BaseScope) && (idLocation < defLocation)) {
            System.err.println("line "+ idAST.getLine() + ": error: forward local var ref " + idAST.getText());
            return null;
        }

        return s;
    }

    /** 'this' and 'super' need to know about enclosing class */
    public static ClassSymbol getEnclosingClass(Scope s) {
        while ( s!=null ) { // walk upwards from s looking for a class
            if ( s instanceof ClassSymbol ) return (ClassSymbol)s;
            s = s.getParentScope();
        }
        return null;
    }
    
    public Type bop(CeriumAST a, CeriumAST b)   {
    	return getResultType(arithmeticResultType, a, b);
    }
    
    public Type relop(CeriumAST a, CeriumAST b) {
    	// check for incompatible types that are being compared
    	getResultType(comparisonResultType, a, b);
    	
    	// we always return a boolean type for the comparison operator
    	return _boolean;
    }
    
    public Type eqop(CeriumAST a, CeriumAST b)  {
    	// check for incompatible types that are being used in an equality operator
    	getResultType(equalityResultType, a, b);
    	
    	// we always return a boolean type for the equality operator
    	return _boolean;
    }    
    
    public Type uminus(CeriumAST a) {
    	if ( !((a.evalType == _int) || (a.evalType == _float)) ) {
    		System.err.println(text(a) + " must have int or float type in " + text((CeriumAST)a.getParent()));
    		
    		return _void;
    	}
    	
    	return a.evalType;
    }
    
    public Type unot(CeriumAST a) {
    	if (a.evalType != _boolean) {
    		System.err.println(text(a) + " must have boolean type in " + text((CeriumAST)a.getParent()));
    	
    		return _boolean;
    	}
    	
    	return a.evalType;
    }
    
    public Type call(CeriumAST id, List args) {
        Symbol s = id.scope.resolve(id.getText());

        // here we're checking to make sure that we're calling an actual method 'type'
        if (s.getClass() != MethodSymbol.class) {
        	System.err.println(text(id) + " must be a method in " + text((CeriumAST)id.getParent()));
        	
        	return _void;
        }
        
        MethodSymbol ms = (MethodSymbol)s;
        id.symbol = ms;
        
        int i = 0;
        for (Symbol a : ms.orderedArgs.values()) {
        	CeriumAST argAST = (CeriumAST)args.get(i++);
        	
        	// get the argument expression type and the expected type
        	Type actualArgType = argAST.evalType;
        	Type formalArgType = ((VariableSymbol)a).type;
        	
        	int targ = actualArgType.getTypeIndex();
        	int tformal = formalArgType.getTypeIndex();
        	
        	// check if we need to promote the argument type to the defined type
        	argAST.promoteToType = promoteFromTo[targ][tformal];
        	
        	if (!canAssignTo(actualArgType, formalArgType, argAST.promoteToType)) {
        		System.err.println(text(argAST) + " argument " + a.name + ":<" + a.type + "> of " + ms.name + "() have incompatible types in " + text((CeriumAST)id.getParent()));
        	}
        }
        
        return ms.type;
    }

    public Type arrayIndex(CeriumAST id, CeriumAST index) {
        Symbol s = id.scope.resolve(id.getText());	// resolve the variable
        id.symbol = s;	// annotate the AST

        // here we're checking to make sure that the type is actually an array
        if ((s.getClass() != VariableSymbol.class) || (s.type.getClass() != ArrayType.class)) {
        	System.err.println(text(id) + " must be an array variable in " + text((CeriumAST)id.getParent()));
        	
        	return _void;
        }
        
        VariableSymbol vs = (VariableSymbol) s;
        
        Type t = ((ArrayType)vs.type).elementType; // get element type
        int texpr = index.evalType.getTypeIndex();
        
        index.promoteToType = promoteFromTo[texpr][tINT];	// check if we need to promote the index
        
        if (!canAssignTo(index.evalType, _int, index.promoteToType)) {
        	System.err.println(text(index) + " index must have integer type in " + text((CeriumAST)id.getParent()));
        }

        return t;
    }
    
    /**
     * A type compatibility checker
     * Returns true if the types are the same or can be promoted to the same type
     * @param valueType
     * @param destType
     * @param promotion
     * @return
     */
    public boolean canAssignTo(Type valueType, Type destType, Type promotion) {
    	return ((valueType == destType) || (promotion == destType));
    }
    
    public String text(CeriumAST t) {
        String ts = "";
        if (t.evalType != null) {
        	ts = ":<"+t.evalType+">";
        }
        
        return tokens.toString(t.getTokenStartIndex(), t.getTokenStopIndex()) + ts;
    }    
    
    public String toString() {
    	return globals.toString();
    }
}
