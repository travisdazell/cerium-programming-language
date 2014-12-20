import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;

public class Compiler {
    /** An adaptor that tells ANTLR to build CeriumAST nodes */
    public static TreeAdaptor ceriumAdaptor = new CommonTreeAdaptor() {
        public Object create(Token token) {
            return new CeriumAST(token);
        }
        public Object dupNode(Object t) {
            if ( t==null ) {
                return null;
            }
            
            return create(((CeriumAST)t).token);
        }
        public Object errorNode(TokenStream input, Token start, Token stop, RecognitionException e) {
            CeriumErrorNode t = new CeriumErrorNode(input, start, stop, e);

            return t;
        }
    };

    public static void main(String[] args) throws Exception {
		String filePath = new String("source-code\\AB.cymbol");
		Reader reader = null;

		try {
			reader = new FileReader(filePath);
		} catch (FileNotFoundException e) {
			System.err.println("Error: Unable to find source code file at "
					+ filePath);
			return;
		}
    	
		CharStream input = new ANTLRReaderStream(reader);

        CeriumLexer lex = new CeriumLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lex);
        CeriumParser p = new CeriumParser(tokens);
        p.setTreeAdaptor(ceriumAdaptor);
        RuleReturnScope r = p.compilationUnit();   // launch parser by calling start rule
        CommonTree t = (CommonTree)r.getTree();    // get tree result

        CommonTreeNodeStream nodes = new CommonTreeNodeStream(ceriumAdaptor, t);
        nodes.setTokenStream(tokens);
        SymbolTable symtab = new SymbolTable(); // init symbol table
        Def def = new Def(nodes, symtab);       // create Def phase
        def.downup(t);                          // Do pass 1
        System.out.println("globals: "+symtab.globals);
        nodes.reset(); // rewind AST node stream to root
        Ref ref = new Ref(nodes);               // create Ref phase
        ref.downup(t);                          // Do pass 2
    }
}
