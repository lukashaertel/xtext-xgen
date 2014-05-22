package xgen.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalApplicationLexer extends Lexer {
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int RULE_CHAR=6;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators

    public InternalApplicationLexer() {;} 
    public InternalApplicationLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalApplicationLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g"; }

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:11:7: ( '(' )
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:11:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:12:7: ( '..' )
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:12:9: '..'
            {
            match(".."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:13:7: ( ')' )
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:13:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:14:7: ( '{' )
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:14:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:15:7: ( '}' )
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:15:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:16:7: ( 'replace' )
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:16:9: 'replace'
            {
            match("replace"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:17:7: ( '/' )
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:17:9: '/'
            {
            match('/'); 

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
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:18:7: ( 'in' )
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:18:9: 'in'
            {
            match("in"); 


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
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:19:7: ( 'with' )
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:19:9: 'with'
            {
            match("with"); 


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
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:20:7: ( 'adjust' )
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:20:9: 'adjust'
            {
            match("adjust"); 


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
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:21:7: ( 'multiplicity' )
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:21:9: 'multiplicity'
            {
            match("multiplicity"); 


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
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:22:7: ( ',' )
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:22:9: ','
            {
            match(','); 

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
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:23:7: ( '.' )
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:23:9: '.'
            {
            match('.'); 

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
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:24:7: ( 'lexical' )
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:24:9: 'lexical'
            {
            match("lexical"); 


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
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:25:7: ( ':' )
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:25:9: ':'
            {
            match(':'); 

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
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:26:7: ( ';' )
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:26:9: ';'
            {
            match(';'); 

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
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:27:7: ( '|' )
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:27:9: '|'
            {
            match('|'); 

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
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:28:7: ( '!' )
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:28:9: '!'
            {
            match('!'); 

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
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:29:7: ( '->' )
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:29:9: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:1186:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:1186:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:1186:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:1186:11: '^'
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

            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:1186:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:
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
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:1188:10: ( ( '0' .. '9' )+ )
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:1188:12: ( '0' .. '9' )+
            {
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:1188:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:1188:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
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
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:1190:13: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' )
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:1190:15: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
            {
            match('\"'); 
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:1190:19: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
            loop4:
            do {
                int alt4=3;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='\\') ) {
                    alt4=1;
                }
                else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                    alt4=2;
                }


                switch (alt4) {
            	case 1 :
            	    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:1190:20: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
            	    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:1190:65: ~ ( ( '\\\\' | '\"' ) )
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
            	    break loop4;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_CHAR"
    public final void mRULE_CHAR() throws RecognitionException {
        try {
            int _type = RULE_CHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:1192:11: ( '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) ) '\\'' )
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:1192:13: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) ) '\\''
            {
            match('\''); 
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:1192:18: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='\\') ) {
                alt5=1;
            }
            else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:1192:19: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:1192:64: ~ ( ( '\\\\' | '\\'' ) )
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

            }

            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CHAR"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:1194:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:1194:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:1194:24: ( options {greedy=false; } : . )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0=='*') ) {
                    int LA6_1 = input.LA(2);

                    if ( (LA6_1=='/') ) {
                        alt6=2;
                    }
                    else if ( ((LA6_1>='\u0000' && LA6_1<='.')||(LA6_1>='0' && LA6_1<='\uFFFF')) ) {
                        alt6=1;
                    }


                }
                else if ( ((LA6_0>='\u0000' && LA6_0<=')')||(LA6_0>='+' && LA6_0<='\uFFFF')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:1194:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop6;
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
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:1196:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:1196:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:1196:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='\u0000' && LA7_0<='\t')||(LA7_0>='\u000B' && LA7_0<='\f')||(LA7_0>='\u000E' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:1196:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop7;
                }
            } while (true);

            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:1196:40: ( ( '\\r' )? '\\n' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\n'||LA9_0=='\r') ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:1196:41: ( '\\r' )? '\\n'
                    {
                    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:1196:41: ( '\\r' )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0=='\r') ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:1196:41: '\\r'
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
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:1198:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:1198:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:1198:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\t' && LA10_0<='\n')||LA10_0=='\r'||LA10_0==' ') ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:
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
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    public void mTokens() throws RecognitionException {
        // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:1:8: ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | RULE_ID | RULE_INT | RULE_STRING | RULE_CHAR | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS )
        int alt11=26;
        alt11 = dfa11.predict(input);
        switch (alt11) {
            case 1 :
                // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:1:10: T__11
                {
                mT__11(); 

                }
                break;
            case 2 :
                // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:1:16: T__12
                {
                mT__12(); 

                }
                break;
            case 3 :
                // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:1:22: T__13
                {
                mT__13(); 

                }
                break;
            case 4 :
                // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:1:28: T__14
                {
                mT__14(); 

                }
                break;
            case 5 :
                // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:1:34: T__15
                {
                mT__15(); 

                }
                break;
            case 6 :
                // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:1:40: T__16
                {
                mT__16(); 

                }
                break;
            case 7 :
                // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:1:46: T__17
                {
                mT__17(); 

                }
                break;
            case 8 :
                // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:1:52: T__18
                {
                mT__18(); 

                }
                break;
            case 9 :
                // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:1:58: T__19
                {
                mT__19(); 

                }
                break;
            case 10 :
                // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:1:64: T__20
                {
                mT__20(); 

                }
                break;
            case 11 :
                // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:1:70: T__21
                {
                mT__21(); 

                }
                break;
            case 12 :
                // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:1:76: T__22
                {
                mT__22(); 

                }
                break;
            case 13 :
                // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:1:82: T__23
                {
                mT__23(); 

                }
                break;
            case 14 :
                // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:1:88: T__24
                {
                mT__24(); 

                }
                break;
            case 15 :
                // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:1:94: T__25
                {
                mT__25(); 

                }
                break;
            case 16 :
                // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:1:100: T__26
                {
                mT__26(); 

                }
                break;
            case 17 :
                // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:1:106: T__27
                {
                mT__27(); 

                }
                break;
            case 18 :
                // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:1:112: T__28
                {
                mT__28(); 

                }
                break;
            case 19 :
                // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:1:118: T__29
                {
                mT__29(); 

                }
                break;
            case 20 :
                // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:1:124: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 21 :
                // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:1:132: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 22 :
                // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:1:141: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 23 :
                // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:1:153: RULE_CHAR
                {
                mRULE_CHAR(); 

                }
                break;
            case 24 :
                // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:1:163: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 25 :
                // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:1:179: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 26 :
                // ../xgen.application/src-gen/xgen/parser/antlr/internal/InternalApplication.g:1:195: RULE_WS
                {
                mRULE_WS(); 

                }
                break;

        }

    }


    protected DFA11 dfa11 = new DFA11(this);
    static final String DFA11_eotS =
        "\2\uffff\1\31\3\uffff\1\23\1\35\4\23\1\uffff\1\23\14\uffff\1\23"+
        "\3\uffff\1\44\5\23\1\uffff\5\23\1\57\4\23\1\uffff\4\23\1\70\2\23"+
        "\1\73\1\uffff\1\23\1\75\1\uffff\1\23\1\uffff\3\23\1\102\1\uffff";
    static final String DFA11_eofS =
        "\103\uffff";
    static final String DFA11_minS =
        "\1\11\1\uffff\1\56\3\uffff\1\145\1\52\1\156\1\151\1\144\1\165\1"+
        "\uffff\1\145\14\uffff\1\160\3\uffff\1\60\1\164\1\152\1\154\1\170"+
        "\1\154\1\uffff\1\150\1\165\1\164\1\151\1\141\1\60\1\163\1\151\2"+
        "\143\1\uffff\1\164\1\160\1\141\1\145\1\60\2\154\1\60\1\uffff\1\151"+
        "\1\60\1\uffff\1\143\1\uffff\1\151\1\164\1\171\1\60\1\uffff";
    static final String DFA11_maxS =
        "\1\175\1\uffff\1\56\3\uffff\1\145\1\57\1\156\1\151\1\144\1\165"+
        "\1\uffff\1\145\14\uffff\1\160\3\uffff\1\172\1\164\1\152\1\154\1"+
        "\170\1\154\1\uffff\1\150\1\165\1\164\1\151\1\141\1\172\1\163\1\151"+
        "\2\143\1\uffff\1\164\1\160\1\141\1\145\1\172\2\154\1\172\1\uffff"+
        "\1\151\1\172\1\uffff\1\143\1\uffff\1\151\1\164\1\171\1\172\1\uffff";
    static final String DFA11_acceptS =
        "\1\uffff\1\1\1\uffff\1\3\1\4\1\5\6\uffff\1\14\1\uffff\1\17\1\20"+
        "\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\32\1\2\1\15\1\uffff\1\30\1"+
        "\31\1\7\6\uffff\1\10\12\uffff\1\11\10\uffff\1\12\2\uffff\1\6\1\uffff"+
        "\1\16\4\uffff\1\13";
    static final String DFA11_specialS =
        "\103\uffff}>";
    static final String[] DFA11_transitionS = {
            "\2\27\2\uffff\1\27\22\uffff\1\27\1\21\1\25\4\uffff\1\26\1\1"+
            "\1\3\2\uffff\1\14\1\22\1\2\1\7\12\24\1\16\1\17\5\uffff\32\23"+
            "\3\uffff\2\23\1\uffff\1\12\7\23\1\10\2\23\1\15\1\13\4\23\1\6"+
            "\4\23\1\11\3\23\1\4\1\20\1\5",
            "",
            "\1\30",
            "",
            "",
            "",
            "\1\32",
            "\1\33\4\uffff\1\34",
            "\1\36",
            "\1\37",
            "\1\40",
            "\1\41",
            "",
            "\1\42",
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
            "",
            "",
            "\1\43",
            "",
            "",
            "",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "\1\45",
            "\1\46",
            "\1\47",
            "\1\50",
            "\1\51",
            "",
            "\1\52",
            "\1\53",
            "\1\54",
            "\1\55",
            "\1\56",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "\1\71",
            "\1\72",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "",
            "\1\74",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "",
            "\1\76",
            "",
            "\1\77",
            "\1\100",
            "\1\101",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            ""
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | RULE_ID | RULE_INT | RULE_STRING | RULE_CHAR | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS );";
        }
    }
 

}