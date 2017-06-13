// $ANTLR 3.5.2 Cql__.g 2017-06-13 08:16:38

    package org.apache.cassandra.cql3;

    import org.apache.cassandra.exceptions.SyntaxException;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class CqlLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__185=185;
	public static final int T__186=186;
	public static final int T__187=187;
	public static final int T__188=188;
	public static final int T__189=189;
	public static final int T__190=190;
	public static final int T__191=191;
	public static final int T__192=192;
	public static final int T__193=193;
	public static final int T__194=194;
	public static final int T__195=195;
	public static final int T__196=196;
	public static final int T__197=197;
	public static final int T__198=198;
	public static final int T__199=199;
	public static final int T__200=200;
	public static final int T__201=201;
	public static final int T__202=202;
	public static final int T__203=203;
	public static final int T__204=204;
	public static final int T__205=205;
	public static final int T__206=206;
	public static final int T__207=207;
	public static final int T__208=208;
	public static final int A=4;
	public static final int B=5;
	public static final int BOOLEAN=6;
	public static final int C=7;
	public static final int COMMENT=8;
	public static final int D=9;
	public static final int DIGIT=10;
	public static final int DURATION=11;
	public static final int DURATION_UNIT=12;
	public static final int E=13;
	public static final int EXPONENT=14;
	public static final int F=15;
	public static final int FLOAT=16;
	public static final int G=17;
	public static final int H=18;
	public static final int HEX=19;
	public static final int HEXNUMBER=20;
	public static final int I=21;
	public static final int IDENT=22;
	public static final int INTEGER=23;
	public static final int J=24;
	public static final int K=25;
	public static final int K_ADD=26;
	public static final int K_AGGREGATE=27;
	public static final int K_ALL=28;
	public static final int K_ALLOW=29;
	public static final int K_ALTER=30;
	public static final int K_AND=31;
	public static final int K_APPLY=32;
	public static final int K_AS=33;
	public static final int K_ASC=34;
	public static final int K_ASCII=35;
	public static final int K_AUTHORIZE=36;
	public static final int K_BATCH=37;
	public static final int K_BEGIN=38;
	public static final int K_BIGINT=39;
	public static final int K_BLOB=40;
	public static final int K_BOOLEAN=41;
	public static final int K_BY=42;
	public static final int K_CALLED=43;
	public static final int K_CAST=44;
	public static final int K_CLUSTERING=45;
	public static final int K_COLUMNFAMILY=46;
	public static final int K_COMPACT=47;
	public static final int K_CONTAINS=48;
	public static final int K_COUNT=49;
	public static final int K_COUNTER=50;
	public static final int K_CREATE=51;
	public static final int K_CUSTOM=52;
	public static final int K_DATE=53;
	public static final int K_DECIMAL=54;
	public static final int K_DEFAULT=55;
	public static final int K_DELETE=56;
	public static final int K_DESC=57;
	public static final int K_DESCRIBE=58;
	public static final int K_DISTINCT=59;
	public static final int K_DOUBLE=60;
	public static final int K_DROP=61;
	public static final int K_DURATION=62;
	public static final int K_ENTRIES=63;
	public static final int K_EXECUTE=64;
	public static final int K_EXISTS=65;
	public static final int K_FILTERING=66;
	public static final int K_FINALFUNC=67;
	public static final int K_FLOAT=68;
	public static final int K_FROM=69;
	public static final int K_FROZEN=70;
	public static final int K_FULL=71;
	public static final int K_FUNCTION=72;
	public static final int K_FUNCTIONS=73;
	public static final int K_GRANT=74;
	public static final int K_GROUP=75;
	public static final int K_IF=76;
	public static final int K_IN=77;
	public static final int K_INDEX=78;
	public static final int K_INET=79;
	public static final int K_INITCOND=80;
	public static final int K_INPUT=81;
	public static final int K_INSERT=82;
	public static final int K_INT=83;
	public static final int K_INTO=84;
	public static final int K_IS=85;
	public static final int K_JSON=86;
	public static final int K_KEY=87;
	public static final int K_KEYS=88;
	public static final int K_KEYSPACE=89;
	public static final int K_KEYSPACES=90;
	public static final int K_LANGUAGE=91;
	public static final int K_LIKE=92;
	public static final int K_LIMIT=93;
	public static final int K_LIST=94;
	public static final int K_LOGIN=95;
	public static final int K_MAP=96;
	public static final int K_MATERIALIZED=97;
	public static final int K_MBEAN=98;
	public static final int K_MBEANS=99;
	public static final int K_MODIFY=100;
	public static final int K_NEGATIVE_INFINITY=101;
	public static final int K_NEGATIVE_NAN=102;
	public static final int K_NOLOGIN=103;
	public static final int K_NORECURSIVE=104;
	public static final int K_NOSUPERUSER=105;
	public static final int K_NOT=106;
	public static final int K_NULL=107;
	public static final int K_OF=108;
	public static final int K_ON=109;
	public static final int K_OPTIONS=110;
	public static final int K_OR=111;
	public static final int K_ORDER=112;
	public static final int K_PARTITION=113;
	public static final int K_PASSWORD=114;
	public static final int K_PER=115;
	public static final int K_PERMISSION=116;
	public static final int K_PERMISSIONS=117;
	public static final int K_POSITIVE_INFINITY=118;
	public static final int K_POSITIVE_NAN=119;
	public static final int K_PRIMARY=120;
	public static final int K_RENAME=121;
	public static final int K_REPLACE=122;
	public static final int K_RETURNS=123;
	public static final int K_REVOKE=124;
	public static final int K_ROLE=125;
	public static final int K_ROLES=126;
	public static final int K_SELECT=127;
	public static final int K_SET=128;
	public static final int K_SFUNC=129;
	public static final int K_SMALLINT=130;
	public static final int K_STATIC=131;
	public static final int K_STORAGE=132;
	public static final int K_STYPE=133;
	public static final int K_SUPERUSER=134;
	public static final int K_TEXT=135;
	public static final int K_TIME=136;
	public static final int K_TIMESTAMP=137;
	public static final int K_TIMEUUID=138;
	public static final int K_TINYINT=139;
	public static final int K_TO=140;
	public static final int K_TOKEN=141;
	public static final int K_TRIGGER=142;
	public static final int K_TRUNCATE=143;
	public static final int K_TTL=144;
	public static final int K_TUPLE=145;
	public static final int K_TYPE=146;
	public static final int K_UNLOGGED=147;
	public static final int K_UNSET=148;
	public static final int K_UPDATE=149;
	public static final int K_USE=150;
	public static final int K_USER=151;
	public static final int K_USERS=152;
	public static final int K_USING=153;
	public static final int K_UUID=154;
	public static final int K_VALUES=155;
	public static final int K_VARCHAR=156;
	public static final int K_VARINT=157;
	public static final int K_VIEW=158;
	public static final int K_WHERE=159;
	public static final int K_WITH=160;
	public static final int K_WRITETIME=161;
	public static final int L=162;
	public static final int LETTER=163;
	public static final int M=164;
	public static final int MULTILINE_COMMENT=165;
	public static final int N=166;
	public static final int O=167;
	public static final int P=168;
	public static final int Q=169;
	public static final int QMARK=170;
	public static final int QUOTED_NAME=171;
	public static final int R=172;
	public static final int RANGE=173;
	public static final int S=174;
	public static final int STRING_LITERAL=175;
	public static final int T=176;
	public static final int U=177;
	public static final int UUID=178;
	public static final int V=179;
	public static final int W=180;
	public static final int WS=181;
	public static final int X=182;
	public static final int Y=183;
	public static final int Z=184;
	public static final int Tokens=209;

	    List<Token> tokens = new ArrayList<Token>();

	    public void emit(Token token)
	    {
	        state.token = token;
	        tokens.add(token);
	    }

	    public Token nextToken()
	    {
	        super.nextToken();
	        if (tokens.size() == 0)
	            return new CommonToken(Token.EOF);
	        return tokens.remove(0);
	    }

	    private final List<ErrorListener> listeners = new ArrayList<ErrorListener>();

	    public void addErrorListener(ErrorListener listener)
	    {
	        this.listeners.add(listener);
	    }

	    public void removeErrorListener(ErrorListener listener)
	    {
	        this.listeners.remove(listener);
	    }

	    public void displayRecognitionError(String[] tokenNames, RecognitionException e)
	    {
	        for (int i = 0, m = listeners.size(); i < m; i++)
	            listeners.get(i).syntaxError(this, tokenNames, e);
	    }


	// delegates
	public Cql_Lexer gLexer;
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {gLexer};
	}

	public CqlLexer() {} 
	public CqlLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public CqlLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
		gLexer = new Cql_Lexer(input, state, this);
	}
	@Override public String getGrammarFileName() { return "Cql__.g"; }

	// $ANTLR start "T__185"
	public final void mT__185() throws RecognitionException {
		try {
			int _type = T__185;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cql__.g:49:8: ( '!=' )
			// Cql__.g:49:10: '!='
			{
			match("!="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__185"

	// $ANTLR start "T__186"
	public final void mT__186() throws RecognitionException {
		try {
			int _type = T__186;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cql__.g:50:8: ( '%' )
			// Cql__.g:50:10: '%'
			{
			match('%'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__186"

	// $ANTLR start "T__187"
	public final void mT__187() throws RecognitionException {
		try {
			int _type = T__187;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cql__.g:51:8: ( '(' )
			// Cql__.g:51:10: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__187"

	// $ANTLR start "T__188"
	public final void mT__188() throws RecognitionException {
		try {
			int _type = T__188;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cql__.g:52:8: ( ')' )
			// Cql__.g:52:10: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__188"

	// $ANTLR start "T__189"
	public final void mT__189() throws RecognitionException {
		try {
			int _type = T__189;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cql__.g:53:8: ( '+' )
			// Cql__.g:53:10: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__189"

	// $ANTLR start "T__190"
	public final void mT__190() throws RecognitionException {
		try {
			int _type = T__190;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cql__.g:54:8: ( '+=' )
			// Cql__.g:54:10: '+='
			{
			match("+="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__190"

	// $ANTLR start "T__191"
	public final void mT__191() throws RecognitionException {
		try {
			int _type = T__191;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cql__.g:55:8: ( ',' )
			// Cql__.g:55:10: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__191"

	// $ANTLR start "T__192"
	public final void mT__192() throws RecognitionException {
		try {
			int _type = T__192;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cql__.g:56:8: ( '-' )
			// Cql__.g:56:10: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__192"

	// $ANTLR start "T__193"
	public final void mT__193() throws RecognitionException {
		try {
			int _type = T__193;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cql__.g:57:8: ( '-=' )
			// Cql__.g:57:10: '-='
			{
			match("-="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__193"

	// $ANTLR start "T__194"
	public final void mT__194() throws RecognitionException {
		try {
			int _type = T__194;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cql__.g:58:8: ( '.' )
			// Cql__.g:58:10: '.'
			{
			match('.'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__194"

	// $ANTLR start "T__195"
	public final void mT__195() throws RecognitionException {
		try {
			int _type = T__195;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cql__.g:59:8: ( '/' )
			// Cql__.g:59:10: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__195"

	// $ANTLR start "T__196"
	public final void mT__196() throws RecognitionException {
		try {
			int _type = T__196;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cql__.g:60:8: ( ':' )
			// Cql__.g:60:10: ':'
			{
			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__196"

	// $ANTLR start "T__197"
	public final void mT__197() throws RecognitionException {
		try {
			int _type = T__197;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cql__.g:61:8: ( ';' )
			// Cql__.g:61:10: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__197"

	// $ANTLR start "T__198"
	public final void mT__198() throws RecognitionException {
		try {
			int _type = T__198;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cql__.g:62:8: ( '<' )
			// Cql__.g:62:10: '<'
			{
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__198"

	// $ANTLR start "T__199"
	public final void mT__199() throws RecognitionException {
		try {
			int _type = T__199;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cql__.g:63:8: ( '<=' )
			// Cql__.g:63:10: '<='
			{
			match("<="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__199"

	// $ANTLR start "T__200"
	public final void mT__200() throws RecognitionException {
		try {
			int _type = T__200;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cql__.g:64:8: ( '=' )
			// Cql__.g:64:10: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__200"

	// $ANTLR start "T__201"
	public final void mT__201() throws RecognitionException {
		try {
			int _type = T__201;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cql__.g:65:8: ( '>' )
			// Cql__.g:65:10: '>'
			{
			match('>'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__201"

	// $ANTLR start "T__202"
	public final void mT__202() throws RecognitionException {
		try {
			int _type = T__202;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cql__.g:66:8: ( '>=' )
			// Cql__.g:66:10: '>='
			{
			match(">="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__202"

	// $ANTLR start "T__203"
	public final void mT__203() throws RecognitionException {
		try {
			int _type = T__203;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cql__.g:67:8: ( '[' )
			// Cql__.g:67:10: '['
			{
			match('['); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__203"

	// $ANTLR start "T__204"
	public final void mT__204() throws RecognitionException {
		try {
			int _type = T__204;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cql__.g:68:8: ( '\\*' )
			// Cql__.g:68:10: '\\*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__204"

	// $ANTLR start "T__205"
	public final void mT__205() throws RecognitionException {
		try {
			int _type = T__205;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cql__.g:69:8: ( ']' )
			// Cql__.g:69:10: ']'
			{
			match(']'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__205"

	// $ANTLR start "T__206"
	public final void mT__206() throws RecognitionException {
		try {
			int _type = T__206;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cql__.g:70:8: ( 'expr(' )
			// Cql__.g:70:10: 'expr('
			{
			match("expr("); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__206"

	// $ANTLR start "T__207"
	public final void mT__207() throws RecognitionException {
		try {
			int _type = T__207;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cql__.g:71:8: ( '{' )
			// Cql__.g:71:10: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__207"

	// $ANTLR start "T__208"
	public final void mT__208() throws RecognitionException {
		try {
			int _type = T__208;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cql__.g:72:8: ( '}' )
			// Cql__.g:72:10: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__208"

	@Override
	public void mTokens() throws RecognitionException {
		// Cql__.g:1:8: ( T__185 | T__186 | T__187 | T__188 | T__189 | T__190 | T__191 | T__192 | T__193 | T__194 | T__195 | T__196 | T__197 | T__198 | T__199 | T__200 | T__201 | T__202 | T__203 | T__204 | T__205 | T__206 | T__207 | T__208 | Lexer. Tokens )
		int alt1=25;
		alt1 = dfa1.predict(input);
		switch (alt1) {
			case 1 :
				// Cql__.g:1:10: T__185
				{
				mT__185(); 

				}
				break;
			case 2 :
				// Cql__.g:1:17: T__186
				{
				mT__186(); 

				}
				break;
			case 3 :
				// Cql__.g:1:24: T__187
				{
				mT__187(); 

				}
				break;
			case 4 :
				// Cql__.g:1:31: T__188
				{
				mT__188(); 

				}
				break;
			case 5 :
				// Cql__.g:1:38: T__189
				{
				mT__189(); 

				}
				break;
			case 6 :
				// Cql__.g:1:45: T__190
				{
				mT__190(); 

				}
				break;
			case 7 :
				// Cql__.g:1:52: T__191
				{
				mT__191(); 

				}
				break;
			case 8 :
				// Cql__.g:1:59: T__192
				{
				mT__192(); 

				}
				break;
			case 9 :
				// Cql__.g:1:66: T__193
				{
				mT__193(); 

				}
				break;
			case 10 :
				// Cql__.g:1:73: T__194
				{
				mT__194(); 

				}
				break;
			case 11 :
				// Cql__.g:1:80: T__195
				{
				mT__195(); 

				}
				break;
			case 12 :
				// Cql__.g:1:87: T__196
				{
				mT__196(); 

				}
				break;
			case 13 :
				// Cql__.g:1:94: T__197
				{
				mT__197(); 

				}
				break;
			case 14 :
				// Cql__.g:1:101: T__198
				{
				mT__198(); 

				}
				break;
			case 15 :
				// Cql__.g:1:108: T__199
				{
				mT__199(); 

				}
				break;
			case 16 :
				// Cql__.g:1:115: T__200
				{
				mT__200(); 

				}
				break;
			case 17 :
				// Cql__.g:1:122: T__201
				{
				mT__201(); 

				}
				break;
			case 18 :
				// Cql__.g:1:129: T__202
				{
				mT__202(); 

				}
				break;
			case 19 :
				// Cql__.g:1:136: T__203
				{
				mT__203(); 

				}
				break;
			case 20 :
				// Cql__.g:1:143: T__204
				{
				mT__204(); 

				}
				break;
			case 21 :
				// Cql__.g:1:150: T__205
				{
				mT__205(); 

				}
				break;
			case 22 :
				// Cql__.g:1:157: T__206
				{
				mT__206(); 

				}
				break;
			case 23 :
				// Cql__.g:1:164: T__207
				{
				mT__207(); 

				}
				break;
			case 24 :
				// Cql__.g:1:171: T__208
				{
				mT__208(); 

				}
				break;
			case 25 :
				// Cql__.g:1:178: Lexer. Tokens
				{
				gLexer.mTokens(); 

				}
				break;

		}
	}


	protected DFA1 dfa1 = new DFA1(this);
	static final String DFA1_eotS =
		"\5\uffff\1\27\1\uffff\1\31\1\32\1\33\2\uffff\1\35\1\uffff\1\37\3\uffff"+
		"\1\25\15\uffff\3\25\1\uffff";
	static final String DFA1_eofS =
		"\44\uffff";
	static final String DFA1_minS =
		"\1\11\4\uffff\1\75\1\uffff\1\55\1\56\1\52\2\uffff\1\75\1\uffff\1\75\3"+
		"\uffff\1\170\15\uffff\1\160\1\162\1\50\1\uffff";
	static final String DFA1_maxS =
		"\1\175\4\uffff\1\75\1\uffff\1\156\1\56\1\57\2\uffff\1\75\1\uffff\1\75"+
		"\3\uffff\1\170\15\uffff\1\160\1\162\1\50\1\uffff";
	static final String DFA1_acceptS =
		"\1\uffff\1\1\1\2\1\3\1\4\1\uffff\1\7\3\uffff\1\14\1\15\1\uffff\1\20\1"+
		"\uffff\1\23\1\24\1\25\1\uffff\1\27\1\30\1\31\1\6\1\5\1\11\1\10\1\12\1"+
		"\13\1\17\1\16\1\22\1\21\3\uffff\1\26";
	static final String DFA1_specialS =
		"\44\uffff}>";
	static final String[] DFA1_transitionS = {
			"\2\25\2\uffff\1\25\22\uffff\1\25\1\1\1\25\1\uffff\1\25\1\2\1\uffff\1"+
			"\25\1\3\1\4\1\20\1\5\1\6\1\7\1\10\1\11\12\25\1\12\1\13\1\14\1\15\1\16"+
			"\1\25\1\uffff\32\25\1\17\1\uffff\1\21\3\uffff\4\25\1\22\25\25\1\23\1"+
			"\uffff\1\24",
			"",
			"",
			"",
			"",
			"\1\26",
			"",
			"\1\25\2\uffff\12\25\3\uffff\1\30\13\uffff\1\25\4\uffff\1\25\1\uffff"+
			"\1\25\30\uffff\1\25\4\uffff\1\25",
			"\1\25",
			"\1\25\4\uffff\1\25",
			"",
			"",
			"\1\34",
			"",
			"\1\36",
			"",
			"",
			"",
			"\1\40",
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
			"",
			"\1\41",
			"\1\42",
			"\1\43",
			""
	};

	static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
	static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
	static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
	static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
	static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
	static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
	static final short[][] DFA1_transition;

	static {
		int numStates = DFA1_transitionS.length;
		DFA1_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
		}
	}

	protected class DFA1 extends DFA {

		public DFA1(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 1;
			this.eot = DFA1_eot;
			this.eof = DFA1_eof;
			this.min = DFA1_min;
			this.max = DFA1_max;
			this.accept = DFA1_accept;
			this.special = DFA1_special;
			this.transition = DFA1_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__185 | T__186 | T__187 | T__188 | T__189 | T__190 | T__191 | T__192 | T__193 | T__194 | T__195 | T__196 | T__197 | T__198 | T__199 | T__200 | T__201 | T__202 | T__203 | T__204 | T__205 | T__206 | T__207 | T__208 | Lexer. Tokens );";
		}
	}

}
