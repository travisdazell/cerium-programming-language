// $ANTLR 3.2 Sep 23, 2009 12:02:23 C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Def.g 2015-02-10 15:00:42

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class Def extends TreeFilter {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "METHOD_DECL", "ARG_DECL", "BLOCK", "MEMBERS", "VAR_DECL", "FIELD_DECL", "CALL", "ELIST", "EXPR", "ASSIGN", "EXTENDS", "UNARY_MINUS", "UNARY_NOT", "INDEX", "ID", "INT", "FLOAT", "CHAR", "LETTER", "WS", "SL_COMMENT", "'import'", "'.'", "'.*'", "';'", "'package'", "'class'", "'{'", "'}'", "'extends'", "'def'", "'('", "')'", "':'", "'private'", "'protected'", "','", "'[]'", "'float'", "'int'", "'void'", "'char'", "'boolean'", "'if'", "'else'", "'while'", "'loop'", "'times'", "'return'", "'!='", "'=='", "'<'", "'>'", "'<='", "'>='", "'+'", "'-'", "'*'", "'/'", "'!'", "'['", "']'", "'true'", "'false'", "'this'"
    };
    public static final int T__68=68;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__29=29;
    public static final int T__64=64;
    public static final int T__28=28;
    public static final int T__65=65;
    public static final int T__62=62;
    public static final int T__27=27;
    public static final int T__63=63;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int LETTER=22;
    public static final int ARG_DECL=5;
    public static final int CHAR=21;
    public static final int METHOD_DECL=4;
    public static final int VAR_DECL=8;
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
    public static final int MEMBERS=7;
    public static final int FIELD_DECL=9;
    public static final int UNARY_MINUS=15;
    public static final int INT=19;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int WS=23;
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


        public Def(TreeNodeStream input) {
            this(input, new RecognizerSharedState());
        }
        public Def(TreeNodeStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return Def.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Def.g"; }


        SymbolTable symtab;
        Scope currentScope;
        MethodSymbol currentMethod;
        public Def(TreeNodeStream input, SymbolTable symtab) {
            this(input);
            this.symtab = symtab;
            currentScope = symtab.globals;
        }



    // $ANTLR start "topdown"
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Def.g:21:1: topdown : ( enterBlock | enterMethod | enterClass | varDeclaration | ret | atoms );
    public final void topdown() throws RecognitionException {
        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Def.g:22:5: ( enterBlock | enterMethod | enterClass | varDeclaration | ret | atoms )
            int alt1=6;
            switch ( input.LA(1) ) {
            case BLOCK:
                {
                alt1=1;
                }
                break;
            case METHOD_DECL:
                {
                alt1=2;
                }
                break;
            case 30:
                {
                alt1=3;
                }
                break;
            case ARG_DECL:
            case VAR_DECL:
            case FIELD_DECL:
                {
                alt1=4;
                }
                break;
            case 52:
                {
                alt1=5;
                }
                break;
            case ID:
            case 68:
                {
                alt1=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Def.g:22:9: enterBlock
                    {
                    pushFollow(FOLLOW_enterBlock_in_topdown57);
                    enterBlock();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Def.g:23:9: enterMethod
                    {
                    pushFollow(FOLLOW_enterMethod_in_topdown67);
                    enterMethod();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Def.g:24:9: enterClass
                    {
                    pushFollow(FOLLOW_enterClass_in_topdown77);
                    enterClass();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Def.g:25:9: varDeclaration
                    {
                    pushFollow(FOLLOW_varDeclaration_in_topdown87);
                    varDeclaration();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Def.g:26:7: ret
                    {
                    pushFollow(FOLLOW_ret_in_topdown95);
                    ret();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Def.g:27:9: atoms
                    {
                    pushFollow(FOLLOW_atoms_in_topdown105);
                    atoms();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "topdown"


    // $ANTLR start "bottomup"
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Def.g:30:1: bottomup : ( exitBlock | exitMethod | exitClass );
    public final void bottomup() throws RecognitionException {
        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Def.g:31:5: ( exitBlock | exitMethod | exitClass )
            int alt2=3;
            switch ( input.LA(1) ) {
            case BLOCK:
                {
                alt2=1;
                }
                break;
            case METHOD_DECL:
                {
                alt2=2;
                }
                break;
            case 30:
                {
                alt2=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Def.g:31:9: exitBlock
                    {
                    pushFollow(FOLLOW_exitBlock_in_bottomup124);
                    exitBlock();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Def.g:32:9: exitMethod
                    {
                    pushFollow(FOLLOW_exitMethod_in_bottomup134);
                    exitMethod();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Def.g:33:9: exitClass
                    {
                    pushFollow(FOLLOW_exitClass_in_bottomup144);
                    exitClass();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "bottomup"


    // $ANTLR start "enterBlock"
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Def.g:38:1: enterBlock : BLOCK ;
    public final void enterBlock() throws RecognitionException {
        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Def.g:39:5: ( BLOCK )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Def.g:40:6: BLOCK
            {
            match(input,BLOCK,FOLLOW_BLOCK_in_enterBlock168); if (state.failed) return ;
            if ( state.backtracking==1 ) {
              currentScope = new LocalScope(currentScope);
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "enterBlock"


    // $ANTLR start "exitBlock"
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Def.g:43:1: exitBlock : BLOCK ;
    public final void exitBlock() throws RecognitionException {
        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Def.g:44:5: ( BLOCK )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Def.g:45:6: BLOCK
            {
            match(input,BLOCK,FOLLOW_BLOCK_in_exitBlock196); if (state.failed) return ;
            if ( state.backtracking==1 ) {

                      System.out.println("locals: "+currentScope);
                      currentScope = currentScope.getEnclosingScope();    // pop scope
                      
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "exitBlock"


    // $ANTLR start "enterClass"
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Def.g:53:1: enterClass : ^( 'class' name= ID ( ^( EXTENDS sup= ID ) )? . ) ;
    public final void enterClass() throws RecognitionException {
        CeriumAST name=null;
        CeriumAST sup=null;

        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Def.g:54:5: ( ^( 'class' name= ID ( ^( EXTENDS sup= ID ) )? . ) )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Def.g:55:6: ^( 'class' name= ID ( ^( EXTENDS sup= ID ) )? . )
            {
            match(input,30,FOLLOW_30_in_enterClass233); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            name=(CeriumAST)match(input,ID,FOLLOW_ID_in_enterClass237); if (state.failed) return ;
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Def.g:55:24: ( ^( EXTENDS sup= ID ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==EXTENDS) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==DOWN) ) {
                    int LA3_3 = input.LA(3);

                    if ( (LA3_3==ID) ) {
                        int LA3_4 = input.LA(4);

                        if ( (LA3_4==UP) ) {
                            int LA3_5 = input.LA(5);

                            if ( ((LA3_5>=METHOD_DECL && LA3_5<=68)) ) {
                                alt3=1;
                            }
                        }
                    }
                }
            }
            switch (alt3) {
                case 1 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Def.g:55:25: ^( EXTENDS sup= ID )
                    {
                    match(input,EXTENDS,FOLLOW_EXTENDS_in_enterClass241); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    sup=(CeriumAST)match(input,ID,FOLLOW_ID_in_enterClass245); if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;

                    }
                    break;

            }

            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;
            if ( state.backtracking==1 ) {
               // def class but leave superclass blank until ref phase
                      System.out.println("line "+name.getLine()+
                                         ": def class "+(name!=null?name.getText():null));
                      // record scope in AST for next pass
                      if ( sup!=null ) sup.scope = currentScope;
                      ClassSymbol cs = new ClassSymbol((name!=null?name.getText():null),currentScope,null);
                      cs.def = name;           // point from symbol table into AST
                      name.symbol = cs;        // point from AST into symbol table
                      currentScope.define(cs);  // def class in current scope
                      currentScope = cs;        // set current scope to class scope
                      
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "enterClass"


    // $ANTLR start "exitClass"
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Def.g:70:1: exitClass : 'class' ;
    public final void exitClass() throws RecognitionException {
        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Def.g:71:5: ( 'class' )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Def.g:71:9: 'class'
            {
            match(input,30,FOLLOW_30_in_exitClass281); if (state.failed) return ;
            if ( state.backtracking==1 ) {

                      System.out.println("members: "+currentScope);
                      currentScope = currentScope.getEnclosingScope();    // pop scope
                      
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "exitClass"


    // $ANTLR start "enterMethod"
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Def.g:78:1: enterMethod : ^( METHOD_DECL type ID ( . )* ) ;
    public final void enterMethod() throws RecognitionException {
        CeriumAST ID1=null;

        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Def.g:79:5: ( ^( METHOD_DECL type ID ( . )* ) )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Def.g:79:9: ^( METHOD_DECL type ID ( . )* )
            {
            match(input,METHOD_DECL,FOLLOW_METHOD_DECL_in_enterMethod311); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_type_in_enterMethod313);
            type();

            state._fsp--;
            if (state.failed) return ;
            ID1=(CeriumAST)match(input,ID,FOLLOW_ID_in_enterMethod315); if (state.failed) return ;
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Def.g:79:31: ( . )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=METHOD_DECL && LA4_0<=68)) ) {
                    alt4=1;
                }
                else if ( (LA4_0==UP) ) {
                    alt4=2;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Def.g:79:31: .
            	    {
            	    matchAny(input); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            match(input, Token.UP, null); if (state.failed) return ;
            if ( state.backtracking==1 ) {

                      System.out.println("line "+ID1.getLine()+": def method "+(ID1!=null?ID1.getText():null));
                      MethodSymbol ms = new MethodSymbol((ID1!=null?ID1.getText():null),null,currentScope);
                      ms.def = ID1;            // track AST location of def's ID
                      ID1.symbol = ms;         // track in AST
                      currentScope.define(ms); // def method in globals
                      currentScope = ms;       // set current scope to method scope
                      
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "enterMethod"


    // $ANTLR start "exitMethod"
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Def.g:90:1: exitMethod : METHOD_DECL ;
    public final void exitMethod() throws RecognitionException {
        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Def.g:91:5: ( METHOD_DECL )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Def.g:91:9: METHOD_DECL
            {
            match(input,METHOD_DECL,FOLLOW_METHOD_DECL_in_exitMethod353); if (state.failed) return ;
            if ( state.backtracking==1 ) {

                      System.out.println("args: "+currentScope);
                      currentScope = currentScope.getEnclosingScope();    // pop arg scope
                      
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "exitMethod"

    public static class ret_return extends TreeRuleReturnScope {
    };

    // $ANTLR start "ret"
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Def.g:98:1: ret : ^( 'return' . ) ;
    public final Def.ret_return ret() throws RecognitionException {
        Def.ret_return retval = new Def.ret_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Def.g:99:5: ( ^( 'return' . ) )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Def.g:100:3: ^( 'return' . )
            {
            match(input,52,FOLLOW_52_in_ret382); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            matchAny(input); if (state.failed) return retval;

            match(input, Token.UP, null); if (state.failed) return retval;
            if ( state.backtracking==1 ) {
              ((CeriumAST)retval.start).symbol = currentMethod;
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "ret"


    // $ANTLR start "atoms"
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Def.g:104:1: atoms : {...}? ( 'this' | ID ) ;
    public final void atoms() throws RecognitionException {
        CeriumAST t = (CeriumAST)input.LT(1);
        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Def.g:107:5: ({...}? ( 'this' | ID ) )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Def.g:107:8: {...}? ( 'this' | ID )
            {
            if ( !((t.hasAncestor(EXPR)||t.hasAncestor(ASSIGN))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "atoms", "t.hasAncestor(EXPR)||t.hasAncestor(ASSIGN)");
            }
            if ( input.LA(1)==ID||input.LA(1)==68 ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            if ( state.backtracking==1 ) {
              t.scope = currentScope;
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "atoms"


    // $ANTLR start "varDeclaration"
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Def.g:113:1: varDeclaration : ^( ( FIELD_DECL | VAR_DECL | ARG_DECL ) type ID ( . )? ) ;
    public final void varDeclaration() throws RecognitionException {
        CeriumAST ID2=null;

        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Def.g:114:5: ( ^( ( FIELD_DECL | VAR_DECL | ARG_DECL ) type ID ( . )? ) )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Def.g:114:9: ^( ( FIELD_DECL | VAR_DECL | ARG_DECL ) type ID ( . )? )
            {
            if ( input.LA(1)==ARG_DECL||(input.LA(1)>=VAR_DECL && input.LA(1)<=FIELD_DECL) ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_type_in_varDeclaration456);
            type();

            state._fsp--;
            if (state.failed) return ;
            ID2=(CeriumAST)match(input,ID,FOLLOW_ID_in_varDeclaration458); if (state.failed) return ;
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Def.g:114:50: ( . )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=METHOD_DECL && LA5_0<=68)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Def.g:114:50: .
                    {
                    matchAny(input); if (state.failed) return ;

                    }
                    break;

            }


            match(input, Token.UP, null); if (state.failed) return ;
            if ( state.backtracking==1 ) {

                      System.out.println("line "+ID2.getLine()+": def "+(ID2!=null?ID2.getText():null));
                      VariableSymbol vs = new VariableSymbol((ID2!=null?ID2.getText():null),null);
                      vs.def = ID2;            // track AST location of def's ID
                      ID2.symbol = vs;         // track in AST
                      currentScope.define(vs);
                      
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "varDeclaration"


    // $ANTLR start "type"
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Def.g:125:1: type returns [Type type] : ( ^( '[]' typeElement ) | typeElement );
    public final Type type() throws RecognitionException {
        Type type = null;

        Type typeElement3 = null;

        Type typeElement4 = null;


        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Def.g:127:2: ( ^( '[]' typeElement ) | typeElement )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==41) ) {
                alt6=1;
            }
            else if ( (LA6_0==ID||(LA6_0>=42 && LA6_0<=46)) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return type;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Def.g:127:4: ^( '[]' typeElement )
                    {
                    match(input,41,FOLLOW_41_in_type494); if (state.failed) return type;

                    match(input, Token.DOWN, null); if (state.failed) return type;
                    pushFollow(FOLLOW_typeElement_in_type496);
                    typeElement3=typeElement();

                    state._fsp--;
                    if (state.failed) return type;

                    match(input, Token.UP, null); if (state.failed) return type;
                    if ( state.backtracking==1 ) {
                      type = new ArrayType(typeElement3);
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Def.g:128:4: typeElement
                    {
                    pushFollow(FOLLOW_typeElement_in_type504);
                    typeElement4=typeElement();

                    state._fsp--;
                    if (state.failed) return type;
                    if ( state.backtracking==1 ) {
                      type = typeElement4;
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return type;
    }
    // $ANTLR end "type"


    // $ANTLR start "typeElement"
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Def.g:131:1: typeElement returns [Type type] : ( 'float' | 'int' | 'char' | 'boolean' | 'void' | ID );
    public final Type typeElement() throws RecognitionException {
        Type type = null;

        CeriumAST t = (CeriumAST)input.LT(1);
        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Def.g:138:5: ( 'float' | 'int' | 'char' | 'boolean' | 'void' | ID )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Def.g:
            {
            if ( input.LA(1)==ID||(input.LA(1)>=42 && input.LA(1)<=46) ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return type;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            if ( state.backtracking==1 ) {

                  t.symbol = currentScope.resolve(t.getText()); // return Type
                  t.scope = currentScope;
                  type = (Type)t.symbol;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return type;
    }
    // $ANTLR end "typeElement"

    // Delegated rules


 

    public static final BitSet FOLLOW_enterBlock_in_topdown57 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enterMethod_in_topdown67 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enterClass_in_topdown77 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDeclaration_in_topdown87 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ret_in_topdown95 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atoms_in_topdown105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exitBlock_in_bottomup124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exitMethod_in_bottomup134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exitClass_in_bottomup144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BLOCK_in_enterBlock168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BLOCK_in_exitBlock196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_enterClass233 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_enterClass237 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x000000000000001FL});
    public static final BitSet FOLLOW_EXTENDS_in_enterClass241 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_enterClass245 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_30_in_exitClass281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_METHOD_DECL_in_enterMethod311 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_enterMethod313 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ID_in_enterMethod315 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF8L,0x000000000000001FL});
    public static final BitSet FOLLOW_METHOD_DECL_in_exitMethod353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ret382 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_set_in_atoms412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_varDeclaration448 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_varDeclaration456 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ID_in_varDeclaration458 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF8L,0x000000000000001FL});
    public static final BitSet FOLLOW_41_in_type494 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeElement_in_type496 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_typeElement_in_type504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_typeElement0 = new BitSet(new long[]{0x0000000000000002L});

}