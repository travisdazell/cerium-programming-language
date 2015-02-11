// $ANTLR 3.2 Sep 23, 2009 12:02:23 C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g 2015-02-10 16:42:32

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class CeriumLexer extends Lexer {
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

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:8:7: ( 'import' )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:8:9: 'import'
            {
            match("import"); 


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
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:9:7: ( '.' )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:9:9: '.'
            {
            match('.'); 

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
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:10:7: ( '.*' )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:10:9: '.*'
            {
            match(".*"); 


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
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:12:7: ( 'package' )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:12:9: 'package'
            {
            match("package"); 


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
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:13:7: ( 'class' )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:13:9: 'class'
            {
            match("class"); 


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
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:14:7: ( '{' )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:14:9: '{'
            {
            match('{'); 

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
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:15:7: ( '}' )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:15:9: '}'
            {
            match('}'); 

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
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:16:7: ( 'extends' )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:16:9: 'extends'
            {
            match("extends"); 


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
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:17:7: ( 'def' )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:17:9: 'def'
            {
            match("def"); 


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
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:18:7: ( '(' )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:18:9: '('
            {
            match('('); 

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
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:19:7: ( ')' )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:19:9: ')'
            {
            match(')'); 

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
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:20:7: ( ':' )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:20:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:21:7: ( 'private' )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:21:9: 'private'
            {
            match("private"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:22:7: ( 'protected' )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:22:9: 'protected'
            {
            match("protected"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:23:7: ( ',' )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:23:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:24:7: ( '[]' )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:24:9: '[]'
            {
            match("[]"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:25:7: ( 'float' )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:25:9: 'float'
            {
            match("float"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:26:7: ( 'int' )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:26:9: 'int'
            {
            match("int"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:27:7: ( 'void' )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:27:9: 'void'
            {
            match("void"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:28:7: ( 'char' )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:28:9: 'char'
            {
            match("char"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:29:7: ( 'boolean' )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:29:9: 'boolean'
            {
            match("boolean"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:30:7: ( 'if' )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:30:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:31:7: ( 'else' )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:31:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:32:7: ( 'while' )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:32:9: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:33:7: ( 'loop' )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:33:9: 'loop'
            {
            match("loop"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:34:7: ( 'times' )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:34:9: 'times'
            {
            match("times"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:35:7: ( 'return' )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:35:9: 'return'
            {
            match("return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:36:7: ( '!=' )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:36:9: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:37:7: ( '==' )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:37:9: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:38:7: ( '<' )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:38:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:39:7: ( '>' )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:39:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:40:7: ( '<=' )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:40:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:41:7: ( '>=' )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:41:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:42:7: ( '+' )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:42:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:43:7: ( '-' )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:43:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:44:7: ( '*' )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:44:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:45:7: ( '/' )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:45:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:46:7: ( '!' )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:46:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:47:7: ( '[' )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:47:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:48:7: ( ']' )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:48:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:49:7: ( 'true' )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:49:9: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:50:7: ( 'false' )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:50:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:199:5: ( ( LETTER | '_' ) ( LETTER | '0' .. '9' | '_' )* )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:200:3: ( LETTER | '_' ) ( LETTER | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:200:18: ( LETTER | '0' .. '9' | '_' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
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
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:204:9: ( ( 'a' .. 'z' | 'A' .. 'Z' ) )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:205:4: ( 'a' .. 'z' | 'A' .. 'Z' )
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

    // $ANTLR start "CHAR"
    public final void mCHAR() throws RecognitionException {
        try {
            int _type = CHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:208:5: ( '\\'' . '\\'' )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:208:7: '\\'' . '\\''
            {
            match('\''); 
            matchAny(); 
            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CHAR"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:210:5: ( ( '0' .. '9' )+ )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:211:3: ( '0' .. '9' )+
            {
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:211:3: ( '0' .. '9' )+
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
            	    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:211:3: '0' .. '9'
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

    // $ANTLR start "FLOAT"
    public final void mFLOAT() throws RecognitionException {
        try {
            int _type = FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:215:2: ( INT '.' ( INT )* | '.' ( INT )+ )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                alt5=1;
            }
            else if ( (LA5_0=='.') ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:216:3: INT '.' ( INT )*
                    {
                    mINT(); 
                    match('.'); 
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:216:11: ( INT )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:216:11: INT
                    	    {
                    	    mINT(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:217:4: '.' ( INT )+
                    {
                    match('.'); 
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:217:8: ( INT )+
                    int cnt4=0;
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:217:8: INT
                    	    {
                    	    mINT(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt4 >= 1 ) break loop4;
                                EarlyExitException eee =
                                    new EarlyExitException(4, input);
                                throw eee;
                        }
                        cnt4++;
                    } while (true);


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FLOAT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:220:5: ( ( ' ' | '\\r' | '\\t' | '\\n' ) )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:221:3: ( ' ' | '\\r' | '\\t' | '\\n' )
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
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:225:5: ( '//' (~ ( '\\r' | '\\n' ) )* ( '\\r' )? '\\n' )
            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:226:6: '//' (~ ( '\\r' | '\\n' ) )* ( '\\r' )? '\\n'
            {
            match("//"); 

            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:226:11: (~ ( '\\r' | '\\n' ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='\u0000' && LA6_0<='\t')||(LA6_0>='\u000B' && LA6_0<='\f')||(LA6_0>='\u000E' && LA6_0<='\uFFFF')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:226:11: ~ ( '\\r' | '\\n' )
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
            	    break loop6;
                }
            } while (true);

            // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:226:25: ( '\\r' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\r') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:226:25: '\\r'
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
        // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:1:8: ( ASSIGN | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | ID | CHAR | INT | FLOAT | WS | SL_COMMENT )
        int alt8=50;
        alt8 = dfa8.predict(input);
        switch (alt8) {
            case 1 :
                // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:1:10: ASSIGN
                {
                mASSIGN(); 

                }
                break;
            case 2 :
                // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:1:17: T__25
                {
                mT__25(); 

                }
                break;
            case 3 :
                // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:1:23: T__26
                {
                mT__26(); 

                }
                break;
            case 4 :
                // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:1:29: T__27
                {
                mT__27(); 

                }
                break;
            case 5 :
                // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:1:35: T__28
                {
                mT__28(); 

                }
                break;
            case 6 :
                // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:1:41: T__29
                {
                mT__29(); 

                }
                break;
            case 7 :
                // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:1:47: T__30
                {
                mT__30(); 

                }
                break;
            case 8 :
                // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:1:53: T__31
                {
                mT__31(); 

                }
                break;
            case 9 :
                // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:1:59: T__32
                {
                mT__32(); 

                }
                break;
            case 10 :
                // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:1:65: T__33
                {
                mT__33(); 

                }
                break;
            case 11 :
                // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:1:71: T__34
                {
                mT__34(); 

                }
                break;
            case 12 :
                // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:1:77: T__35
                {
                mT__35(); 

                }
                break;
            case 13 :
                // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:1:83: T__36
                {
                mT__36(); 

                }
                break;
            case 14 :
                // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:1:89: T__37
                {
                mT__37(); 

                }
                break;
            case 15 :
                // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:1:95: T__38
                {
                mT__38(); 

                }
                break;
            case 16 :
                // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:1:101: T__39
                {
                mT__39(); 

                }
                break;
            case 17 :
                // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:1:107: T__40
                {
                mT__40(); 

                }
                break;
            case 18 :
                // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:1:113: T__41
                {
                mT__41(); 

                }
                break;
            case 19 :
                // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:1:119: T__42
                {
                mT__42(); 

                }
                break;
            case 20 :
                // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:1:125: T__43
                {
                mT__43(); 

                }
                break;
            case 21 :
                // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:1:131: T__44
                {
                mT__44(); 

                }
                break;
            case 22 :
                // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:1:137: T__45
                {
                mT__45(); 

                }
                break;
            case 23 :
                // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:1:143: T__46
                {
                mT__46(); 

                }
                break;
            case 24 :
                // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:1:149: T__47
                {
                mT__47(); 

                }
                break;
            case 25 :
                // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:1:155: T__48
                {
                mT__48(); 

                }
                break;
            case 26 :
                // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:1:161: T__49
                {
                mT__49(); 

                }
                break;
            case 27 :
                // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:1:167: T__50
                {
                mT__50(); 

                }
                break;
            case 28 :
                // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:1:173: T__51
                {
                mT__51(); 

                }
                break;
            case 29 :
                // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:1:179: T__52
                {
                mT__52(); 

                }
                break;
            case 30 :
                // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:1:185: T__53
                {
                mT__53(); 

                }
                break;
            case 31 :
                // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:1:191: T__54
                {
                mT__54(); 

                }
                break;
            case 32 :
                // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:1:197: T__55
                {
                mT__55(); 

                }
                break;
            case 33 :
                // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:1:203: T__56
                {
                mT__56(); 

                }
                break;
            case 34 :
                // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:1:209: T__57
                {
                mT__57(); 

                }
                break;
            case 35 :
                // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:1:215: T__58
                {
                mT__58(); 

                }
                break;
            case 36 :
                // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:1:221: T__59
                {
                mT__59(); 

                }
                break;
            case 37 :
                // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:1:227: T__60
                {
                mT__60(); 

                }
                break;
            case 38 :
                // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:1:233: T__61
                {
                mT__61(); 

                }
                break;
            case 39 :
                // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:1:239: T__62
                {
                mT__62(); 

                }
                break;
            case 40 :
                // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:1:245: T__63
                {
                mT__63(); 

                }
                break;
            case 41 :
                // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:1:251: T__64
                {
                mT__64(); 

                }
                break;
            case 42 :
                // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:1:257: T__65
                {
                mT__65(); 

                }
                break;
            case 43 :
                // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:1:263: T__66
                {
                mT__66(); 

                }
                break;
            case 44 :
                // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:1:269: T__67
                {
                mT__67(); 

                }
                break;
            case 45 :
                // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:1:275: ID
                {
                mID(); 

                }
                break;
            case 46 :
                // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:1:278: CHAR
                {
                mCHAR(); 

                }
                break;
            case 47 :
                // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:1:283: INT
                {
                mINT(); 

                }
                break;
            case 48 :
                // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:1:287: FLOAT
                {
                mFLOAT(); 

                }
                break;
            case 49 :
                // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:1:293: WS
                {
                mWS(); 

                }
                break;
            case 50 :
                // C:\\Users\\Travis_Dazell\\workspace\\Cerium\\src\\Cerium.g:1:296: SL_COMMENT
                {
                mSL_COMMENT(); 

                }
                break;

        }

    }


    protected DFA8 dfa8 = new DFA8(this);
    static final String DFA8_eotS =
        "\1\uffff\1\44\1\37\1\52\1\uffff\2\37\2\uffff\2\37\4\uffff\1\63"+
        "\7\37\1\76\1\100\1\102\3\uffff\1\104\3\uffff\1\105\3\uffff\2\37"+
        "\1\110\3\uffff\7\37\2\uffff\11\37\11\uffff\1\37\1\133\1\uffff\7"+
        "\37\1\143\12\37\1\uffff\4\37\1\162\1\37\1\164\1\uffff\2\37\1\167"+
        "\2\37\1\172\1\37\1\174\5\37\1\u0082\1\uffff\1\37\1\uffff\1\u0084"+
        "\1\u0085\1\uffff\1\37\1\u0087\1\uffff\1\u0088\1\uffff\1\37\1\u008a"+
        "\3\37\1\uffff\1\37\2\uffff\1\37\2\uffff\1\u0090\1\uffff\1\u0091"+
        "\1\u0092\1\37\1\u0094\1\u0095\3\uffff\1\37\2\uffff\1\u0097\1\uffff";
    static final String DFA8_eofS =
        "\u0098\uffff";
    static final String DFA8_minS =
        "\1\11\1\75\1\146\1\52\1\uffff\1\141\1\150\2\uffff\1\154\1\145\4"+
        "\uffff\1\135\1\141\2\157\1\150\1\157\1\151\1\145\3\75\3\uffff\1"+
        "\57\3\uffff\1\56\3\uffff\1\160\1\164\1\60\3\uffff\1\143\1\151\2"+
        "\141\1\164\1\163\1\146\2\uffff\1\157\1\154\1\151\1\157\1\151\1\157"+
        "\1\155\1\165\1\164\11\uffff\1\157\1\60\1\uffff\1\153\1\166\1\164"+
        "\1\163\1\162\2\145\1\60\1\141\1\163\1\144\2\154\1\160\2\145\1\165"+
        "\1\162\1\uffff\2\141\1\145\1\163\1\60\1\156\1\60\1\uffff\1\164\1"+
        "\145\1\60\2\145\1\60\1\163\1\60\1\162\1\164\1\147\1\164\1\143\1"+
        "\60\1\uffff\1\144\1\uffff\2\60\1\uffff\1\141\1\60\1\uffff\1\60\1"+
        "\uffff\1\156\1\60\2\145\1\164\1\uffff\1\163\2\uffff\1\156\2\uffff"+
        "\1\60\1\uffff\2\60\1\145\2\60\3\uffff\1\144\2\uffff\1\60\1\uffff";
    static final String DFA8_maxS =
        "\1\175\1\75\1\156\1\71\1\uffff\1\162\1\154\2\uffff\1\170\1\145"+
        "\4\uffff\1\135\1\154\2\157\1\150\1\157\1\162\1\145\3\75\3\uffff"+
        "\1\57\3\uffff\1\71\3\uffff\1\160\1\164\1\172\3\uffff\1\143\1\157"+
        "\2\141\1\164\1\163\1\146\2\uffff\1\157\1\154\1\151\1\157\1\151\1"+
        "\157\1\155\1\165\1\164\11\uffff\1\157\1\172\1\uffff\1\153\1\166"+
        "\1\164\1\163\1\162\2\145\1\172\1\141\1\163\1\144\2\154\1\160\2\145"+
        "\1\165\1\162\1\uffff\2\141\1\145\1\163\1\172\1\156\1\172\1\uffff"+
        "\1\164\1\145\1\172\2\145\1\172\1\163\1\172\1\162\1\164\1\147\1\164"+
        "\1\143\1\172\1\uffff\1\144\1\uffff\2\172\1\uffff\1\141\1\172\1\uffff"+
        "\1\172\1\uffff\1\156\1\172\2\145\1\164\1\uffff\1\163\2\uffff\1\156"+
        "\2\uffff\1\172\1\uffff\2\172\1\145\2\172\3\uffff\1\144\2\uffff\1"+
        "\172\1\uffff";
    static final String DFA8_acceptS =
        "\4\uffff\1\5\2\uffff\1\10\1\11\2\uffff\1\14\1\15\1\16\1\21\13\uffff"+
        "\1\44\1\45\1\46\1\uffff\1\52\1\55\1\56\1\uffff\1\61\1\37\1\1\3\uffff"+
        "\1\4\1\60\1\3\7\uffff\1\22\1\51\11\uffff\1\36\1\50\1\42\1\40\1\43"+
        "\1\41\1\62\1\47\1\57\2\uffff\1\30\22\uffff\1\24\7\uffff\1\13\16"+
        "\uffff\1\26\1\uffff\1\31\2\uffff\1\25\2\uffff\1\33\1\uffff\1\53"+
        "\5\uffff\1\7\1\uffff\1\23\1\54\1\uffff\1\32\1\34\1\uffff\1\2\5\uffff"+
        "\1\35\1\6\1\17\1\uffff\1\12\1\27\1\uffff\1\20";
    static final String DFA8_specialS =
        "\u0098\uffff}>";
    static final String[] DFA8_transitionS = {
            "\2\42\2\uffff\1\42\22\uffff\1\42\1\27\5\uffff\1\40\1\13\1\14"+
            "\1\34\1\32\1\16\1\33\1\3\1\35\12\41\1\15\1\4\1\30\1\1\1\31\2"+
            "\uffff\32\37\1\17\1\uffff\1\36\1\uffff\1\37\1\uffff\1\37\1\22"+
            "\1\6\1\12\1\11\1\20\2\37\1\2\2\37\1\24\3\37\1\5\1\37\1\26\1"+
            "\37\1\25\1\37\1\21\1\23\3\37\1\7\1\uffff\1\10",
            "\1\43",
            "\1\47\6\uffff\1\45\1\46",
            "\1\50\5\uffff\12\51",
            "",
            "\1\53\20\uffff\1\54",
            "\1\56\3\uffff\1\55",
            "",
            "",
            "\1\60\13\uffff\1\57",
            "\1\61",
            "",
            "",
            "",
            "",
            "\1\62",
            "\1\65\12\uffff\1\64",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\72\10\uffff\1\73",
            "\1\74",
            "\1\75",
            "\1\77",
            "\1\101",
            "",
            "",
            "",
            "\1\103",
            "",
            "",
            "",
            "\1\51\1\uffff\12\41",
            "",
            "",
            "",
            "\1\106",
            "\1\107",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "",
            "",
            "\1\111",
            "\1\112\5\uffff\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "",
            "",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\132",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\163",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "\1\165",
            "\1\166",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\170",
            "\1\171",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\173",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "\1\u0083",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "\1\u0086",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "\1\u0089",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "",
            "\1\u008e",
            "",
            "",
            "\1\u008f",
            "",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\u0093",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "",
            "",
            "\1\u0096",
            "",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            ""
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( ASSIGN | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | ID | CHAR | INT | FLOAT | WS | SL_COMMENT );";
        }
    }
 

}