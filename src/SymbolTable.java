import java.util.List;


public class SymbolTable {
    GlobalScope globals = new GlobalScope();
    ClassSymbol objectRoot;
    
    // these type indexes are used for automatic type promotion
    // for example, (1 + 2.5) would yield a float and ('a' + 6) would yield an int
    // the types are defined in order from the narrowest type to the widest type
    public static final int tUSER = 0; // user-defined type
    public static final int tBOOLEAN = 1;
    public static final int tCHAR = 2;
    public static final int tINT = 3;
    public static final int tFLOAT = 4;
    public static final int tVOID = 5;

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

    public SymbolTable() {
    	initTypeSystem();
    }

    protected void initTypeSystem() {
        for (Type t : indexToType) {
            if ( t!=null ) globals.define((BuiltInTypeSymbol)t);
        }
    }
    
    public Type member(CeriumAST expr, CeriumAST field) {
        ClassSymbol scope=(ClassSymbol)expr.evalType;// get scope of left
        Symbol s = scope.resolveMember(field.getText());// resolve ID in scope
        field.symbol = s;
        return s.type;           // return ID's type
    }    
    
    public void declinit(CeriumAST id, CeriumAST init) {
    	int te = init.evalType.getTypeIndex(); 		// do we need to promote expr to decl type?
    	int tdecl = id.symbol.type.getTypeIndex();
    	
    	init.promoteToType = promoteFromTo[te][tdecl];
    }
    
    public void ret(MethodSymbol ms, CeriumAST expr) {
    	Type retType = ms.type;	// do we need to promote return expr to decl type?
    	Type exprType = expr.evalType;
    	
    	int texpr = exprType.getTypeIndex();
    	int tret = retType.getTypeIndex();
    	
    	expr.promoteToType = promoteFromTo[texpr][tret];
    }
    
    public void assign(CeriumAST lhs, CeriumAST rhs) {
    	int tlhs = lhs.evalType.getTypeIndex(); // do we need to promote from right to left?
    	int trhs = rhs.evalType.getTypeIndex();
    	
    	rhs.promoteToType = promoteFromTo[trhs][tlhs];
    }

    public Type getResultType(Type[][] typeTable, CeriumAST a, CeriumAST b) {
    	int ta = a.evalType.getTypeIndex();	// type index of the left operand
    	int tb = b.evalType.getTypeIndex();	// type index of the right operand
    	
    	Type result = typeTable[ta][tb];	// lookup the result type of the operation
    	
    	// check if we need to promote the left operand to the type of the right operand, or vice versa
    	a.promoteToType = promoteFromTo[ta][result.getTypeIndex()];
    	b.promoteToType = promoteFromTo[tb][result.getTypeIndex()];
    	
    	return result;
    }

    public static Symbol resolveID(CeriumAST idAST) {
        Symbol s = idAST.scope.resolve(idAST.getText());
        
        System.out.println("line "+idAST.getLine()+": resolve "+
                           idAST.getText()+" to "+s);
        
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
    	return getResultType(comparisonResultType, a, b);
    }
    
    public Type eqop(CeriumAST a, CeriumAST b)  {
    	return getResultType(equalityResultType, a, b);
    }    
    
    public Type uminus(CeriumAST a) {
    	return a.evalType;
    }
    
    public Type unot(CeriumAST a) {
    	return _boolean;
    }
    
    public Type call(CeriumAST id, List args) {
        Symbol s = id.scope.resolve(id.getText());
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
        }
        
        return ms.type;
    }

    public Type arrayIndex(CeriumAST id, CeriumAST index) {
        Symbol s = id.scope.resolve(id.getText());	// resolve the variable
        VariableSymbol vs = (VariableSymbol) s;
        
        id.symbol = vs;	 // annotate the AST
        Type t = ((ArrayType)vs.type).elementType; // get element type
        int texpr = index.evalType.getTypeIndex();
        
        index.promoteToType = promoteFromTo[texpr][tINT];	// check if we need to promote the index

        return t;
    }    
    
    public String toString() {
    	return globals.toString();
    }
}
