
public class SymbolTable {
    GlobalScope globals = new GlobalScope();
    ClassSymbol objectRoot;

    public SymbolTable() { initTypeSystem(); }

    protected void initTypeSystem() {
        // if you wanted a predefined Object class hierarchy root
        // like Java, you'd define it here:
/*
        objectRoot = new ClassSymbol("Object", globals, null);
        MethodSymbol hashCode =
           new MethodSymbol("hashCode",new BuiltInTypeSymbol("int"),objectRoot);
        objectRoot.define(hashCode);
        globals.define(objectRoot);
*/
        // define predefined atomic types
        globals.define(new BuiltInTypeSymbol("int"));
        globals.define(new BuiltInTypeSymbol("float"));
        globals.define(new BuiltInTypeSymbol("char"));
        globals.define(new BuiltInTypeSymbol("void")); // pseudo-type
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

    public String toString() { return globals.toString(); }
}
