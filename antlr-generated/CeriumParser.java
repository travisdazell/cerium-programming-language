// $ANTLR 3.2 Sep 23, 2009 12:02:23 C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g 2015-02-10 16:42:31

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;

public class CeriumParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "METHOD_DECL", "ARG_DECL", "BLOCK", "MEMBERS", "VAR_DECL", "FIELD_DECL", "CALL", "ELIST", "EXPR", "ASSIGN", "EXTENDS", "UNARY_MINUS", "UNARY_NOT", "INDEX", "ID", "INT", "FLOAT", "CHAR", "LETTER", "WS", "SL_COMMENT", "'import'", "'.'", "'.*'", "';'", "'package'", "'class'", "'{'", "'}'", "'extends'", "'def'", "'('", "')'", "':'", "'private'", "'protected'", "','", "'[]'", "'float'", "'int'", "'void'", "'char'", "'boolean'", "'if'", "'else'", "'while'", "'loop'", "'times'", "'return'", "'!='", "'=='", "'<'", "'>'", "'<='", "'>='", "'+'", "'-'", "'*'", "'/'", "'!'", "'['", "']'", "'true'", "'false'"
    };
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__29=29;
    public static final int T__64=64;
    public static final int T__65=65;
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
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:27:1: compilationUnit : ( packageDefinition )? ( importDefinition )* ( classDefinition )+ EOF ;
    public final CeriumParser.compilationUnit_return compilationUnit() throws RecognitionException {
        CeriumParser.compilationUnit_return retval = new CeriumParser.compilationUnit_return();
        retval.start = input.LT(1);

        CeriumAST root_0 = null;

        Token EOF4=null;
        CeriumParser.packageDefinition_return packageDefinition1 = null;

        CeriumParser.importDefinition_return importDefinition2 = null;

        CeriumParser.classDefinition_return classDefinition3 = null;


        CeriumAST EOF4_tree=null;

        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:28:5: ( ( packageDefinition )? ( importDefinition )* ( classDefinition )+ EOF )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:29:6: ( packageDefinition )? ( importDefinition )* ( classDefinition )+ EOF
            {
            root_0 = (CeriumAST)adaptor.nil();

            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:29:6: ( packageDefinition )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==29) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:29:6: packageDefinition
                    {
                    pushFollow(FOLLOW_packageDefinition_in_compilationUnit151);
                    packageDefinition1=packageDefinition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, packageDefinition1.getTree());

                    }
                    break;

            }

            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:30:6: ( importDefinition )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==25) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:30:6: importDefinition
            	    {
            	    pushFollow(FOLLOW_importDefinition_in_compilationUnit159);
            	    importDefinition2=importDefinition();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, importDefinition2.getTree());

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:31:6: ( classDefinition )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==30) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:31:7: classDefinition
            	    {
            	    pushFollow(FOLLOW_classDefinition_in_compilationUnit168);
            	    classDefinition3=classDefinition();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, classDefinition3.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            EOF4=(Token)match(input,EOF,FOLLOW_EOF_in_compilationUnit172); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            EOF4_tree = (CeriumAST)adaptor.create(EOF4);
            adaptor.addChild(root_0, EOF4_tree);
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

    public static class importDefinition_return extends ParserRuleReturnScope {
        CeriumAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "importDefinition"
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:34:1: importDefinition : 'import' ID ( '.' ID )* ( '.*' )? ';' ;
    public final CeriumParser.importDefinition_return importDefinition() throws RecognitionException {
        CeriumParser.importDefinition_return retval = new CeriumParser.importDefinition_return();
        retval.start = input.LT(1);

        CeriumAST root_0 = null;

        Token string_literal5=null;
        Token ID6=null;
        Token char_literal7=null;
        Token ID8=null;
        Token string_literal9=null;
        Token char_literal10=null;

        CeriumAST string_literal5_tree=null;
        CeriumAST ID6_tree=null;
        CeriumAST char_literal7_tree=null;
        CeriumAST ID8_tree=null;
        CeriumAST string_literal9_tree=null;
        CeriumAST char_literal10_tree=null;

        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:35:2: ( 'import' ID ( '.' ID )* ( '.*' )? ';' )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:36:3: 'import' ID ( '.' ID )* ( '.*' )? ';'
            {
            root_0 = (CeriumAST)adaptor.nil();

            string_literal5=(Token)match(input,25,FOLLOW_25_in_importDefinition192); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal5_tree = (CeriumAST)adaptor.create(string_literal5);
            adaptor.addChild(root_0, string_literal5_tree);
            }
            ID6=(Token)match(input,ID,FOLLOW_ID_in_importDefinition194); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID6_tree = (CeriumAST)adaptor.create(ID6);
            adaptor.addChild(root_0, ID6_tree);
            }
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:36:15: ( '.' ID )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==26) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:36:16: '.' ID
            	    {
            	    char_literal7=(Token)match(input,26,FOLLOW_26_in_importDefinition197); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal7_tree = (CeriumAST)adaptor.create(char_literal7);
            	    adaptor.addChild(root_0, char_literal7_tree);
            	    }
            	    ID8=(Token)match(input,ID,FOLLOW_ID_in_importDefinition199); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    ID8_tree = (CeriumAST)adaptor.create(ID8);
            	    adaptor.addChild(root_0, ID8_tree);
            	    }

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:36:25: ( '.*' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==27) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:36:25: '.*'
                    {
                    string_literal9=(Token)match(input,27,FOLLOW_27_in_importDefinition203); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal9_tree = (CeriumAST)adaptor.create(string_literal9);
                    adaptor.addChild(root_0, string_literal9_tree);
                    }

                    }
                    break;

            }

            char_literal10=(Token)match(input,28,FOLLOW_28_in_importDefinition206); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal10_tree = (CeriumAST)adaptor.create(char_literal10);
            adaptor.addChild(root_0, char_literal10_tree);
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
    // $ANTLR end "importDefinition"

    public static class packageDefinition_return extends ParserRuleReturnScope {
        CeriumAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "packageDefinition"
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:39:1: packageDefinition : 'package' ID ( '.' ID )* ';' ;
    public final CeriumParser.packageDefinition_return packageDefinition() throws RecognitionException {
        CeriumParser.packageDefinition_return retval = new CeriumParser.packageDefinition_return();
        retval.start = input.LT(1);

        CeriumAST root_0 = null;

        Token string_literal11=null;
        Token ID12=null;
        Token char_literal13=null;
        Token ID14=null;
        Token char_literal15=null;

        CeriumAST string_literal11_tree=null;
        CeriumAST ID12_tree=null;
        CeriumAST char_literal13_tree=null;
        CeriumAST ID14_tree=null;
        CeriumAST char_literal15_tree=null;

        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:40:2: ( 'package' ID ( '.' ID )* ';' )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:41:3: 'package' ID ( '.' ID )* ';'
            {
            root_0 = (CeriumAST)adaptor.nil();

            string_literal11=(Token)match(input,29,FOLLOW_29_in_packageDefinition223); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal11_tree = (CeriumAST)adaptor.create(string_literal11);
            adaptor.addChild(root_0, string_literal11_tree);
            }
            ID12=(Token)match(input,ID,FOLLOW_ID_in_packageDefinition225); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID12_tree = (CeriumAST)adaptor.create(ID12);
            adaptor.addChild(root_0, ID12_tree);
            }
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:41:16: ( '.' ID )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==26) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:41:17: '.' ID
            	    {
            	    char_literal13=(Token)match(input,26,FOLLOW_26_in_packageDefinition228); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal13_tree = (CeriumAST)adaptor.create(char_literal13);
            	    adaptor.addChild(root_0, char_literal13_tree);
            	    }
            	    ID14=(Token)match(input,ID,FOLLOW_ID_in_packageDefinition230); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    ID14_tree = (CeriumAST)adaptor.create(ID14);
            	    adaptor.addChild(root_0, ID14_tree);
            	    }

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            char_literal15=(Token)match(input,28,FOLLOW_28_in_packageDefinition234); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal15_tree = (CeriumAST)adaptor.create(char_literal15);
            adaptor.addChild(root_0, char_literal15_tree);
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
    // $ANTLR end "packageDefinition"

    public static class classDefinition_return extends ParserRuleReturnScope {
        CeriumAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "classDefinition"
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:45:1: classDefinition : 'class' ID ( superClass )? '{' ( classMember )* '}' -> ^( 'class' ID ( superClass )? ^( MEMBERS ( classMember )* ) ) ;
    public final CeriumParser.classDefinition_return classDefinition() throws RecognitionException {
        CeriumParser.classDefinition_return retval = new CeriumParser.classDefinition_return();
        retval.start = input.LT(1);

        CeriumAST root_0 = null;

        Token string_literal16=null;
        Token ID17=null;
        Token char_literal19=null;
        Token char_literal21=null;
        CeriumParser.superClass_return superClass18 = null;

        CeriumParser.classMember_return classMember20 = null;


        CeriumAST string_literal16_tree=null;
        CeriumAST ID17_tree=null;
        CeriumAST char_literal19_tree=null;
        CeriumAST char_literal21_tree=null;
        RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
        RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
        RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_superClass=new RewriteRuleSubtreeStream(adaptor,"rule superClass");
        RewriteRuleSubtreeStream stream_classMember=new RewriteRuleSubtreeStream(adaptor,"rule classMember");
        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:46:5: ( 'class' ID ( superClass )? '{' ( classMember )* '}' -> ^( 'class' ID ( superClass )? ^( MEMBERS ( classMember )* ) ) )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:47:6: 'class' ID ( superClass )? '{' ( classMember )* '}'
            {
            string_literal16=(Token)match(input,30,FOLLOW_30_in_classDefinition257); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_30.add(string_literal16);

            ID17=(Token)match(input,ID,FOLLOW_ID_in_classDefinition259); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID17);

            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:47:17: ( superClass )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==33) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:47:17: superClass
                    {
                    pushFollow(FOLLOW_superClass_in_classDefinition261);
                    superClass18=superClass();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_superClass.add(superClass18.getTree());

                    }
                    break;

            }

            char_literal19=(Token)match(input,31,FOLLOW_31_in_classDefinition264); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_31.add(char_literal19);

            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:47:33: ( classMember )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==ID||LA8_0==34||(LA8_0>=38 && LA8_0<=39)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:47:33: classMember
            	    {
            	    pushFollow(FOLLOW_classMember_in_classDefinition266);
            	    classMember20=classMember();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_classMember.add(classMember20.getTree());

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            char_literal21=(Token)match(input,32,FOLLOW_32_in_classDefinition269); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_32.add(char_literal21);



            // AST REWRITE
            // elements: 30, ID, superClass, classMember
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CeriumAST)adaptor.nil();
            // 48:9: -> ^( 'class' ID ( superClass )? ^( MEMBERS ( classMember )* ) )
            {
                // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:48:12: ^( 'class' ID ( superClass )? ^( MEMBERS ( classMember )* ) )
                {
                CeriumAST root_1 = (CeriumAST)adaptor.nil();
                root_1 = (CeriumAST)adaptor.becomeRoot(stream_30.nextNode(), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:48:25: ( superClass )?
                if ( stream_superClass.hasNext() ) {
                    adaptor.addChild(root_1, stream_superClass.nextTree());

                }
                stream_superClass.reset();
                // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:48:37: ^( MEMBERS ( classMember )* )
                {
                CeriumAST root_2 = (CeriumAST)adaptor.nil();
                root_2 = (CeriumAST)adaptor.becomeRoot((CeriumAST)adaptor.create(MEMBERS, "MEMBERS"), root_2);

                // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:48:47: ( classMember )*
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
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:51:1: superClass : 'extends' ID -> ^( EXTENDS ID ) ;
    public final CeriumParser.superClass_return superClass() throws RecognitionException {
        CeriumParser.superClass_return retval = new CeriumParser.superClass_return();
        retval.start = input.LT(1);

        CeriumAST root_0 = null;

        Token string_literal22=null;
        Token ID23=null;

        CeriumAST string_literal22_tree=null;
        CeriumAST ID23_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");

        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:52:2: ( 'extends' ID -> ^( EXTENDS ID ) )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:53:3: 'extends' ID
            {
            string_literal22=(Token)match(input,33,FOLLOW_33_in_superClass316); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_33.add(string_literal22);

            ID23=(Token)match(input,ID,FOLLOW_ID_in_superClass318); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID23);



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
            // 53:16: -> ^( EXTENDS ID )
            {
                // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:53:19: ^( EXTENDS ID )
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
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:58:1: classMember : ( varDeclaration | methodDeclaration );
    public final CeriumParser.classMember_return classMember() throws RecognitionException {
        CeriumParser.classMember_return retval = new CeriumParser.classMember_return();
        retval.start = input.LT(1);

        CeriumAST root_0 = null;

        CeriumParser.varDeclaration_return varDeclaration24 = null;

        CeriumParser.methodDeclaration_return methodDeclaration25 = null;



        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:59:2: ( varDeclaration | methodDeclaration )
            int alt9=2;
            switch ( input.LA(1) ) {
            case 38:
            case 39:
                {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==34) ) {
                    alt9=2;
                }
                else if ( (LA9_1==ID) ) {
                    alt9=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
                }
                break;
            case ID:
                {
                alt9=1;
                }
                break;
            case 34:
                {
                alt9=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:60:3: varDeclaration
                    {
                    root_0 = (CeriumAST)adaptor.nil();

                    pushFollow(FOLLOW_varDeclaration_in_classMember341);
                    varDeclaration24=varDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclaration24.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:61:6: methodDeclaration
                    {
                    root_0 = (CeriumAST)adaptor.nil();

                    pushFollow(FOLLOW_methodDeclaration_in_classMember348);
                    methodDeclaration25=methodDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, methodDeclaration25.getTree());

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
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:65:1: methodDeclaration : ( accessModifier )? 'def' ID '(' ( formalParameters )? ')' ':' type block -> ^( METHOD_DECL type ID ( formalParameters )? block ) ;
    public final CeriumParser.methodDeclaration_return methodDeclaration() throws RecognitionException {
        CeriumParser.methodDeclaration_return retval = new CeriumParser.methodDeclaration_return();
        retval.start = input.LT(1);

        CeriumAST root_0 = null;

        Token string_literal27=null;
        Token ID28=null;
        Token char_literal29=null;
        Token char_literal31=null;
        Token char_literal32=null;
        CeriumParser.accessModifier_return accessModifier26 = null;

        CeriumParser.formalParameters_return formalParameters30 = null;

        CeriumParser.type_return type33 = null;

        CeriumParser.block_return block34 = null;


        CeriumAST string_literal27_tree=null;
        CeriumAST ID28_tree=null;
        CeriumAST char_literal29_tree=null;
        CeriumAST char_literal31_tree=null;
        CeriumAST char_literal32_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
        RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
        RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
        RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
        RewriteRuleSubtreeStream stream_accessModifier=new RewriteRuleSubtreeStream(adaptor,"rule accessModifier");
        RewriteRuleSubtreeStream stream_formalParameters=new RewriteRuleSubtreeStream(adaptor,"rule formalParameters");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:66:5: ( ( accessModifier )? 'def' ID '(' ( formalParameters )? ')' ':' type block -> ^( METHOD_DECL type ID ( formalParameters )? block ) )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:67:6: ( accessModifier )? 'def' ID '(' ( formalParameters )? ')' ':' type block
            {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:67:6: ( accessModifier )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=38 && LA10_0<=39)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:67:6: accessModifier
                    {
                    pushFollow(FOLLOW_accessModifier_in_methodDeclaration368);
                    accessModifier26=accessModifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_accessModifier.add(accessModifier26.getTree());

                    }
                    break;

            }

            string_literal27=(Token)match(input,34,FOLLOW_34_in_methodDeclaration371); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_34.add(string_literal27);

            ID28=(Token)match(input,ID,FOLLOW_ID_in_methodDeclaration373); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID28);

            char_literal29=(Token)match(input,35,FOLLOW_35_in_methodDeclaration375); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_35.add(char_literal29);

            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:67:35: ( formalParameters )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==ID) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:67:35: formalParameters
                    {
                    pushFollow(FOLLOW_formalParameters_in_methodDeclaration377);
                    formalParameters30=formalParameters();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_formalParameters.add(formalParameters30.getTree());

                    }
                    break;

            }

            char_literal31=(Token)match(input,36,FOLLOW_36_in_methodDeclaration380); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_36.add(char_literal31);

            char_literal32=(Token)match(input,37,FOLLOW_37_in_methodDeclaration382); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_37.add(char_literal32);

            pushFollow(FOLLOW_type_in_methodDeclaration384);
            type33=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type33.getTree());
            pushFollow(FOLLOW_block_in_methodDeclaration386);
            block34=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block34.getTree());


            // AST REWRITE
            // elements: type, ID, block, formalParameters
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CeriumAST)adaptor.nil();
            // 68:9: -> ^( METHOD_DECL type ID ( formalParameters )? block )
            {
                // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:68:12: ^( METHOD_DECL type ID ( formalParameters )? block )
                {
                CeriumAST root_1 = (CeriumAST)adaptor.nil();
                root_1 = (CeriumAST)adaptor.becomeRoot((CeriumAST)adaptor.create(METHOD_DECL, "METHOD_DECL"), root_1);

                adaptor.addChild(root_1, stream_type.nextTree());
                adaptor.addChild(root_1, stream_ID.nextNode());
                // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:68:34: ( formalParameters )?
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
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:72:1: accessModifier : ( 'private' | 'protected' );
    public final CeriumParser.accessModifier_return accessModifier() throws RecognitionException {
        CeriumParser.accessModifier_return retval = new CeriumParser.accessModifier_return();
        retval.start = input.LT(1);

        CeriumAST root_0 = null;

        Token set35=null;

        CeriumAST set35_tree=null;

        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:72:16: ( 'private' | 'protected' )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:
            {
            root_0 = (CeriumAST)adaptor.nil();

            set35=(Token)input.LT(1);
            if ( (input.LA(1)>=38 && input.LA(1)<=39) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CeriumAST)adaptor.create(set35));
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
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:76:1: formalParameters : parameter ( ',' parameter )* -> ( parameter )+ ;
    public final CeriumParser.formalParameters_return formalParameters() throws RecognitionException {
        CeriumParser.formalParameters_return retval = new CeriumParser.formalParameters_return();
        retval.start = input.LT(1);

        CeriumAST root_0 = null;

        Token char_literal37=null;
        CeriumParser.parameter_return parameter36 = null;

        CeriumParser.parameter_return parameter38 = null;


        CeriumAST char_literal37_tree=null;
        RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
        RewriteRuleSubtreeStream stream_parameter=new RewriteRuleSubtreeStream(adaptor,"rule parameter");
        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:77:5: ( parameter ( ',' parameter )* -> ( parameter )+ )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:78:6: parameter ( ',' parameter )*
            {
            pushFollow(FOLLOW_parameter_in_formalParameters457);
            parameter36=parameter();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_parameter.add(parameter36.getTree());
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:78:16: ( ',' parameter )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==40) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:78:17: ',' parameter
            	    {
            	    char_literal37=(Token)match(input,40,FOLLOW_40_in_formalParameters460); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_40.add(char_literal37);

            	    pushFollow(FOLLOW_parameter_in_formalParameters462);
            	    parameter38=parameter();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_parameter.add(parameter38.getTree());

            	    }
            	    break;

            	default :
            	    break loop12;
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
            // 78:33: -> ( parameter )+
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
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:81:1: parameter : ( ID ':' type -> ^( ARG_DECL type ID ) | ID ':' type '[]' -> ^( ARG_DECL ^( '[]' type ) ID ) );
    public final CeriumParser.parameter_return parameter() throws RecognitionException {
        CeriumParser.parameter_return retval = new CeriumParser.parameter_return();
        retval.start = input.LT(1);

        CeriumAST root_0 = null;

        Token ID39=null;
        Token char_literal40=null;
        Token ID42=null;
        Token char_literal43=null;
        Token string_literal45=null;
        CeriumParser.type_return type41 = null;

        CeriumParser.type_return type44 = null;


        CeriumAST ID39_tree=null;
        CeriumAST char_literal40_tree=null;
        CeriumAST ID42_tree=null;
        CeriumAST char_literal43_tree=null;
        CeriumAST string_literal45_tree=null;
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:82:2: ( ID ':' type -> ^( ARG_DECL type ID ) | ID ':' type '[]' -> ^( ARG_DECL ^( '[]' type ) ID ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==ID) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==37) ) {
                    int LA13_2 = input.LA(3);

                    if ( (LA13_2==ID||(LA13_2>=42 && LA13_2<=46)) ) {
                        int LA13_3 = input.LA(4);

                        if ( (LA13_3==36||LA13_3==40) ) {
                            alt13=1;
                        }
                        else if ( (LA13_3==41) ) {
                            alt13=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 13, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:83:3: ID ':' type
                    {
                    ID39=(Token)match(input,ID,FOLLOW_ID_in_parameter490); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID39);

                    char_literal40=(Token)match(input,37,FOLLOW_37_in_parameter492); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_37.add(char_literal40);

                    pushFollow(FOLLOW_type_in_parameter494);
                    type41=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type41.getTree());


                    // AST REWRITE
                    // elements: type, ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CeriumAST)adaptor.nil();
                    // 83:15: -> ^( ARG_DECL type ID )
                    {
                        // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:83:18: ^( ARG_DECL type ID )
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
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:84:4: ID ':' type '[]'
                    {
                    ID42=(Token)match(input,ID,FOLLOW_ID_in_parameter509); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID42);

                    char_literal43=(Token)match(input,37,FOLLOW_37_in_parameter511); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_37.add(char_literal43);

                    pushFollow(FOLLOW_type_in_parameter513);
                    type44=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type44.getTree());
                    string_literal45=(Token)match(input,41,FOLLOW_41_in_parameter515); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_41.add(string_literal45);



                    // AST REWRITE
                    // elements: 41, type, ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CeriumAST)adaptor.nil();
                    // 84:21: -> ^( ARG_DECL ^( '[]' type ) ID )
                    {
                        // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:84:24: ^( ARG_DECL ^( '[]' type ) ID )
                        {
                        CeriumAST root_1 = (CeriumAST)adaptor.nil();
                        root_1 = (CeriumAST)adaptor.becomeRoot((CeriumAST)adaptor.create(ARG_DECL, "ARG_DECL"), root_1);

                        // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:84:35: ^( '[]' type )
                        {
                        CeriumAST root_2 = (CeriumAST)adaptor.nil();
                        root_2 = (CeriumAST)adaptor.becomeRoot(stream_41.nextNode(), root_2);

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
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:88:1: type : ( 'float' | 'int' | 'void' | 'char' | 'boolean' | ID );
    public final CeriumParser.type_return type() throws RecognitionException {
        CeriumParser.type_return retval = new CeriumParser.type_return();
        retval.start = input.LT(1);

        CeriumAST root_0 = null;

        Token set46=null;

        CeriumAST set46_tree=null;

        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:88:5: ( 'float' | 'int' | 'void' | 'char' | 'boolean' | ID )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:
            {
            root_0 = (CeriumAST)adaptor.nil();

            set46=(Token)input.LT(1);
            if ( input.LA(1)==ID||(input.LA(1)>=42 && input.LA(1)<=46) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CeriumAST)adaptor.create(set46));
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
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:98:1: block : '{' ( statement )* '}' -> ^( BLOCK ( statement )* ) ;
    public final CeriumParser.block_return block() throws RecognitionException {
        CeriumParser.block_return retval = new CeriumParser.block_return();
        retval.start = input.LT(1);

        CeriumAST root_0 = null;

        Token char_literal47=null;
        Token char_literal49=null;
        CeriumParser.statement_return statement48 = null;


        CeriumAST char_literal47_tree=null;
        CeriumAST char_literal49_tree=null;
        RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
        RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:99:5: ( '{' ( statement )* '}' -> ^( BLOCK ( statement )* ) )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:100:6: '{' ( statement )* '}'
            {
            char_literal47=(Token)match(input,31,FOLLOW_31_in_block616); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_31.add(char_literal47);

            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:100:10: ( statement )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=ID && LA14_0<=CHAR)||LA14_0==28||LA14_0==31||LA14_0==35||(LA14_0>=38 && LA14_0<=39)||LA14_0==47||(LA14_0>=49 && LA14_0<=50)||LA14_0==52||(LA14_0>=66 && LA14_0<=67)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:100:10: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_block618);
            	    statement48=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_statement.add(statement48.getTree());

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            char_literal49=(Token)match(input,32,FOLLOW_32_in_block621); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_32.add(char_literal49);



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
            // 100:25: -> ^( BLOCK ( statement )* )
            {
                // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:100:28: ^( BLOCK ( statement )* )
                {
                CeriumAST root_1 = (CeriumAST)adaptor.nil();
                root_1 = (CeriumAST)adaptor.becomeRoot((CeriumAST)adaptor.create(BLOCK, "BLOCK"), root_1);

                // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:100:36: ( statement )*
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
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:105:1: varDeclaration : ( ( accessModifier )? ID ':' type ( '=' expression )? ';' -> ^( VAR_DECL type ID ( expression )? ) | ( accessModifier )? ID ':' type '[]' ( '=' expression )? ';' -> ^( VAR_DECL ^( '[]' type ) ID ( expression )? ) );
    public final CeriumParser.varDeclaration_return varDeclaration() throws RecognitionException {
        CeriumParser.varDeclaration_return retval = new CeriumParser.varDeclaration_return();
        retval.start = input.LT(1);

        CeriumAST root_0 = null;

        Token ID51=null;
        Token char_literal52=null;
        Token char_literal54=null;
        Token char_literal56=null;
        Token ID58=null;
        Token char_literal59=null;
        Token string_literal61=null;
        Token char_literal62=null;
        Token char_literal64=null;
        CeriumParser.accessModifier_return accessModifier50 = null;

        CeriumParser.type_return type53 = null;

        CeriumParser.expression_return expression55 = null;

        CeriumParser.accessModifier_return accessModifier57 = null;

        CeriumParser.type_return type60 = null;

        CeriumParser.expression_return expression63 = null;


        CeriumAST ID51_tree=null;
        CeriumAST char_literal52_tree=null;
        CeriumAST char_literal54_tree=null;
        CeriumAST char_literal56_tree=null;
        CeriumAST ID58_tree=null;
        CeriumAST char_literal59_tree=null;
        CeriumAST string_literal61_tree=null;
        CeriumAST char_literal62_tree=null;
        CeriumAST char_literal64_tree=null;
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
        RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_accessModifier=new RewriteRuleSubtreeStream(adaptor,"rule accessModifier");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:106:5: ( ( accessModifier )? ID ':' type ( '=' expression )? ';' -> ^( VAR_DECL type ID ( expression )? ) | ( accessModifier )? ID ':' type '[]' ( '=' expression )? ';' -> ^( VAR_DECL ^( '[]' type ) ID ( expression )? ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=38 && LA19_0<=39)) ) {
                int LA19_1 = input.LA(2);

                if ( (LA19_1==ID) ) {
                    int LA19_2 = input.LA(3);

                    if ( (LA19_2==37) ) {
                        int LA19_3 = input.LA(4);

                        if ( (LA19_3==ID||(LA19_3>=42 && LA19_3<=46)) ) {
                            int LA19_4 = input.LA(5);

                            if ( (LA19_4==ASSIGN||LA19_4==28) ) {
                                alt19=1;
                            }
                            else if ( (LA19_4==41) ) {
                                alt19=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 19, 4, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 19, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 19, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA19_0==ID) ) {
                int LA19_2 = input.LA(2);

                if ( (LA19_2==37) ) {
                    int LA19_3 = input.LA(3);

                    if ( (LA19_3==ID||(LA19_3>=42 && LA19_3<=46)) ) {
                        int LA19_4 = input.LA(4);

                        if ( (LA19_4==ASSIGN||LA19_4==28) ) {
                            alt19=1;
                        }
                        else if ( (LA19_4==41) ) {
                            alt19=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 19, 4, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 19, 3, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:107:6: ( accessModifier )? ID ':' type ( '=' expression )? ';'
                    {
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:107:6: ( accessModifier )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( ((LA15_0>=38 && LA15_0<=39)) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:107:6: accessModifier
                            {
                            pushFollow(FOLLOW_accessModifier_in_varDeclaration654);
                            accessModifier50=accessModifier();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_accessModifier.add(accessModifier50.getTree());

                            }
                            break;

                    }

                    ID51=(Token)match(input,ID,FOLLOW_ID_in_varDeclaration657); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID51);

                    char_literal52=(Token)match(input,37,FOLLOW_37_in_varDeclaration659); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_37.add(char_literal52);

                    pushFollow(FOLLOW_type_in_varDeclaration661);
                    type53=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type53.getTree());
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:107:34: ( '=' expression )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==ASSIGN) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:107:35: '=' expression
                            {
                            char_literal54=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_varDeclaration664); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_ASSIGN.add(char_literal54);

                            pushFollow(FOLLOW_expression_in_varDeclaration666);
                            expression55=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expression.add(expression55.getTree());

                            }
                            break;

                    }

                    char_literal56=(Token)match(input,28,FOLLOW_28_in_varDeclaration670); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_28.add(char_literal56);



                    // AST REWRITE
                    // elements: expression, ID, type
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CeriumAST)adaptor.nil();
                    // 107:56: -> ^( VAR_DECL type ID ( expression )? )
                    {
                        // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:107:59: ^( VAR_DECL type ID ( expression )? )
                        {
                        CeriumAST root_1 = (CeriumAST)adaptor.nil();
                        root_1 = (CeriumAST)adaptor.becomeRoot((CeriumAST)adaptor.create(VAR_DECL, "VAR_DECL"), root_1);

                        adaptor.addChild(root_1, stream_type.nextTree());
                        adaptor.addChild(root_1, stream_ID.nextNode());
                        // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:107:78: ( expression )?
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
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:108:7: ( accessModifier )? ID ':' type '[]' ( '=' expression )? ';'
                    {
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:108:7: ( accessModifier )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( ((LA17_0>=38 && LA17_0<=39)) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:108:7: accessModifier
                            {
                            pushFollow(FOLLOW_accessModifier_in_varDeclaration693);
                            accessModifier57=accessModifier();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_accessModifier.add(accessModifier57.getTree());

                            }
                            break;

                    }

                    ID58=(Token)match(input,ID,FOLLOW_ID_in_varDeclaration696); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID58);

                    char_literal59=(Token)match(input,37,FOLLOW_37_in_varDeclaration698); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_37.add(char_literal59);

                    pushFollow(FOLLOW_type_in_varDeclaration700);
                    type60=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type60.getTree());
                    string_literal61=(Token)match(input,41,FOLLOW_41_in_varDeclaration702); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_41.add(string_literal61);

                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:108:40: ( '=' expression )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==ASSIGN) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:108:41: '=' expression
                            {
                            char_literal62=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_varDeclaration705); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_ASSIGN.add(char_literal62);

                            pushFollow(FOLLOW_expression_in_varDeclaration707);
                            expression63=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expression.add(expression63.getTree());

                            }
                            break;

                    }

                    char_literal64=(Token)match(input,28,FOLLOW_28_in_varDeclaration711); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_28.add(char_literal64);



                    // AST REWRITE
                    // elements: 41, type, expression, ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CeriumAST)adaptor.nil();
                    // 108:62: -> ^( VAR_DECL ^( '[]' type ) ID ( expression )? )
                    {
                        // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:108:65: ^( VAR_DECL ^( '[]' type ) ID ( expression )? )
                        {
                        CeriumAST root_1 = (CeriumAST)adaptor.nil();
                        root_1 = (CeriumAST)adaptor.becomeRoot((CeriumAST)adaptor.create(VAR_DECL, "VAR_DECL"), root_1);

                        // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:108:76: ^( '[]' type )
                        {
                        CeriumAST root_2 = (CeriumAST)adaptor.nil();
                        root_2 = (CeriumAST)adaptor.becomeRoot(stream_41.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_type.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        adaptor.addChild(root_1, stream_ID.nextNode());
                        // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:108:92: ( expression )?
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
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:112:1: statement options {backtrack=true; } : ( block | varDeclaration | 'if' '(' expression ')' t= block ( 'else' f= block )? -> ^( 'if' expression $t ( $f)? ) | 'while' '(' expression ')' block -> ^( 'while' expression block ) | 'loop' expression 'times' block -> ^( 'loop' expression block ) | 'return' ( expression )? ';' -> ^( 'return' ( expression )? ) | lhs '=' expression ';' -> ^( '=' lhs expression ) | a= postfixExpression ';' -> ^( EXPR postfixExpression ) | ';' );
    public final CeriumParser.statement_return statement() throws RecognitionException {
        CeriumParser.statement_return retval = new CeriumParser.statement_return();
        retval.start = input.LT(1);

        CeriumAST root_0 = null;

        Token string_literal67=null;
        Token char_literal68=null;
        Token char_literal70=null;
        Token string_literal71=null;
        Token string_literal72=null;
        Token char_literal73=null;
        Token char_literal75=null;
        Token string_literal77=null;
        Token string_literal79=null;
        Token string_literal81=null;
        Token char_literal83=null;
        Token char_literal85=null;
        Token char_literal87=null;
        Token char_literal88=null;
        Token char_literal89=null;
        CeriumParser.block_return t = null;

        CeriumParser.block_return f = null;

        CeriumParser.postfixExpression_return a = null;

        CeriumParser.block_return block65 = null;

        CeriumParser.varDeclaration_return varDeclaration66 = null;

        CeriumParser.expression_return expression69 = null;

        CeriumParser.expression_return expression74 = null;

        CeriumParser.block_return block76 = null;

        CeriumParser.expression_return expression78 = null;

        CeriumParser.block_return block80 = null;

        CeriumParser.expression_return expression82 = null;

        CeriumParser.lhs_return lhs84 = null;

        CeriumParser.expression_return expression86 = null;


        CeriumAST string_literal67_tree=null;
        CeriumAST char_literal68_tree=null;
        CeriumAST char_literal70_tree=null;
        CeriumAST string_literal71_tree=null;
        CeriumAST string_literal72_tree=null;
        CeriumAST char_literal73_tree=null;
        CeriumAST char_literal75_tree=null;
        CeriumAST string_literal77_tree=null;
        CeriumAST string_literal79_tree=null;
        CeriumAST string_literal81_tree=null;
        CeriumAST char_literal83_tree=null;
        CeriumAST char_literal85_tree=null;
        CeriumAST char_literal87_tree=null;
        CeriumAST char_literal88_tree=null;
        CeriumAST char_literal89_tree=null;
        RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
        RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
        RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
        RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
        RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
        RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_postfixExpression=new RewriteRuleSubtreeStream(adaptor,"rule postfixExpression");
        RewriteRuleSubtreeStream stream_lhs=new RewriteRuleSubtreeStream(adaptor,"rule lhs");
        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:114:5: ( block | varDeclaration | 'if' '(' expression ')' t= block ( 'else' f= block )? -> ^( 'if' expression $t ( $f)? ) | 'while' '(' expression ')' block -> ^( 'while' expression block ) | 'loop' expression 'times' block -> ^( 'loop' expression block ) | 'return' ( expression )? ';' -> ^( 'return' ( expression )? ) | lhs '=' expression ';' -> ^( '=' lhs expression ) | a= postfixExpression ';' -> ^( EXPR postfixExpression ) | ';' )
            int alt22=9;
            alt22 = dfa22.predict(input);
            switch (alt22) {
                case 1 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:115:6: block
                    {
                    root_0 = (CeriumAST)adaptor.nil();

                    pushFollow(FOLLOW_block_in_statement762);
                    block65=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, block65.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:116:7: varDeclaration
                    {
                    root_0 = (CeriumAST)adaptor.nil();

                    pushFollow(FOLLOW_varDeclaration_in_statement770);
                    varDeclaration66=varDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclaration66.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:117:7: 'if' '(' expression ')' t= block ( 'else' f= block )?
                    {
                    string_literal67=(Token)match(input,47,FOLLOW_47_in_statement778); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_47.add(string_literal67);

                    char_literal68=(Token)match(input,35,FOLLOW_35_in_statement780); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_35.add(char_literal68);

                    pushFollow(FOLLOW_expression_in_statement782);
                    expression69=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression69.getTree());
                    char_literal70=(Token)match(input,36,FOLLOW_36_in_statement784); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_36.add(char_literal70);

                    pushFollow(FOLLOW_block_in_statement788);
                    t=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(t.getTree());
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:117:39: ( 'else' f= block )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==48) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:117:40: 'else' f= block
                            {
                            string_literal71=(Token)match(input,48,FOLLOW_48_in_statement791); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_48.add(string_literal71);

                            pushFollow(FOLLOW_block_in_statement795);
                            f=block();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_block.add(f.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: 47, expression, t, f
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
                    // 118:6: -> ^( 'if' expression $t ( $f)? )
                    {
                        // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:118:9: ^( 'if' expression $t ( $f)? )
                        {
                        CeriumAST root_1 = (CeriumAST)adaptor.nil();
                        root_1 = (CeriumAST)adaptor.becomeRoot(stream_47.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());
                        adaptor.addChild(root_1, stream_t.nextTree());
                        // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:118:30: ( $f)?
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
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:119:7: 'while' '(' expression ')' block
                    {
                    string_literal72=(Token)match(input,49,FOLLOW_49_in_statement825); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_49.add(string_literal72);

                    char_literal73=(Token)match(input,35,FOLLOW_35_in_statement827); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_35.add(char_literal73);

                    pushFollow(FOLLOW_expression_in_statement829);
                    expression74=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression74.getTree());
                    char_literal75=(Token)match(input,36,FOLLOW_36_in_statement831); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_36.add(char_literal75);

                    pushFollow(FOLLOW_block_in_statement833);
                    block76=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block76.getTree());


                    // AST REWRITE
                    // elements: 49, block, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CeriumAST)adaptor.nil();
                    // 120:6: -> ^( 'while' expression block )
                    {
                        // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:120:9: ^( 'while' expression block )
                        {
                        CeriumAST root_1 = (CeriumAST)adaptor.nil();
                        root_1 = (CeriumAST)adaptor.becomeRoot(stream_49.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());
                        adaptor.addChild(root_1, stream_block.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:121:7: 'loop' expression 'times' block
                    {
                    string_literal77=(Token)match(input,50,FOLLOW_50_in_statement856); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_50.add(string_literal77);

                    pushFollow(FOLLOW_expression_in_statement858);
                    expression78=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression78.getTree());
                    string_literal79=(Token)match(input,51,FOLLOW_51_in_statement860); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_51.add(string_literal79);

                    pushFollow(FOLLOW_block_in_statement862);
                    block80=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block80.getTree());


                    // AST REWRITE
                    // elements: block, expression, 50
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CeriumAST)adaptor.nil();
                    // 122:6: -> ^( 'loop' expression block )
                    {
                        // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:122:9: ^( 'loop' expression block )
                        {
                        CeriumAST root_1 = (CeriumAST)adaptor.nil();
                        root_1 = (CeriumAST)adaptor.becomeRoot(stream_50.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());
                        adaptor.addChild(root_1, stream_block.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:123:9: 'return' ( expression )? ';'
                    {
                    string_literal81=(Token)match(input,52,FOLLOW_52_in_statement887); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_52.add(string_literal81);

                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:123:18: ( expression )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( ((LA21_0>=ID && LA21_0<=CHAR)||LA21_0==35||LA21_0==60||LA21_0==63||(LA21_0>=66 && LA21_0<=67)) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:123:18: expression
                            {
                            pushFollow(FOLLOW_expression_in_statement889);
                            expression82=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expression.add(expression82.getTree());

                            }
                            break;

                    }

                    char_literal83=(Token)match(input,28,FOLLOW_28_in_statement892); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_28.add(char_literal83);



                    // AST REWRITE
                    // elements: expression, 52
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CeriumAST)adaptor.nil();
                    // 123:34: -> ^( 'return' ( expression )? )
                    {
                        // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:123:37: ^( 'return' ( expression )? )
                        {
                        CeriumAST root_1 = (CeriumAST)adaptor.nil();
                        root_1 = (CeriumAST)adaptor.becomeRoot(stream_52.nextNode(), root_1);

                        // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:123:48: ( expression )?
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
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:124:7: lhs '=' expression ';'
                    {
                    pushFollow(FOLLOW_lhs_in_statement909);
                    lhs84=lhs();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_lhs.add(lhs84.getTree());
                    char_literal85=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_statement911); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(char_literal85);

                    pushFollow(FOLLOW_expression_in_statement913);
                    expression86=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression86.getTree());
                    char_literal87=(Token)match(input,28,FOLLOW_28_in_statement915); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_28.add(char_literal87);



                    // AST REWRITE
                    // elements: expression, lhs, ASSIGN
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CeriumAST)adaptor.nil();
                    // 124:30: -> ^( '=' lhs expression )
                    {
                        // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:124:33: ^( '=' lhs expression )
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
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:125:9: a= postfixExpression ';'
                    {
                    pushFollow(FOLLOW_postfixExpression_in_statement937);
                    a=postfixExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_postfixExpression.add(a.getTree());
                    char_literal88=(Token)match(input,28,FOLLOW_28_in_statement939); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_28.add(char_literal88);



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
                    // 125:33: -> ^( EXPR postfixExpression )
                    {
                        // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:125:36: ^( EXPR postfixExpression )
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
                case 9 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:126:9: ';'
                    {
                    root_0 = (CeriumAST)adaptor.nil();

                    char_literal89=(Token)match(input,28,FOLLOW_28_in_statement958); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal89_tree = (CeriumAST)adaptor.create(char_literal89);
                    adaptor.addChild(root_0, char_literal89_tree);
                    }

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
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:129:1: lhs : postfixExpression -> ^( EXPR postfixExpression ) ;
    public final CeriumParser.lhs_return lhs() throws RecognitionException {
        CeriumParser.lhs_return retval = new CeriumParser.lhs_return();
        retval.start = input.LT(1);

        CeriumAST root_0 = null;

        CeriumParser.postfixExpression_return postfixExpression90 = null;


        RewriteRuleSubtreeStream stream_postfixExpression=new RewriteRuleSubtreeStream(adaptor,"rule postfixExpression");
        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:129:5: ( postfixExpression -> ^( EXPR postfixExpression ) )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:130:3: postfixExpression
            {
            pushFollow(FOLLOW_postfixExpression_in_lhs973);
            postfixExpression90=postfixExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_postfixExpression.add(postfixExpression90.getTree());


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
            // 130:21: -> ^( EXPR postfixExpression )
            {
                // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:130:24: ^( EXPR postfixExpression )
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
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:133:1: expressionList : ( expr ( ',' expr )* -> ^( ELIST ( expr )+ ) | -> ELIST );
    public final CeriumParser.expressionList_return expressionList() throws RecognitionException {
        CeriumParser.expressionList_return retval = new CeriumParser.expressionList_return();
        retval.start = input.LT(1);

        CeriumAST root_0 = null;

        Token char_literal92=null;
        CeriumParser.expr_return expr91 = null;

        CeriumParser.expr_return expr93 = null;


        CeriumAST char_literal92_tree=null;
        RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:134:5: ( expr ( ',' expr )* -> ^( ELIST ( expr )+ ) | -> ELIST )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=ID && LA24_0<=CHAR)||LA24_0==35||LA24_0==60||LA24_0==63||(LA24_0>=66 && LA24_0<=67)) ) {
                alt24=1;
            }
            else if ( (LA24_0==36) ) {
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
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:135:6: expr ( ',' expr )*
                    {
                    pushFollow(FOLLOW_expr_in_expressionList1000);
                    expr91=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr91.getTree());
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:135:11: ( ',' expr )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==40) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:135:12: ',' expr
                    	    {
                    	    char_literal92=(Token)match(input,40,FOLLOW_40_in_expressionList1003); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_40.add(char_literal92);

                    	    pushFollow(FOLLOW_expr_in_expressionList1005);
                    	    expr93=expr();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expr.add(expr93.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop23;
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
                    // 135:23: -> ^( ELIST ( expr )+ )
                    {
                        // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:135:26: ^( ELIST ( expr )+ )
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
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:136:9: 
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
                    // 136:9: -> ELIST
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
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:139:1: expression : expr -> ^( EXPR expr ) ;
    public final CeriumParser.expression_return expression() throws RecognitionException {
        CeriumParser.expression_return retval = new CeriumParser.expression_return();
        retval.start = input.LT(1);

        CeriumAST root_0 = null;

        CeriumParser.expr_return expr94 = null;


        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:140:5: ( expr -> ^( EXPR expr ) )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:141:6: expr
            {
            pushFollow(FOLLOW_expr_in_expression1050);
            expr94=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr94.getTree());


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
            // 141:11: -> ^( EXPR expr )
            {
                // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:141:14: ^( EXPR expr )
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
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:144:1: expr : equalityExpression ;
    public final CeriumParser.expr_return expr() throws RecognitionException {
        CeriumParser.expr_return retval = new CeriumParser.expr_return();
        retval.start = input.LT(1);

        CeriumAST root_0 = null;

        CeriumParser.equalityExpression_return equalityExpression95 = null;



        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:144:5: ( equalityExpression )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:145:3: equalityExpression
            {
            root_0 = (CeriumAST)adaptor.nil();

            pushFollow(FOLLOW_equalityExpression_in_expr1076);
            equalityExpression95=equalityExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, equalityExpression95.getTree());

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
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:148:1: equalityExpression : relationalExpression ( ( '!=' | '==' ) relationalExpression )* ;
    public final CeriumParser.equalityExpression_return equalityExpression() throws RecognitionException {
        CeriumParser.equalityExpression_return retval = new CeriumParser.equalityExpression_return();
        retval.start = input.LT(1);

        CeriumAST root_0 = null;

        Token string_literal97=null;
        Token string_literal98=null;
        CeriumParser.relationalExpression_return relationalExpression96 = null;

        CeriumParser.relationalExpression_return relationalExpression99 = null;


        CeriumAST string_literal97_tree=null;
        CeriumAST string_literal98_tree=null;

        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:149:2: ( relationalExpression ( ( '!=' | '==' ) relationalExpression )* )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:150:3: relationalExpression ( ( '!=' | '==' ) relationalExpression )*
            {
            root_0 = (CeriumAST)adaptor.nil();

            pushFollow(FOLLOW_relationalExpression_in_equalityExpression1098);
            relationalExpression96=relationalExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, relationalExpression96.getTree());
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:150:24: ( ( '!=' | '==' ) relationalExpression )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=53 && LA26_0<=54)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:150:25: ( '!=' | '==' ) relationalExpression
            	    {
            	    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:150:25: ( '!=' | '==' )
            	    int alt25=2;
            	    int LA25_0 = input.LA(1);

            	    if ( (LA25_0==53) ) {
            	        alt25=1;
            	    }
            	    else if ( (LA25_0==54) ) {
            	        alt25=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 25, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt25) {
            	        case 1 :
            	            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:150:26: '!='
            	            {
            	            string_literal97=(Token)match(input,53,FOLLOW_53_in_equalityExpression1102); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal97_tree = (CeriumAST)adaptor.create(string_literal97);
            	            root_0 = (CeriumAST)adaptor.becomeRoot(string_literal97_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:150:34: '=='
            	            {
            	            string_literal98=(Token)match(input,54,FOLLOW_54_in_equalityExpression1107); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal98_tree = (CeriumAST)adaptor.create(string_literal98);
            	            root_0 = (CeriumAST)adaptor.becomeRoot(string_literal98_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_relationalExpression_in_equalityExpression1111);
            	    relationalExpression99=relationalExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, relationalExpression99.getTree());

            	    }
            	    break;

            	default :
            	    break loop26;
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
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:153:1: relationalExpression : additiveExpression ( ( '<' | '>' | '<=' | '>=' ) additiveExpression )* ;
    public final CeriumParser.relationalExpression_return relationalExpression() throws RecognitionException {
        CeriumParser.relationalExpression_return retval = new CeriumParser.relationalExpression_return();
        retval.start = input.LT(1);

        CeriumAST root_0 = null;

        Token char_literal101=null;
        Token char_literal102=null;
        Token string_literal103=null;
        Token string_literal104=null;
        CeriumParser.additiveExpression_return additiveExpression100 = null;

        CeriumParser.additiveExpression_return additiveExpression105 = null;


        CeriumAST char_literal101_tree=null;
        CeriumAST char_literal102_tree=null;
        CeriumAST string_literal103_tree=null;
        CeriumAST string_literal104_tree=null;

        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:154:2: ( additiveExpression ( ( '<' | '>' | '<=' | '>=' ) additiveExpression )* )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:155:3: additiveExpression ( ( '<' | '>' | '<=' | '>=' ) additiveExpression )*
            {
            root_0 = (CeriumAST)adaptor.nil();

            pushFollow(FOLLOW_additiveExpression_in_relationalExpression1127);
            additiveExpression100=additiveExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, additiveExpression100.getTree());
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:155:22: ( ( '<' | '>' | '<=' | '>=' ) additiveExpression )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=55 && LA28_0<=58)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:155:24: ( '<' | '>' | '<=' | '>=' ) additiveExpression
            	    {
            	    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:155:24: ( '<' | '>' | '<=' | '>=' )
            	    int alt27=4;
            	    switch ( input.LA(1) ) {
            	    case 55:
            	        {
            	        alt27=1;
            	        }
            	        break;
            	    case 56:
            	        {
            	        alt27=2;
            	        }
            	        break;
            	    case 57:
            	        {
            	        alt27=3;
            	        }
            	        break;
            	    case 58:
            	        {
            	        alt27=4;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 27, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt27) {
            	        case 1 :
            	            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:155:25: '<'
            	            {
            	            char_literal101=(Token)match(input,55,FOLLOW_55_in_relationalExpression1132); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal101_tree = (CeriumAST)adaptor.create(char_literal101);
            	            root_0 = (CeriumAST)adaptor.becomeRoot(char_literal101_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:155:32: '>'
            	            {
            	            char_literal102=(Token)match(input,56,FOLLOW_56_in_relationalExpression1137); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal102_tree = (CeriumAST)adaptor.create(char_literal102);
            	            root_0 = (CeriumAST)adaptor.becomeRoot(char_literal102_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:155:39: '<='
            	            {
            	            string_literal103=(Token)match(input,57,FOLLOW_57_in_relationalExpression1142); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal103_tree = (CeriumAST)adaptor.create(string_literal103);
            	            root_0 = (CeriumAST)adaptor.becomeRoot(string_literal103_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:155:47: '>='
            	            {
            	            string_literal104=(Token)match(input,58,FOLLOW_58_in_relationalExpression1147); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal104_tree = (CeriumAST)adaptor.create(string_literal104);
            	            root_0 = (CeriumAST)adaptor.becomeRoot(string_literal104_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_additiveExpression_in_relationalExpression1151);
            	    additiveExpression105=additiveExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, additiveExpression105.getTree());

            	    }
            	    break;

            	default :
            	    break loop28;
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
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:158:1: additiveExpression : multiplicativeExpression ( ( '+' | '-' ) multiplicativeExpression )* ;
    public final CeriumParser.additiveExpression_return additiveExpression() throws RecognitionException {
        CeriumParser.additiveExpression_return retval = new CeriumParser.additiveExpression_return();
        retval.start = input.LT(1);

        CeriumAST root_0 = null;

        Token char_literal107=null;
        Token char_literal108=null;
        CeriumParser.multiplicativeExpression_return multiplicativeExpression106 = null;

        CeriumParser.multiplicativeExpression_return multiplicativeExpression109 = null;


        CeriumAST char_literal107_tree=null;
        CeriumAST char_literal108_tree=null;

        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:159:2: ( multiplicativeExpression ( ( '+' | '-' ) multiplicativeExpression )* )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:160:3: multiplicativeExpression ( ( '+' | '-' ) multiplicativeExpression )*
            {
            root_0 = (CeriumAST)adaptor.nil();

            pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression1168);
            multiplicativeExpression106=multiplicativeExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicativeExpression106.getTree());
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:160:28: ( ( '+' | '-' ) multiplicativeExpression )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>=59 && LA30_0<=60)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:160:29: ( '+' | '-' ) multiplicativeExpression
            	    {
            	    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:160:29: ( '+' | '-' )
            	    int alt29=2;
            	    int LA29_0 = input.LA(1);

            	    if ( (LA29_0==59) ) {
            	        alt29=1;
            	    }
            	    else if ( (LA29_0==60) ) {
            	        alt29=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 29, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt29) {
            	        case 1 :
            	            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:160:30: '+'
            	            {
            	            char_literal107=(Token)match(input,59,FOLLOW_59_in_additiveExpression1172); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal107_tree = (CeriumAST)adaptor.create(char_literal107);
            	            root_0 = (CeriumAST)adaptor.becomeRoot(char_literal107_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:160:37: '-'
            	            {
            	            char_literal108=(Token)match(input,60,FOLLOW_60_in_additiveExpression1177); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal108_tree = (CeriumAST)adaptor.create(char_literal108);
            	            root_0 = (CeriumAST)adaptor.becomeRoot(char_literal108_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression1181);
            	    multiplicativeExpression109=multiplicativeExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicativeExpression109.getTree());

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
    // $ANTLR end "additiveExpression"

    public static class multiplicativeExpression_return extends ParserRuleReturnScope {
        CeriumAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "multiplicativeExpression"
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:163:1: multiplicativeExpression : unaryExpression ( ( '*' | '/' ) unaryExpression )* ;
    public final CeriumParser.multiplicativeExpression_return multiplicativeExpression() throws RecognitionException {
        CeriumParser.multiplicativeExpression_return retval = new CeriumParser.multiplicativeExpression_return();
        retval.start = input.LT(1);

        CeriumAST root_0 = null;

        Token char_literal111=null;
        Token char_literal112=null;
        CeriumParser.unaryExpression_return unaryExpression110 = null;

        CeriumParser.unaryExpression_return unaryExpression113 = null;


        CeriumAST char_literal111_tree=null;
        CeriumAST char_literal112_tree=null;

        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:164:2: ( unaryExpression ( ( '*' | '/' ) unaryExpression )* )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:165:3: unaryExpression ( ( '*' | '/' ) unaryExpression )*
            {
            root_0 = (CeriumAST)adaptor.nil();

            pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression1197);
            unaryExpression110=unaryExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression110.getTree());
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:165:19: ( ( '*' | '/' ) unaryExpression )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>=61 && LA32_0<=62)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:165:20: ( '*' | '/' ) unaryExpression
            	    {
            	    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:165:20: ( '*' | '/' )
            	    int alt31=2;
            	    int LA31_0 = input.LA(1);

            	    if ( (LA31_0==61) ) {
            	        alt31=1;
            	    }
            	    else if ( (LA31_0==62) ) {
            	        alt31=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 31, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt31) {
            	        case 1 :
            	            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:165:21: '*'
            	            {
            	            char_literal111=(Token)match(input,61,FOLLOW_61_in_multiplicativeExpression1201); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal111_tree = (CeriumAST)adaptor.create(char_literal111);
            	            root_0 = (CeriumAST)adaptor.becomeRoot(char_literal111_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:165:28: '/'
            	            {
            	            char_literal112=(Token)match(input,62,FOLLOW_62_in_multiplicativeExpression1206); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal112_tree = (CeriumAST)adaptor.create(char_literal112);
            	            root_0 = (CeriumAST)adaptor.becomeRoot(char_literal112_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression1210);
            	    unaryExpression113=unaryExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression113.getTree());

            	    }
            	    break;

            	default :
            	    break loop32;
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
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:168:1: unaryExpression : (op= '-' unaryExpression -> ^( UNARY_MINUS[$op] unaryExpression ) | op= '!' unaryExpression -> ^( UNARY_NOT[$op] unaryExpression ) | postfixExpression );
    public final CeriumParser.unaryExpression_return unaryExpression() throws RecognitionException {
        CeriumParser.unaryExpression_return retval = new CeriumParser.unaryExpression_return();
        retval.start = input.LT(1);

        CeriumAST root_0 = null;

        Token op=null;
        CeriumParser.unaryExpression_return unaryExpression114 = null;

        CeriumParser.unaryExpression_return unaryExpression115 = null;

        CeriumParser.postfixExpression_return postfixExpression116 = null;


        CeriumAST op_tree=null;
        RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
        RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
        RewriteRuleSubtreeStream stream_unaryExpression=new RewriteRuleSubtreeStream(adaptor,"rule unaryExpression");
        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:169:2: (op= '-' unaryExpression -> ^( UNARY_MINUS[$op] unaryExpression ) | op= '!' unaryExpression -> ^( UNARY_NOT[$op] unaryExpression ) | postfixExpression )
            int alt33=3;
            switch ( input.LA(1) ) {
            case 60:
                {
                alt33=1;
                }
                break;
            case 63:
                {
                alt33=2;
                }
                break;
            case ID:
            case INT:
            case FLOAT:
            case CHAR:
            case 35:
            case 66:
            case 67:
                {
                alt33=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:170:3: op= '-' unaryExpression
                    {
                    op=(Token)match(input,60,FOLLOW_60_in_unaryExpression1228); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_60.add(op);

                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression1230);
                    unaryExpression114=unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_unaryExpression.add(unaryExpression114.getTree());


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
                    // 170:26: -> ^( UNARY_MINUS[$op] unaryExpression )
                    {
                        // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:170:29: ^( UNARY_MINUS[$op] unaryExpression )
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
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:171:4: op= '!' unaryExpression
                    {
                    op=(Token)match(input,63,FOLLOW_63_in_unaryExpression1246); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_63.add(op);

                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression1248);
                    unaryExpression115=unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_unaryExpression.add(unaryExpression115.getTree());


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
                    // 171:27: -> ^( UNARY_NOT[$op] unaryExpression )
                    {
                        // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:171:30: ^( UNARY_NOT[$op] unaryExpression )
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
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:172:4: postfixExpression
                    {
                    root_0 = (CeriumAST)adaptor.nil();

                    pushFollow(FOLLOW_postfixExpression_in_unaryExpression1262);
                    postfixExpression116=postfixExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, postfixExpression116.getTree());

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
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:176:1: postfixExpression : primary ( (r= '(' expressionList ')' | r= '[' expr ']' | r= '.' ID ) )* ;
    public final CeriumParser.postfixExpression_return postfixExpression() throws RecognitionException {
        CeriumParser.postfixExpression_return retval = new CeriumParser.postfixExpression_return();
        retval.start = input.LT(1);

        CeriumAST root_0 = null;

        Token r=null;
        Token char_literal119=null;
        Token char_literal121=null;
        Token ID122=null;
        CeriumParser.primary_return primary117 = null;

        CeriumParser.expressionList_return expressionList118 = null;

        CeriumParser.expr_return expr120 = null;


        CeriumAST r_tree=null;
        CeriumAST char_literal119_tree=null;
        CeriumAST char_literal121_tree=null;
        CeriumAST ID122_tree=null;

        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:177:5: ( primary ( (r= '(' expressionList ')' | r= '[' expr ']' | r= '.' ID ) )* )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:177:9: primary ( (r= '(' expressionList ')' | r= '[' expr ']' | r= '.' ID ) )*
            {
            root_0 = (CeriumAST)adaptor.nil();

            pushFollow(FOLLOW_primary_in_postfixExpression1279);
            primary117=primary();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, primary117.getTree());
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:178:6: ( (r= '(' expressionList ')' | r= '[' expr ']' | r= '.' ID ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==26||LA35_0==35||LA35_0==64) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:179:7: (r= '(' expressionList ')' | r= '[' expr ']' | r= '.' ID )
            	    {
            	    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:179:7: (r= '(' expressionList ')' | r= '[' expr ']' | r= '.' ID )
            	    int alt34=3;
            	    switch ( input.LA(1) ) {
            	    case 35:
            	        {
            	        alt34=1;
            	        }
            	        break;
            	    case 64:
            	        {
            	        alt34=2;
            	        }
            	        break;
            	    case 26:
            	        {
            	        alt34=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 34, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt34) {
            	        case 1 :
            	            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:179:9: r= '(' expressionList ')'
            	            {
            	            r=(Token)match(input,35,FOLLOW_35_in_postfixExpression1298); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            r_tree = (CeriumAST)adaptor.create(r);
            	            root_0 = (CeriumAST)adaptor.becomeRoot(r_tree, root_0);
            	            }
            	            pushFollow(FOLLOW_expressionList_in_postfixExpression1301);
            	            expressionList118=expressionList();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionList118.getTree());
            	            char_literal119=(Token)match(input,36,FOLLOW_36_in_postfixExpression1303); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	              r.setType(CALL);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:180:9: r= '[' expr ']'
            	            {
            	            r=(Token)match(input,64,FOLLOW_64_in_postfixExpression1318); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            r_tree = (CeriumAST)adaptor.create(r);
            	            root_0 = (CeriumAST)adaptor.becomeRoot(r_tree, root_0);
            	            }
            	            pushFollow(FOLLOW_expr_in_postfixExpression1321);
            	            expr120=expr();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr120.getTree());
            	            char_literal121=(Token)match(input,65,FOLLOW_65_in_postfixExpression1323); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	              r.setType(INDEX);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:181:9: r= '.' ID
            	            {
            	            r=(Token)match(input,26,FOLLOW_26_in_postfixExpression1340); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            r_tree = (CeriumAST)adaptor.create(r);
            	            root_0 = (CeriumAST)adaptor.becomeRoot(r_tree, root_0);
            	            }
            	            ID122=(Token)match(input,ID,FOLLOW_ID_in_postfixExpression1343); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            ID122_tree = (CeriumAST)adaptor.create(ID122);
            	            adaptor.addChild(root_0, ID122_tree);
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop35;
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
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:187:1: primary : ( ID | INT | FLOAT | CHAR | 'true' | 'false' | '(' expr ')' -> expr );
    public final CeriumParser.primary_return primary() throws RecognitionException {
        CeriumParser.primary_return retval = new CeriumParser.primary_return();
        retval.start = input.LT(1);

        CeriumAST root_0 = null;

        Token ID123=null;
        Token INT124=null;
        Token FLOAT125=null;
        Token CHAR126=null;
        Token string_literal127=null;
        Token string_literal128=null;
        Token char_literal129=null;
        Token char_literal131=null;
        CeriumParser.expr_return expr130 = null;


        CeriumAST ID123_tree=null;
        CeriumAST INT124_tree=null;
        CeriumAST FLOAT125_tree=null;
        CeriumAST CHAR126_tree=null;
        CeriumAST string_literal127_tree=null;
        CeriumAST string_literal128_tree=null;
        CeriumAST char_literal129_tree=null;
        CeriumAST char_literal131_tree=null;
        RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
        RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:188:5: ( ID | INT | FLOAT | CHAR | 'true' | 'false' | '(' expr ')' -> expr )
            int alt36=7;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt36=1;
                }
                break;
            case INT:
                {
                alt36=2;
                }
                break;
            case FLOAT:
                {
                alt36=3;
                }
                break;
            case CHAR:
                {
                alt36=4;
                }
                break;
            case 66:
                {
                alt36=5;
                }
                break;
            case 67:
                {
                alt36=6;
                }
                break;
            case 35:
                {
                alt36=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:188:7: ID
                    {
                    root_0 = (CeriumAST)adaptor.nil();

                    ID123=(Token)match(input,ID,FOLLOW_ID_in_primary1377); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID123_tree = (CeriumAST)adaptor.create(ID123);
                    adaptor.addChild(root_0, ID123_tree);
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:189:9: INT
                    {
                    root_0 = (CeriumAST)adaptor.nil();

                    INT124=(Token)match(input,INT,FOLLOW_INT_in_primary1387); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INT124_tree = (CeriumAST)adaptor.create(INT124);
                    adaptor.addChild(root_0, INT124_tree);
                    }

                    }
                    break;
                case 3 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:190:7: FLOAT
                    {
                    root_0 = (CeriumAST)adaptor.nil();

                    FLOAT125=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_primary1395); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    FLOAT125_tree = (CeriumAST)adaptor.create(FLOAT125);
                    adaptor.addChild(root_0, FLOAT125_tree);
                    }

                    }
                    break;
                case 4 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:191:7: CHAR
                    {
                    root_0 = (CeriumAST)adaptor.nil();

                    CHAR126=(Token)match(input,CHAR,FOLLOW_CHAR_in_primary1403); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CHAR126_tree = (CeriumAST)adaptor.create(CHAR126);
                    adaptor.addChild(root_0, CHAR126_tree);
                    }

                    }
                    break;
                case 5 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:192:7: 'true'
                    {
                    root_0 = (CeriumAST)adaptor.nil();

                    string_literal127=(Token)match(input,66,FOLLOW_66_in_primary1411); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal127_tree = (CeriumAST)adaptor.create(string_literal127);
                    adaptor.addChild(root_0, string_literal127_tree);
                    }

                    }
                    break;
                case 6 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:193:7: 'false'
                    {
                    root_0 = (CeriumAST)adaptor.nil();

                    string_literal128=(Token)match(input,67,FOLLOW_67_in_primary1419); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal128_tree = (CeriumAST)adaptor.create(string_literal128);
                    adaptor.addChild(root_0, string_literal128_tree);
                    }

                    }
                    break;
                case 7 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:194:8: '(' expr ')'
                    {
                    char_literal129=(Token)match(input,35,FOLLOW_35_in_primary1428); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_35.add(char_literal129);

                    pushFollow(FOLLOW_expr_in_primary1430);
                    expr130=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr130.getTree());
                    char_literal131=(Token)match(input,36,FOLLOW_36_in_primary1432); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_36.add(char_literal131);



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
                    // 194:21: -> expr
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
        // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:116:7: ( varDeclaration )
        // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:116:7: varDeclaration
        {
        pushFollow(FOLLOW_varDeclaration_in_synpred2_Cerium770);
        varDeclaration();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_Cerium

    // $ANTLR start synpred7_Cerium
    public final void synpred7_Cerium_fragment() throws RecognitionException {   
        // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:124:7: ( lhs '=' expression ';' )
        // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:124:7: lhs '=' expression ';'
        {
        pushFollow(FOLLOW_lhs_in_synpred7_Cerium909);
        lhs();

        state._fsp--;
        if (state.failed) return ;
        match(input,ASSIGN,FOLLOW_ASSIGN_in_synpred7_Cerium911); if (state.failed) return ;
        pushFollow(FOLLOW_expression_in_synpred7_Cerium913);
        expression();

        state._fsp--;
        if (state.failed) return ;
        match(input,28,FOLLOW_28_in_synpred7_Cerium915); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred7_Cerium

    // $ANTLR start synpred8_Cerium
    public final void synpred8_Cerium_fragment() throws RecognitionException {   
        CeriumParser.postfixExpression_return a = null;


        // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:125:9: (a= postfixExpression ';' )
        // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:125:9: a= postfixExpression ';'
        {
        pushFollow(FOLLOW_postfixExpression_in_synpred8_Cerium937);
        a=postfixExpression();

        state._fsp--;
        if (state.failed) return ;
        match(input,28,FOLLOW_28_in_synpred8_Cerium939); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred8_Cerium

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
    public final boolean synpred8_Cerium() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_Cerium_fragment(); // can never throw exception
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


    protected DFA22 dfa22 = new DFA22(this);
    static final String DFA22_eotS =
        "\21\uffff";
    static final String DFA22_eofS =
        "\21\uffff";
    static final String DFA22_minS =
        "\1\22\2\uffff\1\0\4\uffff\6\0\3\uffff";
    static final String DFA22_maxS =
        "\1\103\2\uffff\1\0\4\uffff\6\0\3\uffff";
    static final String DFA22_acceptS =
        "\1\uffff\1\1\1\2\1\uffff\1\3\1\4\1\5\1\6\6\uffff\1\11\1\7\1\10";
    static final String DFA22_specialS =
        "\3\uffff\1\0\4\uffff\1\1\1\2\1\3\1\4\1\5\1\6\3\uffff}>";
    static final String[] DFA22_transitionS = {
            "\1\3\1\10\1\11\1\12\6\uffff\1\16\2\uffff\1\1\3\uffff\1\15\2"+
            "\uffff\2\2\7\uffff\1\4\1\uffff\1\5\1\6\1\uffff\1\7\15\uffff"+
            "\1\13\1\14",
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
            "",
            ""
    };

    static final short[] DFA22_eot = DFA.unpackEncodedString(DFA22_eotS);
    static final short[] DFA22_eof = DFA.unpackEncodedString(DFA22_eofS);
    static final char[] DFA22_min = DFA.unpackEncodedStringToUnsignedChars(DFA22_minS);
    static final char[] DFA22_max = DFA.unpackEncodedStringToUnsignedChars(DFA22_maxS);
    static final short[] DFA22_accept = DFA.unpackEncodedString(DFA22_acceptS);
    static final short[] DFA22_special = DFA.unpackEncodedString(DFA22_specialS);
    static final short[][] DFA22_transition;

    static {
        int numStates = DFA22_transitionS.length;
        DFA22_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA22_transition[i] = DFA.unpackEncodedString(DFA22_transitionS[i]);
        }
    }

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = DFA22_eot;
            this.eof = DFA22_eof;
            this.min = DFA22_min;
            this.max = DFA22_max;
            this.accept = DFA22_accept;
            this.special = DFA22_special;
            this.transition = DFA22_transition;
        }
        public String getDescription() {
            return "112:1: statement options {backtrack=true; } : ( block | varDeclaration | 'if' '(' expression ')' t= block ( 'else' f= block )? -> ^( 'if' expression $t ( $f)? ) | 'while' '(' expression ')' block -> ^( 'while' expression block ) | 'loop' expression 'times' block -> ^( 'loop' expression block ) | 'return' ( expression )? ';' -> ^( 'return' ( expression )? ) | lhs '=' expression ';' -> ^( '=' lhs expression ) | a= postfixExpression ';' -> ^( EXPR postfixExpression ) | ';' );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA22_3 = input.LA(1);

                         
                        int index22_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_Cerium()) ) {s = 2;}

                        else if ( (synpred7_Cerium()) ) {s = 15;}

                        else if ( (synpred8_Cerium()) ) {s = 16;}

                         
                        input.seek(index22_3);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA22_8 = input.LA(1);

                         
                        int index22_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_Cerium()) ) {s = 15;}

                        else if ( (synpred8_Cerium()) ) {s = 16;}

                         
                        input.seek(index22_8);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA22_9 = input.LA(1);

                         
                        int index22_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_Cerium()) ) {s = 15;}

                        else if ( (synpred8_Cerium()) ) {s = 16;}

                         
                        input.seek(index22_9);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA22_10 = input.LA(1);

                         
                        int index22_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_Cerium()) ) {s = 15;}

                        else if ( (synpred8_Cerium()) ) {s = 16;}

                         
                        input.seek(index22_10);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA22_11 = input.LA(1);

                         
                        int index22_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_Cerium()) ) {s = 15;}

                        else if ( (synpred8_Cerium()) ) {s = 16;}

                         
                        input.seek(index22_11);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA22_12 = input.LA(1);

                         
                        int index22_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_Cerium()) ) {s = 15;}

                        else if ( (synpred8_Cerium()) ) {s = 16;}

                         
                        input.seek(index22_12);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA22_13 = input.LA(1);

                         
                        int index22_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_Cerium()) ) {s = 15;}

                        else if ( (synpred8_Cerium()) ) {s = 16;}

                         
                        input.seek(index22_13);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 22, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_packageDefinition_in_compilationUnit151 = new BitSet(new long[]{0x0000000042000000L});
    public static final BitSet FOLLOW_importDefinition_in_compilationUnit159 = new BitSet(new long[]{0x0000000042000000L});
    public static final BitSet FOLLOW_classDefinition_in_compilationUnit168 = new BitSet(new long[]{0x0000000042000000L});
    public static final BitSet FOLLOW_EOF_in_compilationUnit172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_importDefinition192 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ID_in_importDefinition194 = new BitSet(new long[]{0x000000001C000000L});
    public static final BitSet FOLLOW_26_in_importDefinition197 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ID_in_importDefinition199 = new BitSet(new long[]{0x000000001C000000L});
    public static final BitSet FOLLOW_27_in_importDefinition203 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_importDefinition206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_packageDefinition223 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ID_in_packageDefinition225 = new BitSet(new long[]{0x0000000014000000L});
    public static final BitSet FOLLOW_26_in_packageDefinition228 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ID_in_packageDefinition230 = new BitSet(new long[]{0x0000000014000000L});
    public static final BitSet FOLLOW_28_in_packageDefinition234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_classDefinition257 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ID_in_classDefinition259 = new BitSet(new long[]{0x0000000280000000L});
    public static final BitSet FOLLOW_superClass_in_classDefinition261 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_classDefinition264 = new BitSet(new long[]{0x000000C500040000L});
    public static final BitSet FOLLOW_classMember_in_classDefinition266 = new BitSet(new long[]{0x000000C500040000L});
    public static final BitSet FOLLOW_32_in_classDefinition269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_superClass316 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ID_in_superClass318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDeclaration_in_classMember341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_methodDeclaration_in_classMember348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_accessModifier_in_methodDeclaration368 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_methodDeclaration371 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ID_in_methodDeclaration373 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_methodDeclaration375 = new BitSet(new long[]{0x0000001000040000L});
    public static final BitSet FOLLOW_formalParameters_in_methodDeclaration377 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_methodDeclaration380 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_methodDeclaration382 = new BitSet(new long[]{0x00007C0000040000L});
    public static final BitSet FOLLOW_type_in_methodDeclaration384 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_block_in_methodDeclaration386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_accessModifier0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parameter_in_formalParameters457 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_40_in_formalParameters460 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_parameter_in_formalParameters462 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_ID_in_parameter490 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_parameter492 = new BitSet(new long[]{0x00007C0000040000L});
    public static final BitSet FOLLOW_type_in_parameter494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_parameter509 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_parameter511 = new BitSet(new long[]{0x00007C0000040000L});
    public static final BitSet FOLLOW_type_in_parameter513 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_parameter515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_type0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_block616 = new BitSet(new long[]{0x001680C9903C0000L,0x000000000000000CL});
    public static final BitSet FOLLOW_statement_in_block618 = new BitSet(new long[]{0x001680C9903C0000L,0x000000000000000CL});
    public static final BitSet FOLLOW_32_in_block621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_accessModifier_in_varDeclaration654 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ID_in_varDeclaration657 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_varDeclaration659 = new BitSet(new long[]{0x00007C0000040000L});
    public static final BitSet FOLLOW_type_in_varDeclaration661 = new BitSet(new long[]{0x0000000010002000L});
    public static final BitSet FOLLOW_ASSIGN_in_varDeclaration664 = new BitSet(new long[]{0x90000008003C0000L,0x000000000000000CL});
    public static final BitSet FOLLOW_expression_in_varDeclaration666 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_varDeclaration670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_accessModifier_in_varDeclaration693 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ID_in_varDeclaration696 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_varDeclaration698 = new BitSet(new long[]{0x00007C0000040000L});
    public static final BitSet FOLLOW_type_in_varDeclaration700 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_varDeclaration702 = new BitSet(new long[]{0x0000000010002000L});
    public static final BitSet FOLLOW_ASSIGN_in_varDeclaration705 = new BitSet(new long[]{0x90000008003C0000L,0x000000000000000CL});
    public static final BitSet FOLLOW_expression_in_varDeclaration707 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_varDeclaration711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_statement762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDeclaration_in_statement770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_statement778 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_statement780 = new BitSet(new long[]{0x90000008003C0000L,0x000000000000000CL});
    public static final BitSet FOLLOW_expression_in_statement782 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_statement784 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_block_in_statement788 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_48_in_statement791 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_block_in_statement795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_statement825 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_statement827 = new BitSet(new long[]{0x90000008003C0000L,0x000000000000000CL});
    public static final BitSet FOLLOW_expression_in_statement829 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_statement831 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_block_in_statement833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_statement856 = new BitSet(new long[]{0x90000008003C0000L,0x000000000000000CL});
    public static final BitSet FOLLOW_expression_in_statement858 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_statement860 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_block_in_statement862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_statement887 = new BitSet(new long[]{0x90000008103C0000L,0x000000000000000CL});
    public static final BitSet FOLLOW_expression_in_statement889 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_statement892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lhs_in_statement909 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ASSIGN_in_statement911 = new BitSet(new long[]{0x90000008003C0000L,0x000000000000000CL});
    public static final BitSet FOLLOW_expression_in_statement913 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_statement915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postfixExpression_in_statement937 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_statement939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_statement958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postfixExpression_in_lhs973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expressionList1000 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_40_in_expressionList1003 = new BitSet(new long[]{0x90000008003C0000L,0x000000000000000CL});
    public static final BitSet FOLLOW_expr_in_expressionList1005 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_expr_in_expression1050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_equalityExpression_in_expr1076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression1098 = new BitSet(new long[]{0x0060000000000002L});
    public static final BitSet FOLLOW_53_in_equalityExpression1102 = new BitSet(new long[]{0x90000008003C0000L,0x000000000000000CL});
    public static final BitSet FOLLOW_54_in_equalityExpression1107 = new BitSet(new long[]{0x90000008003C0000L,0x000000000000000CL});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression1111 = new BitSet(new long[]{0x0060000000000002L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression1127 = new BitSet(new long[]{0x0780000000000002L});
    public static final BitSet FOLLOW_55_in_relationalExpression1132 = new BitSet(new long[]{0x90000008003C0000L,0x000000000000000CL});
    public static final BitSet FOLLOW_56_in_relationalExpression1137 = new BitSet(new long[]{0x90000008003C0000L,0x000000000000000CL});
    public static final BitSet FOLLOW_57_in_relationalExpression1142 = new BitSet(new long[]{0x90000008003C0000L,0x000000000000000CL});
    public static final BitSet FOLLOW_58_in_relationalExpression1147 = new BitSet(new long[]{0x90000008003C0000L,0x000000000000000CL});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression1151 = new BitSet(new long[]{0x0780000000000002L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression1168 = new BitSet(new long[]{0x1800000000000002L});
    public static final BitSet FOLLOW_59_in_additiveExpression1172 = new BitSet(new long[]{0x90000008003C0000L,0x000000000000000CL});
    public static final BitSet FOLLOW_60_in_additiveExpression1177 = new BitSet(new long[]{0x90000008003C0000L,0x000000000000000CL});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression1181 = new BitSet(new long[]{0x1800000000000002L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression1197 = new BitSet(new long[]{0x6000000000000002L});
    public static final BitSet FOLLOW_61_in_multiplicativeExpression1201 = new BitSet(new long[]{0x90000008003C0000L,0x000000000000000CL});
    public static final BitSet FOLLOW_62_in_multiplicativeExpression1206 = new BitSet(new long[]{0x90000008003C0000L,0x000000000000000CL});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression1210 = new BitSet(new long[]{0x6000000000000002L});
    public static final BitSet FOLLOW_60_in_unaryExpression1228 = new BitSet(new long[]{0x90000008003C0000L,0x000000000000000CL});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression1230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_unaryExpression1246 = new BitSet(new long[]{0x90000008003C0000L,0x000000000000000CL});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression1248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postfixExpression_in_unaryExpression1262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_in_postfixExpression1279 = new BitSet(new long[]{0x0000000804000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_35_in_postfixExpression1298 = new BitSet(new long[]{0x90000018003C0000L,0x000000000000000CL});
    public static final BitSet FOLLOW_expressionList_in_postfixExpression1301 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_postfixExpression1303 = new BitSet(new long[]{0x0000000804000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_postfixExpression1318 = new BitSet(new long[]{0x90000008003C0000L,0x000000000000000CL});
    public static final BitSet FOLLOW_expr_in_postfixExpression1321 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_postfixExpression1323 = new BitSet(new long[]{0x0000000804000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_26_in_postfixExpression1340 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ID_in_postfixExpression1343 = new BitSet(new long[]{0x0000000804000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_ID_in_primary1377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_primary1387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_primary1395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_primary1403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_primary1411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_primary1419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_primary1428 = new BitSet(new long[]{0x90000008003C0000L,0x000000000000000CL});
    public static final BitSet FOLLOW_expr_in_primary1430 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_primary1432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDeclaration_in_synpred2_Cerium770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lhs_in_synpred7_Cerium909 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ASSIGN_in_synpred7_Cerium911 = new BitSet(new long[]{0x90000008003C0000L,0x000000000000000CL});
    public static final BitSet FOLLOW_expression_in_synpred7_Cerium913 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_synpred7_Cerium915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postfixExpression_in_synpred8_Cerium937 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_synpred8_Cerium939 = new BitSet(new long[]{0x0000000000000002L});

}