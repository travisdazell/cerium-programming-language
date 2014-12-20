// $ANTLR 3.2 Sep 23, 2009 12:02:23 C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g 2014-12-20 12:24:34

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;

public class CeriumParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "METHOD_DECL", "ARG_DECL", "BLOCK", "MEMBERS", "VAR_DECL", "FIELD_DECL", "CALL", "ELIST", "EXPR", "ASSIGN", "EXTENDS", "ID", "INT", "LETTER", "WS", "SL_COMMENT", "'class'", "'{'", "'}'", "';'", "':'", "'public'", "'('", "')'", "','", "'float'", "'int'", "'void'", "'char'", "'return'", "'+'", "'.'", "'this'", "'super'"
    };
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int LETTER=17;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int ARG_DECL=5;
    public static final int T__20=20;
    public static final int FIELD_DECL=9;
    public static final int MEMBERS=7;
    public static final int VAR_DECL=8;
    public static final int METHOD_DECL=4;
    public static final int INT=16;
    public static final int ID=15;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int WS=18;
    public static final int EXPR=12;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int ELIST=11;
    public static final int BLOCK=6;
    public static final int SL_COMMENT=19;
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
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:23:1: compilationUnit : ( classDefinition | varDeclaration | methodDeclaration )+ EOF ;
    public final CeriumParser.compilationUnit_return compilationUnit() throws RecognitionException {
        CeriumParser.compilationUnit_return retval = new CeriumParser.compilationUnit_return();
        retval.start = input.LT(1);

        CeriumAST root_0 = null;

        Token EOF4=null;
        CeriumParser.classDefinition_return classDefinition1 = null;

        CeriumParser.varDeclaration_return varDeclaration2 = null;

        CeriumParser.methodDeclaration_return methodDeclaration3 = null;


        CeriumAST EOF4_tree=null;

        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:24:5: ( ( classDefinition | varDeclaration | methodDeclaration )+ EOF )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:25:6: ( classDefinition | varDeclaration | methodDeclaration )+ EOF
            {
            root_0 = (CeriumAST)adaptor.nil();

            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:25:6: ( classDefinition | varDeclaration | methodDeclaration )+
            int cnt1=0;
            loop1:
            do {
                int alt1=4;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==20) ) {
                    alt1=1;
                }
                else if ( (LA1_0==ID||(LA1_0>=29 && LA1_0<=32)) ) {
                    int LA1_3 = input.LA(2);

                    if ( (LA1_3==ID) ) {
                        int LA1_4 = input.LA(3);

                        if ( (LA1_4==26) ) {
                            alt1=3;
                        }
                        else if ( (LA1_4==ASSIGN||LA1_4==23) ) {
                            alt1=2;
                        }


                    }


                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:25:8: classDefinition
            	    {
            	    pushFollow(FOLLOW_classDefinition_in_compilationUnit140);
            	    classDefinition1=classDefinition();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, classDefinition1.getTree());

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:25:26: varDeclaration
            	    {
            	    pushFollow(FOLLOW_varDeclaration_in_compilationUnit144);
            	    varDeclaration2=varDeclaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclaration2.getTree());

            	    }
            	    break;
            	case 3 :
            	    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:25:43: methodDeclaration
            	    {
            	    pushFollow(FOLLOW_methodDeclaration_in_compilationUnit148);
            	    methodDeclaration3=methodDeclaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, methodDeclaration3.getTree());

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

            EOF4=(Token)match(input,EOF,FOLLOW_EOF_in_compilationUnit153); if (state.failed) return retval;
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

    public static class classDefinition_return extends ParserRuleReturnScope {
        CeriumAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "classDefinition"
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:29:1: classDefinition : 'class' ID ( superClass )? '{' ( classMember )+ '}' ';' -> ^( 'class' ID ( superClass )? ^( MEMBERS ( classMember )+ ) ) ;
    public final CeriumParser.classDefinition_return classDefinition() throws RecognitionException {
        CeriumParser.classDefinition_return retval = new CeriumParser.classDefinition_return();
        retval.start = input.LT(1);

        CeriumAST root_0 = null;

        Token string_literal5=null;
        Token ID6=null;
        Token char_literal8=null;
        Token char_literal10=null;
        Token char_literal11=null;
        CeriumParser.superClass_return superClass7 = null;

        CeriumParser.classMember_return classMember9 = null;


        CeriumAST string_literal5_tree=null;
        CeriumAST ID6_tree=null;
        CeriumAST char_literal8_tree=null;
        CeriumAST char_literal10_tree=null;
        CeriumAST char_literal11_tree=null;
        RewriteRuleTokenStream stream_21=new RewriteRuleTokenStream(adaptor,"token 21");
        RewriteRuleTokenStream stream_20=new RewriteRuleTokenStream(adaptor,"token 20");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_22=new RewriteRuleTokenStream(adaptor,"token 22");
        RewriteRuleTokenStream stream_23=new RewriteRuleTokenStream(adaptor,"token 23");
        RewriteRuleSubtreeStream stream_superClass=new RewriteRuleSubtreeStream(adaptor,"rule superClass");
        RewriteRuleSubtreeStream stream_classMember=new RewriteRuleSubtreeStream(adaptor,"rule classMember");
        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:30:5: ( 'class' ID ( superClass )? '{' ( classMember )+ '}' ';' -> ^( 'class' ID ( superClass )? ^( MEMBERS ( classMember )+ ) ) )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:31:6: 'class' ID ( superClass )? '{' ( classMember )+ '}' ';'
            {
            string_literal5=(Token)match(input,20,FOLLOW_20_in_classDefinition179); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_20.add(string_literal5);

            ID6=(Token)match(input,ID,FOLLOW_ID_in_classDefinition181); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID6);

            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:31:17: ( superClass )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==24) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:31:17: superClass
                    {
                    pushFollow(FOLLOW_superClass_in_classDefinition183);
                    superClass7=superClass();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_superClass.add(superClass7.getTree());

                    }
                    break;

            }

            char_literal8=(Token)match(input,21,FOLLOW_21_in_classDefinition186); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_21.add(char_literal8);

            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:31:33: ( classMember )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==ID||LA3_0==25||(LA3_0>=29 && LA3_0<=32)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:31:33: classMember
            	    {
            	    pushFollow(FOLLOW_classMember_in_classDefinition188);
            	    classMember9=classMember();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_classMember.add(classMember9.getTree());

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

            char_literal10=(Token)match(input,22,FOLLOW_22_in_classDefinition191); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_22.add(char_literal10);

            char_literal11=(Token)match(input,23,FOLLOW_23_in_classDefinition193); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_23.add(char_literal11);



            // AST REWRITE
            // elements: superClass, classMember, 20, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CeriumAST)adaptor.nil();
            // 32:9: -> ^( 'class' ID ( superClass )? ^( MEMBERS ( classMember )+ ) )
            {
                // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:32:12: ^( 'class' ID ( superClass )? ^( MEMBERS ( classMember )+ ) )
                {
                CeriumAST root_1 = (CeriumAST)adaptor.nil();
                root_1 = (CeriumAST)adaptor.becomeRoot(stream_20.nextNode(), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:32:25: ( superClass )?
                if ( stream_superClass.hasNext() ) {
                    adaptor.addChild(root_1, stream_superClass.nextTree());

                }
                stream_superClass.reset();
                // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:32:37: ^( MEMBERS ( classMember )+ )
                {
                CeriumAST root_2 = (CeriumAST)adaptor.nil();
                root_2 = (CeriumAST)adaptor.becomeRoot((CeriumAST)adaptor.create(MEMBERS, "MEMBERS"), root_2);

                if ( !(stream_classMember.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
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
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:35:1: superClass : ':' 'public' ID -> ^( EXTENDS ID ) ;
    public final CeriumParser.superClass_return superClass() throws RecognitionException {
        CeriumParser.superClass_return retval = new CeriumParser.superClass_return();
        retval.start = input.LT(1);

        CeriumAST root_0 = null;

        Token char_literal12=null;
        Token string_literal13=null;
        Token ID14=null;

        CeriumAST char_literal12_tree=null;
        CeriumAST string_literal13_tree=null;
        CeriumAST ID14_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_24=new RewriteRuleTokenStream(adaptor,"token 24");
        RewriteRuleTokenStream stream_25=new RewriteRuleTokenStream(adaptor,"token 25");

        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:36:2: ( ':' 'public' ID -> ^( EXTENDS ID ) )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:37:3: ':' 'public' ID
            {
            char_literal12=(Token)match(input,24,FOLLOW_24_in_superClass236); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_24.add(char_literal12);

            string_literal13=(Token)match(input,25,FOLLOW_25_in_superClass238); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_25.add(string_literal13);

            ID14=(Token)match(input,ID,FOLLOW_ID_in_superClass240); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID14);



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
            // 37:19: -> ^( EXTENDS ID )
            {
                // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:37:22: ^( EXTENDS ID )
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
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:41:1: classMember : ( type ID ( '=' expression )? ';' -> ^( FIELD_DECL type ID ( expression )? ) | methodDeclaration | 'public' ':' ->);
    public final CeriumParser.classMember_return classMember() throws RecognitionException {
        CeriumParser.classMember_return retval = new CeriumParser.classMember_return();
        retval.start = input.LT(1);

        CeriumAST root_0 = null;

        Token ID16=null;
        Token char_literal17=null;
        Token char_literal19=null;
        Token string_literal21=null;
        Token char_literal22=null;
        CeriumParser.type_return type15 = null;

        CeriumParser.expression_return expression18 = null;

        CeriumParser.methodDeclaration_return methodDeclaration20 = null;


        CeriumAST ID16_tree=null;
        CeriumAST char_literal17_tree=null;
        CeriumAST char_literal19_tree=null;
        CeriumAST string_literal21_tree=null;
        CeriumAST char_literal22_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_23=new RewriteRuleTokenStream(adaptor,"token 23");
        RewriteRuleTokenStream stream_24=new RewriteRuleTokenStream(adaptor,"token 24");
        RewriteRuleTokenStream stream_25=new RewriteRuleTokenStream(adaptor,"token 25");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:42:2: ( type ID ( '=' expression )? ';' -> ^( FIELD_DECL type ID ( expression )? ) | methodDeclaration | 'public' ':' ->)
            int alt5=3;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==ID||(LA5_0>=29 && LA5_0<=32)) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==ID) ) {
                    int LA5_3 = input.LA(3);

                    if ( (LA5_3==26) ) {
                        alt5=2;
                    }
                    else if ( (LA5_3==ASSIGN||LA5_3==23) ) {
                        alt5=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 3, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA5_0==25) ) {
                alt5=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:43:3: type ID ( '=' expression )? ';'
                    {
                    pushFollow(FOLLOW_type_in_classMember263);
                    type15=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type15.getTree());
                    ID16=(Token)match(input,ID,FOLLOW_ID_in_classMember265); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID16);

                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:43:11: ( '=' expression )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==ASSIGN) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:43:12: '=' expression
                            {
                            char_literal17=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_classMember268); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_ASSIGN.add(char_literal17);

                            pushFollow(FOLLOW_expression_in_classMember270);
                            expression18=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expression.add(expression18.getTree());

                            }
                            break;

                    }

                    char_literal19=(Token)match(input,23,FOLLOW_23_in_classMember274); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_23.add(char_literal19);



                    // AST REWRITE
                    // elements: expression, type, ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CeriumAST)adaptor.nil();
                    // 43:33: -> ^( FIELD_DECL type ID ( expression )? )
                    {
                        // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:43:36: ^( FIELD_DECL type ID ( expression )? )
                        {
                        CeriumAST root_1 = (CeriumAST)adaptor.nil();
                        root_1 = (CeriumAST)adaptor.becomeRoot((CeriumAST)adaptor.create(FIELD_DECL, "FIELD_DECL"), root_1);

                        adaptor.addChild(root_1, stream_type.nextTree());
                        adaptor.addChild(root_1, stream_ID.nextNode());
                        // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:43:57: ( expression )?
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
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:44:4: methodDeclaration
                    {
                    root_0 = (CeriumAST)adaptor.nil();

                    pushFollow(FOLLOW_methodDeclaration_in_classMember292);
                    methodDeclaration20=methodDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, methodDeclaration20.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:45:4: 'public' ':'
                    {
                    string_literal21=(Token)match(input,25,FOLLOW_25_in_classMember297); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_25.add(string_literal21);

                    char_literal22=(Token)match(input,24,FOLLOW_24_in_classMember299); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_24.add(char_literal22);



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
                    // 45:17: ->
                    {
                        root_0 = null;
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
    // $ANTLR end "classMember"

    public static class methodDeclaration_return extends ParserRuleReturnScope {
        CeriumAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "methodDeclaration"
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:49:1: methodDeclaration : type ID '(' ( formalParameters )? ')' block -> ^( METHOD_DECL type ID ( formalParameters )? block ) ;
    public final CeriumParser.methodDeclaration_return methodDeclaration() throws RecognitionException {
        CeriumParser.methodDeclaration_return retval = new CeriumParser.methodDeclaration_return();
        retval.start = input.LT(1);

        CeriumAST root_0 = null;

        Token ID24=null;
        Token char_literal25=null;
        Token char_literal27=null;
        CeriumParser.type_return type23 = null;

        CeriumParser.formalParameters_return formalParameters26 = null;

        CeriumParser.block_return block28 = null;


        CeriumAST ID24_tree=null;
        CeriumAST char_literal25_tree=null;
        CeriumAST char_literal27_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");
        RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");
        RewriteRuleSubtreeStream stream_formalParameters=new RewriteRuleSubtreeStream(adaptor,"rule formalParameters");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:50:5: ( type ID '(' ( formalParameters )? ')' block -> ^( METHOD_DECL type ID ( formalParameters )? block ) )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:51:6: type ID '(' ( formalParameters )? ')' block
            {
            pushFollow(FOLLOW_type_in_methodDeclaration326);
            type23=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type23.getTree());
            ID24=(Token)match(input,ID,FOLLOW_ID_in_methodDeclaration328); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID24);

            char_literal25=(Token)match(input,26,FOLLOW_26_in_methodDeclaration330); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_26.add(char_literal25);

            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:51:18: ( formalParameters )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==ID||(LA6_0>=29 && LA6_0<=32)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:51:18: formalParameters
                    {
                    pushFollow(FOLLOW_formalParameters_in_methodDeclaration332);
                    formalParameters26=formalParameters();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_formalParameters.add(formalParameters26.getTree());

                    }
                    break;

            }

            char_literal27=(Token)match(input,27,FOLLOW_27_in_methodDeclaration335); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_27.add(char_literal27);

            pushFollow(FOLLOW_block_in_methodDeclaration337);
            block28=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block28.getTree());


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
            // 52:9: -> ^( METHOD_DECL type ID ( formalParameters )? block )
            {
                // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:52:12: ^( METHOD_DECL type ID ( formalParameters )? block )
                {
                CeriumAST root_1 = (CeriumAST)adaptor.nil();
                root_1 = (CeriumAST)adaptor.becomeRoot((CeriumAST)adaptor.create(METHOD_DECL, "METHOD_DECL"), root_1);

                adaptor.addChild(root_1, stream_type.nextTree());
                adaptor.addChild(root_1, stream_ID.nextNode());
                // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:52:34: ( formalParameters )?
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

    public static class formalParameters_return extends ParserRuleReturnScope {
        CeriumAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "formalParameters"
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:56:1: formalParameters : type ID ( ',' type ID )* -> ( ^( ARG_DECL type ID ) )+ ;
    public final CeriumParser.formalParameters_return formalParameters() throws RecognitionException {
        CeriumParser.formalParameters_return retval = new CeriumParser.formalParameters_return();
        retval.start = input.LT(1);

        CeriumAST root_0 = null;

        Token ID30=null;
        Token char_literal31=null;
        Token ID33=null;
        CeriumParser.type_return type29 = null;

        CeriumParser.type_return type32 = null;


        CeriumAST ID30_tree=null;
        CeriumAST char_literal31_tree=null;
        CeriumAST ID33_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:57:5: ( type ID ( ',' type ID )* -> ( ^( ARG_DECL type ID ) )+ )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:58:6: type ID ( ',' type ID )*
            {
            pushFollow(FOLLOW_type_in_formalParameters386);
            type29=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type29.getTree());
            ID30=(Token)match(input,ID,FOLLOW_ID_in_formalParameters388); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID30);

            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:58:14: ( ',' type ID )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==28) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:58:15: ',' type ID
            	    {
            	    char_literal31=(Token)match(input,28,FOLLOW_28_in_formalParameters391); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_28.add(char_literal31);

            	    pushFollow(FOLLOW_type_in_formalParameters393);
            	    type32=type();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_type.add(type32.getTree());
            	    ID33=(Token)match(input,ID,FOLLOW_ID_in_formalParameters395); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_ID.add(ID33);


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);



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
            // 58:29: -> ( ^( ARG_DECL type ID ) )+
            {
                if ( !(stream_type.hasNext()||stream_ID.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_type.hasNext()||stream_ID.hasNext() ) {
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:58:32: ^( ARG_DECL type ID )
                    {
                    CeriumAST root_1 = (CeriumAST)adaptor.nil();
                    root_1 = (CeriumAST)adaptor.becomeRoot((CeriumAST)adaptor.create(ARG_DECL, "ARG_DECL"), root_1);

                    adaptor.addChild(root_1, stream_type.nextTree());
                    adaptor.addChild(root_1, stream_ID.nextNode());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_type.reset();
                stream_ID.reset();

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

    public static class type_return extends ParserRuleReturnScope {
        CeriumAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "type"
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:61:1: type : ( 'float' | 'int' | 'void' | 'char' | ID );
    public final CeriumParser.type_return type() throws RecognitionException {
        CeriumParser.type_return retval = new CeriumParser.type_return();
        retval.start = input.LT(1);

        CeriumAST root_0 = null;

        Token set34=null;

        CeriumAST set34_tree=null;

        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:61:5: ( 'float' | 'int' | 'void' | 'char' | ID )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:
            {
            root_0 = (CeriumAST)adaptor.nil();

            set34=(Token)input.LT(1);
            if ( input.LA(1)==ID||(input.LA(1)>=29 && input.LA(1)<=32) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CeriumAST)adaptor.create(set34));
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
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:70:1: block : '{' ( statement )* '}' -> ^( BLOCK ( statement )* ) ;
    public final CeriumParser.block_return block() throws RecognitionException {
        CeriumParser.block_return retval = new CeriumParser.block_return();
        retval.start = input.LT(1);

        CeriumAST root_0 = null;

        Token char_literal35=null;
        Token char_literal37=null;
        CeriumParser.statement_return statement36 = null;


        CeriumAST char_literal35_tree=null;
        CeriumAST char_literal37_tree=null;
        RewriteRuleTokenStream stream_21=new RewriteRuleTokenStream(adaptor,"token 21");
        RewriteRuleTokenStream stream_22=new RewriteRuleTokenStream(adaptor,"token 22");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:71:5: ( '{' ( statement )* '}' -> ^( BLOCK ( statement )* ) )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:72:6: '{' ( statement )* '}'
            {
            char_literal35=(Token)match(input,21,FOLLOW_21_in_block483); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_21.add(char_literal35);

            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:72:10: ( statement )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=ID && LA8_0<=INT)||LA8_0==21||LA8_0==23||LA8_0==26||(LA8_0>=29 && LA8_0<=33)||(LA8_0>=36 && LA8_0<=37)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:72:10: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_block485);
            	    statement36=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_statement.add(statement36.getTree());

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            char_literal37=(Token)match(input,22,FOLLOW_22_in_block488); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_22.add(char_literal37);



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
            // 72:25: -> ^( BLOCK ( statement )* )
            {
                // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:72:28: ^( BLOCK ( statement )* )
                {
                CeriumAST root_1 = (CeriumAST)adaptor.nil();
                root_1 = (CeriumAST)adaptor.becomeRoot((CeriumAST)adaptor.create(BLOCK, "BLOCK"), root_1);

                // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:72:36: ( statement )*
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
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:77:1: varDeclaration : type ID ( '=' expression )? ';' -> ^( VAR_DECL type ID ( expression )? ) ;
    public final CeriumParser.varDeclaration_return varDeclaration() throws RecognitionException {
        CeriumParser.varDeclaration_return retval = new CeriumParser.varDeclaration_return();
        retval.start = input.LT(1);

        CeriumAST root_0 = null;

        Token ID39=null;
        Token char_literal40=null;
        Token char_literal42=null;
        CeriumParser.type_return type38 = null;

        CeriumParser.expression_return expression41 = null;


        CeriumAST ID39_tree=null;
        CeriumAST char_literal40_tree=null;
        CeriumAST char_literal42_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_23=new RewriteRuleTokenStream(adaptor,"token 23");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:78:5: ( type ID ( '=' expression )? ';' -> ^( VAR_DECL type ID ( expression )? ) )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:79:6: type ID ( '=' expression )? ';'
            {
            pushFollow(FOLLOW_type_in_varDeclaration521);
            type38=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type38.getTree());
            ID39=(Token)match(input,ID,FOLLOW_ID_in_varDeclaration523); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID39);

            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:79:14: ( '=' expression )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==ASSIGN) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:79:15: '=' expression
                    {
                    char_literal40=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_varDeclaration526); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(char_literal40);

                    pushFollow(FOLLOW_expression_in_varDeclaration528);
                    expression41=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression41.getTree());

                    }
                    break;

            }

            char_literal42=(Token)match(input,23,FOLLOW_23_in_varDeclaration532); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_23.add(char_literal42);



            // AST REWRITE
            // elements: ID, expression, type
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CeriumAST)adaptor.nil();
            // 79:36: -> ^( VAR_DECL type ID ( expression )? )
            {
                // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:79:39: ^( VAR_DECL type ID ( expression )? )
                {
                CeriumAST root_1 = (CeriumAST)adaptor.nil();
                root_1 = (CeriumAST)adaptor.becomeRoot((CeriumAST)adaptor.create(VAR_DECL, "VAR_DECL"), root_1);

                adaptor.addChild(root_1, stream_type.nextTree());
                adaptor.addChild(root_1, stream_ID.nextNode());
                // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:79:58: ( expression )?
                if ( stream_expression.hasNext() ) {
                    adaptor.addChild(root_1, stream_expression.nextTree());

                }
                stream_expression.reset();

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
    // $ANTLR end "varDeclaration"

    public static class statement_return extends ParserRuleReturnScope {
        CeriumAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statement"
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:83:1: statement : ( block | varDeclaration | 'return' ( expression )? ';' -> ^( 'return' ( expression )? ) | postfixExpression ( '=' expression -> ^( '=' postfixExpression expression ) | -> ^( EXPR postfixExpression ) ) ';' | ';' ->);
    public final CeriumParser.statement_return statement() throws RecognitionException {
        CeriumParser.statement_return retval = new CeriumParser.statement_return();
        retval.start = input.LT(1);

        CeriumAST root_0 = null;

        Token string_literal45=null;
        Token char_literal47=null;
        Token char_literal49=null;
        Token char_literal51=null;
        Token char_literal52=null;
        CeriumParser.block_return block43 = null;

        CeriumParser.varDeclaration_return varDeclaration44 = null;

        CeriumParser.expression_return expression46 = null;

        CeriumParser.postfixExpression_return postfixExpression48 = null;

        CeriumParser.expression_return expression50 = null;


        CeriumAST string_literal45_tree=null;
        CeriumAST char_literal47_tree=null;
        CeriumAST char_literal49_tree=null;
        CeriumAST char_literal51_tree=null;
        CeriumAST char_literal52_tree=null;
        RewriteRuleTokenStream stream_23=new RewriteRuleTokenStream(adaptor,"token 23");
        RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_postfixExpression=new RewriteRuleSubtreeStream(adaptor,"rule postfixExpression");
        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:84:5: ( block | varDeclaration | 'return' ( expression )? ';' -> ^( 'return' ( expression )? ) | postfixExpression ( '=' expression -> ^( '=' postfixExpression expression ) | -> ^( EXPR postfixExpression ) ) ';' | ';' ->)
            int alt12=5;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt12=1;
                }
                break;
            case ID:
                {
                int LA12_2 = input.LA(2);

                if ( (LA12_2==ID) ) {
                    alt12=2;
                }
                else if ( (LA12_2==ASSIGN||LA12_2==23||LA12_2==26||LA12_2==35) ) {
                    alt12=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 2, input);

                    throw nvae;
                }
                }
                break;
            case 33:
                {
                alt12=3;
                }
                break;
            case INT:
            case 26:
            case 36:
            case 37:
                {
                alt12=4;
                }
                break;
            case 29:
            case 30:
            case 31:
            case 32:
                {
                alt12=2;
                }
                break;
            case 23:
                {
                alt12=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:85:6: block
                    {
                    root_0 = (CeriumAST)adaptor.nil();

                    pushFollow(FOLLOW_block_in_statement571);
                    block43=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, block43.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:86:7: varDeclaration
                    {
                    root_0 = (CeriumAST)adaptor.nil();

                    pushFollow(FOLLOW_varDeclaration_in_statement579);
                    varDeclaration44=varDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclaration44.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:87:9: 'return' ( expression )? ';'
                    {
                    string_literal45=(Token)match(input,33,FOLLOW_33_in_statement589); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_33.add(string_literal45);

                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:87:18: ( expression )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( ((LA10_0>=ID && LA10_0<=INT)||LA10_0==26||(LA10_0>=36 && LA10_0<=37)) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:87:18: expression
                            {
                            pushFollow(FOLLOW_expression_in_statement591);
                            expression46=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expression.add(expression46.getTree());

                            }
                            break;

                    }

                    char_literal47=(Token)match(input,23,FOLLOW_23_in_statement594); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_23.add(char_literal47);



                    // AST REWRITE
                    // elements: 33, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CeriumAST)adaptor.nil();
                    // 87:34: -> ^( 'return' ( expression )? )
                    {
                        // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:87:37: ^( 'return' ( expression )? )
                        {
                        CeriumAST root_1 = (CeriumAST)adaptor.nil();
                        root_1 = (CeriumAST)adaptor.becomeRoot(stream_33.nextNode(), root_1);

                        // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:87:48: ( expression )?
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
                case 4 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:88:9: postfixExpression ( '=' expression -> ^( '=' postfixExpression expression ) | -> ^( EXPR postfixExpression ) ) ';'
                    {
                    pushFollow(FOLLOW_postfixExpression_in_statement613);
                    postfixExpression48=postfixExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_postfixExpression.add(postfixExpression48.getTree());
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:89:9: ( '=' expression -> ^( '=' postfixExpression expression ) | -> ^( EXPR postfixExpression ) )
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==ASSIGN) ) {
                        alt11=1;
                    }
                    else if ( (LA11_0==23) ) {
                        alt11=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 0, input);

                        throw nvae;
                    }
                    switch (alt11) {
                        case 1 :
                            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:89:13: '=' expression
                            {
                            char_literal49=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_statement628); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_ASSIGN.add(char_literal49);

                            pushFollow(FOLLOW_expression_in_statement630);
                            expression50=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expression.add(expression50.getTree());


                            // AST REWRITE
                            // elements: expression, ASSIGN, postfixExpression
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (CeriumAST)adaptor.nil();
                            // 89:28: -> ^( '=' postfixExpression expression )
                            {
                                // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:89:31: ^( '=' postfixExpression expression )
                                {
                                CeriumAST root_1 = (CeriumAST)adaptor.nil();
                                root_1 = (CeriumAST)adaptor.becomeRoot(stream_ASSIGN.nextNode(), root_1);

                                adaptor.addChild(root_1, stream_postfixExpression.nextTree());
                                adaptor.addChild(root_1, stream_expression.nextTree());

                                adaptor.addChild(root_0, root_1);
                                }

                            }

                            retval.tree = root_0;}
                            }
                            break;
                        case 2 :
                            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:90:13: 
                            {

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
                            // 90:13: -> ^( EXPR postfixExpression )
                            {
                                // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:90:16: ^( EXPR postfixExpression )
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

                    char_literal51=(Token)match(input,23,FOLLOW_23_in_statement680); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_23.add(char_literal51);


                    }
                    break;
                case 5 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:93:7: ';'
                    {
                    char_literal52=(Token)match(input,23,FOLLOW_23_in_statement689); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_23.add(char_literal52);



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
                    // 93:11: ->
                    {
                        root_0 = null;
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

    public static class expressionList_return extends ParserRuleReturnScope {
        CeriumAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expressionList"
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:96:1: expressionList : ( expression ( ',' expression )* -> ^( ELIST ( expression )+ ) | -> ELIST );
    public final CeriumParser.expressionList_return expressionList() throws RecognitionException {
        CeriumParser.expressionList_return retval = new CeriumParser.expressionList_return();
        retval.start = input.LT(1);

        CeriumAST root_0 = null;

        Token char_literal54=null;
        CeriumParser.expression_return expression53 = null;

        CeriumParser.expression_return expression55 = null;


        CeriumAST char_literal54_tree=null;
        RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:97:5: ( expression ( ',' expression )* -> ^( ELIST ( expression )+ ) | -> ELIST )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=ID && LA14_0<=INT)||LA14_0==26||(LA14_0>=36 && LA14_0<=37)) ) {
                alt14=1;
            }
            else if ( (LA14_0==27) ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:98:6: expression ( ',' expression )*
                    {
                    pushFollow(FOLLOW_expression_in_expressionList714);
                    expression53=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression53.getTree());
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:98:17: ( ',' expression )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==28) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:98:18: ',' expression
                    	    {
                    	    char_literal54=(Token)match(input,28,FOLLOW_28_in_expressionList717); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_28.add(char_literal54);

                    	    pushFollow(FOLLOW_expression_in_expressionList719);
                    	    expression55=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expression.add(expression55.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);



                    // AST REWRITE
                    // elements: expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CeriumAST)adaptor.nil();
                    // 98:35: -> ^( ELIST ( expression )+ )
                    {
                        // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:98:38: ^( ELIST ( expression )+ )
                        {
                        CeriumAST root_1 = (CeriumAST)adaptor.nil();
                        root_1 = (CeriumAST)adaptor.becomeRoot((CeriumAST)adaptor.create(ELIST, "ELIST"), root_1);

                        if ( !(stream_expression.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_expression.hasNext() ) {
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
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:99:9: 
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
                    // 99:9: -> ELIST
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
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:102:1: expression : addExpression -> ^( EXPR addExpression ) ;
    public final CeriumParser.expression_return expression() throws RecognitionException {
        CeriumParser.expression_return retval = new CeriumParser.expression_return();
        retval.start = input.LT(1);

        CeriumAST root_0 = null;

        CeriumParser.addExpression_return addExpression56 = null;


        RewriteRuleSubtreeStream stream_addExpression=new RewriteRuleSubtreeStream(adaptor,"rule addExpression");
        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:103:5: ( addExpression -> ^( EXPR addExpression ) )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:104:6: addExpression
            {
            pushFollow(FOLLOW_addExpression_in_expression767);
            addExpression56=addExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_addExpression.add(addExpression56.getTree());


            // AST REWRITE
            // elements: addExpression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CeriumAST)adaptor.nil();
            // 104:20: -> ^( EXPR addExpression )
            {
                // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:104:23: ^( EXPR addExpression )
                {
                CeriumAST root_1 = (CeriumAST)adaptor.nil();
                root_1 = (CeriumAST)adaptor.becomeRoot((CeriumAST)adaptor.create(EXPR, "EXPR"), root_1);

                adaptor.addChild(root_1, stream_addExpression.nextTree());

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

    public static class addExpression_return extends ParserRuleReturnScope {
        CeriumAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "addExpression"
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:107:1: addExpression : postfixExpression ( '+' postfixExpression )* ;
    public final CeriumParser.addExpression_return addExpression() throws RecognitionException {
        CeriumParser.addExpression_return retval = new CeriumParser.addExpression_return();
        retval.start = input.LT(1);

        CeriumAST root_0 = null;

        Token char_literal58=null;
        CeriumParser.postfixExpression_return postfixExpression57 = null;

        CeriumParser.postfixExpression_return postfixExpression59 = null;


        CeriumAST char_literal58_tree=null;

        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:108:2: ( postfixExpression ( '+' postfixExpression )* )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:109:3: postfixExpression ( '+' postfixExpression )*
            {
            root_0 = (CeriumAST)adaptor.nil();

            pushFollow(FOLLOW_postfixExpression_in_addExpression796);
            postfixExpression57=postfixExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, postfixExpression57.getTree());
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:109:21: ( '+' postfixExpression )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==34) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:109:22: '+' postfixExpression
            	    {
            	    char_literal58=(Token)match(input,34,FOLLOW_34_in_addExpression799); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal58_tree = (CeriumAST)adaptor.create(char_literal58);
            	    root_0 = (CeriumAST)adaptor.becomeRoot(char_literal58_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_postfixExpression_in_addExpression802);
            	    postfixExpression59=postfixExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, postfixExpression59.getTree());

            	    }
            	    break;

            	default :
            	    break loop15;
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
    // $ANTLR end "addExpression"

    public static class postfixExpression_return extends ParserRuleReturnScope {
        CeriumAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "postfixExpression"
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:113:1: postfixExpression : ( primary -> primary ) ( options {backtrack=true; } : '.' ID '(' expressionList ')' -> ^( CALL ^( '.' $postfixExpression ID ) ) | '.' ID -> ^( '.' $postfixExpression ID ) | '(' expressionList ')' -> ^( CALL $postfixExpression) )* ;
    public final CeriumParser.postfixExpression_return postfixExpression() throws RecognitionException {
        CeriumParser.postfixExpression_return retval = new CeriumParser.postfixExpression_return();
        retval.start = input.LT(1);

        CeriumAST root_0 = null;

        Token char_literal61=null;
        Token ID62=null;
        Token char_literal63=null;
        Token char_literal65=null;
        Token char_literal66=null;
        Token ID67=null;
        Token char_literal68=null;
        Token char_literal70=null;
        CeriumParser.primary_return primary60 = null;

        CeriumParser.expressionList_return expressionList64 = null;

        CeriumParser.expressionList_return expressionList69 = null;


        CeriumAST char_literal61_tree=null;
        CeriumAST ID62_tree=null;
        CeriumAST char_literal63_tree=null;
        CeriumAST char_literal65_tree=null;
        CeriumAST char_literal66_tree=null;
        CeriumAST ID67_tree=null;
        CeriumAST char_literal68_tree=null;
        CeriumAST char_literal70_tree=null;
        RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");
        RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");
        RewriteRuleSubtreeStream stream_expressionList=new RewriteRuleSubtreeStream(adaptor,"rule expressionList");
        RewriteRuleSubtreeStream stream_primary=new RewriteRuleSubtreeStream(adaptor,"rule primary");
        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:114:5: ( ( primary -> primary ) ( options {backtrack=true; } : '.' ID '(' expressionList ')' -> ^( CALL ^( '.' $postfixExpression ID ) ) | '.' ID -> ^( '.' $postfixExpression ID ) | '(' expressionList ')' -> ^( CALL $postfixExpression) )* )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:115:6: ( primary -> primary ) ( options {backtrack=true; } : '.' ID '(' expressionList ')' -> ^( CALL ^( '.' $postfixExpression ID ) ) | '.' ID -> ^( '.' $postfixExpression ID ) | '(' expressionList ')' -> ^( CALL $postfixExpression) )*
            {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:115:6: ( primary -> primary )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:115:7: primary
            {
            pushFollow(FOLLOW_primary_in_postfixExpression828);
            primary60=primary();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_primary.add(primary60.getTree());


            // AST REWRITE
            // elements: primary
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CeriumAST)adaptor.nil();
            // 115:14: -> primary
            {
                adaptor.addChild(root_0, stream_primary.nextTree());

            }

            retval.tree = root_0;}
            }

            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:116:6: ( options {backtrack=true; } : '.' ID '(' expressionList ')' -> ^( CALL ^( '.' $postfixExpression ID ) ) | '.' ID -> ^( '.' $postfixExpression ID ) | '(' expressionList ')' -> ^( CALL $postfixExpression) )*
            loop16:
            do {
                int alt16=4;
                alt16 = dfa16.predict(input);
                switch (alt16) {
            	case 1 :
            	    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:117:5: '.' ID '(' expressionList ')'
            	    {
            	    char_literal61=(Token)match(input,35,FOLLOW_35_in_postfixExpression851); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_35.add(char_literal61);

            	    ID62=(Token)match(input,ID,FOLLOW_ID_in_postfixExpression853); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_ID.add(ID62);

            	    char_literal63=(Token)match(input,26,FOLLOW_26_in_postfixExpression855); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_26.add(char_literal63);

            	    pushFollow(FOLLOW_expressionList_in_postfixExpression857);
            	    expressionList64=expressionList();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_expressionList.add(expressionList64.getTree());
            	    char_literal65=(Token)match(input,27,FOLLOW_27_in_postfixExpression859); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_27.add(char_literal65);



            	    // AST REWRITE
            	    // elements: ID, 35, postfixExpression
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (CeriumAST)adaptor.nil();
            	    // 117:35: -> ^( CALL ^( '.' $postfixExpression ID ) )
            	    {
            	        // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:117:38: ^( CALL ^( '.' $postfixExpression ID ) )
            	        {
            	        CeriumAST root_1 = (CeriumAST)adaptor.nil();
            	        root_1 = (CeriumAST)adaptor.becomeRoot((CeriumAST)adaptor.create(CALL, "CALL"), root_1);

            	        // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:117:45: ^( '.' $postfixExpression ID )
            	        {
            	        CeriumAST root_2 = (CeriumAST)adaptor.nil();
            	        root_2 = (CeriumAST)adaptor.becomeRoot(stream_35.nextNode(), root_2);

            	        adaptor.addChild(root_2, stream_retval.nextTree());
            	        adaptor.addChild(root_2, stream_ID.nextNode());

            	        adaptor.addChild(root_1, root_2);
            	        }

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;}
            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:118:5: '.' ID
            	    {
            	    char_literal66=(Token)match(input,35,FOLLOW_35_in_postfixExpression880); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_35.add(char_literal66);

            	    ID67=(Token)match(input,ID,FOLLOW_ID_in_postfixExpression882); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_ID.add(ID67);



            	    // AST REWRITE
            	    // elements: 35, ID, postfixExpression
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (CeriumAST)adaptor.nil();
            	    // 118:19: -> ^( '.' $postfixExpression ID )
            	    {
            	        // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:118:22: ^( '.' $postfixExpression ID )
            	        {
            	        CeriumAST root_1 = (CeriumAST)adaptor.nil();
            	        root_1 = (CeriumAST)adaptor.becomeRoot(stream_35.nextNode(), root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());
            	        adaptor.addChild(root_1, stream_ID.nextNode());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;}
            	    }
            	    break;
            	case 3 :
            	    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:119:5: '(' expressionList ')'
            	    {
            	    char_literal68=(Token)match(input,26,FOLLOW_26_in_postfixExpression906); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_26.add(char_literal68);

            	    pushFollow(FOLLOW_expressionList_in_postfixExpression908);
            	    expressionList69=expressionList();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_expressionList.add(expressionList69.getTree());
            	    char_literal70=(Token)match(input,27,FOLLOW_27_in_postfixExpression910); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_27.add(char_literal70);



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
            	    // 119:35: -> ^( CALL $postfixExpression)
            	    {
            	        // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:119:38: ^( CALL $postfixExpression)
            	        {
            	        CeriumAST root_1 = (CeriumAST)adaptor.nil();
            	        root_1 = (CeriumAST)adaptor.becomeRoot((CeriumAST)adaptor.create(CALL, "CALL"), root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;}
            	    }
            	    break;

            	default :
            	    break loop16;
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

    public static class suffix_return extends ParserRuleReturnScope {
        CeriumAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "suffix"
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:124:1: suffix[CommonTree expr] options {backtrack=true; } : ( '.' ID '(' expressionList ')' -> ^( CALL ^( '.' ID ) ) | '.' ID -> ^( '.' ID ) | '(' expressionList ')' -> ^( CALL ) );
    public final CeriumParser.suffix_return suffix(CommonTree expr) throws RecognitionException {
        CeriumParser.suffix_return retval = new CeriumParser.suffix_return();
        retval.start = input.LT(1);

        CeriumAST root_0 = null;

        Token char_literal71=null;
        Token ID72=null;
        Token char_literal73=null;
        Token char_literal75=null;
        Token char_literal76=null;
        Token ID77=null;
        Token char_literal78=null;
        Token char_literal80=null;
        CeriumParser.expressionList_return expressionList74 = null;

        CeriumParser.expressionList_return expressionList79 = null;


        CeriumAST char_literal71_tree=null;
        CeriumAST ID72_tree=null;
        CeriumAST char_literal73_tree=null;
        CeriumAST char_literal75_tree=null;
        CeriumAST char_literal76_tree=null;
        CeriumAST ID77_tree=null;
        CeriumAST char_literal78_tree=null;
        CeriumAST char_literal80_tree=null;
        RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");
        RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");
        RewriteRuleSubtreeStream stream_expressionList=new RewriteRuleSubtreeStream(adaptor,"rule expressionList");
        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:126:2: ( '.' ID '(' expressionList ')' -> ^( CALL ^( '.' ID ) ) | '.' ID -> ^( '.' ID ) | '(' expressionList ')' -> ^( CALL ) )
            int alt17=3;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==35) ) {
                int LA17_1 = input.LA(2);

                if ( (LA17_1==ID) ) {
                    int LA17_3 = input.LA(3);

                    if ( (LA17_3==26) ) {
                        alt17=1;
                    }
                    else if ( (LA17_3==EOF) ) {
                        alt17=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 17, 3, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA17_0==26) ) {
                alt17=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:126:4: '.' ID '(' expressionList ')'
                    {
                    char_literal71=(Token)match(input,35,FOLLOW_35_in_suffix954); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_35.add(char_literal71);

                    ID72=(Token)match(input,ID,FOLLOW_ID_in_suffix956); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID72);

                    char_literal73=(Token)match(input,26,FOLLOW_26_in_suffix958); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_26.add(char_literal73);

                    pushFollow(FOLLOW_expressionList_in_suffix960);
                    expressionList74=expressionList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expressionList.add(expressionList74.getTree());
                    char_literal75=(Token)match(input,27,FOLLOW_27_in_suffix962); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_27.add(char_literal75);



                    // AST REWRITE
                    // elements: 35, ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CeriumAST)adaptor.nil();
                    // 126:34: -> ^( CALL ^( '.' ID ) )
                    {
                        // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:126:37: ^( CALL ^( '.' ID ) )
                        {
                        CeriumAST root_1 = (CeriumAST)adaptor.nil();
                        root_1 = (CeriumAST)adaptor.becomeRoot((CeriumAST)adaptor.create(CALL, "CALL"), root_1);

                        // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:126:44: ^( '.' ID )
                        {
                        CeriumAST root_2 = (CeriumAST)adaptor.nil();
                        root_2 = (CeriumAST)adaptor.becomeRoot(stream_35.nextNode(), root_2);

                        adaptor.addChild(root_2, expr);
                        adaptor.addChild(root_2, stream_ID.nextNode());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:127:4: '.' ID
                    {
                    char_literal76=(Token)match(input,35,FOLLOW_35_in_suffix981); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_35.add(char_literal76);

                    ID77=(Token)match(input,ID,FOLLOW_ID_in_suffix983); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID77);



                    // AST REWRITE
                    // elements: ID, 35
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CeriumAST)adaptor.nil();
                    // 127:18: -> ^( '.' ID )
                    {
                        // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:127:21: ^( '.' ID )
                        {
                        CeriumAST root_1 = (CeriumAST)adaptor.nil();
                        root_1 = (CeriumAST)adaptor.becomeRoot(stream_35.nextNode(), root_1);

                        adaptor.addChild(root_1, expr);
                        adaptor.addChild(root_1, stream_ID.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:128:4: '(' expressionList ')'
                    {
                    char_literal78=(Token)match(input,26,FOLLOW_26_in_suffix1005); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_26.add(char_literal78);

                    pushFollow(FOLLOW_expressionList_in_suffix1007);
                    expressionList79=expressionList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expressionList.add(expressionList79.getTree());
                    char_literal80=(Token)match(input,27,FOLLOW_27_in_suffix1009); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_27.add(char_literal80);



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
                    // 128:34: -> ^( CALL )
                    {
                        // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:128:37: ^( CALL )
                        {
                        CeriumAST root_1 = (CeriumAST)adaptor.nil();
                        root_1 = (CeriumAST)adaptor.becomeRoot((CeriumAST)adaptor.create(CALL, "CALL"), root_1);

                        adaptor.addChild(root_1, expr);

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
    // $ANTLR end "suffix"

    public static class primary_return extends ParserRuleReturnScope {
        CeriumAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "primary"
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:131:1: primary : ( 'this' | 'super' | ID | INT | '(' expression ')' -> expression );
    public final CeriumParser.primary_return primary() throws RecognitionException {
        CeriumParser.primary_return retval = new CeriumParser.primary_return();
        retval.start = input.LT(1);

        CeriumAST root_0 = null;

        Token string_literal81=null;
        Token string_literal82=null;
        Token ID83=null;
        Token INT84=null;
        Token char_literal85=null;
        Token char_literal87=null;
        CeriumParser.expression_return expression86 = null;


        CeriumAST string_literal81_tree=null;
        CeriumAST string_literal82_tree=null;
        CeriumAST ID83_tree=null;
        CeriumAST INT84_tree=null;
        CeriumAST char_literal85_tree=null;
        CeriumAST char_literal87_tree=null;
        RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");
        RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:132:5: ( 'this' | 'super' | ID | INT | '(' expression ')' -> expression )
            int alt18=5;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt18=1;
                }
                break;
            case 37:
                {
                alt18=2;
                }
                break;
            case ID:
                {
                alt18=3;
                }
                break;
            case INT:
                {
                alt18=4;
                }
                break;
            case 26:
                {
                alt18=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:133:6: 'this'
                    {
                    root_0 = (CeriumAST)adaptor.nil();

                    string_literal81=(Token)match(input,36,FOLLOW_36_in_primary1047); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal81_tree = (CeriumAST)adaptor.create(string_literal81);
                    adaptor.addChild(root_0, string_literal81_tree);
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:134:7: 'super'
                    {
                    root_0 = (CeriumAST)adaptor.nil();

                    string_literal82=(Token)match(input,37,FOLLOW_37_in_primary1055); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal82_tree = (CeriumAST)adaptor.create(string_literal82);
                    adaptor.addChild(root_0, string_literal82_tree);
                    }

                    }
                    break;
                case 3 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:135:7: ID
                    {
                    root_0 = (CeriumAST)adaptor.nil();

                    ID83=(Token)match(input,ID,FOLLOW_ID_in_primary1063); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID83_tree = (CeriumAST)adaptor.create(ID83);
                    adaptor.addChild(root_0, ID83_tree);
                    }

                    }
                    break;
                case 4 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:136:9: INT
                    {
                    root_0 = (CeriumAST)adaptor.nil();

                    INT84=(Token)match(input,INT,FOLLOW_INT_in_primary1073); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INT84_tree = (CeriumAST)adaptor.create(INT84);
                    adaptor.addChild(root_0, INT84_tree);
                    }

                    }
                    break;
                case 5 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:137:9: '(' expression ')'
                    {
                    char_literal85=(Token)match(input,26,FOLLOW_26_in_primary1083); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_26.add(char_literal85);

                    pushFollow(FOLLOW_expression_in_primary1085);
                    expression86=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression86.getTree());
                    char_literal87=(Token)match(input,27,FOLLOW_27_in_primary1087); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_27.add(char_literal87);



                    // AST REWRITE
                    // elements: expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CeriumAST)adaptor.nil();
                    // 137:28: -> expression
                    {
                        adaptor.addChild(root_0, stream_expression.nextTree());

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

    // $ANTLR start synpred1_Cerium
    public final void synpred1_Cerium_fragment() throws RecognitionException {   
        // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:117:5: ( '.' ID '(' expressionList ')' )
        // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:117:5: '.' ID '(' expressionList ')'
        {
        match(input,35,FOLLOW_35_in_synpred1_Cerium851); if (state.failed) return ;
        match(input,ID,FOLLOW_ID_in_synpred1_Cerium853); if (state.failed) return ;
        match(input,26,FOLLOW_26_in_synpred1_Cerium855); if (state.failed) return ;
        pushFollow(FOLLOW_expressionList_in_synpred1_Cerium857);
        expressionList();

        state._fsp--;
        if (state.failed) return ;
        match(input,27,FOLLOW_27_in_synpred1_Cerium859); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_Cerium

    // $ANTLR start synpred2_Cerium
    public final void synpred2_Cerium_fragment() throws RecognitionException {   
        // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:118:5: ( '.' ID )
        // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:118:5: '.' ID
        {
        match(input,35,FOLLOW_35_in_synpred2_Cerium880); if (state.failed) return ;
        match(input,ID,FOLLOW_ID_in_synpred2_Cerium882); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_Cerium

    // Delegated rules

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
    public final boolean synpred1_Cerium() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_Cerium_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA16 dfa16 = new DFA16(this);
    static final String DFA16_eotS =
        "\12\uffff";
    static final String DFA16_eofS =
        "\12\uffff";
    static final String DFA16_minS =
        "\1\15\5\uffff\1\0\3\uffff";
    static final String DFA16_maxS =
        "\1\43\5\uffff\1\0\3\uffff";
    static final String DFA16_acceptS =
        "\1\uffff\1\4\5\uffff\1\3\1\1\1\2";
    static final String DFA16_specialS =
        "\6\uffff\1\0\3\uffff}>";
    static final String[] DFA16_transitionS = {
            "\1\1\11\uffff\1\1\2\uffff\1\7\2\1\5\uffff\1\1\1\6",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            ""
    };

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "()* loopback of 116:6: ( options {backtrack=true; } : '.' ID '(' expressionList ')' -> ^( CALL ^( '.' $postfixExpression ID ) ) | '.' ID -> ^( '.' $postfixExpression ID ) | '(' expressionList ')' -> ^( CALL $postfixExpression) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA16_6 = input.LA(1);

                         
                        int index16_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Cerium()) ) {s = 8;}

                        else if ( (synpred2_Cerium()) ) {s = 9;}

                         
                        input.seek(index16_6);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 16, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_classDefinition_in_compilationUnit140 = new BitSet(new long[]{0x00000001E0108000L});
    public static final BitSet FOLLOW_varDeclaration_in_compilationUnit144 = new BitSet(new long[]{0x00000001E0108000L});
    public static final BitSet FOLLOW_methodDeclaration_in_compilationUnit148 = new BitSet(new long[]{0x00000001E0108000L});
    public static final BitSet FOLLOW_EOF_in_compilationUnit153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_classDefinition179 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ID_in_classDefinition181 = new BitSet(new long[]{0x0000000001200000L});
    public static final BitSet FOLLOW_superClass_in_classDefinition183 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_classDefinition186 = new BitSet(new long[]{0x00000001E2108000L});
    public static final BitSet FOLLOW_classMember_in_classDefinition188 = new BitSet(new long[]{0x00000001E2508000L});
    public static final BitSet FOLLOW_22_in_classDefinition191 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_classDefinition193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_superClass236 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_superClass238 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ID_in_superClass240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_classMember263 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ID_in_classMember265 = new BitSet(new long[]{0x0000000000802000L});
    public static final BitSet FOLLOW_ASSIGN_in_classMember268 = new BitSet(new long[]{0x0000003004018000L});
    public static final BitSet FOLLOW_expression_in_classMember270 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_classMember274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_methodDeclaration_in_classMember292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_classMember297 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_classMember299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_methodDeclaration326 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ID_in_methodDeclaration328 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_methodDeclaration330 = new BitSet(new long[]{0x00000001E8008000L});
    public static final BitSet FOLLOW_formalParameters_in_methodDeclaration332 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_methodDeclaration335 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_block_in_methodDeclaration337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_formalParameters386 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ID_in_formalParameters388 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_formalParameters391 = new BitSet(new long[]{0x00000001E0008000L});
    public static final BitSet FOLLOW_type_in_formalParameters393 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ID_in_formalParameters395 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_set_in_type0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_block483 = new BitSet(new long[]{0x00000033E4E18000L});
    public static final BitSet FOLLOW_statement_in_block485 = new BitSet(new long[]{0x00000033E4E18000L});
    public static final BitSet FOLLOW_22_in_block488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_varDeclaration521 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ID_in_varDeclaration523 = new BitSet(new long[]{0x0000000000802000L});
    public static final BitSet FOLLOW_ASSIGN_in_varDeclaration526 = new BitSet(new long[]{0x0000003004018000L});
    public static final BitSet FOLLOW_expression_in_varDeclaration528 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_varDeclaration532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_statement571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDeclaration_in_statement579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_statement589 = new BitSet(new long[]{0x0000003004818000L});
    public static final BitSet FOLLOW_expression_in_statement591 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_statement594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postfixExpression_in_statement613 = new BitSet(new long[]{0x0000000000802000L});
    public static final BitSet FOLLOW_ASSIGN_in_statement628 = new BitSet(new long[]{0x0000003004018000L});
    public static final BitSet FOLLOW_expression_in_statement630 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_statement680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_statement689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expressionList714 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_expressionList717 = new BitSet(new long[]{0x0000003004018000L});
    public static final BitSet FOLLOW_expression_in_expressionList719 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_addExpression_in_expression767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postfixExpression_in_addExpression796 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_34_in_addExpression799 = new BitSet(new long[]{0x0000003004018000L});
    public static final BitSet FOLLOW_postfixExpression_in_addExpression802 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_primary_in_postfixExpression828 = new BitSet(new long[]{0x0000000804000002L});
    public static final BitSet FOLLOW_35_in_postfixExpression851 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ID_in_postfixExpression853 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_postfixExpression855 = new BitSet(new long[]{0x000000300C018000L});
    public static final BitSet FOLLOW_expressionList_in_postfixExpression857 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_postfixExpression859 = new BitSet(new long[]{0x0000000804000002L});
    public static final BitSet FOLLOW_35_in_postfixExpression880 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ID_in_postfixExpression882 = new BitSet(new long[]{0x0000000804000002L});
    public static final BitSet FOLLOW_26_in_postfixExpression906 = new BitSet(new long[]{0x000000300C018000L});
    public static final BitSet FOLLOW_expressionList_in_postfixExpression908 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_postfixExpression910 = new BitSet(new long[]{0x0000000804000002L});
    public static final BitSet FOLLOW_35_in_suffix954 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ID_in_suffix956 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_suffix958 = new BitSet(new long[]{0x000000300C018000L});
    public static final BitSet FOLLOW_expressionList_in_suffix960 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_suffix962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_suffix981 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ID_in_suffix983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_suffix1005 = new BitSet(new long[]{0x000000300C018000L});
    public static final BitSet FOLLOW_expressionList_in_suffix1007 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_suffix1009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_primary1047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_primary1055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_primary1063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_primary1073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_primary1083 = new BitSet(new long[]{0x0000003004018000L});
    public static final BitSet FOLLOW_expression_in_primary1085 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_primary1087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_synpred1_Cerium851 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ID_in_synpred1_Cerium853 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_synpred1_Cerium855 = new BitSet(new long[]{0x000000300C018000L});
    public static final BitSet FOLLOW_expressionList_in_synpred1_Cerium857 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_synpred1_Cerium859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_synpred2_Cerium880 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ID_in_synpred2_Cerium882 = new BitSet(new long[]{0x0000000000000002L});

}