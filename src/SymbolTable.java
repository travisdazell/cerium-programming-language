import java.util.List;


public class SymbolTable {
    GlobalScope globals = new GlobalScope();
    ClassSymbol objectRoot;
    
    public static final int tUSER = 0; // user-defined type
    public static final int tBOOLEAN = 1;
    public static final int tCHAR = 2;
    public static final int tINT = 3;
    public static final int tFLOAT = 4;
    public static final int tVOID = 5;

    public static final BuiltInTypeSymbol _boolean =
        new BuiltInTypeSymbol("boolean", tBOOLEAN);
    public static final BuiltInTypeSymbol _char =
        new BuiltInTypeSymbol("char", tCHAR);
    public static final BuiltInTypeSymbol _int =
        new BuiltInTypeSymbol("int", tINT);
    public static final BuiltInTypeSymbol _float =
        new BuiltInTypeSymbol("float", tFLOAT);
    public static final BuiltInTypeSymbol _void =
        new BuiltInTypeSymbol("void", tVOID);

    /** arithmetic types defined in order of least to most 'complex' */
    public static final Type[] indexToType = {
        null, _boolean, _char, _int, _float, _void
    };

    public SymbolTable() {
    	initTypeSystem();
    }

    protected void initTypeSystem() {
        for (Type t : indexToType) {
            if ( t!=null ) globals.define((BuiltInTypeSymbol)t);
        }
    }

    public static Symbol resolveID(CeriumAST idAST) {
        Symbol s = idAST.scope.resolve(idAST.getText());
        System.out.println("line "+idAST.getLine()+": resolve "+
                           idAST.getText()+" to "+s);
        if ( s.def==null ) return s; // must be predefined symbol
        // if resolves to local or global symbol, token index of definition
        // must be before token index of reference
        int idLocation = idAST.token.getTokenIndex();
        int defLocation = s.def.token.getTokenIndex();
        if ( idAST.scope instanceof BaseScope &&
             s.scope instanceof BaseScope &&
             idLocation < defLocation )
        {
            System.err.println("line "+idAST.getLine()+
                ": error: forward local var ref "+idAST.getText());
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
    	return a.evalType;
    }
    
    public Type relop(CeriumAST a, CeriumAST b) {
    	return _boolean;
    }
    
    public Type eqop(CeriumAST a, CeriumAST b)  {
    	return _boolean;
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
        return ms.type;
    }    
    
    public Type arrayIndex(CeriumAST id, CeriumAST index) {
        Symbol s = id.scope.resolve(id.getText());
        VariableSymbol vs = (VariableSymbol)s;
        id.symbol = vs;
        return ((ArrayType)vs.type).elementType;
    }    
    
    public Type member(CeriumAST expr, CeriumAST field) {
        StructSymbol scope=(StructSymbol)expr.evalType; // get scope of expr
        Symbol s = scope.resolveMember(field.getText());// resolve ID in scope
        field.symbol = s;  // make AST point into symbol table
        return s.type;     // return ID's type
    }

    public String toString() {
    	return globals.toString();
    }
}
