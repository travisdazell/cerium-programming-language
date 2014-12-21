import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.Token;

public class CeriumAST extends CommonTree {
    public Scope scope;   		// set by Def.g; ID lives in which scope?
    public Symbol symbol; 		// set by Ref.g; point at def in symbol table 
    public Type evalType; 		// The type of an expression; set by Types.g
    public Type promoteToType;	// the type that this item needs to be promoted to in a given operation

    public CeriumAST(Token t) {
    	super(t);
   	}
    
    public String toString() {
        String s = super.toString();
        
        if (evalType != null) {
            String annot = evalType.getName();
            if ( promoteToType!=null ) {
                annot += ":"+promoteToType.getName();
            }
            
            return s+'<'+annot+'>';
        }
        
        return s;
    }    
}
