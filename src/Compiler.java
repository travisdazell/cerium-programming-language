import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RuleReturnScope;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenRewriteStream;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeAdaptor;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.antlr.runtime.tree.TreeAdaptor;
import org.antlr.runtime.tree.TreeVisitor;
import org.antlr.runtime.tree.TreeVisitorAction;
import org.antlr.stringtemplate.StringTemplateGroup;

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
    
    static void showTypesAndPromotions(CeriumAST t, TokenRewriteStream tokens) {
        if ( t.evalType!=null && t.getType( )!= CeriumParser.EXPR ) {
            System.out.printf("%-17s",
                              tokens.toString(t.getTokenStartIndex(),
                                              t.getTokenStopIndex()));
            String ts = t.evalType.toString();
            System.out.printf(" type %-8s", ts);
            if ( t.promoteToType!=null ) {
                System.out.print(" promoted to "+t.promoteToType);
            }
            System.out.println();
        }
    }

    /** Insert a cast before tokens from which this node was created. */
    static void insertCast(CeriumAST t, TokenRewriteStream tokens) {
        String cast = "("+t.promoteToType+")";
        int left =  t.getTokenStartIndex(); // location in token buffer
        int right = t.getTokenStopIndex();
        Token tok = t.token;                // tok is node's token payload
        if ( tok.getType() == CeriumParser.EXPR ) {
            tok = ((CeriumAST)t.getChild(0)).token;
        }
        if ( left==right ||
             tok.getType()==CeriumParser.INDEX ||
             tok.getType()==CeriumParser.CALL )
        { // it's a single atom or a[i] or f(); don't use (...)
            tokens.insertBefore(left, cast);
        }
        else { // need parens
            String original = tokens.toString(left, right);
            tokens.replace(left, right, cast+"("+original+")");
        }
    }
    
    private static void runCodeGenerator(CommonTreeNodeStream nodes) throws IOException, RecognitionException {
    	// TODO: handle exceptions instead of just throwing them
    	
    	// load templates
    	FileReader fr = new FileReader("code-generator-templates\\Cerium.stg");
    	
    	StringTemplateGroup templates = new StringTemplateGroup(fr);
    	
    	fr.close();
    	
    	// create tree node stream for tree parsers
    	Gen gen = new Gen(nodes);
    	gen.setTemplateLib(templates);
    	Gen.compilationUnit_return ret = gen.compilationUnit();
    	System.out.println(ret.getTemplate());
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
        SymbolTable symtab = new SymbolTable(tokens); // init symbol table

        /************************************************************************************
         * FIRST PASS OVER THE AST
         * 
         * in the first pass, we define all of the AST symbols
         * **********************************************************************************
         */ 
        // 
        Def def = new Def(nodes, symtab);       // pass symbol table to the walker
        def.downup(t);                          // trigger define actions upon certain subtrees
        
        /************************************************************************************
         * SECOND PASS OVER THE AST
         * 
         * do a second pass over the AST, to resolve references and update the AST and symbol table for classes that are declared
         * **********************************************************************************
         */
        nodes.reset(); // rewind AST node stream to root
        Ref ref = new Ref(nodes);               // create Ref phase
        ref.downup(t);                          // Do pass 2

        /************************************************************************************
         * THIRD PASS OVER THE AST
         *
         * in this pass, we perform type checking and compute expression types
         * we also handle automatic type promotion for arithmetic expressions to figure out
         * the result type for expressions when the operands have different types (e.g.  [tINT] + [tFLOAT] = [tFLOAT])
         * **********************************************************************************
         */
        nodes.reset(); // rewind AST node stream to root
        Types typeComp = new Types(nodes, symtab);   // create Types phase
        typeComp.downup(t);                          // trigger resolve/type computation actions

        
        /*********************************************************************************************************
         * PASS OVER THE AST
         * 
         * this is where the code generation occurs OR you can run a TreeVisitor to see AST node information
         * right now, i'm just writing information about the AST to the console, as i add features to the language
         * *******************************************************************************************************
         */
        final boolean disableCodeGeneratorAndRunTreeVisitor = false;
        
        if (disableCodeGeneratorAndRunTreeVisitor) {
	        TreeVisitor visitor = new TreeVisitor(new CommonTreeAdaptor());
	        TreeVisitorAction actions = new TreeVisitorAction() {
	        	public Object pre(Object t) {
	        		return t;
	        	}
	        	
	        	public Object post(Object t) {
	        		showTypesAndPromotions((CeriumAST)t, tokens);
	        		return t;
	        	}
	        };
	        
	        visitor.visit(t, actions); // walk in postorder, showing types
        }
        else {
        	// run the code generator using StringTemplate(s) to output the code to a Jasmin file
        	runCodeGenerator(nodes);
        }
    }
}
