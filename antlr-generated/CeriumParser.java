// $ANTLR 3.2 Sep 23, 2009 12:02:23 C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g 2015-02-08 19:23:12

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;

public class CeriumParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "METHOD_DECL", "ARG_DECL", "BLOCK", "MEMBERS", "VAR_DECL", "FIELD_DECL", "CALL", "ELIST", "EXPR", "ASSIGN", "EXTENDS", "UNARY_MINUS", "UNARY_NOT", "INDEX", "ID", "INT", "FLOAT", "CHAR", "LETTER", "WS", "SL_COMMENT", "'class'", "'{'", "'}'", "';'", "':'", "'public'", "'('", "')'", "','", "'[]'", "'float'", "'int'", "'void'", "'char'", "'boolean'", "'if'", "'else'", "'while'", "'return'", "'!='", "'=='", "'<'", "'>'", "'<='", "'>='", "'+'", "'-'", "'*'", "'/'", "'!'", "'['", "']'", "'.'", "'true'", "'false'"
    };
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int LETTER=22;
    public static final int ARG_DECL=5;
    public static final int CHAR=21;
    public static final int METHOD_DECL=4;
    public static final int VAR_DECL=8;
    public static final int FLOAT=20;
    public static final int ID=18;
    public static final int EOF=-1;
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
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:33:1: classDefinition : 'class' ID ( superClass )? '{' ( classMember )+ '}' ';' -> ^( 'class' ID ( superClass )? ^( MEMBERS ( classMember )+ ) ) ;
    public final CeriumParser.classDefinition_return classDefinition() throws RecognitionException {
        CeriumParser.classDefinition_return retval = new CeriumParser.classDefinition_return();
        retval.start = input.LT(1);

        CeriumAST root_0 = null;

        Token string_literal3=null;
        Token ID4=null;
        Token char_literal6=null;
        Token char_literal8=null;
        Token char_literal9=null;
        CeriumParser.superClass_return superClass5 = null;

        CeriumParser.classMember_return classMember7 = null;


        CeriumAST string_literal3_tree=null;
        CeriumAST ID4_tree=null;
        CeriumAST char_literal6_tree=null;
        CeriumAST char_literal8_tree=null;
        CeriumAST char_literal9_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_25=new RewriteRuleTokenStream(adaptor,"token 25");
        RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");
        RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");
        RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");
        RewriteRuleSubtreeStream stream_superClass=new RewriteRuleSubtreeStream(adaptor,"rule superClass");
        RewriteRuleSubtreeStream stream_classMember=new RewriteRuleSubtreeStream(adaptor,"rule classMember");
        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:34:5: ( 'class' ID ( superClass )? '{' ( classMember )+ '}' ';' -> ^( 'class' ID ( superClass )? ^( MEMBERS ( classMember )+ ) ) )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:35:6: 'class' ID ( superClass )? '{' ( classMember )+ '}' ';'
            {
            string_literal3=(Token)match(input,25,FOLLOW_25_in_classDefinition182); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_25.add(string_literal3);

            ID4=(Token)match(input,ID,FOLLOW_ID_in_classDefinition184); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID4);

            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:35:17: ( superClass )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==29) ) {
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

            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:35:33: ( classMember )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==ID||(LA3_0>=35 && LA3_0<=39)) ) {
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
            	    if ( cnt3 >= 1 ) break loop3;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            char_literal8=(Token)match(input,27,FOLLOW_27_in_classDefinition194); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_27.add(char_literal8);

            char_literal9=(Token)match(input,28,FOLLOW_28_in_classDefinition196); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_28.add(char_literal9);



            // AST REWRITE
            // elements: 25, superClass, classMember, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CeriumAST)adaptor.nil();
            // 36:9: -> ^( 'class' ID ( superClass )? ^( MEMBERS ( classMember )+ ) )
            {
                // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:36:12: ^( 'class' ID ( superClass )? ^( MEMBERS ( classMember )+ ) )
                {
                CeriumAST root_1 = (CeriumAST)adaptor.nil();
                root_1 = (CeriumAST)adaptor.becomeRoot(stream_25.nextNode(), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:36:25: ( superClass )?
                if ( stream_superClass.hasNext() ) {
                    adaptor.addChild(root_1, stream_superClass.nextTree());

                }
                stream_superClass.reset();
                // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:36:37: ^( MEMBERS ( classMember )+ )
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
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:39:1: superClass : ':' 'public' ID -> ^( EXTENDS ID ) ;
    public final CeriumParser.superClass_return superClass() throws RecognitionException {
        CeriumParser.superClass_return retval = new CeriumParser.superClass_return();
        retval.start = input.LT(1);

        CeriumAST root_0 = null;

        Token char_literal10=null;
        Token string_literal11=null;
        Token ID12=null;

        CeriumAST char_literal10_tree=null;
        CeriumAST string_literal11_tree=null;
        CeriumAST ID12_tree=null;
        RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");

        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:40:2: ( ':' 'public' ID -> ^( EXTENDS ID ) )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:41:3: ':' 'public' ID
            {
            char_literal10=(Token)match(input,29,FOLLOW_29_in_superClass243); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_29.add(char_literal10);

            string_literal11=(Token)match(input,30,FOLLOW_30_in_superClass245); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_30.add(string_literal11);

            ID12=(Token)match(input,ID,FOLLOW_ID_in_superClass247); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID12);



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
            // 41:19: -> ^( EXTENDS ID )
            {
                // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:41:22: ^( EXTENDS ID )
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

        CeriumParser.varDeclaration_return varDeclaration13 = null;

        CeriumParser.methodDeclaration_return methodDeclaration14 = null;



        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:47:2: ( varDeclaration | methodDeclaration )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==ID||(LA4_0>=35 && LA4_0<=39)) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==ID) ) {
                    int LA4_2 = input.LA(3);

                    if ( (LA4_2==ASSIGN||LA4_2==28||LA4_2==34) ) {
                        alt4=1;
                    }
                    else if ( (LA4_2==31) ) {
                        alt4=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else {
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

                    pushFollow(FOLLOW_varDeclaration_in_classMember271);
                    varDeclaration13=varDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclaration13.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:49:4: methodDeclaration
                    {
                    root_0 = (CeriumAST)adaptor.nil();

                    pushFollow(FOLLOW_methodDeclaration_in_classMember276);
                    methodDeclaration14=methodDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, methodDeclaration14.getTree());

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
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:53:1: methodDeclaration : type ID '(' ( formalParameters )? ')' block -> ^( METHOD_DECL type ID ( formalParameters )? block ) ;
    public final CeriumParser.methodDeclaration_return methodDeclaration() throws RecognitionException {
        CeriumParser.methodDeclaration_return retval = new CeriumParser.methodDeclaration_return();
        retval.start = input.LT(1);

        CeriumAST root_0 = null;

        Token ID16=null;
        Token char_literal17=null;
        Token char_literal19=null;
        CeriumParser.type_return type15 = null;

        CeriumParser.formalParameters_return formalParameters18 = null;

        CeriumParser.block_return block20 = null;


        CeriumAST ID16_tree=null;
        CeriumAST char_literal17_tree=null;
        CeriumAST char_literal19_tree=null;
        RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
        RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_formalParameters=new RewriteRuleSubtreeStream(adaptor,"rule formalParameters");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:54:5: ( type ID '(' ( formalParameters )? ')' block -> ^( METHOD_DECL type ID ( formalParameters )? block ) )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:55:6: type ID '(' ( formalParameters )? ')' block
            {
            pushFollow(FOLLOW_type_in_methodDeclaration300);
            type15=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type15.getTree());
            ID16=(Token)match(input,ID,FOLLOW_ID_in_methodDeclaration302); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID16);

            char_literal17=(Token)match(input,31,FOLLOW_31_in_methodDeclaration304); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_31.add(char_literal17);

            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:55:18: ( formalParameters )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==ID||(LA5_0>=35 && LA5_0<=39)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:55:18: formalParameters
                    {
                    pushFollow(FOLLOW_formalParameters_in_methodDeclaration306);
                    formalParameters18=formalParameters();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_formalParameters.add(formalParameters18.getTree());

                    }
                    break;

            }

            char_literal19=(Token)match(input,32,FOLLOW_32_in_methodDeclaration309); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_32.add(char_literal19);

            pushFollow(FOLLOW_block_in_methodDeclaration311);
            block20=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block20.getTree());


            // AST REWRITE
            // elements: block, formalParameters, type, ID
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

    public static class formalParameters_return extends ParserRuleReturnScope {
        CeriumAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "formalParameters"
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:60:1: formalParameters : parameter ( ',' parameter )* -> ( parameter )+ ;
    public final CeriumParser.formalParameters_return formalParameters() throws RecognitionException {
        CeriumParser.formalParameters_return retval = new CeriumParser.formalParameters_return();
        retval.start = input.LT(1);

        CeriumAST root_0 = null;

        Token char_literal22=null;
        CeriumParser.parameter_return parameter21 = null;

        CeriumParser.parameter_return parameter23 = null;


        CeriumAST char_literal22_tree=null;
        RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
        RewriteRuleSubtreeStream stream_parameter=new RewriteRuleSubtreeStream(adaptor,"rule parameter");
        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:61:5: ( parameter ( ',' parameter )* -> ( parameter )+ )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:62:6: parameter ( ',' parameter )*
            {
            pushFollow(FOLLOW_parameter_in_formalParameters360);
            parameter21=parameter();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_parameter.add(parameter21.getTree());
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:62:16: ( ',' parameter )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==33) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:62:17: ',' parameter
            	    {
            	    char_literal22=(Token)match(input,33,FOLLOW_33_in_formalParameters363); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_33.add(char_literal22);

            	    pushFollow(FOLLOW_parameter_in_formalParameters365);
            	    parameter23=parameter();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_parameter.add(parameter23.getTree());

            	    }
            	    break;

            	default :
            	    break loop6;
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
            // 62:33: -> ( parameter )+
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
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:65:1: parameter : ( type ID -> ^( ARG_DECL type ID ) | type ID '[]' -> ^( ARG_DECL ^( '[]' type ) ID ) );
    public final CeriumParser.parameter_return parameter() throws RecognitionException {
        CeriumParser.parameter_return retval = new CeriumParser.parameter_return();
        retval.start = input.LT(1);

        CeriumAST root_0 = null;

        Token ID25=null;
        Token ID27=null;
        Token string_literal28=null;
        CeriumParser.type_return type24 = null;

        CeriumParser.type_return type26 = null;


        CeriumAST ID25_tree=null;
        CeriumAST ID27_tree=null;
        CeriumAST string_literal28_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:66:2: ( type ID -> ^( ARG_DECL type ID ) | type ID '[]' -> ^( ARG_DECL ^( '[]' type ) ID ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==ID||(LA7_0>=35 && LA7_0<=39)) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==ID) ) {
                    int LA7_2 = input.LA(3);

                    if ( (LA7_2==34) ) {
                        alt7=2;
                    }
                    else if ( ((LA7_2>=32 && LA7_2<=33)) ) {
                        alt7=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:67:3: type ID
                    {
                    pushFollow(FOLLOW_type_in_parameter393);
                    type24=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type24.getTree());
                    ID25=(Token)match(input,ID,FOLLOW_ID_in_parameter395); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID25);



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
                    // 67:13: -> ^( ARG_DECL type ID )
                    {
                        // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:67:16: ^( ARG_DECL type ID )
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
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:68:4: type ID '[]'
                    {
                    pushFollow(FOLLOW_type_in_parameter412);
                    type26=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type26.getTree());
                    ID27=(Token)match(input,ID,FOLLOW_ID_in_parameter414); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID27);

                    string_literal28=(Token)match(input,34,FOLLOW_34_in_parameter416); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_34.add(string_literal28);



                    // AST REWRITE
                    // elements: type, 34, ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CeriumAST)adaptor.nil();
                    // 68:17: -> ^( ARG_DECL ^( '[]' type ) ID )
                    {
                        // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:68:20: ^( ARG_DECL ^( '[]' type ) ID )
                        {
                        CeriumAST root_1 = (CeriumAST)adaptor.nil();
                        root_1 = (CeriumAST)adaptor.becomeRoot((CeriumAST)adaptor.create(ARG_DECL, "ARG_DECL"), root_1);

                        // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:68:31: ^( '[]' type )
                        {
                        CeriumAST root_2 = (CeriumAST)adaptor.nil();
                        root_2 = (CeriumAST)adaptor.becomeRoot(stream_34.nextNode(), root_2);

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
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:72:1: type : ( 'float' | 'int' | 'void' | 'char' | 'boolean' | ID );
    public final CeriumParser.type_return type() throws RecognitionException {
        CeriumParser.type_return retval = new CeriumParser.type_return();
        retval.start = input.LT(1);

        CeriumAST root_0 = null;

        Token set29=null;

        CeriumAST set29_tree=null;

        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:72:5: ( 'float' | 'int' | 'void' | 'char' | 'boolean' | ID )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:
            {
            root_0 = (CeriumAST)adaptor.nil();

            set29=(Token)input.LT(1);
            if ( input.LA(1)==ID||(input.LA(1)>=35 && input.LA(1)<=39) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CeriumAST)adaptor.create(set29));
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
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:82:1: block : '{' ( statement )* '}' -> ^( BLOCK ( statement )* ) ;
    public final CeriumParser.block_return block() throws RecognitionException {
        CeriumParser.block_return retval = new CeriumParser.block_return();
        retval.start = input.LT(1);

        CeriumAST root_0 = null;

        Token char_literal30=null;
        Token char_literal32=null;
        CeriumParser.statement_return statement31 = null;


        CeriumAST char_literal30_tree=null;
        CeriumAST char_literal32_tree=null;
        RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");
        RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:83:5: ( '{' ( statement )* '}' -> ^( BLOCK ( statement )* ) )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:84:6: '{' ( statement )* '}'
            {
            char_literal30=(Token)match(input,26,FOLLOW_26_in_block517); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_26.add(char_literal30);

            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:84:10: ( statement )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=ID && LA8_0<=CHAR)||LA8_0==26||LA8_0==28||LA8_0==31||(LA8_0>=35 && LA8_0<=40)||(LA8_0>=42 && LA8_0<=43)||(LA8_0>=58 && LA8_0<=59)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:84:10: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_block519);
            	    statement31=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_statement.add(statement31.getTree());

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            char_literal32=(Token)match(input,27,FOLLOW_27_in_block522); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_27.add(char_literal32);



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
            // 84:25: -> ^( BLOCK ( statement )* )
            {
                // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:84:28: ^( BLOCK ( statement )* )
                {
                CeriumAST root_1 = (CeriumAST)adaptor.nil();
                root_1 = (CeriumAST)adaptor.becomeRoot((CeriumAST)adaptor.create(BLOCK, "BLOCK"), root_1);

                // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:84:36: ( statement )*
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
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:89:1: varDeclaration : ( type ID ( '=' expression )? ';' -> ^( VAR_DECL type ID ( expression )? ) | type ID '[]' ( '=' expression )? ';' -> ^( VAR_DECL ^( '[]' type ) ID ( expression )? ) );
    public final CeriumParser.varDeclaration_return varDeclaration() throws RecognitionException {
        CeriumParser.varDeclaration_return retval = new CeriumParser.varDeclaration_return();
        retval.start = input.LT(1);

        CeriumAST root_0 = null;

        Token ID34=null;
        Token char_literal35=null;
        Token char_literal37=null;
        Token ID39=null;
        Token string_literal40=null;
        Token char_literal41=null;
        Token char_literal43=null;
        CeriumParser.type_return type33 = null;

        CeriumParser.expression_return expression36 = null;

        CeriumParser.type_return type38 = null;

        CeriumParser.expression_return expression42 = null;


        CeriumAST ID34_tree=null;
        CeriumAST char_literal35_tree=null;
        CeriumAST char_literal37_tree=null;
        CeriumAST ID39_tree=null;
        CeriumAST string_literal40_tree=null;
        CeriumAST char_literal41_tree=null;
        CeriumAST char_literal43_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
        RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:90:5: ( type ID ( '=' expression )? ';' -> ^( VAR_DECL type ID ( expression )? ) | type ID '[]' ( '=' expression )? ';' -> ^( VAR_DECL ^( '[]' type ) ID ( expression )? ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==ID||(LA11_0>=35 && LA11_0<=39)) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==ID) ) {
                    int LA11_2 = input.LA(3);

                    if ( (LA11_2==34) ) {
                        alt11=2;
                    }
                    else if ( (LA11_2==ASSIGN||LA11_2==28) ) {
                        alt11=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:91:6: type ID ( '=' expression )? ';'
                    {
                    pushFollow(FOLLOW_type_in_varDeclaration555);
                    type33=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type33.getTree());
                    ID34=(Token)match(input,ID,FOLLOW_ID_in_varDeclaration557); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID34);

                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:91:14: ( '=' expression )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==ASSIGN) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:91:15: '=' expression
                            {
                            char_literal35=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_varDeclaration560); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_ASSIGN.add(char_literal35);

                            pushFollow(FOLLOW_expression_in_varDeclaration562);
                            expression36=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expression.add(expression36.getTree());

                            }
                            break;

                    }

                    char_literal37=(Token)match(input,28,FOLLOW_28_in_varDeclaration566); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_28.add(char_literal37);



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
                    // 91:36: -> ^( VAR_DECL type ID ( expression )? )
                    {
                        // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:91:39: ^( VAR_DECL type ID ( expression )? )
                        {
                        CeriumAST root_1 = (CeriumAST)adaptor.nil();
                        root_1 = (CeriumAST)adaptor.becomeRoot((CeriumAST)adaptor.create(VAR_DECL, "VAR_DECL"), root_1);

                        adaptor.addChild(root_1, stream_type.nextTree());
                        adaptor.addChild(root_1, stream_ID.nextNode());
                        // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:91:58: ( expression )?
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
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:92:7: type ID '[]' ( '=' expression )? ';'
                    {
                    pushFollow(FOLLOW_type_in_varDeclaration589);
                    type38=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type38.getTree());
                    ID39=(Token)match(input,ID,FOLLOW_ID_in_varDeclaration591); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID39);

                    string_literal40=(Token)match(input,34,FOLLOW_34_in_varDeclaration593); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_34.add(string_literal40);

                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:92:20: ( '=' expression )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==ASSIGN) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:92:21: '=' expression
                            {
                            char_literal41=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_varDeclaration596); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_ASSIGN.add(char_literal41);

                            pushFollow(FOLLOW_expression_in_varDeclaration598);
                            expression42=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expression.add(expression42.getTree());

                            }
                            break;

                    }

                    char_literal43=(Token)match(input,28,FOLLOW_28_in_varDeclaration602); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_28.add(char_literal43);



                    // AST REWRITE
                    // elements: type, 34, expression, ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CeriumAST)adaptor.nil();
                    // 92:42: -> ^( VAR_DECL ^( '[]' type ) ID ( expression )? )
                    {
                        // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:92:45: ^( VAR_DECL ^( '[]' type ) ID ( expression )? )
                        {
                        CeriumAST root_1 = (CeriumAST)adaptor.nil();
                        root_1 = (CeriumAST)adaptor.becomeRoot((CeriumAST)adaptor.create(VAR_DECL, "VAR_DECL"), root_1);

                        // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:92:56: ^( '[]' type )
                        {
                        CeriumAST root_2 = (CeriumAST)adaptor.nil();
                        root_2 = (CeriumAST)adaptor.becomeRoot(stream_34.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_type.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        adaptor.addChild(root_1, stream_ID.nextNode());
                        // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:92:72: ( expression )?
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
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:96:1: statement options {backtrack=true; } : ( block | varDeclaration | 'if' '(' expression ')' t= block ( 'else' f= block )? -> ^( 'if' expression $t ( $f)? ) | 'while' '(' expression ')' block -> ^( 'while' expression block ) | 'return' ( expression )? ';' -> ^( 'return' ( expression )? ) | lhs '=' expression ';' -> ^( '=' lhs expression ) | a= postfixExpression ';' -> ^( EXPR postfixExpression ) | ';' ->);
    public final CeriumParser.statement_return statement() throws RecognitionException {
        CeriumParser.statement_return retval = new CeriumParser.statement_return();
        retval.start = input.LT(1);

        CeriumAST root_0 = null;

        Token string_literal46=null;
        Token char_literal47=null;
        Token char_literal49=null;
        Token string_literal50=null;
        Token string_literal51=null;
        Token char_literal52=null;
        Token char_literal54=null;
        Token string_literal56=null;
        Token char_literal58=null;
        Token char_literal60=null;
        Token char_literal62=null;
        Token char_literal63=null;
        Token char_literal64=null;
        CeriumParser.block_return t = null;

        CeriumParser.block_return f = null;

        CeriumParser.postfixExpression_return a = null;

        CeriumParser.block_return block44 = null;

        CeriumParser.varDeclaration_return varDeclaration45 = null;

        CeriumParser.expression_return expression48 = null;

        CeriumParser.expression_return expression53 = null;

        CeriumParser.block_return block55 = null;

        CeriumParser.expression_return expression57 = null;

        CeriumParser.lhs_return lhs59 = null;

        CeriumParser.expression_return expression61 = null;


        CeriumAST string_literal46_tree=null;
        CeriumAST char_literal47_tree=null;
        CeriumAST char_literal49_tree=null;
        CeriumAST string_literal50_tree=null;
        CeriumAST string_literal51_tree=null;
        CeriumAST char_literal52_tree=null;
        CeriumAST char_literal54_tree=null;
        CeriumAST string_literal56_tree=null;
        CeriumAST char_literal58_tree=null;
        CeriumAST char_literal60_tree=null;
        CeriumAST char_literal62_tree=null;
        CeriumAST char_literal63_tree=null;
        CeriumAST char_literal64_tree=null;
        RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
        RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
        RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
        RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
        RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_postfixExpression=new RewriteRuleSubtreeStream(adaptor,"rule postfixExpression");
        RewriteRuleSubtreeStream stream_lhs=new RewriteRuleSubtreeStream(adaptor,"rule lhs");
        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:98:5: ( block | varDeclaration | 'if' '(' expression ')' t= block ( 'else' f= block )? -> ^( 'if' expression $t ( $f)? ) | 'while' '(' expression ')' block -> ^( 'while' expression block ) | 'return' ( expression )? ';' -> ^( 'return' ( expression )? ) | lhs '=' expression ';' -> ^( '=' lhs expression ) | a= postfixExpression ';' -> ^( EXPR postfixExpression ) | ';' ->)
            int alt14=8;
            alt14 = dfa14.predict(input);
            switch (alt14) {
                case 1 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:99:6: block
                    {
                    root_0 = (CeriumAST)adaptor.nil();

                    pushFollow(FOLLOW_block_in_statement653);
                    block44=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, block44.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:100:7: varDeclaration
                    {
                    root_0 = (CeriumAST)adaptor.nil();

                    pushFollow(FOLLOW_varDeclaration_in_statement661);
                    varDeclaration45=varDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclaration45.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:101:7: 'if' '(' expression ')' t= block ( 'else' f= block )?
                    {
                    string_literal46=(Token)match(input,40,FOLLOW_40_in_statement669); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_40.add(string_literal46);

                    char_literal47=(Token)match(input,31,FOLLOW_31_in_statement671); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_31.add(char_literal47);

                    pushFollow(FOLLOW_expression_in_statement673);
                    expression48=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression48.getTree());
                    char_literal49=(Token)match(input,32,FOLLOW_32_in_statement675); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_32.add(char_literal49);

                    pushFollow(FOLLOW_block_in_statement679);
                    t=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(t.getTree());
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:101:39: ( 'else' f= block )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==41) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:101:40: 'else' f= block
                            {
                            string_literal50=(Token)match(input,41,FOLLOW_41_in_statement682); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_41.add(string_literal50);

                            pushFollow(FOLLOW_block_in_statement686);
                            f=block();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_block.add(f.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: 40, t, f, expression
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
                    // 102:6: -> ^( 'if' expression $t ( $f)? )
                    {
                        // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:102:9: ^( 'if' expression $t ( $f)? )
                        {
                        CeriumAST root_1 = (CeriumAST)adaptor.nil();
                        root_1 = (CeriumAST)adaptor.becomeRoot(stream_40.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());
                        adaptor.addChild(root_1, stream_t.nextTree());
                        // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:102:30: ( $f)?
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
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:103:7: 'while' '(' expression ')' block
                    {
                    string_literal51=(Token)match(input,42,FOLLOW_42_in_statement716); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_42.add(string_literal51);

                    char_literal52=(Token)match(input,31,FOLLOW_31_in_statement718); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_31.add(char_literal52);

                    pushFollow(FOLLOW_expression_in_statement720);
                    expression53=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression53.getTree());
                    char_literal54=(Token)match(input,32,FOLLOW_32_in_statement722); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_32.add(char_literal54);

                    pushFollow(FOLLOW_block_in_statement724);
                    block55=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block55.getTree());


                    // AST REWRITE
                    // elements: block, expression, 42
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CeriumAST)adaptor.nil();
                    // 104:6: -> ^( 'while' expression block )
                    {
                        // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:104:9: ^( 'while' expression block )
                        {
                        CeriumAST root_1 = (CeriumAST)adaptor.nil();
                        root_1 = (CeriumAST)adaptor.becomeRoot(stream_42.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());
                        adaptor.addChild(root_1, stream_block.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:105:9: 'return' ( expression )? ';'
                    {
                    string_literal56=(Token)match(input,43,FOLLOW_43_in_statement749); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_43.add(string_literal56);

                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:105:18: ( expression )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( ((LA13_0>=ID && LA13_0<=CHAR)||LA13_0==31||LA13_0==51||LA13_0==54||(LA13_0>=58 && LA13_0<=59)) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:105:18: expression
                            {
                            pushFollow(FOLLOW_expression_in_statement751);
                            expression57=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expression.add(expression57.getTree());

                            }
                            break;

                    }

                    char_literal58=(Token)match(input,28,FOLLOW_28_in_statement754); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_28.add(char_literal58);



                    // AST REWRITE
                    // elements: 43, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CeriumAST)adaptor.nil();
                    // 105:34: -> ^( 'return' ( expression )? )
                    {
                        // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:105:37: ^( 'return' ( expression )? )
                        {
                        CeriumAST root_1 = (CeriumAST)adaptor.nil();
                        root_1 = (CeriumAST)adaptor.becomeRoot(stream_43.nextNode(), root_1);

                        // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:105:48: ( expression )?
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
                case 6 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:106:7: lhs '=' expression ';'
                    {
                    pushFollow(FOLLOW_lhs_in_statement771);
                    lhs59=lhs();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_lhs.add(lhs59.getTree());
                    char_literal60=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_statement773); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(char_literal60);

                    pushFollow(FOLLOW_expression_in_statement775);
                    expression61=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression61.getTree());
                    char_literal62=(Token)match(input,28,FOLLOW_28_in_statement777); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_28.add(char_literal62);



                    // AST REWRITE
                    // elements: lhs, ASSIGN, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CeriumAST)adaptor.nil();
                    // 106:30: -> ^( '=' lhs expression )
                    {
                        // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:106:33: ^( '=' lhs expression )
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
                case 7 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:107:9: a= postfixExpression ';'
                    {
                    pushFollow(FOLLOW_postfixExpression_in_statement799);
                    a=postfixExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_postfixExpression.add(a.getTree());
                    char_literal63=(Token)match(input,28,FOLLOW_28_in_statement801); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_28.add(char_literal63);



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
                    // 107:33: -> ^( EXPR postfixExpression )
                    {
                        // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:107:36: ^( EXPR postfixExpression )
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
                case 8 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:108:7: ';'
                    {
                    char_literal64=(Token)match(input,28,FOLLOW_28_in_statement818); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_28.add(char_literal64);



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
                    // 108:11: ->
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

    public static class lhs_return extends ParserRuleReturnScope {
        CeriumAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "lhs"
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:111:1: lhs : postfixExpression -> ^( EXPR postfixExpression ) ;
    public final CeriumParser.lhs_return lhs() throws RecognitionException {
        CeriumParser.lhs_return retval = new CeriumParser.lhs_return();
        retval.start = input.LT(1);

        CeriumAST root_0 = null;

        CeriumParser.postfixExpression_return postfixExpression65 = null;


        RewriteRuleSubtreeStream stream_postfixExpression=new RewriteRuleSubtreeStream(adaptor,"rule postfixExpression");
        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:111:5: ( postfixExpression -> ^( EXPR postfixExpression ) )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:112:3: postfixExpression
            {
            pushFollow(FOLLOW_postfixExpression_in_lhs836);
            postfixExpression65=postfixExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_postfixExpression.add(postfixExpression65.getTree());


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
            // 112:21: -> ^( EXPR postfixExpression )
            {
                // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:112:24: ^( EXPR postfixExpression )
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
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:115:1: expressionList : ( expr ( ',' expr )* -> ^( ELIST ( expr )+ ) | -> ELIST );
    public final CeriumParser.expressionList_return expressionList() throws RecognitionException {
        CeriumParser.expressionList_return retval = new CeriumParser.expressionList_return();
        retval.start = input.LT(1);

        CeriumAST root_0 = null;

        Token char_literal67=null;
        CeriumParser.expr_return expr66 = null;

        CeriumParser.expr_return expr68 = null;


        CeriumAST char_literal67_tree=null;
        RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:116:5: ( expr ( ',' expr )* -> ^( ELIST ( expr )+ ) | -> ELIST )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=ID && LA16_0<=CHAR)||LA16_0==31||LA16_0==51||LA16_0==54||(LA16_0>=58 && LA16_0<=59)) ) {
                alt16=1;
            }
            else if ( (LA16_0==32) ) {
                alt16=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:117:6: expr ( ',' expr )*
                    {
                    pushFollow(FOLLOW_expr_in_expressionList863);
                    expr66=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr66.getTree());
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:117:11: ( ',' expr )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==33) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:117:12: ',' expr
                    	    {
                    	    char_literal67=(Token)match(input,33,FOLLOW_33_in_expressionList866); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_33.add(char_literal67);

                    	    pushFollow(FOLLOW_expr_in_expressionList868);
                    	    expr68=expr();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expr.add(expr68.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop15;
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
                    // 117:23: -> ^( ELIST ( expr )+ )
                    {
                        // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:117:26: ^( ELIST ( expr )+ )
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
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:118:9: 
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
                    // 118:9: -> ELIST
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
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:121:1: expression : expr -> ^( EXPR expr ) ;
    public final CeriumParser.expression_return expression() throws RecognitionException {
        CeriumParser.expression_return retval = new CeriumParser.expression_return();
        retval.start = input.LT(1);

        CeriumAST root_0 = null;

        CeriumParser.expr_return expr69 = null;


        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:122:5: ( expr -> ^( EXPR expr ) )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:123:6: expr
            {
            pushFollow(FOLLOW_expr_in_expression913);
            expr69=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr69.getTree());


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
            // 123:11: -> ^( EXPR expr )
            {
                // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:123:14: ^( EXPR expr )
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
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:126:1: expr : equalityExpression ;
    public final CeriumParser.expr_return expr() throws RecognitionException {
        CeriumParser.expr_return retval = new CeriumParser.expr_return();
        retval.start = input.LT(1);

        CeriumAST root_0 = null;

        CeriumParser.equalityExpression_return equalityExpression70 = null;



        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:126:5: ( equalityExpression )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:127:3: equalityExpression
            {
            root_0 = (CeriumAST)adaptor.nil();

            pushFollow(FOLLOW_equalityExpression_in_expr939);
            equalityExpression70=equalityExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, equalityExpression70.getTree());

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
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:130:1: equalityExpression : relationalExpression ( ( '!=' | '==' ) relationalExpression )* ;
    public final CeriumParser.equalityExpression_return equalityExpression() throws RecognitionException {
        CeriumParser.equalityExpression_return retval = new CeriumParser.equalityExpression_return();
        retval.start = input.LT(1);

        CeriumAST root_0 = null;

        Token string_literal72=null;
        Token string_literal73=null;
        CeriumParser.relationalExpression_return relationalExpression71 = null;

        CeriumParser.relationalExpression_return relationalExpression74 = null;


        CeriumAST string_literal72_tree=null;
        CeriumAST string_literal73_tree=null;

        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:131:2: ( relationalExpression ( ( '!=' | '==' ) relationalExpression )* )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:132:3: relationalExpression ( ( '!=' | '==' ) relationalExpression )*
            {
            root_0 = (CeriumAST)adaptor.nil();

            pushFollow(FOLLOW_relationalExpression_in_equalityExpression961);
            relationalExpression71=relationalExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, relationalExpression71.getTree());
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:132:24: ( ( '!=' | '==' ) relationalExpression )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=44 && LA18_0<=45)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:132:25: ( '!=' | '==' ) relationalExpression
            	    {
            	    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:132:25: ( '!=' | '==' )
            	    int alt17=2;
            	    int LA17_0 = input.LA(1);

            	    if ( (LA17_0==44) ) {
            	        alt17=1;
            	    }
            	    else if ( (LA17_0==45) ) {
            	        alt17=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 17, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt17) {
            	        case 1 :
            	            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:132:26: '!='
            	            {
            	            string_literal72=(Token)match(input,44,FOLLOW_44_in_equalityExpression965); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal72_tree = (CeriumAST)adaptor.create(string_literal72);
            	            root_0 = (CeriumAST)adaptor.becomeRoot(string_literal72_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:132:34: '=='
            	            {
            	            string_literal73=(Token)match(input,45,FOLLOW_45_in_equalityExpression970); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal73_tree = (CeriumAST)adaptor.create(string_literal73);
            	            root_0 = (CeriumAST)adaptor.becomeRoot(string_literal73_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_relationalExpression_in_equalityExpression974);
            	    relationalExpression74=relationalExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, relationalExpression74.getTree());

            	    }
            	    break;

            	default :
            	    break loop18;
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
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:135:1: relationalExpression : additiveExpression ( ( '<' | '>' | '<=' | '>=' ) additiveExpression )* ;
    public final CeriumParser.relationalExpression_return relationalExpression() throws RecognitionException {
        CeriumParser.relationalExpression_return retval = new CeriumParser.relationalExpression_return();
        retval.start = input.LT(1);

        CeriumAST root_0 = null;

        Token char_literal76=null;
        Token char_literal77=null;
        Token string_literal78=null;
        Token string_literal79=null;
        CeriumParser.additiveExpression_return additiveExpression75 = null;

        CeriumParser.additiveExpression_return additiveExpression80 = null;


        CeriumAST char_literal76_tree=null;
        CeriumAST char_literal77_tree=null;
        CeriumAST string_literal78_tree=null;
        CeriumAST string_literal79_tree=null;

        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:136:2: ( additiveExpression ( ( '<' | '>' | '<=' | '>=' ) additiveExpression )* )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:137:3: additiveExpression ( ( '<' | '>' | '<=' | '>=' ) additiveExpression )*
            {
            root_0 = (CeriumAST)adaptor.nil();

            pushFollow(FOLLOW_additiveExpression_in_relationalExpression990);
            additiveExpression75=additiveExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, additiveExpression75.getTree());
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:137:22: ( ( '<' | '>' | '<=' | '>=' ) additiveExpression )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=46 && LA20_0<=49)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:137:24: ( '<' | '>' | '<=' | '>=' ) additiveExpression
            	    {
            	    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:137:24: ( '<' | '>' | '<=' | '>=' )
            	    int alt19=4;
            	    switch ( input.LA(1) ) {
            	    case 46:
            	        {
            	        alt19=1;
            	        }
            	        break;
            	    case 47:
            	        {
            	        alt19=2;
            	        }
            	        break;
            	    case 48:
            	        {
            	        alt19=3;
            	        }
            	        break;
            	    case 49:
            	        {
            	        alt19=4;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 19, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt19) {
            	        case 1 :
            	            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:137:25: '<'
            	            {
            	            char_literal76=(Token)match(input,46,FOLLOW_46_in_relationalExpression995); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal76_tree = (CeriumAST)adaptor.create(char_literal76);
            	            root_0 = (CeriumAST)adaptor.becomeRoot(char_literal76_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:137:32: '>'
            	            {
            	            char_literal77=(Token)match(input,47,FOLLOW_47_in_relationalExpression1000); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal77_tree = (CeriumAST)adaptor.create(char_literal77);
            	            root_0 = (CeriumAST)adaptor.becomeRoot(char_literal77_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:137:39: '<='
            	            {
            	            string_literal78=(Token)match(input,48,FOLLOW_48_in_relationalExpression1005); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal78_tree = (CeriumAST)adaptor.create(string_literal78);
            	            root_0 = (CeriumAST)adaptor.becomeRoot(string_literal78_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:137:47: '>='
            	            {
            	            string_literal79=(Token)match(input,49,FOLLOW_49_in_relationalExpression1010); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal79_tree = (CeriumAST)adaptor.create(string_literal79);
            	            root_0 = (CeriumAST)adaptor.becomeRoot(string_literal79_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_additiveExpression_in_relationalExpression1014);
            	    additiveExpression80=additiveExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, additiveExpression80.getTree());

            	    }
            	    break;

            	default :
            	    break loop20;
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
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:140:1: additiveExpression : multiplicativeExpression ( ( '+' | '-' ) multiplicativeExpression )* ;
    public final CeriumParser.additiveExpression_return additiveExpression() throws RecognitionException {
        CeriumParser.additiveExpression_return retval = new CeriumParser.additiveExpression_return();
        retval.start = input.LT(1);

        CeriumAST root_0 = null;

        Token char_literal82=null;
        Token char_literal83=null;
        CeriumParser.multiplicativeExpression_return multiplicativeExpression81 = null;

        CeriumParser.multiplicativeExpression_return multiplicativeExpression84 = null;


        CeriumAST char_literal82_tree=null;
        CeriumAST char_literal83_tree=null;

        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:141:2: ( multiplicativeExpression ( ( '+' | '-' ) multiplicativeExpression )* )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:142:3: multiplicativeExpression ( ( '+' | '-' ) multiplicativeExpression )*
            {
            root_0 = (CeriumAST)adaptor.nil();

            pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression1031);
            multiplicativeExpression81=multiplicativeExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicativeExpression81.getTree());
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:142:28: ( ( '+' | '-' ) multiplicativeExpression )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=50 && LA22_0<=51)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:142:29: ( '+' | '-' ) multiplicativeExpression
            	    {
            	    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:142:29: ( '+' | '-' )
            	    int alt21=2;
            	    int LA21_0 = input.LA(1);

            	    if ( (LA21_0==50) ) {
            	        alt21=1;
            	    }
            	    else if ( (LA21_0==51) ) {
            	        alt21=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 21, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt21) {
            	        case 1 :
            	            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:142:30: '+'
            	            {
            	            char_literal82=(Token)match(input,50,FOLLOW_50_in_additiveExpression1035); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal82_tree = (CeriumAST)adaptor.create(char_literal82);
            	            root_0 = (CeriumAST)adaptor.becomeRoot(char_literal82_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:142:37: '-'
            	            {
            	            char_literal83=(Token)match(input,51,FOLLOW_51_in_additiveExpression1040); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal83_tree = (CeriumAST)adaptor.create(char_literal83);
            	            root_0 = (CeriumAST)adaptor.becomeRoot(char_literal83_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression1044);
            	    multiplicativeExpression84=multiplicativeExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicativeExpression84.getTree());

            	    }
            	    break;

            	default :
            	    break loop22;
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
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:145:1: multiplicativeExpression : unaryExpression ( ( '*' | '/' ) unaryExpression )* ;
    public final CeriumParser.multiplicativeExpression_return multiplicativeExpression() throws RecognitionException {
        CeriumParser.multiplicativeExpression_return retval = new CeriumParser.multiplicativeExpression_return();
        retval.start = input.LT(1);

        CeriumAST root_0 = null;

        Token char_literal86=null;
        Token char_literal87=null;
        CeriumParser.unaryExpression_return unaryExpression85 = null;

        CeriumParser.unaryExpression_return unaryExpression88 = null;


        CeriumAST char_literal86_tree=null;
        CeriumAST char_literal87_tree=null;

        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:146:2: ( unaryExpression ( ( '*' | '/' ) unaryExpression )* )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:147:3: unaryExpression ( ( '*' | '/' ) unaryExpression )*
            {
            root_0 = (CeriumAST)adaptor.nil();

            pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression1060);
            unaryExpression85=unaryExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression85.getTree());
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:147:19: ( ( '*' | '/' ) unaryExpression )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=52 && LA24_0<=53)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:147:20: ( '*' | '/' ) unaryExpression
            	    {
            	    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:147:20: ( '*' | '/' )
            	    int alt23=2;
            	    int LA23_0 = input.LA(1);

            	    if ( (LA23_0==52) ) {
            	        alt23=1;
            	    }
            	    else if ( (LA23_0==53) ) {
            	        alt23=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 23, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt23) {
            	        case 1 :
            	            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:147:21: '*'
            	            {
            	            char_literal86=(Token)match(input,52,FOLLOW_52_in_multiplicativeExpression1064); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal86_tree = (CeriumAST)adaptor.create(char_literal86);
            	            root_0 = (CeriumAST)adaptor.becomeRoot(char_literal86_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:147:28: '/'
            	            {
            	            char_literal87=(Token)match(input,53,FOLLOW_53_in_multiplicativeExpression1069); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal87_tree = (CeriumAST)adaptor.create(char_literal87);
            	            root_0 = (CeriumAST)adaptor.becomeRoot(char_literal87_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression1073);
            	    unaryExpression88=unaryExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression88.getTree());

            	    }
            	    break;

            	default :
            	    break loop24;
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
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:150:1: unaryExpression : (op= '-' unaryExpression -> ^( UNARY_MINUS[$op] unaryExpression ) | op= '!' unaryExpression -> ^( UNARY_NOT[$op] unaryExpression ) | postfixExpression );
    public final CeriumParser.unaryExpression_return unaryExpression() throws RecognitionException {
        CeriumParser.unaryExpression_return retval = new CeriumParser.unaryExpression_return();
        retval.start = input.LT(1);

        CeriumAST root_0 = null;

        Token op=null;
        CeriumParser.unaryExpression_return unaryExpression89 = null;

        CeriumParser.unaryExpression_return unaryExpression90 = null;

        CeriumParser.postfixExpression_return postfixExpression91 = null;


        CeriumAST op_tree=null;
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
        RewriteRuleSubtreeStream stream_unaryExpression=new RewriteRuleSubtreeStream(adaptor,"rule unaryExpression");
        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:151:2: (op= '-' unaryExpression -> ^( UNARY_MINUS[$op] unaryExpression ) | op= '!' unaryExpression -> ^( UNARY_NOT[$op] unaryExpression ) | postfixExpression )
            int alt25=3;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt25=1;
                }
                break;
            case 54:
                {
                alt25=2;
                }
                break;
            case ID:
            case INT:
            case FLOAT:
            case CHAR:
            case 31:
            case 58:
            case 59:
                {
                alt25=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:152:3: op= '-' unaryExpression
                    {
                    op=(Token)match(input,51,FOLLOW_51_in_unaryExpression1091); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_51.add(op);

                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression1093);
                    unaryExpression89=unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_unaryExpression.add(unaryExpression89.getTree());


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
                    // 152:26: -> ^( UNARY_MINUS[$op] unaryExpression )
                    {
                        // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:152:29: ^( UNARY_MINUS[$op] unaryExpression )
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
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:153:4: op= '!' unaryExpression
                    {
                    op=(Token)match(input,54,FOLLOW_54_in_unaryExpression1109); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_54.add(op);

                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression1111);
                    unaryExpression90=unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_unaryExpression.add(unaryExpression90.getTree());


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
                    // 153:27: -> ^( UNARY_NOT[$op] unaryExpression )
                    {
                        // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:153:30: ^( UNARY_NOT[$op] unaryExpression )
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
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:154:4: postfixExpression
                    {
                    root_0 = (CeriumAST)adaptor.nil();

                    pushFollow(FOLLOW_postfixExpression_in_unaryExpression1125);
                    postfixExpression91=postfixExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, postfixExpression91.getTree());

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
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:158:1: postfixExpression : primary ( (r= '(' expressionList ')' | r= '[' expr ']' | r= '.' ID ) )* ;
    public final CeriumParser.postfixExpression_return postfixExpression() throws RecognitionException {
        CeriumParser.postfixExpression_return retval = new CeriumParser.postfixExpression_return();
        retval.start = input.LT(1);

        CeriumAST root_0 = null;

        Token r=null;
        Token char_literal94=null;
        Token char_literal96=null;
        Token ID97=null;
        CeriumParser.primary_return primary92 = null;

        CeriumParser.expressionList_return expressionList93 = null;

        CeriumParser.expr_return expr95 = null;


        CeriumAST r_tree=null;
        CeriumAST char_literal94_tree=null;
        CeriumAST char_literal96_tree=null;
        CeriumAST ID97_tree=null;

        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:159:5: ( primary ( (r= '(' expressionList ')' | r= '[' expr ']' | r= '.' ID ) )* )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:159:9: primary ( (r= '(' expressionList ')' | r= '[' expr ']' | r= '.' ID ) )*
            {
            root_0 = (CeriumAST)adaptor.nil();

            pushFollow(FOLLOW_primary_in_postfixExpression1142);
            primary92=primary();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, primary92.getTree());
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:160:6: ( (r= '(' expressionList ')' | r= '[' expr ']' | r= '.' ID ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==31||LA27_0==55||LA27_0==57) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:161:7: (r= '(' expressionList ')' | r= '[' expr ']' | r= '.' ID )
            	    {
            	    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:161:7: (r= '(' expressionList ')' | r= '[' expr ']' | r= '.' ID )
            	    int alt26=3;
            	    switch ( input.LA(1) ) {
            	    case 31:
            	        {
            	        alt26=1;
            	        }
            	        break;
            	    case 55:
            	        {
            	        alt26=2;
            	        }
            	        break;
            	    case 57:
            	        {
            	        alt26=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 26, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt26) {
            	        case 1 :
            	            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:161:9: r= '(' expressionList ')'
            	            {
            	            r=(Token)match(input,31,FOLLOW_31_in_postfixExpression1161); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            r_tree = (CeriumAST)adaptor.create(r);
            	            root_0 = (CeriumAST)adaptor.becomeRoot(r_tree, root_0);
            	            }
            	            pushFollow(FOLLOW_expressionList_in_postfixExpression1164);
            	            expressionList93=expressionList();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionList93.getTree());
            	            char_literal94=(Token)match(input,32,FOLLOW_32_in_postfixExpression1166); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	              r.setType(CALL);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:162:9: r= '[' expr ']'
            	            {
            	            r=(Token)match(input,55,FOLLOW_55_in_postfixExpression1181); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            r_tree = (CeriumAST)adaptor.create(r);
            	            root_0 = (CeriumAST)adaptor.becomeRoot(r_tree, root_0);
            	            }
            	            pushFollow(FOLLOW_expr_in_postfixExpression1184);
            	            expr95=expr();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr95.getTree());
            	            char_literal96=(Token)match(input,56,FOLLOW_56_in_postfixExpression1186); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	              r.setType(INDEX);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:163:9: r= '.' ID
            	            {
            	            r=(Token)match(input,57,FOLLOW_57_in_postfixExpression1203); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            r_tree = (CeriumAST)adaptor.create(r);
            	            root_0 = (CeriumAST)adaptor.becomeRoot(r_tree, root_0);
            	            }
            	            ID97=(Token)match(input,ID,FOLLOW_ID_in_postfixExpression1206); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            ID97_tree = (CeriumAST)adaptor.create(ID97);
            	            adaptor.addChild(root_0, ID97_tree);
            	            }

            	            }
            	            break;

            	    }


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
    // $ANTLR end "postfixExpression"

    public static class primary_return extends ParserRuleReturnScope {
        CeriumAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "primary"
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:169:1: primary : ( ID | INT | FLOAT | CHAR | 'true' | 'false' | '(' expr ')' -> expr );
    public final CeriumParser.primary_return primary() throws RecognitionException {
        CeriumParser.primary_return retval = new CeriumParser.primary_return();
        retval.start = input.LT(1);

        CeriumAST root_0 = null;

        Token ID98=null;
        Token INT99=null;
        Token FLOAT100=null;
        Token CHAR101=null;
        Token string_literal102=null;
        Token string_literal103=null;
        Token char_literal104=null;
        Token char_literal106=null;
        CeriumParser.expr_return expr105 = null;


        CeriumAST ID98_tree=null;
        CeriumAST INT99_tree=null;
        CeriumAST FLOAT100_tree=null;
        CeriumAST CHAR101_tree=null;
        CeriumAST string_literal102_tree=null;
        CeriumAST string_literal103_tree=null;
        CeriumAST char_literal104_tree=null;
        CeriumAST char_literal106_tree=null;
        RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
        RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:170:5: ( ID | INT | FLOAT | CHAR | 'true' | 'false' | '(' expr ')' -> expr )
            int alt28=7;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt28=1;
                }
                break;
            case INT:
                {
                alt28=2;
                }
                break;
            case FLOAT:
                {
                alt28=3;
                }
                break;
            case CHAR:
                {
                alt28=4;
                }
                break;
            case 58:
                {
                alt28=5;
                }
                break;
            case 59:
                {
                alt28=6;
                }
                break;
            case 31:
                {
                alt28=7;
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
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:170:7: ID
                    {
                    root_0 = (CeriumAST)adaptor.nil();

                    ID98=(Token)match(input,ID,FOLLOW_ID_in_primary1240); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID98_tree = (CeriumAST)adaptor.create(ID98);
                    adaptor.addChild(root_0, ID98_tree);
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:171:9: INT
                    {
                    root_0 = (CeriumAST)adaptor.nil();

                    INT99=(Token)match(input,INT,FOLLOW_INT_in_primary1250); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INT99_tree = (CeriumAST)adaptor.create(INT99);
                    adaptor.addChild(root_0, INT99_tree);
                    }

                    }
                    break;
                case 3 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:172:7: FLOAT
                    {
                    root_0 = (CeriumAST)adaptor.nil();

                    FLOAT100=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_primary1258); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    FLOAT100_tree = (CeriumAST)adaptor.create(FLOAT100);
                    adaptor.addChild(root_0, FLOAT100_tree);
                    }

                    }
                    break;
                case 4 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:173:7: CHAR
                    {
                    root_0 = (CeriumAST)adaptor.nil();

                    CHAR101=(Token)match(input,CHAR,FOLLOW_CHAR_in_primary1266); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CHAR101_tree = (CeriumAST)adaptor.create(CHAR101);
                    adaptor.addChild(root_0, CHAR101_tree);
                    }

                    }
                    break;
                case 5 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:174:7: 'true'
                    {
                    root_0 = (CeriumAST)adaptor.nil();

                    string_literal102=(Token)match(input,58,FOLLOW_58_in_primary1274); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal102_tree = (CeriumAST)adaptor.create(string_literal102);
                    adaptor.addChild(root_0, string_literal102_tree);
                    }

                    }
                    break;
                case 6 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:175:7: 'false'
                    {
                    root_0 = (CeriumAST)adaptor.nil();

                    string_literal103=(Token)match(input,59,FOLLOW_59_in_primary1282); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal103_tree = (CeriumAST)adaptor.create(string_literal103);
                    adaptor.addChild(root_0, string_literal103_tree);
                    }

                    }
                    break;
                case 7 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:176:8: '(' expr ')'
                    {
                    char_literal104=(Token)match(input,31,FOLLOW_31_in_primary1291); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_31.add(char_literal104);

                    pushFollow(FOLLOW_expr_in_primary1293);
                    expr105=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr105.getTree());
                    char_literal106=(Token)match(input,32,FOLLOW_32_in_primary1295); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_32.add(char_literal106);



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
                    // 176:21: -> expr
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
        // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:100:7: ( varDeclaration )
        // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:100:7: varDeclaration
        {
        pushFollow(FOLLOW_varDeclaration_in_synpred2_Cerium661);
        varDeclaration();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_Cerium

    // $ANTLR start synpred6_Cerium
    public final void synpred6_Cerium_fragment() throws RecognitionException {   
        // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:106:7: ( lhs '=' expression ';' )
        // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:106:7: lhs '=' expression ';'
        {
        pushFollow(FOLLOW_lhs_in_synpred6_Cerium771);
        lhs();

        state._fsp--;
        if (state.failed) return ;
        match(input,ASSIGN,FOLLOW_ASSIGN_in_synpred6_Cerium773); if (state.failed) return ;
        pushFollow(FOLLOW_expression_in_synpred6_Cerium775);
        expression();

        state._fsp--;
        if (state.failed) return ;
        match(input,28,FOLLOW_28_in_synpred6_Cerium777); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred6_Cerium

    // $ANTLR start synpred7_Cerium
    public final void synpred7_Cerium_fragment() throws RecognitionException {   
        CeriumParser.postfixExpression_return a = null;


        // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:107:9: (a= postfixExpression ';' )
        // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:107:9: a= postfixExpression ';'
        {
        pushFollow(FOLLOW_postfixExpression_in_synpred7_Cerium799);
        a=postfixExpression();

        state._fsp--;
        if (state.failed) return ;
        match(input,28,FOLLOW_28_in_synpred7_Cerium801); if (state.failed) return ;

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
    public final boolean synpred6_Cerium() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_Cerium_fragment(); // can never throw exception
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


    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA14_eotS =
        "\20\uffff";
    static final String DFA14_eofS =
        "\20\uffff";
    static final String DFA14_minS =
        "\1\22\1\uffff\1\0\4\uffff\6\0\3\uffff";
    static final String DFA14_maxS =
        "\1\73\1\uffff\1\0\4\uffff\6\0\3\uffff";
    static final String DFA14_acceptS =
        "\1\uffff\1\1\1\uffff\1\3\1\4\1\5\1\2\6\uffff\1\10\1\6\1\7";
    static final String DFA14_specialS =
        "\2\uffff\1\0\4\uffff\1\1\1\2\1\3\1\4\1\5\1\6\3\uffff}>";
    static final String[] DFA14_transitionS = {
            "\1\2\1\7\1\10\1\11\4\uffff\1\1\1\uffff\1\15\2\uffff\1\14\3"+
            "\uffff\5\6\1\3\1\uffff\1\4\1\5\16\uffff\1\12\1\13",
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

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "96:1: statement options {backtrack=true; } : ( block | varDeclaration | 'if' '(' expression ')' t= block ( 'else' f= block )? -> ^( 'if' expression $t ( $f)? ) | 'while' '(' expression ')' block -> ^( 'while' expression block ) | 'return' ( expression )? ';' -> ^( 'return' ( expression )? ) | lhs '=' expression ';' -> ^( '=' lhs expression ) | a= postfixExpression ';' -> ^( EXPR postfixExpression ) | ';' ->);";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_2 = input.LA(1);

                         
                        int index14_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_Cerium()) ) {s = 6;}

                        else if ( (synpred6_Cerium()) ) {s = 14;}

                        else if ( (synpred7_Cerium()) ) {s = 15;}

                         
                        input.seek(index14_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_7 = input.LA(1);

                         
                        int index14_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_Cerium()) ) {s = 14;}

                        else if ( (synpred7_Cerium()) ) {s = 15;}

                         
                        input.seek(index14_7);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_8 = input.LA(1);

                         
                        int index14_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_Cerium()) ) {s = 14;}

                        else if ( (synpred7_Cerium()) ) {s = 15;}

                         
                        input.seek(index14_8);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA14_9 = input.LA(1);

                         
                        int index14_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_Cerium()) ) {s = 14;}

                        else if ( (synpred7_Cerium()) ) {s = 15;}

                         
                        input.seek(index14_9);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA14_10 = input.LA(1);

                         
                        int index14_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_Cerium()) ) {s = 14;}

                        else if ( (synpred7_Cerium()) ) {s = 15;}

                         
                        input.seek(index14_10);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA14_11 = input.LA(1);

                         
                        int index14_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_Cerium()) ) {s = 14;}

                        else if ( (synpred7_Cerium()) ) {s = 15;}

                         
                        input.seek(index14_11);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA14_12 = input.LA(1);

                         
                        int index14_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_Cerium()) ) {s = 14;}

                        else if ( (synpred7_Cerium()) ) {s = 15;}

                         
                        input.seek(index14_12);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_classDefinition_in_compilationUnit152 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_EOF_in_compilationUnit156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_classDefinition182 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ID_in_classDefinition184 = new BitSet(new long[]{0x0000000024000000L});
    public static final BitSet FOLLOW_superClass_in_classDefinition186 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_classDefinition189 = new BitSet(new long[]{0x000000F800040000L});
    public static final BitSet FOLLOW_classMember_in_classDefinition191 = new BitSet(new long[]{0x000000F808040000L});
    public static final BitSet FOLLOW_27_in_classDefinition194 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_classDefinition196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_superClass243 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_superClass245 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ID_in_superClass247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDeclaration_in_classMember271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_methodDeclaration_in_classMember276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_methodDeclaration300 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ID_in_methodDeclaration302 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_methodDeclaration304 = new BitSet(new long[]{0x000000F900040000L});
    public static final BitSet FOLLOW_formalParameters_in_methodDeclaration306 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_methodDeclaration309 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_block_in_methodDeclaration311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parameter_in_formalParameters360 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_formalParameters363 = new BitSet(new long[]{0x000000F800040000L});
    public static final BitSet FOLLOW_parameter_in_formalParameters365 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_type_in_parameter393 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ID_in_parameter395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_parameter412 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ID_in_parameter414 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_parameter416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_type0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_block517 = new BitSet(new long[]{0x0C000DF89C3C0000L});
    public static final BitSet FOLLOW_statement_in_block519 = new BitSet(new long[]{0x0C000DF89C3C0000L});
    public static final BitSet FOLLOW_27_in_block522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_varDeclaration555 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ID_in_varDeclaration557 = new BitSet(new long[]{0x0000000010002000L});
    public static final BitSet FOLLOW_ASSIGN_in_varDeclaration560 = new BitSet(new long[]{0x0C480000803C0000L});
    public static final BitSet FOLLOW_expression_in_varDeclaration562 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_varDeclaration566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_varDeclaration589 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ID_in_varDeclaration591 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_varDeclaration593 = new BitSet(new long[]{0x0000000010002000L});
    public static final BitSet FOLLOW_ASSIGN_in_varDeclaration596 = new BitSet(new long[]{0x0C480000803C0000L});
    public static final BitSet FOLLOW_expression_in_varDeclaration598 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_varDeclaration602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_statement653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDeclaration_in_statement661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_statement669 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_statement671 = new BitSet(new long[]{0x0C480000803C0000L});
    public static final BitSet FOLLOW_expression_in_statement673 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_statement675 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_block_in_statement679 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_41_in_statement682 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_block_in_statement686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_statement716 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_statement718 = new BitSet(new long[]{0x0C480000803C0000L});
    public static final BitSet FOLLOW_expression_in_statement720 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_statement722 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_block_in_statement724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_statement749 = new BitSet(new long[]{0x0C480000903C0000L});
    public static final BitSet FOLLOW_expression_in_statement751 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_statement754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lhs_in_statement771 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ASSIGN_in_statement773 = new BitSet(new long[]{0x0C480000803C0000L});
    public static final BitSet FOLLOW_expression_in_statement775 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_statement777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postfixExpression_in_statement799 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_statement801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_statement818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postfixExpression_in_lhs836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expressionList863 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_expressionList866 = new BitSet(new long[]{0x0C480000803C0000L});
    public static final BitSet FOLLOW_expr_in_expressionList868 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_expr_in_expression913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_equalityExpression_in_expr939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression961 = new BitSet(new long[]{0x0000300000000002L});
    public static final BitSet FOLLOW_44_in_equalityExpression965 = new BitSet(new long[]{0x0C480000803C0000L});
    public static final BitSet FOLLOW_45_in_equalityExpression970 = new BitSet(new long[]{0x0C480000803C0000L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression974 = new BitSet(new long[]{0x0000300000000002L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression990 = new BitSet(new long[]{0x0003C00000000002L});
    public static final BitSet FOLLOW_46_in_relationalExpression995 = new BitSet(new long[]{0x0C480000803C0000L});
    public static final BitSet FOLLOW_47_in_relationalExpression1000 = new BitSet(new long[]{0x0C480000803C0000L});
    public static final BitSet FOLLOW_48_in_relationalExpression1005 = new BitSet(new long[]{0x0C480000803C0000L});
    public static final BitSet FOLLOW_49_in_relationalExpression1010 = new BitSet(new long[]{0x0C480000803C0000L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression1014 = new BitSet(new long[]{0x0003C00000000002L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression1031 = new BitSet(new long[]{0x000C000000000002L});
    public static final BitSet FOLLOW_50_in_additiveExpression1035 = new BitSet(new long[]{0x0C480000803C0000L});
    public static final BitSet FOLLOW_51_in_additiveExpression1040 = new BitSet(new long[]{0x0C480000803C0000L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression1044 = new BitSet(new long[]{0x000C000000000002L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression1060 = new BitSet(new long[]{0x0030000000000002L});
    public static final BitSet FOLLOW_52_in_multiplicativeExpression1064 = new BitSet(new long[]{0x0C480000803C0000L});
    public static final BitSet FOLLOW_53_in_multiplicativeExpression1069 = new BitSet(new long[]{0x0C480000803C0000L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression1073 = new BitSet(new long[]{0x0030000000000002L});
    public static final BitSet FOLLOW_51_in_unaryExpression1091 = new BitSet(new long[]{0x0C480000803C0000L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression1093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_unaryExpression1109 = new BitSet(new long[]{0x0C480000803C0000L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression1111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postfixExpression_in_unaryExpression1125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_in_postfixExpression1142 = new BitSet(new long[]{0x0280000080000002L});
    public static final BitSet FOLLOW_31_in_postfixExpression1161 = new BitSet(new long[]{0x0C480001803C0000L});
    public static final BitSet FOLLOW_expressionList_in_postfixExpression1164 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_postfixExpression1166 = new BitSet(new long[]{0x0280000080000002L});
    public static final BitSet FOLLOW_55_in_postfixExpression1181 = new BitSet(new long[]{0x0C480000803C0000L});
    public static final BitSet FOLLOW_expr_in_postfixExpression1184 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_postfixExpression1186 = new BitSet(new long[]{0x0280000080000002L});
    public static final BitSet FOLLOW_57_in_postfixExpression1203 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ID_in_postfixExpression1206 = new BitSet(new long[]{0x0280000080000002L});
    public static final BitSet FOLLOW_ID_in_primary1240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_primary1250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_primary1258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_primary1266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_primary1274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_primary1282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_primary1291 = new BitSet(new long[]{0x0C480000803C0000L});
    public static final BitSet FOLLOW_expr_in_primary1293 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_primary1295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDeclaration_in_synpred2_Cerium661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lhs_in_synpred6_Cerium771 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ASSIGN_in_synpred6_Cerium773 = new BitSet(new long[]{0x0C480000803C0000L});
    public static final BitSet FOLLOW_expression_in_synpred6_Cerium775 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_synpred6_Cerium777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postfixExpression_in_synpred7_Cerium799 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_synpred7_Cerium801 = new BitSet(new long[]{0x0000000000000002L});

}