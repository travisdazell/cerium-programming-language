// $ANTLR 3.2 Sep 23, 2009 12:02:23 C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g 2014-12-21 09:04:33

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;

public class CeriumParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "METHOD_DECL", "ARG_DECL", "BLOCK", "MEMBERS", "VAR_DECL", "FIELD_DECL", "CALL", "ELIST", "EXPR", "ASSIGN", "EXTENDS", "UNARY_MINUS", "UNARY_NOT", "INDEX", "ID", "INT", "FLOAT", "CHAR", "LETTER", "WS", "SL_COMMENT", "'class'", "'{'", "'}'", "';'", "':'", "'public'", "'('", "')'", "','", "'[]'", "'float'", "'int'", "'void'", "'char'", "'boolean'", "'if'", "'else'", "'return'", "'!='", "'=='", "'<'", "'>'", "'<='", "'>='", "'+'", "'-'", "'*'", "'/'", "'!'", "'['", "']'", "'.'", "'this'", "'super'", "'true'", "'false'"
    };
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int LETTER=22;
    public static final int ARG_DECL=5;
    public static final int CHAR=21;
    public static final int VAR_DECL=8;
    public static final int METHOD_DECL=4;
    public static final int FLOAT=20;
    public static final int ID=18;
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

                    if ( (LA4_2==31) ) {
                        alt4=2;
                    }
                    else if ( (LA4_2==ASSIGN||LA4_2==28||LA4_2==34) ) {
                        alt4=1;
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
            // elements: ID, type, block, formalParameters
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
                    // elements: 34, type, ID
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

                if ( ((LA8_0>=ID && LA8_0<=CHAR)||LA8_0==26||LA8_0==28||LA8_0==31||(LA8_0>=35 && LA8_0<=40)||LA8_0==42||(LA8_0>=57 && LA8_0<=60)) ) {
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
                    // elements: 34, expression, ID, type
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
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:96:1: statement options {backtrack=true; } : ( block | varDeclaration | 'if' '(' expression ')' s= statement ( 'else' e= statement )? -> ^( 'if' expression $s ( $e)? ) | 'return' ( expression )? ';' -> ^( 'return' ( expression )? ) | lhs '=' expression ';' -> ^( '=' lhs expression ) | a= postfixExpression ( '=' expression -> ^( '=' postfixExpression expression ) | -> ^( EXPR postfixExpression ) ) ';' | ';' ->);
    public final CeriumParser.statement_return statement() throws RecognitionException {
        CeriumParser.statement_return retval = new CeriumParser.statement_return();
        retval.start = input.LT(1);

        CeriumAST root_0 = null;

        Token string_literal46=null;
        Token char_literal47=null;
        Token char_literal49=null;
        Token string_literal50=null;
        Token string_literal51=null;
        Token char_literal53=null;
        Token char_literal55=null;
        Token char_literal57=null;
        Token char_literal58=null;
        Token char_literal60=null;
        Token char_literal61=null;
        CeriumParser.statement_return s = null;

        CeriumParser.statement_return e = null;

        CeriumParser.postfixExpression_return a = null;

        CeriumParser.block_return block44 = null;

        CeriumParser.varDeclaration_return varDeclaration45 = null;

        CeriumParser.expression_return expression48 = null;

        CeriumParser.expression_return expression52 = null;

        CeriumParser.lhs_return lhs54 = null;

        CeriumParser.expression_return expression56 = null;

        CeriumParser.expression_return expression59 = null;


        CeriumAST string_literal46_tree=null;
        CeriumAST char_literal47_tree=null;
        CeriumAST char_literal49_tree=null;
        CeriumAST string_literal50_tree=null;
        CeriumAST string_literal51_tree=null;
        CeriumAST char_literal53_tree=null;
        CeriumAST char_literal55_tree=null;
        CeriumAST char_literal57_tree=null;
        CeriumAST char_literal58_tree=null;
        CeriumAST char_literal60_tree=null;
        CeriumAST char_literal61_tree=null;
        RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
        RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
        RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
        RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_postfixExpression=new RewriteRuleSubtreeStream(adaptor,"rule postfixExpression");
        RewriteRuleSubtreeStream stream_lhs=new RewriteRuleSubtreeStream(adaptor,"rule lhs");
        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:98:5: ( block | varDeclaration | 'if' '(' expression ')' s= statement ( 'else' e= statement )? -> ^( 'if' expression $s ( $e)? ) | 'return' ( expression )? ';' -> ^( 'return' ( expression )? ) | lhs '=' expression ';' -> ^( '=' lhs expression ) | a= postfixExpression ( '=' expression -> ^( '=' postfixExpression expression ) | -> ^( EXPR postfixExpression ) ) ';' | ';' ->)
            int alt15=7;
            alt15 = dfa15.predict(input);
            switch (alt15) {
                case 1 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:99:6: block
                    {
                    root_0 = (CeriumAST)adaptor.nil();

                    pushFollow(FOLLOW_block_in_statement654);
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

                    pushFollow(FOLLOW_varDeclaration_in_statement662);
                    varDeclaration45=varDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclaration45.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:101:7: 'if' '(' expression ')' s= statement ( 'else' e= statement )?
                    {
                    string_literal46=(Token)match(input,40,FOLLOW_40_in_statement670); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_40.add(string_literal46);

                    char_literal47=(Token)match(input,31,FOLLOW_31_in_statement672); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_31.add(char_literal47);

                    pushFollow(FOLLOW_expression_in_statement674);
                    expression48=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression48.getTree());
                    char_literal49=(Token)match(input,32,FOLLOW_32_in_statement676); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_32.add(char_literal49);

                    pushFollow(FOLLOW_statement_in_statement680);
                    s=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(s.getTree());
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:101:43: ( 'else' e= statement )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==41) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:101:44: 'else' e= statement
                            {
                            string_literal50=(Token)match(input,41,FOLLOW_41_in_statement683); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_41.add(string_literal50);

                            pushFollow(FOLLOW_statement_in_statement687);
                            e=statement();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_statement.add(e.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: expression, e, s, 40
                    // token labels: 
                    // rule labels: retval, e, s
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_e=new RewriteRuleSubtreeStream(adaptor,"rule e",e!=null?e.tree:null);
                    RewriteRuleSubtreeStream stream_s=new RewriteRuleSubtreeStream(adaptor,"rule s",s!=null?s.tree:null);

                    root_0 = (CeriumAST)adaptor.nil();
                    // 102:6: -> ^( 'if' expression $s ( $e)? )
                    {
                        // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:102:9: ^( 'if' expression $s ( $e)? )
                        {
                        CeriumAST root_1 = (CeriumAST)adaptor.nil();
                        root_1 = (CeriumAST)adaptor.becomeRoot(stream_40.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());
                        adaptor.addChild(root_1, stream_s.nextTree());
                        // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:102:30: ( $e)?
                        if ( stream_e.hasNext() ) {
                            adaptor.addChild(root_1, stream_e.nextTree());

                        }
                        stream_e.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:103:9: 'return' ( expression )? ';'
                    {
                    string_literal51=(Token)match(input,42,FOLLOW_42_in_statement719); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_42.add(string_literal51);

                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:103:18: ( expression )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( ((LA13_0>=ID && LA13_0<=CHAR)||LA13_0==31||LA13_0==50||LA13_0==53||(LA13_0>=57 && LA13_0<=60)) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:103:18: expression
                            {
                            pushFollow(FOLLOW_expression_in_statement721);
                            expression52=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expression.add(expression52.getTree());

                            }
                            break;

                    }

                    char_literal53=(Token)match(input,28,FOLLOW_28_in_statement724); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_28.add(char_literal53);



                    // AST REWRITE
                    // elements: expression, 42
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CeriumAST)adaptor.nil();
                    // 103:34: -> ^( 'return' ( expression )? )
                    {
                        // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:103:37: ^( 'return' ( expression )? )
                        {
                        CeriumAST root_1 = (CeriumAST)adaptor.nil();
                        root_1 = (CeriumAST)adaptor.becomeRoot(stream_42.nextNode(), root_1);

                        // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:103:48: ( expression )?
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
                case 5 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:104:7: lhs '=' expression ';'
                    {
                    pushFollow(FOLLOW_lhs_in_statement741);
                    lhs54=lhs();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_lhs.add(lhs54.getTree());
                    char_literal55=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_statement743); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(char_literal55);

                    pushFollow(FOLLOW_expression_in_statement745);
                    expression56=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression56.getTree());
                    char_literal57=(Token)match(input,28,FOLLOW_28_in_statement747); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_28.add(char_literal57);



                    // AST REWRITE
                    // elements: ASSIGN, lhs, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CeriumAST)adaptor.nil();
                    // 104:30: -> ^( '=' lhs expression )
                    {
                        // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:104:33: ^( '=' lhs expression )
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
                case 6 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:105:9: a= postfixExpression ( '=' expression -> ^( '=' postfixExpression expression ) | -> ^( EXPR postfixExpression ) ) ';'
                    {
                    pushFollow(FOLLOW_postfixExpression_in_statement769);
                    a=postfixExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_postfixExpression.add(a.getTree());
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:106:9: ( '=' expression -> ^( '=' postfixExpression expression ) | -> ^( EXPR postfixExpression ) )
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==ASSIGN) ) {
                        alt14=1;
                    }
                    else if ( (LA14_0==28) ) {
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
                            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:106:13: '=' expression
                            {
                            char_literal58=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_statement784); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_ASSIGN.add(char_literal58);

                            pushFollow(FOLLOW_expression_in_statement786);
                            expression59=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expression.add(expression59.getTree());


                            // AST REWRITE
                            // elements: ASSIGN, expression, postfixExpression
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (CeriumAST)adaptor.nil();
                            // 106:28: -> ^( '=' postfixExpression expression )
                            {
                                // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:106:31: ^( '=' postfixExpression expression )
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
                            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:107:13: 
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
                            // 107:13: -> ^( EXPR postfixExpression )
                            {
                                // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:107:16: ^( EXPR postfixExpression )
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

                    char_literal60=(Token)match(input,28,FOLLOW_28_in_statement836); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_28.add(char_literal60);


                    }
                    break;
                case 7 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:110:7: ';'
                    {
                    char_literal61=(Token)match(input,28,FOLLOW_28_in_statement845); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_28.add(char_literal61);



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
                    // 110:11: ->
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
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:113:1: lhs : postfixExpression -> ^( EXPR postfixExpression ) ;
    public final CeriumParser.lhs_return lhs() throws RecognitionException {
        CeriumParser.lhs_return retval = new CeriumParser.lhs_return();
        retval.start = input.LT(1);

        CeriumAST root_0 = null;

        CeriumParser.postfixExpression_return postfixExpression62 = null;


        RewriteRuleSubtreeStream stream_postfixExpression=new RewriteRuleSubtreeStream(adaptor,"rule postfixExpression");
        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:113:5: ( postfixExpression -> ^( EXPR postfixExpression ) )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:114:3: postfixExpression
            {
            pushFollow(FOLLOW_postfixExpression_in_lhs864);
            postfixExpression62=postfixExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_postfixExpression.add(postfixExpression62.getTree());


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
            // 114:21: -> ^( EXPR postfixExpression )
            {
                // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:114:24: ^( EXPR postfixExpression )
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
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:117:1: expressionList : ( expr ( ',' expr )* -> ^( ELIST ( expr )+ ) | -> ELIST );
    public final CeriumParser.expressionList_return expressionList() throws RecognitionException {
        CeriumParser.expressionList_return retval = new CeriumParser.expressionList_return();
        retval.start = input.LT(1);

        CeriumAST root_0 = null;

        Token char_literal64=null;
        CeriumParser.expr_return expr63 = null;

        CeriumParser.expr_return expr65 = null;


        CeriumAST char_literal64_tree=null;
        RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:118:5: ( expr ( ',' expr )* -> ^( ELIST ( expr )+ ) | -> ELIST )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=ID && LA17_0<=CHAR)||LA17_0==31||LA17_0==50||LA17_0==53||(LA17_0>=57 && LA17_0<=60)) ) {
                alt17=1;
            }
            else if ( (LA17_0==32) ) {
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
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:119:6: expr ( ',' expr )*
                    {
                    pushFollow(FOLLOW_expr_in_expressionList891);
                    expr63=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr63.getTree());
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:119:11: ( ',' expr )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==33) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:119:12: ',' expr
                    	    {
                    	    char_literal64=(Token)match(input,33,FOLLOW_33_in_expressionList894); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_33.add(char_literal64);

                    	    pushFollow(FOLLOW_expr_in_expressionList896);
                    	    expr65=expr();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expr.add(expr65.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop16;
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
                    // 119:23: -> ^( ELIST ( expr )+ )
                    {
                        // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:119:26: ^( ELIST ( expr )+ )
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
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:120:9: 
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
                    // 120:9: -> ELIST
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
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:123:1: expression : expr -> ^( EXPR expr ) ;
    public final CeriumParser.expression_return expression() throws RecognitionException {
        CeriumParser.expression_return retval = new CeriumParser.expression_return();
        retval.start = input.LT(1);

        CeriumAST root_0 = null;

        CeriumParser.expr_return expr66 = null;


        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:124:5: ( expr -> ^( EXPR expr ) )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:125:6: expr
            {
            pushFollow(FOLLOW_expr_in_expression944);
            expr66=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr66.getTree());


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
            // 125:11: -> ^( EXPR expr )
            {
                // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:125:14: ^( EXPR expr )
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
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:128:1: expr : equalityExpression ;
    public final CeriumParser.expr_return expr() throws RecognitionException {
        CeriumParser.expr_return retval = new CeriumParser.expr_return();
        retval.start = input.LT(1);

        CeriumAST root_0 = null;

        CeriumParser.equalityExpression_return equalityExpression67 = null;



        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:128:5: ( equalityExpression )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:129:3: equalityExpression
            {
            root_0 = (CeriumAST)adaptor.nil();

            pushFollow(FOLLOW_equalityExpression_in_expr970);
            equalityExpression67=equalityExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, equalityExpression67.getTree());

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
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:132:1: equalityExpression : relationalExpression ( ( '!=' | '==' ) relationalExpression )* ;
    public final CeriumParser.equalityExpression_return equalityExpression() throws RecognitionException {
        CeriumParser.equalityExpression_return retval = new CeriumParser.equalityExpression_return();
        retval.start = input.LT(1);

        CeriumAST root_0 = null;

        Token string_literal69=null;
        Token string_literal70=null;
        CeriumParser.relationalExpression_return relationalExpression68 = null;

        CeriumParser.relationalExpression_return relationalExpression71 = null;


        CeriumAST string_literal69_tree=null;
        CeriumAST string_literal70_tree=null;

        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:133:2: ( relationalExpression ( ( '!=' | '==' ) relationalExpression )* )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:134:3: relationalExpression ( ( '!=' | '==' ) relationalExpression )*
            {
            root_0 = (CeriumAST)adaptor.nil();

            pushFollow(FOLLOW_relationalExpression_in_equalityExpression992);
            relationalExpression68=relationalExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, relationalExpression68.getTree());
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:134:24: ( ( '!=' | '==' ) relationalExpression )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=43 && LA19_0<=44)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:134:25: ( '!=' | '==' ) relationalExpression
            	    {
            	    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:134:25: ( '!=' | '==' )
            	    int alt18=2;
            	    int LA18_0 = input.LA(1);

            	    if ( (LA18_0==43) ) {
            	        alt18=1;
            	    }
            	    else if ( (LA18_0==44) ) {
            	        alt18=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 18, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt18) {
            	        case 1 :
            	            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:134:26: '!='
            	            {
            	            string_literal69=(Token)match(input,43,FOLLOW_43_in_equalityExpression996); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal69_tree = (CeriumAST)adaptor.create(string_literal69);
            	            root_0 = (CeriumAST)adaptor.becomeRoot(string_literal69_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:134:34: '=='
            	            {
            	            string_literal70=(Token)match(input,44,FOLLOW_44_in_equalityExpression1001); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal70_tree = (CeriumAST)adaptor.create(string_literal70);
            	            root_0 = (CeriumAST)adaptor.becomeRoot(string_literal70_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_relationalExpression_in_equalityExpression1005);
            	    relationalExpression71=relationalExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, relationalExpression71.getTree());

            	    }
            	    break;

            	default :
            	    break loop19;
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
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:137:1: relationalExpression : additiveExpression ( ( ( '<' | '>' | '<=' | '>=' ) additiveExpression )* ) ;
    public final CeriumParser.relationalExpression_return relationalExpression() throws RecognitionException {
        CeriumParser.relationalExpression_return retval = new CeriumParser.relationalExpression_return();
        retval.start = input.LT(1);

        CeriumAST root_0 = null;

        Token char_literal73=null;
        Token char_literal74=null;
        Token string_literal75=null;
        Token string_literal76=null;
        CeriumParser.additiveExpression_return additiveExpression72 = null;

        CeriumParser.additiveExpression_return additiveExpression77 = null;


        CeriumAST char_literal73_tree=null;
        CeriumAST char_literal74_tree=null;
        CeriumAST string_literal75_tree=null;
        CeriumAST string_literal76_tree=null;

        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:138:2: ( additiveExpression ( ( ( '<' | '>' | '<=' | '>=' ) additiveExpression )* ) )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:139:3: additiveExpression ( ( ( '<' | '>' | '<=' | '>=' ) additiveExpression )* )
            {
            root_0 = (CeriumAST)adaptor.nil();

            pushFollow(FOLLOW_additiveExpression_in_relationalExpression1021);
            additiveExpression72=additiveExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, additiveExpression72.getTree());
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:140:3: ( ( ( '<' | '>' | '<=' | '>=' ) additiveExpression )* )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:140:5: ( ( '<' | '>' | '<=' | '>=' ) additiveExpression )*
            {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:140:5: ( ( '<' | '>' | '<=' | '>=' ) additiveExpression )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=45 && LA21_0<=48)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:140:7: ( '<' | '>' | '<=' | '>=' ) additiveExpression
            	    {
            	    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:140:7: ( '<' | '>' | '<=' | '>=' )
            	    int alt20=4;
            	    switch ( input.LA(1) ) {
            	    case 45:
            	        {
            	        alt20=1;
            	        }
            	        break;
            	    case 46:
            	        {
            	        alt20=2;
            	        }
            	        break;
            	    case 47:
            	        {
            	        alt20=3;
            	        }
            	        break;
            	    case 48:
            	        {
            	        alt20=4;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 20, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt20) {
            	        case 1 :
            	            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:140:9: '<'
            	            {
            	            char_literal73=(Token)match(input,45,FOLLOW_45_in_relationalExpression1031); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal73_tree = (CeriumAST)adaptor.create(char_literal73);
            	            root_0 = (CeriumAST)adaptor.becomeRoot(char_literal73_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:141:7: '>'
            	            {
            	            char_literal74=(Token)match(input,46,FOLLOW_46_in_relationalExpression1040); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal74_tree = (CeriumAST)adaptor.create(char_literal74);
            	            root_0 = (CeriumAST)adaptor.becomeRoot(char_literal74_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:142:7: '<='
            	            {
            	            string_literal75=(Token)match(input,47,FOLLOW_47_in_relationalExpression1049); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal75_tree = (CeriumAST)adaptor.create(string_literal75);
            	            root_0 = (CeriumAST)adaptor.becomeRoot(string_literal75_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:143:7: '>='
            	            {
            	            string_literal76=(Token)match(input,48,FOLLOW_48_in_relationalExpression1058); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal76_tree = (CeriumAST)adaptor.create(string_literal76);
            	            root_0 = (CeriumAST)adaptor.becomeRoot(string_literal76_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_additiveExpression_in_relationalExpression1071);
            	    additiveExpression77=additiveExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, additiveExpression77.getTree());

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


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
    // $ANTLR end "relationalExpression"

    public static class additiveExpression_return extends ParserRuleReturnScope {
        CeriumAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "additiveExpression"
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:150:1: additiveExpression : multiplicativeExpression ( ( '+' | '-' ) multiplicativeExpression )* ;
    public final CeriumParser.additiveExpression_return additiveExpression() throws RecognitionException {
        CeriumParser.additiveExpression_return retval = new CeriumParser.additiveExpression_return();
        retval.start = input.LT(1);

        CeriumAST root_0 = null;

        Token char_literal79=null;
        Token char_literal80=null;
        CeriumParser.multiplicativeExpression_return multiplicativeExpression78 = null;

        CeriumParser.multiplicativeExpression_return multiplicativeExpression81 = null;


        CeriumAST char_literal79_tree=null;
        CeriumAST char_literal80_tree=null;

        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:151:2: ( multiplicativeExpression ( ( '+' | '-' ) multiplicativeExpression )* )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:152:3: multiplicativeExpression ( ( '+' | '-' ) multiplicativeExpression )*
            {
            root_0 = (CeriumAST)adaptor.nil();

            pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression1095);
            multiplicativeExpression78=multiplicativeExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicativeExpression78.getTree());
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:152:28: ( ( '+' | '-' ) multiplicativeExpression )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=49 && LA23_0<=50)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:152:29: ( '+' | '-' ) multiplicativeExpression
            	    {
            	    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:152:29: ( '+' | '-' )
            	    int alt22=2;
            	    int LA22_0 = input.LA(1);

            	    if ( (LA22_0==49) ) {
            	        alt22=1;
            	    }
            	    else if ( (LA22_0==50) ) {
            	        alt22=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 22, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt22) {
            	        case 1 :
            	            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:152:30: '+'
            	            {
            	            char_literal79=(Token)match(input,49,FOLLOW_49_in_additiveExpression1099); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal79_tree = (CeriumAST)adaptor.create(char_literal79);
            	            root_0 = (CeriumAST)adaptor.becomeRoot(char_literal79_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:152:37: '-'
            	            {
            	            char_literal80=(Token)match(input,50,FOLLOW_50_in_additiveExpression1104); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal80_tree = (CeriumAST)adaptor.create(char_literal80);
            	            root_0 = (CeriumAST)adaptor.becomeRoot(char_literal80_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression1108);
            	    multiplicativeExpression81=multiplicativeExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicativeExpression81.getTree());

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
    // $ANTLR end "additiveExpression"

    public static class multiplicativeExpression_return extends ParserRuleReturnScope {
        CeriumAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "multiplicativeExpression"
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:155:1: multiplicativeExpression : unaryExpression ( ( '*' | '/' ) unaryExpression )* ;
    public final CeriumParser.multiplicativeExpression_return multiplicativeExpression() throws RecognitionException {
        CeriumParser.multiplicativeExpression_return retval = new CeriumParser.multiplicativeExpression_return();
        retval.start = input.LT(1);

        CeriumAST root_0 = null;

        Token char_literal83=null;
        Token char_literal84=null;
        CeriumParser.unaryExpression_return unaryExpression82 = null;

        CeriumParser.unaryExpression_return unaryExpression85 = null;


        CeriumAST char_literal83_tree=null;
        CeriumAST char_literal84_tree=null;

        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:156:2: ( unaryExpression ( ( '*' | '/' ) unaryExpression )* )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:157:3: unaryExpression ( ( '*' | '/' ) unaryExpression )*
            {
            root_0 = (CeriumAST)adaptor.nil();

            pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression1124);
            unaryExpression82=unaryExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression82.getTree());
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:157:19: ( ( '*' | '/' ) unaryExpression )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=51 && LA25_0<=52)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:157:20: ( '*' | '/' ) unaryExpression
            	    {
            	    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:157:20: ( '*' | '/' )
            	    int alt24=2;
            	    int LA24_0 = input.LA(1);

            	    if ( (LA24_0==51) ) {
            	        alt24=1;
            	    }
            	    else if ( (LA24_0==52) ) {
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
            	            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:157:21: '*'
            	            {
            	            char_literal83=(Token)match(input,51,FOLLOW_51_in_multiplicativeExpression1128); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal83_tree = (CeriumAST)adaptor.create(char_literal83);
            	            root_0 = (CeriumAST)adaptor.becomeRoot(char_literal83_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:157:28: '/'
            	            {
            	            char_literal84=(Token)match(input,52,FOLLOW_52_in_multiplicativeExpression1133); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal84_tree = (CeriumAST)adaptor.create(char_literal84);
            	            root_0 = (CeriumAST)adaptor.becomeRoot(char_literal84_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression1137);
            	    unaryExpression85=unaryExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression85.getTree());

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
    // $ANTLR end "multiplicativeExpression"

    public static class unaryExpression_return extends ParserRuleReturnScope {
        CeriumAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "unaryExpression"
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:160:1: unaryExpression : (op= '-' unaryExpression -> ^( UNARY_MINUS[$op] unaryExpression ) | op= '!' unaryExpression -> ^( UNARY_NOT[$op] unaryExpression ) | postfixExpression );
    public final CeriumParser.unaryExpression_return unaryExpression() throws RecognitionException {
        CeriumParser.unaryExpression_return retval = new CeriumParser.unaryExpression_return();
        retval.start = input.LT(1);

        CeriumAST root_0 = null;

        Token op=null;
        CeriumParser.unaryExpression_return unaryExpression86 = null;

        CeriumParser.unaryExpression_return unaryExpression87 = null;

        CeriumParser.postfixExpression_return postfixExpression88 = null;


        CeriumAST op_tree=null;
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
        RewriteRuleSubtreeStream stream_unaryExpression=new RewriteRuleSubtreeStream(adaptor,"rule unaryExpression");
        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:161:2: (op= '-' unaryExpression -> ^( UNARY_MINUS[$op] unaryExpression ) | op= '!' unaryExpression -> ^( UNARY_NOT[$op] unaryExpression ) | postfixExpression )
            int alt26=3;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt26=1;
                }
                break;
            case 53:
                {
                alt26=2;
                }
                break;
            case ID:
            case INT:
            case FLOAT:
            case CHAR:
            case 31:
            case 57:
            case 58:
            case 59:
            case 60:
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
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:162:3: op= '-' unaryExpression
                    {
                    op=(Token)match(input,50,FOLLOW_50_in_unaryExpression1155); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_50.add(op);

                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression1157);
                    unaryExpression86=unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_unaryExpression.add(unaryExpression86.getTree());


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
                    // 162:26: -> ^( UNARY_MINUS[$op] unaryExpression )
                    {
                        // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:162:29: ^( UNARY_MINUS[$op] unaryExpression )
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
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:163:4: op= '!' unaryExpression
                    {
                    op=(Token)match(input,53,FOLLOW_53_in_unaryExpression1173); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_53.add(op);

                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression1175);
                    unaryExpression87=unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_unaryExpression.add(unaryExpression87.getTree());


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
                    // 163:27: -> ^( UNARY_NOT[$op] unaryExpression )
                    {
                        // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:163:30: ^( UNARY_NOT[$op] unaryExpression )
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
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:164:4: postfixExpression
                    {
                    root_0 = (CeriumAST)adaptor.nil();

                    pushFollow(FOLLOW_postfixExpression_in_unaryExpression1189);
                    postfixExpression88=postfixExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, postfixExpression88.getTree());

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
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:169:1: postfixExpression : primary ( (r= '(' expressionList ')' | r= '[' expr ']' | r= '.' ID ) )* ;
    public final CeriumParser.postfixExpression_return postfixExpression() throws RecognitionException {
        CeriumParser.postfixExpression_return retval = new CeriumParser.postfixExpression_return();
        retval.start = input.LT(1);

        CeriumAST root_0 = null;

        Token r=null;
        Token char_literal91=null;
        Token char_literal93=null;
        Token ID94=null;
        CeriumParser.primary_return primary89 = null;

        CeriumParser.expressionList_return expressionList90 = null;

        CeriumParser.expr_return expr92 = null;


        CeriumAST r_tree=null;
        CeriumAST char_literal91_tree=null;
        CeriumAST char_literal93_tree=null;
        CeriumAST ID94_tree=null;

        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:170:5: ( primary ( (r= '(' expressionList ')' | r= '[' expr ']' | r= '.' ID ) )* )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:170:9: primary ( (r= '(' expressionList ')' | r= '[' expr ']' | r= '.' ID ) )*
            {
            root_0 = (CeriumAST)adaptor.nil();

            pushFollow(FOLLOW_primary_in_postfixExpression1207);
            primary89=primary();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, primary89.getTree());
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:171:6: ( (r= '(' expressionList ')' | r= '[' expr ']' | r= '.' ID ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==31||LA28_0==54||LA28_0==56) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:172:7: (r= '(' expressionList ')' | r= '[' expr ']' | r= '.' ID )
            	    {
            	    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:172:7: (r= '(' expressionList ')' | r= '[' expr ']' | r= '.' ID )
            	    int alt27=3;
            	    switch ( input.LA(1) ) {
            	    case 31:
            	        {
            	        alt27=1;
            	        }
            	        break;
            	    case 54:
            	        {
            	        alt27=2;
            	        }
            	        break;
            	    case 56:
            	        {
            	        alt27=3;
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
            	            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:172:9: r= '(' expressionList ')'
            	            {
            	            r=(Token)match(input,31,FOLLOW_31_in_postfixExpression1226); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            r_tree = (CeriumAST)adaptor.create(r);
            	            root_0 = (CeriumAST)adaptor.becomeRoot(r_tree, root_0);
            	            }
            	            pushFollow(FOLLOW_expressionList_in_postfixExpression1229);
            	            expressionList90=expressionList();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionList90.getTree());
            	            char_literal91=(Token)match(input,32,FOLLOW_32_in_postfixExpression1231); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	              r.setType(CALL);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:173:9: r= '[' expr ']'
            	            {
            	            r=(Token)match(input,54,FOLLOW_54_in_postfixExpression1246); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            r_tree = (CeriumAST)adaptor.create(r);
            	            root_0 = (CeriumAST)adaptor.becomeRoot(r_tree, root_0);
            	            }
            	            pushFollow(FOLLOW_expr_in_postfixExpression1249);
            	            expr92=expr();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr92.getTree());
            	            char_literal93=(Token)match(input,55,FOLLOW_55_in_postfixExpression1251); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	              r.setType(INDEX);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:174:9: r= '.' ID
            	            {
            	            r=(Token)match(input,56,FOLLOW_56_in_postfixExpression1268); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            r_tree = (CeriumAST)adaptor.create(r);
            	            root_0 = (CeriumAST)adaptor.becomeRoot(r_tree, root_0);
            	            }
            	            ID94=(Token)match(input,ID,FOLLOW_ID_in_postfixExpression1271); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            ID94_tree = (CeriumAST)adaptor.create(ID94);
            	            adaptor.addChild(root_0, ID94_tree);
            	            }

            	            }
            	            break;

            	    }


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
    // $ANTLR end "postfixExpression"

    public static class suffix_return extends ParserRuleReturnScope {
        CeriumAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "suffix"
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:180:1: suffix[CommonTree expr] options {backtrack=true; } : ( '.' ID '(' expressionList ')' -> ^( CALL ^( '.' ID ) ) | '.' ID -> ^( '.' ID ) | '(' expressionList ')' -> ^( CALL ) );
    public final CeriumParser.suffix_return suffix(CommonTree expr) throws RecognitionException {
        CeriumParser.suffix_return retval = new CeriumParser.suffix_return();
        retval.start = input.LT(1);

        CeriumAST root_0 = null;

        Token char_literal95=null;
        Token ID96=null;
        Token char_literal97=null;
        Token char_literal99=null;
        Token char_literal100=null;
        Token ID101=null;
        Token char_literal102=null;
        Token char_literal104=null;
        CeriumParser.expressionList_return expressionList98 = null;

        CeriumParser.expressionList_return expressionList103 = null;


        CeriumAST char_literal95_tree=null;
        CeriumAST ID96_tree=null;
        CeriumAST char_literal97_tree=null;
        CeriumAST char_literal99_tree=null;
        CeriumAST char_literal100_tree=null;
        CeriumAST ID101_tree=null;
        CeriumAST char_literal102_tree=null;
        CeriumAST char_literal104_tree=null;
        RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
        RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
        RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_expressionList=new RewriteRuleSubtreeStream(adaptor,"rule expressionList");
        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:182:2: ( '.' ID '(' expressionList ')' -> ^( CALL ^( '.' ID ) ) | '.' ID -> ^( '.' ID ) | '(' expressionList ')' -> ^( CALL ) )
            int alt29=3;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==56) ) {
                int LA29_1 = input.LA(2);

                if ( (LA29_1==ID) ) {
                    int LA29_3 = input.LA(3);

                    if ( (LA29_3==31) ) {
                        alt29=1;
                    }
                    else if ( (LA29_3==EOF) ) {
                        alt29=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 29, 3, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 29, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA29_0==31) ) {
                alt29=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:182:4: '.' ID '(' expressionList ')'
                    {
                    char_literal95=(Token)match(input,56,FOLLOW_56_in_suffix1310); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_56.add(char_literal95);

                    ID96=(Token)match(input,ID,FOLLOW_ID_in_suffix1312); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID96);

                    char_literal97=(Token)match(input,31,FOLLOW_31_in_suffix1314); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_31.add(char_literal97);

                    pushFollow(FOLLOW_expressionList_in_suffix1316);
                    expressionList98=expressionList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expressionList.add(expressionList98.getTree());
                    char_literal99=(Token)match(input,32,FOLLOW_32_in_suffix1318); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_32.add(char_literal99);



                    // AST REWRITE
                    // elements: ID, 56
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CeriumAST)adaptor.nil();
                    // 182:34: -> ^( CALL ^( '.' ID ) )
                    {
                        // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:182:37: ^( CALL ^( '.' ID ) )
                        {
                        CeriumAST root_1 = (CeriumAST)adaptor.nil();
                        root_1 = (CeriumAST)adaptor.becomeRoot((CeriumAST)adaptor.create(CALL, "CALL"), root_1);

                        // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:182:44: ^( '.' ID )
                        {
                        CeriumAST root_2 = (CeriumAST)adaptor.nil();
                        root_2 = (CeriumAST)adaptor.becomeRoot(stream_56.nextNode(), root_2);

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
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:183:4: '.' ID
                    {
                    char_literal100=(Token)match(input,56,FOLLOW_56_in_suffix1337); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_56.add(char_literal100);

                    ID101=(Token)match(input,ID,FOLLOW_ID_in_suffix1339); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID101);



                    // AST REWRITE
                    // elements: 56, ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CeriumAST)adaptor.nil();
                    // 183:18: -> ^( '.' ID )
                    {
                        // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:183:21: ^( '.' ID )
                        {
                        CeriumAST root_1 = (CeriumAST)adaptor.nil();
                        root_1 = (CeriumAST)adaptor.becomeRoot(stream_56.nextNode(), root_1);

                        adaptor.addChild(root_1, expr);
                        adaptor.addChild(root_1, stream_ID.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:184:4: '(' expressionList ')'
                    {
                    char_literal102=(Token)match(input,31,FOLLOW_31_in_suffix1361); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_31.add(char_literal102);

                    pushFollow(FOLLOW_expressionList_in_suffix1363);
                    expressionList103=expressionList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expressionList.add(expressionList103.getTree());
                    char_literal104=(Token)match(input,32,FOLLOW_32_in_suffix1365); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_32.add(char_literal104);



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
                    // 184:34: -> ^( CALL )
                    {
                        // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:184:37: ^( CALL )
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
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:187:1: primary : ( 'this' | 'super' | ID | INT | FLOAT | CHAR | 'true' | 'false' | '(' expression ')' -> expression );
    public final CeriumParser.primary_return primary() throws RecognitionException {
        CeriumParser.primary_return retval = new CeriumParser.primary_return();
        retval.start = input.LT(1);

        CeriumAST root_0 = null;

        Token string_literal105=null;
        Token string_literal106=null;
        Token ID107=null;
        Token INT108=null;
        Token FLOAT109=null;
        Token CHAR110=null;
        Token string_literal111=null;
        Token string_literal112=null;
        Token char_literal113=null;
        Token char_literal115=null;
        CeriumParser.expression_return expression114 = null;


        CeriumAST string_literal105_tree=null;
        CeriumAST string_literal106_tree=null;
        CeriumAST ID107_tree=null;
        CeriumAST INT108_tree=null;
        CeriumAST FLOAT109_tree=null;
        CeriumAST CHAR110_tree=null;
        CeriumAST string_literal111_tree=null;
        CeriumAST string_literal112_tree=null;
        CeriumAST char_literal113_tree=null;
        CeriumAST char_literal115_tree=null;
        RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
        RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:188:5: ( 'this' | 'super' | ID | INT | FLOAT | CHAR | 'true' | 'false' | '(' expression ')' -> expression )
            int alt30=9;
            switch ( input.LA(1) ) {
            case 57:
                {
                alt30=1;
                }
                break;
            case 58:
                {
                alt30=2;
                }
                break;
            case ID:
                {
                alt30=3;
                }
                break;
            case INT:
                {
                alt30=4;
                }
                break;
            case FLOAT:
                {
                alt30=5;
                }
                break;
            case CHAR:
                {
                alt30=6;
                }
                break;
            case 59:
                {
                alt30=7;
                }
                break;
            case 60:
                {
                alt30=8;
                }
                break;
            case 31:
                {
                alt30=9;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:189:6: 'this'
                    {
                    root_0 = (CeriumAST)adaptor.nil();

                    string_literal105=(Token)match(input,57,FOLLOW_57_in_primary1403); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal105_tree = (CeriumAST)adaptor.create(string_literal105);
                    adaptor.addChild(root_0, string_literal105_tree);
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:190:7: 'super'
                    {
                    root_0 = (CeriumAST)adaptor.nil();

                    string_literal106=(Token)match(input,58,FOLLOW_58_in_primary1411); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal106_tree = (CeriumAST)adaptor.create(string_literal106);
                    adaptor.addChild(root_0, string_literal106_tree);
                    }

                    }
                    break;
                case 3 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:191:7: ID
                    {
                    root_0 = (CeriumAST)adaptor.nil();

                    ID107=(Token)match(input,ID,FOLLOW_ID_in_primary1419); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID107_tree = (CeriumAST)adaptor.create(ID107);
                    adaptor.addChild(root_0, ID107_tree);
                    }

                    }
                    break;
                case 4 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:192:9: INT
                    {
                    root_0 = (CeriumAST)adaptor.nil();

                    INT108=(Token)match(input,INT,FOLLOW_INT_in_primary1429); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INT108_tree = (CeriumAST)adaptor.create(INT108);
                    adaptor.addChild(root_0, INT108_tree);
                    }

                    }
                    break;
                case 5 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:193:7: FLOAT
                    {
                    root_0 = (CeriumAST)adaptor.nil();

                    FLOAT109=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_primary1437); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    FLOAT109_tree = (CeriumAST)adaptor.create(FLOAT109);
                    adaptor.addChild(root_0, FLOAT109_tree);
                    }

                    }
                    break;
                case 6 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:194:7: CHAR
                    {
                    root_0 = (CeriumAST)adaptor.nil();

                    CHAR110=(Token)match(input,CHAR,FOLLOW_CHAR_in_primary1445); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CHAR110_tree = (CeriumAST)adaptor.create(CHAR110);
                    adaptor.addChild(root_0, CHAR110_tree);
                    }

                    }
                    break;
                case 7 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:195:7: 'true'
                    {
                    root_0 = (CeriumAST)adaptor.nil();

                    string_literal111=(Token)match(input,59,FOLLOW_59_in_primary1453); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal111_tree = (CeriumAST)adaptor.create(string_literal111);
                    adaptor.addChild(root_0, string_literal111_tree);
                    }

                    }
                    break;
                case 8 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:196:7: 'false'
                    {
                    root_0 = (CeriumAST)adaptor.nil();

                    string_literal112=(Token)match(input,60,FOLLOW_60_in_primary1461); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal112_tree = (CeriumAST)adaptor.create(string_literal112);
                    adaptor.addChild(root_0, string_literal112_tree);
                    }

                    }
                    break;
                case 9 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:197:9: '(' expression ')'
                    {
                    char_literal113=(Token)match(input,31,FOLLOW_31_in_primary1471); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_31.add(char_literal113);

                    pushFollow(FOLLOW_expression_in_primary1473);
                    expression114=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression114.getTree());
                    char_literal115=(Token)match(input,32,FOLLOW_32_in_primary1475); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_32.add(char_literal115);



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
                    // 197:28: -> expression
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

    // $ANTLR start synpred2_Cerium
    public final void synpred2_Cerium_fragment() throws RecognitionException {   
        // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:100:7: ( varDeclaration )
        // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:100:7: varDeclaration
        {
        pushFollow(FOLLOW_varDeclaration_in_synpred2_Cerium662);
        varDeclaration();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_Cerium

    // $ANTLR start synpred5_Cerium
    public final void synpred5_Cerium_fragment() throws RecognitionException {   
        // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:104:7: ( lhs '=' expression ';' )
        // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:104:7: lhs '=' expression ';'
        {
        pushFollow(FOLLOW_lhs_in_synpred5_Cerium741);
        lhs();

        state._fsp--;
        if (state.failed) return ;
        match(input,ASSIGN,FOLLOW_ASSIGN_in_synpred5_Cerium743); if (state.failed) return ;
        pushFollow(FOLLOW_expression_in_synpred5_Cerium745);
        expression();

        state._fsp--;
        if (state.failed) return ;
        match(input,28,FOLLOW_28_in_synpred5_Cerium747); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred5_Cerium

    // $ANTLR start synpred6_Cerium
    public final void synpred6_Cerium_fragment() throws RecognitionException {   
        CeriumParser.postfixExpression_return a = null;


        // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:105:9: (a= postfixExpression ( '=' expression | ) ';' )
        // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:105:9: a= postfixExpression ( '=' expression | ) ';'
        {
        pushFollow(FOLLOW_postfixExpression_in_synpred6_Cerium769);
        a=postfixExpression();

        state._fsp--;
        if (state.failed) return ;
        // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:106:9: ( '=' expression | )
        int alt33=2;
        int LA33_0 = input.LA(1);

        if ( (LA33_0==ASSIGN) ) {
            alt33=1;
        }
        else if ( (LA33_0==28) ) {
            alt33=2;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 33, 0, input);

            throw nvae;
        }
        switch (alt33) {
            case 1 :
                // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:106:13: '=' expression
                {
                match(input,ASSIGN,FOLLOW_ASSIGN_in_synpred6_Cerium784); if (state.failed) return ;
                pushFollow(FOLLOW_expression_in_synpred6_Cerium786);
                expression();

                state._fsp--;
                if (state.failed) return ;

                }
                break;
            case 2 :
                // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:107:13: 
                {
                }
                break;

        }

        match(input,28,FOLLOW_28_in_synpred6_Cerium836); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred6_Cerium

    // Delegated rules

    public final boolean synpred5_Cerium() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_Cerium_fragment(); // can never throw exception
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


    protected DFA15 dfa15 = new DFA15(this);
    static final String DFA15_eotS =
        "\21\uffff";
    static final String DFA15_eofS =
        "\21\uffff";
    static final String DFA15_minS =
        "\1\22\1\uffff\1\0\2\uffff\2\0\1\uffff\6\0\3\uffff";
    static final String DFA15_maxS =
        "\1\74\1\uffff\1\0\2\uffff\2\0\1\uffff\6\0\3\uffff";
    static final String DFA15_acceptS =
        "\1\uffff\1\1\1\uffff\1\3\1\4\2\uffff\1\2\6\uffff\1\7\1\5\1\6";
    static final String DFA15_specialS =
        "\2\uffff\1\0\2\uffff\1\1\1\2\1\uffff\1\3\1\4\1\5\1\6\1\7\1\10\3"+
        "\uffff}>";
    static final String[] DFA15_transitionS = {
            "\1\2\1\10\1\11\1\12\4\uffff\1\1\1\uffff\1\16\2\uffff\1\15\3"+
            "\uffff\5\7\1\3\1\uffff\1\4\16\uffff\1\5\1\6\1\13\1\14",
            "",
            "\1\uffff",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
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

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "96:1: statement options {backtrack=true; } : ( block | varDeclaration | 'if' '(' expression ')' s= statement ( 'else' e= statement )? -> ^( 'if' expression $s ( $e)? ) | 'return' ( expression )? ';' -> ^( 'return' ( expression )? ) | lhs '=' expression ';' -> ^( '=' lhs expression ) | a= postfixExpression ( '=' expression -> ^( '=' postfixExpression expression ) | -> ^( EXPR postfixExpression ) ) ';' | ';' ->);";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_2 = input.LA(1);

                         
                        int index15_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_Cerium()) ) {s = 7;}

                        else if ( (synpred5_Cerium()) ) {s = 15;}

                        else if ( (synpred6_Cerium()) ) {s = 16;}

                         
                        input.seek(index15_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA15_5 = input.LA(1);

                         
                        int index15_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_Cerium()) ) {s = 15;}

                        else if ( (synpred6_Cerium()) ) {s = 16;}

                         
                        input.seek(index15_5);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA15_6 = input.LA(1);

                         
                        int index15_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_Cerium()) ) {s = 15;}

                        else if ( (synpred6_Cerium()) ) {s = 16;}

                         
                        input.seek(index15_6);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA15_8 = input.LA(1);

                         
                        int index15_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_Cerium()) ) {s = 15;}

                        else if ( (synpred6_Cerium()) ) {s = 16;}

                         
                        input.seek(index15_8);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA15_9 = input.LA(1);

                         
                        int index15_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_Cerium()) ) {s = 15;}

                        else if ( (synpred6_Cerium()) ) {s = 16;}

                         
                        input.seek(index15_9);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA15_10 = input.LA(1);

                         
                        int index15_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_Cerium()) ) {s = 15;}

                        else if ( (synpred6_Cerium()) ) {s = 16;}

                         
                        input.seek(index15_10);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA15_11 = input.LA(1);

                         
                        int index15_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_Cerium()) ) {s = 15;}

                        else if ( (synpred6_Cerium()) ) {s = 16;}

                         
                        input.seek(index15_11);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA15_12 = input.LA(1);

                         
                        int index15_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_Cerium()) ) {s = 15;}

                        else if ( (synpred6_Cerium()) ) {s = 16;}

                         
                        input.seek(index15_12);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA15_13 = input.LA(1);

                         
                        int index15_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_Cerium()) ) {s = 15;}

                        else if ( (synpred6_Cerium()) ) {s = 16;}

                         
                        input.seek(index15_13);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 15, _s, input);
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
    public static final BitSet FOLLOW_26_in_block517 = new BitSet(new long[]{0x1E0005F89C3C0000L});
    public static final BitSet FOLLOW_statement_in_block519 = new BitSet(new long[]{0x1E0005F89C3C0000L});
    public static final BitSet FOLLOW_27_in_block522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_varDeclaration555 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ID_in_varDeclaration557 = new BitSet(new long[]{0x0000000010002000L});
    public static final BitSet FOLLOW_ASSIGN_in_varDeclaration560 = new BitSet(new long[]{0x1E240000803C0000L});
    public static final BitSet FOLLOW_expression_in_varDeclaration562 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_varDeclaration566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_varDeclaration589 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ID_in_varDeclaration591 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_varDeclaration593 = new BitSet(new long[]{0x0000000010002000L});
    public static final BitSet FOLLOW_ASSIGN_in_varDeclaration596 = new BitSet(new long[]{0x1E240000803C0000L});
    public static final BitSet FOLLOW_expression_in_varDeclaration598 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_varDeclaration602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_statement654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDeclaration_in_statement662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_statement670 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_statement672 = new BitSet(new long[]{0x1E240000803C0000L});
    public static final BitSet FOLLOW_expression_in_statement674 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_statement676 = new BitSet(new long[]{0x1E0005F8943C0000L});
    public static final BitSet FOLLOW_statement_in_statement680 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_41_in_statement683 = new BitSet(new long[]{0x1E0005F8943C0000L});
    public static final BitSet FOLLOW_statement_in_statement687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_statement719 = new BitSet(new long[]{0x1E240000903C0000L});
    public static final BitSet FOLLOW_expression_in_statement721 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_statement724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lhs_in_statement741 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ASSIGN_in_statement743 = new BitSet(new long[]{0x1E240000803C0000L});
    public static final BitSet FOLLOW_expression_in_statement745 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_statement747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postfixExpression_in_statement769 = new BitSet(new long[]{0x0000000010002000L});
    public static final BitSet FOLLOW_ASSIGN_in_statement784 = new BitSet(new long[]{0x1E240000803C0000L});
    public static final BitSet FOLLOW_expression_in_statement786 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_statement836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_statement845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postfixExpression_in_lhs864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expressionList891 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_expressionList894 = new BitSet(new long[]{0x1E240000803C0000L});
    public static final BitSet FOLLOW_expr_in_expressionList896 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_expr_in_expression944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_equalityExpression_in_expr970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression992 = new BitSet(new long[]{0x0000180000000002L});
    public static final BitSet FOLLOW_43_in_equalityExpression996 = new BitSet(new long[]{0x1E240000803C0000L});
    public static final BitSet FOLLOW_44_in_equalityExpression1001 = new BitSet(new long[]{0x1E240000803C0000L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression1005 = new BitSet(new long[]{0x0000180000000002L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression1021 = new BitSet(new long[]{0x0001E00000000002L});
    public static final BitSet FOLLOW_45_in_relationalExpression1031 = new BitSet(new long[]{0x1E240000803C0000L});
    public static final BitSet FOLLOW_46_in_relationalExpression1040 = new BitSet(new long[]{0x1E240000803C0000L});
    public static final BitSet FOLLOW_47_in_relationalExpression1049 = new BitSet(new long[]{0x1E240000803C0000L});
    public static final BitSet FOLLOW_48_in_relationalExpression1058 = new BitSet(new long[]{0x1E240000803C0000L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression1071 = new BitSet(new long[]{0x0001E00000000002L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression1095 = new BitSet(new long[]{0x0006000000000002L});
    public static final BitSet FOLLOW_49_in_additiveExpression1099 = new BitSet(new long[]{0x1E240000803C0000L});
    public static final BitSet FOLLOW_50_in_additiveExpression1104 = new BitSet(new long[]{0x1E240000803C0000L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression1108 = new BitSet(new long[]{0x0006000000000002L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression1124 = new BitSet(new long[]{0x0018000000000002L});
    public static final BitSet FOLLOW_51_in_multiplicativeExpression1128 = new BitSet(new long[]{0x1E240000803C0000L});
    public static final BitSet FOLLOW_52_in_multiplicativeExpression1133 = new BitSet(new long[]{0x1E240000803C0000L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression1137 = new BitSet(new long[]{0x0018000000000002L});
    public static final BitSet FOLLOW_50_in_unaryExpression1155 = new BitSet(new long[]{0x1E240000803C0000L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression1157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_unaryExpression1173 = new BitSet(new long[]{0x1E240000803C0000L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression1175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postfixExpression_in_unaryExpression1189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_in_postfixExpression1207 = new BitSet(new long[]{0x0140000080000002L});
    public static final BitSet FOLLOW_31_in_postfixExpression1226 = new BitSet(new long[]{0x1E240001803C0000L});
    public static final BitSet FOLLOW_expressionList_in_postfixExpression1229 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_postfixExpression1231 = new BitSet(new long[]{0x0140000080000002L});
    public static final BitSet FOLLOW_54_in_postfixExpression1246 = new BitSet(new long[]{0x1E240000803C0000L});
    public static final BitSet FOLLOW_expr_in_postfixExpression1249 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_postfixExpression1251 = new BitSet(new long[]{0x0140000080000002L});
    public static final BitSet FOLLOW_56_in_postfixExpression1268 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ID_in_postfixExpression1271 = new BitSet(new long[]{0x0140000080000002L});
    public static final BitSet FOLLOW_56_in_suffix1310 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ID_in_suffix1312 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_suffix1314 = new BitSet(new long[]{0x1E240001803C0000L});
    public static final BitSet FOLLOW_expressionList_in_suffix1316 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_suffix1318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_suffix1337 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ID_in_suffix1339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_suffix1361 = new BitSet(new long[]{0x1E240001803C0000L});
    public static final BitSet FOLLOW_expressionList_in_suffix1363 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_suffix1365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_primary1403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_primary1411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_primary1419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_primary1429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_primary1437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_primary1445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_primary1453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_primary1461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_primary1471 = new BitSet(new long[]{0x1E240000803C0000L});
    public static final BitSet FOLLOW_expression_in_primary1473 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_primary1475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDeclaration_in_synpred2_Cerium662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lhs_in_synpred5_Cerium741 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ASSIGN_in_synpred5_Cerium743 = new BitSet(new long[]{0x1E240000803C0000L});
    public static final BitSet FOLLOW_expression_in_synpred5_Cerium745 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_synpred5_Cerium747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postfixExpression_in_synpred6_Cerium769 = new BitSet(new long[]{0x0000000010002000L});
    public static final BitSet FOLLOW_ASSIGN_in_synpred6_Cerium784 = new BitSet(new long[]{0x1E240000803C0000L});
    public static final BitSet FOLLOW_expression_in_synpred6_Cerium786 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_synpred6_Cerium836 = new BitSet(new long[]{0x0000000000000002L});

}