// $ANTLR 3.2 Sep 23, 2009 12:02:23 C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g 2014-12-20 12:24:34

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class CeriumLexer extends Lexer {
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

    public CeriumLexer() {;} 
    public CeriumLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public CeriumLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g"; }

    // $ANTLR start "ASSIGN"
    public final void mASSIGN() throws RecognitionException {
        try {
            int _type = ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:7:8: ( '=' )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:7:10: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ASSIGN"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:8:7: ( 'class' )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:8:9: 'class'
            {
            match("class"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:9:7: ( '{' )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:9:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:10:7: ( '}' )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:10:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:11:7: ( ';' )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:11:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:12:7: ( ':' )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:12:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:13:7: ( 'public' )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:13:9: 'public'
            {
            match("public"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:14:7: ( '(' )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:14:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:15:7: ( ')' )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:15:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:16:7: ( ',' )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:16:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:17:7: ( 'float' )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:17:9: 'float'
            {
            match("float"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:18:7: ( 'int' )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:18:9: 'int'
            {
            match("int"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:19:7: ( 'void' )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:19:9: 'void'
            {
            match("void"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:20:7: ( 'char' )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:20:9: 'char'
            {
            match("char"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:21:7: ( 'return' )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:21:9: 'return'
            {
            match("return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:22:7: ( '+' )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:22:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:23:7: ( '.' )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:23:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:24:7: ( 'this' )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:24:9: 'this'
            {
            match("this"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:25:7: ( 'super' )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:25:9: 'super'
            {
            match("super"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:142:5: ( LETTER ( LETTER | '0' .. '9' )* )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:143:3: LETTER ( LETTER | '0' .. '9' )*
            {
            mLETTER(); 
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:143:10: ( LETTER | '0' .. '9' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "LETTER"
    public final void mLETTER() throws RecognitionException {
        try {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:147:9: ( ( 'a' .. 'z' | 'A' .. 'Z' ) )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:148:4: ( 'a' .. 'z' | 'A' .. 'Z' )
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "LETTER"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:151:5: ( ( '0' .. '9' )+ )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:152:3: ( '0' .. '9' )+
            {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:152:3: ( '0' .. '9' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:152:3: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:155:5: ( ( ' ' | '\\r' | '\\t' | '\\n' ) )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:156:3: ( ' ' | '\\r' | '\\t' | '\\n' )
            {
            if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "SL_COMMENT"
    public final void mSL_COMMENT() throws RecognitionException {
        try {
            int _type = SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:160:5: ( '//' (~ ( '\\r' | '\\n' ) )* ( '\\r' )? '\\n' )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:161:6: '//' (~ ( '\\r' | '\\n' ) )* ( '\\r' )? '\\n'
            {
            match("//"); 

            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:161:11: (~ ( '\\r' | '\\n' ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='\u0000' && LA3_0<='\t')||(LA3_0>='\u000B' && LA3_0<='\f')||(LA3_0>='\u000E' && LA3_0<='\uFFFF')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:161:11: ~ ( '\\r' | '\\n' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:161:25: ( '\\r' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='\r') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:161:25: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            match('\n'); 
            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SL_COMMENT"

    public void mTokens() throws RecognitionException {
        // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:1:8: ( ASSIGN | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | ID | INT | WS | SL_COMMENT )
        int alt5=23;
        alt5 = dfa5.predict(input);
        switch (alt5) {
            case 1 :
                // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:1:10: ASSIGN
                {
                mASSIGN(); 

                }
                break;
            case 2 :
                // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:1:17: T__20
                {
                mT__20(); 

                }
                break;
            case 3 :
                // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:1:23: T__21
                {
                mT__21(); 

                }
                break;
            case 4 :
                // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:1:29: T__22
                {
                mT__22(); 

                }
                break;
            case 5 :
                // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:1:35: T__23
                {
                mT__23(); 

                }
                break;
            case 6 :
                // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:1:41: T__24
                {
                mT__24(); 

                }
                break;
            case 7 :
                // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:1:47: T__25
                {
                mT__25(); 

                }
                break;
            case 8 :
                // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:1:53: T__26
                {
                mT__26(); 

                }
                break;
            case 9 :
                // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:1:59: T__27
                {
                mT__27(); 

                }
                break;
            case 10 :
                // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:1:65: T__28
                {
                mT__28(); 

                }
                break;
            case 11 :
                // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:1:71: T__29
                {
                mT__29(); 

                }
                break;
            case 12 :
                // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:1:77: T__30
                {
                mT__30(); 

                }
                break;
            case 13 :
                // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:1:83: T__31
                {
                mT__31(); 

                }
                break;
            case 14 :
                // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:1:89: T__32
                {
                mT__32(); 

                }
                break;
            case 15 :
                // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:1:95: T__33
                {
                mT__33(); 

                }
                break;
            case 16 :
                // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:1:101: T__34
                {
                mT__34(); 

                }
                break;
            case 17 :
                // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:1:107: T__35
                {
                mT__35(); 

                }
                break;
            case 18 :
                // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:1:113: T__36
                {
                mT__36(); 

                }
                break;
            case 19 :
                // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:1:119: T__37
                {
                mT__37(); 

                }
                break;
            case 20 :
                // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:1:125: ID
                {
                mID(); 

                }
                break;
            case 21 :
                // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:1:128: INT
                {
                mINT(); 

                }
                break;
            case 22 :
                // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:1:132: WS
                {
                mWS(); 

                }
                break;
            case 23 :
                // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:1:135: SL_COMMENT
                {
                mSL_COMMENT(); 

                }
                break;

        }

    }


    protected DFA5 dfa5 = new DFA5(this);
    static final String DFA5_eotS =
        "\2\uffff\1\23\4\uffff\1\23\3\uffff\4\23\2\uffff\2\23\4\uffff\15"+
        "\23\1\55\5\23\1\63\2\23\1\uffff\1\66\1\23\1\70\1\23\1\72\1\uffff"+
        "\1\23\1\74\1\uffff\1\23\1\uffff\1\76\1\uffff\1\77\1\uffff\1\100"+
        "\3\uffff";
    static final String DFA5_eofS =
        "\101\uffff";
    static final String DFA5_minS =
        "\1\11\1\uffff\1\150\4\uffff\1\165\3\uffff\1\154\1\156\1\157\1\145"+
        "\2\uffff\1\150\1\165\4\uffff\2\141\1\142\1\157\1\164\1\151\1\164"+
        "\1\151\1\160\1\163\1\162\1\154\1\141\1\60\1\144\1\165\1\163\1\145"+
        "\1\163\1\60\1\151\1\164\1\uffff\1\60\1\162\1\60\1\162\1\60\1\uffff"+
        "\1\143\1\60\1\uffff\1\156\1\uffff\1\60\1\uffff\1\60\1\uffff\1\60"+
        "\3\uffff";
    static final String DFA5_maxS =
        "\1\175\1\uffff\1\154\4\uffff\1\165\3\uffff\1\154\1\156\1\157\1"+
        "\145\2\uffff\1\150\1\165\4\uffff\2\141\1\142\1\157\1\164\1\151\1"+
        "\164\1\151\1\160\1\163\1\162\1\154\1\141\1\172\1\144\1\165\1\163"+
        "\1\145\1\163\1\172\1\151\1\164\1\uffff\1\172\1\162\1\172\1\162\1"+
        "\172\1\uffff\1\143\1\172\1\uffff\1\156\1\uffff\1\172\1\uffff\1\172"+
        "\1\uffff\1\172\3\uffff";
    static final String DFA5_acceptS =
        "\1\uffff\1\1\1\uffff\1\3\1\4\1\5\1\6\1\uffff\1\10\1\11\1\12\4\uffff"+
        "\1\20\1\21\2\uffff\1\24\1\25\1\26\1\27\26\uffff\1\14\5\uffff\1\16"+
        "\2\uffff\1\15\1\uffff\1\22\1\uffff\1\2\1\uffff\1\13\1\uffff\1\23"+
        "\1\7\1\17";
    static final String DFA5_specialS =
        "\101\uffff}>";
    static final String[] DFA5_transitionS = {
            "\2\25\2\uffff\1\25\22\uffff\1\25\7\uffff\1\10\1\11\1\uffff"+
            "\1\17\1\12\1\uffff\1\20\1\26\12\24\1\6\1\5\1\uffff\1\1\3\uffff"+
            "\32\23\6\uffff\2\23\1\2\2\23\1\13\2\23\1\14\6\23\1\7\1\23\1"+
            "\16\1\22\1\21\1\23\1\15\4\23\1\3\1\uffff\1\4",
            "",
            "\1\30\3\uffff\1\27",
            "",
            "",
            "",
            "",
            "\1\31",
            "",
            "",
            "",
            "\1\32",
            "\1\33",
            "\1\34",
            "\1\35",
            "",
            "",
            "\1\36",
            "\1\37",
            "",
            "",
            "",
            "",
            "\1\40",
            "\1\41",
            "\1\42",
            "\1\43",
            "\1\44",
            "\1\45",
            "\1\46",
            "\1\47",
            "\1\50",
            "\1\51",
            "\1\52",
            "\1\53",
            "\1\54",
            "\12\23\7\uffff\32\23\6\uffff\32\23",
            "\1\56",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "\12\23\7\uffff\32\23\6\uffff\32\23",
            "\1\64",
            "\1\65",
            "",
            "\12\23\7\uffff\32\23\6\uffff\32\23",
            "\1\67",
            "\12\23\7\uffff\32\23\6\uffff\32\23",
            "\1\71",
            "\12\23\7\uffff\32\23\6\uffff\32\23",
            "",
            "\1\73",
            "\12\23\7\uffff\32\23\6\uffff\32\23",
            "",
            "\1\75",
            "",
            "\12\23\7\uffff\32\23\6\uffff\32\23",
            "",
            "\12\23\7\uffff\32\23\6\uffff\32\23",
            "",
            "\12\23\7\uffff\32\23\6\uffff\32\23",
            "",
            "",
            ""
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( ASSIGN | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | ID | INT | WS | SL_COMMENT );";
        }
    }
 

}