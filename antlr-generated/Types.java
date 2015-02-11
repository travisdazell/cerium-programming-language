// $ANTLR 3.2 Sep 23, 2009 12:02:23 C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g 2015-02-09 22:02:15

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class Types extends TreeFilter {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "METHOD_DECL", "ARG_DECL", "BLOCK", "MEMBERS", "VAR_DECL", "FIELD_DECL", "CALL", "ELIST", "EXPR", "ASSIGN", "EXTENDS", "UNARY_MINUS", "UNARY_NOT", "INDEX", "ID", "INT", "FLOAT", "CHAR", "LETTER", "WS", "SL_COMMENT", "'import'", "'.'", "'.*'", "';'", "'package'", "'class'", "'{'", "'}'", "'extends'", "'def'", "'('", "')'", "':'", "'private'", "'protected'", "','", "'[]'", "'float'", "'int'", "'void'", "'char'", "'boolean'", "'if'", "'else'", "'while'", "'loop'", "'times'", "'return'", "'!='", "'=='", "'<'", "'>'", "'<='", "'>='", "'+'", "'-'", "'*'", "'/'", "'!'", "'['", "']'", "'true'", "'false'"
    };
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
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:20:1: bottomup : ( exprRoot | decl | ret | assignment | whilestat | ifstat );
    public final void bottomup() throws RecognitionException {
        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:21:5: ( exprRoot | decl | ret | assignment | whilestat | ifstat )
            int alt1=6;
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
            case 52:
                {
                alt1=3;
                }
                break;
            case ASSIGN:
                {
                alt1=4;
                }
                break;
            case 49:
                {
                alt1=5;
                }
                break;
            case 47:
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
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:22:6: exprRoot
                    {
                    pushFollow(FOLLOW_exprRoot_in_bottomup63);
                    exprRoot();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:23:9: decl
                    {
                    pushFollow(FOLLOW_decl_in_bottomup74);
                    decl();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:24:9: ret
                    {
                    pushFollow(FOLLOW_ret_in_bottomup84);
                    ret();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:25:9: assignment
                    {
                    pushFollow(FOLLOW_assignment_in_bottomup94);
                    assignment();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:26:7: whilestat
                    {
                    pushFollow(FOLLOW_whilestat_in_bottomup107);
                    whilestat();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:27:7: ifstat
                    {
                    pushFollow(FOLLOW_ifstat_in_bottomup115);
                    ifstat();

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
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:31:1: decl : ^( VAR_DECL . ID (init= . )? ) ;
    public final void decl() throws RecognitionException {
        CeriumAST ID1=null;
        CeriumAST init=null;

        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:32:2: ( ^( VAR_DECL . ID (init= . )? ) )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:33:3: ^( VAR_DECL . ID (init= . )? )
            {
            match(input,VAR_DECL,FOLLOW_VAR_DECL_in_decl140); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            matchAny(input); if (state.failed) return ;
            ID1=(CeriumAST)match(input,ID,FOLLOW_ID_in_decl144); if (state.failed) return ;
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:33:19: (init= . )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=METHOD_DECL && LA2_0<=67)) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:33:20: init= .
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
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:40:1: ret : ^( 'return' v= . ) ;
    public final Types.ret_return ret() throws RecognitionException {
        Types.ret_return retval = new Types.ret_return();
        retval.start = input.LT(1);

        CeriumAST v=null;

        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:41:2: ( ^( 'return' v= . ) )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:42:3: ^( 'return' v= . )
            {
            match(input,52,FOLLOW_52_in_ret182); if (state.failed) return retval;

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
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:48:1: assignment : ^( '=' lhs= . rhs= . ) ;
    public final void assignment() throws RecognitionException {
        CeriumAST lhs=null;
        CeriumAST rhs=null;

        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:49:5: ( ^( '=' lhs= . rhs= . ) )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:50:6: ^( '=' lhs= . rhs= . )
            {
            match(input,ASSIGN,FOLLOW_ASSIGN_in_assignment212); if (state.failed) return ;

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
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:56:1: exprRoot : ^( EXPR expr ) ;
    public final void exprRoot() throws RecognitionException {
        CeriumAST EXPR2=null;
        Types.expr_return expr3 = null;


        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:57:5: ( ^( EXPR expr ) )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:58:6: ^( EXPR expr )
            {
            EXPR2=(CeriumAST)match(input,EXPR,FOLLOW_EXPR_in_exprRoot259); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_expr_in_exprRoot261);
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
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:63:1: expr returns [Type type] : ( 'true' | 'false' | CHAR | INT | FLOAT | ID | ^( UNARY_MINUS a= expr ) | ^( UNARY_NOT a= expr ) | member | arrayRef | call | binaryOps );
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
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:65:5: ( 'true' | 'false' | CHAR | INT | FLOAT | ID | ^( UNARY_MINUS a= expr ) | ^( UNARY_NOT a= expr ) | member | arrayRef | call | binaryOps )
            int alt3=12;
            switch ( input.LA(1) ) {
            case 66:
                {
                alt3=1;
                }
                break;
            case 67:
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
            case 26:
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
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
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
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:66:6: 'true'
                    {
                    match(input,66,FOLLOW_66_in_expr302); if (state.failed) return retval;
                    if ( state.backtracking==1 ) {
                      retval.type = SymbolTable._boolean;
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:67:9: 'false'
                    {
                    match(input,67,FOLLOW_67_in_expr319); if (state.failed) return retval;
                    if ( state.backtracking==1 ) {
                      retval.type = SymbolTable._boolean;
                    }

                    }
                    break;
                case 3 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:68:9: CHAR
                    {
                    match(input,CHAR,FOLLOW_CHAR_in_expr335); if (state.failed) return retval;
                    if ( state.backtracking==1 ) {
                      retval.type = SymbolTable._char;
                    }

                    }
                    break;
                case 4 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:69:9: INT
                    {
                    match(input,INT,FOLLOW_INT_in_expr354); if (state.failed) return retval;
                    if ( state.backtracking==1 ) {
                      retval.type = SymbolTable._int;
                    }

                    }
                    break;
                case 5 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:70:9: FLOAT
                    {
                    match(input,FLOAT,FOLLOW_FLOAT_in_expr374); if (state.failed) return retval;
                    if ( state.backtracking==1 ) {
                      retval.type = SymbolTable._float;
                    }

                    }
                    break;
                case 6 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:71:9: ID
                    {
                    ID4=(CeriumAST)match(input,ID,FOLLOW_ID_in_expr392); if (state.failed) return retval;
                    if ( state.backtracking==1 ) {
                      VariableSymbol s=(VariableSymbol)ID4.scope.resolve((ID4!=null?ID4.getText():null));
                                  ID4.symbol = s; retval.type = s.type;
                    }

                    }
                    break;
                case 7 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:73:9: ^( UNARY_MINUS a= expr )
                    {
                    match(input,UNARY_MINUS,FOLLOW_UNARY_MINUS_in_expr405); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr409);
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
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:74:9: ^( UNARY_NOT a= expr )
                    {
                    match(input,UNARY_NOT,FOLLOW_UNARY_NOT_in_expr425); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr429);
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
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:75:9: member
                    {
                    pushFollow(FOLLOW_member_in_expr446);
                    member5=member();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==1 ) {
                      retval.type = (member5!=null?member5.type:null);
                    }

                    }
                    break;
                case 10 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:76:9: arrayRef
                    {
                    pushFollow(FOLLOW_arrayRef_in_expr463);
                    arrayRef6=arrayRef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==1 ) {
                      retval.type = (arrayRef6!=null?arrayRef6.type:null);
                    }

                    }
                    break;
                case 11 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:77:9: call
                    {
                    pushFollow(FOLLOW_call_in_expr478);
                    call7=call();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==1 ) {
                      retval.type = (call7!=null?call7.type:null);
                    }

                    }
                    break;
                case 12 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:78:9: binaryOps
                    {
                    pushFollow(FOLLOW_binaryOps_in_expr497);
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
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:83:1: binaryOps returns [Type type] : ( ^( bop a= expr b= expr ) | ^( relop a= expr b= expr ) | ^( eqop a= expr b= expr ) );
    public final Types.binaryOps_return binaryOps() throws RecognitionException {
        Types.binaryOps_return retval = new Types.binaryOps_return();
        retval.start = input.LT(1);

        Types.expr_return a = null;

        Types.expr_return b = null;


        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:85:5: ( ^( bop a= expr b= expr ) | ^( relop a= expr b= expr ) | ^( eqop a= expr b= expr ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 59:
            case 60:
            case 61:
            case 62:
                {
                alt4=1;
                }
                break;
            case 55:
            case 56:
            case 57:
            case 58:
                {
                alt4=2;
                }
                break;
            case 53:
            case 54:
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
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:86:6: ^( bop a= expr b= expr )
                    {
                    pushFollow(FOLLOW_bop_in_binaryOps535);
                    bop();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_binaryOps539);
                    a=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_binaryOps543);
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
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:87:9: ^( relop a= expr b= expr )
                    {
                    pushFollow(FOLLOW_relop_in_binaryOps559);
                    relop();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_binaryOps563);
                    a=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_binaryOps567);
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
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:88:9: ^( eqop a= expr b= expr )
                    {
                    pushFollow(FOLLOW_eqop_in_binaryOps581);
                    eqop();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_binaryOps585);
                    a=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_binaryOps589);
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
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:93:1: arrayRef returns [Type type] : ^( INDEX ID expr ) ;
    public final Types.arrayRef_return arrayRef() throws RecognitionException {
        Types.arrayRef_return retval = new Types.arrayRef_return();
        retval.start = input.LT(1);

        CeriumAST ID9=null;
        Types.expr_return expr10 = null;


        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:94:5: ( ^( INDEX ID expr ) )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:95:6: ^( INDEX ID expr )
            {
            match(input,INDEX,FOLLOW_INDEX_in_arrayRef625); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            ID9=(CeriumAST)match(input,ID,FOLLOW_ID_in_arrayRef627); if (state.failed) return retval;
            pushFollow(FOLLOW_expr_in_arrayRef629);
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
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:104:1: call returns [Type type] : ^( CALL ID ^( ELIST ( expr )* ) ) ;
    public final Types.call_return call() throws RecognitionException {
        Types.call_return retval = new Types.call_return();
        retval.start = input.LT(1);

        CeriumAST ID12=null;
        Types.expr_return expr11 = null;


        List args = new ArrayList();
        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:106:5: ( ^( CALL ID ^( ELIST ( expr )* ) ) )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:107:6: ^( CALL ID ^( ELIST ( expr )* ) )
            {
            match(input,CALL,FOLLOW_CALL_in_call674); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            ID12=(CeriumAST)match(input,ID,FOLLOW_ID_in_call676); if (state.failed) return retval;
            match(input,ELIST,FOLLOW_ELIST_in_call679); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:107:24: ( expr )*
                loop5:
                do {
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==CALL||(LA5_0>=UNARY_MINUS && LA5_0<=CHAR)||LA5_0==26||(LA5_0>=53 && LA5_0<=62)||(LA5_0>=66 && LA5_0<=67)) ) {
                        alt5=1;
                    }


                    switch (alt5) {
                	case 1 :
                	    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:107:25: expr
                	    {
                	    pushFollow(FOLLOW_expr_in_call682);
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
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:116:1: member returns [Type type] : ^( '.' expr ID ) ;
    public final Types.member_return member() throws RecognitionException {
        Types.member_return retval = new Types.member_return();
        retval.start = input.LT(1);

        CeriumAST ID14=null;
        Types.expr_return expr13 = null;


        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:117:5: ( ^( '.' expr ID ) )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:118:6: ^( '.' expr ID )
            {
            match(input,26,FOLLOW_26_in_member730); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_expr_in_member732);
            expr13=expr();

            state._fsp--;
            if (state.failed) return retval;
            ID14=(CeriumAST)match(input,ID,FOLLOW_ID_in_member734); if (state.failed) return retval;

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


    // $ANTLR start "ifstat"
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:126:1: ifstat : ^( 'if' cond= . s= . (e= . )? ) ;
    public final void ifstat() throws RecognitionException {
        CeriumAST cond=null;
        CeriumAST s=null;
        CeriumAST e=null;

        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:126:8: ( ^( 'if' cond= . s= . (e= . )? ) )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:127:4: ^( 'if' cond= . s= . (e= . )? )
            {
            match(input,47,FOLLOW_47_in_ifstat774); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            cond=(CeriumAST)input.LT(1);
            matchAny(input); if (state.failed) return ;
            s=(CeriumAST)input.LT(1);
            matchAny(input); if (state.failed) return ;
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:127:23: (e= . )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=METHOD_DECL && LA6_0<=67)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:127:23: e= .
                    {
                    e=(CeriumAST)input.LT(1);
                    matchAny(input); if (state.failed) return ;

                    }
                    break;

            }


            match(input, Token.UP, null); if (state.failed) return ;
            if ( state.backtracking==1 ) {
              symtab.ifstat(cond);
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
    // $ANTLR end "ifstat"


    // $ANTLR start "whilestat"
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:130:1: whilestat : ^( 'while' cond= . b= . ) ;
    public final void whilestat() throws RecognitionException {
        CeriumAST cond=null;
        CeriumAST b=null;

        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:130:11: ( ^( 'while' cond= . b= . ) )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:131:5: ^( 'while' cond= . b= . )
            {
            match(input,49,FOLLOW_49_in_whilestat806); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            cond=(CeriumAST)input.LT(1);
            matchAny(input); if (state.failed) return ;
            b=(CeriumAST)input.LT(1);
            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;
            if ( state.backtracking==1 ) {
              symtab.whilestat(cond);
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
    // $ANTLR end "whilestat"


    // $ANTLR start "loopstat"
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:134:1: loopstat : ^( 'loop' cond= . b= . ) ;
    public final void loopstat() throws RecognitionException {
        CeriumAST cond=null;
        CeriumAST b=null;

        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:134:10: ( ^( 'loop' cond= . b= . ) )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:135:5: ^( 'loop' cond= . b= . )
            {
            match(input,50,FOLLOW_50_in_loopstat837); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            cond=(CeriumAST)input.LT(1);
            matchAny(input); if (state.failed) return ;
            b=(CeriumAST)input.LT(1);
            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;
            if ( state.backtracking==1 ) {
              symtab.loopstat(cond);
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
    // $ANTLR end "loopstat"


    // $ANTLR start "bop"
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:138:1: bop : ( '+' | '-' | '*' | '/' );
    public final void bop() throws RecognitionException {
        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:138:5: ( '+' | '-' | '*' | '/' )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:
            {
            if ( (input.LA(1)>=59 && input.LA(1)<=62) ) {
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
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:140:1: relop : ( '<' | '>' | '<=' | '>=' );
    public final void relop() throws RecognitionException {
        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:140:6: ( '<' | '>' | '<=' | '>=' )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:
            {
            if ( (input.LA(1)>=55 && input.LA(1)<=58) ) {
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
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:142:1: eqop : ( '!=' | '==' );
    public final void eqop() throws RecognitionException {
        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:142:5: ( '!=' | '==' )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Types.g:
            {
            if ( (input.LA(1)>=53 && input.LA(1)<=54) ) {
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


 

    public static final BitSet FOLLOW_exprRoot_in_bottomup63 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_decl_in_bottomup74 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ret_in_bottomup84 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_bottomup94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whilestat_in_bottomup107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifstat_in_bottomup115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_DECL_in_decl140 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_decl144 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF8L,0x000000000000000FL});
    public static final BitSet FOLLOW_52_in_ret182 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ASSIGN_in_assignment212 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_EXPR_in_exprRoot259 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_exprRoot261 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_66_in_expr302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_expr319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_expr335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_expr354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_expr374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_expr392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNARY_MINUS_in_expr405 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr409 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNARY_NOT_in_expr425 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr429 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_member_in_expr446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayRef_in_expr463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_call_in_expr478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_binaryOps_in_expr497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bop_in_binaryOps535 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_binaryOps539 = new BitSet(new long[]{0x7FE00000043F8400L,0x000000000000000CL});
    public static final BitSet FOLLOW_expr_in_binaryOps543 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_relop_in_binaryOps559 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_binaryOps563 = new BitSet(new long[]{0x7FE00000043F8400L,0x000000000000000CL});
    public static final BitSet FOLLOW_expr_in_binaryOps567 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_eqop_in_binaryOps581 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_binaryOps585 = new BitSet(new long[]{0x7FE00000043F8400L,0x000000000000000CL});
    public static final BitSet FOLLOW_expr_in_binaryOps589 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INDEX_in_arrayRef625 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_arrayRef627 = new BitSet(new long[]{0x7FE00000043F8400L,0x000000000000000CL});
    public static final BitSet FOLLOW_expr_in_arrayRef629 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CALL_in_call674 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_call676 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ELIST_in_call679 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_call682 = new BitSet(new long[]{0x7FE00000043F8408L,0x000000000000000CL});
    public static final BitSet FOLLOW_26_in_member730 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_member732 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ID_in_member734 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_47_in_ifstat774 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_49_in_whilestat806 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_50_in_loopstat837 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_set_in_bop0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_relop0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_eqop0 = new BitSet(new long[]{0x0000000000000002L});

}