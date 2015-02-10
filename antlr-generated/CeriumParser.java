// $ANTLR 3.2 Sep 23, 2009 12:02:23 C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g 2015-02-09 21:14:59

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;

public class CeriumParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "METHOD_DECL", "ARG_DECL", "BLOCK", "MEMBERS", "VAR_DECL", "FIELD_DECL", "CALL", "ELIST", "EXPR", "ASSIGN", "EXTENDS", "UNARY_MINUS", "UNARY_NOT", "INDEX", "ID", "INT", "FLOAT", "CHAR", "LETTER", "WS", "SL_COMMENT", "'class'", "'{'", "'}'", "'extends'", "'def'", "'('", "')'", "':'", "'private'", "'protected'", "','", "'[]'", "'float'", "'int'", "'void'", "'char'", "'boolean'", "';'", "'if'", "'else'", "'while'", "'loop'", "'times'", "'return'", "'!='", "'=='", "'<'", "'>'", "'<='", "'>='", "'+'", "'-'", "'*'", "'/'", "'!'", "'['", "']'", "'.'", "'true'", "'false'"
    };
    public static final int T__29=29;
    public static final int T__64=64;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__62=62;
    public static final int T__26=26;
    public static final int T__63=63;
    public static final int T__25=25;
    public static final int LETTER=22;
    public static final int ARG_DECL=5;
    public static final int CHAR=21;
    public static final int VAR_DECL=8;
    public static final int METHOD_DECL=4;
    public static final int FLOAT=20;
    public static final int ID=18;
    public static final int T__61=61;
    public static final int EOF=-1;
    public static final int T__60=60;
    public static final int T__55=55;
    public static final int INDEX=17;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int EXPR=12;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int ELIST=11;
    public static final int T__59=59;
    public static final int UNARY_NOT=16;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int FIELD_DECL=9;
    public static final int MEMBERS=7;
    public static final int UNARY_MINUS=15;
    public static final int INT=19;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int WS=23;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int BLOCK=6;
    public static final int SL_COMMENT=24;
    public static final int ASSIGN=13;
    public static final int CALL=10;
    public static final int EXTENDS=14;

    // delegates
    // delegators


        public CeriumParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public CeriumParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return CeriumParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g"; }


    public static class compilationUnit_return extends ParserRuleReturnScope {
        CeriumAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "compilationUnit"
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:27:1: compilationUnit : ( classDefinition )+ EOF ;
    public final CeriumParser.compilationUnit_return compilationUnit() throws RecognitionException {
        CeriumParser.compilationUnit_return retval = new CeriumParser.compilationUnit_return();
        retval.start = input.LT(1);

        CeriumAST root_0 = null;

        Token EOF2=null;
        CeriumParser.classDefinition_return classDefinition1 = null;


        CeriumAST EOF2_tree=null;

        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:28:5: ( ( classDefinition )+ EOF )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:29:6: ( classDefinition )+ EOF
            {
            root_0 = (CeriumAST)adaptor.nil();

            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:29:6: ( classDefinition )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==25) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:29:7: classDefinition
            	    {
            	    pushFollow(FOLLOW_classDefinition_in_compilationUnit152);
            	    classDefinition1=classDefinition();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, classDefinition1.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_compilationUnit156); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            EOF2_tree = (CeriumAST)adaptor.create(EOF2);
            adaptor.addChild(root_0, EOF2_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CeriumAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CeriumAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "compilationUnit"

    public static class classDefinition_return extends ParserRuleReturnScope {
        CeriumAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "classDefinition"
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:33:1: classDefinition : 'class' ID ( superClass )? '{' ( classMember )* '}' -> ^( 'class' ID ( superClass )? ^( MEMBERS ( classMember )* ) ) ;
    public final CeriumParser.classDefinition_return classDefinition() throws RecognitionException {
        CeriumParser.classDefinition_return retval = new CeriumParser.classDefinition_return();
        retval.start = input.LT(1);

        CeriumAST root_0 = null;

        Token string_literal3=null;
        Token ID4=null;
        Token char_literal6=null;
        Token char_literal8=null;
        CeriumParser.superClass_return superClass5 = null;

        CeriumParser.classMember_return classMember7 = null;


        CeriumAST string_literal3_tree=null;
        CeriumAST ID4_tree=null;
        CeriumAST char_literal6_tree=null;
        CeriumAST char_literal8_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_25=new RewriteRuleTokenStream(adaptor,"token 25");
        RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");
        RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");
        RewriteRuleSubtreeStream stream_superClass=new RewriteRuleSubtreeStream(adaptor,"rule superClass");
        RewriteRuleSubtreeStream stream_classMember=new RewriteRuleSubtreeStream(adaptor,"rule classMember");
        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:34:5: ( 'class' ID ( superClass )? '{' ( classMember )* '}' -> ^( 'class' ID ( superClass )? ^( MEMBERS ( classMember )* ) ) )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:35:6: 'class' ID ( superClass )? '{' ( classMember )* '}'
            {
            string_literal3=(Token)match(input,25,FOLLOW_25_in_classDefinition182); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_25.add(string_literal3);

            ID4=(Token)match(input,ID,FOLLOW_ID_in_classDefinition184); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID4);

            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:35:17: ( superClass )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==28) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:35:17: superClass
                    {
                    pushFollow(FOLLOW_superClass_in_classDefinition186);
                    superClass5=superClass();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_superClass.add(superClass5.getTree());

                    }
                    break;

            }

            char_literal6=(Token)match(input,26,FOLLOW_26_in_classDefinition189); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_26.add(char_literal6);

            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:35:33: ( classMember )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==ID||LA3_0==29||(LA3_0>=33 && LA3_0<=34)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:35:33: classMember
            	    {
            	    pushFollow(FOLLOW_classMember_in_classDefinition191);
            	    classMember7=classMember();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_classMember.add(classMember7.getTree());

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            char_literal8=(Token)match(input,27,FOLLOW_27_in_classDefinition194); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_27.add(char_literal8);



            // AST REWRITE
            // elements: ID, superClass, 25, classMember
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CeriumAST)adaptor.nil();
            // 36:9: -> ^( 'class' ID ( superClass )? ^( MEMBERS ( classMember )* ) )
            {
                // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:36:12: ^( 'class' ID ( superClass )? ^( MEMBERS ( classMember )* ) )
                {
                CeriumAST root_1 = (CeriumAST)adaptor.nil();
                root_1 = (CeriumAST)adaptor.becomeRoot(stream_25.nextNode(), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:36:25: ( superClass )?
                if ( stream_superClass.hasNext() ) {
                    adaptor.addChild(root_1, stream_superClass.nextTree());

                }
                stream_superClass.reset();
                // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:36:37: ^( MEMBERS ( classMember )* )
                {
                CeriumAST root_2 = (CeriumAST)adaptor.nil();
                root_2 = (CeriumAST)adaptor.becomeRoot((CeriumAST)adaptor.create(MEMBERS, "MEMBERS"), root_2);

                // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:36:47: ( classMember )*
                while ( stream_classMember.hasNext() ) {
                    adaptor.addChild(root_2, stream_classMember.nextTree());

                }
                stream_classMember.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CeriumAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CeriumAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "classDefinition"

    public static class superClass_return extends ParserRuleReturnScope {
        CeriumAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "superClass"
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:39:1: superClass : 'extends' ID -> ^( EXTENDS ID ) ;
    public final CeriumParser.superClass_return superClass() throws RecognitionException {
        CeriumParser.superClass_return retval = new CeriumParser.superClass_return();
        retval.start = input.LT(1);

        CeriumAST root_0 = null;

        Token string_literal9=null;
        Token ID10=null;

        CeriumAST string_literal9_tree=null;
        CeriumAST ID10_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");

        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:40:2: ( 'extends' ID -> ^( EXTENDS ID ) )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:41:3: 'extends' ID
            {
            string_literal9=(Token)match(input,28,FOLLOW_28_in_superClass241); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_28.add(string_literal9);

            ID10=(Token)match(input,ID,FOLLOW_ID_in_superClass243); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID10);



            // AST REWRITE
            // elements: ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CeriumAST)adaptor.nil();
            // 41:16: -> ^( EXTENDS ID )
            {
                // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:41:19: ^( EXTENDS ID )
                {
                CeriumAST root_1 = (CeriumAST)adaptor.nil();
                root_1 = (CeriumAST)adaptor.becomeRoot((CeriumAST)adaptor.create(EXTENDS, "EXTENDS"), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CeriumAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CeriumAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "superClass"

    public static class classMember_return extends ParserRuleReturnScope {
        CeriumAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "classMember"
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:46:1: classMember : ( varDeclaration | methodDeclaration );
    public final CeriumParser.classMember_return classMember() throws RecognitionException {
        CeriumParser.classMember_return retval = new CeriumParser.classMember_return();
        retval.start = input.LT(1);

        CeriumAST root_0 = null;

        CeriumParser.varDeclaration_return varDeclaration11 = null;

        CeriumParser.methodDeclaration_return methodDeclaration12 = null;



        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:47:2: ( varDeclaration | methodDeclaration )
            int alt4=2;
            switch ( input.LA(1) ) {
            case 33:
            case 34:
                {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==ID) ) {
                    alt4=1;
                }
                else if ( (LA4_1==29) ) {
                    alt4=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
                }
                break;
            case ID:
                {
                alt4=1;
                }
                break;
            case 29:
                {
                alt4=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:48:3: varDeclaration
                    {
                    root_0 = (CeriumAST)adaptor.nil();

                    pushFollow(FOLLOW_varDeclaration_in_classMember266);
                    varDeclaration11=varDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclaration11.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:49:6: methodDeclaration
                    {
                    root_0 = (CeriumAST)adaptor.nil();

                    pushFollow(FOLLOW_methodDeclaration_in_classMember273);
                    methodDeclaration12=methodDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, methodDeclaration12.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CeriumAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CeriumAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "classMember"

    public static class methodDeclaration_return extends ParserRuleReturnScope {
        CeriumAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "methodDeclaration"
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:53:1: methodDeclaration : ( accessModifier )? 'def' ID '(' ( formalParameters )? ')' ':' type block -> ^( METHOD_DECL type ID ( formalParameters )? block ) ;
    public final CeriumParser.methodDeclaration_return methodDeclaration() throws RecognitionException {
        CeriumParser.methodDeclaration_return retval = new CeriumParser.methodDeclaration_return();
        retval.start = input.LT(1);

        CeriumAST root_0 = null;

        Token string_literal14=null;
        Token ID15=null;
        Token char_literal16=null;
        Token char_literal18=null;
        Token char_literal19=null;
        CeriumParser.accessModifier_return accessModifier13 = null;

        CeriumParser.formalParameters_return formalParameters17 = null;

        CeriumParser.type_return type20 = null;

        CeriumParser.block_return block21 = null;


        CeriumAST string_literal14_tree=null;
        CeriumAST ID15_tree=null;
        CeriumAST char_literal16_tree=null;
        CeriumAST char_literal18_tree=null;
        CeriumAST char_literal19_tree=null;
        RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
        RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
        RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
        RewriteRuleSubtreeStream stream_accessModifier=new RewriteRuleSubtreeStream(adaptor,"rule accessModifier");
        RewriteRuleSubtreeStream stream_formalParameters=new RewriteRuleSubtreeStream(adaptor,"rule formalParameters");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:54:5: ( ( accessModifier )? 'def' ID '(' ( formalParameters )? ')' ':' type block -> ^( METHOD_DECL type ID ( formalParameters )? block ) )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:55:6: ( accessModifier )? 'def' ID '(' ( formalParameters )? ')' ':' type block
            {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:55:6: ( accessModifier )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=33 && LA5_0<=34)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:55:6: accessModifier
                    {
                    pushFollow(FOLLOW_accessModifier_in_methodDeclaration293);
                    accessModifier13=accessModifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_accessModifier.add(accessModifier13.getTree());

                    }
                    break;

            }

            string_literal14=(Token)match(input,29,FOLLOW_29_in_methodDeclaration296); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_29.add(string_literal14);

            ID15=(Token)match(input,ID,FOLLOW_ID_in_methodDeclaration298); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID15);

            char_literal16=(Token)match(input,30,FOLLOW_30_in_methodDeclaration300); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_30.add(char_literal16);

            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:55:35: ( formalParameters )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==ID) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:55:35: formalParameters
                    {
                    pushFollow(FOLLOW_formalParameters_in_methodDeclaration302);
                    formalParameters17=formalParameters();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_formalParameters.add(formalParameters17.getTree());

                    }
                    break;

            }

            char_literal18=(Token)match(input,31,FOLLOW_31_in_methodDeclaration305); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_31.add(char_literal18);

            char_literal19=(Token)match(input,32,FOLLOW_32_in_methodDeclaration307); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_32.add(char_literal19);

            pushFollow(FOLLOW_type_in_methodDeclaration309);
            type20=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type20.getTree());
            pushFollow(FOLLOW_block_in_methodDeclaration311);
            block21=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block21.getTree());


            // AST REWRITE
            // elements: type, formalParameters, ID, block
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CeriumAST)adaptor.nil();
            // 56:9: -> ^( METHOD_DECL type ID ( formalParameters )? block )
            {
                // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:56:12: ^( METHOD_DECL type ID ( formalParameters )? block )
                {
                CeriumAST root_1 = (CeriumAST)adaptor.nil();
                root_1 = (CeriumAST)adaptor.becomeRoot((CeriumAST)adaptor.create(METHOD_DECL, "METHOD_DECL"), root_1);

                adaptor.addChild(root_1, stream_type.nextTree());
                adaptor.addChild(root_1, stream_ID.nextNode());
                // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:56:34: ( formalParameters )?
                if ( stream_formalParameters.hasNext() ) {
                    adaptor.addChild(root_1, stream_formalParameters.nextTree());

                }
                stream_formalParameters.reset();
                adaptor.addChild(root_1, stream_block.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CeriumAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CeriumAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "methodDeclaration"

    public static class accessModifier_return extends ParserRuleReturnScope {
        CeriumAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "accessModifier"
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:60:1: accessModifier : ( 'private' | 'protected' );
    public final CeriumParser.accessModifier_return accessModifier() throws RecognitionException {
        CeriumParser.accessModifier_return retval = new CeriumParser.accessModifier_return();
        retval.start = input.LT(1);

        CeriumAST root_0 = null;

        Token set22=null;

        CeriumAST set22_tree=null;

        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:60:16: ( 'private' | 'protected' )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:
            {
            root_0 = (CeriumAST)adaptor.nil();

            set22=(Token)input.LT(1);
            if ( (input.LA(1)>=33 && input.LA(1)<=34) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CeriumAST)adaptor.create(set22));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CeriumAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CeriumAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "accessModifier"

    public static class formalParameters_return extends ParserRuleReturnScope {
        CeriumAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "formalParameters"
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:64:1: formalParameters : parameter ( ',' parameter )* -> ( parameter )+ ;
    public final CeriumParser.formalParameters_return formalParameters() throws RecognitionException {
        CeriumParser.formalParameters_return retval = new CeriumParser.formalParameters_return();
        retval.start = input.LT(1);

        CeriumAST root_0 = null;

        Token char_literal24=null;
        CeriumParser.parameter_return parameter23 = null;

        CeriumParser.parameter_return parameter25 = null;


        CeriumAST char_literal24_tree=null;
        RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
        RewriteRuleSubtreeStream stream_parameter=new RewriteRuleSubtreeStream(adaptor,"rule parameter");
        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:65:5: ( parameter ( ',' parameter )* -> ( parameter )+ )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:66:6: parameter ( ',' parameter )*
            {
            pushFollow(FOLLOW_parameter_in_formalParameters382);
            parameter23=parameter();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_parameter.add(parameter23.getTree());
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:66:16: ( ',' parameter )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==35) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:66:17: ',' parameter
            	    {
            	    char_literal24=(Token)match(input,35,FOLLOW_35_in_formalParameters385); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_35.add(char_literal24);

            	    pushFollow(FOLLOW_parameter_in_formalParameters387);
            	    parameter25=parameter();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_parameter.add(parameter25.getTree());

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);



            // AST REWRITE
            // elements: parameter
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CeriumAST)adaptor.nil();
            // 66:33: -> ( parameter )+
            {
                if ( !(stream_parameter.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_parameter.hasNext() ) {
                    adaptor.addChild(root_0, stream_parameter.nextTree());

                }
                stream_parameter.reset();

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CeriumAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CeriumAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "formalParameters"

    public static class parameter_return extends ParserRuleReturnScope {
        CeriumAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "parameter"
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:69:1: parameter : ( ID ':' type -> ^( ARG_DECL type ID ) | ID ':' type '[]' -> ^( ARG_DECL ^( '[]' type ) ID ) );
    public final CeriumParser.parameter_return parameter() throws RecognitionException {
        CeriumParser.parameter_return retval = new CeriumParser.parameter_return();
        retval.start = input.LT(1);

        CeriumAST root_0 = null;

        Token ID26=null;
        Token char_literal27=null;
        Token ID29=null;
        Token char_literal30=null;
        Token string_literal32=null;
        CeriumParser.type_return type28 = null;

        CeriumParser.type_return type31 = null;


        CeriumAST ID26_tree=null;
        CeriumAST char_literal27_tree=null;
        CeriumAST ID29_tree=null;
        CeriumAST char_literal30_tree=null;
        CeriumAST string_literal32_tree=null;
        RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:70:2: ( ID ':' type -> ^( ARG_DECL type ID ) | ID ':' type '[]' -> ^( ARG_DECL ^( '[]' type ) ID ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==ID) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==32) ) {
                    int LA8_2 = input.LA(3);

                    if ( (LA8_2==ID||(LA8_2>=37 && LA8_2<=41)) ) {
                        int LA8_3 = input.LA(4);

                        if ( (LA8_3==31||LA8_3==35) ) {
                            alt8=1;
                        }
                        else if ( (LA8_3==36) ) {
                            alt8=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 8, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:71:3: ID ':' type
                    {
                    ID26=(Token)match(input,ID,FOLLOW_ID_in_parameter415); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID26);

                    char_literal27=(Token)match(input,32,FOLLOW_32_in_parameter417); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_32.add(char_literal27);

                    pushFollow(FOLLOW_type_in_parameter419);
                    type28=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type28.getTree());


                    // AST REWRITE
                    // elements: ID, type
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CeriumAST)adaptor.nil();
                    // 71:15: -> ^( ARG_DECL type ID )
                    {
                        // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:71:18: ^( ARG_DECL type ID )
                        {
                        CeriumAST root_1 = (CeriumAST)adaptor.nil();
                        root_1 = (CeriumAST)adaptor.becomeRoot((CeriumAST)adaptor.create(ARG_DECL, "ARG_DECL"), root_1);

                        adaptor.addChild(root_1, stream_type.nextTree());
                        adaptor.addChild(root_1, stream_ID.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:72:4: ID ':' type '[]'
                    {
                    ID29=(Token)match(input,ID,FOLLOW_ID_in_parameter434); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID29);

                    char_literal30=(Token)match(input,32,FOLLOW_32_in_parameter436); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_32.add(char_literal30);

                    pushFollow(FOLLOW_type_in_parameter438);
                    type31=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type31.getTree());
                    string_literal32=(Token)match(input,36,FOLLOW_36_in_parameter440); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_36.add(string_literal32);



                    // AST REWRITE
                    // elements: 36, type, ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CeriumAST)adaptor.nil();
                    // 72:21: -> ^( ARG_DECL ^( '[]' type ) ID )
                    {
                        // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:72:24: ^( ARG_DECL ^( '[]' type ) ID )
                        {
                        CeriumAST root_1 = (CeriumAST)adaptor.nil();
                        root_1 = (CeriumAST)adaptor.becomeRoot((CeriumAST)adaptor.create(ARG_DECL, "ARG_DECL"), root_1);

                        // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:72:35: ^( '[]' type )
                        {
                        CeriumAST root_2 = (CeriumAST)adaptor.nil();
                        root_2 = (CeriumAST)adaptor.becomeRoot(stream_36.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_type.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        adaptor.addChild(root_1, stream_ID.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CeriumAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CeriumAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "parameter"

    public static class type_return extends ParserRuleReturnScope {
        CeriumAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "type"
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:76:1: type : ( 'float' | 'int' | 'void' | 'char' | 'boolean' | ID );
    public final CeriumParser.type_return type() throws RecognitionException {
        CeriumParser.type_return retval = new CeriumParser.type_return();
        retval.start = input.LT(1);

        CeriumAST root_0 = null;

        Token set33=null;

        CeriumAST set33_tree=null;

        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:76:5: ( 'float' | 'int' | 'void' | 'char' | 'boolean' | ID )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:
            {
            root_0 = (CeriumAST)adaptor.nil();

            set33=(Token)input.LT(1);
            if ( input.LA(1)==ID||(input.LA(1)>=37 && input.LA(1)<=41) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CeriumAST)adaptor.create(set33));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CeriumAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CeriumAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "type"

    public static class block_return extends ParserRuleReturnScope {
        CeriumAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "block"
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:86:1: block : '{' ( statement )* '}' -> ^( BLOCK ( statement )* ) ;
    public final CeriumParser.block_return block() throws RecognitionException {
        CeriumParser.block_return retval = new CeriumParser.block_return();
        retval.start = input.LT(1);

        CeriumAST root_0 = null;

        Token char_literal34=null;
        Token char_literal36=null;
        CeriumParser.statement_return statement35 = null;


        CeriumAST char_literal34_tree=null;
        CeriumAST char_literal36_tree=null;
        RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");
        RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:87:5: ( '{' ( statement )* '}' -> ^( BLOCK ( statement )* ) )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:88:6: '{' ( statement )* '}'
            {
            char_literal34=(Token)match(input,26,FOLLOW_26_in_block541); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_26.add(char_literal34);

            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:88:10: ( statement )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=ID && LA9_0<=CHAR)||LA9_0==26||LA9_0==30||(LA9_0>=33 && LA9_0<=34)||LA9_0==43||(LA9_0>=45 && LA9_0<=46)||LA9_0==48||(LA9_0>=63 && LA9_0<=64)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:88:10: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_block543);
            	    statement35=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_statement.add(statement35.getTree());

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            char_literal36=(Token)match(input,27,FOLLOW_27_in_block546); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_27.add(char_literal36);



            // AST REWRITE
            // elements: statement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CeriumAST)adaptor.nil();
            // 88:25: -> ^( BLOCK ( statement )* )
            {
                // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:88:28: ^( BLOCK ( statement )* )
                {
                CeriumAST root_1 = (CeriumAST)adaptor.nil();
                root_1 = (CeriumAST)adaptor.becomeRoot((CeriumAST)adaptor.create(BLOCK, "BLOCK"), root_1);

                // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:88:36: ( statement )*
                while ( stream_statement.hasNext() ) {
                    adaptor.addChild(root_1, stream_statement.nextTree());

                }
                stream_statement.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CeriumAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CeriumAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "block"

    public static class varDeclaration_return extends ParserRuleReturnScope {
        CeriumAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "varDeclaration"
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:93:1: varDeclaration : ( ( accessModifier )? ID ':' type ( '=' expression )? ';' -> ^( VAR_DECL type ID ( expression )? ) | ( accessModifier )? ID ':' type '[]' ( '=' expression )? ';' -> ^( VAR_DECL ^( '[]' type ) ID ( expression )? ) );
    public final CeriumParser.varDeclaration_return varDeclaration() throws RecognitionException {
        CeriumParser.varDeclaration_return retval = new CeriumParser.varDeclaration_return();
        retval.start = input.LT(1);

        CeriumAST root_0 = null;

        Token ID38=null;
        Token char_literal39=null;
        Token char_literal41=null;
        Token char_literal43=null;
        Token ID45=null;
        Token char_literal46=null;
        Token string_literal48=null;
        Token char_literal49=null;
        Token char_literal51=null;
        CeriumParser.accessModifier_return accessModifier37 = null;

        CeriumParser.type_return type40 = null;

        CeriumParser.expression_return expression42 = null;

        CeriumParser.accessModifier_return accessModifier44 = null;

        CeriumParser.type_return type47 = null;

        CeriumParser.expression_return expression50 = null;


        CeriumAST ID38_tree=null;
        CeriumAST char_literal39_tree=null;
        CeriumAST char_literal41_tree=null;
        CeriumAST char_literal43_tree=null;
        CeriumAST ID45_tree=null;
        CeriumAST char_literal46_tree=null;
        CeriumAST string_literal48_tree=null;
        CeriumAST char_literal49_tree=null;
        CeriumAST char_literal51_tree=null;
        RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
        RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_accessModifier=new RewriteRuleSubtreeStream(adaptor,"rule accessModifier");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:94:5: ( ( accessModifier )? ID ':' type ( '=' expression )? ';' -> ^( VAR_DECL type ID ( expression )? ) | ( accessModifier )? ID ':' type '[]' ( '=' expression )? ';' -> ^( VAR_DECL ^( '[]' type ) ID ( expression )? ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=33 && LA14_0<=34)) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==ID) ) {
                    int LA14_2 = input.LA(3);

                    if ( (LA14_2==32) ) {
                        int LA14_3 = input.LA(4);

                        if ( (LA14_3==ID||(LA14_3>=37 && LA14_3<=41)) ) {
                            int LA14_4 = input.LA(5);

                            if ( (LA14_4==ASSIGN||LA14_4==42) ) {
                                alt14=1;
                            }
                            else if ( (LA14_4==36) ) {
                                alt14=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 14, 4, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 14, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 14, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA14_0==ID) ) {
                int LA14_2 = input.LA(2);

                if ( (LA14_2==32) ) {
                    int LA14_3 = input.LA(3);

                    if ( (LA14_3==ID||(LA14_3>=37 && LA14_3<=41)) ) {
                        int LA14_4 = input.LA(4);

                        if ( (LA14_4==ASSIGN||LA14_4==42) ) {
                            alt14=1;
                        }
                        else if ( (LA14_4==36) ) {
                            alt14=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 14, 4, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 14, 3, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:95:6: ( accessModifier )? ID ':' type ( '=' expression )? ';'
                    {
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:95:6: ( accessModifier )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( ((LA10_0>=33 && LA10_0<=34)) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:95:6: accessModifier
                            {
                            pushFollow(FOLLOW_accessModifier_in_varDeclaration579);
                            accessModifier37=accessModifier();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_accessModifier.add(accessModifier37.getTree());

                            }
                            break;

                    }

                    ID38=(Token)match(input,ID,FOLLOW_ID_in_varDeclaration582); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID38);

                    char_literal39=(Token)match(input,32,FOLLOW_32_in_varDeclaration584); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_32.add(char_literal39);

                    pushFollow(FOLLOW_type_in_varDeclaration586);
                    type40=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type40.getTree());
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:95:34: ( '=' expression )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==ASSIGN) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:95:35: '=' expression
                            {
                            char_literal41=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_varDeclaration589); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_ASSIGN.add(char_literal41);

                            pushFollow(FOLLOW_expression_in_varDeclaration591);
                            expression42=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expression.add(expression42.getTree());

                            }
                            break;

                    }

                    char_literal43=(Token)match(input,42,FOLLOW_42_in_varDeclaration595); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_42.add(char_literal43);



                    // AST REWRITE
                    // elements: ID, type, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CeriumAST)adaptor.nil();
                    // 95:56: -> ^( VAR_DECL type ID ( expression )? )
                    {
                        // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:95:59: ^( VAR_DECL type ID ( expression )? )
                        {
                        CeriumAST root_1 = (CeriumAST)adaptor.nil();
                        root_1 = (CeriumAST)adaptor.becomeRoot((CeriumAST)adaptor.create(VAR_DECL, "VAR_DECL"), root_1);

                        adaptor.addChild(root_1, stream_type.nextTree());
                        adaptor.addChild(root_1, stream_ID.nextNode());
                        // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:95:78: ( expression )?
                        if ( stream_expression.hasNext() ) {
                            adaptor.addChild(root_1, stream_expression.nextTree());

                        }
                        stream_expression.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:96:7: ( accessModifier )? ID ':' type '[]' ( '=' expression )? ';'
                    {
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:96:7: ( accessModifier )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( ((LA12_0>=33 && LA12_0<=34)) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:96:7: accessModifier
                            {
                            pushFollow(FOLLOW_accessModifier_in_varDeclaration618);
                            accessModifier44=accessModifier();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_accessModifier.add(accessModifier44.getTree());

                            }
                            break;

                    }

                    ID45=(Token)match(input,ID,FOLLOW_ID_in_varDeclaration621); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID45);

                    char_literal46=(Token)match(input,32,FOLLOW_32_in_varDeclaration623); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_32.add(char_literal46);

                    pushFollow(FOLLOW_type_in_varDeclaration625);
                    type47=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type47.getTree());
                    string_literal48=(Token)match(input,36,FOLLOW_36_in_varDeclaration627); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_36.add(string_literal48);

                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:96:40: ( '=' expression )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==ASSIGN) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:96:41: '=' expression
                            {
                            char_literal49=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_varDeclaration630); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_ASSIGN.add(char_literal49);

                            pushFollow(FOLLOW_expression_in_varDeclaration632);
                            expression50=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expression.add(expression50.getTree());

                            }
                            break;

                    }

                    char_literal51=(Token)match(input,42,FOLLOW_42_in_varDeclaration636); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_42.add(char_literal51);



                    // AST REWRITE
                    // elements: expression, type, 36, ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CeriumAST)adaptor.nil();
                    // 96:62: -> ^( VAR_DECL ^( '[]' type ) ID ( expression )? )
                    {
                        // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:96:65: ^( VAR_DECL ^( '[]' type ) ID ( expression )? )
                        {
                        CeriumAST root_1 = (CeriumAST)adaptor.nil();
                        root_1 = (CeriumAST)adaptor.becomeRoot((CeriumAST)adaptor.create(VAR_DECL, "VAR_DECL"), root_1);

                        // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:96:76: ^( '[]' type )
                        {
                        CeriumAST root_2 = (CeriumAST)adaptor.nil();
                        root_2 = (CeriumAST)adaptor.becomeRoot(stream_36.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_type.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        adaptor.addChild(root_1, stream_ID.nextNode());
                        // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:96:92: ( expression )?
                        if ( stream_expression.hasNext() ) {
                            adaptor.addChild(root_1, stream_expression.nextTree());

                        }
                        stream_expression.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CeriumAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CeriumAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "varDeclaration"

    public static class statement_return extends ParserRuleReturnScope {
        CeriumAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statement"
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:100:1: statement options {backtrack=true; } : ( block | varDeclaration | 'if' '(' expression ')' t= block ( 'else' f= block )? -> ^( 'if' expression $t ( $f)? ) | 'while' '(' expression ')' block -> ^( 'while' expression block ) | 'loop' expression 'times' block -> ^( 'loop' expression block ) | 'return' ( expression )? ';' -> ^( 'return' ( expression )? ) | lhs '=' expression ';' -> ^( '=' lhs expression ) | a= postfixExpression ';' -> ^( EXPR postfixExpression ) );
    public final CeriumParser.statement_return statement() throws RecognitionException {
        CeriumParser.statement_return retval = new CeriumParser.statement_return();
        retval.start = input.LT(1);

        CeriumAST root_0 = null;

        Token string_literal54=null;
        Token char_literal55=null;
        Token char_literal57=null;
        Token string_literal58=null;
        Token string_literal59=null;
        Token char_literal60=null;
        Token char_literal62=null;
        Token string_literal64=null;
        Token string_literal66=null;
        Token string_literal68=null;
        Token char_literal70=null;
        Token char_literal72=null;
        Token char_literal74=null;
        Token char_literal75=null;
        CeriumParser.block_return t = null;

        CeriumParser.block_return f = null;

        CeriumParser.postfixExpression_return a = null;

        CeriumParser.block_return block52 = null;

        CeriumParser.varDeclaration_return varDeclaration53 = null;

        CeriumParser.expression_return expression56 = null;

        CeriumParser.expression_return expression61 = null;

        CeriumParser.block_return block63 = null;

        CeriumParser.expression_return expression65 = null;

        CeriumParser.block_return block67 = null;

        CeriumParser.expression_return expression69 = null;

        CeriumParser.lhs_return lhs71 = null;

        CeriumParser.expression_return expression73 = null;


        CeriumAST string_literal54_tree=null;
        CeriumAST char_literal55_tree=null;
        CeriumAST char_literal57_tree=null;
        CeriumAST string_literal58_tree=null;
        CeriumAST string_literal59_tree=null;
        CeriumAST char_literal60_tree=null;
        CeriumAST char_literal62_tree=null;
        CeriumAST string_literal64_tree=null;
        CeriumAST string_literal66_tree=null;
        CeriumAST string_literal68_tree=null;
        CeriumAST char_literal70_tree=null;
        CeriumAST char_literal72_tree=null;
        CeriumAST char_literal74_tree=null;
        CeriumAST char_literal75_tree=null;
        RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
        RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
        RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
        RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
        RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
        RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
        RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
        RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
        RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_postfixExpression=new RewriteRuleSubtreeStream(adaptor,"rule postfixExpression");
        RewriteRuleSubtreeStream stream_lhs=new RewriteRuleSubtreeStream(adaptor,"rule lhs");
        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:102:5: ( block | varDeclaration | 'if' '(' expression ')' t= block ( 'else' f= block )? -> ^( 'if' expression $t ( $f)? ) | 'while' '(' expression ')' block -> ^( 'while' expression block ) | 'loop' expression 'times' block -> ^( 'loop' expression block ) | 'return' ( expression )? ';' -> ^( 'return' ( expression )? ) | lhs '=' expression ';' -> ^( '=' lhs expression ) | a= postfixExpression ';' -> ^( EXPR postfixExpression ) )
            int alt17=8;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:103:6: block
                    {
                    root_0 = (CeriumAST)adaptor.nil();

                    pushFollow(FOLLOW_block_in_statement687);
                    block52=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, block52.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:104:7: varDeclaration
                    {
                    root_0 = (CeriumAST)adaptor.nil();

                    pushFollow(FOLLOW_varDeclaration_in_statement695);
                    varDeclaration53=varDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclaration53.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:105:7: 'if' '(' expression ')' t= block ( 'else' f= block )?
                    {
                    string_literal54=(Token)match(input,43,FOLLOW_43_in_statement703); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_43.add(string_literal54);

                    char_literal55=(Token)match(input,30,FOLLOW_30_in_statement705); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_30.add(char_literal55);

                    pushFollow(FOLLOW_expression_in_statement707);
                    expression56=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression56.getTree());
                    char_literal57=(Token)match(input,31,FOLLOW_31_in_statement709); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_31.add(char_literal57);

                    pushFollow(FOLLOW_block_in_statement713);
                    t=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(t.getTree());
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:105:39: ( 'else' f= block )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==44) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:105:40: 'else' f= block
                            {
                            string_literal58=(Token)match(input,44,FOLLOW_44_in_statement716); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_44.add(string_literal58);

                            pushFollow(FOLLOW_block_in_statement720);
                            f=block();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_block.add(f.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: f, t, expression, 43
                    // token labels: 
                    // rule labels: f, retval, t
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_f=new RewriteRuleSubtreeStream(adaptor,"rule f",f!=null?f.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_t=new RewriteRuleSubtreeStream(adaptor,"rule t",t!=null?t.tree:null);

                    root_0 = (CeriumAST)adaptor.nil();
                    // 106:6: -> ^( 'if' expression $t ( $f)? )
                    {
                        // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:106:9: ^( 'if' expression $t ( $f)? )
                        {
                        CeriumAST root_1 = (CeriumAST)adaptor.nil();
                        root_1 = (CeriumAST)adaptor.becomeRoot(stream_43.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());
                        adaptor.addChild(root_1, stream_t.nextTree());
                        // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:106:30: ( $f)?
                        if ( stream_f.hasNext() ) {
                            adaptor.addChild(root_1, stream_f.nextTree());

                        }
                        stream_f.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:107:7: 'while' '(' expression ')' block
                    {
                    string_literal59=(Token)match(input,45,FOLLOW_45_in_statement750); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_45.add(string_literal59);

                    char_literal60=(Token)match(input,30,FOLLOW_30_in_statement752); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_30.add(char_literal60);

                    pushFollow(FOLLOW_expression_in_statement754);
                    expression61=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression61.getTree());
                    char_literal62=(Token)match(input,31,FOLLOW_31_in_statement756); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_31.add(char_literal62);

                    pushFollow(FOLLOW_block_in_statement758);
                    block63=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block63.getTree());


                    // AST REWRITE
                    // elements: 45, expression, block
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CeriumAST)adaptor.nil();
                    // 108:6: -> ^( 'while' expression block )
                    {
                        // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:108:9: ^( 'while' expression block )
                        {
                        CeriumAST root_1 = (CeriumAST)adaptor.nil();
                        root_1 = (CeriumAST)adaptor.becomeRoot(stream_45.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());
                        adaptor.addChild(root_1, stream_block.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:109:7: 'loop' expression 'times' block
                    {
                    string_literal64=(Token)match(input,46,FOLLOW_46_in_statement781); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_46.add(string_literal64);

                    pushFollow(FOLLOW_expression_in_statement783);
                    expression65=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression65.getTree());
                    string_literal66=(Token)match(input,47,FOLLOW_47_in_statement785); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_47.add(string_literal66);

                    pushFollow(FOLLOW_block_in_statement787);
                    block67=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block67.getTree());


                    // AST REWRITE
                    // elements: 46, block, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CeriumAST)adaptor.nil();
                    // 110:6: -> ^( 'loop' expression block )
                    {
                        // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:110:9: ^( 'loop' expression block )
                        {
                        CeriumAST root_1 = (CeriumAST)adaptor.nil();
                        root_1 = (CeriumAST)adaptor.becomeRoot(stream_46.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());
                        adaptor.addChild(root_1, stream_block.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:111:9: 'return' ( expression )? ';'
                    {
                    string_literal68=(Token)match(input,48,FOLLOW_48_in_statement812); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_48.add(string_literal68);

                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:111:18: ( expression )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( ((LA16_0>=ID && LA16_0<=CHAR)||LA16_0==30||LA16_0==56||LA16_0==59||(LA16_0>=63 && LA16_0<=64)) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:111:18: expression
                            {
                            pushFollow(FOLLOW_expression_in_statement814);
                            expression69=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expression.add(expression69.getTree());

                            }
                            break;

                    }

                    char_literal70=(Token)match(input,42,FOLLOW_42_in_statement817); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_42.add(char_literal70);



                    // AST REWRITE
                    // elements: 48, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CeriumAST)adaptor.nil();
                    // 111:34: -> ^( 'return' ( expression )? )
                    {
                        // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:111:37: ^( 'return' ( expression )? )
                        {
                        CeriumAST root_1 = (CeriumAST)adaptor.nil();
                        root_1 = (CeriumAST)adaptor.becomeRoot(stream_48.nextNode(), root_1);

                        // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:111:48: ( expression )?
                        if ( stream_expression.hasNext() ) {
                            adaptor.addChild(root_1, stream_expression.nextTree());

                        }
                        stream_expression.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 7 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:112:7: lhs '=' expression ';'
                    {
                    pushFollow(FOLLOW_lhs_in_statement834);
                    lhs71=lhs();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_lhs.add(lhs71.getTree());
                    char_literal72=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_statement836); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(char_literal72);

                    pushFollow(FOLLOW_expression_in_statement838);
                    expression73=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression73.getTree());
                    char_literal74=(Token)match(input,42,FOLLOW_42_in_statement840); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_42.add(char_literal74);



                    // AST REWRITE
                    // elements: expression, ASSIGN, lhs
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CeriumAST)adaptor.nil();
                    // 112:30: -> ^( '=' lhs expression )
                    {
                        // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:112:33: ^( '=' lhs expression )
                        {
                        CeriumAST root_1 = (CeriumAST)adaptor.nil();
                        root_1 = (CeriumAST)adaptor.becomeRoot(stream_ASSIGN.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_lhs.nextTree());
                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 8 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:113:9: a= postfixExpression ';'
                    {
                    pushFollow(FOLLOW_postfixExpression_in_statement862);
                    a=postfixExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_postfixExpression.add(a.getTree());
                    char_literal75=(Token)match(input,42,FOLLOW_42_in_statement864); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_42.add(char_literal75);



                    // AST REWRITE
                    // elements: postfixExpression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CeriumAST)adaptor.nil();
                    // 113:33: -> ^( EXPR postfixExpression )
                    {
                        // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:113:36: ^( EXPR postfixExpression )
                        {
                        CeriumAST root_1 = (CeriumAST)adaptor.nil();
                        root_1 = (CeriumAST)adaptor.becomeRoot((CeriumAST)adaptor.create(EXPR, "EXPR"), root_1);

                        adaptor.addChild(root_1, stream_postfixExpression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CeriumAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CeriumAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "statement"

    public static class lhs_return extends ParserRuleReturnScope {
        CeriumAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "lhs"
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:116:1: lhs : postfixExpression -> ^( EXPR postfixExpression ) ;
    public final CeriumParser.lhs_return lhs() throws RecognitionException {
        CeriumParser.lhs_return retval = new CeriumParser.lhs_return();
        retval.start = input.LT(1);

        CeriumAST root_0 = null;

        CeriumParser.postfixExpression_return postfixExpression76 = null;


        RewriteRuleSubtreeStream stream_postfixExpression=new RewriteRuleSubtreeStream(adaptor,"rule postfixExpression");
        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:116:5: ( postfixExpression -> ^( EXPR postfixExpression ) )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:117:3: postfixExpression
            {
            pushFollow(FOLLOW_postfixExpression_in_lhs888);
            postfixExpression76=postfixExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_postfixExpression.add(postfixExpression76.getTree());


            // AST REWRITE
            // elements: postfixExpression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CeriumAST)adaptor.nil();
            // 117:21: -> ^( EXPR postfixExpression )
            {
                // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:117:24: ^( EXPR postfixExpression )
                {
                CeriumAST root_1 = (CeriumAST)adaptor.nil();
                root_1 = (CeriumAST)adaptor.becomeRoot((CeriumAST)adaptor.create(EXPR, "EXPR"), root_1);

                adaptor.addChild(root_1, stream_postfixExpression.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CeriumAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CeriumAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "lhs"

    public static class expressionList_return extends ParserRuleReturnScope {
        CeriumAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expressionList"
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:120:1: expressionList : ( expr ( ',' expr )* -> ^( ELIST ( expr )+ ) | -> ELIST );
    public final CeriumParser.expressionList_return expressionList() throws RecognitionException {
        CeriumParser.expressionList_return retval = new CeriumParser.expressionList_return();
        retval.start = input.LT(1);

        CeriumAST root_0 = null;

        Token char_literal78=null;
        CeriumParser.expr_return expr77 = null;

        CeriumParser.expr_return expr79 = null;


        CeriumAST char_literal78_tree=null;
        RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:121:5: ( expr ( ',' expr )* -> ^( ELIST ( expr )+ ) | -> ELIST )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=ID && LA19_0<=CHAR)||LA19_0==30||LA19_0==56||LA19_0==59||(LA19_0>=63 && LA19_0<=64)) ) {
                alt19=1;
            }
            else if ( (LA19_0==31) ) {
                alt19=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:122:6: expr ( ',' expr )*
                    {
                    pushFollow(FOLLOW_expr_in_expressionList915);
                    expr77=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr77.getTree());
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:122:11: ( ',' expr )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==35) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:122:12: ',' expr
                    	    {
                    	    char_literal78=(Token)match(input,35,FOLLOW_35_in_expressionList918); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_35.add(char_literal78);

                    	    pushFollow(FOLLOW_expr_in_expressionList920);
                    	    expr79=expr();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expr.add(expr79.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);



                    // AST REWRITE
                    // elements: expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CeriumAST)adaptor.nil();
                    // 122:23: -> ^( ELIST ( expr )+ )
                    {
                        // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:122:26: ^( ELIST ( expr )+ )
                        {
                        CeriumAST root_1 = (CeriumAST)adaptor.nil();
                        root_1 = (CeriumAST)adaptor.becomeRoot((CeriumAST)adaptor.create(ELIST, "ELIST"), root_1);

                        if ( !(stream_expr.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_expr.hasNext() ) {
                            adaptor.addChild(root_1, stream_expr.nextTree());

                        }
                        stream_expr.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:123:9: 
                    {

                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CeriumAST)adaptor.nil();
                    // 123:9: -> ELIST
                    {
                        adaptor.addChild(root_0, (CeriumAST)adaptor.create(ELIST, "ELIST"));

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CeriumAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CeriumAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expressionList"

    public static class expression_return extends ParserRuleReturnScope {
        CeriumAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression"
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:126:1: expression : expr -> ^( EXPR expr ) ;
    public final CeriumParser.expression_return expression() throws RecognitionException {
        CeriumParser.expression_return retval = new CeriumParser.expression_return();
        retval.start = input.LT(1);

        CeriumAST root_0 = null;

        CeriumParser.expr_return expr80 = null;


        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:127:5: ( expr -> ^( EXPR expr ) )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:128:6: expr
            {
            pushFollow(FOLLOW_expr_in_expression965);
            expr80=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr80.getTree());


            // AST REWRITE
            // elements: expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CeriumAST)adaptor.nil();
            // 128:11: -> ^( EXPR expr )
            {
                // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:128:14: ^( EXPR expr )
                {
                CeriumAST root_1 = (CeriumAST)adaptor.nil();
                root_1 = (CeriumAST)adaptor.becomeRoot((CeriumAST)adaptor.create(EXPR, "EXPR"), root_1);

                adaptor.addChild(root_1, stream_expr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CeriumAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CeriumAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expression"

    public static class expr_return extends ParserRuleReturnScope {
        CeriumAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr"
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:131:1: expr : equalityExpression ;
    public final CeriumParser.expr_return expr() throws RecognitionException {
        CeriumParser.expr_return retval = new CeriumParser.expr_return();
        retval.start = input.LT(1);

        CeriumAST root_0 = null;

        CeriumParser.equalityExpression_return equalityExpression81 = null;



        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:131:5: ( equalityExpression )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:132:3: equalityExpression
            {
            root_0 = (CeriumAST)adaptor.nil();

            pushFollow(FOLLOW_equalityExpression_in_expr991);
            equalityExpression81=equalityExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, equalityExpression81.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CeriumAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CeriumAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expr"

    public static class equalityExpression_return extends ParserRuleReturnScope {
        CeriumAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "equalityExpression"
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:135:1: equalityExpression : relationalExpression ( ( '!=' | '==' ) relationalExpression )* ;
    public final CeriumParser.equalityExpression_return equalityExpression() throws RecognitionException {
        CeriumParser.equalityExpression_return retval = new CeriumParser.equalityExpression_return();
        retval.start = input.LT(1);

        CeriumAST root_0 = null;

        Token string_literal83=null;
        Token string_literal84=null;
        CeriumParser.relationalExpression_return relationalExpression82 = null;

        CeriumParser.relationalExpression_return relationalExpression85 = null;


        CeriumAST string_literal83_tree=null;
        CeriumAST string_literal84_tree=null;

        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:136:2: ( relationalExpression ( ( '!=' | '==' ) relationalExpression )* )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:137:3: relationalExpression ( ( '!=' | '==' ) relationalExpression )*
            {
            root_0 = (CeriumAST)adaptor.nil();

            pushFollow(FOLLOW_relationalExpression_in_equalityExpression1013);
            relationalExpression82=relationalExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, relationalExpression82.getTree());
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:137:24: ( ( '!=' | '==' ) relationalExpression )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=49 && LA21_0<=50)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:137:25: ( '!=' | '==' ) relationalExpression
            	    {
            	    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:137:25: ( '!=' | '==' )
            	    int alt20=2;
            	    int LA20_0 = input.LA(1);

            	    if ( (LA20_0==49) ) {
            	        alt20=1;
            	    }
            	    else if ( (LA20_0==50) ) {
            	        alt20=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 20, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt20) {
            	        case 1 :
            	            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:137:26: '!='
            	            {
            	            string_literal83=(Token)match(input,49,FOLLOW_49_in_equalityExpression1017); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal83_tree = (CeriumAST)adaptor.create(string_literal83);
            	            root_0 = (CeriumAST)adaptor.becomeRoot(string_literal83_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:137:34: '=='
            	            {
            	            string_literal84=(Token)match(input,50,FOLLOW_50_in_equalityExpression1022); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal84_tree = (CeriumAST)adaptor.create(string_literal84);
            	            root_0 = (CeriumAST)adaptor.becomeRoot(string_literal84_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_relationalExpression_in_equalityExpression1026);
            	    relationalExpression85=relationalExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, relationalExpression85.getTree());

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CeriumAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CeriumAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "equalityExpression"

    public static class relationalExpression_return extends ParserRuleReturnScope {
        CeriumAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "relationalExpression"
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:140:1: relationalExpression : additiveExpression ( ( '<' | '>' | '<=' | '>=' ) additiveExpression )* ;
    public final CeriumParser.relationalExpression_return relationalExpression() throws RecognitionException {
        CeriumParser.relationalExpression_return retval = new CeriumParser.relationalExpression_return();
        retval.start = input.LT(1);

        CeriumAST root_0 = null;

        Token char_literal87=null;
        Token char_literal88=null;
        Token string_literal89=null;
        Token string_literal90=null;
        CeriumParser.additiveExpression_return additiveExpression86 = null;

        CeriumParser.additiveExpression_return additiveExpression91 = null;


        CeriumAST char_literal87_tree=null;
        CeriumAST char_literal88_tree=null;
        CeriumAST string_literal89_tree=null;
        CeriumAST string_literal90_tree=null;

        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:141:2: ( additiveExpression ( ( '<' | '>' | '<=' | '>=' ) additiveExpression )* )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:142:3: additiveExpression ( ( '<' | '>' | '<=' | '>=' ) additiveExpression )*
            {
            root_0 = (CeriumAST)adaptor.nil();

            pushFollow(FOLLOW_additiveExpression_in_relationalExpression1042);
            additiveExpression86=additiveExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, additiveExpression86.getTree());
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:142:22: ( ( '<' | '>' | '<=' | '>=' ) additiveExpression )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=51 && LA23_0<=54)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:142:24: ( '<' | '>' | '<=' | '>=' ) additiveExpression
            	    {
            	    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:142:24: ( '<' | '>' | '<=' | '>=' )
            	    int alt22=4;
            	    switch ( input.LA(1) ) {
            	    case 51:
            	        {
            	        alt22=1;
            	        }
            	        break;
            	    case 52:
            	        {
            	        alt22=2;
            	        }
            	        break;
            	    case 53:
            	        {
            	        alt22=3;
            	        }
            	        break;
            	    case 54:
            	        {
            	        alt22=4;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 22, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt22) {
            	        case 1 :
            	            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:142:25: '<'
            	            {
            	            char_literal87=(Token)match(input,51,FOLLOW_51_in_relationalExpression1047); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal87_tree = (CeriumAST)adaptor.create(char_literal87);
            	            root_0 = (CeriumAST)adaptor.becomeRoot(char_literal87_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:142:32: '>'
            	            {
            	            char_literal88=(Token)match(input,52,FOLLOW_52_in_relationalExpression1052); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal88_tree = (CeriumAST)adaptor.create(char_literal88);
            	            root_0 = (CeriumAST)adaptor.becomeRoot(char_literal88_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:142:39: '<='
            	            {
            	            string_literal89=(Token)match(input,53,FOLLOW_53_in_relationalExpression1057); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal89_tree = (CeriumAST)adaptor.create(string_literal89);
            	            root_0 = (CeriumAST)adaptor.becomeRoot(string_literal89_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:142:47: '>='
            	            {
            	            string_literal90=(Token)match(input,54,FOLLOW_54_in_relationalExpression1062); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal90_tree = (CeriumAST)adaptor.create(string_literal90);
            	            root_0 = (CeriumAST)adaptor.becomeRoot(string_literal90_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_additiveExpression_in_relationalExpression1066);
            	    additiveExpression91=additiveExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, additiveExpression91.getTree());

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CeriumAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CeriumAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "relationalExpression"

    public static class additiveExpression_return extends ParserRuleReturnScope {
        CeriumAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "additiveExpression"
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:145:1: additiveExpression : multiplicativeExpression ( ( '+' | '-' ) multiplicativeExpression )* ;
    public final CeriumParser.additiveExpression_return additiveExpression() throws RecognitionException {
        CeriumParser.additiveExpression_return retval = new CeriumParser.additiveExpression_return();
        retval.start = input.LT(1);

        CeriumAST root_0 = null;

        Token char_literal93=null;
        Token char_literal94=null;
        CeriumParser.multiplicativeExpression_return multiplicativeExpression92 = null;

        CeriumParser.multiplicativeExpression_return multiplicativeExpression95 = null;


        CeriumAST char_literal93_tree=null;
        CeriumAST char_literal94_tree=null;

        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:146:2: ( multiplicativeExpression ( ( '+' | '-' ) multiplicativeExpression )* )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:147:3: multiplicativeExpression ( ( '+' | '-' ) multiplicativeExpression )*
            {
            root_0 = (CeriumAST)adaptor.nil();

            pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression1083);
            multiplicativeExpression92=multiplicativeExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicativeExpression92.getTree());
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:147:28: ( ( '+' | '-' ) multiplicativeExpression )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=55 && LA25_0<=56)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:147:29: ( '+' | '-' ) multiplicativeExpression
            	    {
            	    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:147:29: ( '+' | '-' )
            	    int alt24=2;
            	    int LA24_0 = input.LA(1);

            	    if ( (LA24_0==55) ) {
            	        alt24=1;
            	    }
            	    else if ( (LA24_0==56) ) {
            	        alt24=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 24, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt24) {
            	        case 1 :
            	            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:147:30: '+'
            	            {
            	            char_literal93=(Token)match(input,55,FOLLOW_55_in_additiveExpression1087); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal93_tree = (CeriumAST)adaptor.create(char_literal93);
            	            root_0 = (CeriumAST)adaptor.becomeRoot(char_literal93_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:147:37: '-'
            	            {
            	            char_literal94=(Token)match(input,56,FOLLOW_56_in_additiveExpression1092); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal94_tree = (CeriumAST)adaptor.create(char_literal94);
            	            root_0 = (CeriumAST)adaptor.becomeRoot(char_literal94_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression1096);
            	    multiplicativeExpression95=multiplicativeExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicativeExpression95.getTree());

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CeriumAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CeriumAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "additiveExpression"

    public static class multiplicativeExpression_return extends ParserRuleReturnScope {
        CeriumAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "multiplicativeExpression"
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:150:1: multiplicativeExpression : unaryExpression ( ( '*' | '/' ) unaryExpression )* ;
    public final CeriumParser.multiplicativeExpression_return multiplicativeExpression() throws RecognitionException {
        CeriumParser.multiplicativeExpression_return retval = new CeriumParser.multiplicativeExpression_return();
        retval.start = input.LT(1);

        CeriumAST root_0 = null;

        Token char_literal97=null;
        Token char_literal98=null;
        CeriumParser.unaryExpression_return unaryExpression96 = null;

        CeriumParser.unaryExpression_return unaryExpression99 = null;


        CeriumAST char_literal97_tree=null;
        CeriumAST char_literal98_tree=null;

        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:151:2: ( unaryExpression ( ( '*' | '/' ) unaryExpression )* )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:152:3: unaryExpression ( ( '*' | '/' ) unaryExpression )*
            {
            root_0 = (CeriumAST)adaptor.nil();

            pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression1112);
            unaryExpression96=unaryExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression96.getTree());
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:152:19: ( ( '*' | '/' ) unaryExpression )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=57 && LA27_0<=58)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:152:20: ( '*' | '/' ) unaryExpression
            	    {
            	    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:152:20: ( '*' | '/' )
            	    int alt26=2;
            	    int LA26_0 = input.LA(1);

            	    if ( (LA26_0==57) ) {
            	        alt26=1;
            	    }
            	    else if ( (LA26_0==58) ) {
            	        alt26=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 26, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt26) {
            	        case 1 :
            	            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:152:21: '*'
            	            {
            	            char_literal97=(Token)match(input,57,FOLLOW_57_in_multiplicativeExpression1116); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal97_tree = (CeriumAST)adaptor.create(char_literal97);
            	            root_0 = (CeriumAST)adaptor.becomeRoot(char_literal97_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:152:28: '/'
            	            {
            	            char_literal98=(Token)match(input,58,FOLLOW_58_in_multiplicativeExpression1121); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal98_tree = (CeriumAST)adaptor.create(char_literal98);
            	            root_0 = (CeriumAST)adaptor.becomeRoot(char_literal98_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression1125);
            	    unaryExpression99=unaryExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression99.getTree());

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CeriumAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CeriumAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "multiplicativeExpression"

    public static class unaryExpression_return extends ParserRuleReturnScope {
        CeriumAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "unaryExpression"
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:155:1: unaryExpression : (op= '-' unaryExpression -> ^( UNARY_MINUS[$op] unaryExpression ) | op= '!' unaryExpression -> ^( UNARY_NOT[$op] unaryExpression ) | postfixExpression );
    public final CeriumParser.unaryExpression_return unaryExpression() throws RecognitionException {
        CeriumParser.unaryExpression_return retval = new CeriumParser.unaryExpression_return();
        retval.start = input.LT(1);

        CeriumAST root_0 = null;

        Token op=null;
        CeriumParser.unaryExpression_return unaryExpression100 = null;

        CeriumParser.unaryExpression_return unaryExpression101 = null;

        CeriumParser.postfixExpression_return postfixExpression102 = null;


        CeriumAST op_tree=null;
        RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
        RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
        RewriteRuleSubtreeStream stream_unaryExpression=new RewriteRuleSubtreeStream(adaptor,"rule unaryExpression");
        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:156:2: (op= '-' unaryExpression -> ^( UNARY_MINUS[$op] unaryExpression ) | op= '!' unaryExpression -> ^( UNARY_NOT[$op] unaryExpression ) | postfixExpression )
            int alt28=3;
            switch ( input.LA(1) ) {
            case 56:
                {
                alt28=1;
                }
                break;
            case 59:
                {
                alt28=2;
                }
                break;
            case ID:
            case INT:
            case FLOAT:
            case CHAR:
            case 30:
            case 63:
            case 64:
                {
                alt28=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:157:3: op= '-' unaryExpression
                    {
                    op=(Token)match(input,56,FOLLOW_56_in_unaryExpression1143); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_56.add(op);

                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression1145);
                    unaryExpression100=unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_unaryExpression.add(unaryExpression100.getTree());


                    // AST REWRITE
                    // elements: unaryExpression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CeriumAST)adaptor.nil();
                    // 157:26: -> ^( UNARY_MINUS[$op] unaryExpression )
                    {
                        // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:157:29: ^( UNARY_MINUS[$op] unaryExpression )
                        {
                        CeriumAST root_1 = (CeriumAST)adaptor.nil();
                        root_1 = (CeriumAST)adaptor.becomeRoot((CeriumAST)adaptor.create(UNARY_MINUS, op), root_1);

                        adaptor.addChild(root_1, stream_unaryExpression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:158:4: op= '!' unaryExpression
                    {
                    op=(Token)match(input,59,FOLLOW_59_in_unaryExpression1161); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_59.add(op);

                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression1163);
                    unaryExpression101=unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_unaryExpression.add(unaryExpression101.getTree());


                    // AST REWRITE
                    // elements: unaryExpression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CeriumAST)adaptor.nil();
                    // 158:27: -> ^( UNARY_NOT[$op] unaryExpression )
                    {
                        // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:158:30: ^( UNARY_NOT[$op] unaryExpression )
                        {
                        CeriumAST root_1 = (CeriumAST)adaptor.nil();
                        root_1 = (CeriumAST)adaptor.becomeRoot((CeriumAST)adaptor.create(UNARY_NOT, op), root_1);

                        adaptor.addChild(root_1, stream_unaryExpression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:159:4: postfixExpression
                    {
                    root_0 = (CeriumAST)adaptor.nil();

                    pushFollow(FOLLOW_postfixExpression_in_unaryExpression1177);
                    postfixExpression102=postfixExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, postfixExpression102.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CeriumAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CeriumAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "unaryExpression"

    public static class postfixExpression_return extends ParserRuleReturnScope {
        CeriumAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "postfixExpression"
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:163:1: postfixExpression : primary ( (r= '(' expressionList ')' | r= '[' expr ']' | r= '.' ID ) )* ;
    public final CeriumParser.postfixExpression_return postfixExpression() throws RecognitionException {
        CeriumParser.postfixExpression_return retval = new CeriumParser.postfixExpression_return();
        retval.start = input.LT(1);

        CeriumAST root_0 = null;

        Token r=null;
        Token char_literal105=null;
        Token char_literal107=null;
        Token ID108=null;
        CeriumParser.primary_return primary103 = null;

        CeriumParser.expressionList_return expressionList104 = null;

        CeriumParser.expr_return expr106 = null;


        CeriumAST r_tree=null;
        CeriumAST char_literal105_tree=null;
        CeriumAST char_literal107_tree=null;
        CeriumAST ID108_tree=null;

        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:164:5: ( primary ( (r= '(' expressionList ')' | r= '[' expr ']' | r= '.' ID ) )* )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:164:9: primary ( (r= '(' expressionList ')' | r= '[' expr ']' | r= '.' ID ) )*
            {
            root_0 = (CeriumAST)adaptor.nil();

            pushFollow(FOLLOW_primary_in_postfixExpression1194);
            primary103=primary();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, primary103.getTree());
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:165:6: ( (r= '(' expressionList ')' | r= '[' expr ']' | r= '.' ID ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==30||LA30_0==60||LA30_0==62) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:166:7: (r= '(' expressionList ')' | r= '[' expr ']' | r= '.' ID )
            	    {
            	    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:166:7: (r= '(' expressionList ')' | r= '[' expr ']' | r= '.' ID )
            	    int alt29=3;
            	    switch ( input.LA(1) ) {
            	    case 30:
            	        {
            	        alt29=1;
            	        }
            	        break;
            	    case 60:
            	        {
            	        alt29=2;
            	        }
            	        break;
            	    case 62:
            	        {
            	        alt29=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 29, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt29) {
            	        case 1 :
            	            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:166:9: r= '(' expressionList ')'
            	            {
            	            r=(Token)match(input,30,FOLLOW_30_in_postfixExpression1213); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            r_tree = (CeriumAST)adaptor.create(r);
            	            root_0 = (CeriumAST)adaptor.becomeRoot(r_tree, root_0);
            	            }
            	            pushFollow(FOLLOW_expressionList_in_postfixExpression1216);
            	            expressionList104=expressionList();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionList104.getTree());
            	            char_literal105=(Token)match(input,31,FOLLOW_31_in_postfixExpression1218); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	              r.setType(CALL);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:167:9: r= '[' expr ']'
            	            {
            	            r=(Token)match(input,60,FOLLOW_60_in_postfixExpression1233); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            r_tree = (CeriumAST)adaptor.create(r);
            	            root_0 = (CeriumAST)adaptor.becomeRoot(r_tree, root_0);
            	            }
            	            pushFollow(FOLLOW_expr_in_postfixExpression1236);
            	            expr106=expr();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr106.getTree());
            	            char_literal107=(Token)match(input,61,FOLLOW_61_in_postfixExpression1238); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	              r.setType(INDEX);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:168:9: r= '.' ID
            	            {
            	            r=(Token)match(input,62,FOLLOW_62_in_postfixExpression1255); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            r_tree = (CeriumAST)adaptor.create(r);
            	            root_0 = (CeriumAST)adaptor.becomeRoot(r_tree, root_0);
            	            }
            	            ID108=(Token)match(input,ID,FOLLOW_ID_in_postfixExpression1258); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            ID108_tree = (CeriumAST)adaptor.create(ID108);
            	            adaptor.addChild(root_0, ID108_tree);
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CeriumAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CeriumAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "postfixExpression"

    public static class primary_return extends ParserRuleReturnScope {
        CeriumAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "primary"
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:174:1: primary : ( ID | INT | FLOAT | CHAR | 'true' | 'false' | '(' expr ')' -> expr );
    public final CeriumParser.primary_return primary() throws RecognitionException {
        CeriumParser.primary_return retval = new CeriumParser.primary_return();
        retval.start = input.LT(1);

        CeriumAST root_0 = null;

        Token ID109=null;
        Token INT110=null;
        Token FLOAT111=null;
        Token CHAR112=null;
        Token string_literal113=null;
        Token string_literal114=null;
        Token char_literal115=null;
        Token char_literal117=null;
        CeriumParser.expr_return expr116 = null;


        CeriumAST ID109_tree=null;
        CeriumAST INT110_tree=null;
        CeriumAST FLOAT111_tree=null;
        CeriumAST CHAR112_tree=null;
        CeriumAST string_literal113_tree=null;
        CeriumAST string_literal114_tree=null;
        CeriumAST char_literal115_tree=null;
        CeriumAST char_literal117_tree=null;
        RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
        RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:175:5: ( ID | INT | FLOAT | CHAR | 'true' | 'false' | '(' expr ')' -> expr )
            int alt31=7;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt31=1;
                }
                break;
            case INT:
                {
                alt31=2;
                }
                break;
            case FLOAT:
                {
                alt31=3;
                }
                break;
            case CHAR:
                {
                alt31=4;
                }
                break;
            case 63:
                {
                alt31=5;
                }
                break;
            case 64:
                {
                alt31=6;
                }
                break;
            case 30:
                {
                alt31=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:175:7: ID
                    {
                    root_0 = (CeriumAST)adaptor.nil();

                    ID109=(Token)match(input,ID,FOLLOW_ID_in_primary1292); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID109_tree = (CeriumAST)adaptor.create(ID109);
                    adaptor.addChild(root_0, ID109_tree);
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:176:9: INT
                    {
                    root_0 = (CeriumAST)adaptor.nil();

                    INT110=(Token)match(input,INT,FOLLOW_INT_in_primary1302); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INT110_tree = (CeriumAST)adaptor.create(INT110);
                    adaptor.addChild(root_0, INT110_tree);
                    }

                    }
                    break;
                case 3 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:177:7: FLOAT
                    {
                    root_0 = (CeriumAST)adaptor.nil();

                    FLOAT111=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_primary1310); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    FLOAT111_tree = (CeriumAST)adaptor.create(FLOAT111);
                    adaptor.addChild(root_0, FLOAT111_tree);
                    }

                    }
                    break;
                case 4 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:178:7: CHAR
                    {
                    root_0 = (CeriumAST)adaptor.nil();

                    CHAR112=(Token)match(input,CHAR,FOLLOW_CHAR_in_primary1318); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CHAR112_tree = (CeriumAST)adaptor.create(CHAR112);
                    adaptor.addChild(root_0, CHAR112_tree);
                    }

                    }
                    break;
                case 5 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:179:7: 'true'
                    {
                    root_0 = (CeriumAST)adaptor.nil();

                    string_literal113=(Token)match(input,63,FOLLOW_63_in_primary1326); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal113_tree = (CeriumAST)adaptor.create(string_literal113);
                    adaptor.addChild(root_0, string_literal113_tree);
                    }

                    }
                    break;
                case 6 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:180:7: 'false'
                    {
                    root_0 = (CeriumAST)adaptor.nil();

                    string_literal114=(Token)match(input,64,FOLLOW_64_in_primary1334); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal114_tree = (CeriumAST)adaptor.create(string_literal114);
                    adaptor.addChild(root_0, string_literal114_tree);
                    }

                    }
                    break;
                case 7 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:181:8: '(' expr ')'
                    {
                    char_literal115=(Token)match(input,30,FOLLOW_30_in_primary1343); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_30.add(char_literal115);

                    pushFollow(FOLLOW_expr_in_primary1345);
                    expr116=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr116.getTree());
                    char_literal117=(Token)match(input,31,FOLLOW_31_in_primary1347); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_31.add(char_literal117);



                    // AST REWRITE
                    // elements: expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CeriumAST)adaptor.nil();
                    // 181:21: -> expr
                    {
                        adaptor.addChild(root_0, stream_expr.nextTree());

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CeriumAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CeriumAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "primary"

    // $ANTLR start synpred2_Cerium
    public final void synpred2_Cerium_fragment() throws RecognitionException {   
        // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:104:7: ( varDeclaration )
        // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:104:7: varDeclaration
        {
        pushFollow(FOLLOW_varDeclaration_in_synpred2_Cerium695);
        varDeclaration();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_Cerium

    // $ANTLR start synpred7_Cerium
    public final void synpred7_Cerium_fragment() throws RecognitionException {   
        // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:112:7: ( lhs '=' expression ';' )
        // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:112:7: lhs '=' expression ';'
        {
        pushFollow(FOLLOW_lhs_in_synpred7_Cerium834);
        lhs();

        state._fsp--;
        if (state.failed) return ;
        match(input,ASSIGN,FOLLOW_ASSIGN_in_synpred7_Cerium836); if (state.failed) return ;
        pushFollow(FOLLOW_expression_in_synpred7_Cerium838);
        expression();

        state._fsp--;
        if (state.failed) return ;
        match(input,42,FOLLOW_42_in_synpred7_Cerium840); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred7_Cerium

    // Delegated rules

    public final boolean synpred7_Cerium() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_Cerium_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_Cerium() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_Cerium_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA17 dfa17 = new DFA17(this);
    static final String DFA17_eotS =
        "\20\uffff";
    static final String DFA17_eofS =
        "\20\uffff";
    static final String DFA17_minS =
        "\1\22\2\uffff\1\0\4\uffff\6\0\2\uffff";
    static final String DFA17_maxS =
        "\1\100\2\uffff\1\0\4\uffff\6\0\2\uffff";
    static final String DFA17_acceptS =
        "\1\uffff\1\1\1\2\1\uffff\1\3\1\4\1\5\1\6\6\uffff\1\7\1\10";
    static final String DFA17_specialS =
        "\3\uffff\1\0\4\uffff\1\1\1\2\1\3\1\4\1\5\1\6\2\uffff}>";
    static final String[] DFA17_transitionS = {
            "\1\3\1\10\1\11\1\12\4\uffff\1\1\3\uffff\1\15\2\uffff\2\2\10"+
            "\uffff\1\4\1\uffff\1\5\1\6\1\uffff\1\7\16\uffff\1\13\1\14",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            ""
    };

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "100:1: statement options {backtrack=true; } : ( block | varDeclaration | 'if' '(' expression ')' t= block ( 'else' f= block )? -> ^( 'if' expression $t ( $f)? ) | 'while' '(' expression ')' block -> ^( 'while' expression block ) | 'loop' expression 'times' block -> ^( 'loop' expression block ) | 'return' ( expression )? ';' -> ^( 'return' ( expression )? ) | lhs '=' expression ';' -> ^( '=' lhs expression ) | a= postfixExpression ';' -> ^( EXPR postfixExpression ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA17_3 = input.LA(1);

                         
                        int index17_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_Cerium()) ) {s = 2;}

                        else if ( (synpred7_Cerium()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index17_3);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA17_8 = input.LA(1);

                         
                        int index17_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_Cerium()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index17_8);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA17_9 = input.LA(1);

                         
                        int index17_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_Cerium()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index17_9);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA17_10 = input.LA(1);

                         
                        int index17_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_Cerium()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index17_10);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA17_11 = input.LA(1);

                         
                        int index17_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_Cerium()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index17_11);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA17_12 = input.LA(1);

                         
                        int index17_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_Cerium()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index17_12);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA17_13 = input.LA(1);

                         
                        int index17_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_Cerium()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index17_13);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 17, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_classDefinition_in_compilationUnit152 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_EOF_in_compilationUnit156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_classDefinition182 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ID_in_classDefinition184 = new BitSet(new long[]{0x0000000014000000L});
    public static final BitSet FOLLOW_superClass_in_classDefinition186 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_classDefinition189 = new BitSet(new long[]{0x0000000628040000L});
    public static final BitSet FOLLOW_classMember_in_classDefinition191 = new BitSet(new long[]{0x0000000628040000L});
    public static final BitSet FOLLOW_27_in_classDefinition194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_superClass241 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ID_in_superClass243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDeclaration_in_classMember266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_methodDeclaration_in_classMember273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_accessModifier_in_methodDeclaration293 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_methodDeclaration296 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ID_in_methodDeclaration298 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_methodDeclaration300 = new BitSet(new long[]{0x0000000080040000L});
    public static final BitSet FOLLOW_formalParameters_in_methodDeclaration302 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_methodDeclaration305 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_methodDeclaration307 = new BitSet(new long[]{0x000003E000040000L});
    public static final BitSet FOLLOW_type_in_methodDeclaration309 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_block_in_methodDeclaration311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_accessModifier0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parameter_in_formalParameters382 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35_in_formalParameters385 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_parameter_in_formalParameters387 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_ID_in_parameter415 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_parameter417 = new BitSet(new long[]{0x000003E000040000L});
    public static final BitSet FOLLOW_type_in_parameter419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_parameter434 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_parameter436 = new BitSet(new long[]{0x000003E000040000L});
    public static final BitSet FOLLOW_type_in_parameter438 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_parameter440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_type0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_block541 = new BitSet(new long[]{0x800168064C3C0000L,0x0000000000000001L});
    public static final BitSet FOLLOW_statement_in_block543 = new BitSet(new long[]{0x800168064C3C0000L,0x0000000000000001L});
    public static final BitSet FOLLOW_27_in_block546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_accessModifier_in_varDeclaration579 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ID_in_varDeclaration582 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_varDeclaration584 = new BitSet(new long[]{0x000003E000040000L});
    public static final BitSet FOLLOW_type_in_varDeclaration586 = new BitSet(new long[]{0x0000040000002000L});
    public static final BitSet FOLLOW_ASSIGN_in_varDeclaration589 = new BitSet(new long[]{0x89000000403C0000L,0x0000000000000001L});
    public static final BitSet FOLLOW_expression_in_varDeclaration591 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_varDeclaration595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_accessModifier_in_varDeclaration618 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ID_in_varDeclaration621 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_varDeclaration623 = new BitSet(new long[]{0x000003E000040000L});
    public static final BitSet FOLLOW_type_in_varDeclaration625 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_varDeclaration627 = new BitSet(new long[]{0x0000040000002000L});
    public static final BitSet FOLLOW_ASSIGN_in_varDeclaration630 = new BitSet(new long[]{0x89000000403C0000L,0x0000000000000001L});
    public static final BitSet FOLLOW_expression_in_varDeclaration632 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_varDeclaration636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_statement687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDeclaration_in_statement695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_statement703 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_statement705 = new BitSet(new long[]{0x89000000403C0000L,0x0000000000000001L});
    public static final BitSet FOLLOW_expression_in_statement707 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_statement709 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_block_in_statement713 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_44_in_statement716 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_block_in_statement720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_statement750 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_statement752 = new BitSet(new long[]{0x89000000403C0000L,0x0000000000000001L});
    public static final BitSet FOLLOW_expression_in_statement754 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_statement756 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_block_in_statement758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_statement781 = new BitSet(new long[]{0x89000000403C0000L,0x0000000000000001L});
    public static final BitSet FOLLOW_expression_in_statement783 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_statement785 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_block_in_statement787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_statement812 = new BitSet(new long[]{0x89000400403C0000L,0x0000000000000001L});
    public static final BitSet FOLLOW_expression_in_statement814 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_statement817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lhs_in_statement834 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ASSIGN_in_statement836 = new BitSet(new long[]{0x89000000403C0000L,0x0000000000000001L});
    public static final BitSet FOLLOW_expression_in_statement838 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_statement840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postfixExpression_in_statement862 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_statement864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postfixExpression_in_lhs888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expressionList915 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35_in_expressionList918 = new BitSet(new long[]{0x89000000403C0000L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_expressionList920 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_expr_in_expression965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_equalityExpression_in_expr991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression1013 = new BitSet(new long[]{0x0006000000000002L});
    public static final BitSet FOLLOW_49_in_equalityExpression1017 = new BitSet(new long[]{0x89000000403C0000L,0x0000000000000001L});
    public static final BitSet FOLLOW_50_in_equalityExpression1022 = new BitSet(new long[]{0x89000000403C0000L,0x0000000000000001L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression1026 = new BitSet(new long[]{0x0006000000000002L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression1042 = new BitSet(new long[]{0x0078000000000002L});
    public static final BitSet FOLLOW_51_in_relationalExpression1047 = new BitSet(new long[]{0x89000000403C0000L,0x0000000000000001L});
    public static final BitSet FOLLOW_52_in_relationalExpression1052 = new BitSet(new long[]{0x89000000403C0000L,0x0000000000000001L});
    public static final BitSet FOLLOW_53_in_relationalExpression1057 = new BitSet(new long[]{0x89000000403C0000L,0x0000000000000001L});
    public static final BitSet FOLLOW_54_in_relationalExpression1062 = new BitSet(new long[]{0x89000000403C0000L,0x0000000000000001L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression1066 = new BitSet(new long[]{0x0078000000000002L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression1083 = new BitSet(new long[]{0x0180000000000002L});
    public static final BitSet FOLLOW_55_in_additiveExpression1087 = new BitSet(new long[]{0x89000000403C0000L,0x0000000000000001L});
    public static final BitSet FOLLOW_56_in_additiveExpression1092 = new BitSet(new long[]{0x89000000403C0000L,0x0000000000000001L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression1096 = new BitSet(new long[]{0x0180000000000002L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression1112 = new BitSet(new long[]{0x0600000000000002L});
    public static final BitSet FOLLOW_57_in_multiplicativeExpression1116 = new BitSet(new long[]{0x89000000403C0000L,0x0000000000000001L});
    public static final BitSet FOLLOW_58_in_multiplicativeExpression1121 = new BitSet(new long[]{0x89000000403C0000L,0x0000000000000001L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression1125 = new BitSet(new long[]{0x0600000000000002L});
    public static final BitSet FOLLOW_56_in_unaryExpression1143 = new BitSet(new long[]{0x89000000403C0000L,0x0000000000000001L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression1145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_unaryExpression1161 = new BitSet(new long[]{0x89000000403C0000L,0x0000000000000001L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression1163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postfixExpression_in_unaryExpression1177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_in_postfixExpression1194 = new BitSet(new long[]{0x5000000040000002L});
    public static final BitSet FOLLOW_30_in_postfixExpression1213 = new BitSet(new long[]{0x89000000C03C0000L,0x0000000000000001L});
    public static final BitSet FOLLOW_expressionList_in_postfixExpression1216 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_postfixExpression1218 = new BitSet(new long[]{0x5000000040000002L});
    public static final BitSet FOLLOW_60_in_postfixExpression1233 = new BitSet(new long[]{0x89000000403C0000L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_postfixExpression1236 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_postfixExpression1238 = new BitSet(new long[]{0x5000000040000002L});
    public static final BitSet FOLLOW_62_in_postfixExpression1255 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ID_in_postfixExpression1258 = new BitSet(new long[]{0x5000000040000002L});
    public static final BitSet FOLLOW_ID_in_primary1292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_primary1302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_primary1310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_primary1318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_primary1326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_primary1334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_primary1343 = new BitSet(new long[]{0x89000000403C0000L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_primary1345 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_primary1347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDeclaration_in_synpred2_Cerium695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lhs_in_synpred7_Cerium834 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ASSIGN_in_synpred7_Cerium836 = new BitSet(new long[]{0x89000000403C0000L,0x0000000000000001L});
    public static final BitSet FOLLOW_expression_in_synpred7_Cerium838 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_synpred7_Cerium840 = new BitSet(new long[]{0x0000000000000002L});

}