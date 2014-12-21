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
    
    static void showTypes(CeriumAST t, TokenRewriteStream tokens) {
    	if ((t.evalType != null) && (t.getType() != CeriumParser.EXPR)) {
    		System.out.printf("%-17s", tokens.toString(t.getTokenStartIndex(), t.getTokenStopIndex()));
    		
    		String ts = t.evalType.toString();
    		System.out.printf(" type %-8s\n", ts);
    	}
    }

    public static void main(String[] args) throws Exception {
		String filePath = new String("source-code\\forward.cerium");
		Reader reader = null;

		try {
			reader = new FileReader(filePath);
		} catch (FileNotFoundException e) {
			System.err.println("Error: Unable to find source code file at "
					+ filePath);
			return;
		}
    	
		CharStream input = new ANTLRReaderStream(reader);

		// create parser and built the AST
        CeriumLexer lex = new CeriumLexer(input);
        final TokenRewriteStream tokens = new TokenRewriteStream(lex);
        CeriumParser p = new CeriumParser(tokens);
        p.setTreeAdaptor(ceriumAdaptor);
        RuleReturnScope r = p.compilationUnit();   // launch parser by calling start rule
        CommonTree t = (CommonTree)r.getTree();    // get tree result

        // create the tree note stream for tree parsers
        CommonTreeNodeStream nodes = new CommonTreeNodeStream(ceriumAdaptor, t);
        nodes.setTokenStream(tokens);
        nodes.setTreeAdaptor(ceriumAdaptor);
        SymbolTable symtab = new SymbolTable(); // init symbol table

        // define symbols
        Def def = new Def(nodes, symtab);       // pass symbol table to the walker
        def.downup(t);                          // trigger define actions upon certain subtrees

        // resolve symbols and compute expression types
        nodes.reset(); // rewind AST node stream to root
        Types typeComp = new Types(nodes, symtab);               // create Ref phase
        typeComp.downup(t);                          // trigger resolve/type computation actions
        
        // walk tree to dump subtree types
        TreeVisitor visitor = new TreeVisitor(new CommonTreeAdaptor());
        TreeVisitorAction actions = new TreeVisitorAction() {
        	public Object pre(Object t) {
        		return t;
        	}
        	
        	public Object post(Object t) {
        		showTypes((CeriumAST)t, tokens);
        		return t;
        	}
        };
    }
}
