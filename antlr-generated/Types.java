// $ANTLR 3.2 Sep 23, 2009 12:02:23 C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g 2014-12-20 19:26:44

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class Types extends TreeFilter {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "METHOD_DECL", "ARG_DECL", "BLOCK", "MEMBERS", "VAR_DECL", "FIELD_DECL", "CALL", "ELIST", "EXPR", "ASSIGN", "EXTENDS", "ID", "INT", "LETTER", "WS", "SL_COMMENT", "'class'", "'{'", "'}'", "';'", "':'", "'public'", "'('", "')'", "','", "'float'", "'int'", "'void'", "'char'", "'return'", "'+'", "'.'", "'this'", "'super'", "CHAR", "FLOAT", "UNARY_MINUS", "UNARY_NOT", "INDEX", "'true'", "'false'", "'-'", "'*'", "'/'", "'<'", "'>'", "'<='", "'>='", "'!='", "'=='"
    };
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int LETTER=17;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int ARG_DECL=5;
    public static final int CHAR=38;
    public static final int METHOD_DECL=4;
    public static final int VAR_DECL=8;
    public static final int FLOAT=39;
    public static final int ID=15;
    public static final int EOF=-1;
    public static final int INDEX=42;
    public static final int T__51=51;
    public static final int EXPR=12;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int ELIST=11;
    public static final int UNARY_NOT=41;
    public static final int T__50=50;
    public static final int T__43=43;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int MEMBERS=7;
    public static final int FIELD_DECL=9;
    public static final int UNARY_MINUS=40;
    public static final int INT=16;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int WS=18;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int BLOCK=6;
    public static final int SL_COMMENT=19;
    public static final int ASSIGN=13;
    public static final int CALL=10;
    public static final int EXTENDS=14;

    // delegates
    // delegators


        public Types(TreeNodeStream input) {
            this(input, new RecognizerSharedState());
        }
        public Types(TreeNodeStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return Types.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g"; }


        SymbolTable symtab;
        public Types(TreeNodeStream input, SymbolTable symtab) {
            this(input);
            this.symtab = symtab;
        }



    // $ANTLR start "bottomup"
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:18:1: bottomup : exprRoot ;
    public final void bottomup() throws RecognitionException {
        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:19:5: ( exprRoot )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:20:6: exprRoot
            {
            pushFollow(FOLLOW_exprRoot_in_bottomup64);
            exprRoot();

            state._fsp--;
            if (state.failed) return ;

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


    // $ANTLR start "exprRoot"
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:23:1: exprRoot : ^( EXPR expr ) ;
    public final void exprRoot() throws RecognitionException {
        CeriumAST EXPR1=null;
        Types.expr_return expr2 = null;


        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:24:5: ( ^( EXPR expr ) )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:25:6: ^( EXPR expr )
            {
            EXPR1=(CeriumAST)match(input,EXPR,FOLLOW_EXPR_in_exprRoot92); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_expr_in_exprRoot94);
            expr2=expr();

            state._fsp--;
            if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;
            if ( state.backtracking==1 ) {
              EXPR1.evalType = (expr2!=null?expr2.type:null);
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
    // $ANTLR end "exprRoot"

    public static class expr_return extends TreeRuleReturnScope {
        public Type type;
    };

    // $ANTLR start "expr"
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:30:1: expr returns [Type type] : ( 'true' | 'false' | CHAR | INT | FLOAT | ID | ^( UNARY_MINUS a= expr ) | ^( UNARY_NOT a= expr ) | member | arrayRef | call | binaryOps );
    public final Types.expr_return expr() throws RecognitionException {
        Types.expr_return retval = new Types.expr_return();
        retval.start = input.LT(1);

        CeriumAST ID3=null;
        Types.expr_return a = null;

        Types.member_return member4 = null;

        Types.arrayRef_return arrayRef5 = null;

        Types.call_return call6 = null;

        Types.binaryOps_return binaryOps7 = null;


        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:32:5: ( 'true' | 'false' | CHAR | INT | FLOAT | ID | ^( UNARY_MINUS a= expr ) | ^( UNARY_NOT a= expr ) | member | arrayRef | call | binaryOps )
            int alt1=12;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt1=1;
                }
                break;
            case 44:
                {
                alt1=2;
                }
                break;
            case CHAR:
                {
                alt1=3;
                }
                break;
            case INT:
                {
                alt1=4;
                }
                break;
            case FLOAT:
                {
                alt1=5;
                }
                break;
            case ID:
                {
                alt1=6;
                }
                break;
            case UNARY_MINUS:
                {
                alt1=7;
                }
                break;
            case UNARY_NOT:
                {
                alt1=8;
                }
                break;
            case 35:
                {
                alt1=9;
                }
                break;
            case INDEX:
                {
                alt1=10;
                }
                break;
            case CALL:
                {
                alt1=11;
                }
                break;
            case 34:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
                {
                alt1=12;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:33:6: 'true'
                    {
                    match(input,43,FOLLOW_43_in_expr135); if (state.failed) return retval;
                    if ( state.backtracking==1 ) {
                      retval.type = SymbolTable._boolean;
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:34:9: 'false'
                    {
                    match(input,44,FOLLOW_44_in_expr152); if (state.failed) return retval;
                    if ( state.backtracking==1 ) {
                      retval.type = SymbolTable._boolean;
                    }

                    }
                    break;
                case 3 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:35:9: CHAR
                    {
                    match(input,CHAR,FOLLOW_CHAR_in_expr168); if (state.failed) return retval;
                    if ( state.backtracking==1 ) {
                      retval.type = SymbolTable._char;
                    }

                    }
                    break;
                case 4 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:36:9: INT
                    {
                    match(input,INT,FOLLOW_INT_in_expr187); if (state.failed) return retval;
                    if ( state.backtracking==1 ) {
                      retval.type = SymbolTable._int;
                    }

                    }
                    break;
                case 5 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:37:9: FLOAT
                    {
                    match(input,FLOAT,FOLLOW_FLOAT_in_expr207); if (state.failed) return retval;
                    if ( state.backtracking==1 ) {
                      retval.type = SymbolTable._float;
                    }

                    }
                    break;
                case 6 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:38:9: ID
                    {
                    ID3=(CeriumAST)match(input,ID,FOLLOW_ID_in_expr225); if (state.failed) return retval;
                    if ( state.backtracking==1 ) {
                      VariableSymbol s=(VariableSymbol)ID3.scope.resolve((ID3!=null?ID3.getText():null));
                                  ID3.symbol = s; retval.type = s.type;
                    }

                    }
                    break;
                case 7 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:40:9: ^( UNARY_MINUS a= expr )
                    {
                    match(input,UNARY_MINUS,FOLLOW_UNARY_MINUS_in_expr238); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr242);
                    a=expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==1 ) {
                      retval.type =symtab.uminus((a!=null?((CeriumAST)a.start):null));
                    }

                    }
                    break;
                case 8 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:41:9: ^( UNARY_NOT a= expr )
                    {
                    match(input,UNARY_NOT,FOLLOW_UNARY_NOT_in_expr258); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr262);
                    a=expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==1 ) {
                      retval.type =symtab.unot((a!=null?((CeriumAST)a.start):null));
                    }

                    }
                    break;
                case 9 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:42:9: member
                    {
                    pushFollow(FOLLOW_member_in_expr279);
                    member4=member();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==1 ) {
                      retval.type = (member4!=null?member4.type:null);
                    }

                    }
                    break;
                case 10 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:43:9: arrayRef
                    {
                    pushFollow(FOLLOW_arrayRef_in_expr296);
                    arrayRef5=arrayRef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==1 ) {
                      retval.type = (arrayRef5!=null?arrayRef5.type:null);
                    }

                    }
                    break;
                case 11 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:44:9: call
                    {
                    pushFollow(FOLLOW_call_in_expr311);
                    call6=call();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==1 ) {
                      retval.type = (call6!=null?call6.type:null);
                    }

                    }
                    break;
                case 12 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:45:9: binaryOps
                    {
                    pushFollow(FOLLOW_binaryOps_in_expr330);
                    binaryOps7=binaryOps();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==1 ) {
                      retval.type = (binaryOps7!=null?binaryOps7.type:null);
                    }

                    }
                    break;

            }
            if ( state.backtracking==1 ) {
               ((CeriumAST)retval.start).evalType = retval.type; 
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
    // $ANTLR end "expr"

    public static class binaryOps_return extends TreeRuleReturnScope {
        public Type type;
    };

    // $ANTLR start "binaryOps"
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:50:1: binaryOps returns [Type type] : ( ^( bop a= expr b= expr ) | ^( relop a= expr b= expr ) | ^( eqop a= expr b= expr ) );
    public final Types.binaryOps_return binaryOps() throws RecognitionException {
        Types.binaryOps_return retval = new Types.binaryOps_return();
        retval.start = input.LT(1);

        Types.expr_return a = null;

        Types.expr_return b = null;


        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:52:5: ( ^( bop a= expr b= expr ) | ^( relop a= expr b= expr ) | ^( eqop a= expr b= expr ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 34:
            case 45:
            case 46:
            case 47:
                {
                alt2=1;
                }
                break;
            case 48:
            case 49:
            case 50:
            case 51:
                {
                alt2=2;
                }
                break;
            case 52:
            case 53:
                {
                alt2=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:53:6: ^( bop a= expr b= expr )
                    {
                    pushFollow(FOLLOW_bop_in_binaryOps368);
                    bop();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_binaryOps372);
                    a=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_binaryOps376);
                    b=expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==1 ) {
                      retval.type =symtab.bop((a!=null?((CeriumAST)a.start):null), (b!=null?((CeriumAST)b.start):null));
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:54:9: ^( relop a= expr b= expr )
                    {
                    pushFollow(FOLLOW_relop_in_binaryOps392);
                    relop();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_binaryOps396);
                    a=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_binaryOps400);
                    b=expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==1 ) {
                      retval.type =symtab.relop((a!=null?((CeriumAST)a.start):null), (b!=null?((CeriumAST)b.start):null));
                    }

                    }
                    break;
                case 3 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:55:9: ^( eqop a= expr b= expr )
                    {
                    pushFollow(FOLLOW_eqop_in_binaryOps414);
                    eqop();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_binaryOps418);
                    a=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_binaryOps422);
                    b=expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==1 ) {
                      retval.type =symtab.eqop((a!=null?((CeriumAST)a.start):null), (b!=null?((CeriumAST)b.start):null));
                    }

                    }
                    break;

            }
            if ( state.backtracking==1 ) {
               ((CeriumAST)retval.start).evalType = retval.type; 
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
    // $ANTLR end "binaryOps"

    public static class arrayRef_return extends TreeRuleReturnScope {
        public Type type;
    };

    // $ANTLR start "arrayRef"
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:60:1: arrayRef returns [Type type] : ^( INDEX ID expr ) ;
    public final Types.arrayRef_return arrayRef() throws RecognitionException {
        Types.arrayRef_return retval = new Types.arrayRef_return();
        retval.start = input.LT(1);

        CeriumAST ID8=null;
        Types.expr_return expr9 = null;


        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:61:5: ( ^( INDEX ID expr ) )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:62:6: ^( INDEX ID expr )
            {
            match(input,INDEX,FOLLOW_INDEX_in_arrayRef458); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            ID8=(CeriumAST)match(input,ID,FOLLOW_ID_in_arrayRef460); if (state.failed) return retval;
            pushFollow(FOLLOW_expr_in_arrayRef462);
            expr9=expr();

            state._fsp--;
            if (state.failed) return retval;

            match(input, Token.UP, null); if (state.failed) return retval;
            if ( state.backtracking==1 ) {

                      retval.type = symtab.arrayIndex(ID8, (expr9!=null?((CeriumAST)expr9.start):null));
                      ((CeriumAST)retval.start).evalType = retval.type; // save computed type
                      
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
    // $ANTLR end "arrayRef"

    public static class call_return extends TreeRuleReturnScope {
        public Type type;
    };

    // $ANTLR start "call"
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:71:1: call returns [Type type] : ^( CALL ID ^( ELIST ( expr )* ) ) ;
    public final Types.call_return call() throws RecognitionException {
        Types.call_return retval = new Types.call_return();
        retval.start = input.LT(1);

        CeriumAST ID11=null;
        Types.expr_return expr10 = null;


        List args = new ArrayList();
        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:73:5: ( ^( CALL ID ^( ELIST ( expr )* ) ) )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:74:6: ^( CALL ID ^( ELIST ( expr )* ) )
            {
            match(input,CALL,FOLLOW_CALL_in_call507); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            ID11=(CeriumAST)match(input,ID,FOLLOW_ID_in_call509); if (state.failed) return retval;
            match(input,ELIST,FOLLOW_ELIST_in_call512); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:74:24: ( expr )*
                loop3:
                do {
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==CALL||(LA3_0>=ID && LA3_0<=INT)||(LA3_0>=34 && LA3_0<=35)||(LA3_0>=CHAR && LA3_0<=53)) ) {
                        alt3=1;
                    }


                    switch (alt3) {
                	case 1 :
                	    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:74:25: expr
                	    {
                	    pushFollow(FOLLOW_expr_in_call515);
                	    expr10=expr();

                	    state._fsp--;
                	    if (state.failed) return retval;
                	    if ( state.backtracking==1 ) {
                	      args.add((expr10!=null?((CeriumAST)expr10.start):null));
                	    }

                	    }
                	    break;

                	default :
                	    break loop3;
                    }
                } while (true);


                match(input, Token.UP, null); if (state.failed) return retval;
            }

            match(input, Token.UP, null); if (state.failed) return retval;
            if ( state.backtracking==1 ) {

                      retval.type = symtab.call(ID11, args);
                      ((CeriumAST)retval.start).evalType = retval.type;
                      
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
    // $ANTLR end "call"

    public static class member_return extends TreeRuleReturnScope {
        public Type type;
    };

    // $ANTLR start "member"
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:83:1: member returns [Type type] : ^( '.' expr ID ) ;
    public final Types.member_return member() throws RecognitionException {
        Types.member_return retval = new Types.member_return();
        retval.start = input.LT(1);

        CeriumAST ID13=null;
        Types.expr_return expr12 = null;


        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:84:5: ( ^( '.' expr ID ) )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:85:6: ^( '.' expr ID )
            {
            match(input,35,FOLLOW_35_in_member563); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_expr_in_member565);
            expr12=expr();

            state._fsp--;
            if (state.failed) return retval;
            ID13=(CeriumAST)match(input,ID,FOLLOW_ID_in_member567); if (state.failed) return retval;

            match(input, Token.UP, null); if (state.failed) return retval;
            if ( state.backtracking==1 ) {
               // (expr12!=null?((CeriumAST)expr12.start):null) is root of tree matched by expr rule
                      retval.type = symtab.member((expr12!=null?((CeriumAST)expr12.start):null), ID13); 
                      ((CeriumAST)retval.start).evalType = retval.type; // save computed type
                      
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
    // $ANTLR end "member"


    // $ANTLR start "bop"
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:93:1: bop : ( '+' | '-' | '*' | '/' );
    public final void bop() throws RecognitionException {
        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:93:5: ( '+' | '-' | '*' | '/' )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:
            {
            if ( input.LA(1)==34||(input.LA(1)>=45 && input.LA(1)<=47) ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
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
    // $ANTLR end "bop"


    // $ANTLR start "relop"
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:95:1: relop : ( '<' | '>' | '<=' | '>=' );
    public final void relop() throws RecognitionException {
        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:95:6: ( '<' | '>' | '<=' | '>=' )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:
            {
            if ( (input.LA(1)>=48 && input.LA(1)<=51) ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
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
    // $ANTLR end "relop"


    // $ANTLR start "eqop"
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:97:1: eqop : ( '!=' | '==' );
    public final void eqop() throws RecognitionException {
        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:97:5: ( '!=' | '==' )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:
            {
            if ( (input.LA(1)>=52 && input.LA(1)<=53) ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
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
    // $ANTLR end "eqop"

    // Delegated rules


 

    public static final BitSet FOLLOW_exprRoot_in_bottomup64 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXPR_in_exprRoot92 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_exprRoot94 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_43_in_expr135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_expr152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_expr168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_expr187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_expr207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_expr225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNARY_MINUS_in_expr238 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr242 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNARY_NOT_in_expr258 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr262 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_member_in_expr279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayRef_in_expr296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_call_in_expr311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_binaryOps_in_expr330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bop_in_binaryOps368 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_binaryOps372 = new BitSet(new long[]{0x003FFFCC00018400L});
    public static final BitSet FOLLOW_expr_in_binaryOps376 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_relop_in_binaryOps392 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_binaryOps396 = new BitSet(new long[]{0x003FFFCC00018400L});
    public static final BitSet FOLLOW_expr_in_binaryOps400 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_eqop_in_binaryOps414 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_binaryOps418 = new BitSet(new long[]{0x003FFFCC00018400L});
    public static final BitSet FOLLOW_expr_in_binaryOps422 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INDEX_in_arrayRef458 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_arrayRef460 = new BitSet(new long[]{0x003FFFCC00018400L});
    public static final BitSet FOLLOW_expr_in_arrayRef462 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CALL_in_call507 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_call509 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ELIST_in_call512 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_call515 = new BitSet(new long[]{0x003FFFCC00018408L});
    public static final BitSet FOLLOW_35_in_member563 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_member565 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ID_in_member567 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_set_in_bop0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_relop0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_eqop0 = new BitSet(new long[]{0x0000000000000002L});

}