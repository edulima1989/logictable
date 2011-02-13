// $ANTLR 3.3 Nov 30, 2010 12:45:30 LogicTableAnalisis.g 2011-02-12 21:09:32
package logictable.analizador;
import org.antlr.runtime.*;

public class LogicTableAnalisisLexer extends Lexer {
    public static final int EOF=-1;
    public static final int OP_UNION=4;
    public static final int OP_NEGACION=5;
    public static final int OP_INTERSECCION=6;
    public static final int OP_BICONDICIONAL=7;
    public static final int OP_CONDICIONAL=8;
    public static final int PARENT_AB=9;
    public static final int PARENT_CE=10;
    public static final int VARIABLE_A=11;
    public static final int VARIABLE_B=12;
    public static final int VARIABLE_C=13;
    public static final int BLANCO=14;

    // delegates
    // delegators

    public LogicTableAnalisisLexer() {;} 
    public LogicTableAnalisisLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public LogicTableAnalisisLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "LogicTableAnalisis.g"; }

    // $ANTLR start "OP_UNION"
    public final void mOP_UNION() throws RecognitionException {
        try {
            int _type = OP_UNION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // LogicTableAnalisis.g:8:14: ( '+' )
            // LogicTableAnalisis.g:8:16: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OP_UNION"

    // $ANTLR start "OP_NEGACION"
    public final void mOP_NEGACION() throws RecognitionException {
        try {
            int _type = OP_NEGACION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // LogicTableAnalisis.g:9:13: ( '-' )
            // LogicTableAnalisis.g:9:15: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OP_NEGACION"

    // $ANTLR start "OP_INTERSECCION"
    public final void mOP_INTERSECCION() throws RecognitionException {
        try {
            int _type = OP_INTERSECCION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // LogicTableAnalisis.g:10:17: ( '*' )
            // LogicTableAnalisis.g:10:19: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OP_INTERSECCION"

    // $ANTLR start "OP_BICONDICIONAL"
    public final void mOP_BICONDICIONAL() throws RecognitionException {
        try {
            int _type = OP_BICONDICIONAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // LogicTableAnalisis.g:11:18: ( '<=>' )
            // LogicTableAnalisis.g:11:20: '<=>'
            {
            match("<=>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OP_BICONDICIONAL"

    // $ANTLR start "OP_CONDICIONAL"
    public final void mOP_CONDICIONAL() throws RecognitionException {
        try {
            int _type = OP_CONDICIONAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // LogicTableAnalisis.g:12:16: ( '=>' )
            // LogicTableAnalisis.g:12:18: '=>'
            {
            match("=>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OP_CONDICIONAL"

    // $ANTLR start "PARENT_AB"
    public final void mPARENT_AB() throws RecognitionException {
        try {
            int _type = PARENT_AB;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // LogicTableAnalisis.g:13:11: ( '(' )
            // LogicTableAnalisis.g:13:13: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PARENT_AB"

    // $ANTLR start "PARENT_CE"
    public final void mPARENT_CE() throws RecognitionException {
        try {
            int _type = PARENT_CE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // LogicTableAnalisis.g:14:11: ( ')' )
            // LogicTableAnalisis.g:14:13: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PARENT_CE"

    // $ANTLR start "VARIABLE_A"
    public final void mVARIABLE_A() throws RecognitionException {
        try {
            int _type = VARIABLE_A;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // LogicTableAnalisis.g:15:12: ( 'a' )
            // LogicTableAnalisis.g:15:14: 'a'
            {
            match('a'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VARIABLE_A"

    // $ANTLR start "VARIABLE_B"
    public final void mVARIABLE_B() throws RecognitionException {
        try {
            int _type = VARIABLE_B;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // LogicTableAnalisis.g:16:12: ( 'b' )
            // LogicTableAnalisis.g:16:14: 'b'
            {
            match('b'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VARIABLE_B"

    // $ANTLR start "VARIABLE_C"
    public final void mVARIABLE_C() throws RecognitionException {
        try {
            int _type = VARIABLE_C;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // LogicTableAnalisis.g:17:12: ( 'c' )
            // LogicTableAnalisis.g:17:14: 'c'
            {
            match('c'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VARIABLE_C"

    // $ANTLR start "BLANCO"
    public final void mBLANCO() throws RecognitionException {
        try {
            int _type = BLANCO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // LogicTableAnalisis.g:18:8: ( ( ' ' | '\\t' ) )
            // LogicTableAnalisis.g:18:10: ( ' ' | '\\t' )
            {
            if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

//             $setType(Token.SKIP);

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BLANCO"

    public void mTokens() throws RecognitionException {
        // LogicTableAnalisis.g:1:8: ( OP_UNION | OP_NEGACION | OP_INTERSECCION | OP_BICONDICIONAL | OP_CONDICIONAL | PARENT_AB | PARENT_CE | VARIABLE_A | VARIABLE_B | VARIABLE_C | BLANCO )
        int alt1=11;
        switch ( input.LA(1) ) {
        case '+':
            {
            alt1=1;
            }
            break;
        case '-':
            {
            alt1=2;
            }
            break;
        case '*':
            {
            alt1=3;
            }
            break;
        case '<':
            {
            alt1=4;
            }
            break;
        case '=':
            {
            alt1=5;
            }
            break;
        case '(':
            {
            alt1=6;
            }
            break;
        case ')':
            {
            alt1=7;
            }
            break;
        case 'a':
            {
            alt1=8;
            }
            break;
        case 'b':
            {
            alt1=9;
            }
            break;
        case 'c':
            {
            alt1=10;
            }
            break;
        case '\t':
        case ' ':
            {
            alt1=11;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 1, 0, input);

            throw nvae;
        }

        switch (alt1) {
            case 1 :
                // LogicTableAnalisis.g:1:10: OP_UNION
                {
                mOP_UNION(); 

                }
                break;
            case 2 :
                // LogicTableAnalisis.g:1:19: OP_NEGACION
                {
                mOP_NEGACION(); 

                }
                break;
            case 3 :
                // LogicTableAnalisis.g:1:31: OP_INTERSECCION
                {
                mOP_INTERSECCION(); 

                }
                break;
            case 4 :
                // LogicTableAnalisis.g:1:47: OP_BICONDICIONAL
                {
                mOP_BICONDICIONAL(); 

                }
                break;
            case 5 :
                // LogicTableAnalisis.g:1:64: OP_CONDICIONAL
                {
                mOP_CONDICIONAL(); 

                }
                break;
            case 6 :
                // LogicTableAnalisis.g:1:79: PARENT_AB
                {
                mPARENT_AB(); 

                }
                break;
            case 7 :
                // LogicTableAnalisis.g:1:89: PARENT_CE
                {
                mPARENT_CE(); 

                }
                break;
            case 8 :
                // LogicTableAnalisis.g:1:99: VARIABLE_A
                {
                mVARIABLE_A(); 

                }
                break;
            case 9 :
                // LogicTableAnalisis.g:1:110: VARIABLE_B
                {
                mVARIABLE_B(); 

                }
                break;
            case 10 :
                // LogicTableAnalisis.g:1:121: VARIABLE_C
                {
                mVARIABLE_C(); 

                }
                break;
            case 11 :
                // LogicTableAnalisis.g:1:132: BLANCO
                {
                mBLANCO(); 

                }
                break;

        }

    }


 

}