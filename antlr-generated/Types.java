// $ANTLR 3.2 Sep 23, 2009 12:02:23 C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g 2014-12-20 23:50:56

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class Types extends TreeFilter {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "METHOD_DECL", "ARG_DECL", "BLOCK", "MEMBERS", "VAR_DECL", "FIELD_DECL", "CALL", "ELIST", "EXPR", "ASSIGN", "EXTENDS", "UNARY_MINUS", "UNARY_NOT", "INDEX", "ID", "INT", "FLOAT", "CHAR", "LETTER", "WS", "SL_COMMENT", "'class'", "'{'", "'}'", "';'", "':'", "'public'", "'('", "')'", "','", "'[]'", "'float'", "'int'", "'void'", "'char'", "'boolean'", "'if'", "'else'", "'return'", "'!='", "'=='", "'<'", "'>'", "'<='", "'>='", "'+'", "'-'", "'*'", "'/'", "'!'", "'.'", "'this'", "'super'", "'true'", "'false'"
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
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int INDEX=17;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int EXPR=12;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int ELIST=11;
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
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:20:1: bottomup : ( exprRoot | decl | ret | assignment );
    public final void bottomup() throws RecognitionException {
        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:21:5: ( exprRoot | decl | ret | assignment )
            int alt1=4;
            switch ( input.LA(1) ) {
            case EXPR:
                {
                alt1=1;
                }
                break;
            case VAR_DECL:
                {
                alt1=2;
                }
                break;
            case 42:
                {
                alt1=3;
                }
                break;
            case ASSIGN:
                {
                alt1=4;
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
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:22:6: exprRoot
                    {
                    pushFollow(FOLLOW_exprRoot_in_bottomup66);
                    exprRoot();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:23:9: decl
                    {
                    pushFollow(FOLLOW_decl_in_bottomup77);
                    decl();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:24:9: ret
                    {
                    pushFollow(FOLLOW_ret_in_bottomup87);
                    ret();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:25:9: assignment
                    {
                    pushFollow(FOLLOW_assignment_in_bottomup97);
                    assignment();

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


    // $ANTLR start "decl"
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:29:1: decl : ^( VAR_DECL . ID (init= . )? ) ;
    public final void decl() throws RecognitionException {
        CeriumAST ID1=null;
        CeriumAST init=null;

        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:30:2: ( ^( VAR_DECL . ID (init= . )? ) )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:31:3: ^( VAR_DECL . ID (init= . )? )
            {
            match(input,VAR_DECL,FOLLOW_VAR_DECL_in_decl127); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            matchAny(input); if (state.failed) return ;
            ID1=(CeriumAST)match(input,ID,FOLLOW_ID_in_decl131); if (state.failed) return ;
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:31:19: (init= . )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=METHOD_DECL && LA2_0<=58)) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:31:20: init= .
                    {
                    init=(CeriumAST)input.LT(1);
                    matchAny(input); if (state.failed) return ;

                    }
                    break;

            }


            match(input, Token.UP, null); if (state.failed) return ;
            if ( state.backtracking==1 ) {

                      	if (init!=null && init.evalType!=null)
                      		symtab.declinit(ID1, init);
                      
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
    // $ANTLR end "decl"

    public static class ret_return extends TreeRuleReturnScope {
    };

    // $ANTLR start "ret"
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:38:1: ret : ^( 'return' v= . ) ;
    public final Types.ret_return ret() throws RecognitionException {
        Types.ret_return retval = new Types.ret_return();
        retval.start = input.LT(1);

        CeriumAST v=null;

        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:39:2: ( ^( 'return' v= . ) )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:40:3: ^( 'return' v= . )
            {
            match(input,42,FOLLOW_42_in_ret169); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            v=(CeriumAST)input.LT(1);
            matchAny(input); if (state.failed) return retval;

            match(input, Token.UP, null); if (state.failed) return retval;
            if ( state.backtracking==1 ) {

              			symtab.ret((MethodSymbol)((CeriumAST)retval.start).symbol, v);
              		
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


    // $ANTLR start "assignment"
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:46:1: assignment : ^( '=' lhs= . rhs= . ) ;
    public final void assignment() throws RecognitionException {
        CeriumAST lhs=null;
        CeriumAST rhs=null;

        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:47:5: ( ^( '=' lhs= . rhs= . ) )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:48:6: ^( '=' lhs= . rhs= . )
            {
            match(input,ASSIGN,FOLLOW_ASSIGN_in_assignment199); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            lhs=(CeriumAST)input.LT(1);
            matchAny(input); if (state.failed) return ;
            rhs=(CeriumAST)input.LT(1);
            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;
            if ( state.backtracking==1 ) {

                  		symtab.assign(lhs, rhs);
                  	
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
    // $ANTLR end "assignment"


    // $ANTLR start "exprRoot"
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:54:1: exprRoot : ^( EXPR expr ) ;
    public final void exprRoot() throws RecognitionException {
        CeriumAST EXPR2=null;
        Types.expr_return expr3 = null;


        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:55:5: ( ^( EXPR expr ) )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:56:6: ^( EXPR expr )
            {
            EXPR2=(CeriumAST)match(input,EXPR,FOLLOW_EXPR_in_exprRoot246); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_expr_in_exprRoot248);
            expr3=expr();

            state._fsp--;
            if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;
            if ( state.backtracking==1 ) {
              EXPR2.evalType = (expr3!=null?expr3.type:null);
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
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:61:1: expr returns [Type type] : ( 'true' | 'false' | CHAR | INT | FLOAT | ID | ^( UNARY_MINUS a= expr ) | ^( UNARY_NOT a= expr ) | member | arrayRef | call | binaryOps );
    public final Types.expr_return expr() throws RecognitionException {
        Types.expr_return retval = new Types.expr_return();
        retval.start = input.LT(1);

        CeriumAST ID4=null;
        Types.expr_return a = null;

        Types.member_return member5 = null;

        Types.arrayRef_return arrayRef6 = null;

        Types.call_return call7 = null;

        Types.binaryOps_return binaryOps8 = null;


        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:63:5: ( 'true' | 'false' | CHAR | INT | FLOAT | ID | ^( UNARY_MINUS a= expr ) | ^( UNARY_NOT a= expr ) | member | arrayRef | call | binaryOps )
            int alt3=12;
            switch ( input.LA(1) ) {
            case 57:
                {
                alt3=1;
                }
                break;
            case 58:
                {
                alt3=2;
                }
                break;
            case CHAR:
                {
                alt3=3;
                }
                break;
            case INT:
                {
                alt3=4;
                }
                break;
            case FLOAT:
                {
                alt3=5;
                }
                break;
            case ID:
                {
                alt3=6;
                }
                break;
            case UNARY_MINUS:
                {
                alt3=7;
                }
                break;
            case UNARY_NOT:
                {
                alt3=8;
                }
                break;
            case 54:
                {
                alt3=9;
                }
                break;
            case INDEX:
                {
                alt3=10;
                }
                break;
            case CALL:
                {
                alt3=11;
                }
                break;
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
                {
                alt3=12;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:64:6: 'true'
                    {
                    match(input,57,FOLLOW_57_in_expr289); if (state.failed) return retval;
                    if ( state.backtracking==1 ) {
                      retval.type = SymbolTable._boolean;
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:65:9: 'false'
                    {
                    match(input,58,FOLLOW_58_in_expr306); if (state.failed) return retval;
                    if ( state.backtracking==1 ) {
                      retval.type = SymbolTable._boolean;
                    }

                    }
                    break;
                case 3 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:66:9: CHAR
                    {
                    match(input,CHAR,FOLLOW_CHAR_in_expr322); if (state.failed) return retval;
                    if ( state.backtracking==1 ) {
                      retval.type = SymbolTable._char;
                    }

                    }
                    break;
                case 4 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:67:9: INT
                    {
                    match(input,INT,FOLLOW_INT_in_expr341); if (state.failed) return retval;
                    if ( state.backtracking==1 ) {
                      retval.type = SymbolTable._int;
                    }

                    }
                    break;
                case 5 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:68:9: FLOAT
                    {
                    match(input,FLOAT,FOLLOW_FLOAT_in_expr361); if (state.failed) return retval;
                    if ( state.backtracking==1 ) {
                      retval.type = SymbolTable._float;
                    }

                    }
                    break;
                case 6 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:69:9: ID
                    {
                    ID4=(CeriumAST)match(input,ID,FOLLOW_ID_in_expr379); if (state.failed) return retval;
                    if ( state.backtracking==1 ) {
                      VariableSymbol s=(VariableSymbol)ID4.scope.resolve((ID4!=null?ID4.getText():null));
                                  ID4.symbol = s; retval.type = s.type;
                    }

                    }
                    break;
                case 7 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:71:9: ^( UNARY_MINUS a= expr )
                    {
                    match(input,UNARY_MINUS,FOLLOW_UNARY_MINUS_in_expr392); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr396);
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
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:72:9: ^( UNARY_NOT a= expr )
                    {
                    match(input,UNARY_NOT,FOLLOW_UNARY_NOT_in_expr412); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr416);
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
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:73:9: member
                    {
                    pushFollow(FOLLOW_member_in_expr433);
                    member5=member();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==1 ) {
                      retval.type = (member5!=null?member5.type:null);
                    }

                    }
                    break;
                case 10 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:74:9: arrayRef
                    {
                    pushFollow(FOLLOW_arrayRef_in_expr450);
                    arrayRef6=arrayRef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==1 ) {
                      retval.type = (arrayRef6!=null?arrayRef6.type:null);
                    }

                    }
                    break;
                case 11 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:75:9: call
                    {
                    pushFollow(FOLLOW_call_in_expr465);
                    call7=call();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==1 ) {
                      retval.type = (call7!=null?call7.type:null);
                    }

                    }
                    break;
                case 12 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:76:9: binaryOps
                    {
                    pushFollow(FOLLOW_binaryOps_in_expr484);
                    binaryOps8=binaryOps();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==1 ) {
                      retval.type = (binaryOps8!=null?binaryOps8.type:null);
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
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:81:1: binaryOps returns [Type type] : ( ^( bop a= expr b= expr ) | ^( relop a= expr b= expr ) | ^( eqop a= expr b= expr ) );
    public final Types.binaryOps_return binaryOps() throws RecognitionException {
        Types.binaryOps_return retval = new Types.binaryOps_return();
        retval.start = input.LT(1);

        Types.expr_return a = null;

        Types.expr_return b = null;


        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:83:5: ( ^( bop a= expr b= expr ) | ^( relop a= expr b= expr ) | ^( eqop a= expr b= expr ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 49:
            case 50:
            case 51:
            case 52:
                {
                alt4=1;
                }
                break;
            case 45:
            case 46:
            case 47:
            case 48:
                {
                alt4=2;
                }
                break;
            case 43:
            case 44:
                {
                alt4=3;
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
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:84:6: ^( bop a= expr b= expr )
                    {
                    pushFollow(FOLLOW_bop_in_binaryOps522);
                    bop();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_binaryOps526);
                    a=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_binaryOps530);
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
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:85:9: ^( relop a= expr b= expr )
                    {
                    pushFollow(FOLLOW_relop_in_binaryOps546);
                    relop();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_binaryOps550);
                    a=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_binaryOps554);
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
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:86:9: ^( eqop a= expr b= expr )
                    {
                    pushFollow(FOLLOW_eqop_in_binaryOps568);
                    eqop();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_binaryOps572);
                    a=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_binaryOps576);
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
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:91:1: arrayRef returns [Type type] : ^( INDEX ID expr ) ;
    public final Types.arrayRef_return arrayRef() throws RecognitionException {
        Types.arrayRef_return retval = new Types.arrayRef_return();
        retval.start = input.LT(1);

        CeriumAST ID9=null;
        Types.expr_return expr10 = null;


        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:92:5: ( ^( INDEX ID expr ) )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:93:6: ^( INDEX ID expr )
            {
            match(input,INDEX,FOLLOW_INDEX_in_arrayRef612); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            ID9=(CeriumAST)match(input,ID,FOLLOW_ID_in_arrayRef614); if (state.failed) return retval;
            pushFollow(FOLLOW_expr_in_arrayRef616);
            expr10=expr();

            state._fsp--;
            if (state.failed) return retval;

            match(input, Token.UP, null); if (state.failed) return retval;
            if ( state.backtracking==1 ) {

                      retval.type = symtab.arrayIndex(ID9, (expr10!=null?((CeriumAST)expr10.start):null));
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
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:102:1: call returns [Type type] : ^( CALL ID ^( ELIST ( expr )* ) ) ;
    public final Types.call_return call() throws RecognitionException {
        Types.call_return retval = new Types.call_return();
        retval.start = input.LT(1);

        CeriumAST ID12=null;
        Types.expr_return expr11 = null;


        List args = new ArrayList();
        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:104:5: ( ^( CALL ID ^( ELIST ( expr )* ) ) )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:105:6: ^( CALL ID ^( ELIST ( expr )* ) )
            {
            match(input,CALL,FOLLOW_CALL_in_call661); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            ID12=(CeriumAST)match(input,ID,FOLLOW_ID_in_call663); if (state.failed) return retval;
            match(input,ELIST,FOLLOW_ELIST_in_call666); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:105:24: ( expr )*
                loop5:
                do {
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==CALL||(LA5_0>=UNARY_MINUS && LA5_0<=CHAR)||(LA5_0>=43 && LA5_0<=52)||LA5_0==54||(LA5_0>=57 && LA5_0<=58)) ) {
                        alt5=1;
                    }


                    switch (alt5) {
                	case 1 :
                	    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:105:25: expr
                	    {
                	    pushFollow(FOLLOW_expr_in_call669);
                	    expr11=expr();

                	    state._fsp--;
                	    if (state.failed) return retval;
                	    if ( state.backtracking==1 ) {
                	      args.add((expr11!=null?((CeriumAST)expr11.start):null));
                	    }

                	    }
                	    break;

                	default :
                	    break loop5;
                    }
                } while (true);


                match(input, Token.UP, null); if (state.failed) return retval;
            }

            match(input, Token.UP, null); if (state.failed) return retval;
            if ( state.backtracking==1 ) {

                      retval.type = symtab.call(ID12, args);
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
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:114:1: member returns [Type type] : ^( '.' expr ID ) ;
    public final Types.member_return member() throws RecognitionException {
        Types.member_return retval = new Types.member_return();
        retval.start = input.LT(1);

        CeriumAST ID14=null;
        Types.expr_return expr13 = null;


        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:115:5: ( ^( '.' expr ID ) )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:116:6: ^( '.' expr ID )
            {
            match(input,54,FOLLOW_54_in_member717); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_expr_in_member719);
            expr13=expr();

            state._fsp--;
            if (state.failed) return retval;
            ID14=(CeriumAST)match(input,ID,FOLLOW_ID_in_member721); if (state.failed) return retval;

            match(input, Token.UP, null); if (state.failed) return retval;
            if ( state.backtracking==1 ) {
               // (expr13!=null?((CeriumAST)expr13.start):null) is root of tree matched by expr rule
                      retval.type = symtab.member((expr13!=null?((CeriumAST)expr13.start):null), ID14); 
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
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:124:1: bop : ( '+' | '-' | '*' | '/' );
    public final void bop() throws RecognitionException {
        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:124:5: ( '+' | '-' | '*' | '/' )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:
            {
            if ( (input.LA(1)>=49 && input.LA(1)<=52) ) {
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
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:126:1: relop : ( '<' | '>' | '<=' | '>=' );
    public final void relop() throws RecognitionException {
        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:126:6: ( '<' | '>' | '<=' | '>=' )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:
            {
            if ( (input.LA(1)>=45 && input.LA(1)<=48) ) {
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
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:128:1: eqop : ( '!=' | '==' );
    public final void eqop() throws RecognitionException {
        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:128:5: ( '!=' | '==' )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:
            {
            if ( (input.LA(1)>=43 && input.LA(1)<=44) ) {
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


 

    public static final BitSet FOLLOW_exprRoot_in_bottomup66 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_decl_in_bottomup77 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ret_in_bottomup87 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_bottomup97 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_DECL_in_decl127 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_decl131 = new BitSet(new long[]{0x07FFFFFFFFFFFFF8L});
    public static final BitSet FOLLOW_42_in_ret169 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ASSIGN_in_assignment199 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_EXPR_in_exprRoot246 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_exprRoot248 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_57_in_expr289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_expr306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_expr322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_expr341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_expr361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_expr379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNARY_MINUS_in_expr392 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr396 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNARY_NOT_in_expr412 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr416 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_member_in_expr433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayRef_in_expr450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_call_in_expr465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_binaryOps_in_expr484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bop_in_binaryOps522 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_binaryOps526 = new BitSet(new long[]{0x065FF800003F8400L});
    public static final BitSet FOLLOW_expr_in_binaryOps530 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_relop_in_binaryOps546 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_binaryOps550 = new BitSet(new long[]{0x065FF800003F8400L});
    public static final BitSet FOLLOW_expr_in_binaryOps554 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_eqop_in_binaryOps568 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_binaryOps572 = new BitSet(new long[]{0x065FF800003F8400L});
    public static final BitSet FOLLOW_expr_in_binaryOps576 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INDEX_in_arrayRef612 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_arrayRef614 = new BitSet(new long[]{0x065FF800003F8400L});
    public static final BitSet FOLLOW_expr_in_arrayRef616 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CALL_in_call661 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_call663 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ELIST_in_call666 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_call669 = new BitSet(new long[]{0x065FF800003F8408L});
    public static final BitSet FOLLOW_54_in_member717 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_member719 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ID_in_member721 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_set_in_bop0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_relop0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_eqop0 = new BitSet(new long[]{0x0000000000000002L});

}