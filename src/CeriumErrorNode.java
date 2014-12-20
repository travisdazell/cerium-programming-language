import org.antlr.runtime.*;

public class CeriumErrorNode extends CeriumAST {
    public CeriumErrorNode(TokenStream input, Token start, Token stop, RecognitionException e) {
    	super(start); // no need to record anything for this example
    }
}
