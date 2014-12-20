// $ANTLR 3.2 Sep 23, 2009 12:02:23 C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Ref.g 2014-12-20 12:15:21

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class Ref extends TreeFilter {
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
    public static final int T__33=33;
    public static final int EXPR=12;
    public static final int WS=18;
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


        public Ref(TreeNodeStream input) {
            this(input, new RecognizerSharedState());
        }
        public Ref(TreeNodeStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return Ref.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Ref.g"; }


        SymbolTable symtab;
        public Ref(TreeNodeStream input, SymbolTable symtab) {
            this(input);
            this.symtab = symtab;
        }
        



    // $ANTLR start "topdown"
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Ref.g:19:1: topdown : ( enterMethod | enterClass | varDeclaration | assignment | resolveExpr );
    public final void topdown() throws RecognitionException {
        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Ref.g:23:5: ( enterMethod | enterClass | varDeclaration | assignment | resolveExpr )
            int alt1=5;
            switch ( input.LA(1) ) {
            case METHOD_DECL:
                {
                alt1=1;
                }
                break;
            case 20:
                {
                alt1=2;
                }
                break;
            case ARG_DECL:
            case VAR_DECL:
            case FIELD_DECL:
                {
                alt1=3;
                }
                break;
            case ASSIGN:
                {
                alt1=4;
                }
                break;
            case EXPR:
                {
                alt1=5;
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
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Ref.g:23:9: enterMethod
                    {
                    pushFollow(FOLLOW_enterMethod_in_topdown59);
                    enterMethod();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Ref.g:24:9: enterClass
                    {
                    pushFollow(FOLLOW_enterClass_in_topdown69);
                    enterClass();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Ref.g:25:9: varDeclaration
                    {
                    pushFollow(FOLLOW_varDeclaration_in_topdown79);
                    varDeclaration();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Ref.g:26:9: assignment
                    {
                    pushFollow(FOLLOW_assignment_in_topdown89);
                    assignment();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Ref.g:27:9: resolveExpr
                    {
                    pushFollow(FOLLOW_resolveExpr_in_topdown99);
                    resolveExpr();

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


    // $ANTLR start "enterClass"
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Ref.g:33:1: enterClass : ^( 'class' name= ID ( ^( EXTENDS sup= ID ) )? ^( MEMBERS ( . )* ) ) ;
    public final void enterClass() throws RecognitionException {
        CeriumAST name=null;
        CeriumAST sup=null;

        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Ref.g:34:5: ( ^( 'class' name= ID ( ^( EXTENDS sup= ID ) )? ^( MEMBERS ( . )* ) ) )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Ref.g:34:9: ^( 'class' name= ID ( ^( EXTENDS sup= ID ) )? ^( MEMBERS ( . )* ) )
            {
            match(input,20,FOLLOW_20_in_enterClass122); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            name=(CeriumAST)match(input,ID,FOLLOW_ID_in_enterClass126); if (state.failed) return ;
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Ref.g:34:27: ( ^( EXTENDS sup= ID ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==EXTENDS) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Ref.g:34:28: ^( EXTENDS sup= ID )
                    {
                    match(input,EXTENDS,FOLLOW_EXTENDS_in_enterClass130); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    sup=(CeriumAST)match(input,ID,FOLLOW_ID_in_enterClass134); if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;

                    }
                    break;

            }

            match(input,MEMBERS,FOLLOW_MEMBERS_in_enterClass140); if (state.failed) return ;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return ;
                // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Ref.g:34:58: ( . )*
                loop3:
                do {
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( ((LA3_0>=METHOD_DECL && LA3_0<=37)) ) {
                        alt3=1;
                    }
                    else if ( (LA3_0==UP) ) {
                        alt3=2;
                    }


                    switch (alt3) {
                	case 1 :
                	    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Ref.g:34:58: .
                	    {
                	    matchAny(input); if (state.failed) return ;

                	    }
                	    break;

                	default :
                	    break loop3;
                    }
                } while (true);


                match(input, Token.UP, null); if (state.failed) return ;
            }

            match(input, Token.UP, null); if (state.failed) return ;
            if ( state.backtracking==1 ) {

                      if ( sup!=null ) {
                          // look up superclass (if any)
                          sup.symbol = sup.scope.resolve((sup!=null?sup.getText():null));
                          ((ClassSymbol)name.symbol).superClass =
                              (ClassSymbol)sup.symbol;                // set superclass
                          System.out.println("line "+name.getLine()+": set "+(name!=null?name.getText():null)+
                              " super to "+((ClassSymbol)name.symbol).superClass.name);
                      }
                      else {
                          System.out.println("line "+name.getLine()+": set "+(name!=null?name.getText():null));
                      }
                      
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


    // $ANTLR start "enterMethod"
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Ref.g:51:1: enterMethod : ^( METHOD_DECL type ID ( . )* ) ;
    public final void enterMethod() throws RecognitionException {
        CeriumAST ID1=null;
        Ref.type_return type2 = null;


        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Ref.g:52:5: ( ^( METHOD_DECL type ID ( . )* ) )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Ref.g:52:9: ^( METHOD_DECL type ID ( . )* )
            {
            match(input,METHOD_DECL,FOLLOW_METHOD_DECL_in_enterMethod176); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_type_in_enterMethod178);
            type2=type();

            state._fsp--;
            if (state.failed) return ;
            ID1=(CeriumAST)match(input,ID,FOLLOW_ID_in_enterMethod180); if (state.failed) return ;
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Ref.g:52:31: ( . )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=METHOD_DECL && LA4_0<=37)) ) {
                    alt4=1;
                }
                else if ( (LA4_0==UP) ) {
                    alt4=2;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Ref.g:52:31: .
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

                      ID1.symbol.type = (type2!=null?type2.tsym:null); // set return type of method
                      System.out.println("line "+ID1.getLine()+": set method type "+ID1.symbol);
                      
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


    // $ANTLR start "varDeclaration"
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Ref.g:62:1: varDeclaration : ^( ( FIELD_DECL | VAR_DECL | ARG_DECL ) type ID ( . )? ) ;
    public final void varDeclaration() throws RecognitionException {
        CeriumAST ID3=null;
        Ref.type_return type4 = null;


        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Ref.g:63:5: ( ^( ( FIELD_DECL | VAR_DECL | ARG_DECL ) type ID ( . )? ) )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Ref.g:63:9: ^( ( FIELD_DECL | VAR_DECL | ARG_DECL ) type ID ( . )? )
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
            pushFollow(FOLLOW_type_in_varDeclaration227);
            type4=type();

            state._fsp--;
            if (state.failed) return ;
            ID3=(CeriumAST)match(input,ID,FOLLOW_ID_in_varDeclaration229); if (state.failed) return ;
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Ref.g:63:50: ( . )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=METHOD_DECL && LA5_0<=37)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Ref.g:63:50: .
                    {
                    matchAny(input); if (state.failed) return ;

                    }
                    break;

            }


            match(input, Token.UP, null); if (state.failed) return ;
            if ( state.backtracking==1 ) {

                      ID3.symbol.type = (type4!=null?type4.tsym:null); // set return type of variable
                      System.out.println("line "+ID3.getLine()+": set var type "+ID3.symbol);
                      
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

    public static class type_return extends TreeRuleReturnScope {
        public Type tsym;
    };

    // $ANTLR start "type"
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Ref.g:71:1: type returns [Type tsym] : ( 'float' | 'int' | 'char' | 'void' | ID );
    public final Ref.type_return type() throws RecognitionException {
        Ref.type_return retval = new Ref.type_return();
        retval.start = input.LT(1);


            // get scope from AST; use to resolve type name and save it in AST
            ((CeriumAST)retval.start).symbol = ((CeriumAST)retval.start).scope.resolve(((CeriumAST)retval.start).getText());
            retval.tsym = (Type)((CeriumAST)retval.start).symbol; // return Type from this rule

        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Ref.g:78:5: ( 'float' | 'int' | 'char' | 'void' | ID )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Ref.g:
            {
            if ( input.LA(1)==ID||(input.LA(1)>=29 && input.LA(1)<=32) ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
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
        return retval;
    }
    // $ANTLR end "type"


    // $ANTLR start "assignment"
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Ref.g:86:1: assignment : ^( '=' expr expr ) ;
    public final void assignment() throws RecognitionException {
        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Ref.g:86:13: ( ^( '=' expr expr ) )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Ref.g:86:15: ^( '=' expr expr )
            {
            match(input,ASSIGN,FOLLOW_ASSIGN_in_assignment330); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_expr_in_assignment332);
            expr();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_expr_in_assignment334);
            expr();

            state._fsp--;
            if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;

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


    // $ANTLR start "resolveExpr"
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Ref.g:87:1: resolveExpr : ^( EXPR expr ) ;
    public final void resolveExpr() throws RecognitionException {
        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Ref.g:87:13: ( ^( EXPR expr ) )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Ref.g:87:15: ^( EXPR expr )
            {
            match(input,EXPR,FOLLOW_EXPR_in_resolveExpr346); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_expr_in_resolveExpr348);
            expr();

            state._fsp--;
            if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;

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
    // $ANTLR end "resolveExpr"

    public static class expr_return extends TreeRuleReturnScope {
        public Type type;
    };

    // $ANTLR start "expr"
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Ref.g:91:1: expr returns [Type type] : ( member | ^( CALL expr ) | ^( '+' expr expr ) | id | INT );
    public final Ref.expr_return expr() throws RecognitionException {
        Ref.expr_return retval = new Ref.expr_return();
        retval.start = input.LT(1);

        Type member5 = null;

        Type id6 = null;


        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Ref.g:95:5: ( member | ^( CALL expr ) | ^( '+' expr expr ) | id | INT )
            int alt6=5;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt6=1;
                }
                break;
            case CALL:
                {
                alt6=2;
                }
                break;
            case 34:
                {
                alt6=3;
                }
                break;
            case ID:
            case 36:
                {
                alt6=4;
                }
                break;
            case INT:
                {
                alt6=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Ref.g:95:9: member
                    {
                    pushFollow(FOLLOW_member_in_expr373);
                    member5=member();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==1 ) {
                      retval.type = member5;
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Ref.g:96:9: ^( CALL expr )
                    {
                    match(input,CALL,FOLLOW_CALL_in_expr387); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr389);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Ref.g:97:9: ^( '+' expr expr )
                    {
                    match(input,34,FOLLOW_34_in_expr401); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr403);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr405);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 4 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Ref.g:98:9: id
                    {
                    pushFollow(FOLLOW_id_in_expr416);
                    id6=id();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==1 ) {
                      retval.type = id6;
                    }

                    }
                    break;
                case 5 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Ref.g:99:9: INT
                    {
                    match(input,INT,FOLLOW_INT_in_expr437); if (state.failed) return retval;

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
        return retval;
    }
    // $ANTLR end "expr"


    // $ANTLR start "id"
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Ref.g:104:1: id returns [Type type] : ( ID | t= 'this' );
    public final Type id() throws RecognitionException {
        Type type = null;

        CeriumAST t=null;
        CeriumAST ID7=null;

        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Ref.g:105:5: ( ID | t= 'this' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==ID) ) {
                alt7=1;
            }
            else if ( (LA7_0==36) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return type;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Ref.g:105:9: ID
                    {
                    ID7=(CeriumAST)match(input,ID,FOLLOW_ID_in_id462); if (state.failed) return type;
                    if ( state.backtracking==1 ) {

                              // do usual resolve(ID) then check for illegal forward references
                              ID7.symbol = SymbolTable.resolveID(ID7);
                              if ( ID7.symbol!=null ) type = ID7.symbol.type;
                              
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Ref.g:111:9: t= 'this'
                    {
                    t=(CeriumAST)match(input,36,FOLLOW_36_in_id484); if (state.failed) return type;
                    if ( state.backtracking==1 ) {
                      type = SymbolTable.getEnclosingClass(t.scope);
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
    // $ANTLR end "id"


    // $ANTLR start "member"
    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Ref.g:116:1: member returns [Type type] : ^( '.' m= expr ID ) ;
    public final Type member() throws RecognitionException {
        Type type = null;

        CeriumAST ID8=null;
        Ref.expr_return m = null;


        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Ref.g:117:5: ( ^( '.' m= expr ID ) )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Ref.g:117:9: ^( '.' m= expr ID )
            {
            match(input,35,FOLLOW_35_in_member513); if (state.failed) return type;

            match(input, Token.DOWN, null); if (state.failed) return type;
            pushFollow(FOLLOW_expr_in_member517);
            m=expr();

            state._fsp--;
            if (state.failed) return type;
            ID8=(CeriumAST)match(input,ID,FOLLOW_ID_in_member519); if (state.failed) return type;

            match(input, Token.UP, null); if (state.failed) return type;
            if ( state.backtracking==1 ) {

                      ClassSymbol scope = (ClassSymbol)(m!=null?m.type:null);
                      Symbol s = scope.resolveMember((ID8!=null?ID8.getText():null));
                      ID8.symbol = s;
                      System.out.println("line "+ID8.getLine()+
                          ": resolve "+(m!=null?(input.getTokenStream().toString(
                input.getTreeAdaptor().getTokenStartIndex(m.start),
                input.getTreeAdaptor().getTokenStopIndex(m.start))):null)+"."+(ID8!=null?ID8.getText():null)+" to "+s);
                      if ( s!=null ) type = s.type;
                      
            }

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
    // $ANTLR end "member"

    // Delegated rules


 

    public static final BitSet FOLLOW_enterMethod_in_topdown59 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enterClass_in_topdown69 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDeclaration_in_topdown79 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_topdown89 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_resolveExpr_in_topdown99 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_enterClass122 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_enterClass126 = new BitSet(new long[]{0x0000000000004080L});
    public static final BitSet FOLLOW_EXTENDS_in_enterClass130 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_enterClass134 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MEMBERS_in_enterClass140 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_METHOD_DECL_in_enterMethod176 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_enterMethod178 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ID_in_enterMethod180 = new BitSet(new long[]{0x0000003FFFFFFFF8L});
    public static final BitSet FOLLOW_set_in_varDeclaration219 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_varDeclaration227 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ID_in_varDeclaration229 = new BitSet(new long[]{0x0000003FFFFFFFF8L});
    public static final BitSet FOLLOW_set_in_type0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASSIGN_in_assignment330 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_assignment332 = new BitSet(new long[]{0x0000001C00018400L});
    public static final BitSet FOLLOW_expr_in_assignment334 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXPR_in_resolveExpr346 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_resolveExpr348 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_member_in_expr373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CALL_in_expr387 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr389 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_34_in_expr401 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr403 = new BitSet(new long[]{0x0000001C00018400L});
    public static final BitSet FOLLOW_expr_in_expr405 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_id_in_expr416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_expr437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_id462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_id484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_member513 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_member517 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ID_in_member519 = new BitSet(new long[]{0x0000000000000008L});

}