package compilador.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPascalLexer extends Lexer {
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__59=59;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int RULE_NUM=5;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=10;
    public static final int RULE_IDENT=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=11;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=13;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int RULE_STRING=12;
    public static final int RULE_STRING_LITERAL=6;
    public static final int RULE_SL_COMMENT=14;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=15;
    public static final int RULE_NUM_REAL=7;
    public static final int RULE_ANY_OTHER=16;
    public static final int RULE_BOOL=8;
    public static final int RULE_EXPONENT=9;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators

    public InternalPascalLexer() {;} 
    public InternalPascalLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalPascalLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalPascal.g"; }

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:11:7: ( 'interface' )
            // InternalPascal.g:11:9: 'interface'
            {
            match("interface"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:12:7: ( '.' )
            // InternalPascal.g:12:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:13:7: ( 'program' )
            // InternalPascal.g:13:9: 'program'
            {
            match("program"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:14:7: ( '(' )
            // InternalPascal.g:14:9: '('
            {
            match('('); 

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
            // InternalPascal.g:15:7: ( ')' )
            // InternalPascal.g:15:9: ')'
            {
            match(')'); 

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
            // InternalPascal.g:16:7: ( ';' )
            // InternalPascal.g:16:9: ';'
            {
            match(';'); 

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
            // InternalPascal.g:17:7: ( ',' )
            // InternalPascal.g:17:9: ','
            {
            match(','); 

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
            // InternalPascal.g:18:7: ( 'implemetation' )
            // InternalPascal.g:18:9: 'implemetation'
            {
            match("implemetation"); 


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
            // InternalPascal.g:19:7: ( 'label' )
            // InternalPascal.g:19:9: 'label'
            {
            match("label"); 


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
            // InternalPascal.g:20:7: ( 'const' )
            // InternalPascal.g:20:9: 'const'
            {
            match("const"); 


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
            // InternalPascal.g:21:7: ( '=' )
            // InternalPascal.g:21:9: '='
            {
            match('='); 

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
            // InternalPascal.g:22:7: ( 'chr' )
            // InternalPascal.g:22:9: 'chr'
            {
            match("chr"); 


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
            // InternalPascal.g:23:7: ( '+' )
            // InternalPascal.g:23:9: '+'
            {
            match('+'); 

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
            // InternalPascal.g:24:7: ( '-' )
            // InternalPascal.g:24:9: '-'
            {
            match('-'); 

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
            // InternalPascal.g:25:7: ( 'uses' )
            // InternalPascal.g:25:9: 'uses'
            {
            match("uses"); 


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
            // InternalPascal.g:26:7: ( 'type' )
            // InternalPascal.g:26:9: 'type'
            {
            match("type"); 


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
            // InternalPascal.g:27:7: ( 'function' )
            // InternalPascal.g:27:9: 'function'
            {
            match("function"); 


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
            // InternalPascal.g:28:7: ( ':' )
            // InternalPascal.g:28:9: ':'
            {
            match(':'); 

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
            // InternalPascal.g:29:7: ( 'var' )
            // InternalPascal.g:29:9: 'var'
            {
            match("var"); 


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
            // InternalPascal.g:30:7: ( 'procedure' )
            // InternalPascal.g:30:9: 'procedure'
            {
            match("procedure"); 


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
            // InternalPascal.g:31:7: ( 'char' )
            // InternalPascal.g:31:9: 'char'
            {
            match("char"); 


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
            // InternalPascal.g:32:7: ( 'boolean' )
            // InternalPascal.g:32:9: 'boolean'
            {
            match("boolean"); 


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
            // InternalPascal.g:33:7: ( 'integer' )
            // InternalPascal.g:33:9: 'integer'
            {
            match("integer"); 


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
            // InternalPascal.g:34:7: ( 'real' )
            // InternalPascal.g:34:9: 'real'
            {
            match("real"); 


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
            // InternalPascal.g:35:7: ( 'string' )
            // InternalPascal.g:35:9: 'string'
            {
            match("string"); 


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
            // InternalPascal.g:36:7: ( '^' )
            // InternalPascal.g:36:9: '^'
            {
            match('^'); 

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
            // InternalPascal.g:37:7: ( '..' )
            // InternalPascal.g:37:9: '..'
            {
            match(".."); 


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
            // InternalPascal.g:38:7: ( 'packed' )
            // InternalPascal.g:38:9: 'packed'
            {
            match("packed"); 


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
            // InternalPascal.g:39:7: ( '[' )
            // InternalPascal.g:39:9: '['
            {
            match('['); 

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
            // InternalPascal.g:40:7: ( ']' )
            // InternalPascal.g:40:9: ']'
            {
            match(']'); 

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
            // InternalPascal.g:41:7: ( 'record' )
            // InternalPascal.g:41:9: 'record'
            {
            match("record"); 


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
            // InternalPascal.g:42:7: ( 'end' )
            // InternalPascal.g:42:9: 'end'
            {
            match("end"); 


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
            // InternalPascal.g:43:7: ( 'case' )
            // InternalPascal.g:43:9: 'case'
            {
            match("case"); 


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
            // InternalPascal.g:44:7: ( 'of' )
            // InternalPascal.g:44:9: 'of'
            {
            match("of"); 


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
            // InternalPascal.g:45:7: ( ':=' )
            // InternalPascal.g:45:9: ':='
            {
            match(":="); 


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
            // InternalPascal.g:46:7: ( '@' )
            // InternalPascal.g:46:9: '@'
            {
            match('@'); 

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
            // InternalPascal.g:47:7: ( '(.' )
            // InternalPascal.g:47:9: '(.'
            {
            match("(."); 


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
            // InternalPascal.g:48:7: ( '.)' )
            // InternalPascal.g:48:9: '.)'
            {
            match(".)"); 


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
            // InternalPascal.g:49:7: ( '<>' )
            // InternalPascal.g:49:9: '<>'
            {
            match("<>"); 


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
            // InternalPascal.g:50:7: ( '<' )
            // InternalPascal.g:50:9: '<'
            {
            match('<'); 

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
            // InternalPascal.g:51:7: ( '<=' )
            // InternalPascal.g:51:9: '<='
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
            // InternalPascal.g:52:7: ( '>=' )
            // InternalPascal.g:52:9: '>='
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
            // InternalPascal.g:53:7: ( '>' )
            // InternalPascal.g:53:9: '>'
            {
            match('>'); 

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
            // InternalPascal.g:54:7: ( 'in' )
            // InternalPascal.g:54:9: 'in'
            {
            match("in"); 


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
            // InternalPascal.g:55:7: ( 'or' )
            // InternalPascal.g:55:9: 'or'
            {
            match("or"); 


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
            // InternalPascal.g:56:7: ( '*' )
            // InternalPascal.g:56:9: '*'
            {
            match('*'); 

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
            // InternalPascal.g:57:7: ( '/' )
            // InternalPascal.g:57:9: '/'
            {
            match('/'); 

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
            // InternalPascal.g:58:7: ( 'div' )
            // InternalPascal.g:58:9: 'div'
            {
            match("div"); 


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
            // InternalPascal.g:59:7: ( 'mod' )
            // InternalPascal.g:59:9: 'mod'
            {
            match("mod"); 


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
            // InternalPascal.g:60:7: ( 'and' )
            // InternalPascal.g:60:9: 'and'
            {
            match("and"); 


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
            // InternalPascal.g:61:7: ( 'not' )
            // InternalPascal.g:61:9: 'not'
            {
            match("not"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:62:7: ( 'nil' )
            // InternalPascal.g:62:9: 'nil'
            {
            match("nil"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:63:7: ( 'goto' )
            // InternalPascal.g:63:9: 'goto'
            {
            match("goto"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:64:7: ( 'begin' )
            // InternalPascal.g:64:9: 'begin'
            {
            match("begin"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:65:7: ( 'else' )
            // InternalPascal.g:65:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "RULE_BOOL"
    public final void mRULE_BOOL() throws RecognitionException {
        try {
            int _type = RULE_BOOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:5056:11: ( ( 'true' | 'false' ) )
            // InternalPascal.g:5056:13: ( 'true' | 'false' )
            {
            // InternalPascal.g:5056:13: ( 'true' | 'false' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='t') ) {
                alt1=1;
            }
            else if ( (LA1_0=='f') ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalPascal.g:5056:14: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // InternalPascal.g:5056:21: 'false'
                    {
                    match("false"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BOOL"

    // $ANTLR start "RULE_IDENT"
    public final void mRULE_IDENT() throws RecognitionException {
        try {
            int _type = RULE_IDENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:5058:12: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | RULE_NUM | '_' )* )
            // InternalPascal.g:5058:14: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | RULE_NUM | '_' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalPascal.g:5058:34: ( 'a' .. 'z' | 'A' .. 'Z' | RULE_NUM | '_' )*
            loop2:
            do {
                int alt2=5;
                switch ( input.LA(1) ) {
                case 'a':
                case 'b':
                case 'c':
                case 'd':
                case 'e':
                case 'f':
                case 'g':
                case 'h':
                case 'i':
                case 'j':
                case 'k':
                case 'l':
                case 'm':
                case 'n':
                case 'o':
                case 'p':
                case 'q':
                case 'r':
                case 's':
                case 't':
                case 'u':
                case 'v':
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                    {
                    alt2=1;
                    }
                    break;
                case 'A':
                case 'B':
                case 'C':
                case 'D':
                case 'E':
                case 'F':
                case 'G':
                case 'H':
                case 'I':
                case 'J':
                case 'K':
                case 'L':
                case 'M':
                case 'N':
                case 'O':
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                case 'T':
                case 'U':
                case 'V':
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                    {
                    alt2=2;
                    }
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    {
                    alt2=3;
                    }
                    break;
                case '_':
                    {
                    alt2=4;
                    }
                    break;

                }

                switch (alt2) {
            	case 1 :
            	    // InternalPascal.g:5058:35: 'a' .. 'z'
            	    {
            	    matchRange('a','z'); 

            	    }
            	    break;
            	case 2 :
            	    // InternalPascal.g:5058:44: 'A' .. 'Z'
            	    {
            	    matchRange('A','Z'); 

            	    }
            	    break;
            	case 3 :
            	    // InternalPascal.g:5058:53: RULE_NUM
            	    {
            	    mRULE_NUM(); 

            	    }
            	    break;
            	case 4 :
            	    // InternalPascal.g:5058:62: '_'
            	    {
            	    match('_'); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_IDENT"

    // $ANTLR start "RULE_STRING_LITERAL"
    public final void mRULE_STRING_LITERAL() throws RecognitionException {
        try {
            int _type = RULE_STRING_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:5060:21: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalPascal.g:5060:23: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalPascal.g:5060:23: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='\"') ) {
                alt5=1;
            }
            else if ( (LA5_0=='\'') ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalPascal.g:5060:24: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalPascal.g:5060:28: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop3:
                    do {
                        int alt3=3;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0=='\\') ) {
                            alt3=1;
                        }
                        else if ( ((LA3_0>='\u0000' && LA3_0<='!')||(LA3_0>='#' && LA3_0<='[')||(LA3_0>=']' && LA3_0<='\uFFFF')) ) {
                            alt3=2;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalPascal.g:5060:29: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalPascal.g:5060:74: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
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

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalPascal.g:5060:94: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalPascal.g:5060:99: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='&')||(LA4_0>='(' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalPascal.g:5060:100: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalPascal.g:5060:145: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING_LITERAL"

    // $ANTLR start "RULE_EXPONENT"
    public final void mRULE_EXPONENT() throws RecognitionException {
        try {
            // InternalPascal.g:5062:24: ( 'e' ( '+' | '-' )? ( RULE_NUM )+ )
            // InternalPascal.g:5062:26: 'e' ( '+' | '-' )? ( RULE_NUM )+
            {
            match('e'); 
            // InternalPascal.g:5062:30: ( '+' | '-' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='+'||LA6_0=='-') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalPascal.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            // InternalPascal.g:5062:41: ( RULE_NUM )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalPascal.g:5062:41: RULE_NUM
            	    {
            	    mRULE_NUM(); 

            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_EXPONENT"

    // $ANTLR start "RULE_NUM"
    public final void mRULE_NUM() throws RecognitionException {
        try {
            int _type = RULE_NUM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:5064:10: ( ( '0' .. '9' )+ )
            // InternalPascal.g:5064:12: ( '0' .. '9' )+
            {
            // InternalPascal.g:5064:12: ( '0' .. '9' )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalPascal.g:5064:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NUM"

    // $ANTLR start "RULE_NUM_REAL"
    public final void mRULE_NUM_REAL() throws RecognitionException {
        try {
            int _type = RULE_NUM_REAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:5066:15: ( ( RULE_NUM )+ '.' ( RULE_NUM )+ ( RULE_EXPONENT )? )
            // InternalPascal.g:5066:17: ( RULE_NUM )+ '.' ( RULE_NUM )+ ( RULE_EXPONENT )?
            {
            // InternalPascal.g:5066:17: ( RULE_NUM )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='0' && LA9_0<='9')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalPascal.g:5066:17: RULE_NUM
            	    {
            	    mRULE_NUM(); 

            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);

            match('.'); 
            // InternalPascal.g:5066:31: ( RULE_NUM )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='0' && LA10_0<='9')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalPascal.g:5066:31: RULE_NUM
            	    {
            	    mRULE_NUM(); 

            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);

            // InternalPascal.g:5066:41: ( RULE_EXPONENT )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='e') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalPascal.g:5066:41: RULE_EXPONENT
                    {
                    mRULE_EXPONENT(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NUM_REAL"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:5068:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalPascal.g:5068:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalPascal.g:5068:11: ( '^' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='^') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalPascal.g:5068:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalPascal.g:5068:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='0' && LA13_0<='9')||(LA13_0>='A' && LA13_0<='Z')||LA13_0=='_'||(LA13_0>='a' && LA13_0<='z')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalPascal.g:
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
            	    break loop13;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:5070:10: ( ( '0' .. '9' )+ )
            // InternalPascal.g:5070:12: ( '0' .. '9' )+
            {
            // InternalPascal.g:5070:12: ( '0' .. '9' )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='0' && LA14_0<='9')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalPascal.g:5070:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:5072:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalPascal.g:5072:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalPascal.g:5072:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0=='\"') ) {
                alt17=1;
            }
            else if ( (LA17_0=='\'') ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalPascal.g:5072:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalPascal.g:5072:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop15:
                    do {
                        int alt15=3;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0=='\\') ) {
                            alt15=1;
                        }
                        else if ( ((LA15_0>='\u0000' && LA15_0<='!')||(LA15_0>='#' && LA15_0<='[')||(LA15_0>=']' && LA15_0<='\uFFFF')) ) {
                            alt15=2;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalPascal.g:5072:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalPascal.g:5072:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalPascal.g:5072:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalPascal.g:5072:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop16:
                    do {
                        int alt16=3;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0=='\\') ) {
                            alt16=1;
                        }
                        else if ( ((LA16_0>='\u0000' && LA16_0<='&')||(LA16_0>='(' && LA16_0<='[')||(LA16_0>=']' && LA16_0<='\uFFFF')) ) {
                            alt16=2;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalPascal.g:5072:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalPascal.g:5072:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:5074:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalPascal.g:5074:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalPascal.g:5074:24: ( options {greedy=false; } : . )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0=='*') ) {
                    int LA18_1 = input.LA(2);

                    if ( (LA18_1=='/') ) {
                        alt18=2;
                    }
                    else if ( ((LA18_1>='\u0000' && LA18_1<='.')||(LA18_1>='0' && LA18_1<='\uFFFF')) ) {
                        alt18=1;
                    }


                }
                else if ( ((LA18_0>='\u0000' && LA18_0<=')')||(LA18_0>='+' && LA18_0<='\uFFFF')) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalPascal.g:5074:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:5076:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalPascal.g:5076:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalPascal.g:5076:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>='\u0000' && LA19_0<='\t')||(LA19_0>='\u000B' && LA19_0<='\f')||(LA19_0>='\u000E' && LA19_0<='\uFFFF')) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalPascal.g:5076:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop19;
                }
            } while (true);

            // InternalPascal.g:5076:40: ( ( '\\r' )? '\\n' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0=='\n'||LA21_0=='\r') ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalPascal.g:5076:41: ( '\\r' )? '\\n'
                    {
                    // InternalPascal.g:5076:41: ( '\\r' )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0=='\r') ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // InternalPascal.g:5076:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:5078:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalPascal.g:5078:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalPascal.g:5078:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt22=0;
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>='\t' && LA22_0<='\n')||LA22_0=='\r'||LA22_0==' ') ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalPascal.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt22 >= 1 ) break loop22;
                        EarlyExitException eee =
                            new EarlyExitException(22, input);
                        throw eee;
                }
                cnt22++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:5080:16: ( . )
            // InternalPascal.g:5080:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalPascal.g:1:8: ( T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | RULE_BOOL | RULE_IDENT | RULE_STRING_LITERAL | RULE_NUM | RULE_NUM_REAL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt23=67;
        alt23 = dfa23.predict(input);
        switch (alt23) {
            case 1 :
                // InternalPascal.g:1:10: T__17
                {
                mT__17(); 

                }
                break;
            case 2 :
                // InternalPascal.g:1:16: T__18
                {
                mT__18(); 

                }
                break;
            case 3 :
                // InternalPascal.g:1:22: T__19
                {
                mT__19(); 

                }
                break;
            case 4 :
                // InternalPascal.g:1:28: T__20
                {
                mT__20(); 

                }
                break;
            case 5 :
                // InternalPascal.g:1:34: T__21
                {
                mT__21(); 

                }
                break;
            case 6 :
                // InternalPascal.g:1:40: T__22
                {
                mT__22(); 

                }
                break;
            case 7 :
                // InternalPascal.g:1:46: T__23
                {
                mT__23(); 

                }
                break;
            case 8 :
                // InternalPascal.g:1:52: T__24
                {
                mT__24(); 

                }
                break;
            case 9 :
                // InternalPascal.g:1:58: T__25
                {
                mT__25(); 

                }
                break;
            case 10 :
                // InternalPascal.g:1:64: T__26
                {
                mT__26(); 

                }
                break;
            case 11 :
                // InternalPascal.g:1:70: T__27
                {
                mT__27(); 

                }
                break;
            case 12 :
                // InternalPascal.g:1:76: T__28
                {
                mT__28(); 

                }
                break;
            case 13 :
                // InternalPascal.g:1:82: T__29
                {
                mT__29(); 

                }
                break;
            case 14 :
                // InternalPascal.g:1:88: T__30
                {
                mT__30(); 

                }
                break;
            case 15 :
                // InternalPascal.g:1:94: T__31
                {
                mT__31(); 

                }
                break;
            case 16 :
                // InternalPascal.g:1:100: T__32
                {
                mT__32(); 

                }
                break;
            case 17 :
                // InternalPascal.g:1:106: T__33
                {
                mT__33(); 

                }
                break;
            case 18 :
                // InternalPascal.g:1:112: T__34
                {
                mT__34(); 

                }
                break;
            case 19 :
                // InternalPascal.g:1:118: T__35
                {
                mT__35(); 

                }
                break;
            case 20 :
                // InternalPascal.g:1:124: T__36
                {
                mT__36(); 

                }
                break;
            case 21 :
                // InternalPascal.g:1:130: T__37
                {
                mT__37(); 

                }
                break;
            case 22 :
                // InternalPascal.g:1:136: T__38
                {
                mT__38(); 

                }
                break;
            case 23 :
                // InternalPascal.g:1:142: T__39
                {
                mT__39(); 

                }
                break;
            case 24 :
                // InternalPascal.g:1:148: T__40
                {
                mT__40(); 

                }
                break;
            case 25 :
                // InternalPascal.g:1:154: T__41
                {
                mT__41(); 

                }
                break;
            case 26 :
                // InternalPascal.g:1:160: T__42
                {
                mT__42(); 

                }
                break;
            case 27 :
                // InternalPascal.g:1:166: T__43
                {
                mT__43(); 

                }
                break;
            case 28 :
                // InternalPascal.g:1:172: T__44
                {
                mT__44(); 

                }
                break;
            case 29 :
                // InternalPascal.g:1:178: T__45
                {
                mT__45(); 

                }
                break;
            case 30 :
                // InternalPascal.g:1:184: T__46
                {
                mT__46(); 

                }
                break;
            case 31 :
                // InternalPascal.g:1:190: T__47
                {
                mT__47(); 

                }
                break;
            case 32 :
                // InternalPascal.g:1:196: T__48
                {
                mT__48(); 

                }
                break;
            case 33 :
                // InternalPascal.g:1:202: T__49
                {
                mT__49(); 

                }
                break;
            case 34 :
                // InternalPascal.g:1:208: T__50
                {
                mT__50(); 

                }
                break;
            case 35 :
                // InternalPascal.g:1:214: T__51
                {
                mT__51(); 

                }
                break;
            case 36 :
                // InternalPascal.g:1:220: T__52
                {
                mT__52(); 

                }
                break;
            case 37 :
                // InternalPascal.g:1:226: T__53
                {
                mT__53(); 

                }
                break;
            case 38 :
                // InternalPascal.g:1:232: T__54
                {
                mT__54(); 

                }
                break;
            case 39 :
                // InternalPascal.g:1:238: T__55
                {
                mT__55(); 

                }
                break;
            case 40 :
                // InternalPascal.g:1:244: T__56
                {
                mT__56(); 

                }
                break;
            case 41 :
                // InternalPascal.g:1:250: T__57
                {
                mT__57(); 

                }
                break;
            case 42 :
                // InternalPascal.g:1:256: T__58
                {
                mT__58(); 

                }
                break;
            case 43 :
                // InternalPascal.g:1:262: T__59
                {
                mT__59(); 

                }
                break;
            case 44 :
                // InternalPascal.g:1:268: T__60
                {
                mT__60(); 

                }
                break;
            case 45 :
                // InternalPascal.g:1:274: T__61
                {
                mT__61(); 

                }
                break;
            case 46 :
                // InternalPascal.g:1:280: T__62
                {
                mT__62(); 

                }
                break;
            case 47 :
                // InternalPascal.g:1:286: T__63
                {
                mT__63(); 

                }
                break;
            case 48 :
                // InternalPascal.g:1:292: T__64
                {
                mT__64(); 

                }
                break;
            case 49 :
                // InternalPascal.g:1:298: T__65
                {
                mT__65(); 

                }
                break;
            case 50 :
                // InternalPascal.g:1:304: T__66
                {
                mT__66(); 

                }
                break;
            case 51 :
                // InternalPascal.g:1:310: T__67
                {
                mT__67(); 

                }
                break;
            case 52 :
                // InternalPascal.g:1:316: T__68
                {
                mT__68(); 

                }
                break;
            case 53 :
                // InternalPascal.g:1:322: T__69
                {
                mT__69(); 

                }
                break;
            case 54 :
                // InternalPascal.g:1:328: T__70
                {
                mT__70(); 

                }
                break;
            case 55 :
                // InternalPascal.g:1:334: T__71
                {
                mT__71(); 

                }
                break;
            case 56 :
                // InternalPascal.g:1:340: RULE_BOOL
                {
                mRULE_BOOL(); 

                }
                break;
            case 57 :
                // InternalPascal.g:1:350: RULE_IDENT
                {
                mRULE_IDENT(); 

                }
                break;
            case 58 :
                // InternalPascal.g:1:361: RULE_STRING_LITERAL
                {
                mRULE_STRING_LITERAL(); 

                }
                break;
            case 59 :
                // InternalPascal.g:1:381: RULE_NUM
                {
                mRULE_NUM(); 

                }
                break;
            case 60 :
                // InternalPascal.g:1:390: RULE_NUM_REAL
                {
                mRULE_NUM_REAL(); 

                }
                break;
            case 61 :
                // InternalPascal.g:1:404: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 62 :
                // InternalPascal.g:1:412: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 63 :
                // InternalPascal.g:1:421: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 64 :
                // InternalPascal.g:1:433: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 65 :
                // InternalPascal.g:1:449: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 66 :
                // InternalPascal.g:1:465: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 67 :
                // InternalPascal.g:1:473: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA23 dfa23 = new DFA23(this);
    static final String DFA23_eotS =
        "\1\uffff\1\55\1\64\1\55\1\70\3\uffff\2\55\3\uffff\3\55\1\111\4\55\1\117\2\uffff\2\55\1\uffff\1\132\1\134\1\uffff\1\140\6\55\2\52\1\155\3\uffff\1\162\1\55\1\uffff\4\55\3\uffff\2\55\5\uffff\4\55\3\uffff\5\55\2\uffff\5\55\4\uffff\2\55\1\u0088\1\u0089\12\uffff\6\55\7\uffff\1\155\2\uffff\1\55\1\uffff\5\55\1\u009b\7\55\1\u00a3\5\55\1\u00a9\1\55\2\uffff\1\u00ab\1\u00ac\1\u00ad\1\u00ae\1\u00af\1\55\4\uffff\7\55\1\uffff\1\u00b9\1\u00ba\1\u00bb\1\u00bc\1\u00bd\2\55\1\uffff\2\55\1\u00c2\2\55\1\uffff\1\u00c5\5\uffff\1\u00c6\6\55\1\u00cd\1\u00ce\5\uffff\1\55\1\u00bd\1\55\1\u00d1\1\uffff\2\55\2\uffff\5\55\1\u00d9\2\uffff\2\55\1\uffff\1\u00dc\1\u00dd\1\55\1\u00df\1\55\1\u00e1\1\55\1\uffff\1\55\1\u00e4\2\uffff\1\55\1\uffff\1\55\1\uffff\1\55\1\u00e8\1\uffff\1\u00e9\1\55\1\u00eb\2\uffff\1\55\1\uffff\2\55\1\u00ef\1\uffff";
    static final String DFA23_eofS =
        "\u00f0\uffff";
    static final String DFA23_minS =
        "\1\0\1\60\1\51\1\60\1\56\3\uffff\2\60\3\uffff\3\60\1\75\4\60\1\101\2\uffff\2\60\1\uffff\2\75\1\uffff\1\52\6\60\2\0\1\56\3\uffff\2\60\1\uffff\4\60\3\uffff\2\60\5\uffff\4\60\3\uffff\5\60\2\uffff\5\60\4\uffff\4\60\12\uffff\6\60\2\0\1\uffff\2\0\2\uffff\1\56\2\uffff\1\60\1\uffff\25\60\2\uffff\6\60\1\0\2\uffff\1\0\7\60\1\uffff\7\60\1\uffff\5\60\1\uffff\1\60\5\uffff\11\60\5\uffff\4\60\1\uffff\2\60\2\uffff\6\60\2\uffff\2\60\1\uffff\7\60\1\uffff\2\60\2\uffff\1\60\1\uffff\1\60\1\uffff\2\60\1\uffff\3\60\2\uffff\1\60\1\uffff\3\60\1\uffff";
    static final String DFA23_maxS =
        "\1\uffff\1\172\1\56\1\172\1\56\3\uffff\2\172\3\uffff\3\172\1\75\5\172\2\uffff\2\172\1\uffff\1\76\1\75\1\uffff\1\57\6\172\2\uffff\1\71\3\uffff\2\172\1\uffff\4\172\3\uffff\2\172\5\uffff\4\172\3\uffff\5\172\2\uffff\5\172\4\uffff\4\172\12\uffff\6\172\2\uffff\1\uffff\2\uffff\2\uffff\1\71\2\uffff\1\172\1\uffff\25\172\2\uffff\6\172\1\uffff\2\uffff\1\uffff\7\172\1\uffff\7\172\1\uffff\5\172\1\uffff\1\172\5\uffff\11\172\5\uffff\4\172\1\uffff\2\172\2\uffff\6\172\2\uffff\2\172\1\uffff\7\172\1\uffff\2\172\2\uffff\1\172\1\uffff\1\172\1\uffff\2\172\1\uffff\3\172\2\uffff\1\172\1\uffff\3\172\1\uffff";
    static final String DFA23_acceptS =
        "\5\uffff\1\5\1\6\1\7\2\uffff\1\13\1\15\1\16\11\uffff\1\35\1\36\2\uffff\1\44\2\uffff\1\56\12\uffff\1\75\1\102\1\103\2\uffff\1\71\4\uffff\1\33\1\46\1\2\2\uffff\1\45\1\4\1\5\1\6\1\7\4\uffff\1\13\1\15\1\16\5\uffff\1\43\1\22\5\uffff\1\32\1\75\1\35\1\36\4\uffff\1\44\1\47\1\51\1\50\1\52\1\53\1\56\1\100\1\101\1\57\10\uffff\1\72\2\uffff\1\72\1\73\1\uffff\1\74\1\102\1\uffff\1\54\25\uffff\1\42\1\55\7\uffff\1\77\1\72\10\uffff\1\14\7\uffff\1\23\5\uffff\1\40\1\uffff\1\60\1\61\1\62\1\63\1\64\11\uffff\1\25\1\41\1\17\1\20\1\70\4\uffff\1\30\2\uffff\1\67\1\65\6\uffff\1\11\1\12\2\uffff\1\66\7\uffff\1\34\2\uffff\1\37\1\31\1\uffff\1\27\1\uffff\1\3\2\uffff\1\26\3\uffff\1\21\1\1\1\uffff\1\24\3\uffff\1\10";
    static final String DFA23_specialS =
        "\1\2\44\uffff\1\10\1\5\100\uffff\1\3\1\1\1\uffff\1\4\1\7\44\uffff\1\0\2\uffff\1\6\134\uffff}>";
    static final String[] DFA23_transitionS = {
            "\11\52\2\51\2\52\1\51\22\52\1\51\1\52\1\45\4\52\1\46\1\4\1\5\1\35\1\13\1\7\1\14\1\2\1\36\12\47\1\20\1\6\1\33\1\12\1\34\1\52\1\32\32\44\1\26\1\52\1\27\1\25\1\50\1\52\1\41\1\22\1\11\1\37\1\30\1\17\1\43\1\44\1\1\2\44\1\10\1\40\1\42\1\31\1\3\1\44\1\23\1\24\1\16\1\15\1\21\4\44\uff85\52",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\14\56\1\54\1\53\14\56",
            "\1\63\4\uffff\1\62",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\1\66\20\56\1\65\10\56",
            "\1\67",
            "",
            "",
            "",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\1\74\31\56",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\1\77\6\56\1\76\6\56\1\75\13\56",
            "",
            "",
            "",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\22\56\1\103\7\56",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\21\56\1\105\6\56\1\104\1\56",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\1\107\23\56\1\106\5\56",
            "\1\110",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\1\112\31\56",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\4\56\1\114\11\56\1\113\13\56",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\4\56\1\115\25\56",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\23\56\1\116\6\56",
            "\32\120\4\uffff\1\120\1\uffff\32\120",
            "",
            "",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\13\56\1\124\1\56\1\123\14\56",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\5\56\1\125\13\56\1\126\10\56",
            "",
            "\1\131\1\130",
            "\1\133",
            "",
            "\1\136\4\uffff\1\137",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\10\56\1\141\21\56",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\16\56\1\142\13\56",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\15\56\1\143\14\56",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\10\56\1\145\5\56\1\144\13\56",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\16\56\1\146\13\56",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\32\56",
            "\42\150\1\151\71\150\1\147\uffa3\150",
            "\47\153\1\154\64\153\1\152\uffa3\153",
            "\1\157\1\uffff\12\156",
            "",
            "",
            "",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\23\56\1\161\6\56",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\17\56\1\163\12\56",
            "",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\32\56",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\32\56",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\32\56",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\32\56",
            "",
            "",
            "",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\16\56\1\164\13\56",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\2\56\1\165\27\56",
            "",
            "",
            "",
            "",
            "",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\1\56\1\166\30\56",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\15\56\1\167\14\56",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\1\171\20\56\1\170\10\56",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\22\56\1\172\7\56",
            "",
            "",
            "",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\4\56\1\173\25\56",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\17\56\1\174\12\56",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\24\56\1\175\5\56",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\15\56\1\176\14\56",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\13\56\1\177\16\56",
            "",
            "",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\21\56\1\u0080\10\56",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\16\56\1\u0081\13\56",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\6\56\1\u0082\23\56",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\1\u0083\1\56\1\u0084\27\56",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\21\56\1\u0085\10\56",
            "",
            "",
            "",
            "",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\3\56\1\u0086\26\56",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\22\56\1\u0087\7\56",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\32\56",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\32\56",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\25\56\1\u008a\4\56",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\3\56\1\u008b\26\56",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\3\56\1\u008c\26\56",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\23\56\1\u008d\6\56",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\13\56\1\u008e\16\56",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\23\56\1\u008f\6\56",
            "\42\u0091\1\u0090\4\u0091\1\u0090\64\u0091\1\u0090\5\u0091\1\u0090\3\u0091\1\u0090\7\u0091\1\u0090\3\u0091\1\u0090\1\u0091\2\u0090\uff8a\u0091",
            "\42\150\1\151\71\150\1\147\uffa3\150",
            "",
            "\42\u0091\1\u0093\4\u0091\1\u0093\64\u0091\1\u0093\5\u0091\1\u0093\3\u0091\1\u0093\7\u0091\1\u0093\3\u0091\1\u0093\1\u0091\2\u0093\uff8a\u0091",
            "\47\153\1\154\64\153\1\152\uffa3\153",
            "",
            "",
            "\1\157\1\uffff\12\156",
            "",
            "",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\4\56\1\u0094\25\56",
            "",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\13\56\1\u0095\16\56",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\2\56\1\u0097\3\56\1\u0096\23\56",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\12\56\1\u0098\17\56",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\4\56\1\u0099\25\56",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\22\56\1\u009a\7\56",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\32\56",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\21\56\1\u009c\10\56",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\4\56\1\u009d\25\56",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\22\56\1\u009e\7\56",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\4\56\1\u009f\25\56",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\4\56\1\u00a0\25\56",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\2\56\1\u00a1\27\56",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\22\56\1\u00a2\7\56",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\32\56",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\13\56\1\u00a4\16\56",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\10\56\1\u00a5\21\56",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\13\56\1\u00a6\16\56",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\16\56\1\u00a7\13\56",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\10\56\1\u00a8\21\56",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\32\56",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\4\56\1\u00aa\25\56",
            "",
            "",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\32\56",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\32\56",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\32\56",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\32\56",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\32\56",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\16\56\1\u00b0\13\56",
            "\42\150\1\151\71\150\1\147\uffa3\150",
            "",
            "",
            "\47\153\1\154\64\153\1\152\uffa3\153",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\6\56\1\u00b2\12\56\1\u00b1\10\56",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\4\56\1\u00b3\25\56",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\21\56\1\u00b4\10\56",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\4\56\1\u00b5\25\56",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\4\56\1\u00b6\25\56",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\13\56\1\u00b7\16\56",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\23\56\1\u00b8\6\56",
            "",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\32\56",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\32\56",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\32\56",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\32\56",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\32\56",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\23\56\1\u00be\6\56",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\4\56\1\u00bf\25\56",
            "",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\4\56\1\u00c0\25\56",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\15\56\1\u00c1\14\56",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\32\56",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\21\56\1\u00c3\10\56",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\15\56\1\u00c4\14\56",
            "",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\32\56",
            "",
            "",
            "",
            "",
            "",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\32\56",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\5\56\1\u00c7\24\56",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\4\56\1\u00c8\25\56",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\14\56\1\u00c9\15\56",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\1\u00ca\31\56",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\3\56\1\u00cb\26\56",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\3\56\1\u00cc\26\56",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\32\56",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\32\56",
            "",
            "",
            "",
            "",
            "",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\10\56\1\u00cf\21\56",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\32\56",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\1\u00d0\31\56",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\32\56",
            "",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\3\56\1\u00d2\26\56",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\6\56\1\u00d3\23\56",
            "",
            "",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\1\u00d4\31\56",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\21\56\1\u00d5\10\56",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\4\56\1\u00d6\25\56",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\14\56\1\u00d7\15\56",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\24\56\1\u00d8\5\56",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\32\56",
            "",
            "",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\16\56\1\u00da\13\56",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\15\56\1\u00db\14\56",
            "",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\32\56",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\32\56",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\2\56\1\u00de\27\56",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\32\56",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\23\56\1\u00e0\6\56",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\32\56",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\21\56\1\u00e2\10\56",
            "",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\15\56\1\u00e3\14\56",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\32\56",
            "",
            "",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\4\56\1\u00e5\25\56",
            "",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\1\u00e6\31\56",
            "",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\4\56\1\u00e7\25\56",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\32\56",
            "",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\32\56",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\23\56\1\u00ea\6\56",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\32\56",
            "",
            "",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\10\56\1\u00ec\21\56",
            "",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\16\56\1\u00ed\13\56",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\15\56\1\u00ee\14\56",
            "\12\60\7\uffff\32\57\4\uffff\1\61\1\uffff\32\56",
            ""
    };

    static final short[] DFA23_eot = DFA.unpackEncodedString(DFA23_eotS);
    static final short[] DFA23_eof = DFA.unpackEncodedString(DFA23_eofS);
    static final char[] DFA23_min = DFA.unpackEncodedStringToUnsignedChars(DFA23_minS);
    static final char[] DFA23_max = DFA.unpackEncodedStringToUnsignedChars(DFA23_maxS);
    static final short[] DFA23_accept = DFA.unpackEncodedString(DFA23_acceptS);
    static final short[] DFA23_special = DFA.unpackEncodedString(DFA23_specialS);
    static final short[][] DFA23_transition;

    static {
        int numStates = DFA23_transitionS.length;
        DFA23_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA23_transition[i] = DFA.unpackEncodedString(DFA23_transitionS[i]);
        }
    }

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = DFA23_eot;
            this.eof = DFA23_eof;
            this.min = DFA23_min;
            this.max = DFA23_max;
            this.accept = DFA23_accept;
            this.special = DFA23_special;
            this.transition = DFA23_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | RULE_BOOL | RULE_IDENT | RULE_STRING_LITERAL | RULE_NUM | RULE_NUM_REAL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA23_144 = input.LA(1);

                        s = -1;
                        if ( (LA23_144=='\"') ) {s = 105;}

                        else if ( (LA23_144=='\\') ) {s = 103;}

                        else if ( ((LA23_144>='\u0000' && LA23_144<='!')||(LA23_144>='#' && LA23_144<='[')||(LA23_144>=']' && LA23_144<='\uFFFF')) ) {s = 104;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA23_104 = input.LA(1);

                        s = -1;
                        if ( (LA23_104=='\"') ) {s = 105;}

                        else if ( (LA23_104=='\\') ) {s = 103;}

                        else if ( ((LA23_104>='\u0000' && LA23_104<='!')||(LA23_104>='#' && LA23_104<='[')||(LA23_104>=']' && LA23_104<='\uFFFF')) ) {s = 104;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA23_0 = input.LA(1);

                        s = -1;
                        if ( (LA23_0=='i') ) {s = 1;}

                        else if ( (LA23_0=='.') ) {s = 2;}

                        else if ( (LA23_0=='p') ) {s = 3;}

                        else if ( (LA23_0=='(') ) {s = 4;}

                        else if ( (LA23_0==')') ) {s = 5;}

                        else if ( (LA23_0==';') ) {s = 6;}

                        else if ( (LA23_0==',') ) {s = 7;}

                        else if ( (LA23_0=='l') ) {s = 8;}

                        else if ( (LA23_0=='c') ) {s = 9;}

                        else if ( (LA23_0=='=') ) {s = 10;}

                        else if ( (LA23_0=='+') ) {s = 11;}

                        else if ( (LA23_0=='-') ) {s = 12;}

                        else if ( (LA23_0=='u') ) {s = 13;}

                        else if ( (LA23_0=='t') ) {s = 14;}

                        else if ( (LA23_0=='f') ) {s = 15;}

                        else if ( (LA23_0==':') ) {s = 16;}

                        else if ( (LA23_0=='v') ) {s = 17;}

                        else if ( (LA23_0=='b') ) {s = 18;}

                        else if ( (LA23_0=='r') ) {s = 19;}

                        else if ( (LA23_0=='s') ) {s = 20;}

                        else if ( (LA23_0=='^') ) {s = 21;}

                        else if ( (LA23_0=='[') ) {s = 22;}

                        else if ( (LA23_0==']') ) {s = 23;}

                        else if ( (LA23_0=='e') ) {s = 24;}

                        else if ( (LA23_0=='o') ) {s = 25;}

                        else if ( (LA23_0=='@') ) {s = 26;}

                        else if ( (LA23_0=='<') ) {s = 27;}

                        else if ( (LA23_0=='>') ) {s = 28;}

                        else if ( (LA23_0=='*') ) {s = 29;}

                        else if ( (LA23_0=='/') ) {s = 30;}

                        else if ( (LA23_0=='d') ) {s = 31;}

                        else if ( (LA23_0=='m') ) {s = 32;}

                        else if ( (LA23_0=='a') ) {s = 33;}

                        else if ( (LA23_0=='n') ) {s = 34;}

                        else if ( (LA23_0=='g') ) {s = 35;}

                        else if ( ((LA23_0>='A' && LA23_0<='Z')||LA23_0=='h'||(LA23_0>='j' && LA23_0<='k')||LA23_0=='q'||(LA23_0>='w' && LA23_0<='z')) ) {s = 36;}

                        else if ( (LA23_0=='\"') ) {s = 37;}

                        else if ( (LA23_0=='\'') ) {s = 38;}

                        else if ( ((LA23_0>='0' && LA23_0<='9')) ) {s = 39;}

                        else if ( (LA23_0=='_') ) {s = 40;}

                        else if ( ((LA23_0>='\t' && LA23_0<='\n')||LA23_0=='\r'||LA23_0==' ') ) {s = 41;}

                        else if ( ((LA23_0>='\u0000' && LA23_0<='\b')||(LA23_0>='\u000B' && LA23_0<='\f')||(LA23_0>='\u000E' && LA23_0<='\u001F')||LA23_0=='!'||(LA23_0>='#' && LA23_0<='&')||LA23_0=='?'||LA23_0=='\\'||LA23_0=='`'||(LA23_0>='{' && LA23_0<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA23_103 = input.LA(1);

                        s = -1;
                        if ( (LA23_103=='\"'||LA23_103=='\''||LA23_103=='\\'||LA23_103=='b'||LA23_103=='f'||LA23_103=='n'||LA23_103=='r'||(LA23_103>='t' && LA23_103<='u')) ) {s = 144;}

                        else if ( ((LA23_103>='\u0000' && LA23_103<='!')||(LA23_103>='#' && LA23_103<='&')||(LA23_103>='(' && LA23_103<='[')||(LA23_103>=']' && LA23_103<='a')||(LA23_103>='c' && LA23_103<='e')||(LA23_103>='g' && LA23_103<='m')||(LA23_103>='o' && LA23_103<='q')||LA23_103=='s'||(LA23_103>='v' && LA23_103<='\uFFFF')) ) {s = 145;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA23_106 = input.LA(1);

                        s = -1;
                        if ( (LA23_106=='\"'||LA23_106=='\''||LA23_106=='\\'||LA23_106=='b'||LA23_106=='f'||LA23_106=='n'||LA23_106=='r'||(LA23_106>='t' && LA23_106<='u')) ) {s = 147;}

                        else if ( ((LA23_106>='\u0000' && LA23_106<='!')||(LA23_106>='#' && LA23_106<='&')||(LA23_106>='(' && LA23_106<='[')||(LA23_106>=']' && LA23_106<='a')||(LA23_106>='c' && LA23_106<='e')||(LA23_106>='g' && LA23_106<='m')||(LA23_106>='o' && LA23_106<='q')||LA23_106=='s'||(LA23_106>='v' && LA23_106<='\uFFFF')) ) {s = 145;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA23_38 = input.LA(1);

                        s = -1;
                        if ( (LA23_38=='\\') ) {s = 106;}

                        else if ( ((LA23_38>='\u0000' && LA23_38<='&')||(LA23_38>='(' && LA23_38<='[')||(LA23_38>=']' && LA23_38<='\uFFFF')) ) {s = 107;}

                        else if ( (LA23_38=='\'') ) {s = 108;}

                        else s = 42;

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA23_147 = input.LA(1);

                        s = -1;
                        if ( (LA23_147=='\'') ) {s = 108;}

                        else if ( (LA23_147=='\\') ) {s = 106;}

                        else if ( ((LA23_147>='\u0000' && LA23_147<='&')||(LA23_147>='(' && LA23_147<='[')||(LA23_147>=']' && LA23_147<='\uFFFF')) ) {s = 107;}

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA23_107 = input.LA(1);

                        s = -1;
                        if ( (LA23_107=='\'') ) {s = 108;}

                        else if ( (LA23_107=='\\') ) {s = 106;}

                        else if ( ((LA23_107>='\u0000' && LA23_107<='&')||(LA23_107>='(' && LA23_107<='[')||(LA23_107>=']' && LA23_107<='\uFFFF')) ) {s = 107;}

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA23_37 = input.LA(1);

                        s = -1;
                        if ( (LA23_37=='\\') ) {s = 103;}

                        else if ( ((LA23_37>='\u0000' && LA23_37<='!')||(LA23_37>='#' && LA23_37<='[')||(LA23_37>=']' && LA23_37<='\uFFFF')) ) {s = 104;}

                        else if ( (LA23_37=='\"') ) {s = 105;}

                        else s = 42;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 23, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}