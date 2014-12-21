import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.Token;

public class CeriumAST extends CommonTree {
    public Scope scope;   // set by Def.g; ID lives in which scope?
    public Symbol symbol; // set by Ref.g; point at def in symbol table 
    public Type evalType; // The type of an expression; set by Types.g

    public CeriumAST(Token t) {
    	super(t);
   	}
}
