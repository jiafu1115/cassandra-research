// $ANTLR 3.5.2 Parser.g 2017-06-13 08:16:38

    package org.apache.cassandra.cql3;

    import java.util.ArrayList;
    import java.util.Arrays;
    import java.util.Collections;
    import java.util.EnumSet;
    import java.util.HashSet;
    import java.util.HashMap;
    import java.util.LinkedHashMap;
    import java.util.List;
    import java.util.Map;
    import java.util.Set;

    import org.apache.cassandra.auth.*;
    import org.apache.cassandra.cql3.*;
    import org.apache.cassandra.cql3.conditions.*;
    import org.apache.cassandra.cql3.functions.*;
    import org.apache.cassandra.cql3.restrictions.CustomIndexExpression;
    import org.apache.cassandra.cql3.selection.*;
    import org.apache.cassandra.cql3.statements.*;
    import org.apache.cassandra.db.marshal.CollectionType;
    import org.apache.cassandra.exceptions.ConfigurationException;
    import org.apache.cassandra.exceptions.InvalidRequestException;
    import org.apache.cassandra.exceptions.SyntaxException;
    import org.apache.cassandra.schema.ColumnMetadata;
    import org.apache.cassandra.utils.Pair;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings("all")
public class Cql_Parser extends Parser {
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

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators
	public CqlParser gCql;
	public CqlParser gParent;


	public Cql_Parser(TokenStream input, CqlParser gCql) {
		this(input, new RecognizerSharedState(), gCql);
	}
	public Cql_Parser(TokenStream input, RecognizerSharedState state, CqlParser gCql) {
		super(input, state);
		this.gCql = gCql;
		gParent = gCql;
	}

	@Override public String[] getTokenNames() { return CqlParser.tokenNames; }
	@Override public String getGrammarFileName() { return "Parser.g"; }


	    private final List<ErrorListener> listeners = new ArrayList<ErrorListener>();
	    protected final List<ColumnIdentifier> bindVariables = new ArrayList<ColumnIdentifier>();

	    public static final Set<String> reservedTypeNames = new HashSet<String>()
	    {{
	        add("byte");
	        add("complex");
	        add("enum");
	        add("date");
	        add("interval");
	        add("macaddr");
	        add("bitstring");
	    }};

	    public AbstractMarker.Raw newBindVariables(ColumnIdentifier name)
	    {
	        AbstractMarker.Raw marker = new AbstractMarker.Raw(bindVariables.size());
	        bindVariables.add(name);
	        return marker;
	    }

	    public AbstractMarker.INRaw newINBindVariables(ColumnIdentifier name)
	    {
	        AbstractMarker.INRaw marker = new AbstractMarker.INRaw(bindVariables.size());
	        bindVariables.add(name);
	        return marker;
	    }

	    public Tuples.Raw newTupleBindVariables(ColumnIdentifier name)
	    {
	        Tuples.Raw marker = new Tuples.Raw(bindVariables.size());
	        bindVariables.add(name);
	        return marker;
	    }

	    public Tuples.INRaw newTupleINBindVariables(ColumnIdentifier name)
	    {
	        Tuples.INRaw marker = new Tuples.INRaw(bindVariables.size());
	        bindVariables.add(name);
	        return marker;
	    }

	    public Json.Marker newJsonBindVariables(ColumnIdentifier name)
	    {
	        Json.Marker marker = new Json.Marker(bindVariables.size());
	        bindVariables.add(name);
	        return marker;
	    }

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

	    protected void addRecognitionError(String msg)
	    {
	        for (int i = 0, m = listeners.size(); i < m; i++)
	            listeners.get(i).syntaxError(this, msg);
	    }

	    public Map<String, String> convertPropertyMap(Maps.Literal map)
	    {
	        if (map == null || map.entries == null || map.entries.isEmpty())
	            return Collections.<String, String>emptyMap();

	        Map<String, String> res = new HashMap<>(map.entries.size());

	        for (Pair<Term.Raw, Term.Raw> entry : map.entries)
	        {
	            // Because the parser tries to be smart and recover on error (to
	            // allow displaying more than one error I suppose), we have null
	            // entries in there. Just skip those, a proper error will be thrown in the end.
	            if (entry.left == null || entry.right == null)
	                break;

	            if (!(entry.left instanceof Constants.Literal))
	            {
	                String msg = "Invalid property name: " + entry.left;
	                if (entry.left instanceof AbstractMarker.Raw)
	                    msg += " (bind variables are not supported in DDL queries)";
	                addRecognitionError(msg);
	                break;
	            }
	            if (!(entry.right instanceof Constants.Literal))
	            {
	                String msg = "Invalid property value: " + entry.right + " for property: " + entry.left;
	                if (entry.right instanceof AbstractMarker.Raw)
	                    msg += " (bind variables are not supported in DDL queries)";
	                addRecognitionError(msg);
	                break;
	            }

	            if (res.put(((Constants.Literal)entry.left).getRawText(), ((Constants.Literal)entry.right).getRawText()) != null)
	            {
	                addRecognitionError(String.format("Multiple definition for property " + ((Constants.Literal)entry.left).getRawText()));
	            }
	        }

	        return res;
	    }

	    public void addRawUpdate(List<Pair<ColumnMetadata.Raw, Operation.RawUpdate>> operations, ColumnMetadata.Raw key, Operation.RawUpdate update)
	    {
	        for (Pair<ColumnMetadata.Raw, Operation.RawUpdate> p : operations)
	        {
	            if (p.left.equals(key) && !p.right.isCompatibleWith(update))
	                addRecognitionError("Multiple incompatible setting of column " + key);
	        }
	        operations.add(Pair.create(key, update));
	    }

	    public Set<Permission> filterPermissions(Set<Permission> permissions, IResource resource)
	    {
	        if (resource == null)
	            return Collections.emptySet();
	        Set<Permission> filtered = new HashSet<>(permissions);
	        filtered.retainAll(resource.applicablePermissions());
	        if (filtered.isEmpty())
	            addRecognitionError("Resource type " + resource.getClass().getSimpleName() +
	                                    " does not support any of the requested permissions");

	        return filtered;
	    }

	    public String canonicalizeObjectName(String s, boolean enforcePattern)
	    {
	        // these two conditions are here because technically they are valid
	        // ObjectNames, but we want to restrict their use without adding unnecessary
	        // work to JMXResource construction as that also happens on hotter code paths
	        if ("".equals(s))
	            addRecognitionError("Empty JMX object name supplied");

	        if ("*:*".equals(s))
	            addRecognitionError("Please use ALL MBEANS instead of wildcard pattern");

	        try
	        {
	            javax.management.ObjectName objectName = javax.management.ObjectName.getInstance(s);
	            if (enforcePattern && !objectName.isPattern())
	                addRecognitionError("Plural form used, but non-pattern JMX object name specified (" + s + ")");
	            return objectName.getCanonicalName();
	        }
	        catch (javax.management.MalformedObjectNameException e)
	        {
	          addRecognitionError(s + " is not a valid JMX object name");
	          return s;
	        }
	    }

	    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	    // Recovery methods are overridden to avoid wasting work on recovering from errors when the result will be
	    // ignored anyway.
	    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	    @Override
	    protected Object recoverFromMismatchedToken(IntStream input, int ttype, BitSet follow) throws RecognitionException
	    {
	        throw new MismatchedTokenException(ttype, input);
	    }

	    @Override
	    public void recover(IntStream input, RecognitionException re)
	    {
	        // Do nothing.
	    }



	// $ANTLR start "cqlStatement"
	// Parser.g:207:1: cqlStatement returns [ParsedStatement stmt] : (st1= selectStatement |st2= insertStatement |st3= updateStatement |st4= batchStatement |st5= deleteStatement |st6= useStatement |st7= truncateStatement |st8= createKeyspaceStatement |st9= createTableStatement |st10= createIndexStatement |st11= dropKeyspaceStatement |st12= dropTableStatement |st13= dropIndexStatement |st14= alterTableStatement |st15= alterKeyspaceStatement |st16= grantPermissionsStatement |st17= revokePermissionsStatement |st18= listPermissionsStatement |st19= createUserStatement |st20= alterUserStatement |st21= dropUserStatement |st22= listUsersStatement |st23= createTriggerStatement |st24= dropTriggerStatement |st25= createTypeStatement |st26= alterTypeStatement |st27= dropTypeStatement |st28= createFunctionStatement |st29= dropFunctionStatement |st30= createAggregateStatement |st31= dropAggregateStatement |st32= createRoleStatement |st33= alterRoleStatement |st34= dropRoleStatement |st35= listRolesStatement |st36= grantRoleStatement |st37= revokeRoleStatement |st38= createMaterializedViewStatement |st39= dropMaterializedViewStatement |st40= alterMaterializedViewStatement );
	public final ParsedStatement cqlStatement() throws RecognitionException {
		ParsedStatement stmt = null;


		SelectStatement.RawStatement st1 =null;
		ModificationStatement.Parsed st2 =null;
		UpdateStatement.ParsedUpdate st3 =null;
		BatchStatement.Parsed st4 =null;
		DeleteStatement.Parsed st5 =null;
		UseStatement st6 =null;
		TruncateStatement st7 =null;
		CreateKeyspaceStatement st8 =null;
		CreateTableStatement.RawStatement st9 =null;
		CreateIndexStatement st10 =null;
		DropKeyspaceStatement st11 =null;
		DropTableStatement st12 =null;
		DropIndexStatement st13 =null;
		AlterTableStatement st14 =null;
		AlterKeyspaceStatement st15 =null;
		GrantPermissionsStatement st16 =null;
		RevokePermissionsStatement st17 =null;
		ListPermissionsStatement st18 =null;
		CreateRoleStatement st19 =null;
		AlterRoleStatement st20 =null;
		DropRoleStatement st21 =null;
		ListRolesStatement st22 =null;
		CreateTriggerStatement st23 =null;
		DropTriggerStatement st24 =null;
		CreateTypeStatement st25 =null;
		AlterTypeStatement st26 =null;
		DropTypeStatement st27 =null;
		CreateFunctionStatement st28 =null;
		DropFunctionStatement st29 =null;
		CreateAggregateStatement st30 =null;
		DropAggregateStatement st31 =null;
		CreateRoleStatement st32 =null;
		AlterRoleStatement st33 =null;
		DropRoleStatement st34 =null;
		ListRolesStatement st35 =null;
		GrantRoleStatement st36 =null;
		RevokeRoleStatement st37 =null;
		CreateViewStatement st38 =null;
		DropViewStatement st39 =null;
		AlterViewStatement st40 =null;

		try {
			// Parser.g:209:5: (st1= selectStatement |st2= insertStatement |st3= updateStatement |st4= batchStatement |st5= deleteStatement |st6= useStatement |st7= truncateStatement |st8= createKeyspaceStatement |st9= createTableStatement |st10= createIndexStatement |st11= dropKeyspaceStatement |st12= dropTableStatement |st13= dropIndexStatement |st14= alterTableStatement |st15= alterKeyspaceStatement |st16= grantPermissionsStatement |st17= revokePermissionsStatement |st18= listPermissionsStatement |st19= createUserStatement |st20= alterUserStatement |st21= dropUserStatement |st22= listUsersStatement |st23= createTriggerStatement |st24= dropTriggerStatement |st25= createTypeStatement |st26= alterTypeStatement |st27= dropTypeStatement |st28= createFunctionStatement |st29= dropFunctionStatement |st30= createAggregateStatement |st31= dropAggregateStatement |st32= createRoleStatement |st33= alterRoleStatement |st34= dropRoleStatement |st35= listRolesStatement |st36= grantRoleStatement |st37= revokeRoleStatement |st38= createMaterializedViewStatement |st39= dropMaterializedViewStatement |st40= alterMaterializedViewStatement )
			int alt1=40;
			alt1 = dfa1.predict(input);
			switch (alt1) {
				case 1 :
					// Parser.g:209:7: st1= selectStatement
					{
					pushFollow(FOLLOW_selectStatement_in_cqlStatement59);
					st1=selectStatement();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = st1; }
					}
					break;
				case 2 :
					// Parser.g:210:7: st2= insertStatement
					{
					pushFollow(FOLLOW_insertStatement_in_cqlStatement88);
					st2=insertStatement();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = st2; }
					}
					break;
				case 3 :
					// Parser.g:211:7: st3= updateStatement
					{
					pushFollow(FOLLOW_updateStatement_in_cqlStatement117);
					st3=updateStatement();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = st3; }
					}
					break;
				case 4 :
					// Parser.g:212:7: st4= batchStatement
					{
					pushFollow(FOLLOW_batchStatement_in_cqlStatement146);
					st4=batchStatement();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = st4; }
					}
					break;
				case 5 :
					// Parser.g:213:7: st5= deleteStatement
					{
					pushFollow(FOLLOW_deleteStatement_in_cqlStatement176);
					st5=deleteStatement();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = st5; }
					}
					break;
				case 6 :
					// Parser.g:214:7: st6= useStatement
					{
					pushFollow(FOLLOW_useStatement_in_cqlStatement205);
					st6=useStatement();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = st6; }
					}
					break;
				case 7 :
					// Parser.g:215:7: st7= truncateStatement
					{
					pushFollow(FOLLOW_truncateStatement_in_cqlStatement237);
					st7=truncateStatement();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = st7; }
					}
					break;
				case 8 :
					// Parser.g:216:7: st8= createKeyspaceStatement
					{
					pushFollow(FOLLOW_createKeyspaceStatement_in_cqlStatement264);
					st8=createKeyspaceStatement();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = st8; }
					}
					break;
				case 9 :
					// Parser.g:217:7: st9= createTableStatement
					{
					pushFollow(FOLLOW_createTableStatement_in_cqlStatement285);
					st9=createTableStatement();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = st9; }
					}
					break;
				case 10 :
					// Parser.g:218:7: st10= createIndexStatement
					{
					pushFollow(FOLLOW_createIndexStatement_in_cqlStatement308);
					st10=createIndexStatement();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = st10; }
					}
					break;
				case 11 :
					// Parser.g:219:7: st11= dropKeyspaceStatement
					{
					pushFollow(FOLLOW_dropKeyspaceStatement_in_cqlStatement331);
					st11=dropKeyspaceStatement();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = st11; }
					}
					break;
				case 12 :
					// Parser.g:220:7: st12= dropTableStatement
					{
					pushFollow(FOLLOW_dropTableStatement_in_cqlStatement353);
					st12=dropTableStatement();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = st12; }
					}
					break;
				case 13 :
					// Parser.g:221:7: st13= dropIndexStatement
					{
					pushFollow(FOLLOW_dropIndexStatement_in_cqlStatement378);
					st13=dropIndexStatement();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = st13; }
					}
					break;
				case 14 :
					// Parser.g:222:7: st14= alterTableStatement
					{
					pushFollow(FOLLOW_alterTableStatement_in_cqlStatement403);
					st14=alterTableStatement();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = st14; }
					}
					break;
				case 15 :
					// Parser.g:223:7: st15= alterKeyspaceStatement
					{
					pushFollow(FOLLOW_alterKeyspaceStatement_in_cqlStatement427);
					st15=alterKeyspaceStatement();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = st15; }
					}
					break;
				case 16 :
					// Parser.g:224:7: st16= grantPermissionsStatement
					{
					pushFollow(FOLLOW_grantPermissionsStatement_in_cqlStatement448);
					st16=grantPermissionsStatement();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = st16; }
					}
					break;
				case 17 :
					// Parser.g:225:7: st17= revokePermissionsStatement
					{
					pushFollow(FOLLOW_revokePermissionsStatement_in_cqlStatement466);
					st17=revokePermissionsStatement();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = st17; }
					}
					break;
				case 18 :
					// Parser.g:226:7: st18= listPermissionsStatement
					{
					pushFollow(FOLLOW_listPermissionsStatement_in_cqlStatement483);
					st18=listPermissionsStatement();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = st18; }
					}
					break;
				case 19 :
					// Parser.g:227:7: st19= createUserStatement
					{
					pushFollow(FOLLOW_createUserStatement_in_cqlStatement502);
					st19=createUserStatement();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = st19; }
					}
					break;
				case 20 :
					// Parser.g:228:7: st20= alterUserStatement
					{
					pushFollow(FOLLOW_alterUserStatement_in_cqlStatement526);
					st20=alterUserStatement();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = st20; }
					}
					break;
				case 21 :
					// Parser.g:229:7: st21= dropUserStatement
					{
					pushFollow(FOLLOW_dropUserStatement_in_cqlStatement551);
					st21=dropUserStatement();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = st21; }
					}
					break;
				case 22 :
					// Parser.g:230:7: st22= listUsersStatement
					{
					pushFollow(FOLLOW_listUsersStatement_in_cqlStatement577);
					st22=listUsersStatement();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = st22; }
					}
					break;
				case 23 :
					// Parser.g:231:7: st23= createTriggerStatement
					{
					pushFollow(FOLLOW_createTriggerStatement_in_cqlStatement602);
					st23=createTriggerStatement();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = st23; }
					}
					break;
				case 24 :
					// Parser.g:232:7: st24= dropTriggerStatement
					{
					pushFollow(FOLLOW_dropTriggerStatement_in_cqlStatement623);
					st24=dropTriggerStatement();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = st24; }
					}
					break;
				case 25 :
					// Parser.g:233:7: st25= createTypeStatement
					{
					pushFollow(FOLLOW_createTypeStatement_in_cqlStatement646);
					st25=createTypeStatement();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = st25; }
					}
					break;
				case 26 :
					// Parser.g:234:7: st26= alterTypeStatement
					{
					pushFollow(FOLLOW_alterTypeStatement_in_cqlStatement670);
					st26=alterTypeStatement();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = st26; }
					}
					break;
				case 27 :
					// Parser.g:235:7: st27= dropTypeStatement
					{
					pushFollow(FOLLOW_dropTypeStatement_in_cqlStatement695);
					st27=dropTypeStatement();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = st27; }
					}
					break;
				case 28 :
					// Parser.g:236:7: st28= createFunctionStatement
					{
					pushFollow(FOLLOW_createFunctionStatement_in_cqlStatement721);
					st28=createFunctionStatement();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = st28; }
					}
					break;
				case 29 :
					// Parser.g:237:7: st29= dropFunctionStatement
					{
					pushFollow(FOLLOW_dropFunctionStatement_in_cqlStatement741);
					st29=dropFunctionStatement();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = st29; }
					}
					break;
				case 30 :
					// Parser.g:238:7: st30= createAggregateStatement
					{
					pushFollow(FOLLOW_createAggregateStatement_in_cqlStatement763);
					st30=createAggregateStatement();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = st30; }
					}
					break;
				case 31 :
					// Parser.g:239:7: st31= dropAggregateStatement
					{
					pushFollow(FOLLOW_dropAggregateStatement_in_cqlStatement782);
					st31=dropAggregateStatement();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = st31; }
					}
					break;
				case 32 :
					// Parser.g:240:7: st32= createRoleStatement
					{
					pushFollow(FOLLOW_createRoleStatement_in_cqlStatement803);
					st32=createRoleStatement();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = st32; }
					}
					break;
				case 33 :
					// Parser.g:241:7: st33= alterRoleStatement
					{
					pushFollow(FOLLOW_alterRoleStatement_in_cqlStatement827);
					st33=alterRoleStatement();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = st33; }
					}
					break;
				case 34 :
					// Parser.g:242:7: st34= dropRoleStatement
					{
					pushFollow(FOLLOW_dropRoleStatement_in_cqlStatement852);
					st34=dropRoleStatement();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = st34; }
					}
					break;
				case 35 :
					// Parser.g:243:7: st35= listRolesStatement
					{
					pushFollow(FOLLOW_listRolesStatement_in_cqlStatement878);
					st35=listRolesStatement();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = st35; }
					}
					break;
				case 36 :
					// Parser.g:244:7: st36= grantRoleStatement
					{
					pushFollow(FOLLOW_grantRoleStatement_in_cqlStatement903);
					st36=grantRoleStatement();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = st36; }
					}
					break;
				case 37 :
					// Parser.g:245:7: st37= revokeRoleStatement
					{
					pushFollow(FOLLOW_revokeRoleStatement_in_cqlStatement928);
					st37=revokeRoleStatement();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = st37; }
					}
					break;
				case 38 :
					// Parser.g:246:7: st38= createMaterializedViewStatement
					{
					pushFollow(FOLLOW_createMaterializedViewStatement_in_cqlStatement952);
					st38=createMaterializedViewStatement();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = st38; }
					}
					break;
				case 39 :
					// Parser.g:247:7: st39= dropMaterializedViewStatement
					{
					pushFollow(FOLLOW_dropMaterializedViewStatement_in_cqlStatement964);
					st39=dropMaterializedViewStatement();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = st39; }
					}
					break;
				case 40 :
					// Parser.g:248:7: st40= alterMaterializedViewStatement
					{
					pushFollow(FOLLOW_alterMaterializedViewStatement_in_cqlStatement978);
					st40=alterMaterializedViewStatement();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = st40; }
					}
					break;

			}
			if ( state.backtracking==0 ) { if (stmt != null) stmt.setBoundVariables(bindVariables); }
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "cqlStatement"



	// $ANTLR start "useStatement"
	// Parser.g:254:1: useStatement returns [UseStatement stmt] : K_USE ks= keyspaceName ;
	public final UseStatement useStatement() throws RecognitionException {
		UseStatement stmt = null;


		String ks =null;

		try {
			// Parser.g:255:5: ( K_USE ks= keyspaceName )
			// Parser.g:255:7: K_USE ks= keyspaceName
			{
			match(input,K_USE,FOLLOW_K_USE_in_useStatement1004); if (state.failed) return stmt;
			pushFollow(FOLLOW_keyspaceName_in_useStatement1008);
			ks=keyspaceName();
			state._fsp--;
			if (state.failed) return stmt;
			if ( state.backtracking==0 ) { stmt = new UseStatement(ks); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "useStatement"



	// $ANTLR start "selectStatement"
	// Parser.g:264:1: selectStatement returns [SelectStatement.RawStatement expr] : K_SELECT ( ( K_JSON selectClause )=> K_JSON )? sclause= selectClause K_FROM cf= columnFamilyName ( K_WHERE wclause= whereClause )? ( K_GROUP K_BY groupByClause[groups] ( ',' groupByClause[groups] )* )? ( K_ORDER K_BY orderByClause[orderings] ( ',' orderByClause[orderings] )* )? ( K_PER K_PARTITION K_LIMIT rows= intValue )? ( K_LIMIT rows= intValue )? ( K_ALLOW K_FILTERING )? ;
	public final SelectStatement.RawStatement selectStatement() throws RecognitionException {
		SelectStatement.RawStatement expr = null;


		ParserRuleReturnScope sclause =null;
		CFName cf =null;
		WhereClause.Builder wclause =null;
		Term.Raw rows =null;


		        Term.Raw limit = null;
		        Term.Raw perPartitionLimit = null;
		        Map<ColumnMetadata.Raw, Boolean> orderings = new LinkedHashMap<>();
		        List<ColumnMetadata.Raw> groups = new ArrayList<>();
		        boolean allowFiltering = false;
		        boolean isJson = false;
		    
		try {
			// Parser.g:273:5: ( K_SELECT ( ( K_JSON selectClause )=> K_JSON )? sclause= selectClause K_FROM cf= columnFamilyName ( K_WHERE wclause= whereClause )? ( K_GROUP K_BY groupByClause[groups] ( ',' groupByClause[groups] )* )? ( K_ORDER K_BY orderByClause[orderings] ( ',' orderByClause[orderings] )* )? ( K_PER K_PARTITION K_LIMIT rows= intValue )? ( K_LIMIT rows= intValue )? ( K_ALLOW K_FILTERING )? )
			// Parser.g:273:7: K_SELECT ( ( K_JSON selectClause )=> K_JSON )? sclause= selectClause K_FROM cf= columnFamilyName ( K_WHERE wclause= whereClause )? ( K_GROUP K_BY groupByClause[groups] ( ',' groupByClause[groups] )* )? ( K_ORDER K_BY orderByClause[orderings] ( ',' orderByClause[orderings] )* )? ( K_PER K_PARTITION K_LIMIT rows= intValue )? ( K_LIMIT rows= intValue )? ( K_ALLOW K_FILTERING )?
			{
			match(input,K_SELECT,FOLLOW_K_SELECT_in_selectStatement1042); if (state.failed) return expr;
			// Parser.g:275:7: ( ( K_JSON selectClause )=> K_JSON )?
			int alt2=2;
			alt2 = dfa2.predict(input);
			switch (alt2) {
				case 1 :
					// Parser.g:275:9: ( K_JSON selectClause )=> K_JSON
					{
					match(input,K_JSON,FOLLOW_K_JSON_in_selectStatement1068); if (state.failed) return expr;
					if ( state.backtracking==0 ) { isJson = true; }
					}
					break;

			}

			pushFollow(FOLLOW_selectClause_in_selectStatement1077);
			sclause=selectClause();
			state._fsp--;
			if (state.failed) return expr;
			match(input,K_FROM,FOLLOW_K_FROM_in_selectStatement1085); if (state.failed) return expr;
			pushFollow(FOLLOW_columnFamilyName_in_selectStatement1089);
			cf=columnFamilyName();
			state._fsp--;
			if (state.failed) return expr;
			// Parser.g:277:7: ( K_WHERE wclause= whereClause )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==K_WHERE) ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// Parser.g:277:9: K_WHERE wclause= whereClause
					{
					match(input,K_WHERE,FOLLOW_K_WHERE_in_selectStatement1099); if (state.failed) return expr;
					pushFollow(FOLLOW_whereClause_in_selectStatement1103);
					wclause=whereClause();
					state._fsp--;
					if (state.failed) return expr;
					}
					break;

			}

			// Parser.g:278:7: ( K_GROUP K_BY groupByClause[groups] ( ',' groupByClause[groups] )* )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==K_GROUP) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// Parser.g:278:9: K_GROUP K_BY groupByClause[groups] ( ',' groupByClause[groups] )*
					{
					match(input,K_GROUP,FOLLOW_K_GROUP_in_selectStatement1116); if (state.failed) return expr;
					match(input,K_BY,FOLLOW_K_BY_in_selectStatement1118); if (state.failed) return expr;
					pushFollow(FOLLOW_groupByClause_in_selectStatement1120);
					groupByClause(groups);
					state._fsp--;
					if (state.failed) return expr;
					// Parser.g:278:44: ( ',' groupByClause[groups] )*
					loop4:
					while (true) {
						int alt4=2;
						int LA4_0 = input.LA(1);
						if ( (LA4_0==191) ) {
							alt4=1;
						}

						switch (alt4) {
						case 1 :
							// Parser.g:278:46: ',' groupByClause[groups]
							{
							match(input,191,FOLLOW_191_in_selectStatement1125); if (state.failed) return expr;
							pushFollow(FOLLOW_groupByClause_in_selectStatement1127);
							groupByClause(groups);
							state._fsp--;
							if (state.failed) return expr;
							}
							break;

						default :
							break loop4;
						}
					}

					}
					break;

			}

			// Parser.g:279:7: ( K_ORDER K_BY orderByClause[orderings] ( ',' orderByClause[orderings] )* )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==K_ORDER) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// Parser.g:279:9: K_ORDER K_BY orderByClause[orderings] ( ',' orderByClause[orderings] )*
					{
					match(input,K_ORDER,FOLLOW_K_ORDER_in_selectStatement1144); if (state.failed) return expr;
					match(input,K_BY,FOLLOW_K_BY_in_selectStatement1146); if (state.failed) return expr;
					pushFollow(FOLLOW_orderByClause_in_selectStatement1148);
					orderByClause(orderings);
					state._fsp--;
					if (state.failed) return expr;
					// Parser.g:279:47: ( ',' orderByClause[orderings] )*
					loop6:
					while (true) {
						int alt6=2;
						int LA6_0 = input.LA(1);
						if ( (LA6_0==191) ) {
							alt6=1;
						}

						switch (alt6) {
						case 1 :
							// Parser.g:279:49: ',' orderByClause[orderings]
							{
							match(input,191,FOLLOW_191_in_selectStatement1153); if (state.failed) return expr;
							pushFollow(FOLLOW_orderByClause_in_selectStatement1155);
							orderByClause(orderings);
							state._fsp--;
							if (state.failed) return expr;
							}
							break;

						default :
							break loop6;
						}
					}

					}
					break;

			}

			// Parser.g:280:7: ( K_PER K_PARTITION K_LIMIT rows= intValue )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==K_PER) ) {
				alt8=1;
			}
			switch (alt8) {
				case 1 :
					// Parser.g:280:9: K_PER K_PARTITION K_LIMIT rows= intValue
					{
					match(input,K_PER,FOLLOW_K_PER_in_selectStatement1172); if (state.failed) return expr;
					match(input,K_PARTITION,FOLLOW_K_PARTITION_in_selectStatement1174); if (state.failed) return expr;
					match(input,K_LIMIT,FOLLOW_K_LIMIT_in_selectStatement1176); if (state.failed) return expr;
					pushFollow(FOLLOW_intValue_in_selectStatement1180);
					rows=intValue();
					state._fsp--;
					if (state.failed) return expr;
					if ( state.backtracking==0 ) { perPartitionLimit = rows; }
					}
					break;

			}

			// Parser.g:281:7: ( K_LIMIT rows= intValue )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==K_LIMIT) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// Parser.g:281:9: K_LIMIT rows= intValue
					{
					match(input,K_LIMIT,FOLLOW_K_LIMIT_in_selectStatement1195); if (state.failed) return expr;
					pushFollow(FOLLOW_intValue_in_selectStatement1199);
					rows=intValue();
					state._fsp--;
					if (state.failed) return expr;
					if ( state.backtracking==0 ) { limit = rows; }
					}
					break;

			}

			// Parser.g:282:7: ( K_ALLOW K_FILTERING )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==K_ALLOW) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// Parser.g:282:9: K_ALLOW K_FILTERING
					{
					match(input,K_ALLOW,FOLLOW_K_ALLOW_in_selectStatement1214); if (state.failed) return expr;
					match(input,K_FILTERING,FOLLOW_K_FILTERING_in_selectStatement1216); if (state.failed) return expr;
					if ( state.backtracking==0 ) { allowFiltering = true; }
					}
					break;

			}

			if ( state.backtracking==0 ) {
			          SelectStatement.Parameters params = new SelectStatement.Parameters(orderings,
			                                                                             groups,
			                                                                             (sclause!=null?((Cql_Parser.selectClause_return)sclause).isDistinct:false),
			                                                                             allowFiltering,
			                                                                             isJson);
			          WhereClause where = wclause == null ? WhereClause.empty() : wclause.build();
			          expr = new SelectStatement.RawStatement(cf, params, (sclause!=null?((Cql_Parser.selectClause_return)sclause).selectors:null), where, limit, perPartitionLimit);
			      }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "selectStatement"


	public static class selectClause_return extends ParserRuleReturnScope {
		public boolean isDistinct;
		public List<RawSelector> selectors;
	};


	// $ANTLR start "selectClause"
	// Parser.g:294:1: selectClause returns [boolean isDistinct, List<RawSelector> selectors] : ( ( K_DISTINCT selectors )=> K_DISTINCT s= selectors |s= selectors );
	public final Cql_Parser.selectClause_return selectClause() throws RecognitionException {
		Cql_Parser.selectClause_return retval = new Cql_Parser.selectClause_return();
		retval.start = input.LT(1);

		List<RawSelector> s =null;

		 retval.isDistinct = false; 
		try {
			// Parser.g:297:5: ( ( K_DISTINCT selectors )=> K_DISTINCT s= selectors |s= selectors )
			int alt11=2;
			alt11 = dfa11.predict(input);
			switch (alt11) {
				case 1 :
					// Parser.g:297:7: ( K_DISTINCT selectors )=> K_DISTINCT s= selectors
					{
					match(input,K_DISTINCT,FOLLOW_K_DISTINCT_in_selectClause1271); if (state.failed) return retval;
					pushFollow(FOLLOW_selectors_in_selectClause1275);
					s=selectors();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) { retval.isDistinct = true; retval.selectors = s; }
					}
					break;
				case 2 :
					// Parser.g:298:7: s= selectors
					{
					pushFollow(FOLLOW_selectors_in_selectClause1287);
					s=selectors();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) { retval.selectors = s; }
					}
					break;

			}
			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "selectClause"



	// $ANTLR start "selectors"
	// Parser.g:301:1: selectors returns [List<RawSelector> expr] : (t1= selector ( ',' tN= selector )* | '\\*' );
	public final List<RawSelector> selectors() throws RecognitionException {
		List<RawSelector> expr = null;


		RawSelector t1 =null;
		RawSelector tN =null;

		try {
			// Parser.g:302:5: (t1= selector ( ',' tN= selector )* | '\\*' )
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==BOOLEAN||LA13_0==DURATION||LA13_0==FLOAT||LA13_0==HEXNUMBER||(LA13_0 >= IDENT && LA13_0 <= INTEGER)||(LA13_0 >= K_AGGREGATE && LA13_0 <= K_ALL)||LA13_0==K_AS||LA13_0==K_ASCII||(LA13_0 >= K_BIGINT && LA13_0 <= K_BOOLEAN)||(LA13_0 >= K_CALLED && LA13_0 <= K_CLUSTERING)||(LA13_0 >= K_COMPACT && LA13_0 <= K_COUNTER)||(LA13_0 >= K_CUSTOM && LA13_0 <= K_DECIMAL)||(LA13_0 >= K_DISTINCT && LA13_0 <= K_DOUBLE)||LA13_0==K_DURATION||(LA13_0 >= K_EXISTS && LA13_0 <= K_FLOAT)||LA13_0==K_FROZEN||(LA13_0 >= K_FUNCTION && LA13_0 <= K_FUNCTIONS)||LA13_0==K_GROUP||(LA13_0 >= K_INET && LA13_0 <= K_INPUT)||LA13_0==K_INT||(LA13_0 >= K_JSON && LA13_0 <= K_KEYS)||(LA13_0 >= K_KEYSPACES && LA13_0 <= K_LIKE)||(LA13_0 >= K_LIST && LA13_0 <= K_MAP)||(LA13_0 >= K_NEGATIVE_INFINITY && LA13_0 <= K_NOLOGIN)||LA13_0==K_NOSUPERUSER||LA13_0==K_NULL||LA13_0==K_OPTIONS||(LA13_0 >= K_PARTITION && LA13_0 <= K_POSITIVE_NAN)||LA13_0==K_RETURNS||(LA13_0 >= K_ROLE && LA13_0 <= K_ROLES)||(LA13_0 >= K_SFUNC && LA13_0 <= K_TINYINT)||(LA13_0 >= K_TOKEN && LA13_0 <= K_TRIGGER)||(LA13_0 >= K_TTL && LA13_0 <= K_TYPE)||(LA13_0 >= K_USER && LA13_0 <= K_USERS)||(LA13_0 >= K_UUID && LA13_0 <= K_VARINT)||LA13_0==K_WRITETIME||(LA13_0 >= QMARK && LA13_0 <= QUOTED_NAME)||LA13_0==STRING_LITERAL||LA13_0==UUID||LA13_0==187||LA13_0==192||LA13_0==196||LA13_0==203||LA13_0==207) ) {
				alt13=1;
			}
			else if ( (LA13_0==204) ) {
				alt13=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return expr;}
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}

			switch (alt13) {
				case 1 :
					// Parser.g:302:7: t1= selector ( ',' tN= selector )*
					{
					pushFollow(FOLLOW_selector_in_selectors1312);
					t1=selector();
					state._fsp--;
					if (state.failed) return expr;
					if ( state.backtracking==0 ) { expr = new ArrayList<RawSelector>(); expr.add(t1); }
					// Parser.g:302:76: ( ',' tN= selector )*
					loop12:
					while (true) {
						int alt12=2;
						int LA12_0 = input.LA(1);
						if ( (LA12_0==191) ) {
							alt12=1;
						}

						switch (alt12) {
						case 1 :
							// Parser.g:302:77: ',' tN= selector
							{
							match(input,191,FOLLOW_191_in_selectors1317); if (state.failed) return expr;
							pushFollow(FOLLOW_selector_in_selectors1321);
							tN=selector();
							state._fsp--;
							if (state.failed) return expr;
							if ( state.backtracking==0 ) { expr.add(tN); }
							}
							break;

						default :
							break loop12;
						}
					}

					}
					break;
				case 2 :
					// Parser.g:303:7: '\\*'
					{
					match(input,204,FOLLOW_204_in_selectors1333); if (state.failed) return expr;
					if ( state.backtracking==0 ) { expr = Collections.<RawSelector>emptyList();}
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "selectors"



	// $ANTLR start "selector"
	// Parser.g:306:1: selector returns [RawSelector s] : us= unaliasedSelector ( K_AS c= noncol_ident )? ;
	public final RawSelector selector() throws RecognitionException {
		RawSelector s = null;


		Selectable.Raw us =null;
		ColumnIdentifier c =null;

		 ColumnIdentifier alias = null; 
		try {
			// Parser.g:308:5: (us= unaliasedSelector ( K_AS c= noncol_ident )? )
			// Parser.g:308:7: us= unaliasedSelector ( K_AS c= noncol_ident )?
			{
			pushFollow(FOLLOW_unaliasedSelector_in_selector1366);
			us=unaliasedSelector();
			state._fsp--;
			if (state.failed) return s;
			// Parser.g:308:28: ( K_AS c= noncol_ident )?
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==K_AS) ) {
				alt14=1;
			}
			switch (alt14) {
				case 1 :
					// Parser.g:308:29: K_AS c= noncol_ident
					{
					match(input,K_AS,FOLLOW_K_AS_in_selector1369); if (state.failed) return s;
					pushFollow(FOLLOW_noncol_ident_in_selector1373);
					c=noncol_ident();
					state._fsp--;
					if (state.failed) return s;
					if ( state.backtracking==0 ) { alias = c; }
					}
					break;

			}

			if ( state.backtracking==0 ) { s = new RawSelector(us, alias); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return s;
	}
	// $ANTLR end "selector"



	// $ANTLR start "unaliasedSelector"
	// Parser.g:311:1: unaliasedSelector returns [Selectable.Raw s] : a= selectionAddition ;
	public final Selectable.Raw unaliasedSelector() throws RecognitionException {
		Selectable.Raw s = null;


		Selectable.Raw a =null;

		try {
			// Parser.g:312:5: (a= selectionAddition )
			// Parser.g:312:7: a= selectionAddition
			{
			pushFollow(FOLLOW_selectionAddition_in_unaliasedSelector1402);
			a=selectionAddition();
			state._fsp--;
			if (state.failed) return s;
			if ( state.backtracking==0 ) {s = a;}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return s;
	}
	// $ANTLR end "unaliasedSelector"



	// $ANTLR start "selectionAddition"
	// Parser.g:315:1: selectionAddition returns [Selectable.Raw s] : l= selectionMultiplication ( '+' r= selectionMultiplication | '-' r= selectionMultiplication )* ;
	public final Selectable.Raw selectionAddition() throws RecognitionException {
		Selectable.Raw s = null;


		Selectable.Raw l =null;
		Selectable.Raw r =null;

		try {
			// Parser.g:316:5: (l= selectionMultiplication ( '+' r= selectionMultiplication | '-' r= selectionMultiplication )* )
			// Parser.g:316:9: l= selectionMultiplication ( '+' r= selectionMultiplication | '-' r= selectionMultiplication )*
			{
			pushFollow(FOLLOW_selectionMultiplication_in_selectionAddition1429);
			l=selectionMultiplication();
			state._fsp--;
			if (state.failed) return s;
			if ( state.backtracking==0 ) {s = l;}
			// Parser.g:317:9: ( '+' r= selectionMultiplication | '-' r= selectionMultiplication )*
			loop15:
			while (true) {
				int alt15=3;
				int LA15_0 = input.LA(1);
				if ( (LA15_0==189) ) {
					alt15=1;
				}
				else if ( (LA15_0==192) ) {
					alt15=2;
				}

				switch (alt15) {
				case 1 :
					// Parser.g:317:11: '+' r= selectionMultiplication
					{
					match(input,189,FOLLOW_189_in_selectionAddition1445); if (state.failed) return s;
					pushFollow(FOLLOW_selectionMultiplication_in_selectionAddition1449);
					r=selectionMultiplication();
					state._fsp--;
					if (state.failed) return s;
					if ( state.backtracking==0 ) {s = Selectable.WithFunction.Raw.newOperation('+', s, r);}
					}
					break;
				case 2 :
					// Parser.g:318:11: '-' r= selectionMultiplication
					{
					match(input,192,FOLLOW_192_in_selectionAddition1463); if (state.failed) return s;
					pushFollow(FOLLOW_selectionMultiplication_in_selectionAddition1467);
					r=selectionMultiplication();
					state._fsp--;
					if (state.failed) return s;
					if ( state.backtracking==0 ) {s = Selectable.WithFunction.Raw.newOperation('-', s, r);}
					}
					break;

				default :
					break loop15;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return s;
	}
	// $ANTLR end "selectionAddition"



	// $ANTLR start "selectionMultiplication"
	// Parser.g:322:1: selectionMultiplication returns [Selectable.Raw s] : l= selectionGroup ( '\\*' r= selectionGroup | '/' r= selectionGroup | '%' r= selectionGroup )* ;
	public final Selectable.Raw selectionMultiplication() throws RecognitionException {
		Selectable.Raw s = null;


		Selectable.Raw l =null;
		Selectable.Raw r =null;

		try {
			// Parser.g:323:5: (l= selectionGroup ( '\\*' r= selectionGroup | '/' r= selectionGroup | '%' r= selectionGroup )* )
			// Parser.g:323:9: l= selectionGroup ( '\\*' r= selectionGroup | '/' r= selectionGroup | '%' r= selectionGroup )*
			{
			pushFollow(FOLLOW_selectionGroup_in_selectionMultiplication1505);
			l=selectionGroup();
			state._fsp--;
			if (state.failed) return s;
			if ( state.backtracking==0 ) {s = l;}
			// Parser.g:324:9: ( '\\*' r= selectionGroup | '/' r= selectionGroup | '%' r= selectionGroup )*
			loop16:
			while (true) {
				int alt16=4;
				switch ( input.LA(1) ) {
				case 204:
					{
					alt16=1;
					}
					break;
				case 195:
					{
					alt16=2;
					}
					break;
				case 186:
					{
					alt16=3;
					}
					break;
				}
				switch (alt16) {
				case 1 :
					// Parser.g:324:11: '\\*' r= selectionGroup
					{
					match(input,204,FOLLOW_204_in_selectionMultiplication1521); if (state.failed) return s;
					pushFollow(FOLLOW_selectionGroup_in_selectionMultiplication1525);
					r=selectionGroup();
					state._fsp--;
					if (state.failed) return s;
					if ( state.backtracking==0 ) {s = Selectable.WithFunction.Raw.newOperation('*', s, r);}
					}
					break;
				case 2 :
					// Parser.g:325:11: '/' r= selectionGroup
					{
					match(input,195,FOLLOW_195_in_selectionMultiplication1539); if (state.failed) return s;
					pushFollow(FOLLOW_selectionGroup_in_selectionMultiplication1543);
					r=selectionGroup();
					state._fsp--;
					if (state.failed) return s;
					if ( state.backtracking==0 ) {s = Selectable.WithFunction.Raw.newOperation('/', s, r);}
					}
					break;
				case 3 :
					// Parser.g:326:11: '%' r= selectionGroup
					{
					match(input,186,FOLLOW_186_in_selectionMultiplication1557); if (state.failed) return s;
					pushFollow(FOLLOW_selectionGroup_in_selectionMultiplication1561);
					r=selectionGroup();
					state._fsp--;
					if (state.failed) return s;
					if ( state.backtracking==0 ) {s = Selectable.WithFunction.Raw.newOperation('%', s, r);}
					}
					break;

				default :
					break loop16;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return s;
	}
	// $ANTLR end "selectionMultiplication"



	// $ANTLR start "selectionGroup"
	// Parser.g:330:1: selectionGroup returns [Selectable.Raw s] : ( ( selectionGroupWithField )=>f= selectionGroupWithField |g= selectionGroupWithoutField | '-' g= selectionGroup );
	public final Selectable.Raw selectionGroup() throws RecognitionException {
		Selectable.Raw s = null;


		Selectable.Raw f =null;
		Selectable.Raw g =null;

		try {
			// Parser.g:331:5: ( ( selectionGroupWithField )=>f= selectionGroupWithField |g= selectionGroupWithoutField | '-' g= selectionGroup )
			int alt17=3;
			alt17 = dfa17.predict(input);
			switch (alt17) {
				case 1 :
					// Parser.g:331:7: ( selectionGroupWithField )=>f= selectionGroupWithField
					{
					pushFollow(FOLLOW_selectionGroupWithField_in_selectionGroup1603);
					f=selectionGroupWithField();
					state._fsp--;
					if (state.failed) return s;
					if ( state.backtracking==0 ) { s =f; }
					}
					break;
				case 2 :
					// Parser.g:332:7: g= selectionGroupWithoutField
					{
					pushFollow(FOLLOW_selectionGroupWithoutField_in_selectionGroup1615);
					g=selectionGroupWithoutField();
					state._fsp--;
					if (state.failed) return s;
					if ( state.backtracking==0 ) { s =g; }
					}
					break;
				case 3 :
					// Parser.g:333:7: '-' g= selectionGroup
					{
					match(input,192,FOLLOW_192_in_selectionGroup1625); if (state.failed) return s;
					pushFollow(FOLLOW_selectionGroup_in_selectionGroup1629);
					g=selectionGroup();
					state._fsp--;
					if (state.failed) return s;
					if ( state.backtracking==0 ) {s = Selectable.WithFunction.Raw.newNegation(g);}
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return s;
	}
	// $ANTLR end "selectionGroup"



	// $ANTLR start "selectionGroupWithField"
	// Parser.g:336:1: selectionGroupWithField returns [Selectable.Raw s] : g= selectionGroupWithoutField m= selectorModifier[g] ;
	public final Selectable.Raw selectionGroupWithField() throws RecognitionException {
		Selectable.Raw s = null;


		Selectable.Raw g =null;
		Selectable.Raw m =null;

		try {
			// Parser.g:337:5: (g= selectionGroupWithoutField m= selectorModifier[g] )
			// Parser.g:337:7: g= selectionGroupWithoutField m= selectorModifier[g]
			{
			pushFollow(FOLLOW_selectionGroupWithoutField_in_selectionGroupWithField1654);
			g=selectionGroupWithoutField();
			state._fsp--;
			if (state.failed) return s;
			pushFollow(FOLLOW_selectorModifier_in_selectionGroupWithField1658);
			m=selectorModifier(g);
			state._fsp--;
			if (state.failed) return s;
			if ( state.backtracking==0 ) {s = m;}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return s;
	}
	// $ANTLR end "selectionGroupWithField"



	// $ANTLR start "selectorModifier"
	// Parser.g:340:1: selectorModifier[Selectable.Raw receiver] returns [Selectable.Raw s] : (f= fieldSelectorModifier[receiver] m= selectorModifier[f] | '[' ss= collectionSubSelection[receiver] ']' m= selectorModifier[ss] |);
	public final Selectable.Raw selectorModifier(Selectable.Raw receiver) throws RecognitionException {
		Selectable.Raw s = null;


		Selectable.Raw f =null;
		Selectable.Raw m =null;
		Selectable.Raw ss =null;

		try {
			// Parser.g:341:5: (f= fieldSelectorModifier[receiver] m= selectorModifier[f] | '[' ss= collectionSubSelection[receiver] ']' m= selectorModifier[ss] |)
			int alt18=3;
			switch ( input.LA(1) ) {
			case 194:
				{
				alt18=1;
				}
				break;
			case 203:
				{
				alt18=2;
				}
				break;
			case EOF:
			case K_AS:
			case K_FROM:
			case 186:
			case 188:
			case 189:
			case 191:
			case 192:
			case 195:
			case 196:
			case 204:
			case 205:
			case 208:
				{
				alt18=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return s;}
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}
			switch (alt18) {
				case 1 :
					// Parser.g:341:7: f= fieldSelectorModifier[receiver] m= selectorModifier[f]
					{
					pushFollow(FOLLOW_fieldSelectorModifier_in_selectorModifier1685);
					f=fieldSelectorModifier(receiver);
					state._fsp--;
					if (state.failed) return s;
					pushFollow(FOLLOW_selectorModifier_in_selectorModifier1690);
					m=selectorModifier(f);
					state._fsp--;
					if (state.failed) return s;
					if ( state.backtracking==0 ) { s = m; }
					}
					break;
				case 2 :
					// Parser.g:342:7: '[' ss= collectionSubSelection[receiver] ']' m= selectorModifier[ss]
					{
					match(input,203,FOLLOW_203_in_selectorModifier1701); if (state.failed) return s;
					pushFollow(FOLLOW_collectionSubSelection_in_selectorModifier1705);
					ss=collectionSubSelection(receiver);
					state._fsp--;
					if (state.failed) return s;
					match(input,205,FOLLOW_205_in_selectorModifier1708); if (state.failed) return s;
					pushFollow(FOLLOW_selectorModifier_in_selectorModifier1712);
					m=selectorModifier(ss);
					state._fsp--;
					if (state.failed) return s;
					if ( state.backtracking==0 ) { s = m; }
					}
					break;
				case 3 :
					// Parser.g:343:7: 
					{
					if ( state.backtracking==0 ) { s = receiver; }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return s;
	}
	// $ANTLR end "selectorModifier"



	// $ANTLR start "fieldSelectorModifier"
	// Parser.g:346:1: fieldSelectorModifier[Selectable.Raw receiver] returns [Selectable.Raw s] : '.' fi= fident ;
	public final Selectable.Raw fieldSelectorModifier(Selectable.Raw receiver) throws RecognitionException {
		Selectable.Raw s = null;


		FieldIdentifier fi =null;

		try {
			// Parser.g:347:5: ( '.' fi= fident )
			// Parser.g:347:7: '.' fi= fident
			{
			match(input,194,FOLLOW_194_in_fieldSelectorModifier1745); if (state.failed) return s;
			pushFollow(FOLLOW_fident_in_fieldSelectorModifier1749);
			fi=fident();
			state._fsp--;
			if (state.failed) return s;
			if ( state.backtracking==0 ) { s = new Selectable.WithFieldSelection.Raw(receiver, fi); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return s;
	}
	// $ANTLR end "fieldSelectorModifier"



	// $ANTLR start "collectionSubSelection"
	// Parser.g:350:1: collectionSubSelection[Selectable.Raw receiver] returns [Selectable.Raw s] : (t1= term ( RANGE (t2= term )? )? | RANGE t2= term ) ;
	public final Selectable.Raw collectionSubSelection(Selectable.Raw receiver) throws RecognitionException {
		Selectable.Raw s = null;


		Term.Raw t1 =null;
		Term.Raw t2 =null;

		 boolean isSlice=false; 
		try {
			// Parser.g:352:5: ( (t1= term ( RANGE (t2= term )? )? | RANGE t2= term ) )
			// Parser.g:352:7: (t1= term ( RANGE (t2= term )? )? | RANGE t2= term )
			{
			// Parser.g:352:7: (t1= term ( RANGE (t2= term )? )? | RANGE t2= term )
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==BOOLEAN||LA21_0==DURATION||LA21_0==FLOAT||LA21_0==HEXNUMBER||(LA21_0 >= IDENT && LA21_0 <= INTEGER)||(LA21_0 >= K_AGGREGATE && LA21_0 <= K_ALL)||LA21_0==K_AS||LA21_0==K_ASCII||(LA21_0 >= K_BIGINT && LA21_0 <= K_BOOLEAN)||(LA21_0 >= K_CALLED && LA21_0 <= K_CLUSTERING)||(LA21_0 >= K_COMPACT && LA21_0 <= K_COUNTER)||(LA21_0 >= K_CUSTOM && LA21_0 <= K_DECIMAL)||(LA21_0 >= K_DISTINCT && LA21_0 <= K_DOUBLE)||LA21_0==K_DURATION||(LA21_0 >= K_EXISTS && LA21_0 <= K_FLOAT)||LA21_0==K_FROZEN||(LA21_0 >= K_FUNCTION && LA21_0 <= K_FUNCTIONS)||LA21_0==K_GROUP||(LA21_0 >= K_INET && LA21_0 <= K_INPUT)||LA21_0==K_INT||(LA21_0 >= K_JSON && LA21_0 <= K_KEYS)||(LA21_0 >= K_KEYSPACES && LA21_0 <= K_LIKE)||(LA21_0 >= K_LIST && LA21_0 <= K_MAP)||(LA21_0 >= K_NEGATIVE_INFINITY && LA21_0 <= K_NOLOGIN)||LA21_0==K_NOSUPERUSER||LA21_0==K_NULL||LA21_0==K_OPTIONS||(LA21_0 >= K_PARTITION && LA21_0 <= K_POSITIVE_NAN)||LA21_0==K_RETURNS||(LA21_0 >= K_ROLE && LA21_0 <= K_ROLES)||(LA21_0 >= K_SFUNC && LA21_0 <= K_TINYINT)||(LA21_0 >= K_TOKEN && LA21_0 <= K_TRIGGER)||(LA21_0 >= K_TTL && LA21_0 <= K_TYPE)||(LA21_0 >= K_USER && LA21_0 <= K_USERS)||(LA21_0 >= K_UUID && LA21_0 <= K_VARINT)||LA21_0==K_WRITETIME||(LA21_0 >= QMARK && LA21_0 <= QUOTED_NAME)||LA21_0==STRING_LITERAL||LA21_0==UUID||LA21_0==187||LA21_0==192||LA21_0==196||LA21_0==203||LA21_0==207) ) {
				alt21=1;
			}
			else if ( (LA21_0==RANGE) ) {
				alt21=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return s;}
				NoViableAltException nvae =
					new NoViableAltException("", 21, 0, input);
				throw nvae;
			}

			switch (alt21) {
				case 1 :
					// Parser.g:352:9: t1= term ( RANGE (t2= term )? )?
					{
					pushFollow(FOLLOW_term_in_collectionSubSelection1787);
					t1=term();
					state._fsp--;
					if (state.failed) return s;
					// Parser.g:352:17: ( RANGE (t2= term )? )?
					int alt20=2;
					int LA20_0 = input.LA(1);
					if ( (LA20_0==RANGE) ) {
						alt20=1;
					}
					switch (alt20) {
						case 1 :
							// Parser.g:352:19: RANGE (t2= term )?
							{
							if ( state.backtracking==0 ) { isSlice=true; }
							match(input,RANGE,FOLLOW_RANGE_in_collectionSubSelection1793); if (state.failed) return s;
							// Parser.g:352:43: (t2= term )?
							int alt19=2;
							int LA19_0 = input.LA(1);
							if ( (LA19_0==BOOLEAN||LA19_0==DURATION||LA19_0==FLOAT||LA19_0==HEXNUMBER||(LA19_0 >= IDENT && LA19_0 <= INTEGER)||(LA19_0 >= K_AGGREGATE && LA19_0 <= K_ALL)||LA19_0==K_AS||LA19_0==K_ASCII||(LA19_0 >= K_BIGINT && LA19_0 <= K_BOOLEAN)||(LA19_0 >= K_CALLED && LA19_0 <= K_CLUSTERING)||(LA19_0 >= K_COMPACT && LA19_0 <= K_COUNTER)||(LA19_0 >= K_CUSTOM && LA19_0 <= K_DECIMAL)||(LA19_0 >= K_DISTINCT && LA19_0 <= K_DOUBLE)||LA19_0==K_DURATION||(LA19_0 >= K_EXISTS && LA19_0 <= K_FLOAT)||LA19_0==K_FROZEN||(LA19_0 >= K_FUNCTION && LA19_0 <= K_FUNCTIONS)||LA19_0==K_GROUP||(LA19_0 >= K_INET && LA19_0 <= K_INPUT)||LA19_0==K_INT||(LA19_0 >= K_JSON && LA19_0 <= K_KEYS)||(LA19_0 >= K_KEYSPACES && LA19_0 <= K_LIKE)||(LA19_0 >= K_LIST && LA19_0 <= K_MAP)||(LA19_0 >= K_NEGATIVE_INFINITY && LA19_0 <= K_NOLOGIN)||LA19_0==K_NOSUPERUSER||LA19_0==K_NULL||LA19_0==K_OPTIONS||(LA19_0 >= K_PARTITION && LA19_0 <= K_POSITIVE_NAN)||LA19_0==K_RETURNS||(LA19_0 >= K_ROLE && LA19_0 <= K_ROLES)||(LA19_0 >= K_SFUNC && LA19_0 <= K_TINYINT)||(LA19_0 >= K_TOKEN && LA19_0 <= K_TRIGGER)||(LA19_0 >= K_TTL && LA19_0 <= K_TYPE)||(LA19_0 >= K_USER && LA19_0 <= K_USERS)||(LA19_0 >= K_UUID && LA19_0 <= K_VARINT)||LA19_0==K_WRITETIME||(LA19_0 >= QMARK && LA19_0 <= QUOTED_NAME)||LA19_0==STRING_LITERAL||LA19_0==UUID||LA19_0==187||LA19_0==192||LA19_0==196||LA19_0==203||LA19_0==207) ) {
								alt19=1;
							}
							switch (alt19) {
								case 1 :
									// Parser.g:352:44: t2= term
									{
									pushFollow(FOLLOW_term_in_collectionSubSelection1798);
									t2=term();
									state._fsp--;
									if (state.failed) return s;
									}
									break;

							}

							}
							break;

					}

					}
					break;
				case 2 :
					// Parser.g:353:9: RANGE t2= term
					{
					match(input,RANGE,FOLLOW_RANGE_in_collectionSubSelection1813); if (state.failed) return s;
					if ( state.backtracking==0 ) { isSlice=true; }
					pushFollow(FOLLOW_term_in_collectionSubSelection1819);
					t2=term();
					state._fsp--;
					if (state.failed) return s;
					}
					break;

			}

			if ( state.backtracking==0 ) {
			          s = isSlice
			             ? new Selectable.WithSliceSelection.Raw(receiver, t1, t2)
			             : new Selectable.WithElementSelection.Raw(receiver, t1);
			      }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return s;
	}
	// $ANTLR end "collectionSubSelection"



	// $ANTLR start "selectionGroupWithoutField"
	// Parser.g:361:1: selectionGroupWithoutField returns [Selectable.Raw s] : (sn= simpleUnaliasedSelector | ( selectionTypeHint )=>h= selectionTypeHint |t= selectionTupleOrNestedSelector |l= selectionList |m= selectionMapOrSet );
	public final Selectable.Raw selectionGroupWithoutField() throws RecognitionException {
		Selectable.Raw s = null;


		Selectable.Raw sn =null;
		Selectable.Raw h =null;
		Selectable.Raw t =null;
		Selectable.Raw l =null;
		Selectable.Raw m =null;

		 Selectable.Raw tmp = null; 
		try {
			// Parser.g:364:5: (sn= simpleUnaliasedSelector | ( selectionTypeHint )=>h= selectionTypeHint |t= selectionTupleOrNestedSelector |l= selectionList |m= selectionMapOrSet )
			int alt22=5;
			alt22 = dfa22.predict(input);
			switch (alt22) {
				case 1 :
					// Parser.g:364:7: sn= simpleUnaliasedSelector
					{
					pushFollow(FOLLOW_simpleUnaliasedSelector_in_selectionGroupWithoutField1871);
					sn=simpleUnaliasedSelector();
					state._fsp--;
					if (state.failed) return s;
					if ( state.backtracking==0 ) { tmp=sn; }
					}
					break;
				case 2 :
					// Parser.g:365:7: ( selectionTypeHint )=>h= selectionTypeHint
					{
					pushFollow(FOLLOW_selectionTypeHint_in_selectionGroupWithoutField1889);
					h=selectionTypeHint();
					state._fsp--;
					if (state.failed) return s;
					if ( state.backtracking==0 ) { tmp=h; }
					}
					break;
				case 3 :
					// Parser.g:366:7: t= selectionTupleOrNestedSelector
					{
					pushFollow(FOLLOW_selectionTupleOrNestedSelector_in_selectionGroupWithoutField1901);
					t=selectionTupleOrNestedSelector();
					state._fsp--;
					if (state.failed) return s;
					if ( state.backtracking==0 ) { tmp=t; }
					}
					break;
				case 4 :
					// Parser.g:367:7: l= selectionList
					{
					pushFollow(FOLLOW_selectionList_in_selectionGroupWithoutField1913);
					l=selectionList();
					state._fsp--;
					if (state.failed) return s;
					if ( state.backtracking==0 ) { tmp=l; }
					}
					break;
				case 5 :
					// Parser.g:368:7: m= selectionMapOrSet
					{
					pushFollow(FOLLOW_selectionMapOrSet_in_selectionGroupWithoutField1925);
					m=selectionMapOrSet();
					state._fsp--;
					if (state.failed) return s;
					if ( state.backtracking==0 ) { tmp=m; }
					}
					break;

			}
			if ( state.backtracking==0 ) { s = tmp; }
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return s;
	}
	// $ANTLR end "selectionGroupWithoutField"



	// $ANTLR start "selectionTypeHint"
	// Parser.g:372:1: selectionTypeHint returns [Selectable.Raw s] : '(' ct= comparatorType ')' a= selectionGroupWithoutField ;
	public final Selectable.Raw selectionTypeHint() throws RecognitionException {
		Selectable.Raw s = null;


		CQL3Type.Raw ct =null;
		Selectable.Raw a =null;

		try {
			// Parser.g:373:5: ( '(' ct= comparatorType ')' a= selectionGroupWithoutField )
			// Parser.g:373:7: '(' ct= comparatorType ')' a= selectionGroupWithoutField
			{
			match(input,187,FOLLOW_187_in_selectionTypeHint1953); if (state.failed) return s;
			pushFollow(FOLLOW_comparatorType_in_selectionTypeHint1957);
			ct=comparatorType();
			state._fsp--;
			if (state.failed) return s;
			match(input,188,FOLLOW_188_in_selectionTypeHint1959); if (state.failed) return s;
			pushFollow(FOLLOW_selectionGroupWithoutField_in_selectionTypeHint1963);
			a=selectionGroupWithoutField();
			state._fsp--;
			if (state.failed) return s;
			if ( state.backtracking==0 ) { s = new Selectable.WithTypeHint.Raw(ct, a); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return s;
	}
	// $ANTLR end "selectionTypeHint"



	// $ANTLR start "selectionList"
	// Parser.g:376:1: selectionList returns [Selectable.Raw s] : '[' (t1= unaliasedSelector ( ',' tn= unaliasedSelector )* )? ']' ;
	public final Selectable.Raw selectionList() throws RecognitionException {
		Selectable.Raw s = null;


		Selectable.Raw t1 =null;
		Selectable.Raw tn =null;

		 List<Selectable.Raw> l = new ArrayList<>(); 
		try {
			// Parser.g:379:5: ( '[' (t1= unaliasedSelector ( ',' tn= unaliasedSelector )* )? ']' )
			// Parser.g:379:7: '[' (t1= unaliasedSelector ( ',' tn= unaliasedSelector )* )? ']'
			{
			match(input,203,FOLLOW_203_in_selectionList2004); if (state.failed) return s;
			// Parser.g:379:11: (t1= unaliasedSelector ( ',' tn= unaliasedSelector )* )?
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==BOOLEAN||LA24_0==DURATION||LA24_0==FLOAT||LA24_0==HEXNUMBER||(LA24_0 >= IDENT && LA24_0 <= INTEGER)||(LA24_0 >= K_AGGREGATE && LA24_0 <= K_ALL)||LA24_0==K_AS||LA24_0==K_ASCII||(LA24_0 >= K_BIGINT && LA24_0 <= K_BOOLEAN)||(LA24_0 >= K_CALLED && LA24_0 <= K_CLUSTERING)||(LA24_0 >= K_COMPACT && LA24_0 <= K_COUNTER)||(LA24_0 >= K_CUSTOM && LA24_0 <= K_DECIMAL)||(LA24_0 >= K_DISTINCT && LA24_0 <= K_DOUBLE)||LA24_0==K_DURATION||(LA24_0 >= K_EXISTS && LA24_0 <= K_FLOAT)||LA24_0==K_FROZEN||(LA24_0 >= K_FUNCTION && LA24_0 <= K_FUNCTIONS)||LA24_0==K_GROUP||(LA24_0 >= K_INET && LA24_0 <= K_INPUT)||LA24_0==K_INT||(LA24_0 >= K_JSON && LA24_0 <= K_KEYS)||(LA24_0 >= K_KEYSPACES && LA24_0 <= K_LIKE)||(LA24_0 >= K_LIST && LA24_0 <= K_MAP)||(LA24_0 >= K_NEGATIVE_INFINITY && LA24_0 <= K_NOLOGIN)||LA24_0==K_NOSUPERUSER||LA24_0==K_NULL||LA24_0==K_OPTIONS||(LA24_0 >= K_PARTITION && LA24_0 <= K_POSITIVE_NAN)||LA24_0==K_RETURNS||(LA24_0 >= K_ROLE && LA24_0 <= K_ROLES)||(LA24_0 >= K_SFUNC && LA24_0 <= K_TINYINT)||(LA24_0 >= K_TOKEN && LA24_0 <= K_TRIGGER)||(LA24_0 >= K_TTL && LA24_0 <= K_TYPE)||(LA24_0 >= K_USER && LA24_0 <= K_USERS)||(LA24_0 >= K_UUID && LA24_0 <= K_VARINT)||LA24_0==K_WRITETIME||(LA24_0 >= QMARK && LA24_0 <= QUOTED_NAME)||LA24_0==STRING_LITERAL||LA24_0==UUID||LA24_0==187||LA24_0==192||LA24_0==196||LA24_0==203||LA24_0==207) ) {
				alt24=1;
			}
			switch (alt24) {
				case 1 :
					// Parser.g:379:13: t1= unaliasedSelector ( ',' tn= unaliasedSelector )*
					{
					pushFollow(FOLLOW_unaliasedSelector_in_selectionList2010);
					t1=unaliasedSelector();
					state._fsp--;
					if (state.failed) return s;
					if ( state.backtracking==0 ) { l.add(t1); }
					// Parser.g:379:49: ( ',' tn= unaliasedSelector )*
					loop23:
					while (true) {
						int alt23=2;
						int LA23_0 = input.LA(1);
						if ( (LA23_0==191) ) {
							alt23=1;
						}

						switch (alt23) {
						case 1 :
							// Parser.g:379:51: ',' tn= unaliasedSelector
							{
							match(input,191,FOLLOW_191_in_selectionList2016); if (state.failed) return s;
							pushFollow(FOLLOW_unaliasedSelector_in_selectionList2020);
							tn=unaliasedSelector();
							state._fsp--;
							if (state.failed) return s;
							if ( state.backtracking==0 ) { l.add(tn); }
							}
							break;

						default :
							break loop23;
						}
					}

					}
					break;

			}

			match(input,205,FOLLOW_205_in_selectionList2030); if (state.failed) return s;
			}

			if ( state.backtracking==0 ) { s = new Selectable.WithList.Raw(l); }
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return s;
	}
	// $ANTLR end "selectionList"



	// $ANTLR start "selectionMapOrSet"
	// Parser.g:382:1: selectionMapOrSet returns [Selectable.Raw s] : ( '{' t1= unaliasedSelector (m= selectionMap[t1] |st= selectionSet[t1] ) '}' | '{' '}' );
	public final Selectable.Raw selectionMapOrSet() throws RecognitionException {
		Selectable.Raw s = null;


		Selectable.Raw t1 =null;
		Selectable.Raw m =null;
		Selectable.Raw st =null;

		try {
			// Parser.g:383:5: ( '{' t1= unaliasedSelector (m= selectionMap[t1] |st= selectionSet[t1] ) '}' | '{' '}' )
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( (LA26_0==207) ) {
				int LA26_1 = input.LA(2);
				if ( (LA26_1==208) ) {
					alt26=2;
				}
				else if ( (LA26_1==BOOLEAN||LA26_1==DURATION||LA26_1==FLOAT||LA26_1==HEXNUMBER||(LA26_1 >= IDENT && LA26_1 <= INTEGER)||(LA26_1 >= K_AGGREGATE && LA26_1 <= K_ALL)||LA26_1==K_AS||LA26_1==K_ASCII||(LA26_1 >= K_BIGINT && LA26_1 <= K_BOOLEAN)||(LA26_1 >= K_CALLED && LA26_1 <= K_CLUSTERING)||(LA26_1 >= K_COMPACT && LA26_1 <= K_COUNTER)||(LA26_1 >= K_CUSTOM && LA26_1 <= K_DECIMAL)||(LA26_1 >= K_DISTINCT && LA26_1 <= K_DOUBLE)||LA26_1==K_DURATION||(LA26_1 >= K_EXISTS && LA26_1 <= K_FLOAT)||LA26_1==K_FROZEN||(LA26_1 >= K_FUNCTION && LA26_1 <= K_FUNCTIONS)||LA26_1==K_GROUP||(LA26_1 >= K_INET && LA26_1 <= K_INPUT)||LA26_1==K_INT||(LA26_1 >= K_JSON && LA26_1 <= K_KEYS)||(LA26_1 >= K_KEYSPACES && LA26_1 <= K_LIKE)||(LA26_1 >= K_LIST && LA26_1 <= K_MAP)||(LA26_1 >= K_NEGATIVE_INFINITY && LA26_1 <= K_NOLOGIN)||LA26_1==K_NOSUPERUSER||LA26_1==K_NULL||LA26_1==K_OPTIONS||(LA26_1 >= K_PARTITION && LA26_1 <= K_POSITIVE_NAN)||LA26_1==K_RETURNS||(LA26_1 >= K_ROLE && LA26_1 <= K_ROLES)||(LA26_1 >= K_SFUNC && LA26_1 <= K_TINYINT)||(LA26_1 >= K_TOKEN && LA26_1 <= K_TRIGGER)||(LA26_1 >= K_TTL && LA26_1 <= K_TYPE)||(LA26_1 >= K_USER && LA26_1 <= K_USERS)||(LA26_1 >= K_UUID && LA26_1 <= K_VARINT)||LA26_1==K_WRITETIME||(LA26_1 >= QMARK && LA26_1 <= QUOTED_NAME)||LA26_1==STRING_LITERAL||LA26_1==UUID||LA26_1==187||LA26_1==192||LA26_1==196||LA26_1==203||LA26_1==207) ) {
					alt26=1;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return s;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 26, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return s;}
				NoViableAltException nvae =
					new NoViableAltException("", 26, 0, input);
				throw nvae;
			}

			switch (alt26) {
				case 1 :
					// Parser.g:383:7: '{' t1= unaliasedSelector (m= selectionMap[t1] |st= selectionSet[t1] ) '}'
					{
					match(input,207,FOLLOW_207_in_selectionMapOrSet2051); if (state.failed) return s;
					pushFollow(FOLLOW_unaliasedSelector_in_selectionMapOrSet2055);
					t1=unaliasedSelector();
					state._fsp--;
					if (state.failed) return s;
					// Parser.g:383:32: (m= selectionMap[t1] |st= selectionSet[t1] )
					int alt25=2;
					int LA25_0 = input.LA(1);
					if ( (LA25_0==196) ) {
						alt25=1;
					}
					else if ( (LA25_0==191||LA25_0==208) ) {
						alt25=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return s;}
						NoViableAltException nvae =
							new NoViableAltException("", 25, 0, input);
						throw nvae;
					}

					switch (alt25) {
						case 1 :
							// Parser.g:383:34: m= selectionMap[t1]
							{
							pushFollow(FOLLOW_selectionMap_in_selectionMapOrSet2061);
							m=selectionMap(t1);
							state._fsp--;
							if (state.failed) return s;
							if ( state.backtracking==0 ) { s = m; }
							}
							break;
						case 2 :
							// Parser.g:383:67: st= selectionSet[t1]
							{
							pushFollow(FOLLOW_selectionSet_in_selectionMapOrSet2070);
							st=selectionSet(t1);
							state._fsp--;
							if (state.failed) return s;
							if ( state.backtracking==0 ) { s = st; }
							}
							break;

					}

					match(input,208,FOLLOW_208_in_selectionMapOrSet2076); if (state.failed) return s;
					}
					break;
				case 2 :
					// Parser.g:384:7: '{' '}'
					{
					match(input,207,FOLLOW_207_in_selectionMapOrSet2084); if (state.failed) return s;
					match(input,208,FOLLOW_208_in_selectionMapOrSet2086); if (state.failed) return s;
					if ( state.backtracking==0 ) { s = new Selectable.WithSet.Raw(Collections.emptyList());}
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return s;
	}
	// $ANTLR end "selectionMapOrSet"



	// $ANTLR start "selectionMap"
	// Parser.g:387:1: selectionMap[Selectable.Raw k1] returns [Selectable.Raw s] : ':' v1= unaliasedSelector ( ',' kn= unaliasedSelector ':' vn= unaliasedSelector )* ;
	public final Selectable.Raw selectionMap(Selectable.Raw k1) throws RecognitionException {
		Selectable.Raw s = null;


		Selectable.Raw v1 =null;
		Selectable.Raw kn =null;
		Selectable.Raw vn =null;

		 List<Pair<Selectable.Raw, Selectable.Raw>> m = new ArrayList<>(); 
		try {
			// Parser.g:390:7: ( ':' v1= unaliasedSelector ( ',' kn= unaliasedSelector ':' vn= unaliasedSelector )* )
			// Parser.g:390:9: ':' v1= unaliasedSelector ( ',' kn= unaliasedSelector ':' vn= unaliasedSelector )*
			{
			match(input,196,FOLLOW_196_in_selectionMap2131); if (state.failed) return s;
			pushFollow(FOLLOW_unaliasedSelector_in_selectionMap2135);
			v1=unaliasedSelector();
			state._fsp--;
			if (state.failed) return s;
			if ( state.backtracking==0 ) { m.add(Pair.create(k1, v1)); }
			// Parser.g:390:68: ( ',' kn= unaliasedSelector ':' vn= unaliasedSelector )*
			loop27:
			while (true) {
				int alt27=2;
				int LA27_0 = input.LA(1);
				if ( (LA27_0==191) ) {
					alt27=1;
				}

				switch (alt27) {
				case 1 :
					// Parser.g:390:70: ',' kn= unaliasedSelector ':' vn= unaliasedSelector
					{
					match(input,191,FOLLOW_191_in_selectionMap2143); if (state.failed) return s;
					pushFollow(FOLLOW_unaliasedSelector_in_selectionMap2147);
					kn=unaliasedSelector();
					state._fsp--;
					if (state.failed) return s;
					match(input,196,FOLLOW_196_in_selectionMap2149); if (state.failed) return s;
					pushFollow(FOLLOW_unaliasedSelector_in_selectionMap2153);
					vn=unaliasedSelector();
					state._fsp--;
					if (state.failed) return s;
					if ( state.backtracking==0 ) { m.add(Pair.create(kn, vn)); }
					}
					break;

				default :
					break loop27;
				}
			}

			}

			if ( state.backtracking==0 ) { s = new Selectable.WithMapOrUdt.Raw(m); }
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return s;
	}
	// $ANTLR end "selectionMap"



	// $ANTLR start "selectionSet"
	// Parser.g:393:1: selectionSet[Selectable.Raw t1] returns [Selectable.Raw s] : ( ',' tn= unaliasedSelector )* ;
	public final Selectable.Raw selectionSet(Selectable.Raw t1) throws RecognitionException {
		Selectable.Raw s = null;


		Selectable.Raw tn =null;

		 List<Selectable.Raw> l = new ArrayList<>(); l.add(t1); 
		try {
			// Parser.g:396:7: ( ( ',' tn= unaliasedSelector )* )
			// Parser.g:396:9: ( ',' tn= unaliasedSelector )*
			{
			// Parser.g:396:9: ( ',' tn= unaliasedSelector )*
			loop28:
			while (true) {
				int alt28=2;
				int LA28_0 = input.LA(1);
				if ( (LA28_0==191) ) {
					alt28=1;
				}

				switch (alt28) {
				case 1 :
					// Parser.g:396:11: ',' tn= unaliasedSelector
					{
					match(input,191,FOLLOW_191_in_selectionSet2205); if (state.failed) return s;
					pushFollow(FOLLOW_unaliasedSelector_in_selectionSet2209);
					tn=unaliasedSelector();
					state._fsp--;
					if (state.failed) return s;
					if ( state.backtracking==0 ) { l.add(tn); }
					}
					break;

				default :
					break loop28;
				}
			}

			}

			if ( state.backtracking==0 ) { s = new Selectable.WithSet.Raw(l); }
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return s;
	}
	// $ANTLR end "selectionSet"



	// $ANTLR start "selectionTupleOrNestedSelector"
	// Parser.g:399:1: selectionTupleOrNestedSelector returns [Selectable.Raw s] : '(' t1= unaliasedSelector ( ',' tn= unaliasedSelector )* ')' ;
	public final Selectable.Raw selectionTupleOrNestedSelector() throws RecognitionException {
		Selectable.Raw s = null;


		Selectable.Raw t1 =null;
		Selectable.Raw tn =null;

		 List<Selectable.Raw> l = new ArrayList<>(); 
		try {
			// Parser.g:402:5: ( '(' t1= unaliasedSelector ( ',' tn= unaliasedSelector )* ')' )
			// Parser.g:402:7: '(' t1= unaliasedSelector ( ',' tn= unaliasedSelector )* ')'
			{
			match(input,187,FOLLOW_187_in_selectionTupleOrNestedSelector2255); if (state.failed) return s;
			pushFollow(FOLLOW_unaliasedSelector_in_selectionTupleOrNestedSelector2259);
			t1=unaliasedSelector();
			state._fsp--;
			if (state.failed) return s;
			if ( state.backtracking==0 ) { l.add(t1); }
			// Parser.g:402:47: ( ',' tn= unaliasedSelector )*
			loop29:
			while (true) {
				int alt29=2;
				int LA29_0 = input.LA(1);
				if ( (LA29_0==191) ) {
					alt29=1;
				}

				switch (alt29) {
				case 1 :
					// Parser.g:402:48: ',' tn= unaliasedSelector
					{
					match(input,191,FOLLOW_191_in_selectionTupleOrNestedSelector2264); if (state.failed) return s;
					pushFollow(FOLLOW_unaliasedSelector_in_selectionTupleOrNestedSelector2268);
					tn=unaliasedSelector();
					state._fsp--;
					if (state.failed) return s;
					if ( state.backtracking==0 ) { l.add(tn); }
					}
					break;

				default :
					break loop29;
				}
			}

			match(input,188,FOLLOW_188_in_selectionTupleOrNestedSelector2275); if (state.failed) return s;
			}

			if ( state.backtracking==0 ) { s = new Selectable.BetweenParenthesesOrWithTuple.Raw(l); }
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return s;
	}
	// $ANTLR end "selectionTupleOrNestedSelector"



	// $ANTLR start "simpleUnaliasedSelector"
	// Parser.g:409:1: simpleUnaliasedSelector returns [Selectable.Raw s] : (c= sident |l= selectionLiteral |f= selectionFunction );
	public final Selectable.Raw simpleUnaliasedSelector() throws RecognitionException {
		Selectable.Raw s = null;


		Selectable.Raw c =null;
		Term.Raw l =null;
		Selectable.Raw f =null;

		try {
			// Parser.g:410:5: (c= sident |l= selectionLiteral |f= selectionFunction )
			int alt30=3;
			alt30 = dfa30.predict(input);
			switch (alt30) {
				case 1 :
					// Parser.g:410:7: c= sident
					{
					pushFollow(FOLLOW_sident_in_simpleUnaliasedSelector2300);
					c=sident();
					state._fsp--;
					if (state.failed) return s;
					if ( state.backtracking==0 ) { s = c; }
					}
					break;
				case 2 :
					// Parser.g:411:7: l= selectionLiteral
					{
					pushFollow(FOLLOW_selectionLiteral_in_simpleUnaliasedSelector2346);
					l=selectionLiteral();
					state._fsp--;
					if (state.failed) return s;
					if ( state.backtracking==0 ) { s = new Selectable.WithTerm.Raw(l); }
					}
					break;
				case 3 :
					// Parser.g:412:7: f= selectionFunction
					{
					pushFollow(FOLLOW_selectionFunction_in_simpleUnaliasedSelector2382);
					f=selectionFunction();
					state._fsp--;
					if (state.failed) return s;
					if ( state.backtracking==0 ) { s = f; }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return s;
	}
	// $ANTLR end "simpleUnaliasedSelector"



	// $ANTLR start "selectionFunction"
	// Parser.g:415:1: selectionFunction returns [Selectable.Raw s] : ( K_COUNT '(' '\\*' ')' | K_WRITETIME '(' c= cident ')' | K_TTL '(' c= cident ')' | K_CAST '(' sn= unaliasedSelector K_AS t= native_type ')' |f= functionName args= selectionFunctionArgs );
	public final Selectable.Raw selectionFunction() throws RecognitionException {
		Selectable.Raw s = null;


		ColumnMetadata.Raw c =null;
		Selectable.Raw sn =null;
		CQL3Type t =null;
		FunctionName f =null;
		List<Selectable.Raw> args =null;

		try {
			// Parser.g:416:5: ( K_COUNT '(' '\\*' ')' | K_WRITETIME '(' c= cident ')' | K_TTL '(' c= cident ')' | K_CAST '(' sn= unaliasedSelector K_AS t= native_type ')' |f= functionName args= selectionFunctionArgs )
			int alt31=5;
			alt31 = dfa31.predict(input);
			switch (alt31) {
				case 1 :
					// Parser.g:416:7: K_COUNT '(' '\\*' ')'
					{
					match(input,K_COUNT,FOLLOW_K_COUNT_in_selectionFunction2428); if (state.failed) return s;
					match(input,187,FOLLOW_187_in_selectionFunction2430); if (state.failed) return s;
					match(input,204,FOLLOW_204_in_selectionFunction2432); if (state.failed) return s;
					match(input,188,FOLLOW_188_in_selectionFunction2434); if (state.failed) return s;
					if ( state.backtracking==0 ) { s = Selectable.WithFunction.Raw.newCountRowsFunction(); }
					}
					break;
				case 2 :
					// Parser.g:417:7: K_WRITETIME '(' c= cident ')'
					{
					match(input,K_WRITETIME,FOLLOW_K_WRITETIME_in_selectionFunction2465); if (state.failed) return s;
					match(input,187,FOLLOW_187_in_selectionFunction2467); if (state.failed) return s;
					pushFollow(FOLLOW_cident_in_selectionFunction2471);
					c=cident();
					state._fsp--;
					if (state.failed) return s;
					match(input,188,FOLLOW_188_in_selectionFunction2473); if (state.failed) return s;
					if ( state.backtracking==0 ) { s = new Selectable.WritetimeOrTTL.Raw(c, true); }
					}
					break;
				case 3 :
					// Parser.g:418:7: K_TTL '(' c= cident ')'
					{
					match(input,K_TTL,FOLLOW_K_TTL_in_selectionFunction2496); if (state.failed) return s;
					match(input,187,FOLLOW_187_in_selectionFunction2504); if (state.failed) return s;
					pushFollow(FOLLOW_cident_in_selectionFunction2508);
					c=cident();
					state._fsp--;
					if (state.failed) return s;
					match(input,188,FOLLOW_188_in_selectionFunction2510); if (state.failed) return s;
					if ( state.backtracking==0 ) { s = new Selectable.WritetimeOrTTL.Raw(c, false); }
					}
					break;
				case 4 :
					// Parser.g:419:7: K_CAST '(' sn= unaliasedSelector K_AS t= native_type ')'
					{
					match(input,K_CAST,FOLLOW_K_CAST_in_selectionFunction2533); if (state.failed) return s;
					match(input,187,FOLLOW_187_in_selectionFunction2540); if (state.failed) return s;
					pushFollow(FOLLOW_unaliasedSelector_in_selectionFunction2544);
					sn=unaliasedSelector();
					state._fsp--;
					if (state.failed) return s;
					match(input,K_AS,FOLLOW_K_AS_in_selectionFunction2546); if (state.failed) return s;
					pushFollow(FOLLOW_native_type_in_selectionFunction2550);
					t=native_type();
					state._fsp--;
					if (state.failed) return s;
					match(input,188,FOLLOW_188_in_selectionFunction2552); if (state.failed) return s;
					if ( state.backtracking==0 ) {s = new Selectable.WithCast.Raw(sn, t);}
					}
					break;
				case 5 :
					// Parser.g:420:7: f= functionName args= selectionFunctionArgs
					{
					pushFollow(FOLLOW_functionName_in_selectionFunction2564);
					f=functionName();
					state._fsp--;
					if (state.failed) return s;
					pushFollow(FOLLOW_selectionFunctionArgs_in_selectionFunction2568);
					args=selectionFunctionArgs();
					state._fsp--;
					if (state.failed) return s;
					if ( state.backtracking==0 ) { s = new Selectable.WithFunction.Raw(f, args); }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return s;
	}
	// $ANTLR end "selectionFunction"



	// $ANTLR start "selectionLiteral"
	// Parser.g:423:1: selectionLiteral returns [Term.Raw value] : (c= constant | K_NULL | ':' id= noncol_ident | QMARK );
	public final Term.Raw selectionLiteral() throws RecognitionException {
		Term.Raw value = null;


		Constants.Literal c =null;
		ColumnIdentifier id =null;

		try {
			// Parser.g:424:5: (c= constant | K_NULL | ':' id= noncol_ident | QMARK )
			int alt32=4;
			switch ( input.LA(1) ) {
			case BOOLEAN:
			case DURATION:
			case FLOAT:
			case HEXNUMBER:
			case INTEGER:
			case K_NEGATIVE_INFINITY:
			case K_NEGATIVE_NAN:
			case K_POSITIVE_INFINITY:
			case K_POSITIVE_NAN:
			case STRING_LITERAL:
			case UUID:
				{
				alt32=1;
				}
				break;
			case K_NULL:
				{
				alt32=2;
				}
				break;
			case 196:
				{
				alt32=3;
				}
				break;
			case QMARK:
				{
				alt32=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return value;}
				NoViableAltException nvae =
					new NoViableAltException("", 32, 0, input);
				throw nvae;
			}
			switch (alt32) {
				case 1 :
					// Parser.g:424:7: c= constant
					{
					pushFollow(FOLLOW_constant_in_selectionLiteral2593);
					c=constant();
					state._fsp--;
					if (state.failed) return value;
					if ( state.backtracking==0 ) { value = c; }
					}
					break;
				case 2 :
					// Parser.g:425:7: K_NULL
					{
					match(input,K_NULL,FOLLOW_K_NULL_in_selectionLiteral2623); if (state.failed) return value;
					if ( state.backtracking==0 ) { value = Constants.NULL_LITERAL; }
					}
					break;
				case 3 :
					// Parser.g:426:7: ':' id= noncol_ident
					{
					match(input,196,FOLLOW_196_in_selectionLiteral2657); if (state.failed) return value;
					pushFollow(FOLLOW_noncol_ident_in_selectionLiteral2661);
					id=noncol_ident();
					state._fsp--;
					if (state.failed) return value;
					if ( state.backtracking==0 ) { value = newBindVariables(id); }
					}
					break;
				case 4 :
					// Parser.g:427:7: QMARK
					{
					match(input,QMARK,FOLLOW_QMARK_in_selectionLiteral2682); if (state.failed) return value;
					if ( state.backtracking==0 ) { value = newBindVariables(null); }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "selectionLiteral"



	// $ANTLR start "selectionFunctionArgs"
	// Parser.g:430:1: selectionFunctionArgs returns [List<Selectable.Raw> a] : '(' (s1= unaliasedSelector ( ',' sn= unaliasedSelector )* )? ')' ;
	public final List<Selectable.Raw> selectionFunctionArgs() throws RecognitionException {
		List<Selectable.Raw> a = null;


		Selectable.Raw s1 =null;
		Selectable.Raw sn =null;

		 a = new ArrayList<>(); 
		try {
			// Parser.g:432:5: ( '(' (s1= unaliasedSelector ( ',' sn= unaliasedSelector )* )? ')' )
			// Parser.g:432:7: '(' (s1= unaliasedSelector ( ',' sn= unaliasedSelector )* )? ')'
			{
			match(input,187,FOLLOW_187_in_selectionFunctionArgs2738); if (state.failed) return a;
			// Parser.g:432:11: (s1= unaliasedSelector ( ',' sn= unaliasedSelector )* )?
			int alt34=2;
			int LA34_0 = input.LA(1);
			if ( (LA34_0==BOOLEAN||LA34_0==DURATION||LA34_0==FLOAT||LA34_0==HEXNUMBER||(LA34_0 >= IDENT && LA34_0 <= INTEGER)||(LA34_0 >= K_AGGREGATE && LA34_0 <= K_ALL)||LA34_0==K_AS||LA34_0==K_ASCII||(LA34_0 >= K_BIGINT && LA34_0 <= K_BOOLEAN)||(LA34_0 >= K_CALLED && LA34_0 <= K_CLUSTERING)||(LA34_0 >= K_COMPACT && LA34_0 <= K_COUNTER)||(LA34_0 >= K_CUSTOM && LA34_0 <= K_DECIMAL)||(LA34_0 >= K_DISTINCT && LA34_0 <= K_DOUBLE)||LA34_0==K_DURATION||(LA34_0 >= K_EXISTS && LA34_0 <= K_FLOAT)||LA34_0==K_FROZEN||(LA34_0 >= K_FUNCTION && LA34_0 <= K_FUNCTIONS)||LA34_0==K_GROUP||(LA34_0 >= K_INET && LA34_0 <= K_INPUT)||LA34_0==K_INT||(LA34_0 >= K_JSON && LA34_0 <= K_KEYS)||(LA34_0 >= K_KEYSPACES && LA34_0 <= K_LIKE)||(LA34_0 >= K_LIST && LA34_0 <= K_MAP)||(LA34_0 >= K_NEGATIVE_INFINITY && LA34_0 <= K_NOLOGIN)||LA34_0==K_NOSUPERUSER||LA34_0==K_NULL||LA34_0==K_OPTIONS||(LA34_0 >= K_PARTITION && LA34_0 <= K_POSITIVE_NAN)||LA34_0==K_RETURNS||(LA34_0 >= K_ROLE && LA34_0 <= K_ROLES)||(LA34_0 >= K_SFUNC && LA34_0 <= K_TINYINT)||(LA34_0 >= K_TOKEN && LA34_0 <= K_TRIGGER)||(LA34_0 >= K_TTL && LA34_0 <= K_TYPE)||(LA34_0 >= K_USER && LA34_0 <= K_USERS)||(LA34_0 >= K_UUID && LA34_0 <= K_VARINT)||LA34_0==K_WRITETIME||(LA34_0 >= QMARK && LA34_0 <= QUOTED_NAME)||LA34_0==STRING_LITERAL||LA34_0==UUID||LA34_0==187||LA34_0==192||LA34_0==196||LA34_0==203||LA34_0==207) ) {
				alt34=1;
			}
			switch (alt34) {
				case 1 :
					// Parser.g:432:12: s1= unaliasedSelector ( ',' sn= unaliasedSelector )*
					{
					pushFollow(FOLLOW_unaliasedSelector_in_selectionFunctionArgs2743);
					s1=unaliasedSelector();
					state._fsp--;
					if (state.failed) return a;
					if ( state.backtracking==0 ) { a.add(s1); }
					// Parser.g:433:11: ( ',' sn= unaliasedSelector )*
					loop33:
					while (true) {
						int alt33=2;
						int LA33_0 = input.LA(1);
						if ( (LA33_0==191) ) {
							alt33=1;
						}

						switch (alt33) {
						case 1 :
							// Parser.g:433:13: ',' sn= unaliasedSelector
							{
							match(input,191,FOLLOW_191_in_selectionFunctionArgs2759); if (state.failed) return a;
							pushFollow(FOLLOW_unaliasedSelector_in_selectionFunctionArgs2763);
							sn=unaliasedSelector();
							state._fsp--;
							if (state.failed) return a;
							if ( state.backtracking==0 ) { a.add(sn); }
							}
							break;

						default :
							break loop33;
						}
					}

					}
					break;

			}

			match(input,188,FOLLOW_188_in_selectionFunctionArgs2778); if (state.failed) return a;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return a;
	}
	// $ANTLR end "selectionFunctionArgs"



	// $ANTLR start "sident"
	// Parser.g:437:1: sident returns [Selectable.Raw id] : (t= IDENT |t= QUOTED_NAME |k= unreserved_keyword );
	public final Selectable.Raw sident() throws RecognitionException {
		Selectable.Raw id = null;


		Token t=null;
		String k =null;

		try {
			// Parser.g:438:5: (t= IDENT |t= QUOTED_NAME |k= unreserved_keyword )
			int alt35=3;
			switch ( input.LA(1) ) {
			case IDENT:
				{
				alt35=1;
				}
				break;
			case QUOTED_NAME:
				{
				alt35=2;
				}
				break;
			case K_AGGREGATE:
			case K_ALL:
			case K_AS:
			case K_ASCII:
			case K_BIGINT:
			case K_BLOB:
			case K_BOOLEAN:
			case K_CALLED:
			case K_CAST:
			case K_CLUSTERING:
			case K_COMPACT:
			case K_CONTAINS:
			case K_COUNT:
			case K_COUNTER:
			case K_CUSTOM:
			case K_DATE:
			case K_DECIMAL:
			case K_DISTINCT:
			case K_DOUBLE:
			case K_DURATION:
			case K_EXISTS:
			case K_FILTERING:
			case K_FINALFUNC:
			case K_FLOAT:
			case K_FROZEN:
			case K_FUNCTION:
			case K_FUNCTIONS:
			case K_GROUP:
			case K_INET:
			case K_INITCOND:
			case K_INPUT:
			case K_INT:
			case K_JSON:
			case K_KEY:
			case K_KEYS:
			case K_KEYSPACES:
			case K_LANGUAGE:
			case K_LIKE:
			case K_LIST:
			case K_LOGIN:
			case K_MAP:
			case K_NOLOGIN:
			case K_NOSUPERUSER:
			case K_OPTIONS:
			case K_PARTITION:
			case K_PASSWORD:
			case K_PER:
			case K_PERMISSION:
			case K_PERMISSIONS:
			case K_RETURNS:
			case K_ROLE:
			case K_ROLES:
			case K_SFUNC:
			case K_SMALLINT:
			case K_STATIC:
			case K_STORAGE:
			case K_STYPE:
			case K_SUPERUSER:
			case K_TEXT:
			case K_TIME:
			case K_TIMESTAMP:
			case K_TIMEUUID:
			case K_TINYINT:
			case K_TRIGGER:
			case K_TTL:
			case K_TUPLE:
			case K_TYPE:
			case K_USER:
			case K_USERS:
			case K_UUID:
			case K_VALUES:
			case K_VARCHAR:
			case K_VARINT:
			case K_WRITETIME:
				{
				alt35=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return id;}
				NoViableAltException nvae =
					new NoViableAltException("", 35, 0, input);
				throw nvae;
			}
			switch (alt35) {
				case 1 :
					// Parser.g:438:7: t= IDENT
					{
					t=(Token)match(input,IDENT,FOLLOW_IDENT_in_sident2801); if (state.failed) return id;
					if ( state.backtracking==0 ) { id = Selectable.RawIdentifier.forUnquoted((t!=null?t.getText():null)); }
					}
					break;
				case 2 :
					// Parser.g:439:7: t= QUOTED_NAME
					{
					t=(Token)match(input,QUOTED_NAME,FOLLOW_QUOTED_NAME_in_sident2826); if (state.failed) return id;
					if ( state.backtracking==0 ) { id = ColumnMetadata.RawIdentifier.forQuoted((t!=null?t.getText():null)); }
					}
					break;
				case 3 :
					// Parser.g:440:7: k= unreserved_keyword
					{
					pushFollow(FOLLOW_unreserved_keyword_in_sident2845);
					k=unreserved_keyword();
					state._fsp--;
					if (state.failed) return id;
					if ( state.backtracking==0 ) { id = ColumnMetadata.RawIdentifier.forUnquoted(k); }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return id;
	}
	// $ANTLR end "sident"



	// $ANTLR start "whereClause"
	// Parser.g:443:1: whereClause returns [WhereClause.Builder clause] : relationOrExpression[$clause] ( K_AND relationOrExpression[$clause] )* ;
	public final WhereClause.Builder whereClause() throws RecognitionException {
		WhereClause.Builder clause = null;


		 clause = new WhereClause.Builder(); 
		try {
			// Parser.g:445:5: ( relationOrExpression[$clause] ( K_AND relationOrExpression[$clause] )* )
			// Parser.g:445:7: relationOrExpression[$clause] ( K_AND relationOrExpression[$clause] )*
			{
			pushFollow(FOLLOW_relationOrExpression_in_whereClause2876);
			relationOrExpression(clause);
			state._fsp--;
			if (state.failed) return clause;
			// Parser.g:445:37: ( K_AND relationOrExpression[$clause] )*
			loop36:
			while (true) {
				int alt36=2;
				int LA36_0 = input.LA(1);
				if ( (LA36_0==K_AND) ) {
					alt36=1;
				}

				switch (alt36) {
				case 1 :
					// Parser.g:445:38: K_AND relationOrExpression[$clause]
					{
					match(input,K_AND,FOLLOW_K_AND_in_whereClause2880); if (state.failed) return clause;
					pushFollow(FOLLOW_relationOrExpression_in_whereClause2882);
					relationOrExpression(clause);
					state._fsp--;
					if (state.failed) return clause;
					}
					break;

				default :
					break loop36;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return clause;
	}
	// $ANTLR end "whereClause"



	// $ANTLR start "relationOrExpression"
	// Parser.g:448:1: relationOrExpression[WhereClause.Builder clause] : ( relation[$clause] | customIndexExpression[$clause] );
	public final void relationOrExpression(WhereClause.Builder clause) throws RecognitionException {
		try {
			// Parser.g:449:5: ( relation[$clause] | customIndexExpression[$clause] )
			int alt37=2;
			int LA37_0 = input.LA(1);
			if ( (LA37_0==IDENT||(LA37_0 >= K_AGGREGATE && LA37_0 <= K_ALL)||LA37_0==K_AS||LA37_0==K_ASCII||(LA37_0 >= K_BIGINT && LA37_0 <= K_BOOLEAN)||(LA37_0 >= K_CALLED && LA37_0 <= K_CLUSTERING)||(LA37_0 >= K_COMPACT && LA37_0 <= K_COUNTER)||(LA37_0 >= K_CUSTOM && LA37_0 <= K_DECIMAL)||(LA37_0 >= K_DISTINCT && LA37_0 <= K_DOUBLE)||LA37_0==K_DURATION||(LA37_0 >= K_EXISTS && LA37_0 <= K_FLOAT)||LA37_0==K_FROZEN||(LA37_0 >= K_FUNCTION && LA37_0 <= K_FUNCTIONS)||LA37_0==K_GROUP||(LA37_0 >= K_INET && LA37_0 <= K_INPUT)||LA37_0==K_INT||(LA37_0 >= K_JSON && LA37_0 <= K_KEYS)||(LA37_0 >= K_KEYSPACES && LA37_0 <= K_LIKE)||(LA37_0 >= K_LIST && LA37_0 <= K_MAP)||LA37_0==K_NOLOGIN||LA37_0==K_NOSUPERUSER||LA37_0==K_OPTIONS||(LA37_0 >= K_PARTITION && LA37_0 <= K_PERMISSIONS)||LA37_0==K_RETURNS||(LA37_0 >= K_ROLE && LA37_0 <= K_ROLES)||(LA37_0 >= K_SFUNC && LA37_0 <= K_TINYINT)||(LA37_0 >= K_TOKEN && LA37_0 <= K_TRIGGER)||(LA37_0 >= K_TTL && LA37_0 <= K_TYPE)||(LA37_0 >= K_USER && LA37_0 <= K_USERS)||(LA37_0 >= K_UUID && LA37_0 <= K_VARINT)||LA37_0==K_WRITETIME||LA37_0==QUOTED_NAME||LA37_0==187) ) {
				alt37=1;
			}
			else if ( (LA37_0==206) ) {
				alt37=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 37, 0, input);
				throw nvae;
			}

			switch (alt37) {
				case 1 :
					// Parser.g:449:7: relation[$clause]
					{
					pushFollow(FOLLOW_relation_in_relationOrExpression2904);
					relation(clause);
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// Parser.g:450:7: customIndexExpression[$clause]
					{
					pushFollow(FOLLOW_customIndexExpression_in_relationOrExpression2913);
					customIndexExpression(clause);
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "relationOrExpression"



	// $ANTLR start "customIndexExpression"
	// Parser.g:453:1: customIndexExpression[WhereClause.Builder clause] : 'expr(' idxName[name] ',' t= term ')' ;
	public final void customIndexExpression(WhereClause.Builder clause) throws RecognitionException {
		Term.Raw t =null;

		IndexName name = new IndexName();
		try {
			// Parser.g:455:5: ( 'expr(' idxName[name] ',' t= term ')' )
			// Parser.g:455:7: 'expr(' idxName[name] ',' t= term ')'
			{
			match(input,206,FOLLOW_206_in_customIndexExpression2941); if (state.failed) return;
			pushFollow(FOLLOW_idxName_in_customIndexExpression2943);
			idxName(name);
			state._fsp--;
			if (state.failed) return;
			match(input,191,FOLLOW_191_in_customIndexExpression2946); if (state.failed) return;
			pushFollow(FOLLOW_term_in_customIndexExpression2950);
			t=term();
			state._fsp--;
			if (state.failed) return;
			match(input,188,FOLLOW_188_in_customIndexExpression2952); if (state.failed) return;
			if ( state.backtracking==0 ) { clause.add(new CustomIndexExpression(name, t));}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "customIndexExpression"



	// $ANTLR start "orderByClause"
	// Parser.g:458:1: orderByClause[Map<ColumnMetadata.Raw, Boolean> orderings] : c= cident ( K_ASC | K_DESC )? ;
	public final void orderByClause(Map<ColumnMetadata.Raw, Boolean> orderings) throws RecognitionException {
		ColumnMetadata.Raw c =null;


		        boolean reversed = false;
		    
		try {
			// Parser.g:462:5: (c= cident ( K_ASC | K_DESC )? )
			// Parser.g:462:7: c= cident ( K_ASC | K_DESC )?
			{
			pushFollow(FOLLOW_cident_in_orderByClause2982);
			c=cident();
			state._fsp--;
			if (state.failed) return;
			// Parser.g:462:16: ( K_ASC | K_DESC )?
			int alt38=3;
			int LA38_0 = input.LA(1);
			if ( (LA38_0==K_ASC) ) {
				alt38=1;
			}
			else if ( (LA38_0==K_DESC) ) {
				alt38=2;
			}
			switch (alt38) {
				case 1 :
					// Parser.g:462:17: K_ASC
					{
					match(input,K_ASC,FOLLOW_K_ASC_in_orderByClause2985); if (state.failed) return;
					}
					break;
				case 2 :
					// Parser.g:462:25: K_DESC
					{
					match(input,K_DESC,FOLLOW_K_DESC_in_orderByClause2989); if (state.failed) return;
					if ( state.backtracking==0 ) { reversed = true; }
					}
					break;

			}

			if ( state.backtracking==0 ) { orderings.put(c, reversed); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "orderByClause"



	// $ANTLR start "groupByClause"
	// Parser.g:465:1: groupByClause[List<ColumnMetadata.Raw> groups] : c= cident ;
	public final void groupByClause(List<ColumnMetadata.Raw> groups) throws RecognitionException {
		ColumnMetadata.Raw c =null;

		try {
			// Parser.g:466:5: (c= cident )
			// Parser.g:466:7: c= cident
			{
			pushFollow(FOLLOW_cident_in_groupByClause3015);
			c=cident();
			state._fsp--;
			if (state.failed) return;
			if ( state.backtracking==0 ) { groups.add(c); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "groupByClause"



	// $ANTLR start "insertStatement"
	// Parser.g:475:1: insertStatement returns [ModificationStatement.Parsed expr] : K_INSERT K_INTO cf= columnFamilyName (st1= normalInsertStatement[cf] | K_JSON st2= jsonInsertStatement[cf] ) ;
	public final ModificationStatement.Parsed insertStatement() throws RecognitionException {
		ModificationStatement.Parsed expr = null;


		CFName cf =null;
		UpdateStatement.ParsedInsert st1 =null;
		UpdateStatement.ParsedInsertJson st2 =null;

		try {
			// Parser.g:476:5: ( K_INSERT K_INTO cf= columnFamilyName (st1= normalInsertStatement[cf] | K_JSON st2= jsonInsertStatement[cf] ) )
			// Parser.g:476:7: K_INSERT K_INTO cf= columnFamilyName (st1= normalInsertStatement[cf] | K_JSON st2= jsonInsertStatement[cf] )
			{
			match(input,K_INSERT,FOLLOW_K_INSERT_in_insertStatement3040); if (state.failed) return expr;
			match(input,K_INTO,FOLLOW_K_INTO_in_insertStatement3042); if (state.failed) return expr;
			pushFollow(FOLLOW_columnFamilyName_in_insertStatement3046);
			cf=columnFamilyName();
			state._fsp--;
			if (state.failed) return expr;
			// Parser.g:477:9: (st1= normalInsertStatement[cf] | K_JSON st2= jsonInsertStatement[cf] )
			int alt39=2;
			int LA39_0 = input.LA(1);
			if ( (LA39_0==187) ) {
				alt39=1;
			}
			else if ( (LA39_0==K_JSON) ) {
				alt39=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return expr;}
				NoViableAltException nvae =
					new NoViableAltException("", 39, 0, input);
				throw nvae;
			}

			switch (alt39) {
				case 1 :
					// Parser.g:477:11: st1= normalInsertStatement[cf]
					{
					pushFollow(FOLLOW_normalInsertStatement_in_insertStatement3060);
					st1=normalInsertStatement(cf);
					state._fsp--;
					if (state.failed) return expr;
					if ( state.backtracking==0 ) { expr = st1; }
					}
					break;
				case 2 :
					// Parser.g:478:11: K_JSON st2= jsonInsertStatement[cf]
					{
					match(input,K_JSON,FOLLOW_K_JSON_in_insertStatement3075); if (state.failed) return expr;
					pushFollow(FOLLOW_jsonInsertStatement_in_insertStatement3079);
					st2=jsonInsertStatement(cf);
					state._fsp--;
					if (state.failed) return expr;
					if ( state.backtracking==0 ) { expr = st2; }
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "insertStatement"



	// $ANTLR start "normalInsertStatement"
	// Parser.g:481:1: normalInsertStatement[CFName cf] returns [UpdateStatement.ParsedInsert expr] : '(' c1= cident ( ',' cn= cident )* ')' K_VALUES '(' v1= term ( ',' vn= term )* ')' ( K_IF K_NOT K_EXISTS )? ( usingClause[attrs] )? ;
	public final UpdateStatement.ParsedInsert normalInsertStatement(CFName cf) throws RecognitionException {
		UpdateStatement.ParsedInsert expr = null;


		ColumnMetadata.Raw c1 =null;
		ColumnMetadata.Raw cn =null;
		Term.Raw v1 =null;
		Term.Raw vn =null;


		        Attributes.Raw attrs = new Attributes.Raw();
		        List<ColumnMetadata.Raw> columnNames  = new ArrayList<>();
		        List<Term.Raw> values = new ArrayList<>();
		        boolean ifNotExists = false;
		    
		try {
			// Parser.g:488:5: ( '(' c1= cident ( ',' cn= cident )* ')' K_VALUES '(' v1= term ( ',' vn= term )* ')' ( K_IF K_NOT K_EXISTS )? ( usingClause[attrs] )? )
			// Parser.g:488:7: '(' c1= cident ( ',' cn= cident )* ')' K_VALUES '(' v1= term ( ',' vn= term )* ')' ( K_IF K_NOT K_EXISTS )? ( usingClause[attrs] )?
			{
			match(input,187,FOLLOW_187_in_normalInsertStatement3115); if (state.failed) return expr;
			pushFollow(FOLLOW_cident_in_normalInsertStatement3119);
			c1=cident();
			state._fsp--;
			if (state.failed) return expr;
			if ( state.backtracking==0 ) { columnNames.add(c1); }
			// Parser.g:488:47: ( ',' cn= cident )*
			loop40:
			while (true) {
				int alt40=2;
				int LA40_0 = input.LA(1);
				if ( (LA40_0==191) ) {
					alt40=1;
				}

				switch (alt40) {
				case 1 :
					// Parser.g:488:49: ',' cn= cident
					{
					match(input,191,FOLLOW_191_in_normalInsertStatement3126); if (state.failed) return expr;
					pushFollow(FOLLOW_cident_in_normalInsertStatement3130);
					cn=cident();
					state._fsp--;
					if (state.failed) return expr;
					if ( state.backtracking==0 ) { columnNames.add(cn); }
					}
					break;

				default :
					break loop40;
				}
			}

			match(input,188,FOLLOW_188_in_normalInsertStatement3137); if (state.failed) return expr;
			match(input,K_VALUES,FOLLOW_K_VALUES_in_normalInsertStatement3145); if (state.failed) return expr;
			match(input,187,FOLLOW_187_in_normalInsertStatement3153); if (state.failed) return expr;
			pushFollow(FOLLOW_term_in_normalInsertStatement3157);
			v1=term();
			state._fsp--;
			if (state.failed) return expr;
			if ( state.backtracking==0 ) { values.add(v1); }
			// Parser.g:490:39: ( ',' vn= term )*
			loop41:
			while (true) {
				int alt41=2;
				int LA41_0 = input.LA(1);
				if ( (LA41_0==191) ) {
					alt41=1;
				}

				switch (alt41) {
				case 1 :
					// Parser.g:490:41: ',' vn= term
					{
					match(input,191,FOLLOW_191_in_normalInsertStatement3163); if (state.failed) return expr;
					pushFollow(FOLLOW_term_in_normalInsertStatement3167);
					vn=term();
					state._fsp--;
					if (state.failed) return expr;
					if ( state.backtracking==0 ) { values.add(vn); }
					}
					break;

				default :
					break loop41;
				}
			}

			match(input,188,FOLLOW_188_in_normalInsertStatement3174); if (state.failed) return expr;
			// Parser.g:491:7: ( K_IF K_NOT K_EXISTS )?
			int alt42=2;
			int LA42_0 = input.LA(1);
			if ( (LA42_0==K_IF) ) {
				alt42=1;
			}
			switch (alt42) {
				case 1 :
					// Parser.g:491:9: K_IF K_NOT K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_normalInsertStatement3184); if (state.failed) return expr;
					match(input,K_NOT,FOLLOW_K_NOT_in_normalInsertStatement3186); if (state.failed) return expr;
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_normalInsertStatement3188); if (state.failed) return expr;
					if ( state.backtracking==0 ) { ifNotExists = true; }
					}
					break;

			}

			// Parser.g:492:7: ( usingClause[attrs] )?
			int alt43=2;
			int LA43_0 = input.LA(1);
			if ( (LA43_0==K_USING) ) {
				alt43=1;
			}
			switch (alt43) {
				case 1 :
					// Parser.g:492:9: usingClause[attrs]
					{
					pushFollow(FOLLOW_usingClause_in_normalInsertStatement3203);
					usingClause(attrs);
					state._fsp--;
					if (state.failed) return expr;
					}
					break;

			}

			if ( state.backtracking==0 ) {
			          expr = new UpdateStatement.ParsedInsert(cf, attrs, columnNames, values, ifNotExists);
			      }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "normalInsertStatement"



	// $ANTLR start "jsonInsertStatement"
	// Parser.g:498:1: jsonInsertStatement[CFName cf] returns [UpdateStatement.ParsedInsertJson expr] : val= jsonValue ( K_DEFAULT ( K_NULL | ( K_UNSET ) ) )? ( K_IF K_NOT K_EXISTS )? ( usingClause[attrs] )? ;
	public final UpdateStatement.ParsedInsertJson jsonInsertStatement(CFName cf) throws RecognitionException {
		UpdateStatement.ParsedInsertJson expr = null;


		Json.Raw val =null;


		        Attributes.Raw attrs = new Attributes.Raw();
		        boolean ifNotExists = false;
		        boolean defaultUnset = false;
		    
		try {
			// Parser.g:504:5: (val= jsonValue ( K_DEFAULT ( K_NULL | ( K_UNSET ) ) )? ( K_IF K_NOT K_EXISTS )? ( usingClause[attrs] )? )
			// Parser.g:504:7: val= jsonValue ( K_DEFAULT ( K_NULL | ( K_UNSET ) ) )? ( K_IF K_NOT K_EXISTS )? ( usingClause[attrs] )?
			{
			pushFollow(FOLLOW_jsonValue_in_jsonInsertStatement3249);
			val=jsonValue();
			state._fsp--;
			if (state.failed) return expr;
			// Parser.g:505:7: ( K_DEFAULT ( K_NULL | ( K_UNSET ) ) )?
			int alt45=2;
			int LA45_0 = input.LA(1);
			if ( (LA45_0==K_DEFAULT) ) {
				alt45=1;
			}
			switch (alt45) {
				case 1 :
					// Parser.g:505:9: K_DEFAULT ( K_NULL | ( K_UNSET ) )
					{
					match(input,K_DEFAULT,FOLLOW_K_DEFAULT_in_jsonInsertStatement3259); if (state.failed) return expr;
					// Parser.g:505:19: ( K_NULL | ( K_UNSET ) )
					int alt44=2;
					int LA44_0 = input.LA(1);
					if ( (LA44_0==K_NULL) ) {
						alt44=1;
					}
					else if ( (LA44_0==K_UNSET) ) {
						alt44=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return expr;}
						NoViableAltException nvae =
							new NoViableAltException("", 44, 0, input);
						throw nvae;
					}

					switch (alt44) {
						case 1 :
							// Parser.g:505:21: K_NULL
							{
							match(input,K_NULL,FOLLOW_K_NULL_in_jsonInsertStatement3263); if (state.failed) return expr;
							}
							break;
						case 2 :
							// Parser.g:505:30: ( K_UNSET )
							{
							// Parser.g:505:30: ( K_UNSET )
							// Parser.g:505:32: K_UNSET
							{
							if ( state.backtracking==0 ) { defaultUnset = true; }
							match(input,K_UNSET,FOLLOW_K_UNSET_in_jsonInsertStatement3271); if (state.failed) return expr;
							}

							}
							break;

					}

					}
					break;

			}

			// Parser.g:506:7: ( K_IF K_NOT K_EXISTS )?
			int alt46=2;
			int LA46_0 = input.LA(1);
			if ( (LA46_0==K_IF) ) {
				alt46=1;
			}
			switch (alt46) {
				case 1 :
					// Parser.g:506:9: K_IF K_NOT K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_jsonInsertStatement3287); if (state.failed) return expr;
					match(input,K_NOT,FOLLOW_K_NOT_in_jsonInsertStatement3289); if (state.failed) return expr;
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_jsonInsertStatement3291); if (state.failed) return expr;
					if ( state.backtracking==0 ) { ifNotExists = true; }
					}
					break;

			}

			// Parser.g:507:7: ( usingClause[attrs] )?
			int alt47=2;
			int LA47_0 = input.LA(1);
			if ( (LA47_0==K_USING) ) {
				alt47=1;
			}
			switch (alt47) {
				case 1 :
					// Parser.g:507:9: usingClause[attrs]
					{
					pushFollow(FOLLOW_usingClause_in_jsonInsertStatement3306);
					usingClause(attrs);
					state._fsp--;
					if (state.failed) return expr;
					}
					break;

			}

			if ( state.backtracking==0 ) {
			          expr = new UpdateStatement.ParsedInsertJson(cf, attrs, val, defaultUnset, ifNotExists);
			      }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "jsonInsertStatement"



	// $ANTLR start "jsonValue"
	// Parser.g:513:1: jsonValue returns [Json.Raw value] : (s= STRING_LITERAL | ':' id= noncol_ident | QMARK );
	public final Json.Raw jsonValue() throws RecognitionException {
		Json.Raw value = null;


		Token s=null;
		ColumnIdentifier id =null;

		try {
			// Parser.g:514:5: (s= STRING_LITERAL | ':' id= noncol_ident | QMARK )
			int alt48=3;
			switch ( input.LA(1) ) {
			case STRING_LITERAL:
				{
				alt48=1;
				}
				break;
			case 196:
				{
				alt48=2;
				}
				break;
			case QMARK:
				{
				alt48=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return value;}
				NoViableAltException nvae =
					new NoViableAltException("", 48, 0, input);
				throw nvae;
			}
			switch (alt48) {
				case 1 :
					// Parser.g:514:7: s= STRING_LITERAL
					{
					s=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_jsonValue3341); if (state.failed) return value;
					if ( state.backtracking==0 ) { value = new Json.Literal((s!=null?s.getText():null)); }
					}
					break;
				case 2 :
					// Parser.g:515:7: ':' id= noncol_ident
					{
					match(input,196,FOLLOW_196_in_jsonValue3351); if (state.failed) return value;
					pushFollow(FOLLOW_noncol_ident_in_jsonValue3355);
					id=noncol_ident();
					state._fsp--;
					if (state.failed) return value;
					if ( state.backtracking==0 ) { value = newJsonBindVariables(id); }
					}
					break;
				case 3 :
					// Parser.g:516:7: QMARK
					{
					match(input,QMARK,FOLLOW_QMARK_in_jsonValue3369); if (state.failed) return value;
					if ( state.backtracking==0 ) { value = newJsonBindVariables(null); }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "jsonValue"



	// $ANTLR start "usingClause"
	// Parser.g:519:1: usingClause[Attributes.Raw attrs] : K_USING usingClauseObjective[attrs] ( K_AND usingClauseObjective[attrs] )* ;
	public final void usingClause(Attributes.Raw attrs) throws RecognitionException {
		try {
			// Parser.g:520:5: ( K_USING usingClauseObjective[attrs] ( K_AND usingClauseObjective[attrs] )* )
			// Parser.g:520:7: K_USING usingClauseObjective[attrs] ( K_AND usingClauseObjective[attrs] )*
			{
			match(input,K_USING,FOLLOW_K_USING_in_usingClause3400); if (state.failed) return;
			pushFollow(FOLLOW_usingClauseObjective_in_usingClause3402);
			usingClauseObjective(attrs);
			state._fsp--;
			if (state.failed) return;
			// Parser.g:520:43: ( K_AND usingClauseObjective[attrs] )*
			loop49:
			while (true) {
				int alt49=2;
				int LA49_0 = input.LA(1);
				if ( (LA49_0==K_AND) ) {
					alt49=1;
				}

				switch (alt49) {
				case 1 :
					// Parser.g:520:45: K_AND usingClauseObjective[attrs]
					{
					match(input,K_AND,FOLLOW_K_AND_in_usingClause3407); if (state.failed) return;
					pushFollow(FOLLOW_usingClauseObjective_in_usingClause3409);
					usingClauseObjective(attrs);
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop49;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "usingClause"



	// $ANTLR start "usingClauseObjective"
	// Parser.g:523:1: usingClauseObjective[Attributes.Raw attrs] : ( K_TIMESTAMP ts= intValue | K_TTL t= intValue );
	public final void usingClauseObjective(Attributes.Raw attrs) throws RecognitionException {
		Term.Raw ts =null;
		Term.Raw t =null;

		try {
			// Parser.g:524:5: ( K_TIMESTAMP ts= intValue | K_TTL t= intValue )
			int alt50=2;
			int LA50_0 = input.LA(1);
			if ( (LA50_0==K_TIMESTAMP) ) {
				alt50=1;
			}
			else if ( (LA50_0==K_TTL) ) {
				alt50=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 50, 0, input);
				throw nvae;
			}

			switch (alt50) {
				case 1 :
					// Parser.g:524:7: K_TIMESTAMP ts= intValue
					{
					match(input,K_TIMESTAMP,FOLLOW_K_TIMESTAMP_in_usingClauseObjective3431); if (state.failed) return;
					pushFollow(FOLLOW_intValue_in_usingClauseObjective3435);
					ts=intValue();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) { attrs.timestamp = ts; }
					}
					break;
				case 2 :
					// Parser.g:525:7: K_TTL t= intValue
					{
					match(input,K_TTL,FOLLOW_K_TTL_in_usingClauseObjective3445); if (state.failed) return;
					pushFollow(FOLLOW_intValue_in_usingClauseObjective3449);
					t=intValue();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) { attrs.timeToLive = t; }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "usingClauseObjective"



	// $ANTLR start "updateStatement"
	// Parser.g:535:1: updateStatement returns [UpdateStatement.ParsedUpdate expr] : K_UPDATE cf= columnFamilyName ( usingClause[attrs] )? K_SET columnOperation[operations] ( ',' columnOperation[operations] )* K_WHERE wclause= whereClause ( K_IF ( K_EXISTS |conditions= updateConditions ) )? ;
	public final UpdateStatement.ParsedUpdate updateStatement() throws RecognitionException {
		UpdateStatement.ParsedUpdate expr = null;


		CFName cf =null;
		WhereClause.Builder wclause =null;
		List<Pair<ColumnMetadata.Raw, ColumnCondition.Raw>> conditions =null;


		        Attributes.Raw attrs = new Attributes.Raw();
		        List<Pair<ColumnMetadata.Raw, Operation.RawUpdate>> operations = new ArrayList<>();
		        boolean ifExists = false;
		    
		try {
			// Parser.g:541:5: ( K_UPDATE cf= columnFamilyName ( usingClause[attrs] )? K_SET columnOperation[operations] ( ',' columnOperation[operations] )* K_WHERE wclause= whereClause ( K_IF ( K_EXISTS |conditions= updateConditions ) )? )
			// Parser.g:541:7: K_UPDATE cf= columnFamilyName ( usingClause[attrs] )? K_SET columnOperation[operations] ( ',' columnOperation[operations] )* K_WHERE wclause= whereClause ( K_IF ( K_EXISTS |conditions= updateConditions ) )?
			{
			match(input,K_UPDATE,FOLLOW_K_UPDATE_in_updateStatement3483); if (state.failed) return expr;
			pushFollow(FOLLOW_columnFamilyName_in_updateStatement3487);
			cf=columnFamilyName();
			state._fsp--;
			if (state.failed) return expr;
			// Parser.g:542:7: ( usingClause[attrs] )?
			int alt51=2;
			int LA51_0 = input.LA(1);
			if ( (LA51_0==K_USING) ) {
				alt51=1;
			}
			switch (alt51) {
				case 1 :
					// Parser.g:542:9: usingClause[attrs]
					{
					pushFollow(FOLLOW_usingClause_in_updateStatement3497);
					usingClause(attrs);
					state._fsp--;
					if (state.failed) return expr;
					}
					break;

			}

			match(input,K_SET,FOLLOW_K_SET_in_updateStatement3509); if (state.failed) return expr;
			pushFollow(FOLLOW_columnOperation_in_updateStatement3511);
			columnOperation(operations);
			state._fsp--;
			if (state.failed) return expr;
			// Parser.g:543:41: ( ',' columnOperation[operations] )*
			loop52:
			while (true) {
				int alt52=2;
				int LA52_0 = input.LA(1);
				if ( (LA52_0==191) ) {
					alt52=1;
				}

				switch (alt52) {
				case 1 :
					// Parser.g:543:42: ',' columnOperation[operations]
					{
					match(input,191,FOLLOW_191_in_updateStatement3515); if (state.failed) return expr;
					pushFollow(FOLLOW_columnOperation_in_updateStatement3517);
					columnOperation(operations);
					state._fsp--;
					if (state.failed) return expr;
					}
					break;

				default :
					break loop52;
				}
			}

			match(input,K_WHERE,FOLLOW_K_WHERE_in_updateStatement3528); if (state.failed) return expr;
			pushFollow(FOLLOW_whereClause_in_updateStatement3532);
			wclause=whereClause();
			state._fsp--;
			if (state.failed) return expr;
			// Parser.g:545:7: ( K_IF ( K_EXISTS |conditions= updateConditions ) )?
			int alt54=2;
			int LA54_0 = input.LA(1);
			if ( (LA54_0==K_IF) ) {
				alt54=1;
			}
			switch (alt54) {
				case 1 :
					// Parser.g:545:9: K_IF ( K_EXISTS |conditions= updateConditions )
					{
					match(input,K_IF,FOLLOW_K_IF_in_updateStatement3542); if (state.failed) return expr;
					// Parser.g:545:14: ( K_EXISTS |conditions= updateConditions )
					int alt53=2;
					int LA53_0 = input.LA(1);
					if ( (LA53_0==K_EXISTS) ) {
						int LA53_1 = input.LA(2);
						if ( (LA53_1==EOF||LA53_1==K_APPLY||LA53_1==K_DELETE||LA53_1==K_INSERT||LA53_1==K_UPDATE||LA53_1==197) ) {
							alt53=1;
						}
						else if ( (LA53_1==K_IN||LA53_1==185||LA53_1==194||(LA53_1 >= 198 && LA53_1 <= 203)) ) {
							alt53=2;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return expr;}
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 53, 1, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}
					else if ( (LA53_0==IDENT||(LA53_0 >= K_AGGREGATE && LA53_0 <= K_ALL)||LA53_0==K_AS||LA53_0==K_ASCII||(LA53_0 >= K_BIGINT && LA53_0 <= K_BOOLEAN)||(LA53_0 >= K_CALLED && LA53_0 <= K_CLUSTERING)||(LA53_0 >= K_COMPACT && LA53_0 <= K_COUNTER)||(LA53_0 >= K_CUSTOM && LA53_0 <= K_DECIMAL)||(LA53_0 >= K_DISTINCT && LA53_0 <= K_DOUBLE)||LA53_0==K_DURATION||(LA53_0 >= K_FILTERING && LA53_0 <= K_FLOAT)||LA53_0==K_FROZEN||(LA53_0 >= K_FUNCTION && LA53_0 <= K_FUNCTIONS)||LA53_0==K_GROUP||(LA53_0 >= K_INET && LA53_0 <= K_INPUT)||LA53_0==K_INT||(LA53_0 >= K_JSON && LA53_0 <= K_KEYS)||(LA53_0 >= K_KEYSPACES && LA53_0 <= K_LIKE)||(LA53_0 >= K_LIST && LA53_0 <= K_MAP)||LA53_0==K_NOLOGIN||LA53_0==K_NOSUPERUSER||LA53_0==K_OPTIONS||(LA53_0 >= K_PARTITION && LA53_0 <= K_PERMISSIONS)||LA53_0==K_RETURNS||(LA53_0 >= K_ROLE && LA53_0 <= K_ROLES)||(LA53_0 >= K_SFUNC && LA53_0 <= K_TINYINT)||LA53_0==K_TRIGGER||(LA53_0 >= K_TTL && LA53_0 <= K_TYPE)||(LA53_0 >= K_USER && LA53_0 <= K_USERS)||(LA53_0 >= K_UUID && LA53_0 <= K_VARINT)||LA53_0==K_WRITETIME||LA53_0==QUOTED_NAME) ) {
						alt53=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return expr;}
						NoViableAltException nvae =
							new NoViableAltException("", 53, 0, input);
						throw nvae;
					}

					switch (alt53) {
						case 1 :
							// Parser.g:545:16: K_EXISTS
							{
							match(input,K_EXISTS,FOLLOW_K_EXISTS_in_updateStatement3546); if (state.failed) return expr;
							if ( state.backtracking==0 ) { ifExists = true; }
							}
							break;
						case 2 :
							// Parser.g:545:48: conditions= updateConditions
							{
							pushFollow(FOLLOW_updateConditions_in_updateStatement3554);
							conditions=updateConditions();
							state._fsp--;
							if (state.failed) return expr;
							}
							break;

					}

					}
					break;

			}

			if ( state.backtracking==0 ) {
			          expr = new UpdateStatement.ParsedUpdate(cf,
			                                                   attrs,
			                                                   operations,
			                                                   wclause.build(),
			                                                   conditions == null ? Collections.<Pair<ColumnMetadata.Raw, ColumnCondition.Raw>>emptyList() : conditions,
			                                                   ifExists);
			     }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "updateStatement"



	// $ANTLR start "updateConditions"
	// Parser.g:556:1: updateConditions returns [List<Pair<ColumnMetadata.Raw, ColumnCondition.Raw>> conditions] : columnCondition[conditions] ( K_AND columnCondition[conditions] )* ;
	public final List<Pair<ColumnMetadata.Raw, ColumnCondition.Raw>> updateConditions() throws RecognitionException {
		List<Pair<ColumnMetadata.Raw, ColumnCondition.Raw>> conditions = null;


		 conditions = new ArrayList<Pair<ColumnMetadata.Raw, ColumnCondition.Raw>>(); 
		try {
			// Parser.g:558:5: ( columnCondition[conditions] ( K_AND columnCondition[conditions] )* )
			// Parser.g:558:7: columnCondition[conditions] ( K_AND columnCondition[conditions] )*
			{
			pushFollow(FOLLOW_columnCondition_in_updateConditions3596);
			columnCondition(conditions);
			state._fsp--;
			if (state.failed) return conditions;
			// Parser.g:558:35: ( K_AND columnCondition[conditions] )*
			loop55:
			while (true) {
				int alt55=2;
				int LA55_0 = input.LA(1);
				if ( (LA55_0==K_AND) ) {
					alt55=1;
				}

				switch (alt55) {
				case 1 :
					// Parser.g:558:37: K_AND columnCondition[conditions]
					{
					match(input,K_AND,FOLLOW_K_AND_in_updateConditions3601); if (state.failed) return conditions;
					pushFollow(FOLLOW_columnCondition_in_updateConditions3603);
					columnCondition(conditions);
					state._fsp--;
					if (state.failed) return conditions;
					}
					break;

				default :
					break loop55;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return conditions;
	}
	// $ANTLR end "updateConditions"



	// $ANTLR start "deleteStatement"
	// Parser.g:569:1: deleteStatement returns [DeleteStatement.Parsed expr] : K_DELETE (dels= deleteSelection )? K_FROM cf= columnFamilyName ( usingClauseDelete[attrs] )? K_WHERE wclause= whereClause ( K_IF ( K_EXISTS |conditions= updateConditions ) )? ;
	public final DeleteStatement.Parsed deleteStatement() throws RecognitionException {
		DeleteStatement.Parsed expr = null;


		List<Operation.RawDeletion> dels =null;
		CFName cf =null;
		WhereClause.Builder wclause =null;
		List<Pair<ColumnMetadata.Raw, ColumnCondition.Raw>> conditions =null;


		        Attributes.Raw attrs = new Attributes.Raw();
		        List<Operation.RawDeletion> columnDeletions = Collections.emptyList();
		        boolean ifExists = false;
		    
		try {
			// Parser.g:575:5: ( K_DELETE (dels= deleteSelection )? K_FROM cf= columnFamilyName ( usingClauseDelete[attrs] )? K_WHERE wclause= whereClause ( K_IF ( K_EXISTS |conditions= updateConditions ) )? )
			// Parser.g:575:7: K_DELETE (dels= deleteSelection )? K_FROM cf= columnFamilyName ( usingClauseDelete[attrs] )? K_WHERE wclause= whereClause ( K_IF ( K_EXISTS |conditions= updateConditions ) )?
			{
			match(input,K_DELETE,FOLLOW_K_DELETE_in_deleteStatement3640); if (state.failed) return expr;
			// Parser.g:575:16: (dels= deleteSelection )?
			int alt56=2;
			int LA56_0 = input.LA(1);
			if ( (LA56_0==IDENT||(LA56_0 >= K_AGGREGATE && LA56_0 <= K_ALL)||LA56_0==K_AS||LA56_0==K_ASCII||(LA56_0 >= K_BIGINT && LA56_0 <= K_BOOLEAN)||(LA56_0 >= K_CALLED && LA56_0 <= K_CLUSTERING)||(LA56_0 >= K_COMPACT && LA56_0 <= K_COUNTER)||(LA56_0 >= K_CUSTOM && LA56_0 <= K_DECIMAL)||(LA56_0 >= K_DISTINCT && LA56_0 <= K_DOUBLE)||LA56_0==K_DURATION||(LA56_0 >= K_EXISTS && LA56_0 <= K_FLOAT)||LA56_0==K_FROZEN||(LA56_0 >= K_FUNCTION && LA56_0 <= K_FUNCTIONS)||LA56_0==K_GROUP||(LA56_0 >= K_INET && LA56_0 <= K_INPUT)||LA56_0==K_INT||(LA56_0 >= K_JSON && LA56_0 <= K_KEYS)||(LA56_0 >= K_KEYSPACES && LA56_0 <= K_LIKE)||(LA56_0 >= K_LIST && LA56_0 <= K_MAP)||LA56_0==K_NOLOGIN||LA56_0==K_NOSUPERUSER||LA56_0==K_OPTIONS||(LA56_0 >= K_PARTITION && LA56_0 <= K_PERMISSIONS)||LA56_0==K_RETURNS||(LA56_0 >= K_ROLE && LA56_0 <= K_ROLES)||(LA56_0 >= K_SFUNC && LA56_0 <= K_TINYINT)||LA56_0==K_TRIGGER||(LA56_0 >= K_TTL && LA56_0 <= K_TYPE)||(LA56_0 >= K_USER && LA56_0 <= K_USERS)||(LA56_0 >= K_UUID && LA56_0 <= K_VARINT)||LA56_0==K_WRITETIME||LA56_0==QUOTED_NAME) ) {
				alt56=1;
			}
			switch (alt56) {
				case 1 :
					// Parser.g:575:18: dels= deleteSelection
					{
					pushFollow(FOLLOW_deleteSelection_in_deleteStatement3646);
					dels=deleteSelection();
					state._fsp--;
					if (state.failed) return expr;
					if ( state.backtracking==0 ) { columnDeletions = dels; }
					}
					break;

			}

			match(input,K_FROM,FOLLOW_K_FROM_in_deleteStatement3659); if (state.failed) return expr;
			pushFollow(FOLLOW_columnFamilyName_in_deleteStatement3663);
			cf=columnFamilyName();
			state._fsp--;
			if (state.failed) return expr;
			// Parser.g:577:7: ( usingClauseDelete[attrs] )?
			int alt57=2;
			int LA57_0 = input.LA(1);
			if ( (LA57_0==K_USING) ) {
				alt57=1;
			}
			switch (alt57) {
				case 1 :
					// Parser.g:577:9: usingClauseDelete[attrs]
					{
					pushFollow(FOLLOW_usingClauseDelete_in_deleteStatement3673);
					usingClauseDelete(attrs);
					state._fsp--;
					if (state.failed) return expr;
					}
					break;

			}

			match(input,K_WHERE,FOLLOW_K_WHERE_in_deleteStatement3685); if (state.failed) return expr;
			pushFollow(FOLLOW_whereClause_in_deleteStatement3689);
			wclause=whereClause();
			state._fsp--;
			if (state.failed) return expr;
			// Parser.g:579:7: ( K_IF ( K_EXISTS |conditions= updateConditions ) )?
			int alt59=2;
			int LA59_0 = input.LA(1);
			if ( (LA59_0==K_IF) ) {
				alt59=1;
			}
			switch (alt59) {
				case 1 :
					// Parser.g:579:9: K_IF ( K_EXISTS |conditions= updateConditions )
					{
					match(input,K_IF,FOLLOW_K_IF_in_deleteStatement3699); if (state.failed) return expr;
					// Parser.g:579:14: ( K_EXISTS |conditions= updateConditions )
					int alt58=2;
					int LA58_0 = input.LA(1);
					if ( (LA58_0==K_EXISTS) ) {
						int LA58_1 = input.LA(2);
						if ( (LA58_1==EOF||LA58_1==K_APPLY||LA58_1==K_DELETE||LA58_1==K_INSERT||LA58_1==K_UPDATE||LA58_1==197) ) {
							alt58=1;
						}
						else if ( (LA58_1==K_IN||LA58_1==185||LA58_1==194||(LA58_1 >= 198 && LA58_1 <= 203)) ) {
							alt58=2;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return expr;}
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 58, 1, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}
					else if ( (LA58_0==IDENT||(LA58_0 >= K_AGGREGATE && LA58_0 <= K_ALL)||LA58_0==K_AS||LA58_0==K_ASCII||(LA58_0 >= K_BIGINT && LA58_0 <= K_BOOLEAN)||(LA58_0 >= K_CALLED && LA58_0 <= K_CLUSTERING)||(LA58_0 >= K_COMPACT && LA58_0 <= K_COUNTER)||(LA58_0 >= K_CUSTOM && LA58_0 <= K_DECIMAL)||(LA58_0 >= K_DISTINCT && LA58_0 <= K_DOUBLE)||LA58_0==K_DURATION||(LA58_0 >= K_FILTERING && LA58_0 <= K_FLOAT)||LA58_0==K_FROZEN||(LA58_0 >= K_FUNCTION && LA58_0 <= K_FUNCTIONS)||LA58_0==K_GROUP||(LA58_0 >= K_INET && LA58_0 <= K_INPUT)||LA58_0==K_INT||(LA58_0 >= K_JSON && LA58_0 <= K_KEYS)||(LA58_0 >= K_KEYSPACES && LA58_0 <= K_LIKE)||(LA58_0 >= K_LIST && LA58_0 <= K_MAP)||LA58_0==K_NOLOGIN||LA58_0==K_NOSUPERUSER||LA58_0==K_OPTIONS||(LA58_0 >= K_PARTITION && LA58_0 <= K_PERMISSIONS)||LA58_0==K_RETURNS||(LA58_0 >= K_ROLE && LA58_0 <= K_ROLES)||(LA58_0 >= K_SFUNC && LA58_0 <= K_TINYINT)||LA58_0==K_TRIGGER||(LA58_0 >= K_TTL && LA58_0 <= K_TYPE)||(LA58_0 >= K_USER && LA58_0 <= K_USERS)||(LA58_0 >= K_UUID && LA58_0 <= K_VARINT)||LA58_0==K_WRITETIME||LA58_0==QUOTED_NAME) ) {
						alt58=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return expr;}
						NoViableAltException nvae =
							new NoViableAltException("", 58, 0, input);
						throw nvae;
					}

					switch (alt58) {
						case 1 :
							// Parser.g:579:16: K_EXISTS
							{
							match(input,K_EXISTS,FOLLOW_K_EXISTS_in_deleteStatement3703); if (state.failed) return expr;
							if ( state.backtracking==0 ) { ifExists = true; }
							}
							break;
						case 2 :
							// Parser.g:579:48: conditions= updateConditions
							{
							pushFollow(FOLLOW_updateConditions_in_deleteStatement3711);
							conditions=updateConditions();
							state._fsp--;
							if (state.failed) return expr;
							}
							break;

					}

					}
					break;

			}

			if ( state.backtracking==0 ) {
			          expr = new DeleteStatement.Parsed(cf,
			                                             attrs,
			                                             columnDeletions,
			                                             wclause.build(),
			                                             conditions == null ? Collections.<Pair<ColumnMetadata.Raw, ColumnCondition.Raw>>emptyList() : conditions,
			                                             ifExists);
			      }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "deleteStatement"



	// $ANTLR start "deleteSelection"
	// Parser.g:590:1: deleteSelection returns [List<Operation.RawDeletion> operations] :t1= deleteOp ( ',' tN= deleteOp )* ;
	public final List<Operation.RawDeletion> deleteSelection() throws RecognitionException {
		List<Operation.RawDeletion> operations = null;


		Operation.RawDeletion t1 =null;
		Operation.RawDeletion tN =null;

		try {
			// Parser.g:591:5: (t1= deleteOp ( ',' tN= deleteOp )* )
			// Parser.g:591:7: t1= deleteOp ( ',' tN= deleteOp )*
			{
			if ( state.backtracking==0 ) { operations = new ArrayList<Operation.RawDeletion>(); }
			pushFollow(FOLLOW_deleteOp_in_deleteSelection3758);
			t1=deleteOp();
			state._fsp--;
			if (state.failed) return operations;
			if ( state.backtracking==0 ) { operations.add(t1); }
			// Parser.g:593:11: ( ',' tN= deleteOp )*
			loop60:
			while (true) {
				int alt60=2;
				int LA60_0 = input.LA(1);
				if ( (LA60_0==191) ) {
					alt60=1;
				}

				switch (alt60) {
				case 1 :
					// Parser.g:593:12: ',' tN= deleteOp
					{
					match(input,191,FOLLOW_191_in_deleteSelection3773); if (state.failed) return operations;
					pushFollow(FOLLOW_deleteOp_in_deleteSelection3777);
					tN=deleteOp();
					state._fsp--;
					if (state.failed) return operations;
					if ( state.backtracking==0 ) { operations.add(tN); }
					}
					break;

				default :
					break loop60;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return operations;
	}
	// $ANTLR end "deleteSelection"



	// $ANTLR start "deleteOp"
	// Parser.g:596:1: deleteOp returns [Operation.RawDeletion op] : (c= cident |c= cident '[' t= term ']' |c= cident '.' field= fident );
	public final Operation.RawDeletion deleteOp() throws RecognitionException {
		Operation.RawDeletion op = null;


		ColumnMetadata.Raw c =null;
		Term.Raw t =null;
		FieldIdentifier field =null;

		try {
			// Parser.g:597:5: (c= cident |c= cident '[' t= term ']' |c= cident '.' field= fident )
			int alt61=3;
			alt61 = dfa61.predict(input);
			switch (alt61) {
				case 1 :
					// Parser.g:597:7: c= cident
					{
					pushFollow(FOLLOW_cident_in_deleteOp3804);
					c=cident();
					state._fsp--;
					if (state.failed) return op;
					if ( state.backtracking==0 ) { op = new Operation.ColumnDeletion(c); }
					}
					break;
				case 2 :
					// Parser.g:598:7: c= cident '[' t= term ']'
					{
					pushFollow(FOLLOW_cident_in_deleteOp3831);
					c=cident();
					state._fsp--;
					if (state.failed) return op;
					match(input,203,FOLLOW_203_in_deleteOp3833); if (state.failed) return op;
					pushFollow(FOLLOW_term_in_deleteOp3837);
					t=term();
					state._fsp--;
					if (state.failed) return op;
					match(input,205,FOLLOW_205_in_deleteOp3839); if (state.failed) return op;
					if ( state.backtracking==0 ) { op = new Operation.ElementDeletion(c, t); }
					}
					break;
				case 3 :
					// Parser.g:599:7: c= cident '.' field= fident
					{
					pushFollow(FOLLOW_cident_in_deleteOp3851);
					c=cident();
					state._fsp--;
					if (state.failed) return op;
					match(input,194,FOLLOW_194_in_deleteOp3853); if (state.failed) return op;
					pushFollow(FOLLOW_fident_in_deleteOp3857);
					field=fident();
					state._fsp--;
					if (state.failed) return op;
					if ( state.backtracking==0 ) { op = new Operation.FieldDeletion(c, field); }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return op;
	}
	// $ANTLR end "deleteOp"



	// $ANTLR start "usingClauseDelete"
	// Parser.g:602:1: usingClauseDelete[Attributes.Raw attrs] : K_USING K_TIMESTAMP ts= intValue ;
	public final void usingClauseDelete(Attributes.Raw attrs) throws RecognitionException {
		Term.Raw ts =null;

		try {
			// Parser.g:603:5: ( K_USING K_TIMESTAMP ts= intValue )
			// Parser.g:603:7: K_USING K_TIMESTAMP ts= intValue
			{
			match(input,K_USING,FOLLOW_K_USING_in_usingClauseDelete3877); if (state.failed) return;
			match(input,K_TIMESTAMP,FOLLOW_K_TIMESTAMP_in_usingClauseDelete3879); if (state.failed) return;
			pushFollow(FOLLOW_intValue_in_usingClauseDelete3883);
			ts=intValue();
			state._fsp--;
			if (state.failed) return;
			if ( state.backtracking==0 ) { attrs.timestamp = ts; }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "usingClauseDelete"



	// $ANTLR start "batchStatement"
	// Parser.g:630:1: batchStatement returns [BatchStatement.Parsed expr] : K_BEGIN ( K_UNLOGGED | K_COUNTER )? K_BATCH ( usingClause[attrs] )? (s= batchStatementObjective ( ';' )? )* K_APPLY K_BATCH ;
	public final BatchStatement.Parsed batchStatement() throws RecognitionException {
		BatchStatement.Parsed expr = null;


		ModificationStatement.Parsed s =null;


		        BatchStatement.Type type = BatchStatement.Type.LOGGED;
		        List<ModificationStatement.Parsed> statements = new ArrayList<ModificationStatement.Parsed>();
		        Attributes.Raw attrs = new Attributes.Raw();
		    
		try {
			// Parser.g:636:5: ( K_BEGIN ( K_UNLOGGED | K_COUNTER )? K_BATCH ( usingClause[attrs] )? (s= batchStatementObjective ( ';' )? )* K_APPLY K_BATCH )
			// Parser.g:636:7: K_BEGIN ( K_UNLOGGED | K_COUNTER )? K_BATCH ( usingClause[attrs] )? (s= batchStatementObjective ( ';' )? )* K_APPLY K_BATCH
			{
			match(input,K_BEGIN,FOLLOW_K_BEGIN_in_batchStatement3917); if (state.failed) return expr;
			// Parser.g:637:7: ( K_UNLOGGED | K_COUNTER )?
			int alt62=3;
			int LA62_0 = input.LA(1);
			if ( (LA62_0==K_UNLOGGED) ) {
				alt62=1;
			}
			else if ( (LA62_0==K_COUNTER) ) {
				alt62=2;
			}
			switch (alt62) {
				case 1 :
					// Parser.g:637:9: K_UNLOGGED
					{
					match(input,K_UNLOGGED,FOLLOW_K_UNLOGGED_in_batchStatement3927); if (state.failed) return expr;
					if ( state.backtracking==0 ) { type = BatchStatement.Type.UNLOGGED; }
					}
					break;
				case 2 :
					// Parser.g:637:63: K_COUNTER
					{
					match(input,K_COUNTER,FOLLOW_K_COUNTER_in_batchStatement3933); if (state.failed) return expr;
					if ( state.backtracking==0 ) { type = BatchStatement.Type.COUNTER; }
					}
					break;

			}

			match(input,K_BATCH,FOLLOW_K_BATCH_in_batchStatement3946); if (state.failed) return expr;
			// Parser.g:638:15: ( usingClause[attrs] )?
			int alt63=2;
			int LA63_0 = input.LA(1);
			if ( (LA63_0==K_USING) ) {
				alt63=1;
			}
			switch (alt63) {
				case 1 :
					// Parser.g:638:17: usingClause[attrs]
					{
					pushFollow(FOLLOW_usingClause_in_batchStatement3950);
					usingClause(attrs);
					state._fsp--;
					if (state.failed) return expr;
					}
					break;

			}

			// Parser.g:639:11: (s= batchStatementObjective ( ';' )? )*
			loop65:
			while (true) {
				int alt65=2;
				int LA65_0 = input.LA(1);
				if ( (LA65_0==K_DELETE||LA65_0==K_INSERT||LA65_0==K_UPDATE) ) {
					alt65=1;
				}

				switch (alt65) {
				case 1 :
					// Parser.g:639:13: s= batchStatementObjective ( ';' )?
					{
					pushFollow(FOLLOW_batchStatementObjective_in_batchStatement3970);
					s=batchStatementObjective();
					state._fsp--;
					if (state.failed) return expr;
					// Parser.g:639:39: ( ';' )?
					int alt64=2;
					int LA64_0 = input.LA(1);
					if ( (LA64_0==197) ) {
						alt64=1;
					}
					switch (alt64) {
						case 1 :
							// Parser.g:639:39: ';'
							{
							match(input,197,FOLLOW_197_in_batchStatement3972); if (state.failed) return expr;
							}
							break;

					}

					if ( state.backtracking==0 ) { statements.add(s); }
					}
					break;

				default :
					break loop65;
				}
			}

			match(input,K_APPLY,FOLLOW_K_APPLY_in_batchStatement3986); if (state.failed) return expr;
			match(input,K_BATCH,FOLLOW_K_BATCH_in_batchStatement3988); if (state.failed) return expr;
			if ( state.backtracking==0 ) {
			          expr = new BatchStatement.Parsed(type, attrs, statements);
			      }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "batchStatement"



	// $ANTLR start "batchStatementObjective"
	// Parser.g:646:1: batchStatementObjective returns [ModificationStatement.Parsed statement] : (i= insertStatement |u= updateStatement |d= deleteStatement );
	public final ModificationStatement.Parsed batchStatementObjective() throws RecognitionException {
		ModificationStatement.Parsed statement = null;


		ModificationStatement.Parsed i =null;
		UpdateStatement.ParsedUpdate u =null;
		DeleteStatement.Parsed d =null;

		try {
			// Parser.g:647:5: (i= insertStatement |u= updateStatement |d= deleteStatement )
			int alt66=3;
			switch ( input.LA(1) ) {
			case K_INSERT:
				{
				alt66=1;
				}
				break;
			case K_UPDATE:
				{
				alt66=2;
				}
				break;
			case K_DELETE:
				{
				alt66=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return statement;}
				NoViableAltException nvae =
					new NoViableAltException("", 66, 0, input);
				throw nvae;
			}
			switch (alt66) {
				case 1 :
					// Parser.g:647:7: i= insertStatement
					{
					pushFollow(FOLLOW_insertStatement_in_batchStatementObjective4019);
					i=insertStatement();
					state._fsp--;
					if (state.failed) return statement;
					if ( state.backtracking==0 ) { statement = i; }
					}
					break;
				case 2 :
					// Parser.g:648:7: u= updateStatement
					{
					pushFollow(FOLLOW_updateStatement_in_batchStatementObjective4032);
					u=updateStatement();
					state._fsp--;
					if (state.failed) return statement;
					if ( state.backtracking==0 ) { statement = u; }
					}
					break;
				case 3 :
					// Parser.g:649:7: d= deleteStatement
					{
					pushFollow(FOLLOW_deleteStatement_in_batchStatementObjective4045);
					d=deleteStatement();
					state._fsp--;
					if (state.failed) return statement;
					if ( state.backtracking==0 ) { statement = d; }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return statement;
	}
	// $ANTLR end "batchStatementObjective"



	// $ANTLR start "createAggregateStatement"
	// Parser.g:652:1: createAggregateStatement returns [CreateAggregateStatement expr] : K_CREATE ( K_OR K_REPLACE )? K_AGGREGATE ( K_IF K_NOT K_EXISTS )? fn= functionName '(' (v= comparatorType ( ',' v= comparatorType )* )? ')' K_SFUNC sfunc= allowedFunctionName K_STYPE stype= comparatorType ( K_FINALFUNC ffunc= allowedFunctionName )? ( K_INITCOND ival= term )? ;
	public final CreateAggregateStatement createAggregateStatement() throws RecognitionException {
		CreateAggregateStatement expr = null;


		FunctionName fn =null;
		CQL3Type.Raw v =null;
		String sfunc =null;
		CQL3Type.Raw stype =null;
		String ffunc =null;
		Term.Raw ival =null;


		        boolean orReplace = false;
		        boolean ifNotExists = false;

		        List<CQL3Type.Raw> argsTypes = new ArrayList<>();
		    
		try {
			// Parser.g:659:5: ( K_CREATE ( K_OR K_REPLACE )? K_AGGREGATE ( K_IF K_NOT K_EXISTS )? fn= functionName '(' (v= comparatorType ( ',' v= comparatorType )* )? ')' K_SFUNC sfunc= allowedFunctionName K_STYPE stype= comparatorType ( K_FINALFUNC ffunc= allowedFunctionName )? ( K_INITCOND ival= term )? )
			// Parser.g:659:7: K_CREATE ( K_OR K_REPLACE )? K_AGGREGATE ( K_IF K_NOT K_EXISTS )? fn= functionName '(' (v= comparatorType ( ',' v= comparatorType )* )? ')' K_SFUNC sfunc= allowedFunctionName K_STYPE stype= comparatorType ( K_FINALFUNC ffunc= allowedFunctionName )? ( K_INITCOND ival= term )?
			{
			match(input,K_CREATE,FOLLOW_K_CREATE_in_createAggregateStatement4078); if (state.failed) return expr;
			// Parser.g:659:16: ( K_OR K_REPLACE )?
			int alt67=2;
			int LA67_0 = input.LA(1);
			if ( (LA67_0==K_OR) ) {
				alt67=1;
			}
			switch (alt67) {
				case 1 :
					// Parser.g:659:17: K_OR K_REPLACE
					{
					match(input,K_OR,FOLLOW_K_OR_in_createAggregateStatement4081); if (state.failed) return expr;
					match(input,K_REPLACE,FOLLOW_K_REPLACE_in_createAggregateStatement4083); if (state.failed) return expr;
					if ( state.backtracking==0 ) { orReplace = true; }
					}
					break;

			}

			match(input,K_AGGREGATE,FOLLOW_K_AGGREGATE_in_createAggregateStatement4095); if (state.failed) return expr;
			// Parser.g:661:7: ( K_IF K_NOT K_EXISTS )?
			int alt68=2;
			int LA68_0 = input.LA(1);
			if ( (LA68_0==K_IF) ) {
				alt68=1;
			}
			switch (alt68) {
				case 1 :
					// Parser.g:661:8: K_IF K_NOT K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_createAggregateStatement4104); if (state.failed) return expr;
					match(input,K_NOT,FOLLOW_K_NOT_in_createAggregateStatement4106); if (state.failed) return expr;
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_createAggregateStatement4108); if (state.failed) return expr;
					if ( state.backtracking==0 ) { ifNotExists = true; }
					}
					break;

			}

			pushFollow(FOLLOW_functionName_in_createAggregateStatement4122);
			fn=functionName();
			state._fsp--;
			if (state.failed) return expr;
			match(input,187,FOLLOW_187_in_createAggregateStatement4130); if (state.failed) return expr;
			// Parser.g:664:9: (v= comparatorType ( ',' v= comparatorType )* )?
			int alt70=2;
			int LA70_0 = input.LA(1);
			if ( (LA70_0==IDENT||(LA70_0 >= K_AGGREGATE && LA70_0 <= K_ALL)||LA70_0==K_AS||LA70_0==K_ASCII||(LA70_0 >= K_BIGINT && LA70_0 <= K_BOOLEAN)||(LA70_0 >= K_CALLED && LA70_0 <= K_CLUSTERING)||(LA70_0 >= K_COMPACT && LA70_0 <= K_COUNTER)||(LA70_0 >= K_CUSTOM && LA70_0 <= K_DECIMAL)||(LA70_0 >= K_DISTINCT && LA70_0 <= K_DOUBLE)||LA70_0==K_DURATION||(LA70_0 >= K_EXISTS && LA70_0 <= K_FLOAT)||LA70_0==K_FROZEN||(LA70_0 >= K_FUNCTION && LA70_0 <= K_FUNCTIONS)||LA70_0==K_GROUP||(LA70_0 >= K_INET && LA70_0 <= K_INPUT)||LA70_0==K_INT||(LA70_0 >= K_JSON && LA70_0 <= K_KEYS)||(LA70_0 >= K_KEYSPACES && LA70_0 <= K_LIKE)||(LA70_0 >= K_LIST && LA70_0 <= K_MAP)||LA70_0==K_NOLOGIN||LA70_0==K_NOSUPERUSER||LA70_0==K_OPTIONS||(LA70_0 >= K_PARTITION && LA70_0 <= K_PERMISSIONS)||LA70_0==K_RETURNS||(LA70_0 >= K_ROLE && LA70_0 <= K_ROLES)||(LA70_0 >= K_SET && LA70_0 <= K_TINYINT)||LA70_0==K_TRIGGER||(LA70_0 >= K_TTL && LA70_0 <= K_TYPE)||(LA70_0 >= K_USER && LA70_0 <= K_USERS)||(LA70_0 >= K_UUID && LA70_0 <= K_VARINT)||LA70_0==K_WRITETIME||LA70_0==QUOTED_NAME||LA70_0==STRING_LITERAL) ) {
				alt70=1;
			}
			switch (alt70) {
				case 1 :
					// Parser.g:665:11: v= comparatorType ( ',' v= comparatorType )*
					{
					pushFollow(FOLLOW_comparatorType_in_createAggregateStatement4154);
					v=comparatorType();
					state._fsp--;
					if (state.failed) return expr;
					if ( state.backtracking==0 ) { argsTypes.add(v); }
					// Parser.g:666:11: ( ',' v= comparatorType )*
					loop69:
					while (true) {
						int alt69=2;
						int LA69_0 = input.LA(1);
						if ( (LA69_0==191) ) {
							alt69=1;
						}

						switch (alt69) {
						case 1 :
							// Parser.g:666:13: ',' v= comparatorType
							{
							match(input,191,FOLLOW_191_in_createAggregateStatement4170); if (state.failed) return expr;
							pushFollow(FOLLOW_comparatorType_in_createAggregateStatement4174);
							v=comparatorType();
							state._fsp--;
							if (state.failed) return expr;
							if ( state.backtracking==0 ) { argsTypes.add(v); }
							}
							break;

						default :
							break loop69;
						}
					}

					}
					break;

			}

			match(input,188,FOLLOW_188_in_createAggregateStatement4198); if (state.failed) return expr;
			match(input,K_SFUNC,FOLLOW_K_SFUNC_in_createAggregateStatement4206); if (state.failed) return expr;
			pushFollow(FOLLOW_allowedFunctionName_in_createAggregateStatement4212);
			sfunc=allowedFunctionName();
			state._fsp--;
			if (state.failed) return expr;
			match(input,K_STYPE,FOLLOW_K_STYPE_in_createAggregateStatement4220); if (state.failed) return expr;
			pushFollow(FOLLOW_comparatorType_in_createAggregateStatement4226);
			stype=comparatorType();
			state._fsp--;
			if (state.failed) return expr;
			// Parser.g:671:7: ( K_FINALFUNC ffunc= allowedFunctionName )?
			int alt71=2;
			int LA71_0 = input.LA(1);
			if ( (LA71_0==K_FINALFUNC) ) {
				alt71=1;
			}
			switch (alt71) {
				case 1 :
					// Parser.g:672:9: K_FINALFUNC ffunc= allowedFunctionName
					{
					match(input,K_FINALFUNC,FOLLOW_K_FINALFUNC_in_createAggregateStatement4244); if (state.failed) return expr;
					pushFollow(FOLLOW_allowedFunctionName_in_createAggregateStatement4250);
					ffunc=allowedFunctionName();
					state._fsp--;
					if (state.failed) return expr;
					}
					break;

			}

			// Parser.g:674:7: ( K_INITCOND ival= term )?
			int alt72=2;
			int LA72_0 = input.LA(1);
			if ( (LA72_0==K_INITCOND) ) {
				alt72=1;
			}
			switch (alt72) {
				case 1 :
					// Parser.g:675:9: K_INITCOND ival= term
					{
					match(input,K_INITCOND,FOLLOW_K_INITCOND_in_createAggregateStatement4277); if (state.failed) return expr;
					pushFollow(FOLLOW_term_in_createAggregateStatement4283);
					ival=term();
					state._fsp--;
					if (state.failed) return expr;
					}
					break;

			}

			if ( state.backtracking==0 ) { expr = new CreateAggregateStatement(fn, argsTypes, sfunc, stype, ffunc, ival, orReplace, ifNotExists); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "createAggregateStatement"



	// $ANTLR start "dropAggregateStatement"
	// Parser.g:680:1: dropAggregateStatement returns [DropAggregateStatement expr] : K_DROP K_AGGREGATE ( K_IF K_EXISTS )? fn= functionName ( '(' (v= comparatorType ( ',' v= comparatorType )* )? ')' )? ;
	public final DropAggregateStatement dropAggregateStatement() throws RecognitionException {
		DropAggregateStatement expr = null;


		FunctionName fn =null;
		CQL3Type.Raw v =null;


		        boolean ifExists = false;
		        List<CQL3Type.Raw> argsTypes = new ArrayList<>();
		        boolean argsPresent = false;
		    
		try {
			// Parser.g:686:5: ( K_DROP K_AGGREGATE ( K_IF K_EXISTS )? fn= functionName ( '(' (v= comparatorType ( ',' v= comparatorType )* )? ')' )? )
			// Parser.g:686:7: K_DROP K_AGGREGATE ( K_IF K_EXISTS )? fn= functionName ( '(' (v= comparatorType ( ',' v= comparatorType )* )? ')' )?
			{
			match(input,K_DROP,FOLLOW_K_DROP_in_dropAggregateStatement4330); if (state.failed) return expr;
			match(input,K_AGGREGATE,FOLLOW_K_AGGREGATE_in_dropAggregateStatement4332); if (state.failed) return expr;
			// Parser.g:687:7: ( K_IF K_EXISTS )?
			int alt73=2;
			int LA73_0 = input.LA(1);
			if ( (LA73_0==K_IF) ) {
				alt73=1;
			}
			switch (alt73) {
				case 1 :
					// Parser.g:687:8: K_IF K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_dropAggregateStatement4341); if (state.failed) return expr;
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_dropAggregateStatement4343); if (state.failed) return expr;
					if ( state.backtracking==0 ) { ifExists = true; }
					}
					break;

			}

			pushFollow(FOLLOW_functionName_in_dropAggregateStatement4358);
			fn=functionName();
			state._fsp--;
			if (state.failed) return expr;
			// Parser.g:689:7: ( '(' (v= comparatorType ( ',' v= comparatorType )* )? ')' )?
			int alt76=2;
			int LA76_0 = input.LA(1);
			if ( (LA76_0==187) ) {
				alt76=1;
			}
			switch (alt76) {
				case 1 :
					// Parser.g:690:9: '(' (v= comparatorType ( ',' v= comparatorType )* )? ')'
					{
					match(input,187,FOLLOW_187_in_dropAggregateStatement4376); if (state.failed) return expr;
					// Parser.g:691:11: (v= comparatorType ( ',' v= comparatorType )* )?
					int alt75=2;
					int LA75_0 = input.LA(1);
					if ( (LA75_0==IDENT||(LA75_0 >= K_AGGREGATE && LA75_0 <= K_ALL)||LA75_0==K_AS||LA75_0==K_ASCII||(LA75_0 >= K_BIGINT && LA75_0 <= K_BOOLEAN)||(LA75_0 >= K_CALLED && LA75_0 <= K_CLUSTERING)||(LA75_0 >= K_COMPACT && LA75_0 <= K_COUNTER)||(LA75_0 >= K_CUSTOM && LA75_0 <= K_DECIMAL)||(LA75_0 >= K_DISTINCT && LA75_0 <= K_DOUBLE)||LA75_0==K_DURATION||(LA75_0 >= K_EXISTS && LA75_0 <= K_FLOAT)||LA75_0==K_FROZEN||(LA75_0 >= K_FUNCTION && LA75_0 <= K_FUNCTIONS)||LA75_0==K_GROUP||(LA75_0 >= K_INET && LA75_0 <= K_INPUT)||LA75_0==K_INT||(LA75_0 >= K_JSON && LA75_0 <= K_KEYS)||(LA75_0 >= K_KEYSPACES && LA75_0 <= K_LIKE)||(LA75_0 >= K_LIST && LA75_0 <= K_MAP)||LA75_0==K_NOLOGIN||LA75_0==K_NOSUPERUSER||LA75_0==K_OPTIONS||(LA75_0 >= K_PARTITION && LA75_0 <= K_PERMISSIONS)||LA75_0==K_RETURNS||(LA75_0 >= K_ROLE && LA75_0 <= K_ROLES)||(LA75_0 >= K_SET && LA75_0 <= K_TINYINT)||LA75_0==K_TRIGGER||(LA75_0 >= K_TTL && LA75_0 <= K_TYPE)||(LA75_0 >= K_USER && LA75_0 <= K_USERS)||(LA75_0 >= K_UUID && LA75_0 <= K_VARINT)||LA75_0==K_WRITETIME||LA75_0==QUOTED_NAME||LA75_0==STRING_LITERAL) ) {
						alt75=1;
					}
					switch (alt75) {
						case 1 :
							// Parser.g:692:13: v= comparatorType ( ',' v= comparatorType )*
							{
							pushFollow(FOLLOW_comparatorType_in_dropAggregateStatement4404);
							v=comparatorType();
							state._fsp--;
							if (state.failed) return expr;
							if ( state.backtracking==0 ) { argsTypes.add(v); }
							// Parser.g:693:13: ( ',' v= comparatorType )*
							loop74:
							while (true) {
								int alt74=2;
								int LA74_0 = input.LA(1);
								if ( (LA74_0==191) ) {
									alt74=1;
								}

								switch (alt74) {
								case 1 :
									// Parser.g:693:15: ',' v= comparatorType
									{
									match(input,191,FOLLOW_191_in_dropAggregateStatement4422); if (state.failed) return expr;
									pushFollow(FOLLOW_comparatorType_in_dropAggregateStatement4426);
									v=comparatorType();
									state._fsp--;
									if (state.failed) return expr;
									if ( state.backtracking==0 ) { argsTypes.add(v); }
									}
									break;

								default :
									break loop74;
								}
							}

							}
							break;

					}

					match(input,188,FOLLOW_188_in_dropAggregateStatement4454); if (state.failed) return expr;
					if ( state.backtracking==0 ) { argsPresent = true; }
					}
					break;

			}

			if ( state.backtracking==0 ) { expr = new DropAggregateStatement(fn, argsTypes, argsPresent, ifExists); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "dropAggregateStatement"



	// $ANTLR start "createFunctionStatement"
	// Parser.g:701:1: createFunctionStatement returns [CreateFunctionStatement expr] : K_CREATE ( K_OR K_REPLACE )? K_FUNCTION ( K_IF K_NOT K_EXISTS )? fn= functionName '(' (k= noncol_ident v= comparatorType ( ',' k= noncol_ident v= comparatorType )* )? ')' ( ( K_RETURNS K_NULL ) | ( K_CALLED ) ) K_ON K_NULL K_INPUT K_RETURNS rt= comparatorType K_LANGUAGE language= IDENT K_AS body= STRING_LITERAL ;
	public final CreateFunctionStatement createFunctionStatement() throws RecognitionException {
		CreateFunctionStatement expr = null;


		Token language=null;
		Token body=null;
		FunctionName fn =null;
		ColumnIdentifier k =null;
		CQL3Type.Raw v =null;
		CQL3Type.Raw rt =null;


		        boolean orReplace = false;
		        boolean ifNotExists = false;

		        List<ColumnIdentifier> argsNames = new ArrayList<>();
		        List<CQL3Type.Raw> argsTypes = new ArrayList<>();
		        boolean calledOnNullInput = false;
		    
		try {
			// Parser.g:710:5: ( K_CREATE ( K_OR K_REPLACE )? K_FUNCTION ( K_IF K_NOT K_EXISTS )? fn= functionName '(' (k= noncol_ident v= comparatorType ( ',' k= noncol_ident v= comparatorType )* )? ')' ( ( K_RETURNS K_NULL ) | ( K_CALLED ) ) K_ON K_NULL K_INPUT K_RETURNS rt= comparatorType K_LANGUAGE language= IDENT K_AS body= STRING_LITERAL )
			// Parser.g:710:7: K_CREATE ( K_OR K_REPLACE )? K_FUNCTION ( K_IF K_NOT K_EXISTS )? fn= functionName '(' (k= noncol_ident v= comparatorType ( ',' k= noncol_ident v= comparatorType )* )? ')' ( ( K_RETURNS K_NULL ) | ( K_CALLED ) ) K_ON K_NULL K_INPUT K_RETURNS rt= comparatorType K_LANGUAGE language= IDENT K_AS body= STRING_LITERAL
			{
			match(input,K_CREATE,FOLLOW_K_CREATE_in_createFunctionStatement4511); if (state.failed) return expr;
			// Parser.g:710:16: ( K_OR K_REPLACE )?
			int alt77=2;
			int LA77_0 = input.LA(1);
			if ( (LA77_0==K_OR) ) {
				alt77=1;
			}
			switch (alt77) {
				case 1 :
					// Parser.g:710:17: K_OR K_REPLACE
					{
					match(input,K_OR,FOLLOW_K_OR_in_createFunctionStatement4514); if (state.failed) return expr;
					match(input,K_REPLACE,FOLLOW_K_REPLACE_in_createFunctionStatement4516); if (state.failed) return expr;
					if ( state.backtracking==0 ) { orReplace = true; }
					}
					break;

			}

			match(input,K_FUNCTION,FOLLOW_K_FUNCTION_in_createFunctionStatement4528); if (state.failed) return expr;
			// Parser.g:712:7: ( K_IF K_NOT K_EXISTS )?
			int alt78=2;
			int LA78_0 = input.LA(1);
			if ( (LA78_0==K_IF) ) {
				alt78=1;
			}
			switch (alt78) {
				case 1 :
					// Parser.g:712:8: K_IF K_NOT K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_createFunctionStatement4537); if (state.failed) return expr;
					match(input,K_NOT,FOLLOW_K_NOT_in_createFunctionStatement4539); if (state.failed) return expr;
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_createFunctionStatement4541); if (state.failed) return expr;
					if ( state.backtracking==0 ) { ifNotExists = true; }
					}
					break;

			}

			pushFollow(FOLLOW_functionName_in_createFunctionStatement4555);
			fn=functionName();
			state._fsp--;
			if (state.failed) return expr;
			match(input,187,FOLLOW_187_in_createFunctionStatement4563); if (state.failed) return expr;
			// Parser.g:715:9: (k= noncol_ident v= comparatorType ( ',' k= noncol_ident v= comparatorType )* )?
			int alt80=2;
			int LA80_0 = input.LA(1);
			if ( (LA80_0==IDENT||(LA80_0 >= K_AGGREGATE && LA80_0 <= K_ALL)||LA80_0==K_AS||LA80_0==K_ASCII||(LA80_0 >= K_BIGINT && LA80_0 <= K_BOOLEAN)||(LA80_0 >= K_CALLED && LA80_0 <= K_CLUSTERING)||(LA80_0 >= K_COMPACT && LA80_0 <= K_COUNTER)||(LA80_0 >= K_CUSTOM && LA80_0 <= K_DECIMAL)||(LA80_0 >= K_DISTINCT && LA80_0 <= K_DOUBLE)||LA80_0==K_DURATION||(LA80_0 >= K_EXISTS && LA80_0 <= K_FLOAT)||LA80_0==K_FROZEN||(LA80_0 >= K_FUNCTION && LA80_0 <= K_FUNCTIONS)||LA80_0==K_GROUP||(LA80_0 >= K_INET && LA80_0 <= K_INPUT)||LA80_0==K_INT||(LA80_0 >= K_JSON && LA80_0 <= K_KEYS)||(LA80_0 >= K_KEYSPACES && LA80_0 <= K_LIKE)||(LA80_0 >= K_LIST && LA80_0 <= K_MAP)||LA80_0==K_NOLOGIN||LA80_0==K_NOSUPERUSER||LA80_0==K_OPTIONS||(LA80_0 >= K_PARTITION && LA80_0 <= K_PERMISSIONS)||LA80_0==K_RETURNS||(LA80_0 >= K_ROLE && LA80_0 <= K_ROLES)||(LA80_0 >= K_SFUNC && LA80_0 <= K_TINYINT)||LA80_0==K_TRIGGER||(LA80_0 >= K_TTL && LA80_0 <= K_TYPE)||(LA80_0 >= K_USER && LA80_0 <= K_USERS)||(LA80_0 >= K_UUID && LA80_0 <= K_VARINT)||LA80_0==K_WRITETIME||LA80_0==QUOTED_NAME) ) {
				alt80=1;
			}
			switch (alt80) {
				case 1 :
					// Parser.g:716:11: k= noncol_ident v= comparatorType ( ',' k= noncol_ident v= comparatorType )*
					{
					pushFollow(FOLLOW_noncol_ident_in_createFunctionStatement4587);
					k=noncol_ident();
					state._fsp--;
					if (state.failed) return expr;
					pushFollow(FOLLOW_comparatorType_in_createFunctionStatement4591);
					v=comparatorType();
					state._fsp--;
					if (state.failed) return expr;
					if ( state.backtracking==0 ) { argsNames.add(k); argsTypes.add(v); }
					// Parser.g:717:11: ( ',' k= noncol_ident v= comparatorType )*
					loop79:
					while (true) {
						int alt79=2;
						int LA79_0 = input.LA(1);
						if ( (LA79_0==191) ) {
							alt79=1;
						}

						switch (alt79) {
						case 1 :
							// Parser.g:717:13: ',' k= noncol_ident v= comparatorType
							{
							match(input,191,FOLLOW_191_in_createFunctionStatement4607); if (state.failed) return expr;
							pushFollow(FOLLOW_noncol_ident_in_createFunctionStatement4611);
							k=noncol_ident();
							state._fsp--;
							if (state.failed) return expr;
							pushFollow(FOLLOW_comparatorType_in_createFunctionStatement4615);
							v=comparatorType();
							state._fsp--;
							if (state.failed) return expr;
							if ( state.backtracking==0 ) { argsNames.add(k); argsTypes.add(v); }
							}
							break;

						default :
							break loop79;
						}
					}

					}
					break;

			}

			match(input,188,FOLLOW_188_in_createFunctionStatement4639); if (state.failed) return expr;
			// Parser.g:720:7: ( ( K_RETURNS K_NULL ) | ( K_CALLED ) )
			int alt81=2;
			int LA81_0 = input.LA(1);
			if ( (LA81_0==K_RETURNS) ) {
				alt81=1;
			}
			else if ( (LA81_0==K_CALLED) ) {
				alt81=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return expr;}
				NoViableAltException nvae =
					new NoViableAltException("", 81, 0, input);
				throw nvae;
			}

			switch (alt81) {
				case 1 :
					// Parser.g:720:9: ( K_RETURNS K_NULL )
					{
					// Parser.g:720:9: ( K_RETURNS K_NULL )
					// Parser.g:720:10: K_RETURNS K_NULL
					{
					match(input,K_RETURNS,FOLLOW_K_RETURNS_in_createFunctionStatement4650); if (state.failed) return expr;
					match(input,K_NULL,FOLLOW_K_NULL_in_createFunctionStatement4652); if (state.failed) return expr;
					}

					}
					break;
				case 2 :
					// Parser.g:720:30: ( K_CALLED )
					{
					// Parser.g:720:30: ( K_CALLED )
					// Parser.g:720:31: K_CALLED
					{
					match(input,K_CALLED,FOLLOW_K_CALLED_in_createFunctionStatement4658); if (state.failed) return expr;
					if ( state.backtracking==0 ) { calledOnNullInput=true; }
					}

					}
					break;

			}

			match(input,K_ON,FOLLOW_K_ON_in_createFunctionStatement4664); if (state.failed) return expr;
			match(input,K_NULL,FOLLOW_K_NULL_in_createFunctionStatement4666); if (state.failed) return expr;
			match(input,K_INPUT,FOLLOW_K_INPUT_in_createFunctionStatement4668); if (state.failed) return expr;
			match(input,K_RETURNS,FOLLOW_K_RETURNS_in_createFunctionStatement4676); if (state.failed) return expr;
			pushFollow(FOLLOW_comparatorType_in_createFunctionStatement4682);
			rt=comparatorType();
			state._fsp--;
			if (state.failed) return expr;
			match(input,K_LANGUAGE,FOLLOW_K_LANGUAGE_in_createFunctionStatement4690); if (state.failed) return expr;
			language=(Token)match(input,IDENT,FOLLOW_IDENT_in_createFunctionStatement4696); if (state.failed) return expr;
			match(input,K_AS,FOLLOW_K_AS_in_createFunctionStatement4704); if (state.failed) return expr;
			body=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_createFunctionStatement4710); if (state.failed) return expr;
			if ( state.backtracking==0 ) { expr = new CreateFunctionStatement(fn, (language!=null?language.getText():null).toLowerCase(), (body!=null?body.getText():null),
			                                            argsNames, argsTypes, rt, calledOnNullInput, orReplace, ifNotExists); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "createFunctionStatement"



	// $ANTLR start "dropFunctionStatement"
	// Parser.g:728:1: dropFunctionStatement returns [DropFunctionStatement expr] : K_DROP K_FUNCTION ( K_IF K_EXISTS )? fn= functionName ( '(' (v= comparatorType ( ',' v= comparatorType )* )? ')' )? ;
	public final DropFunctionStatement dropFunctionStatement() throws RecognitionException {
		DropFunctionStatement expr = null;


		FunctionName fn =null;
		CQL3Type.Raw v =null;


		        boolean ifExists = false;
		        List<CQL3Type.Raw> argsTypes = new ArrayList<>();
		        boolean argsPresent = false;
		    
		try {
			// Parser.g:734:5: ( K_DROP K_FUNCTION ( K_IF K_EXISTS )? fn= functionName ( '(' (v= comparatorType ( ',' v= comparatorType )* )? ')' )? )
			// Parser.g:734:7: K_DROP K_FUNCTION ( K_IF K_EXISTS )? fn= functionName ( '(' (v= comparatorType ( ',' v= comparatorType )* )? ')' )?
			{
			match(input,K_DROP,FOLLOW_K_DROP_in_dropFunctionStatement4748); if (state.failed) return expr;
			match(input,K_FUNCTION,FOLLOW_K_FUNCTION_in_dropFunctionStatement4750); if (state.failed) return expr;
			// Parser.g:735:7: ( K_IF K_EXISTS )?
			int alt82=2;
			int LA82_0 = input.LA(1);
			if ( (LA82_0==K_IF) ) {
				alt82=1;
			}
			switch (alt82) {
				case 1 :
					// Parser.g:735:8: K_IF K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_dropFunctionStatement4759); if (state.failed) return expr;
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_dropFunctionStatement4761); if (state.failed) return expr;
					if ( state.backtracking==0 ) { ifExists = true; }
					}
					break;

			}

			pushFollow(FOLLOW_functionName_in_dropFunctionStatement4776);
			fn=functionName();
			state._fsp--;
			if (state.failed) return expr;
			// Parser.g:737:7: ( '(' (v= comparatorType ( ',' v= comparatorType )* )? ')' )?
			int alt85=2;
			int LA85_0 = input.LA(1);
			if ( (LA85_0==187) ) {
				alt85=1;
			}
			switch (alt85) {
				case 1 :
					// Parser.g:738:9: '(' (v= comparatorType ( ',' v= comparatorType )* )? ')'
					{
					match(input,187,FOLLOW_187_in_dropFunctionStatement4794); if (state.failed) return expr;
					// Parser.g:739:11: (v= comparatorType ( ',' v= comparatorType )* )?
					int alt84=2;
					int LA84_0 = input.LA(1);
					if ( (LA84_0==IDENT||(LA84_0 >= K_AGGREGATE && LA84_0 <= K_ALL)||LA84_0==K_AS||LA84_0==K_ASCII||(LA84_0 >= K_BIGINT && LA84_0 <= K_BOOLEAN)||(LA84_0 >= K_CALLED && LA84_0 <= K_CLUSTERING)||(LA84_0 >= K_COMPACT && LA84_0 <= K_COUNTER)||(LA84_0 >= K_CUSTOM && LA84_0 <= K_DECIMAL)||(LA84_0 >= K_DISTINCT && LA84_0 <= K_DOUBLE)||LA84_0==K_DURATION||(LA84_0 >= K_EXISTS && LA84_0 <= K_FLOAT)||LA84_0==K_FROZEN||(LA84_0 >= K_FUNCTION && LA84_0 <= K_FUNCTIONS)||LA84_0==K_GROUP||(LA84_0 >= K_INET && LA84_0 <= K_INPUT)||LA84_0==K_INT||(LA84_0 >= K_JSON && LA84_0 <= K_KEYS)||(LA84_0 >= K_KEYSPACES && LA84_0 <= K_LIKE)||(LA84_0 >= K_LIST && LA84_0 <= K_MAP)||LA84_0==K_NOLOGIN||LA84_0==K_NOSUPERUSER||LA84_0==K_OPTIONS||(LA84_0 >= K_PARTITION && LA84_0 <= K_PERMISSIONS)||LA84_0==K_RETURNS||(LA84_0 >= K_ROLE && LA84_0 <= K_ROLES)||(LA84_0 >= K_SET && LA84_0 <= K_TINYINT)||LA84_0==K_TRIGGER||(LA84_0 >= K_TTL && LA84_0 <= K_TYPE)||(LA84_0 >= K_USER && LA84_0 <= K_USERS)||(LA84_0 >= K_UUID && LA84_0 <= K_VARINT)||LA84_0==K_WRITETIME||LA84_0==QUOTED_NAME||LA84_0==STRING_LITERAL) ) {
						alt84=1;
					}
					switch (alt84) {
						case 1 :
							// Parser.g:740:13: v= comparatorType ( ',' v= comparatorType )*
							{
							pushFollow(FOLLOW_comparatorType_in_dropFunctionStatement4822);
							v=comparatorType();
							state._fsp--;
							if (state.failed) return expr;
							if ( state.backtracking==0 ) { argsTypes.add(v); }
							// Parser.g:741:13: ( ',' v= comparatorType )*
							loop83:
							while (true) {
								int alt83=2;
								int LA83_0 = input.LA(1);
								if ( (LA83_0==191) ) {
									alt83=1;
								}

								switch (alt83) {
								case 1 :
									// Parser.g:741:15: ',' v= comparatorType
									{
									match(input,191,FOLLOW_191_in_dropFunctionStatement4840); if (state.failed) return expr;
									pushFollow(FOLLOW_comparatorType_in_dropFunctionStatement4844);
									v=comparatorType();
									state._fsp--;
									if (state.failed) return expr;
									if ( state.backtracking==0 ) { argsTypes.add(v); }
									}
									break;

								default :
									break loop83;
								}
							}

							}
							break;

					}

					match(input,188,FOLLOW_188_in_dropFunctionStatement4872); if (state.failed) return expr;
					if ( state.backtracking==0 ) { argsPresent = true; }
					}
					break;

			}

			if ( state.backtracking==0 ) { expr = new DropFunctionStatement(fn, argsTypes, argsPresent, ifExists); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "dropFunctionStatement"



	// $ANTLR start "createKeyspaceStatement"
	// Parser.g:752:1: createKeyspaceStatement returns [CreateKeyspaceStatement expr] : K_CREATE K_KEYSPACE ( K_IF K_NOT K_EXISTS )? ks= keyspaceName K_WITH properties[attrs] ;
	public final CreateKeyspaceStatement createKeyspaceStatement() throws RecognitionException {
		CreateKeyspaceStatement expr = null;


		String ks =null;


		        KeyspaceAttributes attrs = new KeyspaceAttributes();
		        boolean ifNotExists = false;
		    
		try {
			// Parser.g:757:5: ( K_CREATE K_KEYSPACE ( K_IF K_NOT K_EXISTS )? ks= keyspaceName K_WITH properties[attrs] )
			// Parser.g:757:7: K_CREATE K_KEYSPACE ( K_IF K_NOT K_EXISTS )? ks= keyspaceName K_WITH properties[attrs]
			{
			match(input,K_CREATE,FOLLOW_K_CREATE_in_createKeyspaceStatement4931); if (state.failed) return expr;
			match(input,K_KEYSPACE,FOLLOW_K_KEYSPACE_in_createKeyspaceStatement4933); if (state.failed) return expr;
			// Parser.g:757:27: ( K_IF K_NOT K_EXISTS )?
			int alt86=2;
			int LA86_0 = input.LA(1);
			if ( (LA86_0==K_IF) ) {
				alt86=1;
			}
			switch (alt86) {
				case 1 :
					// Parser.g:757:28: K_IF K_NOT K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_createKeyspaceStatement4936); if (state.failed) return expr;
					match(input,K_NOT,FOLLOW_K_NOT_in_createKeyspaceStatement4938); if (state.failed) return expr;
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_createKeyspaceStatement4940); if (state.failed) return expr;
					if ( state.backtracking==0 ) { ifNotExists = true; }
					}
					break;

			}

			pushFollow(FOLLOW_keyspaceName_in_createKeyspaceStatement4949);
			ks=keyspaceName();
			state._fsp--;
			if (state.failed) return expr;
			match(input,K_WITH,FOLLOW_K_WITH_in_createKeyspaceStatement4957); if (state.failed) return expr;
			pushFollow(FOLLOW_properties_in_createKeyspaceStatement4959);
			properties(attrs);
			state._fsp--;
			if (state.failed) return expr;
			if ( state.backtracking==0 ) { expr = new CreateKeyspaceStatement(ks, attrs, ifNotExists); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "createKeyspaceStatement"



	// $ANTLR start "createTableStatement"
	// Parser.g:768:1: createTableStatement returns [CreateTableStatement.RawStatement expr] : K_CREATE K_COLUMNFAMILY ( K_IF K_NOT K_EXISTS )? cf= columnFamilyName cfamDefinition[expr] ;
	public final CreateTableStatement.RawStatement createTableStatement() throws RecognitionException {
		CreateTableStatement.RawStatement expr = null;


		CFName cf =null;

		 boolean ifNotExists = false; 
		try {
			// Parser.g:770:5: ( K_CREATE K_COLUMNFAMILY ( K_IF K_NOT K_EXISTS )? cf= columnFamilyName cfamDefinition[expr] )
			// Parser.g:770:7: K_CREATE K_COLUMNFAMILY ( K_IF K_NOT K_EXISTS )? cf= columnFamilyName cfamDefinition[expr]
			{
			match(input,K_CREATE,FOLLOW_K_CREATE_in_createTableStatement4994); if (state.failed) return expr;
			match(input,K_COLUMNFAMILY,FOLLOW_K_COLUMNFAMILY_in_createTableStatement4996); if (state.failed) return expr;
			// Parser.g:770:31: ( K_IF K_NOT K_EXISTS )?
			int alt87=2;
			int LA87_0 = input.LA(1);
			if ( (LA87_0==K_IF) ) {
				alt87=1;
			}
			switch (alt87) {
				case 1 :
					// Parser.g:770:32: K_IF K_NOT K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_createTableStatement4999); if (state.failed) return expr;
					match(input,K_NOT,FOLLOW_K_NOT_in_createTableStatement5001); if (state.failed) return expr;
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_createTableStatement5003); if (state.failed) return expr;
					if ( state.backtracking==0 ) { ifNotExists = true; }
					}
					break;

			}

			pushFollow(FOLLOW_columnFamilyName_in_createTableStatement5018);
			cf=columnFamilyName();
			state._fsp--;
			if (state.failed) return expr;
			if ( state.backtracking==0 ) { expr = new CreateTableStatement.RawStatement(cf, ifNotExists); }
			pushFollow(FOLLOW_cfamDefinition_in_createTableStatement5028);
			cfamDefinition(expr);
			state._fsp--;
			if (state.failed) return expr;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "createTableStatement"



	// $ANTLR start "cfamDefinition"
	// Parser.g:775:1: cfamDefinition[CreateTableStatement.RawStatement expr] : '(' cfamColumns[expr] ( ',' ( cfamColumns[expr] )? )* ')' ( K_WITH cfamProperty[expr.properties] ( K_AND cfamProperty[expr.properties] )* )? ;
	public final void cfamDefinition(CreateTableStatement.RawStatement expr) throws RecognitionException {
		try {
			// Parser.g:776:5: ( '(' cfamColumns[expr] ( ',' ( cfamColumns[expr] )? )* ')' ( K_WITH cfamProperty[expr.properties] ( K_AND cfamProperty[expr.properties] )* )? )
			// Parser.g:776:7: '(' cfamColumns[expr] ( ',' ( cfamColumns[expr] )? )* ')' ( K_WITH cfamProperty[expr.properties] ( K_AND cfamProperty[expr.properties] )* )?
			{
			match(input,187,FOLLOW_187_in_cfamDefinition5047); if (state.failed) return;
			pushFollow(FOLLOW_cfamColumns_in_cfamDefinition5049);
			cfamColumns(expr);
			state._fsp--;
			if (state.failed) return;
			// Parser.g:776:29: ( ',' ( cfamColumns[expr] )? )*
			loop89:
			while (true) {
				int alt89=2;
				int LA89_0 = input.LA(1);
				if ( (LA89_0==191) ) {
					alt89=1;
				}

				switch (alt89) {
				case 1 :
					// Parser.g:776:31: ',' ( cfamColumns[expr] )?
					{
					match(input,191,FOLLOW_191_in_cfamDefinition5054); if (state.failed) return;
					// Parser.g:776:35: ( cfamColumns[expr] )?
					int alt88=2;
					int LA88_0 = input.LA(1);
					if ( (LA88_0==IDENT||(LA88_0 >= K_AGGREGATE && LA88_0 <= K_ALL)||LA88_0==K_AS||LA88_0==K_ASCII||(LA88_0 >= K_BIGINT && LA88_0 <= K_BOOLEAN)||(LA88_0 >= K_CALLED && LA88_0 <= K_CLUSTERING)||(LA88_0 >= K_COMPACT && LA88_0 <= K_COUNTER)||(LA88_0 >= K_CUSTOM && LA88_0 <= K_DECIMAL)||(LA88_0 >= K_DISTINCT && LA88_0 <= K_DOUBLE)||LA88_0==K_DURATION||(LA88_0 >= K_EXISTS && LA88_0 <= K_FLOAT)||LA88_0==K_FROZEN||(LA88_0 >= K_FUNCTION && LA88_0 <= K_FUNCTIONS)||LA88_0==K_GROUP||(LA88_0 >= K_INET && LA88_0 <= K_INPUT)||LA88_0==K_INT||(LA88_0 >= K_JSON && LA88_0 <= K_KEYS)||(LA88_0 >= K_KEYSPACES && LA88_0 <= K_LIKE)||(LA88_0 >= K_LIST && LA88_0 <= K_MAP)||LA88_0==K_NOLOGIN||LA88_0==K_NOSUPERUSER||LA88_0==K_OPTIONS||(LA88_0 >= K_PARTITION && LA88_0 <= K_PERMISSIONS)||LA88_0==K_PRIMARY||LA88_0==K_RETURNS||(LA88_0 >= K_ROLE && LA88_0 <= K_ROLES)||(LA88_0 >= K_SFUNC && LA88_0 <= K_TINYINT)||LA88_0==K_TRIGGER||(LA88_0 >= K_TTL && LA88_0 <= K_TYPE)||(LA88_0 >= K_USER && LA88_0 <= K_USERS)||(LA88_0 >= K_UUID && LA88_0 <= K_VARINT)||LA88_0==K_WRITETIME||LA88_0==QUOTED_NAME) ) {
						alt88=1;
					}
					switch (alt88) {
						case 1 :
							// Parser.g:776:35: cfamColumns[expr]
							{
							pushFollow(FOLLOW_cfamColumns_in_cfamDefinition5056);
							cfamColumns(expr);
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					}
					break;

				default :
					break loop89;
				}
			}

			match(input,188,FOLLOW_188_in_cfamDefinition5063); if (state.failed) return;
			// Parser.g:777:7: ( K_WITH cfamProperty[expr.properties] ( K_AND cfamProperty[expr.properties] )* )?
			int alt91=2;
			int LA91_0 = input.LA(1);
			if ( (LA91_0==K_WITH) ) {
				alt91=1;
			}
			switch (alt91) {
				case 1 :
					// Parser.g:777:9: K_WITH cfamProperty[expr.properties] ( K_AND cfamProperty[expr.properties] )*
					{
					match(input,K_WITH,FOLLOW_K_WITH_in_cfamDefinition5073); if (state.failed) return;
					pushFollow(FOLLOW_cfamProperty_in_cfamDefinition5075);
					cfamProperty(expr.properties);
					state._fsp--;
					if (state.failed) return;
					// Parser.g:777:46: ( K_AND cfamProperty[expr.properties] )*
					loop90:
					while (true) {
						int alt90=2;
						int LA90_0 = input.LA(1);
						if ( (LA90_0==K_AND) ) {
							alt90=1;
						}

						switch (alt90) {
						case 1 :
							// Parser.g:777:48: K_AND cfamProperty[expr.properties]
							{
							match(input,K_AND,FOLLOW_K_AND_in_cfamDefinition5080); if (state.failed) return;
							pushFollow(FOLLOW_cfamProperty_in_cfamDefinition5082);
							cfamProperty(expr.properties);
							state._fsp--;
							if (state.failed) return;
							}
							break;

						default :
							break loop90;
						}
					}

					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "cfamDefinition"



	// $ANTLR start "cfamColumns"
	// Parser.g:780:1: cfamColumns[CreateTableStatement.RawStatement expr] : (k= ident v= comparatorType ( K_STATIC )? ( K_PRIMARY K_KEY )? | K_PRIMARY K_KEY '(' pkDef[expr] ( ',' c= ident )* ')' );
	public final void cfamColumns(CreateTableStatement.RawStatement expr) throws RecognitionException {
		ColumnIdentifier k =null;
		CQL3Type.Raw v =null;
		ColumnIdentifier c =null;

		 boolean isStatic = false; 
		try {
			// Parser.g:782:5: (k= ident v= comparatorType ( K_STATIC )? ( K_PRIMARY K_KEY )? | K_PRIMARY K_KEY '(' pkDef[expr] ( ',' c= ident )* ')' )
			int alt95=2;
			int LA95_0 = input.LA(1);
			if ( (LA95_0==IDENT||(LA95_0 >= K_AGGREGATE && LA95_0 <= K_ALL)||LA95_0==K_AS||LA95_0==K_ASCII||(LA95_0 >= K_BIGINT && LA95_0 <= K_BOOLEAN)||(LA95_0 >= K_CALLED && LA95_0 <= K_CLUSTERING)||(LA95_0 >= K_COMPACT && LA95_0 <= K_COUNTER)||(LA95_0 >= K_CUSTOM && LA95_0 <= K_DECIMAL)||(LA95_0 >= K_DISTINCT && LA95_0 <= K_DOUBLE)||LA95_0==K_DURATION||(LA95_0 >= K_EXISTS && LA95_0 <= K_FLOAT)||LA95_0==K_FROZEN||(LA95_0 >= K_FUNCTION && LA95_0 <= K_FUNCTIONS)||LA95_0==K_GROUP||(LA95_0 >= K_INET && LA95_0 <= K_INPUT)||LA95_0==K_INT||(LA95_0 >= K_JSON && LA95_0 <= K_KEYS)||(LA95_0 >= K_KEYSPACES && LA95_0 <= K_LIKE)||(LA95_0 >= K_LIST && LA95_0 <= K_MAP)||LA95_0==K_NOLOGIN||LA95_0==K_NOSUPERUSER||LA95_0==K_OPTIONS||(LA95_0 >= K_PARTITION && LA95_0 <= K_PERMISSIONS)||LA95_0==K_RETURNS||(LA95_0 >= K_ROLE && LA95_0 <= K_ROLES)||(LA95_0 >= K_SFUNC && LA95_0 <= K_TINYINT)||LA95_0==K_TRIGGER||(LA95_0 >= K_TTL && LA95_0 <= K_TYPE)||(LA95_0 >= K_USER && LA95_0 <= K_USERS)||(LA95_0 >= K_UUID && LA95_0 <= K_VARINT)||LA95_0==K_WRITETIME||LA95_0==QUOTED_NAME) ) {
				alt95=1;
			}
			else if ( (LA95_0==K_PRIMARY) ) {
				alt95=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 95, 0, input);
				throw nvae;
			}

			switch (alt95) {
				case 1 :
					// Parser.g:782:7: k= ident v= comparatorType ( K_STATIC )? ( K_PRIMARY K_KEY )?
					{
					pushFollow(FOLLOW_ident_in_cfamColumns5117);
					k=ident();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_comparatorType_in_cfamColumns5121);
					v=comparatorType();
					state._fsp--;
					if (state.failed) return;
					// Parser.g:782:32: ( K_STATIC )?
					int alt92=2;
					int LA92_0 = input.LA(1);
					if ( (LA92_0==K_STATIC) ) {
						alt92=1;
					}
					switch (alt92) {
						case 1 :
							// Parser.g:782:33: K_STATIC
							{
							match(input,K_STATIC,FOLLOW_K_STATIC_in_cfamColumns5124); if (state.failed) return;
							if ( state.backtracking==0 ) {isStatic = true;}
							}
							break;

					}

					if ( state.backtracking==0 ) { expr.addDefinition(k, v, isStatic); }
					// Parser.g:783:9: ( K_PRIMARY K_KEY )?
					int alt93=2;
					int LA93_0 = input.LA(1);
					if ( (LA93_0==K_PRIMARY) ) {
						alt93=1;
					}
					switch (alt93) {
						case 1 :
							// Parser.g:783:10: K_PRIMARY K_KEY
							{
							match(input,K_PRIMARY,FOLLOW_K_PRIMARY_in_cfamColumns5141); if (state.failed) return;
							match(input,K_KEY,FOLLOW_K_KEY_in_cfamColumns5143); if (state.failed) return;
							if ( state.backtracking==0 ) { expr.addKeyAliases(Collections.singletonList(k)); }
							}
							break;

					}

					}
					break;
				case 2 :
					// Parser.g:784:7: K_PRIMARY K_KEY '(' pkDef[expr] ( ',' c= ident )* ')'
					{
					match(input,K_PRIMARY,FOLLOW_K_PRIMARY_in_cfamColumns5155); if (state.failed) return;
					match(input,K_KEY,FOLLOW_K_KEY_in_cfamColumns5157); if (state.failed) return;
					match(input,187,FOLLOW_187_in_cfamColumns5159); if (state.failed) return;
					pushFollow(FOLLOW_pkDef_in_cfamColumns5161);
					pkDef(expr);
					state._fsp--;
					if (state.failed) return;
					// Parser.g:784:39: ( ',' c= ident )*
					loop94:
					while (true) {
						int alt94=2;
						int LA94_0 = input.LA(1);
						if ( (LA94_0==191) ) {
							alt94=1;
						}

						switch (alt94) {
						case 1 :
							// Parser.g:784:40: ',' c= ident
							{
							match(input,191,FOLLOW_191_in_cfamColumns5165); if (state.failed) return;
							pushFollow(FOLLOW_ident_in_cfamColumns5169);
							c=ident();
							state._fsp--;
							if (state.failed) return;
							if ( state.backtracking==0 ) { expr.addColumnAlias(c); }
							}
							break;

						default :
							break loop94;
						}
					}

					match(input,188,FOLLOW_188_in_cfamColumns5176); if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "cfamColumns"



	// $ANTLR start "pkDef"
	// Parser.g:787:1: pkDef[CreateTableStatement.RawStatement expr] : (k1= ident | '(' k1= ident ( ',' kn= ident )* ')' );
	public final void pkDef(CreateTableStatement.RawStatement expr) throws RecognitionException {
		ColumnIdentifier k1 =null;
		ColumnIdentifier kn =null;

		List<ColumnIdentifier> l = new ArrayList<ColumnIdentifier>();
		try {
			// Parser.g:790:5: (k1= ident | '(' k1= ident ( ',' kn= ident )* ')' )
			int alt97=2;
			int LA97_0 = input.LA(1);
			if ( (LA97_0==IDENT||(LA97_0 >= K_AGGREGATE && LA97_0 <= K_ALL)||LA97_0==K_AS||LA97_0==K_ASCII||(LA97_0 >= K_BIGINT && LA97_0 <= K_BOOLEAN)||(LA97_0 >= K_CALLED && LA97_0 <= K_CLUSTERING)||(LA97_0 >= K_COMPACT && LA97_0 <= K_COUNTER)||(LA97_0 >= K_CUSTOM && LA97_0 <= K_DECIMAL)||(LA97_0 >= K_DISTINCT && LA97_0 <= K_DOUBLE)||LA97_0==K_DURATION||(LA97_0 >= K_EXISTS && LA97_0 <= K_FLOAT)||LA97_0==K_FROZEN||(LA97_0 >= K_FUNCTION && LA97_0 <= K_FUNCTIONS)||LA97_0==K_GROUP||(LA97_0 >= K_INET && LA97_0 <= K_INPUT)||LA97_0==K_INT||(LA97_0 >= K_JSON && LA97_0 <= K_KEYS)||(LA97_0 >= K_KEYSPACES && LA97_0 <= K_LIKE)||(LA97_0 >= K_LIST && LA97_0 <= K_MAP)||LA97_0==K_NOLOGIN||LA97_0==K_NOSUPERUSER||LA97_0==K_OPTIONS||(LA97_0 >= K_PARTITION && LA97_0 <= K_PERMISSIONS)||LA97_0==K_RETURNS||(LA97_0 >= K_ROLE && LA97_0 <= K_ROLES)||(LA97_0 >= K_SFUNC && LA97_0 <= K_TINYINT)||LA97_0==K_TRIGGER||(LA97_0 >= K_TTL && LA97_0 <= K_TYPE)||(LA97_0 >= K_USER && LA97_0 <= K_USERS)||(LA97_0 >= K_UUID && LA97_0 <= K_VARINT)||LA97_0==K_WRITETIME||LA97_0==QUOTED_NAME) ) {
				alt97=1;
			}
			else if ( (LA97_0==187) ) {
				alt97=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 97, 0, input);
				throw nvae;
			}

			switch (alt97) {
				case 1 :
					// Parser.g:790:7: k1= ident
					{
					pushFollow(FOLLOW_ident_in_pkDef5213);
					k1=ident();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) { l.add(k1);}
					}
					break;
				case 2 :
					// Parser.g:791:7: '(' k1= ident ( ',' kn= ident )* ')'
					{
					match(input,187,FOLLOW_187_in_pkDef5223); if (state.failed) return;
					pushFollow(FOLLOW_ident_in_pkDef5227);
					k1=ident();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) { l.add(k1); }
					// Parser.g:791:35: ( ',' kn= ident )*
					loop96:
					while (true) {
						int alt96=2;
						int LA96_0 = input.LA(1);
						if ( (LA96_0==191) ) {
							alt96=1;
						}

						switch (alt96) {
						case 1 :
							// Parser.g:791:37: ',' kn= ident
							{
							match(input,191,FOLLOW_191_in_pkDef5233); if (state.failed) return;
							pushFollow(FOLLOW_ident_in_pkDef5237);
							kn=ident();
							state._fsp--;
							if (state.failed) return;
							if ( state.backtracking==0 ) { l.add(kn); }
							}
							break;

						default :
							break loop96;
						}
					}

					match(input,188,FOLLOW_188_in_pkDef5244); if (state.failed) return;
					}
					break;

			}
			if ( state.backtracking==0 ) { expr.addKeyAliases(l); }
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "pkDef"



	// $ANTLR start "cfamProperty"
	// Parser.g:794:1: cfamProperty[CFProperties props] : ( property[props.properties] | K_COMPACT K_STORAGE | K_CLUSTERING K_ORDER K_BY '(' cfamOrdering[props] ( ',' cfamOrdering[props] )* ')' );
	public final void cfamProperty(CFProperties props) throws RecognitionException {
		try {
			// Parser.g:795:5: ( property[props.properties] | K_COMPACT K_STORAGE | K_CLUSTERING K_ORDER K_BY '(' cfamOrdering[props] ( ',' cfamOrdering[props] )* ')' )
			int alt99=3;
			switch ( input.LA(1) ) {
			case IDENT:
			case K_AGGREGATE:
			case K_ALL:
			case K_AS:
			case K_ASCII:
			case K_BIGINT:
			case K_BLOB:
			case K_BOOLEAN:
			case K_CALLED:
			case K_CAST:
			case K_CONTAINS:
			case K_COUNT:
			case K_COUNTER:
			case K_CUSTOM:
			case K_DATE:
			case K_DECIMAL:
			case K_DISTINCT:
			case K_DOUBLE:
			case K_DURATION:
			case K_EXISTS:
			case K_FILTERING:
			case K_FINALFUNC:
			case K_FLOAT:
			case K_FROZEN:
			case K_FUNCTION:
			case K_FUNCTIONS:
			case K_GROUP:
			case K_INET:
			case K_INITCOND:
			case K_INPUT:
			case K_INT:
			case K_JSON:
			case K_KEY:
			case K_KEYS:
			case K_KEYSPACES:
			case K_LANGUAGE:
			case K_LIKE:
			case K_LIST:
			case K_LOGIN:
			case K_MAP:
			case K_NOLOGIN:
			case K_NOSUPERUSER:
			case K_OPTIONS:
			case K_PARTITION:
			case K_PASSWORD:
			case K_PER:
			case K_PERMISSION:
			case K_PERMISSIONS:
			case K_RETURNS:
			case K_ROLE:
			case K_ROLES:
			case K_SFUNC:
			case K_SMALLINT:
			case K_STATIC:
			case K_STORAGE:
			case K_STYPE:
			case K_SUPERUSER:
			case K_TEXT:
			case K_TIME:
			case K_TIMESTAMP:
			case K_TIMEUUID:
			case K_TINYINT:
			case K_TRIGGER:
			case K_TTL:
			case K_TUPLE:
			case K_TYPE:
			case K_USER:
			case K_USERS:
			case K_UUID:
			case K_VALUES:
			case K_VARCHAR:
			case K_VARINT:
			case K_WRITETIME:
			case QUOTED_NAME:
				{
				alt99=1;
				}
				break;
			case K_COMPACT:
				{
				int LA99_2 = input.LA(2);
				if ( (LA99_2==K_STORAGE) ) {
					alt99=2;
				}
				else if ( (LA99_2==200) ) {
					alt99=1;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 99, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case K_CLUSTERING:
				{
				int LA99_3 = input.LA(2);
				if ( (LA99_3==K_ORDER) ) {
					alt99=3;
				}
				else if ( (LA99_3==200) ) {
					alt99=1;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 99, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 99, 0, input);
				throw nvae;
			}
			switch (alt99) {
				case 1 :
					// Parser.g:795:7: property[props.properties]
					{
					pushFollow(FOLLOW_property_in_cfamProperty5262);
					property(props.properties);
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// Parser.g:796:7: K_COMPACT K_STORAGE
					{
					match(input,K_COMPACT,FOLLOW_K_COMPACT_in_cfamProperty5271); if (state.failed) return;
					match(input,K_STORAGE,FOLLOW_K_STORAGE_in_cfamProperty5273); if (state.failed) return;
					if ( state.backtracking==0 ) { props.setCompactStorage(); }
					}
					break;
				case 3 :
					// Parser.g:797:7: K_CLUSTERING K_ORDER K_BY '(' cfamOrdering[props] ( ',' cfamOrdering[props] )* ')'
					{
					match(input,K_CLUSTERING,FOLLOW_K_CLUSTERING_in_cfamProperty5283); if (state.failed) return;
					match(input,K_ORDER,FOLLOW_K_ORDER_in_cfamProperty5285); if (state.failed) return;
					match(input,K_BY,FOLLOW_K_BY_in_cfamProperty5287); if (state.failed) return;
					match(input,187,FOLLOW_187_in_cfamProperty5289); if (state.failed) return;
					pushFollow(FOLLOW_cfamOrdering_in_cfamProperty5291);
					cfamOrdering(props);
					state._fsp--;
					if (state.failed) return;
					// Parser.g:797:57: ( ',' cfamOrdering[props] )*
					loop98:
					while (true) {
						int alt98=2;
						int LA98_0 = input.LA(1);
						if ( (LA98_0==191) ) {
							alt98=1;
						}

						switch (alt98) {
						case 1 :
							// Parser.g:797:58: ',' cfamOrdering[props]
							{
							match(input,191,FOLLOW_191_in_cfamProperty5295); if (state.failed) return;
							pushFollow(FOLLOW_cfamOrdering_in_cfamProperty5297);
							cfamOrdering(props);
							state._fsp--;
							if (state.failed) return;
							}
							break;

						default :
							break loop98;
						}
					}

					match(input,188,FOLLOW_188_in_cfamProperty5302); if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "cfamProperty"



	// $ANTLR start "cfamOrdering"
	// Parser.g:800:1: cfamOrdering[CFProperties props] : k= ident ( K_ASC | K_DESC ) ;
	public final void cfamOrdering(CFProperties props) throws RecognitionException {
		ColumnIdentifier k =null;

		 boolean reversed=false; 
		try {
			// Parser.g:802:5: (k= ident ( K_ASC | K_DESC ) )
			// Parser.g:802:7: k= ident ( K_ASC | K_DESC )
			{
			pushFollow(FOLLOW_ident_in_cfamOrdering5330);
			k=ident();
			state._fsp--;
			if (state.failed) return;
			// Parser.g:802:15: ( K_ASC | K_DESC )
			int alt100=2;
			int LA100_0 = input.LA(1);
			if ( (LA100_0==K_ASC) ) {
				alt100=1;
			}
			else if ( (LA100_0==K_DESC) ) {
				alt100=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 100, 0, input);
				throw nvae;
			}

			switch (alt100) {
				case 1 :
					// Parser.g:802:16: K_ASC
					{
					match(input,K_ASC,FOLLOW_K_ASC_in_cfamOrdering5333); if (state.failed) return;
					}
					break;
				case 2 :
					// Parser.g:802:24: K_DESC
					{
					match(input,K_DESC,FOLLOW_K_DESC_in_cfamOrdering5337); if (state.failed) return;
					if ( state.backtracking==0 ) { reversed=true;}
					}
					break;

			}

			if ( state.backtracking==0 ) { props.setOrdering(k, reversed); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "cfamOrdering"



	// $ANTLR start "createTypeStatement"
	// Parser.g:813:1: createTypeStatement returns [CreateTypeStatement expr] : K_CREATE K_TYPE ( K_IF K_NOT K_EXISTS )? tn= userTypeName '(' typeColumns[expr] ( ',' ( typeColumns[expr] )? )* ')' ;
	public final CreateTypeStatement createTypeStatement() throws RecognitionException {
		CreateTypeStatement expr = null;


		UTName tn =null;

		 boolean ifNotExists = false; 
		try {
			// Parser.g:815:5: ( K_CREATE K_TYPE ( K_IF K_NOT K_EXISTS )? tn= userTypeName '(' typeColumns[expr] ( ',' ( typeColumns[expr] )? )* ')' )
			// Parser.g:815:7: K_CREATE K_TYPE ( K_IF K_NOT K_EXISTS )? tn= userTypeName '(' typeColumns[expr] ( ',' ( typeColumns[expr] )? )* ')'
			{
			match(input,K_CREATE,FOLLOW_K_CREATE_in_createTypeStatement5376); if (state.failed) return expr;
			match(input,K_TYPE,FOLLOW_K_TYPE_in_createTypeStatement5378); if (state.failed) return expr;
			// Parser.g:815:23: ( K_IF K_NOT K_EXISTS )?
			int alt101=2;
			int LA101_0 = input.LA(1);
			if ( (LA101_0==K_IF) ) {
				alt101=1;
			}
			switch (alt101) {
				case 1 :
					// Parser.g:815:24: K_IF K_NOT K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_createTypeStatement5381); if (state.failed) return expr;
					match(input,K_NOT,FOLLOW_K_NOT_in_createTypeStatement5383); if (state.failed) return expr;
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_createTypeStatement5385); if (state.failed) return expr;
					if ( state.backtracking==0 ) { ifNotExists = true; }
					}
					break;

			}

			pushFollow(FOLLOW_userTypeName_in_createTypeStatement5403);
			tn=userTypeName();
			state._fsp--;
			if (state.failed) return expr;
			if ( state.backtracking==0 ) { expr = new CreateTypeStatement(tn, ifNotExists); }
			match(input,187,FOLLOW_187_in_createTypeStatement5416); if (state.failed) return expr;
			pushFollow(FOLLOW_typeColumns_in_createTypeStatement5418);
			typeColumns(expr);
			state._fsp--;
			if (state.failed) return expr;
			// Parser.g:817:32: ( ',' ( typeColumns[expr] )? )*
			loop103:
			while (true) {
				int alt103=2;
				int LA103_0 = input.LA(1);
				if ( (LA103_0==191) ) {
					alt103=1;
				}

				switch (alt103) {
				case 1 :
					// Parser.g:817:34: ',' ( typeColumns[expr] )?
					{
					match(input,191,FOLLOW_191_in_createTypeStatement5423); if (state.failed) return expr;
					// Parser.g:817:38: ( typeColumns[expr] )?
					int alt102=2;
					int LA102_0 = input.LA(1);
					if ( (LA102_0==IDENT||(LA102_0 >= K_AGGREGATE && LA102_0 <= K_ALL)||LA102_0==K_AS||LA102_0==K_ASCII||(LA102_0 >= K_BIGINT && LA102_0 <= K_BOOLEAN)||(LA102_0 >= K_CALLED && LA102_0 <= K_CLUSTERING)||(LA102_0 >= K_COMPACT && LA102_0 <= K_COUNTER)||(LA102_0 >= K_CUSTOM && LA102_0 <= K_DECIMAL)||(LA102_0 >= K_DISTINCT && LA102_0 <= K_DOUBLE)||LA102_0==K_DURATION||(LA102_0 >= K_EXISTS && LA102_0 <= K_FLOAT)||LA102_0==K_FROZEN||(LA102_0 >= K_FUNCTION && LA102_0 <= K_FUNCTIONS)||LA102_0==K_GROUP||(LA102_0 >= K_INET && LA102_0 <= K_INPUT)||LA102_0==K_INT||(LA102_0 >= K_JSON && LA102_0 <= K_KEYS)||(LA102_0 >= K_KEYSPACES && LA102_0 <= K_LIKE)||(LA102_0 >= K_LIST && LA102_0 <= K_MAP)||LA102_0==K_NOLOGIN||LA102_0==K_NOSUPERUSER||LA102_0==K_OPTIONS||(LA102_0 >= K_PARTITION && LA102_0 <= K_PERMISSIONS)||LA102_0==K_RETURNS||(LA102_0 >= K_ROLE && LA102_0 <= K_ROLES)||(LA102_0 >= K_SFUNC && LA102_0 <= K_TINYINT)||LA102_0==K_TRIGGER||(LA102_0 >= K_TTL && LA102_0 <= K_TYPE)||(LA102_0 >= K_USER && LA102_0 <= K_USERS)||(LA102_0 >= K_UUID && LA102_0 <= K_VARINT)||LA102_0==K_WRITETIME||LA102_0==QUOTED_NAME) ) {
						alt102=1;
					}
					switch (alt102) {
						case 1 :
							// Parser.g:817:38: typeColumns[expr]
							{
							pushFollow(FOLLOW_typeColumns_in_createTypeStatement5425);
							typeColumns(expr);
							state._fsp--;
							if (state.failed) return expr;
							}
							break;

					}

					}
					break;

				default :
					break loop103;
				}
			}

			match(input,188,FOLLOW_188_in_createTypeStatement5432); if (state.failed) return expr;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "createTypeStatement"



	// $ANTLR start "typeColumns"
	// Parser.g:820:1: typeColumns[CreateTypeStatement expr] : k= fident v= comparatorType ;
	public final void typeColumns(CreateTypeStatement expr) throws RecognitionException {
		FieldIdentifier k =null;
		CQL3Type.Raw v =null;

		try {
			// Parser.g:821:5: (k= fident v= comparatorType )
			// Parser.g:821:7: k= fident v= comparatorType
			{
			pushFollow(FOLLOW_fident_in_typeColumns5452);
			k=fident();
			state._fsp--;
			if (state.failed) return;
			pushFollow(FOLLOW_comparatorType_in_typeColumns5456);
			v=comparatorType();
			state._fsp--;
			if (state.failed) return;
			if ( state.backtracking==0 ) { expr.addDefinition(k, v); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "typeColumns"



	// $ANTLR start "createIndexStatement"
	// Parser.g:829:1: createIndexStatement returns [CreateIndexStatement expr] : K_CREATE ( K_CUSTOM )? K_INDEX ( K_IF K_NOT K_EXISTS )? ( idxName[name] )? K_ON cf= columnFamilyName '(' ( indexIdent[targets] ( ',' indexIdent[targets] )* )? ')' ( K_USING cls= STRING_LITERAL )? ( K_WITH properties[props] )? ;
	public final CreateIndexStatement createIndexStatement() throws RecognitionException {
		CreateIndexStatement expr = null;


		Token cls=null;
		CFName cf =null;


		        IndexPropDefs props = new IndexPropDefs();
		        boolean ifNotExists = false;
		        IndexName name = new IndexName();
		        List<IndexTarget.Raw> targets = new ArrayList<>();
		    
		try {
			// Parser.g:836:5: ( K_CREATE ( K_CUSTOM )? K_INDEX ( K_IF K_NOT K_EXISTS )? ( idxName[name] )? K_ON cf= columnFamilyName '(' ( indexIdent[targets] ( ',' indexIdent[targets] )* )? ')' ( K_USING cls= STRING_LITERAL )? ( K_WITH properties[props] )? )
			// Parser.g:836:7: K_CREATE ( K_CUSTOM )? K_INDEX ( K_IF K_NOT K_EXISTS )? ( idxName[name] )? K_ON cf= columnFamilyName '(' ( indexIdent[targets] ( ',' indexIdent[targets] )* )? ')' ( K_USING cls= STRING_LITERAL )? ( K_WITH properties[props] )?
			{
			match(input,K_CREATE,FOLLOW_K_CREATE_in_createIndexStatement5491); if (state.failed) return expr;
			// Parser.g:836:16: ( K_CUSTOM )?
			int alt104=2;
			int LA104_0 = input.LA(1);
			if ( (LA104_0==K_CUSTOM) ) {
				alt104=1;
			}
			switch (alt104) {
				case 1 :
					// Parser.g:836:17: K_CUSTOM
					{
					match(input,K_CUSTOM,FOLLOW_K_CUSTOM_in_createIndexStatement5494); if (state.failed) return expr;
					if ( state.backtracking==0 ) { props.isCustom = true; }
					}
					break;

			}

			match(input,K_INDEX,FOLLOW_K_INDEX_in_createIndexStatement5500); if (state.failed) return expr;
			// Parser.g:836:63: ( K_IF K_NOT K_EXISTS )?
			int alt105=2;
			int LA105_0 = input.LA(1);
			if ( (LA105_0==K_IF) ) {
				alt105=1;
			}
			switch (alt105) {
				case 1 :
					// Parser.g:836:64: K_IF K_NOT K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_createIndexStatement5503); if (state.failed) return expr;
					match(input,K_NOT,FOLLOW_K_NOT_in_createIndexStatement5505); if (state.failed) return expr;
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_createIndexStatement5507); if (state.failed) return expr;
					if ( state.backtracking==0 ) { ifNotExists = true; }
					}
					break;

			}

			// Parser.g:837:9: ( idxName[name] )?
			int alt106=2;
			int LA106_0 = input.LA(1);
			if ( (LA106_0==IDENT||(LA106_0 >= K_AGGREGATE && LA106_0 <= K_ALL)||LA106_0==K_AS||LA106_0==K_ASCII||(LA106_0 >= K_BIGINT && LA106_0 <= K_BOOLEAN)||(LA106_0 >= K_CALLED && LA106_0 <= K_CLUSTERING)||(LA106_0 >= K_COMPACT && LA106_0 <= K_COUNTER)||(LA106_0 >= K_CUSTOM && LA106_0 <= K_DECIMAL)||(LA106_0 >= K_DISTINCT && LA106_0 <= K_DOUBLE)||LA106_0==K_DURATION||(LA106_0 >= K_EXISTS && LA106_0 <= K_FLOAT)||LA106_0==K_FROZEN||(LA106_0 >= K_FUNCTION && LA106_0 <= K_FUNCTIONS)||LA106_0==K_GROUP||(LA106_0 >= K_INET && LA106_0 <= K_INPUT)||LA106_0==K_INT||(LA106_0 >= K_JSON && LA106_0 <= K_KEYS)||(LA106_0 >= K_KEYSPACES && LA106_0 <= K_LIKE)||(LA106_0 >= K_LIST && LA106_0 <= K_MAP)||LA106_0==K_NOLOGIN||LA106_0==K_NOSUPERUSER||LA106_0==K_OPTIONS||(LA106_0 >= K_PARTITION && LA106_0 <= K_PERMISSIONS)||LA106_0==K_RETURNS||(LA106_0 >= K_ROLE && LA106_0 <= K_ROLES)||(LA106_0 >= K_SFUNC && LA106_0 <= K_TINYINT)||LA106_0==K_TRIGGER||(LA106_0 >= K_TTL && LA106_0 <= K_TYPE)||(LA106_0 >= K_USER && LA106_0 <= K_USERS)||(LA106_0 >= K_UUID && LA106_0 <= K_VARINT)||LA106_0==K_WRITETIME||(LA106_0 >= QMARK && LA106_0 <= QUOTED_NAME)) ) {
				alt106=1;
			}
			switch (alt106) {
				case 1 :
					// Parser.g:837:10: idxName[name]
					{
					pushFollow(FOLLOW_idxName_in_createIndexStatement5523);
					idxName(name);
					state._fsp--;
					if (state.failed) return expr;
					}
					break;

			}

			match(input,K_ON,FOLLOW_K_ON_in_createIndexStatement5528); if (state.failed) return expr;
			pushFollow(FOLLOW_columnFamilyName_in_createIndexStatement5532);
			cf=columnFamilyName();
			state._fsp--;
			if (state.failed) return expr;
			match(input,187,FOLLOW_187_in_createIndexStatement5534); if (state.failed) return expr;
			// Parser.g:837:55: ( indexIdent[targets] ( ',' indexIdent[targets] )* )?
			int alt108=2;
			int LA108_0 = input.LA(1);
			if ( (LA108_0==IDENT||(LA108_0 >= K_AGGREGATE && LA108_0 <= K_ALL)||LA108_0==K_AS||LA108_0==K_ASCII||(LA108_0 >= K_BIGINT && LA108_0 <= K_BOOLEAN)||(LA108_0 >= K_CALLED && LA108_0 <= K_CLUSTERING)||(LA108_0 >= K_COMPACT && LA108_0 <= K_COUNTER)||(LA108_0 >= K_CUSTOM && LA108_0 <= K_DECIMAL)||(LA108_0 >= K_DISTINCT && LA108_0 <= K_DOUBLE)||(LA108_0 >= K_DURATION && LA108_0 <= K_ENTRIES)||(LA108_0 >= K_EXISTS && LA108_0 <= K_FLOAT)||(LA108_0 >= K_FROZEN && LA108_0 <= K_FUNCTIONS)||LA108_0==K_GROUP||(LA108_0 >= K_INET && LA108_0 <= K_INPUT)||LA108_0==K_INT||(LA108_0 >= K_JSON && LA108_0 <= K_KEYS)||(LA108_0 >= K_KEYSPACES && LA108_0 <= K_LIKE)||(LA108_0 >= K_LIST && LA108_0 <= K_MAP)||LA108_0==K_NOLOGIN||LA108_0==K_NOSUPERUSER||LA108_0==K_OPTIONS||(LA108_0 >= K_PARTITION && LA108_0 <= K_PERMISSIONS)||LA108_0==K_RETURNS||(LA108_0 >= K_ROLE && LA108_0 <= K_ROLES)||(LA108_0 >= K_SFUNC && LA108_0 <= K_TINYINT)||LA108_0==K_TRIGGER||(LA108_0 >= K_TTL && LA108_0 <= K_TYPE)||(LA108_0 >= K_USER && LA108_0 <= K_USERS)||(LA108_0 >= K_UUID && LA108_0 <= K_VARINT)||LA108_0==K_WRITETIME||LA108_0==QUOTED_NAME) ) {
				alt108=1;
			}
			switch (alt108) {
				case 1 :
					// Parser.g:837:56: indexIdent[targets] ( ',' indexIdent[targets] )*
					{
					pushFollow(FOLLOW_indexIdent_in_createIndexStatement5537);
					indexIdent(targets);
					state._fsp--;
					if (state.failed) return expr;
					// Parser.g:837:76: ( ',' indexIdent[targets] )*
					loop107:
					while (true) {
						int alt107=2;
						int LA107_0 = input.LA(1);
						if ( (LA107_0==191) ) {
							alt107=1;
						}

						switch (alt107) {
						case 1 :
							// Parser.g:837:77: ',' indexIdent[targets]
							{
							match(input,191,FOLLOW_191_in_createIndexStatement5541); if (state.failed) return expr;
							pushFollow(FOLLOW_indexIdent_in_createIndexStatement5543);
							indexIdent(targets);
							state._fsp--;
							if (state.failed) return expr;
							}
							break;

						default :
							break loop107;
						}
					}

					}
					break;

			}

			match(input,188,FOLLOW_188_in_createIndexStatement5550); if (state.failed) return expr;
			// Parser.g:838:9: ( K_USING cls= STRING_LITERAL )?
			int alt109=2;
			int LA109_0 = input.LA(1);
			if ( (LA109_0==K_USING) ) {
				alt109=1;
			}
			switch (alt109) {
				case 1 :
					// Parser.g:838:10: K_USING cls= STRING_LITERAL
					{
					match(input,K_USING,FOLLOW_K_USING_in_createIndexStatement5561); if (state.failed) return expr;
					cls=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_createIndexStatement5565); if (state.failed) return expr;
					if ( state.backtracking==0 ) { props.customClass = (cls!=null?cls.getText():null); }
					}
					break;

			}

			// Parser.g:839:9: ( K_WITH properties[props] )?
			int alt110=2;
			int LA110_0 = input.LA(1);
			if ( (LA110_0==K_WITH) ) {
				alt110=1;
			}
			switch (alt110) {
				case 1 :
					// Parser.g:839:10: K_WITH properties[props]
					{
					match(input,K_WITH,FOLLOW_K_WITH_in_createIndexStatement5580); if (state.failed) return expr;
					pushFollow(FOLLOW_properties_in_createIndexStatement5582);
					properties(props);
					state._fsp--;
					if (state.failed) return expr;
					}
					break;

			}

			if ( state.backtracking==0 ) { expr = new CreateIndexStatement(cf, name, targets, props, ifNotExists); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "createIndexStatement"



	// $ANTLR start "indexIdent"
	// Parser.g:843:1: indexIdent[List<IndexTarget.Raw> targets] : (c= cident | K_VALUES '(' c= cident ')' | K_KEYS '(' c= cident ')' | K_ENTRIES '(' c= cident ')' | K_FULL '(' c= cident ')' );
	public final void indexIdent(List<IndexTarget.Raw> targets) throws RecognitionException {
		ColumnMetadata.Raw c =null;

		try {
			// Parser.g:844:5: (c= cident | K_VALUES '(' c= cident ')' | K_KEYS '(' c= cident ')' | K_ENTRIES '(' c= cident ')' | K_FULL '(' c= cident ')' )
			int alt111=5;
			switch ( input.LA(1) ) {
			case IDENT:
			case K_AGGREGATE:
			case K_ALL:
			case K_AS:
			case K_ASCII:
			case K_BIGINT:
			case K_BLOB:
			case K_BOOLEAN:
			case K_CALLED:
			case K_CAST:
			case K_CLUSTERING:
			case K_COMPACT:
			case K_CONTAINS:
			case K_COUNT:
			case K_COUNTER:
			case K_CUSTOM:
			case K_DATE:
			case K_DECIMAL:
			case K_DISTINCT:
			case K_DOUBLE:
			case K_DURATION:
			case K_EXISTS:
			case K_FILTERING:
			case K_FINALFUNC:
			case K_FLOAT:
			case K_FROZEN:
			case K_FUNCTION:
			case K_FUNCTIONS:
			case K_GROUP:
			case K_INET:
			case K_INITCOND:
			case K_INPUT:
			case K_INT:
			case K_JSON:
			case K_KEY:
			case K_KEYSPACES:
			case K_LANGUAGE:
			case K_LIKE:
			case K_LIST:
			case K_LOGIN:
			case K_MAP:
			case K_NOLOGIN:
			case K_NOSUPERUSER:
			case K_OPTIONS:
			case K_PARTITION:
			case K_PASSWORD:
			case K_PER:
			case K_PERMISSION:
			case K_PERMISSIONS:
			case K_RETURNS:
			case K_ROLE:
			case K_ROLES:
			case K_SFUNC:
			case K_SMALLINT:
			case K_STATIC:
			case K_STORAGE:
			case K_STYPE:
			case K_SUPERUSER:
			case K_TEXT:
			case K_TIME:
			case K_TIMESTAMP:
			case K_TIMEUUID:
			case K_TINYINT:
			case K_TRIGGER:
			case K_TTL:
			case K_TUPLE:
			case K_TYPE:
			case K_USER:
			case K_USERS:
			case K_UUID:
			case K_VARCHAR:
			case K_VARINT:
			case K_WRITETIME:
			case QUOTED_NAME:
				{
				alt111=1;
				}
				break;
			case K_VALUES:
				{
				int LA111_2 = input.LA(2);
				if ( (LA111_2==187) ) {
					alt111=2;
				}
				else if ( (LA111_2==188||LA111_2==191) ) {
					alt111=1;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 111, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case K_KEYS:
				{
				int LA111_3 = input.LA(2);
				if ( (LA111_3==187) ) {
					alt111=3;
				}
				else if ( (LA111_3==188||LA111_3==191) ) {
					alt111=1;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 111, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case K_ENTRIES:
				{
				alt111=4;
				}
				break;
			case K_FULL:
				{
				alt111=5;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 111, 0, input);
				throw nvae;
			}
			switch (alt111) {
				case 1 :
					// Parser.g:844:7: c= cident
					{
					pushFollow(FOLLOW_cident_in_indexIdent5614);
					c=cident();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) { targets.add(IndexTarget.Raw.simpleIndexOn(c)); }
					}
					break;
				case 2 :
					// Parser.g:845:7: K_VALUES '(' c= cident ')'
					{
					match(input,K_VALUES,FOLLOW_K_VALUES_in_indexIdent5642); if (state.failed) return;
					match(input,187,FOLLOW_187_in_indexIdent5644); if (state.failed) return;
					pushFollow(FOLLOW_cident_in_indexIdent5648);
					c=cident();
					state._fsp--;
					if (state.failed) return;
					match(input,188,FOLLOW_188_in_indexIdent5650); if (state.failed) return;
					if ( state.backtracking==0 ) { targets.add(IndexTarget.Raw.valuesOf(c)); }
					}
					break;
				case 3 :
					// Parser.g:846:7: K_KEYS '(' c= cident ')'
					{
					match(input,K_KEYS,FOLLOW_K_KEYS_in_indexIdent5661); if (state.failed) return;
					match(input,187,FOLLOW_187_in_indexIdent5663); if (state.failed) return;
					pushFollow(FOLLOW_cident_in_indexIdent5667);
					c=cident();
					state._fsp--;
					if (state.failed) return;
					match(input,188,FOLLOW_188_in_indexIdent5669); if (state.failed) return;
					if ( state.backtracking==0 ) { targets.add(IndexTarget.Raw.keysOf(c)); }
					}
					break;
				case 4 :
					// Parser.g:847:7: K_ENTRIES '(' c= cident ')'
					{
					match(input,K_ENTRIES,FOLLOW_K_ENTRIES_in_indexIdent5682); if (state.failed) return;
					match(input,187,FOLLOW_187_in_indexIdent5684); if (state.failed) return;
					pushFollow(FOLLOW_cident_in_indexIdent5688);
					c=cident();
					state._fsp--;
					if (state.failed) return;
					match(input,188,FOLLOW_188_in_indexIdent5690); if (state.failed) return;
					if ( state.backtracking==0 ) { targets.add(IndexTarget.Raw.keysAndValuesOf(c)); }
					}
					break;
				case 5 :
					// Parser.g:848:7: K_FULL '(' c= cident ')'
					{
					match(input,K_FULL,FOLLOW_K_FULL_in_indexIdent5700); if (state.failed) return;
					match(input,187,FOLLOW_187_in_indexIdent5702); if (state.failed) return;
					pushFollow(FOLLOW_cident_in_indexIdent5706);
					c=cident();
					state._fsp--;
					if (state.failed) return;
					match(input,188,FOLLOW_188_in_indexIdent5708); if (state.failed) return;
					if ( state.backtracking==0 ) { targets.add(IndexTarget.Raw.fullCollection(c)); }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "indexIdent"



	// $ANTLR start "createMaterializedViewStatement"
	// Parser.g:859:1: createMaterializedViewStatement returns [CreateViewStatement expr] : K_CREATE K_MATERIALIZED K_VIEW ( K_IF K_NOT K_EXISTS )? cf= columnFamilyName K_AS K_SELECT sclause= selectors K_FROM basecf= columnFamilyName ( K_WHERE wclause= whereClause )? K_PRIMARY K_KEY ( '(' '(' k1= cident ( ',' kn= cident )* ')' ( ',' c1= cident )* ')' | '(' k1= cident ( ',' cn= cident )* ')' ) ( K_WITH cfamProperty[expr.properties] ( K_AND cfamProperty[expr.properties] )* )? ;
	public final CreateViewStatement createMaterializedViewStatement() throws RecognitionException {
		CreateViewStatement expr = null;


		CFName cf =null;
		List<RawSelector> sclause =null;
		CFName basecf =null;
		WhereClause.Builder wclause =null;
		ColumnMetadata.Raw k1 =null;
		ColumnMetadata.Raw kn =null;
		ColumnMetadata.Raw c1 =null;
		ColumnMetadata.Raw cn =null;


		        boolean ifNotExists = false;
		        List<ColumnMetadata.Raw> partitionKeys = new ArrayList<>();
		        List<ColumnMetadata.Raw> compositeKeys = new ArrayList<>();
		    
		try {
			// Parser.g:865:5: ( K_CREATE K_MATERIALIZED K_VIEW ( K_IF K_NOT K_EXISTS )? cf= columnFamilyName K_AS K_SELECT sclause= selectors K_FROM basecf= columnFamilyName ( K_WHERE wclause= whereClause )? K_PRIMARY K_KEY ( '(' '(' k1= cident ( ',' kn= cident )* ')' ( ',' c1= cident )* ')' | '(' k1= cident ( ',' cn= cident )* ')' ) ( K_WITH cfamProperty[expr.properties] ( K_AND cfamProperty[expr.properties] )* )? )
			// Parser.g:865:7: K_CREATE K_MATERIALIZED K_VIEW ( K_IF K_NOT K_EXISTS )? cf= columnFamilyName K_AS K_SELECT sclause= selectors K_FROM basecf= columnFamilyName ( K_WHERE wclause= whereClause )? K_PRIMARY K_KEY ( '(' '(' k1= cident ( ',' kn= cident )* ')' ( ',' c1= cident )* ')' | '(' k1= cident ( ',' cn= cident )* ')' ) ( K_WITH cfamProperty[expr.properties] ( K_AND cfamProperty[expr.properties] )* )?
			{
			match(input,K_CREATE,FOLLOW_K_CREATE_in_createMaterializedViewStatement5745); if (state.failed) return expr;
			match(input,K_MATERIALIZED,FOLLOW_K_MATERIALIZED_in_createMaterializedViewStatement5747); if (state.failed) return expr;
			match(input,K_VIEW,FOLLOW_K_VIEW_in_createMaterializedViewStatement5749); if (state.failed) return expr;
			// Parser.g:865:38: ( K_IF K_NOT K_EXISTS )?
			int alt112=2;
			int LA112_0 = input.LA(1);
			if ( (LA112_0==K_IF) ) {
				alt112=1;
			}
			switch (alt112) {
				case 1 :
					// Parser.g:865:39: K_IF K_NOT K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_createMaterializedViewStatement5752); if (state.failed) return expr;
					match(input,K_NOT,FOLLOW_K_NOT_in_createMaterializedViewStatement5754); if (state.failed) return expr;
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_createMaterializedViewStatement5756); if (state.failed) return expr;
					if ( state.backtracking==0 ) { ifNotExists = true; }
					}
					break;

			}

			pushFollow(FOLLOW_columnFamilyName_in_createMaterializedViewStatement5764);
			cf=columnFamilyName();
			state._fsp--;
			if (state.failed) return expr;
			match(input,K_AS,FOLLOW_K_AS_in_createMaterializedViewStatement5766); if (state.failed) return expr;
			match(input,K_SELECT,FOLLOW_K_SELECT_in_createMaterializedViewStatement5776); if (state.failed) return expr;
			pushFollow(FOLLOW_selectors_in_createMaterializedViewStatement5780);
			sclause=selectors();
			state._fsp--;
			if (state.failed) return expr;
			match(input,K_FROM,FOLLOW_K_FROM_in_createMaterializedViewStatement5782); if (state.failed) return expr;
			pushFollow(FOLLOW_columnFamilyName_in_createMaterializedViewStatement5786);
			basecf=columnFamilyName();
			state._fsp--;
			if (state.failed) return expr;
			// Parser.g:867:9: ( K_WHERE wclause= whereClause )?
			int alt113=2;
			int LA113_0 = input.LA(1);
			if ( (LA113_0==K_WHERE) ) {
				alt113=1;
			}
			switch (alt113) {
				case 1 :
					// Parser.g:867:10: K_WHERE wclause= whereClause
					{
					match(input,K_WHERE,FOLLOW_K_WHERE_in_createMaterializedViewStatement5797); if (state.failed) return expr;
					pushFollow(FOLLOW_whereClause_in_createMaterializedViewStatement5801);
					wclause=whereClause();
					state._fsp--;
					if (state.failed) return expr;
					}
					break;

			}

			match(input,K_PRIMARY,FOLLOW_K_PRIMARY_in_createMaterializedViewStatement5813); if (state.failed) return expr;
			match(input,K_KEY,FOLLOW_K_KEY_in_createMaterializedViewStatement5815); if (state.failed) return expr;
			// Parser.g:868:25: ( '(' '(' k1= cident ( ',' kn= cident )* ')' ( ',' c1= cident )* ')' | '(' k1= cident ( ',' cn= cident )* ')' )
			int alt117=2;
			int LA117_0 = input.LA(1);
			if ( (LA117_0==187) ) {
				int LA117_1 = input.LA(2);
				if ( (LA117_1==187) ) {
					alt117=1;
				}
				else if ( (LA117_1==IDENT||(LA117_1 >= K_AGGREGATE && LA117_1 <= K_ALL)||LA117_1==K_AS||LA117_1==K_ASCII||(LA117_1 >= K_BIGINT && LA117_1 <= K_BOOLEAN)||(LA117_1 >= K_CALLED && LA117_1 <= K_CLUSTERING)||(LA117_1 >= K_COMPACT && LA117_1 <= K_COUNTER)||(LA117_1 >= K_CUSTOM && LA117_1 <= K_DECIMAL)||(LA117_1 >= K_DISTINCT && LA117_1 <= K_DOUBLE)||LA117_1==K_DURATION||(LA117_1 >= K_EXISTS && LA117_1 <= K_FLOAT)||LA117_1==K_FROZEN||(LA117_1 >= K_FUNCTION && LA117_1 <= K_FUNCTIONS)||LA117_1==K_GROUP||(LA117_1 >= K_INET && LA117_1 <= K_INPUT)||LA117_1==K_INT||(LA117_1 >= K_JSON && LA117_1 <= K_KEYS)||(LA117_1 >= K_KEYSPACES && LA117_1 <= K_LIKE)||(LA117_1 >= K_LIST && LA117_1 <= K_MAP)||LA117_1==K_NOLOGIN||LA117_1==K_NOSUPERUSER||LA117_1==K_OPTIONS||(LA117_1 >= K_PARTITION && LA117_1 <= K_PERMISSIONS)||LA117_1==K_RETURNS||(LA117_1 >= K_ROLE && LA117_1 <= K_ROLES)||(LA117_1 >= K_SFUNC && LA117_1 <= K_TINYINT)||LA117_1==K_TRIGGER||(LA117_1 >= K_TTL && LA117_1 <= K_TYPE)||(LA117_1 >= K_USER && LA117_1 <= K_USERS)||(LA117_1 >= K_UUID && LA117_1 <= K_VARINT)||LA117_1==K_WRITETIME||LA117_1==QUOTED_NAME) ) {
					alt117=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return expr;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 117, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return expr;}
				NoViableAltException nvae =
					new NoViableAltException("", 117, 0, input);
				throw nvae;
			}

			switch (alt117) {
				case 1 :
					// Parser.g:869:9: '(' '(' k1= cident ( ',' kn= cident )* ')' ( ',' c1= cident )* ')'
					{
					match(input,187,FOLLOW_187_in_createMaterializedViewStatement5827); if (state.failed) return expr;
					match(input,187,FOLLOW_187_in_createMaterializedViewStatement5829); if (state.failed) return expr;
					pushFollow(FOLLOW_cident_in_createMaterializedViewStatement5833);
					k1=cident();
					state._fsp--;
					if (state.failed) return expr;
					if ( state.backtracking==0 ) { partitionKeys.add(k1); }
					// Parser.g:869:54: ( ',' kn= cident )*
					loop114:
					while (true) {
						int alt114=2;
						int LA114_0 = input.LA(1);
						if ( (LA114_0==191) ) {
							alt114=1;
						}

						switch (alt114) {
						case 1 :
							// Parser.g:869:56: ',' kn= cident
							{
							match(input,191,FOLLOW_191_in_createMaterializedViewStatement5839); if (state.failed) return expr;
							pushFollow(FOLLOW_cident_in_createMaterializedViewStatement5843);
							kn=cident();
							state._fsp--;
							if (state.failed) return expr;
							if ( state.backtracking==0 ) { partitionKeys.add(kn); }
							}
							break;

						default :
							break loop114;
						}
					}

					match(input,188,FOLLOW_188_in_createMaterializedViewStatement5850); if (state.failed) return expr;
					// Parser.g:869:104: ( ',' c1= cident )*
					loop115:
					while (true) {
						int alt115=2;
						int LA115_0 = input.LA(1);
						if ( (LA115_0==191) ) {
							alt115=1;
						}

						switch (alt115) {
						case 1 :
							// Parser.g:869:106: ',' c1= cident
							{
							match(input,191,FOLLOW_191_in_createMaterializedViewStatement5854); if (state.failed) return expr;
							pushFollow(FOLLOW_cident_in_createMaterializedViewStatement5858);
							c1=cident();
							state._fsp--;
							if (state.failed) return expr;
							if ( state.backtracking==0 ) { compositeKeys.add(c1); }
							}
							break;

						default :
							break loop115;
						}
					}

					match(input,188,FOLLOW_188_in_createMaterializedViewStatement5865); if (state.failed) return expr;
					}
					break;
				case 2 :
					// Parser.g:870:9: '(' k1= cident ( ',' cn= cident )* ')'
					{
					match(input,187,FOLLOW_187_in_createMaterializedViewStatement5875); if (state.failed) return expr;
					pushFollow(FOLLOW_cident_in_createMaterializedViewStatement5879);
					k1=cident();
					state._fsp--;
					if (state.failed) return expr;
					if ( state.backtracking==0 ) { partitionKeys.add(k1); }
					// Parser.g:870:50: ( ',' cn= cident )*
					loop116:
					while (true) {
						int alt116=2;
						int LA116_0 = input.LA(1);
						if ( (LA116_0==191) ) {
							alt116=1;
						}

						switch (alt116) {
						case 1 :
							// Parser.g:870:52: ',' cn= cident
							{
							match(input,191,FOLLOW_191_in_createMaterializedViewStatement5885); if (state.failed) return expr;
							pushFollow(FOLLOW_cident_in_createMaterializedViewStatement5889);
							cn=cident();
							state._fsp--;
							if (state.failed) return expr;
							if ( state.backtracking==0 ) { compositeKeys.add(cn); }
							}
							break;

						default :
							break loop116;
						}
					}

					match(input,188,FOLLOW_188_in_createMaterializedViewStatement5896); if (state.failed) return expr;
					}
					break;

			}

			if ( state.backtracking==0 ) {
			             WhereClause where = wclause == null ? WhereClause.empty() : wclause.build();
			             expr = new CreateViewStatement(cf, basecf, sclause, where, partitionKeys, compositeKeys, ifNotExists);
			        }
			// Parser.g:876:9: ( K_WITH cfamProperty[expr.properties] ( K_AND cfamProperty[expr.properties] )* )?
			int alt119=2;
			int LA119_0 = input.LA(1);
			if ( (LA119_0==K_WITH) ) {
				alt119=1;
			}
			switch (alt119) {
				case 1 :
					// Parser.g:876:11: K_WITH cfamProperty[expr.properties] ( K_AND cfamProperty[expr.properties] )*
					{
					match(input,K_WITH,FOLLOW_K_WITH_in_createMaterializedViewStatement5928); if (state.failed) return expr;
					pushFollow(FOLLOW_cfamProperty_in_createMaterializedViewStatement5930);
					cfamProperty(expr.properties);
					state._fsp--;
					if (state.failed) return expr;
					// Parser.g:876:48: ( K_AND cfamProperty[expr.properties] )*
					loop118:
					while (true) {
						int alt118=2;
						int LA118_0 = input.LA(1);
						if ( (LA118_0==K_AND) ) {
							alt118=1;
						}

						switch (alt118) {
						case 1 :
							// Parser.g:876:50: K_AND cfamProperty[expr.properties]
							{
							match(input,K_AND,FOLLOW_K_AND_in_createMaterializedViewStatement5935); if (state.failed) return expr;
							pushFollow(FOLLOW_cfamProperty_in_createMaterializedViewStatement5937);
							cfamProperty(expr.properties);
							state._fsp--;
							if (state.failed) return expr;
							}
							break;

						default :
							break loop118;
						}
					}

					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "createMaterializedViewStatement"



	// $ANTLR start "createTriggerStatement"
	// Parser.g:882:1: createTriggerStatement returns [CreateTriggerStatement expr] : K_CREATE K_TRIGGER ( K_IF K_NOT K_EXISTS )? (name= cident ) K_ON cf= columnFamilyName K_USING cls= STRING_LITERAL ;
	public final CreateTriggerStatement createTriggerStatement() throws RecognitionException {
		CreateTriggerStatement expr = null;


		Token cls=null;
		ColumnMetadata.Raw name =null;
		CFName cf =null;


		        boolean ifNotExists = false;
		    
		try {
			// Parser.g:886:5: ( K_CREATE K_TRIGGER ( K_IF K_NOT K_EXISTS )? (name= cident ) K_ON cf= columnFamilyName K_USING cls= STRING_LITERAL )
			// Parser.g:886:7: K_CREATE K_TRIGGER ( K_IF K_NOT K_EXISTS )? (name= cident ) K_ON cf= columnFamilyName K_USING cls= STRING_LITERAL
			{
			match(input,K_CREATE,FOLLOW_K_CREATE_in_createTriggerStatement5975); if (state.failed) return expr;
			match(input,K_TRIGGER,FOLLOW_K_TRIGGER_in_createTriggerStatement5977); if (state.failed) return expr;
			// Parser.g:886:26: ( K_IF K_NOT K_EXISTS )?
			int alt120=2;
			int LA120_0 = input.LA(1);
			if ( (LA120_0==K_IF) ) {
				alt120=1;
			}
			switch (alt120) {
				case 1 :
					// Parser.g:886:27: K_IF K_NOT K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_createTriggerStatement5980); if (state.failed) return expr;
					match(input,K_NOT,FOLLOW_K_NOT_in_createTriggerStatement5982); if (state.failed) return expr;
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_createTriggerStatement5984); if (state.failed) return expr;
					if ( state.backtracking==0 ) { ifNotExists = true; }
					}
					break;

			}

			// Parser.g:886:74: (name= cident )
			// Parser.g:886:75: name= cident
			{
			pushFollow(FOLLOW_cident_in_createTriggerStatement5994);
			name=cident();
			state._fsp--;
			if (state.failed) return expr;
			}

			match(input,K_ON,FOLLOW_K_ON_in_createTriggerStatement6005); if (state.failed) return expr;
			pushFollow(FOLLOW_columnFamilyName_in_createTriggerStatement6009);
			cf=columnFamilyName();
			state._fsp--;
			if (state.failed) return expr;
			match(input,K_USING,FOLLOW_K_USING_in_createTriggerStatement6011); if (state.failed) return expr;
			cls=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_createTriggerStatement6015); if (state.failed) return expr;
			if ( state.backtracking==0 ) { expr = new CreateTriggerStatement(cf, name.rawText(), (cls!=null?cls.getText():null), ifNotExists); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "createTriggerStatement"



	// $ANTLR start "dropTriggerStatement"
	// Parser.g:894:1: dropTriggerStatement returns [DropTriggerStatement expr] : K_DROP K_TRIGGER ( K_IF K_EXISTS )? (name= cident ) K_ON cf= columnFamilyName ;
	public final DropTriggerStatement dropTriggerStatement() throws RecognitionException {
		DropTriggerStatement expr = null;


		ColumnMetadata.Raw name =null;
		CFName cf =null;

		 boolean ifExists = false; 
		try {
			// Parser.g:896:5: ( K_DROP K_TRIGGER ( K_IF K_EXISTS )? (name= cident ) K_ON cf= columnFamilyName )
			// Parser.g:896:7: K_DROP K_TRIGGER ( K_IF K_EXISTS )? (name= cident ) K_ON cf= columnFamilyName
			{
			match(input,K_DROP,FOLLOW_K_DROP_in_dropTriggerStatement6056); if (state.failed) return expr;
			match(input,K_TRIGGER,FOLLOW_K_TRIGGER_in_dropTriggerStatement6058); if (state.failed) return expr;
			// Parser.g:896:24: ( K_IF K_EXISTS )?
			int alt121=2;
			int LA121_0 = input.LA(1);
			if ( (LA121_0==K_IF) ) {
				alt121=1;
			}
			switch (alt121) {
				case 1 :
					// Parser.g:896:25: K_IF K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_dropTriggerStatement6061); if (state.failed) return expr;
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_dropTriggerStatement6063); if (state.failed) return expr;
					if ( state.backtracking==0 ) { ifExists = true; }
					}
					break;

			}

			// Parser.g:896:63: (name= cident )
			// Parser.g:896:64: name= cident
			{
			pushFollow(FOLLOW_cident_in_dropTriggerStatement6073);
			name=cident();
			state._fsp--;
			if (state.failed) return expr;
			}

			match(input,K_ON,FOLLOW_K_ON_in_dropTriggerStatement6076); if (state.failed) return expr;
			pushFollow(FOLLOW_columnFamilyName_in_dropTriggerStatement6080);
			cf=columnFamilyName();
			state._fsp--;
			if (state.failed) return expr;
			if ( state.backtracking==0 ) { expr = new DropTriggerStatement(cf, name.rawText(), ifExists); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "dropTriggerStatement"



	// $ANTLR start "alterKeyspaceStatement"
	// Parser.g:903:1: alterKeyspaceStatement returns [AlterKeyspaceStatement expr] : K_ALTER K_KEYSPACE ks= keyspaceName K_WITH properties[attrs] ;
	public final AlterKeyspaceStatement alterKeyspaceStatement() throws RecognitionException {
		AlterKeyspaceStatement expr = null;


		String ks =null;

		 KeyspaceAttributes attrs = new KeyspaceAttributes(); 
		try {
			// Parser.g:905:5: ( K_ALTER K_KEYSPACE ks= keyspaceName K_WITH properties[attrs] )
			// Parser.g:905:7: K_ALTER K_KEYSPACE ks= keyspaceName K_WITH properties[attrs]
			{
			match(input,K_ALTER,FOLLOW_K_ALTER_in_alterKeyspaceStatement6120); if (state.failed) return expr;
			match(input,K_KEYSPACE,FOLLOW_K_KEYSPACE_in_alterKeyspaceStatement6122); if (state.failed) return expr;
			pushFollow(FOLLOW_keyspaceName_in_alterKeyspaceStatement6126);
			ks=keyspaceName();
			state._fsp--;
			if (state.failed) return expr;
			match(input,K_WITH,FOLLOW_K_WITH_in_alterKeyspaceStatement6136); if (state.failed) return expr;
			pushFollow(FOLLOW_properties_in_alterKeyspaceStatement6138);
			properties(attrs);
			state._fsp--;
			if (state.failed) return expr;
			if ( state.backtracking==0 ) { expr = new AlterKeyspaceStatement(ks, attrs); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "alterKeyspaceStatement"



	// $ANTLR start "alterTableStatement"
	// Parser.g:916:1: alterTableStatement returns [AlterTableStatement expr] : K_ALTER K_COLUMNFAMILY cf= columnFamilyName ( K_ALTER id= cident K_TYPE v= comparatorType | K_ADD ( (id= cident v= comparatorType b1= cfisStatic ) | ( '(' id1= cident v1= comparatorType b1= cfisStatic ( ',' idn= cident vn= comparatorType bn= cfisStatic )* ')' ) ) | K_DROP ( (id= cident | ( '(' id1= cident ( ',' idn= cident )* ')' ) ) ( K_USING K_TIMESTAMP t= INTEGER )? ) | K_WITH properties[attrs] | K_RENAME id1= cident K_TO toId1= cident ( K_AND idn= cident K_TO toIdn= cident )* ) ;
	public final AlterTableStatement alterTableStatement() throws RecognitionException {
		AlterTableStatement expr = null;


		Token t=null;
		CFName cf =null;
		ColumnMetadata.Raw id =null;
		CQL3Type.Raw v =null;
		boolean b1 =false;
		ColumnMetadata.Raw id1 =null;
		CQL3Type.Raw v1 =null;
		ColumnMetadata.Raw idn =null;
		CQL3Type.Raw vn =null;
		boolean bn =false;
		ColumnMetadata.Raw toId1 =null;
		ColumnMetadata.Raw toIdn =null;


		        AlterTableStatement.Type type = null;
		        TableAttributes attrs = new TableAttributes();
		        Map<ColumnMetadata.Raw, ColumnMetadata.Raw> renames = new HashMap<ColumnMetadata.Raw, ColumnMetadata.Raw>();
		        List<AlterTableStatementColumn> colNameList = new ArrayList<AlterTableStatementColumn>();
		        Long deleteTimestamp = null;
		    
		try {
			// Parser.g:924:5: ( K_ALTER K_COLUMNFAMILY cf= columnFamilyName ( K_ALTER id= cident K_TYPE v= comparatorType | K_ADD ( (id= cident v= comparatorType b1= cfisStatic ) | ( '(' id1= cident v1= comparatorType b1= cfisStatic ( ',' idn= cident vn= comparatorType bn= cfisStatic )* ')' ) ) | K_DROP ( (id= cident | ( '(' id1= cident ( ',' idn= cident )* ')' ) ) ( K_USING K_TIMESTAMP t= INTEGER )? ) | K_WITH properties[attrs] | K_RENAME id1= cident K_TO toId1= cident ( K_AND idn= cident K_TO toIdn= cident )* ) )
			// Parser.g:924:7: K_ALTER K_COLUMNFAMILY cf= columnFamilyName ( K_ALTER id= cident K_TYPE v= comparatorType | K_ADD ( (id= cident v= comparatorType b1= cfisStatic ) | ( '(' id1= cident v1= comparatorType b1= cfisStatic ( ',' idn= cident vn= comparatorType bn= cfisStatic )* ')' ) ) | K_DROP ( (id= cident | ( '(' id1= cident ( ',' idn= cident )* ')' ) ) ( K_USING K_TIMESTAMP t= INTEGER )? ) | K_WITH properties[attrs] | K_RENAME id1= cident K_TO toId1= cident ( K_AND idn= cident K_TO toIdn= cident )* )
			{
			match(input,K_ALTER,FOLLOW_K_ALTER_in_alterTableStatement6173); if (state.failed) return expr;
			match(input,K_COLUMNFAMILY,FOLLOW_K_COLUMNFAMILY_in_alterTableStatement6175); if (state.failed) return expr;
			pushFollow(FOLLOW_columnFamilyName_in_alterTableStatement6179);
			cf=columnFamilyName();
			state._fsp--;
			if (state.failed) return expr;
			// Parser.g:925:11: ( K_ALTER id= cident K_TYPE v= comparatorType | K_ADD ( (id= cident v= comparatorType b1= cfisStatic ) | ( '(' id1= cident v1= comparatorType b1= cfisStatic ( ',' idn= cident vn= comparatorType bn= cfisStatic )* ')' ) ) | K_DROP ( (id= cident | ( '(' id1= cident ( ',' idn= cident )* ')' ) ) ( K_USING K_TIMESTAMP t= INTEGER )? ) | K_WITH properties[attrs] | K_RENAME id1= cident K_TO toId1= cident ( K_AND idn= cident K_TO toIdn= cident )* )
			int alt128=5;
			switch ( input.LA(1) ) {
			case K_ALTER:
				{
				alt128=1;
				}
				break;
			case K_ADD:
				{
				alt128=2;
				}
				break;
			case K_DROP:
				{
				alt128=3;
				}
				break;
			case K_WITH:
				{
				alt128=4;
				}
				break;
			case K_RENAME:
				{
				alt128=5;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return expr;}
				NoViableAltException nvae =
					new NoViableAltException("", 128, 0, input);
				throw nvae;
			}
			switch (alt128) {
				case 1 :
					// Parser.g:925:13: K_ALTER id= cident K_TYPE v= comparatorType
					{
					match(input,K_ALTER,FOLLOW_K_ALTER_in_alterTableStatement6193); if (state.failed) return expr;
					pushFollow(FOLLOW_cident_in_alterTableStatement6197);
					id=cident();
					state._fsp--;
					if (state.failed) return expr;
					match(input,K_TYPE,FOLLOW_K_TYPE_in_alterTableStatement6200); if (state.failed) return expr;
					pushFollow(FOLLOW_comparatorType_in_alterTableStatement6204);
					v=comparatorType();
					state._fsp--;
					if (state.failed) return expr;
					if ( state.backtracking==0 ) { type = AlterTableStatement.Type.ALTER; }
					if ( state.backtracking==0 ) { colNameList.add(new AlterTableStatementColumn(id,v)); }
					}
					break;
				case 2 :
					// Parser.g:926:13: K_ADD ( (id= cident v= comparatorType b1= cfisStatic ) | ( '(' id1= cident v1= comparatorType b1= cfisStatic ( ',' idn= cident vn= comparatorType bn= cfisStatic )* ')' ) )
					{
					match(input,K_ADD,FOLLOW_K_ADD_in_alterTableStatement6223); if (state.failed) return expr;
					// Parser.g:926:20: ( (id= cident v= comparatorType b1= cfisStatic ) | ( '(' id1= cident v1= comparatorType b1= cfisStatic ( ',' idn= cident vn= comparatorType bn= cfisStatic )* ')' ) )
					int alt123=2;
					int LA123_0 = input.LA(1);
					if ( (LA123_0==IDENT||(LA123_0 >= K_AGGREGATE && LA123_0 <= K_ALL)||LA123_0==K_AS||LA123_0==K_ASCII||(LA123_0 >= K_BIGINT && LA123_0 <= K_BOOLEAN)||(LA123_0 >= K_CALLED && LA123_0 <= K_CLUSTERING)||(LA123_0 >= K_COMPACT && LA123_0 <= K_COUNTER)||(LA123_0 >= K_CUSTOM && LA123_0 <= K_DECIMAL)||(LA123_0 >= K_DISTINCT && LA123_0 <= K_DOUBLE)||LA123_0==K_DURATION||(LA123_0 >= K_EXISTS && LA123_0 <= K_FLOAT)||LA123_0==K_FROZEN||(LA123_0 >= K_FUNCTION && LA123_0 <= K_FUNCTIONS)||LA123_0==K_GROUP||(LA123_0 >= K_INET && LA123_0 <= K_INPUT)||LA123_0==K_INT||(LA123_0 >= K_JSON && LA123_0 <= K_KEYS)||(LA123_0 >= K_KEYSPACES && LA123_0 <= K_LIKE)||(LA123_0 >= K_LIST && LA123_0 <= K_MAP)||LA123_0==K_NOLOGIN||LA123_0==K_NOSUPERUSER||LA123_0==K_OPTIONS||(LA123_0 >= K_PARTITION && LA123_0 <= K_PERMISSIONS)||LA123_0==K_RETURNS||(LA123_0 >= K_ROLE && LA123_0 <= K_ROLES)||(LA123_0 >= K_SFUNC && LA123_0 <= K_TINYINT)||LA123_0==K_TRIGGER||(LA123_0 >= K_TTL && LA123_0 <= K_TYPE)||(LA123_0 >= K_USER && LA123_0 <= K_USERS)||(LA123_0 >= K_UUID && LA123_0 <= K_VARINT)||LA123_0==K_WRITETIME||LA123_0==QUOTED_NAME) ) {
						alt123=1;
					}
					else if ( (LA123_0==187) ) {
						alt123=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return expr;}
						NoViableAltException nvae =
							new NoViableAltException("", 123, 0, input);
						throw nvae;
					}

					switch (alt123) {
						case 1 :
							// Parser.g:926:29: (id= cident v= comparatorType b1= cfisStatic )
							{
							// Parser.g:926:29: (id= cident v= comparatorType b1= cfisStatic )
							// Parser.g:926:30: id= cident v= comparatorType b1= cfisStatic
							{
							pushFollow(FOLLOW_cident_in_alterTableStatement6238);
							id=cident();
							state._fsp--;
							if (state.failed) return expr;
							pushFollow(FOLLOW_comparatorType_in_alterTableStatement6244);
							v=comparatorType();
							state._fsp--;
							if (state.failed) return expr;
							pushFollow(FOLLOW_cfisStatic_in_alterTableStatement6250);
							b1=cfisStatic();
							state._fsp--;
							if (state.failed) return expr;
							if ( state.backtracking==0 ) { colNameList.add(new AlterTableStatementColumn(id,v,b1)); }
							}

							}
							break;
						case 2 :
							// Parser.g:927:24: ( '(' id1= cident v1= comparatorType b1= cfisStatic ( ',' idn= cident vn= comparatorType bn= cfisStatic )* ')' )
							{
							// Parser.g:927:24: ( '(' id1= cident v1= comparatorType b1= cfisStatic ( ',' idn= cident vn= comparatorType bn= cfisStatic )* ')' )
							// Parser.g:927:25: '(' id1= cident v1= comparatorType b1= cfisStatic ( ',' idn= cident vn= comparatorType bn= cfisStatic )* ')'
							{
							match(input,187,FOLLOW_187_in_alterTableStatement6279); if (state.failed) return expr;
							pushFollow(FOLLOW_cident_in_alterTableStatement6284);
							id1=cident();
							state._fsp--;
							if (state.failed) return expr;
							pushFollow(FOLLOW_comparatorType_in_alterTableStatement6289);
							v1=comparatorType();
							state._fsp--;
							if (state.failed) return expr;
							pushFollow(FOLLOW_cfisStatic_in_alterTableStatement6294);
							b1=cfisStatic();
							state._fsp--;
							if (state.failed) return expr;
							if ( state.backtracking==0 ) { colNameList.add(new AlterTableStatementColumn(id1,v1,b1)); }
							// Parser.g:928:24: ( ',' idn= cident vn= comparatorType bn= cfisStatic )*
							loop122:
							while (true) {
								int alt122=2;
								int LA122_0 = input.LA(1);
								if ( (LA122_0==191) ) {
									alt122=1;
								}

								switch (alt122) {
								case 1 :
									// Parser.g:928:26: ',' idn= cident vn= comparatorType bn= cfisStatic
									{
									match(input,191,FOLLOW_191_in_alterTableStatement6323); if (state.failed) return expr;
									pushFollow(FOLLOW_cident_in_alterTableStatement6327);
									idn=cident();
									state._fsp--;
									if (state.failed) return expr;
									pushFollow(FOLLOW_comparatorType_in_alterTableStatement6332);
									vn=comparatorType();
									state._fsp--;
									if (state.failed) return expr;
									pushFollow(FOLLOW_cfisStatic_in_alterTableStatement6337);
									bn=cfisStatic();
									state._fsp--;
									if (state.failed) return expr;
									if ( state.backtracking==0 ) { colNameList.add(new AlterTableStatementColumn(idn,vn,bn)); }
									}
									break;

								default :
									break loop122;
								}
							}

							match(input,188,FOLLOW_188_in_alterTableStatement6344); if (state.failed) return expr;
							}

							}
							break;

					}

					if ( state.backtracking==0 ) { type = AlterTableStatement.Type.ADD; }
					}
					break;
				case 3 :
					// Parser.g:929:13: K_DROP ( (id= cident | ( '(' id1= cident ( ',' idn= cident )* ')' ) ) ( K_USING K_TIMESTAMP t= INTEGER )? )
					{
					match(input,K_DROP,FOLLOW_K_DROP_in_alterTableStatement6364); if (state.failed) return expr;
					// Parser.g:929:20: ( (id= cident | ( '(' id1= cident ( ',' idn= cident )* ')' ) ) ( K_USING K_TIMESTAMP t= INTEGER )? )
					// Parser.g:929:22: (id= cident | ( '(' id1= cident ( ',' idn= cident )* ')' ) ) ( K_USING K_TIMESTAMP t= INTEGER )?
					{
					// Parser.g:929:22: (id= cident | ( '(' id1= cident ( ',' idn= cident )* ')' ) )
					int alt125=2;
					int LA125_0 = input.LA(1);
					if ( (LA125_0==IDENT||(LA125_0 >= K_AGGREGATE && LA125_0 <= K_ALL)||LA125_0==K_AS||LA125_0==K_ASCII||(LA125_0 >= K_BIGINT && LA125_0 <= K_BOOLEAN)||(LA125_0 >= K_CALLED && LA125_0 <= K_CLUSTERING)||(LA125_0 >= K_COMPACT && LA125_0 <= K_COUNTER)||(LA125_0 >= K_CUSTOM && LA125_0 <= K_DECIMAL)||(LA125_0 >= K_DISTINCT && LA125_0 <= K_DOUBLE)||LA125_0==K_DURATION||(LA125_0 >= K_EXISTS && LA125_0 <= K_FLOAT)||LA125_0==K_FROZEN||(LA125_0 >= K_FUNCTION && LA125_0 <= K_FUNCTIONS)||LA125_0==K_GROUP||(LA125_0 >= K_INET && LA125_0 <= K_INPUT)||LA125_0==K_INT||(LA125_0 >= K_JSON && LA125_0 <= K_KEYS)||(LA125_0 >= K_KEYSPACES && LA125_0 <= K_LIKE)||(LA125_0 >= K_LIST && LA125_0 <= K_MAP)||LA125_0==K_NOLOGIN||LA125_0==K_NOSUPERUSER||LA125_0==K_OPTIONS||(LA125_0 >= K_PARTITION && LA125_0 <= K_PERMISSIONS)||LA125_0==K_RETURNS||(LA125_0 >= K_ROLE && LA125_0 <= K_ROLES)||(LA125_0 >= K_SFUNC && LA125_0 <= K_TINYINT)||LA125_0==K_TRIGGER||(LA125_0 >= K_TTL && LA125_0 <= K_TYPE)||(LA125_0 >= K_USER && LA125_0 <= K_USERS)||(LA125_0 >= K_UUID && LA125_0 <= K_VARINT)||LA125_0==K_WRITETIME||LA125_0==QUOTED_NAME) ) {
						alt125=1;
					}
					else if ( (LA125_0==187) ) {
						alt125=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return expr;}
						NoViableAltException nvae =
							new NoViableAltException("", 125, 0, input);
						throw nvae;
					}

					switch (alt125) {
						case 1 :
							// Parser.g:929:32: id= cident
							{
							pushFollow(FOLLOW_cident_in_alterTableStatement6380);
							id=cident();
							state._fsp--;
							if (state.failed) return expr;
							if ( state.backtracking==0 ) { colNameList.add(new AlterTableStatementColumn(id)); }
							}
							break;
						case 2 :
							// Parser.g:930:25: ( '(' id1= cident ( ',' idn= cident )* ')' )
							{
							// Parser.g:930:25: ( '(' id1= cident ( ',' idn= cident )* ')' )
							// Parser.g:930:26: '(' id1= cident ( ',' idn= cident )* ')'
							{
							match(input,187,FOLLOW_187_in_alterTableStatement6410); if (state.failed) return expr;
							pushFollow(FOLLOW_cident_in_alterTableStatement6415);
							id1=cident();
							state._fsp--;
							if (state.failed) return expr;
							if ( state.backtracking==0 ) { colNameList.add(new AlterTableStatementColumn(id1)); }
							// Parser.g:931:25: ( ',' idn= cident )*
							loop124:
							while (true) {
								int alt124=2;
								int LA124_0 = input.LA(1);
								if ( (LA124_0==191) ) {
									alt124=1;
								}

								switch (alt124) {
								case 1 :
									// Parser.g:931:27: ',' idn= cident
									{
									match(input,191,FOLLOW_191_in_alterTableStatement6445); if (state.failed) return expr;
									pushFollow(FOLLOW_cident_in_alterTableStatement6449);
									idn=cident();
									state._fsp--;
									if (state.failed) return expr;
									if ( state.backtracking==0 ) { colNameList.add(new AlterTableStatementColumn(idn)); }
									}
									break;

								default :
									break loop124;
								}
							}

							match(input,188,FOLLOW_188_in_alterTableStatement6456); if (state.failed) return expr;
							}

							}
							break;

					}

					// Parser.g:932:22: ( K_USING K_TIMESTAMP t= INTEGER )?
					int alt126=2;
					int LA126_0 = input.LA(1);
					if ( (LA126_0==K_USING) ) {
						alt126=1;
					}
					switch (alt126) {
						case 1 :
							// Parser.g:932:24: K_USING K_TIMESTAMP t= INTEGER
							{
							match(input,K_USING,FOLLOW_K_USING_in_alterTableStatement6484); if (state.failed) return expr;
							match(input,K_TIMESTAMP,FOLLOW_K_TIMESTAMP_in_alterTableStatement6486); if (state.failed) return expr;
							t=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_alterTableStatement6490); if (state.failed) return expr;
							if ( state.backtracking==0 ) { deleteTimestamp = Long.parseLong(Constants.Literal.integer((t!=null?t.getText():null)).getText()); }
							}
							break;

					}

					}

					if ( state.backtracking==0 ) { type = AlterTableStatement.Type.DROP; }
					}
					break;
				case 4 :
					// Parser.g:933:13: K_WITH properties[attrs]
					{
					match(input,K_WITH,FOLLOW_K_WITH_in_alterTableStatement6512); if (state.failed) return expr;
					pushFollow(FOLLOW_properties_in_alterTableStatement6515);
					properties(attrs);
					state._fsp--;
					if (state.failed) return expr;
					if ( state.backtracking==0 ) { type = AlterTableStatement.Type.OPTS; }
					}
					break;
				case 5 :
					// Parser.g:934:13: K_RENAME id1= cident K_TO toId1= cident ( K_AND idn= cident K_TO toIdn= cident )*
					{
					match(input,K_RENAME,FOLLOW_K_RENAME_in_alterTableStatement6548); if (state.failed) return expr;
					if ( state.backtracking==0 ) { type = AlterTableStatement.Type.RENAME; }
					pushFollow(FOLLOW_cident_in_alterTableStatement6602);
					id1=cident();
					state._fsp--;
					if (state.failed) return expr;
					match(input,K_TO,FOLLOW_K_TO_in_alterTableStatement6604); if (state.failed) return expr;
					pushFollow(FOLLOW_cident_in_alterTableStatement6608);
					toId1=cident();
					state._fsp--;
					if (state.failed) return expr;
					if ( state.backtracking==0 ) { renames.put(id1, toId1); }
					// Parser.g:936:16: ( K_AND idn= cident K_TO toIdn= cident )*
					loop127:
					while (true) {
						int alt127=2;
						int LA127_0 = input.LA(1);
						if ( (LA127_0==K_AND) ) {
							alt127=1;
						}

						switch (alt127) {
						case 1 :
							// Parser.g:936:18: K_AND idn= cident K_TO toIdn= cident
							{
							match(input,K_AND,FOLLOW_K_AND_in_alterTableStatement6629); if (state.failed) return expr;
							pushFollow(FOLLOW_cident_in_alterTableStatement6633);
							idn=cident();
							state._fsp--;
							if (state.failed) return expr;
							match(input,K_TO,FOLLOW_K_TO_in_alterTableStatement6635); if (state.failed) return expr;
							pushFollow(FOLLOW_cident_in_alterTableStatement6639);
							toIdn=cident();
							state._fsp--;
							if (state.failed) return expr;
							if ( state.backtracking==0 ) { renames.put(idn, toIdn); }
							}
							break;

						default :
							break loop127;
						}
					}

					}
					break;

			}

			if ( state.backtracking==0 ) {
			        expr = new AlterTableStatement(cf, type, colNameList, attrs, renames, deleteTimestamp);
			    }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "alterTableStatement"



	// $ANTLR start "cfisStatic"
	// Parser.g:943:1: cfisStatic returns [boolean isStaticColumn] : ( K_STATIC )? ;
	public final boolean cfisStatic() throws RecognitionException {
		boolean isStaticColumn = false;



		        boolean isStatic = false;
		    
		try {
			// Parser.g:947:5: ( ( K_STATIC )? )
			// Parser.g:947:7: ( K_STATIC )?
			{
			// Parser.g:947:7: ( K_STATIC )?
			int alt129=2;
			int LA129_0 = input.LA(1);
			if ( (LA129_0==K_STATIC) ) {
				alt129=1;
			}
			switch (alt129) {
				case 1 :
					// Parser.g:947:8: K_STATIC
					{
					match(input,K_STATIC,FOLLOW_K_STATIC_in_cfisStatic6692); if (state.failed) return isStaticColumn;
					if ( state.backtracking==0 ) { isStatic=true; }
					}
					break;

			}

			if ( state.backtracking==0 ) { isStaticColumn = isStatic;
			    }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return isStaticColumn;
	}
	// $ANTLR end "cfisStatic"



	// $ANTLR start "alterMaterializedViewStatement"
	// Parser.g:951:1: alterMaterializedViewStatement returns [AlterViewStatement expr] : K_ALTER K_MATERIALIZED K_VIEW name= columnFamilyName K_WITH properties[attrs] ;
	public final AlterViewStatement alterMaterializedViewStatement() throws RecognitionException {
		AlterViewStatement expr = null;


		CFName name =null;


		        TableAttributes attrs = new TableAttributes();
		    
		try {
			// Parser.g:955:5: ( K_ALTER K_MATERIALIZED K_VIEW name= columnFamilyName K_WITH properties[attrs] )
			// Parser.g:955:7: K_ALTER K_MATERIALIZED K_VIEW name= columnFamilyName K_WITH properties[attrs]
			{
			match(input,K_ALTER,FOLLOW_K_ALTER_in_alterMaterializedViewStatement6728); if (state.failed) return expr;
			match(input,K_MATERIALIZED,FOLLOW_K_MATERIALIZED_in_alterMaterializedViewStatement6730); if (state.failed) return expr;
			match(input,K_VIEW,FOLLOW_K_VIEW_in_alterMaterializedViewStatement6732); if (state.failed) return expr;
			pushFollow(FOLLOW_columnFamilyName_in_alterMaterializedViewStatement6736);
			name=columnFamilyName();
			state._fsp--;
			if (state.failed) return expr;
			match(input,K_WITH,FOLLOW_K_WITH_in_alterMaterializedViewStatement6748); if (state.failed) return expr;
			pushFollow(FOLLOW_properties_in_alterMaterializedViewStatement6750);
			properties(attrs);
			state._fsp--;
			if (state.failed) return expr;
			if ( state.backtracking==0 ) {
			        expr = new AlterViewStatement(name, attrs);
			    }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "alterMaterializedViewStatement"



	// $ANTLR start "alterTypeStatement"
	// Parser.g:968:1: alterTypeStatement returns [AlterTypeStatement expr] : K_ALTER K_TYPE name= userTypeName ( K_ALTER f= fident K_TYPE v= comparatorType | K_ADD f= fident v= comparatorType | K_RENAME r= renamedColumns ) ;
	public final AlterTypeStatement alterTypeStatement() throws RecognitionException {
		AlterTypeStatement expr = null;


		UTName name =null;
		FieldIdentifier f =null;
		CQL3Type.Raw v =null;
		Map<FieldIdentifier, FieldIdentifier> r =null;

		try {
			// Parser.g:969:5: ( K_ALTER K_TYPE name= userTypeName ( K_ALTER f= fident K_TYPE v= comparatorType | K_ADD f= fident v= comparatorType | K_RENAME r= renamedColumns ) )
			// Parser.g:969:7: K_ALTER K_TYPE name= userTypeName ( K_ALTER f= fident K_TYPE v= comparatorType | K_ADD f= fident v= comparatorType | K_RENAME r= renamedColumns )
			{
			match(input,K_ALTER,FOLLOW_K_ALTER_in_alterTypeStatement6781); if (state.failed) return expr;
			match(input,K_TYPE,FOLLOW_K_TYPE_in_alterTypeStatement6783); if (state.failed) return expr;
			pushFollow(FOLLOW_userTypeName_in_alterTypeStatement6787);
			name=userTypeName();
			state._fsp--;
			if (state.failed) return expr;
			// Parser.g:970:11: ( K_ALTER f= fident K_TYPE v= comparatorType | K_ADD f= fident v= comparatorType | K_RENAME r= renamedColumns )
			int alt130=3;
			switch ( input.LA(1) ) {
			case K_ALTER:
				{
				alt130=1;
				}
				break;
			case K_ADD:
				{
				alt130=2;
				}
				break;
			case K_RENAME:
				{
				alt130=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return expr;}
				NoViableAltException nvae =
					new NoViableAltException("", 130, 0, input);
				throw nvae;
			}
			switch (alt130) {
				case 1 :
					// Parser.g:970:13: K_ALTER f= fident K_TYPE v= comparatorType
					{
					match(input,K_ALTER,FOLLOW_K_ALTER_in_alterTypeStatement6801); if (state.failed) return expr;
					pushFollow(FOLLOW_fident_in_alterTypeStatement6805);
					f=fident();
					state._fsp--;
					if (state.failed) return expr;
					match(input,K_TYPE,FOLLOW_K_TYPE_in_alterTypeStatement6807); if (state.failed) return expr;
					pushFollow(FOLLOW_comparatorType_in_alterTypeStatement6811);
					v=comparatorType();
					state._fsp--;
					if (state.failed) return expr;
					if ( state.backtracking==0 ) { expr = AlterTypeStatement.alter(name, f, v); }
					}
					break;
				case 2 :
					// Parser.g:971:13: K_ADD f= fident v= comparatorType
					{
					match(input,K_ADD,FOLLOW_K_ADD_in_alterTypeStatement6827); if (state.failed) return expr;
					pushFollow(FOLLOW_fident_in_alterTypeStatement6833);
					f=fident();
					state._fsp--;
					if (state.failed) return expr;
					pushFollow(FOLLOW_comparatorType_in_alterTypeStatement6837);
					v=comparatorType();
					state._fsp--;
					if (state.failed) return expr;
					if ( state.backtracking==0 ) { expr = AlterTypeStatement.addition(name, f, v); }
					}
					break;
				case 3 :
					// Parser.g:972:13: K_RENAME r= renamedColumns
					{
					match(input,K_RENAME,FOLLOW_K_RENAME_in_alterTypeStatement6860); if (state.failed) return expr;
					pushFollow(FOLLOW_renamedColumns_in_alterTypeStatement6864);
					r=renamedColumns();
					state._fsp--;
					if (state.failed) return expr;
					if ( state.backtracking==0 ) { expr = AlterTypeStatement.renames(name, r); }
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "alterTypeStatement"



	// $ANTLR start "renamedColumns"
	// Parser.g:976:1: renamedColumns returns [Map<FieldIdentifier, FieldIdentifier> renames] : id1= fident K_TO toId1= fident ( K_AND idn= fident K_TO toIdn= fident )* ;
	public final Map<FieldIdentifier, FieldIdentifier> renamedColumns() throws RecognitionException {
		Map<FieldIdentifier, FieldIdentifier> renames = null;


		FieldIdentifier id1 =null;
		FieldIdentifier toId1 =null;
		FieldIdentifier idn =null;
		FieldIdentifier toIdn =null;

		renames = new HashMap<>();
		try {
			// Parser.g:978:5: (id1= fident K_TO toId1= fident ( K_AND idn= fident K_TO toIdn= fident )* )
			// Parser.g:978:7: id1= fident K_TO toId1= fident ( K_AND idn= fident K_TO toIdn= fident )*
			{
			pushFollow(FOLLOW_fident_in_renamedColumns6925);
			id1=fident();
			state._fsp--;
			if (state.failed) return renames;
			match(input,K_TO,FOLLOW_K_TO_in_renamedColumns6927); if (state.failed) return renames;
			pushFollow(FOLLOW_fident_in_renamedColumns6931);
			toId1=fident();
			state._fsp--;
			if (state.failed) return renames;
			if ( state.backtracking==0 ) { renames.put(id1, toId1); }
			// Parser.g:978:65: ( K_AND idn= fident K_TO toIdn= fident )*
			loop131:
			while (true) {
				int alt131=2;
				int LA131_0 = input.LA(1);
				if ( (LA131_0==K_AND) ) {
					alt131=1;
				}

				switch (alt131) {
				case 1 :
					// Parser.g:978:67: K_AND idn= fident K_TO toIdn= fident
					{
					match(input,K_AND,FOLLOW_K_AND_in_renamedColumns6937); if (state.failed) return renames;
					pushFollow(FOLLOW_fident_in_renamedColumns6941);
					idn=fident();
					state._fsp--;
					if (state.failed) return renames;
					match(input,K_TO,FOLLOW_K_TO_in_renamedColumns6943); if (state.failed) return renames;
					pushFollow(FOLLOW_fident_in_renamedColumns6947);
					toIdn=fident();
					state._fsp--;
					if (state.failed) return renames;
					if ( state.backtracking==0 ) { renames.put(idn, toIdn); }
					}
					break;

				default :
					break loop131;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return renames;
	}
	// $ANTLR end "renamedColumns"



	// $ANTLR start "dropKeyspaceStatement"
	// Parser.g:984:1: dropKeyspaceStatement returns [DropKeyspaceStatement ksp] : K_DROP K_KEYSPACE ( K_IF K_EXISTS )? ks= keyspaceName ;
	public final DropKeyspaceStatement dropKeyspaceStatement() throws RecognitionException {
		DropKeyspaceStatement ksp = null;


		String ks =null;

		 boolean ifExists = false; 
		try {
			// Parser.g:986:5: ( K_DROP K_KEYSPACE ( K_IF K_EXISTS )? ks= keyspaceName )
			// Parser.g:986:7: K_DROP K_KEYSPACE ( K_IF K_EXISTS )? ks= keyspaceName
			{
			match(input,K_DROP,FOLLOW_K_DROP_in_dropKeyspaceStatement6984); if (state.failed) return ksp;
			match(input,K_KEYSPACE,FOLLOW_K_KEYSPACE_in_dropKeyspaceStatement6986); if (state.failed) return ksp;
			// Parser.g:986:25: ( K_IF K_EXISTS )?
			int alt132=2;
			int LA132_0 = input.LA(1);
			if ( (LA132_0==K_IF) ) {
				alt132=1;
			}
			switch (alt132) {
				case 1 :
					// Parser.g:986:26: K_IF K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_dropKeyspaceStatement6989); if (state.failed) return ksp;
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_dropKeyspaceStatement6991); if (state.failed) return ksp;
					if ( state.backtracking==0 ) { ifExists = true; }
					}
					break;

			}

			pushFollow(FOLLOW_keyspaceName_in_dropKeyspaceStatement7000);
			ks=keyspaceName();
			state._fsp--;
			if (state.failed) return ksp;
			if ( state.backtracking==0 ) { ksp = new DropKeyspaceStatement(ks, ifExists); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return ksp;
	}
	// $ANTLR end "dropKeyspaceStatement"



	// $ANTLR start "dropTableStatement"
	// Parser.g:992:1: dropTableStatement returns [DropTableStatement stmt] : K_DROP K_COLUMNFAMILY ( K_IF K_EXISTS )? cf= columnFamilyName ;
	public final DropTableStatement dropTableStatement() throws RecognitionException {
		DropTableStatement stmt = null;


		CFName cf =null;

		 boolean ifExists = false; 
		try {
			// Parser.g:994:5: ( K_DROP K_COLUMNFAMILY ( K_IF K_EXISTS )? cf= columnFamilyName )
			// Parser.g:994:7: K_DROP K_COLUMNFAMILY ( K_IF K_EXISTS )? cf= columnFamilyName
			{
			match(input,K_DROP,FOLLOW_K_DROP_in_dropTableStatement7034); if (state.failed) return stmt;
			match(input,K_COLUMNFAMILY,FOLLOW_K_COLUMNFAMILY_in_dropTableStatement7036); if (state.failed) return stmt;
			// Parser.g:994:29: ( K_IF K_EXISTS )?
			int alt133=2;
			int LA133_0 = input.LA(1);
			if ( (LA133_0==K_IF) ) {
				alt133=1;
			}
			switch (alt133) {
				case 1 :
					// Parser.g:994:30: K_IF K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_dropTableStatement7039); if (state.failed) return stmt;
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_dropTableStatement7041); if (state.failed) return stmt;
					if ( state.backtracking==0 ) { ifExists = true; }
					}
					break;

			}

			pushFollow(FOLLOW_columnFamilyName_in_dropTableStatement7050);
			cf=columnFamilyName();
			state._fsp--;
			if (state.failed) return stmt;
			if ( state.backtracking==0 ) { stmt = new DropTableStatement(cf, ifExists); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "dropTableStatement"



	// $ANTLR start "dropTypeStatement"
	// Parser.g:1000:1: dropTypeStatement returns [DropTypeStatement stmt] : K_DROP K_TYPE ( K_IF K_EXISTS )? name= userTypeName ;
	public final DropTypeStatement dropTypeStatement() throws RecognitionException {
		DropTypeStatement stmt = null;


		UTName name =null;

		 boolean ifExists = false; 
		try {
			// Parser.g:1002:5: ( K_DROP K_TYPE ( K_IF K_EXISTS )? name= userTypeName )
			// Parser.g:1002:7: K_DROP K_TYPE ( K_IF K_EXISTS )? name= userTypeName
			{
			match(input,K_DROP,FOLLOW_K_DROP_in_dropTypeStatement7084); if (state.failed) return stmt;
			match(input,K_TYPE,FOLLOW_K_TYPE_in_dropTypeStatement7086); if (state.failed) return stmt;
			// Parser.g:1002:21: ( K_IF K_EXISTS )?
			int alt134=2;
			int LA134_0 = input.LA(1);
			if ( (LA134_0==K_IF) ) {
				alt134=1;
			}
			switch (alt134) {
				case 1 :
					// Parser.g:1002:22: K_IF K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_dropTypeStatement7089); if (state.failed) return stmt;
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_dropTypeStatement7091); if (state.failed) return stmt;
					if ( state.backtracking==0 ) { ifExists = true; }
					}
					break;

			}

			pushFollow(FOLLOW_userTypeName_in_dropTypeStatement7100);
			name=userTypeName();
			state._fsp--;
			if (state.failed) return stmt;
			if ( state.backtracking==0 ) { stmt = new DropTypeStatement(name, ifExists); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "dropTypeStatement"



	// $ANTLR start "dropIndexStatement"
	// Parser.g:1008:1: dropIndexStatement returns [DropIndexStatement expr] : K_DROP K_INDEX ( K_IF K_EXISTS )? index= indexName ;
	public final DropIndexStatement dropIndexStatement() throws RecognitionException {
		DropIndexStatement expr = null;


		IndexName index =null;

		 boolean ifExists = false; 
		try {
			// Parser.g:1010:5: ( K_DROP K_INDEX ( K_IF K_EXISTS )? index= indexName )
			// Parser.g:1010:7: K_DROP K_INDEX ( K_IF K_EXISTS )? index= indexName
			{
			match(input,K_DROP,FOLLOW_K_DROP_in_dropIndexStatement7134); if (state.failed) return expr;
			match(input,K_INDEX,FOLLOW_K_INDEX_in_dropIndexStatement7136); if (state.failed) return expr;
			// Parser.g:1010:22: ( K_IF K_EXISTS )?
			int alt135=2;
			int LA135_0 = input.LA(1);
			if ( (LA135_0==K_IF) ) {
				alt135=1;
			}
			switch (alt135) {
				case 1 :
					// Parser.g:1010:23: K_IF K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_dropIndexStatement7139); if (state.failed) return expr;
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_dropIndexStatement7141); if (state.failed) return expr;
					if ( state.backtracking==0 ) { ifExists = true; }
					}
					break;

			}

			pushFollow(FOLLOW_indexName_in_dropIndexStatement7150);
			index=indexName();
			state._fsp--;
			if (state.failed) return expr;
			if ( state.backtracking==0 ) { expr = new DropIndexStatement(index, ifExists); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "dropIndexStatement"



	// $ANTLR start "dropMaterializedViewStatement"
	// Parser.g:1017:1: dropMaterializedViewStatement returns [DropViewStatement expr] : K_DROP K_MATERIALIZED K_VIEW ( K_IF K_EXISTS )? cf= columnFamilyName ;
	public final DropViewStatement dropMaterializedViewStatement() throws RecognitionException {
		DropViewStatement expr = null;


		CFName cf =null;

		 boolean ifExists = false; 
		try {
			// Parser.g:1019:5: ( K_DROP K_MATERIALIZED K_VIEW ( K_IF K_EXISTS )? cf= columnFamilyName )
			// Parser.g:1019:7: K_DROP K_MATERIALIZED K_VIEW ( K_IF K_EXISTS )? cf= columnFamilyName
			{
			match(input,K_DROP,FOLLOW_K_DROP_in_dropMaterializedViewStatement7190); if (state.failed) return expr;
			match(input,K_MATERIALIZED,FOLLOW_K_MATERIALIZED_in_dropMaterializedViewStatement7192); if (state.failed) return expr;
			match(input,K_VIEW,FOLLOW_K_VIEW_in_dropMaterializedViewStatement7194); if (state.failed) return expr;
			// Parser.g:1019:36: ( K_IF K_EXISTS )?
			int alt136=2;
			int LA136_0 = input.LA(1);
			if ( (LA136_0==K_IF) ) {
				alt136=1;
			}
			switch (alt136) {
				case 1 :
					// Parser.g:1019:37: K_IF K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_dropMaterializedViewStatement7197); if (state.failed) return expr;
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_dropMaterializedViewStatement7199); if (state.failed) return expr;
					if ( state.backtracking==0 ) { ifExists = true; }
					}
					break;

			}

			pushFollow(FOLLOW_columnFamilyName_in_dropMaterializedViewStatement7208);
			cf=columnFamilyName();
			state._fsp--;
			if (state.failed) return expr;
			if ( state.backtracking==0 ) { expr = new DropViewStatement(cf, ifExists); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "dropMaterializedViewStatement"



	// $ANTLR start "truncateStatement"
	// Parser.g:1026:1: truncateStatement returns [TruncateStatement stmt] : K_TRUNCATE ( K_COLUMNFAMILY )? cf= columnFamilyName ;
	public final TruncateStatement truncateStatement() throws RecognitionException {
		TruncateStatement stmt = null;


		CFName cf =null;

		try {
			// Parser.g:1027:5: ( K_TRUNCATE ( K_COLUMNFAMILY )? cf= columnFamilyName )
			// Parser.g:1027:7: K_TRUNCATE ( K_COLUMNFAMILY )? cf= columnFamilyName
			{
			match(input,K_TRUNCATE,FOLLOW_K_TRUNCATE_in_truncateStatement7239); if (state.failed) return stmt;
			// Parser.g:1027:18: ( K_COLUMNFAMILY )?
			int alt137=2;
			int LA137_0 = input.LA(1);
			if ( (LA137_0==K_COLUMNFAMILY) ) {
				alt137=1;
			}
			switch (alt137) {
				case 1 :
					// Parser.g:1027:19: K_COLUMNFAMILY
					{
					match(input,K_COLUMNFAMILY,FOLLOW_K_COLUMNFAMILY_in_truncateStatement7242); if (state.failed) return stmt;
					}
					break;

			}

			pushFollow(FOLLOW_columnFamilyName_in_truncateStatement7248);
			cf=columnFamilyName();
			state._fsp--;
			if (state.failed) return stmt;
			if ( state.backtracking==0 ) { stmt = new TruncateStatement(cf); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "truncateStatement"



	// $ANTLR start "grantPermissionsStatement"
	// Parser.g:1033:1: grantPermissionsStatement returns [GrantPermissionsStatement stmt] : K_GRANT permissionOrAll K_ON resource K_TO grantee= userOrRoleName ;
	public final GrantPermissionsStatement grantPermissionsStatement() throws RecognitionException {
		GrantPermissionsStatement stmt = null;


		RoleName grantee =null;
		Set<Permission> permissionOrAll1 =null;
		IResource resource2 =null;

		try {
			// Parser.g:1034:5: ( K_GRANT permissionOrAll K_ON resource K_TO grantee= userOrRoleName )
			// Parser.g:1034:7: K_GRANT permissionOrAll K_ON resource K_TO grantee= userOrRoleName
			{
			match(input,K_GRANT,FOLLOW_K_GRANT_in_grantPermissionsStatement7273); if (state.failed) return stmt;
			pushFollow(FOLLOW_permissionOrAll_in_grantPermissionsStatement7285);
			permissionOrAll1=permissionOrAll();
			state._fsp--;
			if (state.failed) return stmt;
			match(input,K_ON,FOLLOW_K_ON_in_grantPermissionsStatement7293); if (state.failed) return stmt;
			pushFollow(FOLLOW_resource_in_grantPermissionsStatement7305);
			resource2=resource();
			state._fsp--;
			if (state.failed) return stmt;
			match(input,K_TO,FOLLOW_K_TO_in_grantPermissionsStatement7313); if (state.failed) return stmt;
			pushFollow(FOLLOW_userOrRoleName_in_grantPermissionsStatement7327);
			grantee=userOrRoleName();
			state._fsp--;
			if (state.failed) return stmt;
			if ( state.backtracking==0 ) { stmt = new GrantPermissionsStatement(filterPermissions(permissionOrAll1, resource2), resource2, grantee); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "grantPermissionsStatement"



	// $ANTLR start "revokePermissionsStatement"
	// Parser.g:1046:1: revokePermissionsStatement returns [RevokePermissionsStatement stmt] : K_REVOKE permissionOrAll K_ON resource K_FROM revokee= userOrRoleName ;
	public final RevokePermissionsStatement revokePermissionsStatement() throws RecognitionException {
		RevokePermissionsStatement stmt = null;


		RoleName revokee =null;
		Set<Permission> permissionOrAll3 =null;
		IResource resource4 =null;

		try {
			// Parser.g:1047:5: ( K_REVOKE permissionOrAll K_ON resource K_FROM revokee= userOrRoleName )
			// Parser.g:1047:7: K_REVOKE permissionOrAll K_ON resource K_FROM revokee= userOrRoleName
			{
			match(input,K_REVOKE,FOLLOW_K_REVOKE_in_revokePermissionsStatement7358); if (state.failed) return stmt;
			pushFollow(FOLLOW_permissionOrAll_in_revokePermissionsStatement7370);
			permissionOrAll3=permissionOrAll();
			state._fsp--;
			if (state.failed) return stmt;
			match(input,K_ON,FOLLOW_K_ON_in_revokePermissionsStatement7378); if (state.failed) return stmt;
			pushFollow(FOLLOW_resource_in_revokePermissionsStatement7390);
			resource4=resource();
			state._fsp--;
			if (state.failed) return stmt;
			match(input,K_FROM,FOLLOW_K_FROM_in_revokePermissionsStatement7398); if (state.failed) return stmt;
			pushFollow(FOLLOW_userOrRoleName_in_revokePermissionsStatement7412);
			revokee=userOrRoleName();
			state._fsp--;
			if (state.failed) return stmt;
			if ( state.backtracking==0 ) { stmt = new RevokePermissionsStatement(filterPermissions(permissionOrAll3, resource4), resource4, revokee); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "revokePermissionsStatement"



	// $ANTLR start "grantRoleStatement"
	// Parser.g:1059:1: grantRoleStatement returns [GrantRoleStatement stmt] : K_GRANT role= userOrRoleName K_TO grantee= userOrRoleName ;
	public final GrantRoleStatement grantRoleStatement() throws RecognitionException {
		GrantRoleStatement stmt = null;


		RoleName role =null;
		RoleName grantee =null;

		try {
			// Parser.g:1060:5: ( K_GRANT role= userOrRoleName K_TO grantee= userOrRoleName )
			// Parser.g:1060:7: K_GRANT role= userOrRoleName K_TO grantee= userOrRoleName
			{
			match(input,K_GRANT,FOLLOW_K_GRANT_in_grantRoleStatement7443); if (state.failed) return stmt;
			pushFollow(FOLLOW_userOrRoleName_in_grantRoleStatement7457);
			role=userOrRoleName();
			state._fsp--;
			if (state.failed) return stmt;
			match(input,K_TO,FOLLOW_K_TO_in_grantRoleStatement7465); if (state.failed) return stmt;
			pushFollow(FOLLOW_userOrRoleName_in_grantRoleStatement7479);
			grantee=userOrRoleName();
			state._fsp--;
			if (state.failed) return stmt;
			if ( state.backtracking==0 ) { stmt = new GrantRoleStatement(role, grantee); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "grantRoleStatement"



	// $ANTLR start "revokeRoleStatement"
	// Parser.g:1070:1: revokeRoleStatement returns [RevokeRoleStatement stmt] : K_REVOKE role= userOrRoleName K_FROM revokee= userOrRoleName ;
	public final RevokeRoleStatement revokeRoleStatement() throws RecognitionException {
		RevokeRoleStatement stmt = null;


		RoleName role =null;
		RoleName revokee =null;

		try {
			// Parser.g:1071:5: ( K_REVOKE role= userOrRoleName K_FROM revokee= userOrRoleName )
			// Parser.g:1071:7: K_REVOKE role= userOrRoleName K_FROM revokee= userOrRoleName
			{
			match(input,K_REVOKE,FOLLOW_K_REVOKE_in_revokeRoleStatement7510); if (state.failed) return stmt;
			pushFollow(FOLLOW_userOrRoleName_in_revokeRoleStatement7524);
			role=userOrRoleName();
			state._fsp--;
			if (state.failed) return stmt;
			match(input,K_FROM,FOLLOW_K_FROM_in_revokeRoleStatement7532); if (state.failed) return stmt;
			pushFollow(FOLLOW_userOrRoleName_in_revokeRoleStatement7546);
			revokee=userOrRoleName();
			state._fsp--;
			if (state.failed) return stmt;
			if ( state.backtracking==0 ) { stmt = new RevokeRoleStatement(role, revokee); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "revokeRoleStatement"



	// $ANTLR start "listPermissionsStatement"
	// Parser.g:1078:1: listPermissionsStatement returns [ListPermissionsStatement stmt] : K_LIST permissionOrAll ( K_ON resource )? ( K_OF roleName[grantee] )? ( K_NORECURSIVE )? ;
	public final ListPermissionsStatement listPermissionsStatement() throws RecognitionException {
		ListPermissionsStatement stmt = null;


		IResource resource5 =null;
		Set<Permission> permissionOrAll6 =null;


		        IResource resource = null;
		        boolean recursive = true;
		        RoleName grantee = new RoleName();
		    
		try {
			// Parser.g:1084:5: ( K_LIST permissionOrAll ( K_ON resource )? ( K_OF roleName[grantee] )? ( K_NORECURSIVE )? )
			// Parser.g:1084:7: K_LIST permissionOrAll ( K_ON resource )? ( K_OF roleName[grantee] )? ( K_NORECURSIVE )?
			{
			match(input,K_LIST,FOLLOW_K_LIST_in_listPermissionsStatement7584); if (state.failed) return stmt;
			pushFollow(FOLLOW_permissionOrAll_in_listPermissionsStatement7596);
			permissionOrAll6=permissionOrAll();
			state._fsp--;
			if (state.failed) return stmt;
			// Parser.g:1086:7: ( K_ON resource )?
			int alt138=2;
			int LA138_0 = input.LA(1);
			if ( (LA138_0==K_ON) ) {
				alt138=1;
			}
			switch (alt138) {
				case 1 :
					// Parser.g:1086:9: K_ON resource
					{
					match(input,K_ON,FOLLOW_K_ON_in_listPermissionsStatement7606); if (state.failed) return stmt;
					pushFollow(FOLLOW_resource_in_listPermissionsStatement7608);
					resource5=resource();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { resource = resource5; }
					}
					break;

			}

			// Parser.g:1087:7: ( K_OF roleName[grantee] )?
			int alt139=2;
			int LA139_0 = input.LA(1);
			if ( (LA139_0==K_OF) ) {
				alt139=1;
			}
			switch (alt139) {
				case 1 :
					// Parser.g:1087:9: K_OF roleName[grantee]
					{
					match(input,K_OF,FOLLOW_K_OF_in_listPermissionsStatement7623); if (state.failed) return stmt;
					pushFollow(FOLLOW_roleName_in_listPermissionsStatement7625);
					roleName(grantee);
					state._fsp--;
					if (state.failed) return stmt;
					}
					break;

			}

			// Parser.g:1088:7: ( K_NORECURSIVE )?
			int alt140=2;
			int LA140_0 = input.LA(1);
			if ( (LA140_0==K_NORECURSIVE) ) {
				alt140=1;
			}
			switch (alt140) {
				case 1 :
					// Parser.g:1088:9: K_NORECURSIVE
					{
					match(input,K_NORECURSIVE,FOLLOW_K_NORECURSIVE_in_listPermissionsStatement7639); if (state.failed) return stmt;
					if ( state.backtracking==0 ) { recursive = false; }
					}
					break;

			}

			if ( state.backtracking==0 ) { stmt = new ListPermissionsStatement(permissionOrAll6, resource, grantee, recursive); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "listPermissionsStatement"



	// $ANTLR start "permission"
	// Parser.g:1092:1: permission returns [Permission perm] : p= ( K_CREATE | K_ALTER | K_DROP | K_SELECT | K_MODIFY | K_AUTHORIZE | K_DESCRIBE | K_EXECUTE ) ;
	public final Permission permission() throws RecognitionException {
		Permission perm = null;


		Token p=null;

		try {
			// Parser.g:1093:5: (p= ( K_CREATE | K_ALTER | K_DROP | K_SELECT | K_MODIFY | K_AUTHORIZE | K_DESCRIBE | K_EXECUTE ) )
			// Parser.g:1093:7: p= ( K_CREATE | K_ALTER | K_DROP | K_SELECT | K_MODIFY | K_AUTHORIZE | K_DESCRIBE | K_EXECUTE )
			{
			p=input.LT(1);
			if ( input.LA(1)==K_ALTER||input.LA(1)==K_AUTHORIZE||input.LA(1)==K_CREATE||input.LA(1)==K_DESCRIBE||input.LA(1)==K_DROP||input.LA(1)==K_EXECUTE||input.LA(1)==K_MODIFY||input.LA(1)==K_SELECT ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return perm;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			if ( state.backtracking==0 ) { perm = Permission.valueOf((p!=null?p.getText():null).toUpperCase()); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return perm;
	}
	// $ANTLR end "permission"



	// $ANTLR start "permissionOrAll"
	// Parser.g:1097:1: permissionOrAll returns [Set<Permission> perms] : ( K_ALL ( K_PERMISSIONS )? |p= permission ( K_PERMISSION )? );
	public final Set<Permission> permissionOrAll() throws RecognitionException {
		Set<Permission> perms = null;


		Permission p =null;

		try {
			// Parser.g:1098:5: ( K_ALL ( K_PERMISSIONS )? |p= permission ( K_PERMISSION )? )
			int alt143=2;
			int LA143_0 = input.LA(1);
			if ( (LA143_0==K_ALL) ) {
				alt143=1;
			}
			else if ( (LA143_0==K_ALTER||LA143_0==K_AUTHORIZE||LA143_0==K_CREATE||LA143_0==K_DESCRIBE||LA143_0==K_DROP||LA143_0==K_EXECUTE||LA143_0==K_MODIFY||LA143_0==K_SELECT) ) {
				alt143=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return perms;}
				NoViableAltException nvae =
					new NoViableAltException("", 143, 0, input);
				throw nvae;
			}

			switch (alt143) {
				case 1 :
					// Parser.g:1098:7: K_ALL ( K_PERMISSIONS )?
					{
					match(input,K_ALL,FOLLOW_K_ALL_in_permissionOrAll7732); if (state.failed) return perms;
					// Parser.g:1098:13: ( K_PERMISSIONS )?
					int alt141=2;
					int LA141_0 = input.LA(1);
					if ( (LA141_0==K_PERMISSIONS) ) {
						alt141=1;
					}
					switch (alt141) {
						case 1 :
							// Parser.g:1098:15: K_PERMISSIONS
							{
							match(input,K_PERMISSIONS,FOLLOW_K_PERMISSIONS_in_permissionOrAll7736); if (state.failed) return perms;
							}
							break;

					}

					if ( state.backtracking==0 ) { perms = Permission.ALL; }
					}
					break;
				case 2 :
					// Parser.g:1099:7: p= permission ( K_PERMISSION )?
					{
					pushFollow(FOLLOW_permission_in_permissionOrAll7757);
					p=permission();
					state._fsp--;
					if (state.failed) return perms;
					// Parser.g:1099:20: ( K_PERMISSION )?
					int alt142=2;
					int LA142_0 = input.LA(1);
					if ( (LA142_0==K_PERMISSION) ) {
						alt142=1;
					}
					switch (alt142) {
						case 1 :
							// Parser.g:1099:22: K_PERMISSION
							{
							match(input,K_PERMISSION,FOLLOW_K_PERMISSION_in_permissionOrAll7761); if (state.failed) return perms;
							}
							break;

					}

					if ( state.backtracking==0 ) { perms = EnumSet.of(p); }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return perms;
	}
	// $ANTLR end "permissionOrAll"



	// $ANTLR start "resource"
	// Parser.g:1102:1: resource returns [IResource res] : (d= dataResource |r= roleResource |f= functionResource |j= jmxResource );
	public final IResource resource() throws RecognitionException {
		IResource res = null;


		DataResource d =null;
		RoleResource r =null;
		FunctionResource f =null;
		JMXResource j =null;

		try {
			// Parser.g:1103:5: (d= dataResource |r= roleResource |f= functionResource |j= jmxResource )
			int alt144=4;
			switch ( input.LA(1) ) {
			case K_ALL:
				{
				switch ( input.LA(2) ) {
				case EOF:
				case K_FROM:
				case K_KEYSPACES:
				case K_NORECURSIVE:
				case K_OF:
				case K_TO:
				case 194:
				case 197:
					{
					alt144=1;
					}
					break;
				case K_ROLES:
					{
					alt144=2;
					}
					break;
				case K_FUNCTIONS:
					{
					alt144=3;
					}
					break;
				case K_MBEANS:
					{
					alt144=4;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return res;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 144, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case IDENT:
			case K_AGGREGATE:
			case K_AS:
			case K_ASCII:
			case K_BIGINT:
			case K_BLOB:
			case K_BOOLEAN:
			case K_CALLED:
			case K_CAST:
			case K_CLUSTERING:
			case K_COLUMNFAMILY:
			case K_COMPACT:
			case K_CONTAINS:
			case K_COUNT:
			case K_COUNTER:
			case K_CUSTOM:
			case K_DATE:
			case K_DECIMAL:
			case K_DISTINCT:
			case K_DOUBLE:
			case K_DURATION:
			case K_EXISTS:
			case K_FILTERING:
			case K_FINALFUNC:
			case K_FLOAT:
			case K_FROZEN:
			case K_FUNCTIONS:
			case K_GROUP:
			case K_INET:
			case K_INITCOND:
			case K_INPUT:
			case K_INT:
			case K_JSON:
			case K_KEY:
			case K_KEYS:
			case K_KEYSPACE:
			case K_KEYSPACES:
			case K_LANGUAGE:
			case K_LIKE:
			case K_LIST:
			case K_LOGIN:
			case K_MAP:
			case K_NOLOGIN:
			case K_NOSUPERUSER:
			case K_OPTIONS:
			case K_PARTITION:
			case K_PASSWORD:
			case K_PER:
			case K_PERMISSION:
			case K_PERMISSIONS:
			case K_RETURNS:
			case K_ROLES:
			case K_SFUNC:
			case K_SMALLINT:
			case K_STATIC:
			case K_STORAGE:
			case K_STYPE:
			case K_SUPERUSER:
			case K_TEXT:
			case K_TIME:
			case K_TIMESTAMP:
			case K_TIMEUUID:
			case K_TINYINT:
			case K_TRIGGER:
			case K_TTL:
			case K_TUPLE:
			case K_TYPE:
			case K_USER:
			case K_USERS:
			case K_UUID:
			case K_VALUES:
			case K_VARCHAR:
			case K_VARINT:
			case K_WRITETIME:
			case QMARK:
			case QUOTED_NAME:
				{
				alt144=1;
				}
				break;
			case K_ROLE:
				{
				int LA144_3 = input.LA(2);
				if ( (LA144_3==EOF||LA144_3==K_FROM||LA144_3==K_NORECURSIVE||LA144_3==K_OF||LA144_3==K_TO||LA144_3==194||LA144_3==197) ) {
					alt144=1;
				}
				else if ( (LA144_3==IDENT||(LA144_3 >= K_AGGREGATE && LA144_3 <= K_ALL)||LA144_3==K_AS||LA144_3==K_ASCII||(LA144_3 >= K_BIGINT && LA144_3 <= K_BOOLEAN)||(LA144_3 >= K_CALLED && LA144_3 <= K_CLUSTERING)||(LA144_3 >= K_COMPACT && LA144_3 <= K_COUNTER)||(LA144_3 >= K_CUSTOM && LA144_3 <= K_DECIMAL)||(LA144_3 >= K_DISTINCT && LA144_3 <= K_DOUBLE)||LA144_3==K_DURATION||(LA144_3 >= K_EXISTS && LA144_3 <= K_FLOAT)||LA144_3==K_FROZEN||(LA144_3 >= K_FUNCTION && LA144_3 <= K_FUNCTIONS)||LA144_3==K_GROUP||(LA144_3 >= K_INET && LA144_3 <= K_INPUT)||LA144_3==K_INT||(LA144_3 >= K_JSON && LA144_3 <= K_KEYS)||(LA144_3 >= K_KEYSPACES && LA144_3 <= K_LIKE)||(LA144_3 >= K_LIST && LA144_3 <= K_MAP)||LA144_3==K_NOLOGIN||LA144_3==K_NOSUPERUSER||LA144_3==K_OPTIONS||(LA144_3 >= K_PARTITION && LA144_3 <= K_PERMISSIONS)||LA144_3==K_RETURNS||(LA144_3 >= K_ROLE && LA144_3 <= K_ROLES)||(LA144_3 >= K_SFUNC && LA144_3 <= K_TINYINT)||LA144_3==K_TRIGGER||(LA144_3 >= K_TTL && LA144_3 <= K_TYPE)||(LA144_3 >= K_USER && LA144_3 <= K_USERS)||(LA144_3 >= K_UUID && LA144_3 <= K_VARINT)||LA144_3==K_WRITETIME||(LA144_3 >= QMARK && LA144_3 <= QUOTED_NAME)||LA144_3==STRING_LITERAL) ) {
					alt144=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return res;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 144, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case K_FUNCTION:
				{
				int LA144_4 = input.LA(2);
				if ( (LA144_4==EOF||LA144_4==K_FROM||LA144_4==K_NORECURSIVE||LA144_4==K_OF||LA144_4==K_TO||LA144_4==194||LA144_4==197) ) {
					alt144=1;
				}
				else if ( (LA144_4==IDENT||(LA144_4 >= K_AGGREGATE && LA144_4 <= K_ALL)||LA144_4==K_AS||LA144_4==K_ASCII||(LA144_4 >= K_BIGINT && LA144_4 <= K_BOOLEAN)||(LA144_4 >= K_CALLED && LA144_4 <= K_CLUSTERING)||(LA144_4 >= K_COMPACT && LA144_4 <= K_COUNTER)||(LA144_4 >= K_CUSTOM && LA144_4 <= K_DECIMAL)||(LA144_4 >= K_DISTINCT && LA144_4 <= K_DOUBLE)||LA144_4==K_DURATION||(LA144_4 >= K_EXISTS && LA144_4 <= K_FLOAT)||LA144_4==K_FROZEN||(LA144_4 >= K_FUNCTION && LA144_4 <= K_FUNCTIONS)||LA144_4==K_GROUP||(LA144_4 >= K_INET && LA144_4 <= K_INPUT)||LA144_4==K_INT||(LA144_4 >= K_JSON && LA144_4 <= K_KEYS)||(LA144_4 >= K_KEYSPACES && LA144_4 <= K_LIKE)||(LA144_4 >= K_LIST && LA144_4 <= K_MAP)||LA144_4==K_NOLOGIN||LA144_4==K_NOSUPERUSER||LA144_4==K_OPTIONS||(LA144_4 >= K_PARTITION && LA144_4 <= K_PERMISSIONS)||LA144_4==K_RETURNS||(LA144_4 >= K_ROLE && LA144_4 <= K_ROLES)||(LA144_4 >= K_SFUNC && LA144_4 <= K_TINYINT)||(LA144_4 >= K_TOKEN && LA144_4 <= K_TRIGGER)||(LA144_4 >= K_TTL && LA144_4 <= K_TYPE)||(LA144_4 >= K_USER && LA144_4 <= K_USERS)||(LA144_4 >= K_UUID && LA144_4 <= K_VARINT)||LA144_4==K_WRITETIME||(LA144_4 >= QMARK && LA144_4 <= QUOTED_NAME)) ) {
					alt144=3;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return res;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 144, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case K_MBEAN:
			case K_MBEANS:
				{
				alt144=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return res;}
				NoViableAltException nvae =
					new NoViableAltException("", 144, 0, input);
				throw nvae;
			}
			switch (alt144) {
				case 1 :
					// Parser.g:1103:7: d= dataResource
					{
					pushFollow(FOLLOW_dataResource_in_resource7789);
					d=dataResource();
					state._fsp--;
					if (state.failed) return res;
					if ( state.backtracking==0 ) { res = d; }
					}
					break;
				case 2 :
					// Parser.g:1104:7: r= roleResource
					{
					pushFollow(FOLLOW_roleResource_in_resource7801);
					r=roleResource();
					state._fsp--;
					if (state.failed) return res;
					if ( state.backtracking==0 ) { res = r; }
					}
					break;
				case 3 :
					// Parser.g:1105:7: f= functionResource
					{
					pushFollow(FOLLOW_functionResource_in_resource7813);
					f=functionResource();
					state._fsp--;
					if (state.failed) return res;
					if ( state.backtracking==0 ) { res = f; }
					}
					break;
				case 4 :
					// Parser.g:1106:7: j= jmxResource
					{
					pushFollow(FOLLOW_jmxResource_in_resource7825);
					j=jmxResource();
					state._fsp--;
					if (state.failed) return res;
					if ( state.backtracking==0 ) { res = j; }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return res;
	}
	// $ANTLR end "resource"



	// $ANTLR start "dataResource"
	// Parser.g:1109:1: dataResource returns [DataResource res] : ( K_ALL K_KEYSPACES | K_KEYSPACE ks= keyspaceName | ( K_COLUMNFAMILY )? cf= columnFamilyName );
	public final DataResource dataResource() throws RecognitionException {
		DataResource res = null;


		String ks =null;
		CFName cf =null;

		try {
			// Parser.g:1110:5: ( K_ALL K_KEYSPACES | K_KEYSPACE ks= keyspaceName | ( K_COLUMNFAMILY )? cf= columnFamilyName )
			int alt146=3;
			switch ( input.LA(1) ) {
			case K_ALL:
				{
				int LA146_1 = input.LA(2);
				if ( (LA146_1==K_KEYSPACES) ) {
					alt146=1;
				}
				else if ( (LA146_1==EOF||LA146_1==K_FROM||LA146_1==K_NORECURSIVE||LA146_1==K_OF||LA146_1==K_TO||LA146_1==194||LA146_1==197) ) {
					alt146=3;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return res;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 146, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case K_KEYSPACE:
				{
				alt146=2;
				}
				break;
			case IDENT:
			case K_AGGREGATE:
			case K_AS:
			case K_ASCII:
			case K_BIGINT:
			case K_BLOB:
			case K_BOOLEAN:
			case K_CALLED:
			case K_CAST:
			case K_CLUSTERING:
			case K_COLUMNFAMILY:
			case K_COMPACT:
			case K_CONTAINS:
			case K_COUNT:
			case K_COUNTER:
			case K_CUSTOM:
			case K_DATE:
			case K_DECIMAL:
			case K_DISTINCT:
			case K_DOUBLE:
			case K_DURATION:
			case K_EXISTS:
			case K_FILTERING:
			case K_FINALFUNC:
			case K_FLOAT:
			case K_FROZEN:
			case K_FUNCTION:
			case K_FUNCTIONS:
			case K_GROUP:
			case K_INET:
			case K_INITCOND:
			case K_INPUT:
			case K_INT:
			case K_JSON:
			case K_KEY:
			case K_KEYS:
			case K_KEYSPACES:
			case K_LANGUAGE:
			case K_LIKE:
			case K_LIST:
			case K_LOGIN:
			case K_MAP:
			case K_NOLOGIN:
			case K_NOSUPERUSER:
			case K_OPTIONS:
			case K_PARTITION:
			case K_PASSWORD:
			case K_PER:
			case K_PERMISSION:
			case K_PERMISSIONS:
			case K_RETURNS:
			case K_ROLE:
			case K_ROLES:
			case K_SFUNC:
			case K_SMALLINT:
			case K_STATIC:
			case K_STORAGE:
			case K_STYPE:
			case K_SUPERUSER:
			case K_TEXT:
			case K_TIME:
			case K_TIMESTAMP:
			case K_TIMEUUID:
			case K_TINYINT:
			case K_TRIGGER:
			case K_TTL:
			case K_TUPLE:
			case K_TYPE:
			case K_USER:
			case K_USERS:
			case K_UUID:
			case K_VALUES:
			case K_VARCHAR:
			case K_VARINT:
			case K_WRITETIME:
			case QMARK:
			case QUOTED_NAME:
				{
				alt146=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return res;}
				NoViableAltException nvae =
					new NoViableAltException("", 146, 0, input);
				throw nvae;
			}
			switch (alt146) {
				case 1 :
					// Parser.g:1110:7: K_ALL K_KEYSPACES
					{
					match(input,K_ALL,FOLLOW_K_ALL_in_dataResource7848); if (state.failed) return res;
					match(input,K_KEYSPACES,FOLLOW_K_KEYSPACES_in_dataResource7850); if (state.failed) return res;
					if ( state.backtracking==0 ) { res = DataResource.root(); }
					}
					break;
				case 2 :
					// Parser.g:1111:7: K_KEYSPACE ks= keyspaceName
					{
					match(input,K_KEYSPACE,FOLLOW_K_KEYSPACE_in_dataResource7860); if (state.failed) return res;
					pushFollow(FOLLOW_keyspaceName_in_dataResource7866);
					ks=keyspaceName();
					state._fsp--;
					if (state.failed) return res;
					if ( state.backtracking==0 ) { res = DataResource.keyspace(ks); }
					}
					break;
				case 3 :
					// Parser.g:1112:7: ( K_COLUMNFAMILY )? cf= columnFamilyName
					{
					// Parser.g:1112:7: ( K_COLUMNFAMILY )?
					int alt145=2;
					int LA145_0 = input.LA(1);
					if ( (LA145_0==K_COLUMNFAMILY) ) {
						alt145=1;
					}
					switch (alt145) {
						case 1 :
							// Parser.g:1112:9: K_COLUMNFAMILY
							{
							match(input,K_COLUMNFAMILY,FOLLOW_K_COLUMNFAMILY_in_dataResource7878); if (state.failed) return res;
							}
							break;

					}

					pushFollow(FOLLOW_columnFamilyName_in_dataResource7887);
					cf=columnFamilyName();
					state._fsp--;
					if (state.failed) return res;
					if ( state.backtracking==0 ) { res = DataResource.table(cf.getKeyspace(), cf.getColumnFamily()); }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return res;
	}
	// $ANTLR end "dataResource"



	// $ANTLR start "jmxResource"
	// Parser.g:1116:1: jmxResource returns [JMXResource res] : ( K_ALL K_MBEANS | K_MBEAN mbean | K_MBEANS mbean );
	public final JMXResource jmxResource() throws RecognitionException {
		JMXResource res = null;


		ParserRuleReturnScope mbean7 =null;
		ParserRuleReturnScope mbean8 =null;

		try {
			// Parser.g:1117:5: ( K_ALL K_MBEANS | K_MBEAN mbean | K_MBEANS mbean )
			int alt147=3;
			switch ( input.LA(1) ) {
			case K_ALL:
				{
				alt147=1;
				}
				break;
			case K_MBEAN:
				{
				alt147=2;
				}
				break;
			case K_MBEANS:
				{
				alt147=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return res;}
				NoViableAltException nvae =
					new NoViableAltException("", 147, 0, input);
				throw nvae;
			}
			switch (alt147) {
				case 1 :
					// Parser.g:1117:7: K_ALL K_MBEANS
					{
					match(input,K_ALL,FOLLOW_K_ALL_in_jmxResource7916); if (state.failed) return res;
					match(input,K_MBEANS,FOLLOW_K_MBEANS_in_jmxResource7918); if (state.failed) return res;
					if ( state.backtracking==0 ) { res = JMXResource.root(); }
					}
					break;
				case 2 :
					// Parser.g:1120:7: K_MBEAN mbean
					{
					match(input,K_MBEAN,FOLLOW_K_MBEAN_in_jmxResource7938); if (state.failed) return res;
					pushFollow(FOLLOW_mbean_in_jmxResource7940);
					mbean7=mbean();
					state._fsp--;
					if (state.failed) return res;
					if ( state.backtracking==0 ) { res = JMXResource.mbean(canonicalizeObjectName((mbean7!=null?input.toString(mbean7.start,mbean7.stop):null), false)); }
					}
					break;
				case 3 :
					// Parser.g:1121:7: K_MBEANS mbean
					{
					match(input,K_MBEANS,FOLLOW_K_MBEANS_in_jmxResource7950); if (state.failed) return res;
					pushFollow(FOLLOW_mbean_in_jmxResource7952);
					mbean8=mbean();
					state._fsp--;
					if (state.failed) return res;
					if ( state.backtracking==0 ) { res = JMXResource.mbean(canonicalizeObjectName((mbean8!=null?input.toString(mbean8.start,mbean8.stop):null), true)); }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return res;
	}
	// $ANTLR end "jmxResource"



	// $ANTLR start "roleResource"
	// Parser.g:1124:1: roleResource returns [RoleResource res] : ( K_ALL K_ROLES | K_ROLE role= userOrRoleName );
	public final RoleResource roleResource() throws RecognitionException {
		RoleResource res = null;


		RoleName role =null;

		try {
			// Parser.g:1125:5: ( K_ALL K_ROLES | K_ROLE role= userOrRoleName )
			int alt148=2;
			int LA148_0 = input.LA(1);
			if ( (LA148_0==K_ALL) ) {
				alt148=1;
			}
			else if ( (LA148_0==K_ROLE) ) {
				alt148=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return res;}
				NoViableAltException nvae =
					new NoViableAltException("", 148, 0, input);
				throw nvae;
			}

			switch (alt148) {
				case 1 :
					// Parser.g:1125:7: K_ALL K_ROLES
					{
					match(input,K_ALL,FOLLOW_K_ALL_in_roleResource7975); if (state.failed) return res;
					match(input,K_ROLES,FOLLOW_K_ROLES_in_roleResource7977); if (state.failed) return res;
					if ( state.backtracking==0 ) { res = RoleResource.root(); }
					}
					break;
				case 2 :
					// Parser.g:1126:7: K_ROLE role= userOrRoleName
					{
					match(input,K_ROLE,FOLLOW_K_ROLE_in_roleResource7987); if (state.failed) return res;
					pushFollow(FOLLOW_userOrRoleName_in_roleResource7993);
					role=userOrRoleName();
					state._fsp--;
					if (state.failed) return res;
					if ( state.backtracking==0 ) { res = RoleResource.role(role.getName()); }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return res;
	}
	// $ANTLR end "roleResource"



	// $ANTLR start "functionResource"
	// Parser.g:1129:1: functionResource returns [FunctionResource res] : ( K_ALL K_FUNCTIONS | K_ALL K_FUNCTIONS K_IN K_KEYSPACE ks= keyspaceName | K_FUNCTION fn= functionName ( '(' (v= comparatorType ( ',' v= comparatorType )* )? ')' ) );
	public final FunctionResource functionResource() throws RecognitionException {
		FunctionResource res = null;


		String ks =null;
		FunctionName fn =null;
		CQL3Type.Raw v =null;


		        List<CQL3Type.Raw> argsTypes = new ArrayList<>();
		    
		try {
			// Parser.g:1133:5: ( K_ALL K_FUNCTIONS | K_ALL K_FUNCTIONS K_IN K_KEYSPACE ks= keyspaceName | K_FUNCTION fn= functionName ( '(' (v= comparatorType ( ',' v= comparatorType )* )? ')' ) )
			int alt151=3;
			int LA151_0 = input.LA(1);
			if ( (LA151_0==K_ALL) ) {
				int LA151_1 = input.LA(2);
				if ( (LA151_1==K_FUNCTIONS) ) {
					int LA151_3 = input.LA(3);
					if ( (LA151_3==K_IN) ) {
						alt151=2;
					}
					else if ( (LA151_3==EOF||LA151_3==K_FROM||LA151_3==K_NORECURSIVE||LA151_3==K_OF||LA151_3==K_TO||LA151_3==197) ) {
						alt151=1;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return res;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 151, 3, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return res;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 151, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA151_0==K_FUNCTION) ) {
				alt151=3;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return res;}
				NoViableAltException nvae =
					new NoViableAltException("", 151, 0, input);
				throw nvae;
			}

			switch (alt151) {
				case 1 :
					// Parser.g:1133:7: K_ALL K_FUNCTIONS
					{
					match(input,K_ALL,FOLLOW_K_ALL_in_functionResource8025); if (state.failed) return res;
					match(input,K_FUNCTIONS,FOLLOW_K_FUNCTIONS_in_functionResource8027); if (state.failed) return res;
					if ( state.backtracking==0 ) { res = FunctionResource.root(); }
					}
					break;
				case 2 :
					// Parser.g:1134:7: K_ALL K_FUNCTIONS K_IN K_KEYSPACE ks= keyspaceName
					{
					match(input,K_ALL,FOLLOW_K_ALL_in_functionResource8037); if (state.failed) return res;
					match(input,K_FUNCTIONS,FOLLOW_K_FUNCTIONS_in_functionResource8039); if (state.failed) return res;
					match(input,K_IN,FOLLOW_K_IN_in_functionResource8041); if (state.failed) return res;
					match(input,K_KEYSPACE,FOLLOW_K_KEYSPACE_in_functionResource8043); if (state.failed) return res;
					pushFollow(FOLLOW_keyspaceName_in_functionResource8049);
					ks=keyspaceName();
					state._fsp--;
					if (state.failed) return res;
					if ( state.backtracking==0 ) { res = FunctionResource.keyspace(ks); }
					}
					break;
				case 3 :
					// Parser.g:1136:7: K_FUNCTION fn= functionName ( '(' (v= comparatorType ( ',' v= comparatorType )* )? ')' )
					{
					match(input,K_FUNCTION,FOLLOW_K_FUNCTION_in_functionResource8064); if (state.failed) return res;
					pushFollow(FOLLOW_functionName_in_functionResource8068);
					fn=functionName();
					state._fsp--;
					if (state.failed) return res;
					// Parser.g:1137:7: ( '(' (v= comparatorType ( ',' v= comparatorType )* )? ')' )
					// Parser.g:1138:9: '(' (v= comparatorType ( ',' v= comparatorType )* )? ')'
					{
					match(input,187,FOLLOW_187_in_functionResource8086); if (state.failed) return res;
					// Parser.g:1139:11: (v= comparatorType ( ',' v= comparatorType )* )?
					int alt150=2;
					int LA150_0 = input.LA(1);
					if ( (LA150_0==IDENT||(LA150_0 >= K_AGGREGATE && LA150_0 <= K_ALL)||LA150_0==K_AS||LA150_0==K_ASCII||(LA150_0 >= K_BIGINT && LA150_0 <= K_BOOLEAN)||(LA150_0 >= K_CALLED && LA150_0 <= K_CLUSTERING)||(LA150_0 >= K_COMPACT && LA150_0 <= K_COUNTER)||(LA150_0 >= K_CUSTOM && LA150_0 <= K_DECIMAL)||(LA150_0 >= K_DISTINCT && LA150_0 <= K_DOUBLE)||LA150_0==K_DURATION||(LA150_0 >= K_EXISTS && LA150_0 <= K_FLOAT)||LA150_0==K_FROZEN||(LA150_0 >= K_FUNCTION && LA150_0 <= K_FUNCTIONS)||LA150_0==K_GROUP||(LA150_0 >= K_INET && LA150_0 <= K_INPUT)||LA150_0==K_INT||(LA150_0 >= K_JSON && LA150_0 <= K_KEYS)||(LA150_0 >= K_KEYSPACES && LA150_0 <= K_LIKE)||(LA150_0 >= K_LIST && LA150_0 <= K_MAP)||LA150_0==K_NOLOGIN||LA150_0==K_NOSUPERUSER||LA150_0==K_OPTIONS||(LA150_0 >= K_PARTITION && LA150_0 <= K_PERMISSIONS)||LA150_0==K_RETURNS||(LA150_0 >= K_ROLE && LA150_0 <= K_ROLES)||(LA150_0 >= K_SET && LA150_0 <= K_TINYINT)||LA150_0==K_TRIGGER||(LA150_0 >= K_TTL && LA150_0 <= K_TYPE)||(LA150_0 >= K_USER && LA150_0 <= K_USERS)||(LA150_0 >= K_UUID && LA150_0 <= K_VARINT)||LA150_0==K_WRITETIME||LA150_0==QUOTED_NAME||LA150_0==STRING_LITERAL) ) {
						alt150=1;
					}
					switch (alt150) {
						case 1 :
							// Parser.g:1140:13: v= comparatorType ( ',' v= comparatorType )*
							{
							pushFollow(FOLLOW_comparatorType_in_functionResource8114);
							v=comparatorType();
							state._fsp--;
							if (state.failed) return res;
							if ( state.backtracking==0 ) { argsTypes.add(v); }
							// Parser.g:1141:13: ( ',' v= comparatorType )*
							loop149:
							while (true) {
								int alt149=2;
								int LA149_0 = input.LA(1);
								if ( (LA149_0==191) ) {
									alt149=1;
								}

								switch (alt149) {
								case 1 :
									// Parser.g:1141:15: ',' v= comparatorType
									{
									match(input,191,FOLLOW_191_in_functionResource8132); if (state.failed) return res;
									pushFollow(FOLLOW_comparatorType_in_functionResource8136);
									v=comparatorType();
									state._fsp--;
									if (state.failed) return res;
									if ( state.backtracking==0 ) { argsTypes.add(v); }
									}
									break;

								default :
									break loop149;
								}
							}

							}
							break;

					}

					match(input,188,FOLLOW_188_in_functionResource8164); if (state.failed) return res;
					}

					if ( state.backtracking==0 ) { res = FunctionResource.functionFromCql(fn.keyspace, fn.name, argsTypes); }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return res;
	}
	// $ANTLR end "functionResource"



	// $ANTLR start "createUserStatement"
	// Parser.g:1151:1: createUserStatement returns [CreateRoleStatement stmt] : K_CREATE K_USER ( K_IF K_NOT K_EXISTS )? u= username ( K_WITH userPassword[opts] )? ( K_SUPERUSER | K_NOSUPERUSER )? ;
	public final CreateRoleStatement createUserStatement() throws RecognitionException {
		CreateRoleStatement stmt = null;


		ParserRuleReturnScope u =null;


		        RoleOptions opts = new RoleOptions();
		        opts.setOption(IRoleManager.Option.LOGIN, true);
		        boolean superuser = false;
		        boolean ifNotExists = false;
		        RoleName name = new RoleName();
		    
		try {
			// Parser.g:1159:5: ( K_CREATE K_USER ( K_IF K_NOT K_EXISTS )? u= username ( K_WITH userPassword[opts] )? ( K_SUPERUSER | K_NOSUPERUSER )? )
			// Parser.g:1159:7: K_CREATE K_USER ( K_IF K_NOT K_EXISTS )? u= username ( K_WITH userPassword[opts] )? ( K_SUPERUSER | K_NOSUPERUSER )?
			{
			match(input,K_CREATE,FOLLOW_K_CREATE_in_createUserStatement8212); if (state.failed) return stmt;
			match(input,K_USER,FOLLOW_K_USER_in_createUserStatement8214); if (state.failed) return stmt;
			// Parser.g:1159:23: ( K_IF K_NOT K_EXISTS )?
			int alt152=2;
			int LA152_0 = input.LA(1);
			if ( (LA152_0==K_IF) ) {
				alt152=1;
			}
			switch (alt152) {
				case 1 :
					// Parser.g:1159:24: K_IF K_NOT K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_createUserStatement8217); if (state.failed) return stmt;
					match(input,K_NOT,FOLLOW_K_NOT_in_createUserStatement8219); if (state.failed) return stmt;
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_createUserStatement8221); if (state.failed) return stmt;
					if ( state.backtracking==0 ) { ifNotExists = true; }
					}
					break;

			}

			pushFollow(FOLLOW_username_in_createUserStatement8229);
			u=username();
			state._fsp--;
			if (state.failed) return stmt;
			if ( state.backtracking==0 ) { name.setName((u!=null?input.toString(u.start,u.stop):null), true); }
			// Parser.g:1160:7: ( K_WITH userPassword[opts] )?
			int alt153=2;
			int LA153_0 = input.LA(1);
			if ( (LA153_0==K_WITH) ) {
				alt153=1;
			}
			switch (alt153) {
				case 1 :
					// Parser.g:1160:9: K_WITH userPassword[opts]
					{
					match(input,K_WITH,FOLLOW_K_WITH_in_createUserStatement8241); if (state.failed) return stmt;
					pushFollow(FOLLOW_userPassword_in_createUserStatement8243);
					userPassword(opts);
					state._fsp--;
					if (state.failed) return stmt;
					}
					break;

			}

			// Parser.g:1161:7: ( K_SUPERUSER | K_NOSUPERUSER )?
			int alt154=3;
			int LA154_0 = input.LA(1);
			if ( (LA154_0==K_SUPERUSER) ) {
				alt154=1;
			}
			else if ( (LA154_0==K_NOSUPERUSER) ) {
				alt154=2;
			}
			switch (alt154) {
				case 1 :
					// Parser.g:1161:9: K_SUPERUSER
					{
					match(input,K_SUPERUSER,FOLLOW_K_SUPERUSER_in_createUserStatement8257); if (state.failed) return stmt;
					if ( state.backtracking==0 ) { superuser = true; }
					}
					break;
				case 2 :
					// Parser.g:1161:45: K_NOSUPERUSER
					{
					match(input,K_NOSUPERUSER,FOLLOW_K_NOSUPERUSER_in_createUserStatement8263); if (state.failed) return stmt;
					if ( state.backtracking==0 ) { superuser = false; }
					}
					break;

			}

			if ( state.backtracking==0 ) { opts.setOption(IRoleManager.Option.SUPERUSER, superuser);
			        stmt = new CreateRoleStatement(name, opts, ifNotExists); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "createUserStatement"



	// $ANTLR start "alterUserStatement"
	// Parser.g:1169:1: alterUserStatement returns [AlterRoleStatement stmt] : K_ALTER K_USER u= username ( K_WITH userPassword[opts] )? ( K_SUPERUSER | K_NOSUPERUSER )? ;
	public final AlterRoleStatement alterUserStatement() throws RecognitionException {
		AlterRoleStatement stmt = null;


		ParserRuleReturnScope u =null;


		        RoleOptions opts = new RoleOptions();
		        RoleName name = new RoleName();
		    
		try {
			// Parser.g:1174:5: ( K_ALTER K_USER u= username ( K_WITH userPassword[opts] )? ( K_SUPERUSER | K_NOSUPERUSER )? )
			// Parser.g:1174:7: K_ALTER K_USER u= username ( K_WITH userPassword[opts] )? ( K_SUPERUSER | K_NOSUPERUSER )?
			{
			match(input,K_ALTER,FOLLOW_K_ALTER_in_alterUserStatement8308); if (state.failed) return stmt;
			match(input,K_USER,FOLLOW_K_USER_in_alterUserStatement8310); if (state.failed) return stmt;
			pushFollow(FOLLOW_username_in_alterUserStatement8314);
			u=username();
			state._fsp--;
			if (state.failed) return stmt;
			if ( state.backtracking==0 ) { name.setName((u!=null?input.toString(u.start,u.stop):null), true); }
			// Parser.g:1175:7: ( K_WITH userPassword[opts] )?
			int alt155=2;
			int LA155_0 = input.LA(1);
			if ( (LA155_0==K_WITH) ) {
				alt155=1;
			}
			switch (alt155) {
				case 1 :
					// Parser.g:1175:9: K_WITH userPassword[opts]
					{
					match(input,K_WITH,FOLLOW_K_WITH_in_alterUserStatement8326); if (state.failed) return stmt;
					pushFollow(FOLLOW_userPassword_in_alterUserStatement8328);
					userPassword(opts);
					state._fsp--;
					if (state.failed) return stmt;
					}
					break;

			}

			// Parser.g:1176:7: ( K_SUPERUSER | K_NOSUPERUSER )?
			int alt156=3;
			int LA156_0 = input.LA(1);
			if ( (LA156_0==K_SUPERUSER) ) {
				alt156=1;
			}
			else if ( (LA156_0==K_NOSUPERUSER) ) {
				alt156=2;
			}
			switch (alt156) {
				case 1 :
					// Parser.g:1176:9: K_SUPERUSER
					{
					match(input,K_SUPERUSER,FOLLOW_K_SUPERUSER_in_alterUserStatement8342); if (state.failed) return stmt;
					if ( state.backtracking==0 ) { opts.setOption(IRoleManager.Option.SUPERUSER, true); }
					}
					break;
				case 2 :
					// Parser.g:1177:11: K_NOSUPERUSER
					{
					match(input,K_NOSUPERUSER,FOLLOW_K_NOSUPERUSER_in_alterUserStatement8356); if (state.failed) return stmt;
					if ( state.backtracking==0 ) { opts.setOption(IRoleManager.Option.SUPERUSER, false); }
					}
					break;

			}

			if ( state.backtracking==0 ) {  stmt = new AlterRoleStatement(name, opts); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "alterUserStatement"



	// $ANTLR start "dropUserStatement"
	// Parser.g:1184:1: dropUserStatement returns [DropRoleStatement stmt] : K_DROP K_USER ( K_IF K_EXISTS )? u= username ;
	public final DropRoleStatement dropUserStatement() throws RecognitionException {
		DropRoleStatement stmt = null;


		ParserRuleReturnScope u =null;


		        boolean ifExists = false;
		        RoleName name = new RoleName();
		    
		try {
			// Parser.g:1189:5: ( K_DROP K_USER ( K_IF K_EXISTS )? u= username )
			// Parser.g:1189:7: K_DROP K_USER ( K_IF K_EXISTS )? u= username
			{
			match(input,K_DROP,FOLLOW_K_DROP_in_dropUserStatement8402); if (state.failed) return stmt;
			match(input,K_USER,FOLLOW_K_USER_in_dropUserStatement8404); if (state.failed) return stmt;
			// Parser.g:1189:21: ( K_IF K_EXISTS )?
			int alt157=2;
			int LA157_0 = input.LA(1);
			if ( (LA157_0==K_IF) ) {
				alt157=1;
			}
			switch (alt157) {
				case 1 :
					// Parser.g:1189:22: K_IF K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_dropUserStatement8407); if (state.failed) return stmt;
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_dropUserStatement8409); if (state.failed) return stmt;
					if ( state.backtracking==0 ) { ifExists = true; }
					}
					break;

			}

			pushFollow(FOLLOW_username_in_dropUserStatement8417);
			u=username();
			state._fsp--;
			if (state.failed) return stmt;
			if ( state.backtracking==0 ) { name.setName((u!=null?input.toString(u.start,u.stop):null), true); stmt = new DropRoleStatement(name, ifExists); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "dropUserStatement"



	// $ANTLR start "listUsersStatement"
	// Parser.g:1195:1: listUsersStatement returns [ListRolesStatement stmt] : K_LIST K_USERS ;
	public final ListRolesStatement listUsersStatement() throws RecognitionException {
		ListRolesStatement stmt = null;


		try {
			// Parser.g:1196:5: ( K_LIST K_USERS )
			// Parser.g:1196:7: K_LIST K_USERS
			{
			match(input,K_LIST,FOLLOW_K_LIST_in_listUsersStatement8442); if (state.failed) return stmt;
			match(input,K_USERS,FOLLOW_K_USERS_in_listUsersStatement8444); if (state.failed) return stmt;
			if ( state.backtracking==0 ) { stmt = new ListUsersStatement(); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "listUsersStatement"



	// $ANTLR start "createRoleStatement"
	// Parser.g:1208:1: createRoleStatement returns [CreateRoleStatement stmt] : K_CREATE K_ROLE ( K_IF K_NOT K_EXISTS )? name= userOrRoleName ( K_WITH roleOptions[opts] )? ;
	public final CreateRoleStatement createRoleStatement() throws RecognitionException {
		CreateRoleStatement stmt = null;


		RoleName name =null;


		        RoleOptions opts = new RoleOptions();
		        boolean ifNotExists = false;
		    
		try {
			// Parser.g:1213:5: ( K_CREATE K_ROLE ( K_IF K_NOT K_EXISTS )? name= userOrRoleName ( K_WITH roleOptions[opts] )? )
			// Parser.g:1213:7: K_CREATE K_ROLE ( K_IF K_NOT K_EXISTS )? name= userOrRoleName ( K_WITH roleOptions[opts] )?
			{
			match(input,K_CREATE,FOLLOW_K_CREATE_in_createRoleStatement8478); if (state.failed) return stmt;
			match(input,K_ROLE,FOLLOW_K_ROLE_in_createRoleStatement8480); if (state.failed) return stmt;
			// Parser.g:1213:23: ( K_IF K_NOT K_EXISTS )?
			int alt158=2;
			int LA158_0 = input.LA(1);
			if ( (LA158_0==K_IF) ) {
				alt158=1;
			}
			switch (alt158) {
				case 1 :
					// Parser.g:1213:24: K_IF K_NOT K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_createRoleStatement8483); if (state.failed) return stmt;
					match(input,K_NOT,FOLLOW_K_NOT_in_createRoleStatement8485); if (state.failed) return stmt;
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_createRoleStatement8487); if (state.failed) return stmt;
					if ( state.backtracking==0 ) { ifNotExists = true; }
					}
					break;

			}

			pushFollow(FOLLOW_userOrRoleName_in_createRoleStatement8495);
			name=userOrRoleName();
			state._fsp--;
			if (state.failed) return stmt;
			// Parser.g:1214:7: ( K_WITH roleOptions[opts] )?
			int alt159=2;
			int LA159_0 = input.LA(1);
			if ( (LA159_0==K_WITH) ) {
				alt159=1;
			}
			switch (alt159) {
				case 1 :
					// Parser.g:1214:9: K_WITH roleOptions[opts]
					{
					match(input,K_WITH,FOLLOW_K_WITH_in_createRoleStatement8505); if (state.failed) return stmt;
					pushFollow(FOLLOW_roleOptions_in_createRoleStatement8507);
					roleOptions(opts);
					state._fsp--;
					if (state.failed) return stmt;
					}
					break;

			}

			if ( state.backtracking==0 ) {
			        // set defaults if they weren't explictly supplied
			        if (!opts.getLogin().isPresent())
			        {
			            opts.setOption(IRoleManager.Option.LOGIN, false);
			        }
			        if (!opts.getSuperuser().isPresent())
			        {
			            opts.setOption(IRoleManager.Option.SUPERUSER, false);
			        }
			        stmt = new CreateRoleStatement(name, opts, ifNotExists);
			      }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "createRoleStatement"



	// $ANTLR start "alterRoleStatement"
	// Parser.g:1238:1: alterRoleStatement returns [AlterRoleStatement stmt] : K_ALTER K_ROLE name= userOrRoleName ( K_WITH roleOptions[opts] )? ;
	public final AlterRoleStatement alterRoleStatement() throws RecognitionException {
		AlterRoleStatement stmt = null;


		RoleName name =null;


		        RoleOptions opts = new RoleOptions();
		    
		try {
			// Parser.g:1242:5: ( K_ALTER K_ROLE name= userOrRoleName ( K_WITH roleOptions[opts] )? )
			// Parser.g:1242:7: K_ALTER K_ROLE name= userOrRoleName ( K_WITH roleOptions[opts] )?
			{
			match(input,K_ALTER,FOLLOW_K_ALTER_in_alterRoleStatement8551); if (state.failed) return stmt;
			match(input,K_ROLE,FOLLOW_K_ROLE_in_alterRoleStatement8553); if (state.failed) return stmt;
			pushFollow(FOLLOW_userOrRoleName_in_alterRoleStatement8557);
			name=userOrRoleName();
			state._fsp--;
			if (state.failed) return stmt;
			// Parser.g:1243:7: ( K_WITH roleOptions[opts] )?
			int alt160=2;
			int LA160_0 = input.LA(1);
			if ( (LA160_0==K_WITH) ) {
				alt160=1;
			}
			switch (alt160) {
				case 1 :
					// Parser.g:1243:9: K_WITH roleOptions[opts]
					{
					match(input,K_WITH,FOLLOW_K_WITH_in_alterRoleStatement8567); if (state.failed) return stmt;
					pushFollow(FOLLOW_roleOptions_in_alterRoleStatement8569);
					roleOptions(opts);
					state._fsp--;
					if (state.failed) return stmt;
					}
					break;

			}

			if ( state.backtracking==0 ) {  stmt = new AlterRoleStatement(name, opts); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "alterRoleStatement"



	// $ANTLR start "dropRoleStatement"
	// Parser.g:1250:1: dropRoleStatement returns [DropRoleStatement stmt] : K_DROP K_ROLE ( K_IF K_EXISTS )? name= userOrRoleName ;
	public final DropRoleStatement dropRoleStatement() throws RecognitionException {
		DropRoleStatement stmt = null;


		RoleName name =null;


		        boolean ifExists = false;
		    
		try {
			// Parser.g:1254:5: ( K_DROP K_ROLE ( K_IF K_EXISTS )? name= userOrRoleName )
			// Parser.g:1254:7: K_DROP K_ROLE ( K_IF K_EXISTS )? name= userOrRoleName
			{
			match(input,K_DROP,FOLLOW_K_DROP_in_dropRoleStatement8613); if (state.failed) return stmt;
			match(input,K_ROLE,FOLLOW_K_ROLE_in_dropRoleStatement8615); if (state.failed) return stmt;
			// Parser.g:1254:21: ( K_IF K_EXISTS )?
			int alt161=2;
			int LA161_0 = input.LA(1);
			if ( (LA161_0==K_IF) ) {
				alt161=1;
			}
			switch (alt161) {
				case 1 :
					// Parser.g:1254:22: K_IF K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_dropRoleStatement8618); if (state.failed) return stmt;
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_dropRoleStatement8620); if (state.failed) return stmt;
					if ( state.backtracking==0 ) { ifExists = true; }
					}
					break;

			}

			pushFollow(FOLLOW_userOrRoleName_in_dropRoleStatement8628);
			name=userOrRoleName();
			state._fsp--;
			if (state.failed) return stmt;
			if ( state.backtracking==0 ) { stmt = new DropRoleStatement(name, ifExists); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "dropRoleStatement"



	// $ANTLR start "listRolesStatement"
	// Parser.g:1261:1: listRolesStatement returns [ListRolesStatement stmt] : K_LIST K_ROLES ( K_OF roleName[grantee] )? ( K_NORECURSIVE )? ;
	public final ListRolesStatement listRolesStatement() throws RecognitionException {
		ListRolesStatement stmt = null;



		        boolean recursive = true;
		        RoleName grantee = new RoleName();
		    
		try {
			// Parser.g:1266:5: ( K_LIST K_ROLES ( K_OF roleName[grantee] )? ( K_NORECURSIVE )? )
			// Parser.g:1266:7: K_LIST K_ROLES ( K_OF roleName[grantee] )? ( K_NORECURSIVE )?
			{
			match(input,K_LIST,FOLLOW_K_LIST_in_listRolesStatement8668); if (state.failed) return stmt;
			match(input,K_ROLES,FOLLOW_K_ROLES_in_listRolesStatement8670); if (state.failed) return stmt;
			// Parser.g:1267:7: ( K_OF roleName[grantee] )?
			int alt162=2;
			int LA162_0 = input.LA(1);
			if ( (LA162_0==K_OF) ) {
				alt162=1;
			}
			switch (alt162) {
				case 1 :
					// Parser.g:1267:9: K_OF roleName[grantee]
					{
					match(input,K_OF,FOLLOW_K_OF_in_listRolesStatement8680); if (state.failed) return stmt;
					pushFollow(FOLLOW_roleName_in_listRolesStatement8682);
					roleName(grantee);
					state._fsp--;
					if (state.failed) return stmt;
					}
					break;

			}

			// Parser.g:1268:7: ( K_NORECURSIVE )?
			int alt163=2;
			int LA163_0 = input.LA(1);
			if ( (LA163_0==K_NORECURSIVE) ) {
				alt163=1;
			}
			switch (alt163) {
				case 1 :
					// Parser.g:1268:9: K_NORECURSIVE
					{
					match(input,K_NORECURSIVE,FOLLOW_K_NORECURSIVE_in_listRolesStatement8695); if (state.failed) return stmt;
					if ( state.backtracking==0 ) { recursive = false; }
					}
					break;

			}

			if ( state.backtracking==0 ) { stmt = new ListRolesStatement(grantee, recursive); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "listRolesStatement"



	// $ANTLR start "roleOptions"
	// Parser.g:1272:1: roleOptions[RoleOptions opts] : roleOption[opts] ( K_AND roleOption[opts] )* ;
	public final void roleOptions(RoleOptions opts) throws RecognitionException {
		try {
			// Parser.g:1273:5: ( roleOption[opts] ( K_AND roleOption[opts] )* )
			// Parser.g:1273:7: roleOption[opts] ( K_AND roleOption[opts] )*
			{
			pushFollow(FOLLOW_roleOption_in_roleOptions8726);
			roleOption(opts);
			state._fsp--;
			if (state.failed) return;
			// Parser.g:1273:24: ( K_AND roleOption[opts] )*
			loop164:
			while (true) {
				int alt164=2;
				int LA164_0 = input.LA(1);
				if ( (LA164_0==K_AND) ) {
					alt164=1;
				}

				switch (alt164) {
				case 1 :
					// Parser.g:1273:25: K_AND roleOption[opts]
					{
					match(input,K_AND,FOLLOW_K_AND_in_roleOptions8730); if (state.failed) return;
					pushFollow(FOLLOW_roleOption_in_roleOptions8732);
					roleOption(opts);
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop164;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "roleOptions"



	// $ANTLR start "roleOption"
	// Parser.g:1276:1: roleOption[RoleOptions opts] : ( K_PASSWORD '=' v= STRING_LITERAL | K_OPTIONS '=' m= fullMapLiteral | K_SUPERUSER '=' b= BOOLEAN | K_LOGIN '=' b= BOOLEAN );
	public final void roleOption(RoleOptions opts) throws RecognitionException {
		Token v=null;
		Token b=null;
		Maps.Literal m =null;

		try {
			// Parser.g:1277:5: ( K_PASSWORD '=' v= STRING_LITERAL | K_OPTIONS '=' m= fullMapLiteral | K_SUPERUSER '=' b= BOOLEAN | K_LOGIN '=' b= BOOLEAN )
			int alt165=4;
			switch ( input.LA(1) ) {
			case K_PASSWORD:
				{
				alt165=1;
				}
				break;
			case K_OPTIONS:
				{
				alt165=2;
				}
				break;
			case K_SUPERUSER:
				{
				alt165=3;
				}
				break;
			case K_LOGIN:
				{
				alt165=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 165, 0, input);
				throw nvae;
			}
			switch (alt165) {
				case 1 :
					// Parser.g:1277:8: K_PASSWORD '=' v= STRING_LITERAL
					{
					match(input,K_PASSWORD,FOLLOW_K_PASSWORD_in_roleOption8754); if (state.failed) return;
					match(input,200,FOLLOW_200_in_roleOption8756); if (state.failed) return;
					v=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_roleOption8760); if (state.failed) return;
					if ( state.backtracking==0 ) { opts.setOption(IRoleManager.Option.PASSWORD, (v!=null?v.getText():null)); }
					}
					break;
				case 2 :
					// Parser.g:1278:8: K_OPTIONS '=' m= fullMapLiteral
					{
					match(input,K_OPTIONS,FOLLOW_K_OPTIONS_in_roleOption8771); if (state.failed) return;
					match(input,200,FOLLOW_200_in_roleOption8773); if (state.failed) return;
					pushFollow(FOLLOW_fullMapLiteral_in_roleOption8777);
					m=fullMapLiteral();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) { opts.setOption(IRoleManager.Option.OPTIONS, convertPropertyMap(m)); }
					}
					break;
				case 3 :
					// Parser.g:1279:8: K_SUPERUSER '=' b= BOOLEAN
					{
					match(input,K_SUPERUSER,FOLLOW_K_SUPERUSER_in_roleOption8788); if (state.failed) return;
					match(input,200,FOLLOW_200_in_roleOption8790); if (state.failed) return;
					b=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_roleOption8794); if (state.failed) return;
					if ( state.backtracking==0 ) { opts.setOption(IRoleManager.Option.SUPERUSER, Boolean.valueOf((b!=null?b.getText():null))); }
					}
					break;
				case 4 :
					// Parser.g:1280:8: K_LOGIN '=' b= BOOLEAN
					{
					match(input,K_LOGIN,FOLLOW_K_LOGIN_in_roleOption8805); if (state.failed) return;
					match(input,200,FOLLOW_200_in_roleOption8807); if (state.failed) return;
					b=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_roleOption8811); if (state.failed) return;
					if ( state.backtracking==0 ) { opts.setOption(IRoleManager.Option.LOGIN, Boolean.valueOf((b!=null?b.getText():null))); }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "roleOption"



	// $ANTLR start "userPassword"
	// Parser.g:1284:1: userPassword[RoleOptions opts] : K_PASSWORD v= STRING_LITERAL ;
	public final void userPassword(RoleOptions opts) throws RecognitionException {
		Token v=null;

		try {
			// Parser.g:1285:5: ( K_PASSWORD v= STRING_LITERAL )
			// Parser.g:1285:8: K_PASSWORD v= STRING_LITERAL
			{
			match(input,K_PASSWORD,FOLLOW_K_PASSWORD_in_userPassword8833); if (state.failed) return;
			v=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_userPassword8837); if (state.failed) return;
			if ( state.backtracking==0 ) { opts.setOption(IRoleManager.Option.PASSWORD, (v!=null?v.getText():null)); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "userPassword"



	// $ANTLR start "cident"
	// Parser.g:1293:1: cident returns [ColumnMetadata.Raw id] : (t= IDENT |t= QUOTED_NAME |k= unreserved_keyword );
	public final ColumnMetadata.Raw cident() throws RecognitionException {
		ColumnMetadata.Raw id = null;


		Token t=null;
		String k =null;

		try {
			// Parser.g:1294:5: (t= IDENT |t= QUOTED_NAME |k= unreserved_keyword )
			int alt166=3;
			switch ( input.LA(1) ) {
			case IDENT:
				{
				alt166=1;
				}
				break;
			case QUOTED_NAME:
				{
				alt166=2;
				}
				break;
			case K_AGGREGATE:
			case K_ALL:
			case K_AS:
			case K_ASCII:
			case K_BIGINT:
			case K_BLOB:
			case K_BOOLEAN:
			case K_CALLED:
			case K_CAST:
			case K_CLUSTERING:
			case K_COMPACT:
			case K_CONTAINS:
			case K_COUNT:
			case K_COUNTER:
			case K_CUSTOM:
			case K_DATE:
			case K_DECIMAL:
			case K_DISTINCT:
			case K_DOUBLE:
			case K_DURATION:
			case K_EXISTS:
			case K_FILTERING:
			case K_FINALFUNC:
			case K_FLOAT:
			case K_FROZEN:
			case K_FUNCTION:
			case K_FUNCTIONS:
			case K_GROUP:
			case K_INET:
			case K_INITCOND:
			case K_INPUT:
			case K_INT:
			case K_JSON:
			case K_KEY:
			case K_KEYS:
			case K_KEYSPACES:
			case K_LANGUAGE:
			case K_LIKE:
			case K_LIST:
			case K_LOGIN:
			case K_MAP:
			case K_NOLOGIN:
			case K_NOSUPERUSER:
			case K_OPTIONS:
			case K_PARTITION:
			case K_PASSWORD:
			case K_PER:
			case K_PERMISSION:
			case K_PERMISSIONS:
			case K_RETURNS:
			case K_ROLE:
			case K_ROLES:
			case K_SFUNC:
			case K_SMALLINT:
			case K_STATIC:
			case K_STORAGE:
			case K_STYPE:
			case K_SUPERUSER:
			case K_TEXT:
			case K_TIME:
			case K_TIMESTAMP:
			case K_TIMEUUID:
			case K_TINYINT:
			case K_TRIGGER:
			case K_TTL:
			case K_TUPLE:
			case K_TYPE:
			case K_USER:
			case K_USERS:
			case K_UUID:
			case K_VALUES:
			case K_VARCHAR:
			case K_VARINT:
			case K_WRITETIME:
				{
				alt166=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return id;}
				NoViableAltException nvae =
					new NoViableAltException("", 166, 0, input);
				throw nvae;
			}
			switch (alt166) {
				case 1 :
					// Parser.g:1294:7: t= IDENT
					{
					t=(Token)match(input,IDENT,FOLLOW_IDENT_in_cident8868); if (state.failed) return id;
					if ( state.backtracking==0 ) { id = ColumnMetadata.Raw.forUnquoted((t!=null?t.getText():null)); }
					}
					break;
				case 2 :
					// Parser.g:1295:7: t= QUOTED_NAME
					{
					t=(Token)match(input,QUOTED_NAME,FOLLOW_QUOTED_NAME_in_cident8893); if (state.failed) return id;
					if ( state.backtracking==0 ) { id = ColumnMetadata.Raw.forQuoted((t!=null?t.getText():null)); }
					}
					break;
				case 3 :
					// Parser.g:1296:7: k= unreserved_keyword
					{
					pushFollow(FOLLOW_unreserved_keyword_in_cident8912);
					k=unreserved_keyword();
					state._fsp--;
					if (state.failed) return id;
					if ( state.backtracking==0 ) { id = ColumnMetadata.Raw.forUnquoted(k); }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return id;
	}
	// $ANTLR end "cident"



	// $ANTLR start "ident"
	// Parser.g:1300:1: ident returns [ColumnIdentifier id] : (t= IDENT |t= QUOTED_NAME |k= unreserved_keyword );
	public final ColumnIdentifier ident() throws RecognitionException {
		ColumnIdentifier id = null;


		Token t=null;
		String k =null;

		try {
			// Parser.g:1301:5: (t= IDENT |t= QUOTED_NAME |k= unreserved_keyword )
			int alt167=3;
			switch ( input.LA(1) ) {
			case IDENT:
				{
				alt167=1;
				}
				break;
			case QUOTED_NAME:
				{
				alt167=2;
				}
				break;
			case K_AGGREGATE:
			case K_ALL:
			case K_AS:
			case K_ASCII:
			case K_BIGINT:
			case K_BLOB:
			case K_BOOLEAN:
			case K_CALLED:
			case K_CAST:
			case K_CLUSTERING:
			case K_COMPACT:
			case K_CONTAINS:
			case K_COUNT:
			case K_COUNTER:
			case K_CUSTOM:
			case K_DATE:
			case K_DECIMAL:
			case K_DISTINCT:
			case K_DOUBLE:
			case K_DURATION:
			case K_EXISTS:
			case K_FILTERING:
			case K_FINALFUNC:
			case K_FLOAT:
			case K_FROZEN:
			case K_FUNCTION:
			case K_FUNCTIONS:
			case K_GROUP:
			case K_INET:
			case K_INITCOND:
			case K_INPUT:
			case K_INT:
			case K_JSON:
			case K_KEY:
			case K_KEYS:
			case K_KEYSPACES:
			case K_LANGUAGE:
			case K_LIKE:
			case K_LIST:
			case K_LOGIN:
			case K_MAP:
			case K_NOLOGIN:
			case K_NOSUPERUSER:
			case K_OPTIONS:
			case K_PARTITION:
			case K_PASSWORD:
			case K_PER:
			case K_PERMISSION:
			case K_PERMISSIONS:
			case K_RETURNS:
			case K_ROLE:
			case K_ROLES:
			case K_SFUNC:
			case K_SMALLINT:
			case K_STATIC:
			case K_STORAGE:
			case K_STYPE:
			case K_SUPERUSER:
			case K_TEXT:
			case K_TIME:
			case K_TIMESTAMP:
			case K_TIMEUUID:
			case K_TINYINT:
			case K_TRIGGER:
			case K_TTL:
			case K_TUPLE:
			case K_TYPE:
			case K_USER:
			case K_USERS:
			case K_UUID:
			case K_VALUES:
			case K_VARCHAR:
			case K_VARINT:
			case K_WRITETIME:
				{
				alt167=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return id;}
				NoViableAltException nvae =
					new NoViableAltException("", 167, 0, input);
				throw nvae;
			}
			switch (alt167) {
				case 1 :
					// Parser.g:1301:7: t= IDENT
					{
					t=(Token)match(input,IDENT,FOLLOW_IDENT_in_ident8938); if (state.failed) return id;
					if ( state.backtracking==0 ) { id = ColumnIdentifier.getInterned((t!=null?t.getText():null), false); }
					}
					break;
				case 2 :
					// Parser.g:1302:7: t= QUOTED_NAME
					{
					t=(Token)match(input,QUOTED_NAME,FOLLOW_QUOTED_NAME_in_ident8963); if (state.failed) return id;
					if ( state.backtracking==0 ) { id = ColumnIdentifier.getInterned((t!=null?t.getText():null), true); }
					}
					break;
				case 3 :
					// Parser.g:1303:7: k= unreserved_keyword
					{
					pushFollow(FOLLOW_unreserved_keyword_in_ident8982);
					k=unreserved_keyword();
					state._fsp--;
					if (state.failed) return id;
					if ( state.backtracking==0 ) { id = ColumnIdentifier.getInterned(k, false); }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return id;
	}
	// $ANTLR end "ident"



	// $ANTLR start "fident"
	// Parser.g:1306:1: fident returns [FieldIdentifier id] : (t= IDENT |t= QUOTED_NAME |k= unreserved_keyword );
	public final FieldIdentifier fident() throws RecognitionException {
		FieldIdentifier id = null;


		Token t=null;
		String k =null;

		try {
			// Parser.g:1307:5: (t= IDENT |t= QUOTED_NAME |k= unreserved_keyword )
			int alt168=3;
			switch ( input.LA(1) ) {
			case IDENT:
				{
				alt168=1;
				}
				break;
			case QUOTED_NAME:
				{
				alt168=2;
				}
				break;
			case K_AGGREGATE:
			case K_ALL:
			case K_AS:
			case K_ASCII:
			case K_BIGINT:
			case K_BLOB:
			case K_BOOLEAN:
			case K_CALLED:
			case K_CAST:
			case K_CLUSTERING:
			case K_COMPACT:
			case K_CONTAINS:
			case K_COUNT:
			case K_COUNTER:
			case K_CUSTOM:
			case K_DATE:
			case K_DECIMAL:
			case K_DISTINCT:
			case K_DOUBLE:
			case K_DURATION:
			case K_EXISTS:
			case K_FILTERING:
			case K_FINALFUNC:
			case K_FLOAT:
			case K_FROZEN:
			case K_FUNCTION:
			case K_FUNCTIONS:
			case K_GROUP:
			case K_INET:
			case K_INITCOND:
			case K_INPUT:
			case K_INT:
			case K_JSON:
			case K_KEY:
			case K_KEYS:
			case K_KEYSPACES:
			case K_LANGUAGE:
			case K_LIKE:
			case K_LIST:
			case K_LOGIN:
			case K_MAP:
			case K_NOLOGIN:
			case K_NOSUPERUSER:
			case K_OPTIONS:
			case K_PARTITION:
			case K_PASSWORD:
			case K_PER:
			case K_PERMISSION:
			case K_PERMISSIONS:
			case K_RETURNS:
			case K_ROLE:
			case K_ROLES:
			case K_SFUNC:
			case K_SMALLINT:
			case K_STATIC:
			case K_STORAGE:
			case K_STYPE:
			case K_SUPERUSER:
			case K_TEXT:
			case K_TIME:
			case K_TIMESTAMP:
			case K_TIMEUUID:
			case K_TINYINT:
			case K_TRIGGER:
			case K_TTL:
			case K_TUPLE:
			case K_TYPE:
			case K_USER:
			case K_USERS:
			case K_UUID:
			case K_VALUES:
			case K_VARCHAR:
			case K_VARINT:
			case K_WRITETIME:
				{
				alt168=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return id;}
				NoViableAltException nvae =
					new NoViableAltException("", 168, 0, input);
				throw nvae;
			}
			switch (alt168) {
				case 1 :
					// Parser.g:1307:7: t= IDENT
					{
					t=(Token)match(input,IDENT,FOLLOW_IDENT_in_fident9007); if (state.failed) return id;
					if ( state.backtracking==0 ) { id = FieldIdentifier.forUnquoted((t!=null?t.getText():null)); }
					}
					break;
				case 2 :
					// Parser.g:1308:7: t= QUOTED_NAME
					{
					t=(Token)match(input,QUOTED_NAME,FOLLOW_QUOTED_NAME_in_fident9032); if (state.failed) return id;
					if ( state.backtracking==0 ) { id = FieldIdentifier.forQuoted((t!=null?t.getText():null)); }
					}
					break;
				case 3 :
					// Parser.g:1309:7: k= unreserved_keyword
					{
					pushFollow(FOLLOW_unreserved_keyword_in_fident9051);
					k=unreserved_keyword();
					state._fsp--;
					if (state.failed) return id;
					if ( state.backtracking==0 ) { id = FieldIdentifier.forUnquoted(k); }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return id;
	}
	// $ANTLR end "fident"



	// $ANTLR start "noncol_ident"
	// Parser.g:1313:1: noncol_ident returns [ColumnIdentifier id] : (t= IDENT |t= QUOTED_NAME |k= unreserved_keyword );
	public final ColumnIdentifier noncol_ident() throws RecognitionException {
		ColumnIdentifier id = null;


		Token t=null;
		String k =null;

		try {
			// Parser.g:1314:5: (t= IDENT |t= QUOTED_NAME |k= unreserved_keyword )
			int alt169=3;
			switch ( input.LA(1) ) {
			case IDENT:
				{
				alt169=1;
				}
				break;
			case QUOTED_NAME:
				{
				alt169=2;
				}
				break;
			case K_AGGREGATE:
			case K_ALL:
			case K_AS:
			case K_ASCII:
			case K_BIGINT:
			case K_BLOB:
			case K_BOOLEAN:
			case K_CALLED:
			case K_CAST:
			case K_CLUSTERING:
			case K_COMPACT:
			case K_CONTAINS:
			case K_COUNT:
			case K_COUNTER:
			case K_CUSTOM:
			case K_DATE:
			case K_DECIMAL:
			case K_DISTINCT:
			case K_DOUBLE:
			case K_DURATION:
			case K_EXISTS:
			case K_FILTERING:
			case K_FINALFUNC:
			case K_FLOAT:
			case K_FROZEN:
			case K_FUNCTION:
			case K_FUNCTIONS:
			case K_GROUP:
			case K_INET:
			case K_INITCOND:
			case K_INPUT:
			case K_INT:
			case K_JSON:
			case K_KEY:
			case K_KEYS:
			case K_KEYSPACES:
			case K_LANGUAGE:
			case K_LIKE:
			case K_LIST:
			case K_LOGIN:
			case K_MAP:
			case K_NOLOGIN:
			case K_NOSUPERUSER:
			case K_OPTIONS:
			case K_PARTITION:
			case K_PASSWORD:
			case K_PER:
			case K_PERMISSION:
			case K_PERMISSIONS:
			case K_RETURNS:
			case K_ROLE:
			case K_ROLES:
			case K_SFUNC:
			case K_SMALLINT:
			case K_STATIC:
			case K_STORAGE:
			case K_STYPE:
			case K_SUPERUSER:
			case K_TEXT:
			case K_TIME:
			case K_TIMESTAMP:
			case K_TIMEUUID:
			case K_TINYINT:
			case K_TRIGGER:
			case K_TTL:
			case K_TUPLE:
			case K_TYPE:
			case K_USER:
			case K_USERS:
			case K_UUID:
			case K_VALUES:
			case K_VARCHAR:
			case K_VARINT:
			case K_WRITETIME:
				{
				alt169=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return id;}
				NoViableAltException nvae =
					new NoViableAltException("", 169, 0, input);
				throw nvae;
			}
			switch (alt169) {
				case 1 :
					// Parser.g:1314:7: t= IDENT
					{
					t=(Token)match(input,IDENT,FOLLOW_IDENT_in_noncol_ident9077); if (state.failed) return id;
					if ( state.backtracking==0 ) { id = new ColumnIdentifier((t!=null?t.getText():null), false); }
					}
					break;
				case 2 :
					// Parser.g:1315:7: t= QUOTED_NAME
					{
					t=(Token)match(input,QUOTED_NAME,FOLLOW_QUOTED_NAME_in_noncol_ident9102); if (state.failed) return id;
					if ( state.backtracking==0 ) { id = new ColumnIdentifier((t!=null?t.getText():null), true); }
					}
					break;
				case 3 :
					// Parser.g:1316:7: k= unreserved_keyword
					{
					pushFollow(FOLLOW_unreserved_keyword_in_noncol_ident9121);
					k=unreserved_keyword();
					state._fsp--;
					if (state.failed) return id;
					if ( state.backtracking==0 ) { id = new ColumnIdentifier(k, false); }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return id;
	}
	// $ANTLR end "noncol_ident"



	// $ANTLR start "keyspaceName"
	// Parser.g:1320:1: keyspaceName returns [String id] : ksName[name] ;
	public final String keyspaceName() throws RecognitionException {
		String id = null;


		 CFName name = new CFName(); 
		try {
			// Parser.g:1322:5: ( ksName[name] )
			// Parser.g:1322:7: ksName[name]
			{
			pushFollow(FOLLOW_ksName_in_keyspaceName9154);
			ksName(name);
			state._fsp--;
			if (state.failed) return id;
			if ( state.backtracking==0 ) { id = name.getKeyspace(); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return id;
	}
	// $ANTLR end "keyspaceName"



	// $ANTLR start "indexName"
	// Parser.g:1325:1: indexName returns [IndexName name] : ( ksName[name] '.' )? idxName[name] ;
	public final IndexName indexName() throws RecognitionException {
		IndexName name = null;


		 name = new IndexName(); 
		try {
			// Parser.g:1327:5: ( ( ksName[name] '.' )? idxName[name] )
			// Parser.g:1327:7: ( ksName[name] '.' )? idxName[name]
			{
			// Parser.g:1327:7: ( ksName[name] '.' )?
			int alt170=2;
			alt170 = dfa170.predict(input);
			switch (alt170) {
				case 1 :
					// Parser.g:1327:8: ksName[name] '.'
					{
					pushFollow(FOLLOW_ksName_in_indexName9188);
					ksName(name);
					state._fsp--;
					if (state.failed) return name;
					match(input,194,FOLLOW_194_in_indexName9191); if (state.failed) return name;
					}
					break;

			}

			pushFollow(FOLLOW_idxName_in_indexName9195);
			idxName(name);
			state._fsp--;
			if (state.failed) return name;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return name;
	}
	// $ANTLR end "indexName"



	// $ANTLR start "columnFamilyName"
	// Parser.g:1330:1: columnFamilyName returns [CFName name] : ( ksName[name] '.' )? cfName[name] ;
	public final CFName columnFamilyName() throws RecognitionException {
		CFName name = null;


		 name = new CFName(); 
		try {
			// Parser.g:1332:5: ( ( ksName[name] '.' )? cfName[name] )
			// Parser.g:1332:7: ( ksName[name] '.' )? cfName[name]
			{
			// Parser.g:1332:7: ( ksName[name] '.' )?
			int alt171=2;
			alt171 = dfa171.predict(input);
			switch (alt171) {
				case 1 :
					// Parser.g:1332:8: ksName[name] '.'
					{
					pushFollow(FOLLOW_ksName_in_columnFamilyName9227);
					ksName(name);
					state._fsp--;
					if (state.failed) return name;
					match(input,194,FOLLOW_194_in_columnFamilyName9230); if (state.failed) return name;
					}
					break;

			}

			pushFollow(FOLLOW_cfName_in_columnFamilyName9234);
			cfName(name);
			state._fsp--;
			if (state.failed) return name;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return name;
	}
	// $ANTLR end "columnFamilyName"



	// $ANTLR start "userTypeName"
	// Parser.g:1335:1: userTypeName returns [UTName name] : (ks= noncol_ident '.' )? ut= non_type_ident ;
	public final UTName userTypeName() throws RecognitionException {
		UTName name = null;


		ColumnIdentifier ks =null;
		ColumnIdentifier ut =null;

		try {
			// Parser.g:1336:5: ( (ks= noncol_ident '.' )? ut= non_type_ident )
			// Parser.g:1336:7: (ks= noncol_ident '.' )? ut= non_type_ident
			{
			// Parser.g:1336:7: (ks= noncol_ident '.' )?
			int alt172=2;
			switch ( input.LA(1) ) {
				case IDENT:
					{
					int LA172_1 = input.LA(2);
					if ( (LA172_1==194) ) {
						alt172=1;
					}
					}
					break;
				case QUOTED_NAME:
					{
					int LA172_2 = input.LA(2);
					if ( (LA172_2==194) ) {
						alt172=1;
					}
					}
					break;
				case K_AGGREGATE:
				case K_ALL:
				case K_AS:
				case K_CALLED:
				case K_CLUSTERING:
				case K_COMPACT:
				case K_CONTAINS:
				case K_CUSTOM:
				case K_EXISTS:
				case K_FILTERING:
				case K_FINALFUNC:
				case K_FROZEN:
				case K_FUNCTION:
				case K_FUNCTIONS:
				case K_GROUP:
				case K_INITCOND:
				case K_INPUT:
				case K_KEYS:
				case K_KEYSPACES:
				case K_LANGUAGE:
				case K_LIKE:
				case K_LIST:
				case K_LOGIN:
				case K_MAP:
				case K_NOLOGIN:
				case K_NOSUPERUSER:
				case K_OPTIONS:
				case K_PARTITION:
				case K_PASSWORD:
				case K_PER:
				case K_PERMISSION:
				case K_PERMISSIONS:
				case K_RETURNS:
				case K_ROLE:
				case K_ROLES:
				case K_SFUNC:
				case K_STATIC:
				case K_STORAGE:
				case K_STYPE:
				case K_SUPERUSER:
				case K_TRIGGER:
				case K_TUPLE:
				case K_TYPE:
				case K_USER:
				case K_USERS:
				case K_VALUES:
					{
					int LA172_3 = input.LA(2);
					if ( (LA172_3==194) ) {
						alt172=1;
					}
					}
					break;
				case K_ASCII:
				case K_BIGINT:
				case K_BLOB:
				case K_BOOLEAN:
				case K_CAST:
				case K_COUNT:
				case K_COUNTER:
				case K_DATE:
				case K_DECIMAL:
				case K_DISTINCT:
				case K_DOUBLE:
				case K_DURATION:
				case K_FLOAT:
				case K_INET:
				case K_INT:
				case K_JSON:
				case K_SMALLINT:
				case K_TEXT:
				case K_TIME:
				case K_TIMESTAMP:
				case K_TIMEUUID:
				case K_TINYINT:
				case K_TTL:
				case K_UUID:
				case K_VARCHAR:
				case K_VARINT:
				case K_WRITETIME:
					{
					alt172=1;
					}
					break;
				case K_KEY:
					{
					int LA172_5 = input.LA(2);
					if ( (LA172_5==194) ) {
						alt172=1;
					}
					}
					break;
			}
			switch (alt172) {
				case 1 :
					// Parser.g:1336:8: ks= noncol_ident '.'
					{
					pushFollow(FOLLOW_noncol_ident_in_userTypeName9259);
					ks=noncol_ident();
					state._fsp--;
					if (state.failed) return name;
					match(input,194,FOLLOW_194_in_userTypeName9261); if (state.failed) return name;
					}
					break;

			}

			pushFollow(FOLLOW_non_type_ident_in_userTypeName9267);
			ut=non_type_ident();
			state._fsp--;
			if (state.failed) return name;
			if ( state.backtracking==0 ) { name = new UTName(ks, ut); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return name;
	}
	// $ANTLR end "userTypeName"



	// $ANTLR start "userOrRoleName"
	// Parser.g:1339:1: userOrRoleName returns [RoleName name] : roleName[role] ;
	public final RoleName userOrRoleName() throws RecognitionException {
		RoleName name = null;


		 RoleName role = new RoleName(); 
		try {
			// Parser.g:1341:5: ( roleName[role] )
			// Parser.g:1341:7: roleName[role]
			{
			pushFollow(FOLLOW_roleName_in_userOrRoleName9299);
			roleName(role);
			state._fsp--;
			if (state.failed) return name;
			if ( state.backtracking==0 ) {name = role;}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return name;
	}
	// $ANTLR end "userOrRoleName"



	// $ANTLR start "ksName"
	// Parser.g:1344:1: ksName[KeyspaceElementName name] : (t= IDENT |t= QUOTED_NAME |k= unreserved_keyword | QMARK );
	public final void ksName(KeyspaceElementName name) throws RecognitionException {
		Token t=null;
		String k =null;

		try {
			// Parser.g:1345:5: (t= IDENT |t= QUOTED_NAME |k= unreserved_keyword | QMARK )
			int alt173=4;
			switch ( input.LA(1) ) {
			case IDENT:
				{
				alt173=1;
				}
				break;
			case QUOTED_NAME:
				{
				alt173=2;
				}
				break;
			case K_AGGREGATE:
			case K_ALL:
			case K_AS:
			case K_ASCII:
			case K_BIGINT:
			case K_BLOB:
			case K_BOOLEAN:
			case K_CALLED:
			case K_CAST:
			case K_CLUSTERING:
			case K_COMPACT:
			case K_CONTAINS:
			case K_COUNT:
			case K_COUNTER:
			case K_CUSTOM:
			case K_DATE:
			case K_DECIMAL:
			case K_DISTINCT:
			case K_DOUBLE:
			case K_DURATION:
			case K_EXISTS:
			case K_FILTERING:
			case K_FINALFUNC:
			case K_FLOAT:
			case K_FROZEN:
			case K_FUNCTION:
			case K_FUNCTIONS:
			case K_GROUP:
			case K_INET:
			case K_INITCOND:
			case K_INPUT:
			case K_INT:
			case K_JSON:
			case K_KEY:
			case K_KEYS:
			case K_KEYSPACES:
			case K_LANGUAGE:
			case K_LIKE:
			case K_LIST:
			case K_LOGIN:
			case K_MAP:
			case K_NOLOGIN:
			case K_NOSUPERUSER:
			case K_OPTIONS:
			case K_PARTITION:
			case K_PASSWORD:
			case K_PER:
			case K_PERMISSION:
			case K_PERMISSIONS:
			case K_RETURNS:
			case K_ROLE:
			case K_ROLES:
			case K_SFUNC:
			case K_SMALLINT:
			case K_STATIC:
			case K_STORAGE:
			case K_STYPE:
			case K_SUPERUSER:
			case K_TEXT:
			case K_TIME:
			case K_TIMESTAMP:
			case K_TIMEUUID:
			case K_TINYINT:
			case K_TRIGGER:
			case K_TTL:
			case K_TUPLE:
			case K_TYPE:
			case K_USER:
			case K_USERS:
			case K_UUID:
			case K_VALUES:
			case K_VARCHAR:
			case K_VARINT:
			case K_WRITETIME:
				{
				alt173=3;
				}
				break;
			case QMARK:
				{
				alt173=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 173, 0, input);
				throw nvae;
			}
			switch (alt173) {
				case 1 :
					// Parser.g:1345:7: t= IDENT
					{
					t=(Token)match(input,IDENT,FOLLOW_IDENT_in_ksName9322); if (state.failed) return;
					if ( state.backtracking==0 ) { name.setKeyspace((t!=null?t.getText():null), false);}
					}
					break;
				case 2 :
					// Parser.g:1346:7: t= QUOTED_NAME
					{
					t=(Token)match(input,QUOTED_NAME,FOLLOW_QUOTED_NAME_in_ksName9347); if (state.failed) return;
					if ( state.backtracking==0 ) { name.setKeyspace((t!=null?t.getText():null), true);}
					}
					break;
				case 3 :
					// Parser.g:1347:7: k= unreserved_keyword
					{
					pushFollow(FOLLOW_unreserved_keyword_in_ksName9366);
					k=unreserved_keyword();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) { name.setKeyspace(k, false);}
					}
					break;
				case 4 :
					// Parser.g:1348:7: QMARK
					{
					match(input,QMARK,FOLLOW_QMARK_in_ksName9376); if (state.failed) return;
					if ( state.backtracking==0 ) {addRecognitionError("Bind variables cannot be used for keyspace names");}
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ksName"



	// $ANTLR start "cfName"
	// Parser.g:1351:1: cfName[CFName name] : (t= IDENT |t= QUOTED_NAME |k= unreserved_keyword | QMARK );
	public final void cfName(CFName name) throws RecognitionException {
		Token t=null;
		String k =null;

		try {
			// Parser.g:1352:5: (t= IDENT |t= QUOTED_NAME |k= unreserved_keyword | QMARK )
			int alt174=4;
			switch ( input.LA(1) ) {
			case IDENT:
				{
				alt174=1;
				}
				break;
			case QUOTED_NAME:
				{
				alt174=2;
				}
				break;
			case K_AGGREGATE:
			case K_ALL:
			case K_AS:
			case K_ASCII:
			case K_BIGINT:
			case K_BLOB:
			case K_BOOLEAN:
			case K_CALLED:
			case K_CAST:
			case K_CLUSTERING:
			case K_COMPACT:
			case K_CONTAINS:
			case K_COUNT:
			case K_COUNTER:
			case K_CUSTOM:
			case K_DATE:
			case K_DECIMAL:
			case K_DISTINCT:
			case K_DOUBLE:
			case K_DURATION:
			case K_EXISTS:
			case K_FILTERING:
			case K_FINALFUNC:
			case K_FLOAT:
			case K_FROZEN:
			case K_FUNCTION:
			case K_FUNCTIONS:
			case K_GROUP:
			case K_INET:
			case K_INITCOND:
			case K_INPUT:
			case K_INT:
			case K_JSON:
			case K_KEY:
			case K_KEYS:
			case K_KEYSPACES:
			case K_LANGUAGE:
			case K_LIKE:
			case K_LIST:
			case K_LOGIN:
			case K_MAP:
			case K_NOLOGIN:
			case K_NOSUPERUSER:
			case K_OPTIONS:
			case K_PARTITION:
			case K_PASSWORD:
			case K_PER:
			case K_PERMISSION:
			case K_PERMISSIONS:
			case K_RETURNS:
			case K_ROLE:
			case K_ROLES:
			case K_SFUNC:
			case K_SMALLINT:
			case K_STATIC:
			case K_STORAGE:
			case K_STYPE:
			case K_SUPERUSER:
			case K_TEXT:
			case K_TIME:
			case K_TIMESTAMP:
			case K_TIMEUUID:
			case K_TINYINT:
			case K_TRIGGER:
			case K_TTL:
			case K_TUPLE:
			case K_TYPE:
			case K_USER:
			case K_USERS:
			case K_UUID:
			case K_VALUES:
			case K_VARCHAR:
			case K_VARINT:
			case K_WRITETIME:
				{
				alt174=3;
				}
				break;
			case QMARK:
				{
				alt174=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 174, 0, input);
				throw nvae;
			}
			switch (alt174) {
				case 1 :
					// Parser.g:1352:7: t= IDENT
					{
					t=(Token)match(input,IDENT,FOLLOW_IDENT_in_cfName9398); if (state.failed) return;
					if ( state.backtracking==0 ) { name.setColumnFamily((t!=null?t.getText():null), false); }
					}
					break;
				case 2 :
					// Parser.g:1353:7: t= QUOTED_NAME
					{
					t=(Token)match(input,QUOTED_NAME,FOLLOW_QUOTED_NAME_in_cfName9423); if (state.failed) return;
					if ( state.backtracking==0 ) { name.setColumnFamily((t!=null?t.getText():null), true); }
					}
					break;
				case 3 :
					// Parser.g:1354:7: k= unreserved_keyword
					{
					pushFollow(FOLLOW_unreserved_keyword_in_cfName9442);
					k=unreserved_keyword();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) { name.setColumnFamily(k, false); }
					}
					break;
				case 4 :
					// Parser.g:1355:7: QMARK
					{
					match(input,QMARK,FOLLOW_QMARK_in_cfName9452); if (state.failed) return;
					if ( state.backtracking==0 ) {addRecognitionError("Bind variables cannot be used for table names");}
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "cfName"



	// $ANTLR start "idxName"
	// Parser.g:1358:1: idxName[IndexName name] : (t= IDENT |t= QUOTED_NAME |k= unreserved_keyword | QMARK );
	public final void idxName(IndexName name) throws RecognitionException {
		Token t=null;
		String k =null;

		try {
			// Parser.g:1359:5: (t= IDENT |t= QUOTED_NAME |k= unreserved_keyword | QMARK )
			int alt175=4;
			switch ( input.LA(1) ) {
			case IDENT:
				{
				alt175=1;
				}
				break;
			case QUOTED_NAME:
				{
				alt175=2;
				}
				break;
			case K_AGGREGATE:
			case K_ALL:
			case K_AS:
			case K_ASCII:
			case K_BIGINT:
			case K_BLOB:
			case K_BOOLEAN:
			case K_CALLED:
			case K_CAST:
			case K_CLUSTERING:
			case K_COMPACT:
			case K_CONTAINS:
			case K_COUNT:
			case K_COUNTER:
			case K_CUSTOM:
			case K_DATE:
			case K_DECIMAL:
			case K_DISTINCT:
			case K_DOUBLE:
			case K_DURATION:
			case K_EXISTS:
			case K_FILTERING:
			case K_FINALFUNC:
			case K_FLOAT:
			case K_FROZEN:
			case K_FUNCTION:
			case K_FUNCTIONS:
			case K_GROUP:
			case K_INET:
			case K_INITCOND:
			case K_INPUT:
			case K_INT:
			case K_JSON:
			case K_KEY:
			case K_KEYS:
			case K_KEYSPACES:
			case K_LANGUAGE:
			case K_LIKE:
			case K_LIST:
			case K_LOGIN:
			case K_MAP:
			case K_NOLOGIN:
			case K_NOSUPERUSER:
			case K_OPTIONS:
			case K_PARTITION:
			case K_PASSWORD:
			case K_PER:
			case K_PERMISSION:
			case K_PERMISSIONS:
			case K_RETURNS:
			case K_ROLE:
			case K_ROLES:
			case K_SFUNC:
			case K_SMALLINT:
			case K_STATIC:
			case K_STORAGE:
			case K_STYPE:
			case K_SUPERUSER:
			case K_TEXT:
			case K_TIME:
			case K_TIMESTAMP:
			case K_TIMEUUID:
			case K_TINYINT:
			case K_TRIGGER:
			case K_TTL:
			case K_TUPLE:
			case K_TYPE:
			case K_USER:
			case K_USERS:
			case K_UUID:
			case K_VALUES:
			case K_VARCHAR:
			case K_VARINT:
			case K_WRITETIME:
				{
				alt175=3;
				}
				break;
			case QMARK:
				{
				alt175=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 175, 0, input);
				throw nvae;
			}
			switch (alt175) {
				case 1 :
					// Parser.g:1359:7: t= IDENT
					{
					t=(Token)match(input,IDENT,FOLLOW_IDENT_in_idxName9474); if (state.failed) return;
					if ( state.backtracking==0 ) { name.setIndex((t!=null?t.getText():null), false); }
					}
					break;
				case 2 :
					// Parser.g:1360:7: t= QUOTED_NAME
					{
					t=(Token)match(input,QUOTED_NAME,FOLLOW_QUOTED_NAME_in_idxName9499); if (state.failed) return;
					if ( state.backtracking==0 ) { name.setIndex((t!=null?t.getText():null), true);}
					}
					break;
				case 3 :
					// Parser.g:1361:7: k= unreserved_keyword
					{
					pushFollow(FOLLOW_unreserved_keyword_in_idxName9518);
					k=unreserved_keyword();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) { name.setIndex(k, false); }
					}
					break;
				case 4 :
					// Parser.g:1362:7: QMARK
					{
					match(input,QMARK,FOLLOW_QMARK_in_idxName9528); if (state.failed) return;
					if ( state.backtracking==0 ) {addRecognitionError("Bind variables cannot be used for index names");}
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "idxName"



	// $ANTLR start "roleName"
	// Parser.g:1365:1: roleName[RoleName name] : (t= IDENT |s= STRING_LITERAL |t= QUOTED_NAME |k= unreserved_keyword | QMARK );
	public final void roleName(RoleName name) throws RecognitionException {
		Token t=null;
		Token s=null;
		String k =null;

		try {
			// Parser.g:1366:5: (t= IDENT |s= STRING_LITERAL |t= QUOTED_NAME |k= unreserved_keyword | QMARK )
			int alt176=5;
			switch ( input.LA(1) ) {
			case IDENT:
				{
				alt176=1;
				}
				break;
			case STRING_LITERAL:
				{
				alt176=2;
				}
				break;
			case QUOTED_NAME:
				{
				alt176=3;
				}
				break;
			case K_AGGREGATE:
			case K_ALL:
			case K_AS:
			case K_ASCII:
			case K_BIGINT:
			case K_BLOB:
			case K_BOOLEAN:
			case K_CALLED:
			case K_CAST:
			case K_CLUSTERING:
			case K_COMPACT:
			case K_CONTAINS:
			case K_COUNT:
			case K_COUNTER:
			case K_CUSTOM:
			case K_DATE:
			case K_DECIMAL:
			case K_DISTINCT:
			case K_DOUBLE:
			case K_DURATION:
			case K_EXISTS:
			case K_FILTERING:
			case K_FINALFUNC:
			case K_FLOAT:
			case K_FROZEN:
			case K_FUNCTION:
			case K_FUNCTIONS:
			case K_GROUP:
			case K_INET:
			case K_INITCOND:
			case K_INPUT:
			case K_INT:
			case K_JSON:
			case K_KEY:
			case K_KEYS:
			case K_KEYSPACES:
			case K_LANGUAGE:
			case K_LIKE:
			case K_LIST:
			case K_LOGIN:
			case K_MAP:
			case K_NOLOGIN:
			case K_NOSUPERUSER:
			case K_OPTIONS:
			case K_PARTITION:
			case K_PASSWORD:
			case K_PER:
			case K_PERMISSION:
			case K_PERMISSIONS:
			case K_RETURNS:
			case K_ROLE:
			case K_ROLES:
			case K_SFUNC:
			case K_SMALLINT:
			case K_STATIC:
			case K_STORAGE:
			case K_STYPE:
			case K_SUPERUSER:
			case K_TEXT:
			case K_TIME:
			case K_TIMESTAMP:
			case K_TIMEUUID:
			case K_TINYINT:
			case K_TRIGGER:
			case K_TTL:
			case K_TUPLE:
			case K_TYPE:
			case K_USER:
			case K_USERS:
			case K_UUID:
			case K_VALUES:
			case K_VARCHAR:
			case K_VARINT:
			case K_WRITETIME:
				{
				alt176=4;
				}
				break;
			case QMARK:
				{
				alt176=5;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 176, 0, input);
				throw nvae;
			}
			switch (alt176) {
				case 1 :
					// Parser.g:1366:7: t= IDENT
					{
					t=(Token)match(input,IDENT,FOLLOW_IDENT_in_roleName9550); if (state.failed) return;
					if ( state.backtracking==0 ) { name.setName((t!=null?t.getText():null), false); }
					}
					break;
				case 2 :
					// Parser.g:1367:7: s= STRING_LITERAL
					{
					s=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_roleName9575); if (state.failed) return;
					if ( state.backtracking==0 ) { name.setName((s!=null?s.getText():null), true); }
					}
					break;
				case 3 :
					// Parser.g:1368:7: t= QUOTED_NAME
					{
					t=(Token)match(input,QUOTED_NAME,FOLLOW_QUOTED_NAME_in_roleName9591); if (state.failed) return;
					if ( state.backtracking==0 ) { name.setName((t!=null?t.getText():null), true); }
					}
					break;
				case 4 :
					// Parser.g:1369:7: k= unreserved_keyword
					{
					pushFollow(FOLLOW_unreserved_keyword_in_roleName9610);
					k=unreserved_keyword();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) { name.setName(k, false); }
					}
					break;
				case 5 :
					// Parser.g:1370:7: QMARK
					{
					match(input,QMARK,FOLLOW_QMARK_in_roleName9620); if (state.failed) return;
					if ( state.backtracking==0 ) {addRecognitionError("Bind variables cannot be used for role names");}
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "roleName"



	// $ANTLR start "constant"
	// Parser.g:1373:1: constant returns [Constants.Literal constant] : (t= STRING_LITERAL |t= INTEGER |t= FLOAT |t= BOOLEAN |t= DURATION |t= UUID |t= HEXNUMBER | ( ( K_POSITIVE_NAN | K_NEGATIVE_NAN ) | K_POSITIVE_INFINITY | K_NEGATIVE_INFINITY ) );
	public final Constants.Literal constant() throws RecognitionException {
		Constants.Literal constant = null;


		Token t=null;

		try {
			// Parser.g:1374:5: (t= STRING_LITERAL |t= INTEGER |t= FLOAT |t= BOOLEAN |t= DURATION |t= UUID |t= HEXNUMBER | ( ( K_POSITIVE_NAN | K_NEGATIVE_NAN ) | K_POSITIVE_INFINITY | K_NEGATIVE_INFINITY ) )
			int alt178=8;
			switch ( input.LA(1) ) {
			case STRING_LITERAL:
				{
				alt178=1;
				}
				break;
			case INTEGER:
				{
				alt178=2;
				}
				break;
			case FLOAT:
				{
				alt178=3;
				}
				break;
			case BOOLEAN:
				{
				alt178=4;
				}
				break;
			case DURATION:
				{
				alt178=5;
				}
				break;
			case UUID:
				{
				alt178=6;
				}
				break;
			case HEXNUMBER:
				{
				alt178=7;
				}
				break;
			case K_NEGATIVE_INFINITY:
			case K_NEGATIVE_NAN:
			case K_POSITIVE_INFINITY:
			case K_POSITIVE_NAN:
				{
				alt178=8;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return constant;}
				NoViableAltException nvae =
					new NoViableAltException("", 178, 0, input);
				throw nvae;
			}
			switch (alt178) {
				case 1 :
					// Parser.g:1374:7: t= STRING_LITERAL
					{
					t=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_constant9645); if (state.failed) return constant;
					if ( state.backtracking==0 ) { constant = Constants.Literal.string((t!=null?t.getText():null)); }
					}
					break;
				case 2 :
					// Parser.g:1375:7: t= INTEGER
					{
					t=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_constant9657); if (state.failed) return constant;
					if ( state.backtracking==0 ) { constant = Constants.Literal.integer((t!=null?t.getText():null)); }
					}
					break;
				case 3 :
					// Parser.g:1376:7: t= FLOAT
					{
					t=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_constant9676); if (state.failed) return constant;
					if ( state.backtracking==0 ) { constant = Constants.Literal.floatingPoint((t!=null?t.getText():null)); }
					}
					break;
				case 4 :
					// Parser.g:1377:7: t= BOOLEAN
					{
					t=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_constant9697); if (state.failed) return constant;
					if ( state.backtracking==0 ) { constant = Constants.Literal.bool((t!=null?t.getText():null)); }
					}
					break;
				case 5 :
					// Parser.g:1378:7: t= DURATION
					{
					t=(Token)match(input,DURATION,FOLLOW_DURATION_in_constant9716); if (state.failed) return constant;
					if ( state.backtracking==0 ) { constant = Constants.Literal.duration((t!=null?t.getText():null));}
					}
					break;
				case 6 :
					// Parser.g:1379:7: t= UUID
					{
					t=(Token)match(input,UUID,FOLLOW_UUID_in_constant9734); if (state.failed) return constant;
					if ( state.backtracking==0 ) { constant = Constants.Literal.uuid((t!=null?t.getText():null)); }
					}
					break;
				case 7 :
					// Parser.g:1380:7: t= HEXNUMBER
					{
					t=(Token)match(input,HEXNUMBER,FOLLOW_HEXNUMBER_in_constant9756); if (state.failed) return constant;
					if ( state.backtracking==0 ) { constant = Constants.Literal.hex((t!=null?t.getText():null)); }
					}
					break;
				case 8 :
					// Parser.g:1381:7: ( ( K_POSITIVE_NAN | K_NEGATIVE_NAN ) | K_POSITIVE_INFINITY | K_NEGATIVE_INFINITY )
					{
					// Parser.g:1381:7: ( ( K_POSITIVE_NAN | K_NEGATIVE_NAN ) | K_POSITIVE_INFINITY | K_NEGATIVE_INFINITY )
					int alt177=3;
					switch ( input.LA(1) ) {
					case K_NEGATIVE_NAN:
					case K_POSITIVE_NAN:
						{
						alt177=1;
						}
						break;
					case K_POSITIVE_INFINITY:
						{
						alt177=2;
						}
						break;
					case K_NEGATIVE_INFINITY:
						{
						alt177=3;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return constant;}
						NoViableAltException nvae =
							new NoViableAltException("", 177, 0, input);
						throw nvae;
					}
					switch (alt177) {
						case 1 :
							// Parser.g:1381:8: ( K_POSITIVE_NAN | K_NEGATIVE_NAN )
							{
							if ( input.LA(1)==K_NEGATIVE_NAN||input.LA(1)==K_POSITIVE_NAN ) {
								input.consume();
								state.errorRecovery=false;
								state.failed=false;
							}
							else {
								if (state.backtracking>0) {state.failed=true; return constant;}
								MismatchedSetException mse = new MismatchedSetException(null,input);
								throw mse;
							}
							if ( state.backtracking==0 ) { constant = Constants.Literal.floatingPoint("NaN"); }
							}
							break;
						case 2 :
							// Parser.g:1382:11: K_POSITIVE_INFINITY
							{
							match(input,K_POSITIVE_INFINITY,FOLLOW_K_POSITIVE_INFINITY_in_constant9792); if (state.failed) return constant;
							if ( state.backtracking==0 ) { constant = Constants.Literal.floatingPoint("Infinity"); }
							}
							break;
						case 3 :
							// Parser.g:1383:11: K_NEGATIVE_INFINITY
							{
							match(input,K_NEGATIVE_INFINITY,FOLLOW_K_NEGATIVE_INFINITY_in_constant9807); if (state.failed) return constant;
							if ( state.backtracking==0 ) { constant = Constants.Literal.floatingPoint("-Infinity"); }
							}
							break;

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
			// do for sure before leaving
		}
		return constant;
	}
	// $ANTLR end "constant"



	// $ANTLR start "fullMapLiteral"
	// Parser.g:1386:1: fullMapLiteral returns [Maps.Literal map] : '{' (k1= term ':' v1= term ( ',' kn= term ':' vn= term )* )? '}' ;
	public final Maps.Literal fullMapLiteral() throws RecognitionException {
		Maps.Literal map = null;


		Term.Raw k1 =null;
		Term.Raw v1 =null;
		Term.Raw kn =null;
		Term.Raw vn =null;

		 List<Pair<Term.Raw, Term.Raw>> m = new ArrayList<Pair<Term.Raw, Term.Raw>>();
		try {
			// Parser.g:1389:5: ( '{' (k1= term ':' v1= term ( ',' kn= term ':' vn= term )* )? '}' )
			// Parser.g:1389:7: '{' (k1= term ':' v1= term ( ',' kn= term ':' vn= term )* )? '}'
			{
			match(input,207,FOLLOW_207_in_fullMapLiteral9848); if (state.failed) return map;
			// Parser.g:1389:11: (k1= term ':' v1= term ( ',' kn= term ':' vn= term )* )?
			int alt180=2;
			int LA180_0 = input.LA(1);
			if ( (LA180_0==BOOLEAN||LA180_0==DURATION||LA180_0==FLOAT||LA180_0==HEXNUMBER||(LA180_0 >= IDENT && LA180_0 <= INTEGER)||(LA180_0 >= K_AGGREGATE && LA180_0 <= K_ALL)||LA180_0==K_AS||LA180_0==K_ASCII||(LA180_0 >= K_BIGINT && LA180_0 <= K_BOOLEAN)||(LA180_0 >= K_CALLED && LA180_0 <= K_CLUSTERING)||(LA180_0 >= K_COMPACT && LA180_0 <= K_COUNTER)||(LA180_0 >= K_CUSTOM && LA180_0 <= K_DECIMAL)||(LA180_0 >= K_DISTINCT && LA180_0 <= K_DOUBLE)||LA180_0==K_DURATION||(LA180_0 >= K_EXISTS && LA180_0 <= K_FLOAT)||LA180_0==K_FROZEN||(LA180_0 >= K_FUNCTION && LA180_0 <= K_FUNCTIONS)||LA180_0==K_GROUP||(LA180_0 >= K_INET && LA180_0 <= K_INPUT)||LA180_0==K_INT||(LA180_0 >= K_JSON && LA180_0 <= K_KEYS)||(LA180_0 >= K_KEYSPACES && LA180_0 <= K_LIKE)||(LA180_0 >= K_LIST && LA180_0 <= K_MAP)||(LA180_0 >= K_NEGATIVE_INFINITY && LA180_0 <= K_NOLOGIN)||LA180_0==K_NOSUPERUSER||LA180_0==K_NULL||LA180_0==K_OPTIONS||(LA180_0 >= K_PARTITION && LA180_0 <= K_POSITIVE_NAN)||LA180_0==K_RETURNS||(LA180_0 >= K_ROLE && LA180_0 <= K_ROLES)||(LA180_0 >= K_SFUNC && LA180_0 <= K_TINYINT)||(LA180_0 >= K_TOKEN && LA180_0 <= K_TRIGGER)||(LA180_0 >= K_TTL && LA180_0 <= K_TYPE)||(LA180_0 >= K_USER && LA180_0 <= K_USERS)||(LA180_0 >= K_UUID && LA180_0 <= K_VARINT)||LA180_0==K_WRITETIME||(LA180_0 >= QMARK && LA180_0 <= QUOTED_NAME)||LA180_0==STRING_LITERAL||LA180_0==UUID||LA180_0==187||LA180_0==192||LA180_0==196||LA180_0==203||LA180_0==207) ) {
				alt180=1;
			}
			switch (alt180) {
				case 1 :
					// Parser.g:1389:13: k1= term ':' v1= term ( ',' kn= term ':' vn= term )*
					{
					pushFollow(FOLLOW_term_in_fullMapLiteral9854);
					k1=term();
					state._fsp--;
					if (state.failed) return map;
					match(input,196,FOLLOW_196_in_fullMapLiteral9856); if (state.failed) return map;
					pushFollow(FOLLOW_term_in_fullMapLiteral9860);
					v1=term();
					state._fsp--;
					if (state.failed) return map;
					if ( state.backtracking==0 ) { m.add(Pair.create(k1, v1)); }
					// Parser.g:1389:65: ( ',' kn= term ':' vn= term )*
					loop179:
					while (true) {
						int alt179=2;
						int LA179_0 = input.LA(1);
						if ( (LA179_0==191) ) {
							alt179=1;
						}

						switch (alt179) {
						case 1 :
							// Parser.g:1389:67: ',' kn= term ':' vn= term
							{
							match(input,191,FOLLOW_191_in_fullMapLiteral9866); if (state.failed) return map;
							pushFollow(FOLLOW_term_in_fullMapLiteral9870);
							kn=term();
							state._fsp--;
							if (state.failed) return map;
							match(input,196,FOLLOW_196_in_fullMapLiteral9872); if (state.failed) return map;
							pushFollow(FOLLOW_term_in_fullMapLiteral9876);
							vn=term();
							state._fsp--;
							if (state.failed) return map;
							if ( state.backtracking==0 ) { m.add(Pair.create(kn, vn)); }
							}
							break;

						default :
							break loop179;
						}
					}

					}
					break;

			}

			match(input,208,FOLLOW_208_in_fullMapLiteral9892); if (state.failed) return map;
			}

			if ( state.backtracking==0 ) { map = new Maps.Literal(m); }
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return map;
	}
	// $ANTLR end "fullMapLiteral"



	// $ANTLR start "setOrMapLiteral"
	// Parser.g:1393:1: setOrMapLiteral[Term.Raw t] returns [Term.Raw value] : (m= mapLiteral[t] |s= setLiteral[t] );
	public final Term.Raw setOrMapLiteral(Term.Raw t) throws RecognitionException {
		Term.Raw value = null;


		Term.Raw m =null;
		Term.Raw s =null;

		try {
			// Parser.g:1394:5: (m= mapLiteral[t] |s= setLiteral[t] )
			int alt181=2;
			int LA181_0 = input.LA(1);
			if ( (LA181_0==196) ) {
				alt181=1;
			}
			else if ( (LA181_0==191||LA181_0==208) ) {
				alt181=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return value;}
				NoViableAltException nvae =
					new NoViableAltException("", 181, 0, input);
				throw nvae;
			}

			switch (alt181) {
				case 1 :
					// Parser.g:1394:7: m= mapLiteral[t]
					{
					pushFollow(FOLLOW_mapLiteral_in_setOrMapLiteral9916);
					m=mapLiteral(t);
					state._fsp--;
					if (state.failed) return value;
					if ( state.backtracking==0 ) { value =m; }
					}
					break;
				case 2 :
					// Parser.g:1395:7: s= setLiteral[t]
					{
					pushFollow(FOLLOW_setLiteral_in_setOrMapLiteral9929);
					s=setLiteral(t);
					state._fsp--;
					if (state.failed) return value;
					if ( state.backtracking==0 ) { value =s; }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "setOrMapLiteral"



	// $ANTLR start "setLiteral"
	// Parser.g:1398:1: setLiteral[Term.Raw t] returns [Term.Raw value] : ( ',' tn= term )* ;
	public final Term.Raw setLiteral(Term.Raw t) throws RecognitionException {
		Term.Raw value = null;


		Term.Raw tn =null;

		 List<Term.Raw> s = new ArrayList<Term.Raw>(); s.add(t); 
		try {
			// Parser.g:1401:5: ( ( ',' tn= term )* )
			// Parser.g:1401:7: ( ',' tn= term )*
			{
			// Parser.g:1401:7: ( ',' tn= term )*
			loop182:
			while (true) {
				int alt182=2;
				int LA182_0 = input.LA(1);
				if ( (LA182_0==191) ) {
					alt182=1;
				}

				switch (alt182) {
				case 1 :
					// Parser.g:1401:9: ',' tn= term
					{
					match(input,191,FOLLOW_191_in_setLiteral9974); if (state.failed) return value;
					pushFollow(FOLLOW_term_in_setLiteral9978);
					tn=term();
					state._fsp--;
					if (state.failed) return value;
					if ( state.backtracking==0 ) { s.add(tn); }
					}
					break;

				default :
					break loop182;
				}
			}

			}

			if ( state.backtracking==0 ) { value = new Sets.Literal(s); }
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "setLiteral"



	// $ANTLR start "mapLiteral"
	// Parser.g:1404:1: mapLiteral[Term.Raw k] returns [Term.Raw value] : ':' v= term ( ',' kn= term ':' vn= term )* ;
	public final Term.Raw mapLiteral(Term.Raw k) throws RecognitionException {
		Term.Raw value = null;


		Term.Raw v =null;
		Term.Raw kn =null;
		Term.Raw vn =null;

		 List<Pair<Term.Raw, Term.Raw>> m = new ArrayList<Pair<Term.Raw, Term.Raw>>(); 
		try {
			// Parser.g:1407:5: ( ':' v= term ( ',' kn= term ':' vn= term )* )
			// Parser.g:1407:7: ':' v= term ( ',' kn= term ':' vn= term )*
			{
			match(input,196,FOLLOW_196_in_mapLiteral10023); if (state.failed) return value;
			pushFollow(FOLLOW_term_in_mapLiteral10027);
			v=term();
			state._fsp--;
			if (state.failed) return value;
			if ( state.backtracking==0 ) {  m.add(Pair.create(k, v)); }
			// Parser.g:1407:49: ( ',' kn= term ':' vn= term )*
			loop183:
			while (true) {
				int alt183=2;
				int LA183_0 = input.LA(1);
				if ( (LA183_0==191) ) {
					alt183=1;
				}

				switch (alt183) {
				case 1 :
					// Parser.g:1407:51: ',' kn= term ':' vn= term
					{
					match(input,191,FOLLOW_191_in_mapLiteral10033); if (state.failed) return value;
					pushFollow(FOLLOW_term_in_mapLiteral10037);
					kn=term();
					state._fsp--;
					if (state.failed) return value;
					match(input,196,FOLLOW_196_in_mapLiteral10039); if (state.failed) return value;
					pushFollow(FOLLOW_term_in_mapLiteral10043);
					vn=term();
					state._fsp--;
					if (state.failed) return value;
					if ( state.backtracking==0 ) { m.add(Pair.create(kn, vn)); }
					}
					break;

				default :
					break loop183;
				}
			}

			}

			if ( state.backtracking==0 ) { value = new Maps.Literal(m); }
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "mapLiteral"



	// $ANTLR start "collectionLiteral"
	// Parser.g:1410:1: collectionLiteral returns [Term.Raw value] : (l= listLiteral | '{' t= term v= setOrMapLiteral[t] '}' | '{' '}' );
	public final Term.Raw collectionLiteral() throws RecognitionException {
		Term.Raw value = null;


		Term.Raw l =null;
		Term.Raw t =null;
		Term.Raw v =null;

		try {
			// Parser.g:1411:5: (l= listLiteral | '{' t= term v= setOrMapLiteral[t] '}' | '{' '}' )
			int alt184=3;
			int LA184_0 = input.LA(1);
			if ( (LA184_0==203) ) {
				alt184=1;
			}
			else if ( (LA184_0==207) ) {
				int LA184_2 = input.LA(2);
				if ( (LA184_2==208) ) {
					alt184=3;
				}
				else if ( (LA184_2==BOOLEAN||LA184_2==DURATION||LA184_2==FLOAT||LA184_2==HEXNUMBER||(LA184_2 >= IDENT && LA184_2 <= INTEGER)||(LA184_2 >= K_AGGREGATE && LA184_2 <= K_ALL)||LA184_2==K_AS||LA184_2==K_ASCII||(LA184_2 >= K_BIGINT && LA184_2 <= K_BOOLEAN)||(LA184_2 >= K_CALLED && LA184_2 <= K_CLUSTERING)||(LA184_2 >= K_COMPACT && LA184_2 <= K_COUNTER)||(LA184_2 >= K_CUSTOM && LA184_2 <= K_DECIMAL)||(LA184_2 >= K_DISTINCT && LA184_2 <= K_DOUBLE)||LA184_2==K_DURATION||(LA184_2 >= K_EXISTS && LA184_2 <= K_FLOAT)||LA184_2==K_FROZEN||(LA184_2 >= K_FUNCTION && LA184_2 <= K_FUNCTIONS)||LA184_2==K_GROUP||(LA184_2 >= K_INET && LA184_2 <= K_INPUT)||LA184_2==K_INT||(LA184_2 >= K_JSON && LA184_2 <= K_KEYS)||(LA184_2 >= K_KEYSPACES && LA184_2 <= K_LIKE)||(LA184_2 >= K_LIST && LA184_2 <= K_MAP)||(LA184_2 >= K_NEGATIVE_INFINITY && LA184_2 <= K_NOLOGIN)||LA184_2==K_NOSUPERUSER||LA184_2==K_NULL||LA184_2==K_OPTIONS||(LA184_2 >= K_PARTITION && LA184_2 <= K_POSITIVE_NAN)||LA184_2==K_RETURNS||(LA184_2 >= K_ROLE && LA184_2 <= K_ROLES)||(LA184_2 >= K_SFUNC && LA184_2 <= K_TINYINT)||(LA184_2 >= K_TOKEN && LA184_2 <= K_TRIGGER)||(LA184_2 >= K_TTL && LA184_2 <= K_TYPE)||(LA184_2 >= K_USER && LA184_2 <= K_USERS)||(LA184_2 >= K_UUID && LA184_2 <= K_VARINT)||LA184_2==K_WRITETIME||(LA184_2 >= QMARK && LA184_2 <= QUOTED_NAME)||LA184_2==STRING_LITERAL||LA184_2==UUID||LA184_2==187||LA184_2==192||LA184_2==196||LA184_2==203||LA184_2==207) ) {
					alt184=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return value;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 184, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return value;}
				NoViableAltException nvae =
					new NoViableAltException("", 184, 0, input);
				throw nvae;
			}

			switch (alt184) {
				case 1 :
					// Parser.g:1411:7: l= listLiteral
					{
					pushFollow(FOLLOW_listLiteral_in_collectionLiteral10071);
					l=listLiteral();
					state._fsp--;
					if (state.failed) return value;
					if ( state.backtracking==0 ) { value = l; }
					}
					break;
				case 2 :
					// Parser.g:1412:7: '{' t= term v= setOrMapLiteral[t] '}'
					{
					match(input,207,FOLLOW_207_in_collectionLiteral10081); if (state.failed) return value;
					pushFollow(FOLLOW_term_in_collectionLiteral10085);
					t=term();
					state._fsp--;
					if (state.failed) return value;
					pushFollow(FOLLOW_setOrMapLiteral_in_collectionLiteral10089);
					v=setOrMapLiteral(t);
					state._fsp--;
					if (state.failed) return value;
					if ( state.backtracking==0 ) { value = v; }
					match(input,208,FOLLOW_208_in_collectionLiteral10094); if (state.failed) return value;
					}
					break;
				case 3 :
					// Parser.g:1415:7: '{' '}'
					{
					match(input,207,FOLLOW_207_in_collectionLiteral10112); if (state.failed) return value;
					match(input,208,FOLLOW_208_in_collectionLiteral10114); if (state.failed) return value;
					if ( state.backtracking==0 ) { value = new Sets.Literal(Collections.<Term.Raw>emptyList()); }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "collectionLiteral"



	// $ANTLR start "listLiteral"
	// Parser.g:1418:1: listLiteral returns [Term.Raw value] : '[' (t1= term ( ',' tn= term )* )? ']' ;
	public final Term.Raw listLiteral() throws RecognitionException {
		Term.Raw value = null;


		Term.Raw t1 =null;
		Term.Raw tn =null;

		List<Term.Raw> l = new ArrayList<Term.Raw>();
		try {
			// Parser.g:1421:5: ( '[' (t1= term ( ',' tn= term )* )? ']' )
			// Parser.g:1421:7: '[' (t1= term ( ',' tn= term )* )? ']'
			{
			match(input,203,FOLLOW_203_in_listLiteral10155); if (state.failed) return value;
			// Parser.g:1421:11: (t1= term ( ',' tn= term )* )?
			int alt186=2;
			int LA186_0 = input.LA(1);
			if ( (LA186_0==BOOLEAN||LA186_0==DURATION||LA186_0==FLOAT||LA186_0==HEXNUMBER||(LA186_0 >= IDENT && LA186_0 <= INTEGER)||(LA186_0 >= K_AGGREGATE && LA186_0 <= K_ALL)||LA186_0==K_AS||LA186_0==K_ASCII||(LA186_0 >= K_BIGINT && LA186_0 <= K_BOOLEAN)||(LA186_0 >= K_CALLED && LA186_0 <= K_CLUSTERING)||(LA186_0 >= K_COMPACT && LA186_0 <= K_COUNTER)||(LA186_0 >= K_CUSTOM && LA186_0 <= K_DECIMAL)||(LA186_0 >= K_DISTINCT && LA186_0 <= K_DOUBLE)||LA186_0==K_DURATION||(LA186_0 >= K_EXISTS && LA186_0 <= K_FLOAT)||LA186_0==K_FROZEN||(LA186_0 >= K_FUNCTION && LA186_0 <= K_FUNCTIONS)||LA186_0==K_GROUP||(LA186_0 >= K_INET && LA186_0 <= K_INPUT)||LA186_0==K_INT||(LA186_0 >= K_JSON && LA186_0 <= K_KEYS)||(LA186_0 >= K_KEYSPACES && LA186_0 <= K_LIKE)||(LA186_0 >= K_LIST && LA186_0 <= K_MAP)||(LA186_0 >= K_NEGATIVE_INFINITY && LA186_0 <= K_NOLOGIN)||LA186_0==K_NOSUPERUSER||LA186_0==K_NULL||LA186_0==K_OPTIONS||(LA186_0 >= K_PARTITION && LA186_0 <= K_POSITIVE_NAN)||LA186_0==K_RETURNS||(LA186_0 >= K_ROLE && LA186_0 <= K_ROLES)||(LA186_0 >= K_SFUNC && LA186_0 <= K_TINYINT)||(LA186_0 >= K_TOKEN && LA186_0 <= K_TRIGGER)||(LA186_0 >= K_TTL && LA186_0 <= K_TYPE)||(LA186_0 >= K_USER && LA186_0 <= K_USERS)||(LA186_0 >= K_UUID && LA186_0 <= K_VARINT)||LA186_0==K_WRITETIME||(LA186_0 >= QMARK && LA186_0 <= QUOTED_NAME)||LA186_0==STRING_LITERAL||LA186_0==UUID||LA186_0==187||LA186_0==192||LA186_0==196||LA186_0==203||LA186_0==207) ) {
				alt186=1;
			}
			switch (alt186) {
				case 1 :
					// Parser.g:1421:13: t1= term ( ',' tn= term )*
					{
					pushFollow(FOLLOW_term_in_listLiteral10161);
					t1=term();
					state._fsp--;
					if (state.failed) return value;
					if ( state.backtracking==0 ) { l.add(t1); }
					// Parser.g:1421:36: ( ',' tn= term )*
					loop185:
					while (true) {
						int alt185=2;
						int LA185_0 = input.LA(1);
						if ( (LA185_0==191) ) {
							alt185=1;
						}

						switch (alt185) {
						case 1 :
							// Parser.g:1421:38: ',' tn= term
							{
							match(input,191,FOLLOW_191_in_listLiteral10167); if (state.failed) return value;
							pushFollow(FOLLOW_term_in_listLiteral10171);
							tn=term();
							state._fsp--;
							if (state.failed) return value;
							if ( state.backtracking==0 ) { l.add(tn); }
							}
							break;

						default :
							break loop185;
						}
					}

					}
					break;

			}

			match(input,205,FOLLOW_205_in_listLiteral10181); if (state.failed) return value;
			if ( state.backtracking==0 ) { value = new Lists.Literal(l); }
			}

			if ( state.backtracking==0 ) {value = new Lists.Literal(l);}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "listLiteral"



	// $ANTLR start "usertypeLiteral"
	// Parser.g:1424:1: usertypeLiteral returns [UserTypes.Literal ut] : '{' k1= fident ':' v1= term ( ',' kn= fident ':' vn= term )* '}' ;
	public final UserTypes.Literal usertypeLiteral() throws RecognitionException {
		UserTypes.Literal ut = null;


		FieldIdentifier k1 =null;
		Term.Raw v1 =null;
		FieldIdentifier kn =null;
		Term.Raw vn =null;

		 Map<FieldIdentifier, Term.Raw> m = new HashMap<>(); 
		try {
			// Parser.g:1428:5: ( '{' k1= fident ':' v1= term ( ',' kn= fident ':' vn= term )* '}' )
			// Parser.g:1428:7: '{' k1= fident ':' v1= term ( ',' kn= fident ':' vn= term )* '}'
			{
			match(input,207,FOLLOW_207_in_usertypeLiteral10225); if (state.failed) return ut;
			pushFollow(FOLLOW_fident_in_usertypeLiteral10229);
			k1=fident();
			state._fsp--;
			if (state.failed) return ut;
			match(input,196,FOLLOW_196_in_usertypeLiteral10231); if (state.failed) return ut;
			pushFollow(FOLLOW_term_in_usertypeLiteral10235);
			v1=term();
			state._fsp--;
			if (state.failed) return ut;
			if ( state.backtracking==0 ) { m.put(k1, v1); }
			// Parser.g:1428:52: ( ',' kn= fident ':' vn= term )*
			loop187:
			while (true) {
				int alt187=2;
				int LA187_0 = input.LA(1);
				if ( (LA187_0==191) ) {
					alt187=1;
				}

				switch (alt187) {
				case 1 :
					// Parser.g:1428:54: ',' kn= fident ':' vn= term
					{
					match(input,191,FOLLOW_191_in_usertypeLiteral10241); if (state.failed) return ut;
					pushFollow(FOLLOW_fident_in_usertypeLiteral10245);
					kn=fident();
					state._fsp--;
					if (state.failed) return ut;
					match(input,196,FOLLOW_196_in_usertypeLiteral10247); if (state.failed) return ut;
					pushFollow(FOLLOW_term_in_usertypeLiteral10251);
					vn=term();
					state._fsp--;
					if (state.failed) return ut;
					if ( state.backtracking==0 ) { m.put(kn, vn); }
					}
					break;

				default :
					break loop187;
				}
			}

			match(input,208,FOLLOW_208_in_usertypeLiteral10258); if (state.failed) return ut;
			}

			if ( state.backtracking==0 ) { ut = new UserTypes.Literal(m); }
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return ut;
	}
	// $ANTLR end "usertypeLiteral"



	// $ANTLR start "tupleLiteral"
	// Parser.g:1431:1: tupleLiteral returns [Tuples.Literal tt] : '(' t1= term ( ',' tn= term )* ')' ;
	public final Tuples.Literal tupleLiteral() throws RecognitionException {
		Tuples.Literal tt = null;


		Term.Raw t1 =null;
		Term.Raw tn =null;

		 List<Term.Raw> l = new ArrayList<Term.Raw>(); 
		try {
			// Parser.g:1434:5: ( '(' t1= term ( ',' tn= term )* ')' )
			// Parser.g:1434:7: '(' t1= term ( ',' tn= term )* ')'
			{
			match(input,187,FOLLOW_187_in_tupleLiteral10295); if (state.failed) return tt;
			pushFollow(FOLLOW_term_in_tupleLiteral10299);
			t1=term();
			state._fsp--;
			if (state.failed) return tt;
			if ( state.backtracking==0 ) { l.add(t1); }
			// Parser.g:1434:34: ( ',' tn= term )*
			loop188:
			while (true) {
				int alt188=2;
				int LA188_0 = input.LA(1);
				if ( (LA188_0==191) ) {
					alt188=1;
				}

				switch (alt188) {
				case 1 :
					// Parser.g:1434:36: ',' tn= term
					{
					match(input,191,FOLLOW_191_in_tupleLiteral10305); if (state.failed) return tt;
					pushFollow(FOLLOW_term_in_tupleLiteral10309);
					tn=term();
					state._fsp--;
					if (state.failed) return tt;
					if ( state.backtracking==0 ) { l.add(tn); }
					}
					break;

				default :
					break loop188;
				}
			}

			match(input,188,FOLLOW_188_in_tupleLiteral10316); if (state.failed) return tt;
			}

			if ( state.backtracking==0 ) { tt = new Tuples.Literal(l); }
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return tt;
	}
	// $ANTLR end "tupleLiteral"



	// $ANTLR start "value"
	// Parser.g:1437:1: value returns [Term.Raw value] : (c= constant |l= collectionLiteral |u= usertypeLiteral |t= tupleLiteral | K_NULL | ':' id= noncol_ident | QMARK );
	public final Term.Raw value() throws RecognitionException {
		Term.Raw value = null;


		Constants.Literal c =null;
		Term.Raw l =null;
		UserTypes.Literal u =null;
		Tuples.Literal t =null;
		ColumnIdentifier id =null;

		try {
			// Parser.g:1438:5: (c= constant |l= collectionLiteral |u= usertypeLiteral |t= tupleLiteral | K_NULL | ':' id= noncol_ident | QMARK )
			int alt189=7;
			alt189 = dfa189.predict(input);
			switch (alt189) {
				case 1 :
					// Parser.g:1438:7: c= constant
					{
					pushFollow(FOLLOW_constant_in_value10339);
					c=constant();
					state._fsp--;
					if (state.failed) return value;
					if ( state.backtracking==0 ) { value = c; }
					}
					break;
				case 2 :
					// Parser.g:1439:7: l= collectionLiteral
					{
					pushFollow(FOLLOW_collectionLiteral_in_value10361);
					l=collectionLiteral();
					state._fsp--;
					if (state.failed) return value;
					if ( state.backtracking==0 ) { value = l; }
					}
					break;
				case 3 :
					// Parser.g:1440:7: u= usertypeLiteral
					{
					pushFollow(FOLLOW_usertypeLiteral_in_value10374);
					u=usertypeLiteral();
					state._fsp--;
					if (state.failed) return value;
					if ( state.backtracking==0 ) { value = u; }
					}
					break;
				case 4 :
					// Parser.g:1441:7: t= tupleLiteral
					{
					pushFollow(FOLLOW_tupleLiteral_in_value10389);
					t=tupleLiteral();
					state._fsp--;
					if (state.failed) return value;
					if ( state.backtracking==0 ) { value = t; }
					}
					break;
				case 5 :
					// Parser.g:1442:7: K_NULL
					{
					match(input,K_NULL,FOLLOW_K_NULL_in_value10405); if (state.failed) return value;
					if ( state.backtracking==0 ) { value = Constants.NULL_LITERAL; }
					}
					break;
				case 6 :
					// Parser.g:1443:7: ':' id= noncol_ident
					{
					match(input,196,FOLLOW_196_in_value10429); if (state.failed) return value;
					pushFollow(FOLLOW_noncol_ident_in_value10433);
					id=noncol_ident();
					state._fsp--;
					if (state.failed) return value;
					if ( state.backtracking==0 ) { value = newBindVariables(id); }
					}
					break;
				case 7 :
					// Parser.g:1444:7: QMARK
					{
					match(input,QMARK,FOLLOW_QMARK_in_value10444); if (state.failed) return value;
					if ( state.backtracking==0 ) { value = newBindVariables(null); }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "value"



	// $ANTLR start "intValue"
	// Parser.g:1447:1: intValue returns [Term.Raw value] : (t= INTEGER | ':' id= noncol_ident | QMARK );
	public final Term.Raw intValue() throws RecognitionException {
		Term.Raw value = null;


		Token t=null;
		ColumnIdentifier id =null;

		try {
			// Parser.g:1448:5: (t= INTEGER | ':' id= noncol_ident | QMARK )
			int alt190=3;
			switch ( input.LA(1) ) {
			case INTEGER:
				{
				alt190=1;
				}
				break;
			case 196:
				{
				alt190=2;
				}
				break;
			case QMARK:
				{
				alt190=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return value;}
				NoViableAltException nvae =
					new NoViableAltException("", 190, 0, input);
				throw nvae;
			}
			switch (alt190) {
				case 1 :
					// Parser.g:1448:7: t= INTEGER
					{
					t=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_intValue10484); if (state.failed) return value;
					if ( state.backtracking==0 ) { value = Constants.Literal.integer((t!=null?t.getText():null)); }
					}
					break;
				case 2 :
					// Parser.g:1449:7: ':' id= noncol_ident
					{
					match(input,196,FOLLOW_196_in_intValue10498); if (state.failed) return value;
					pushFollow(FOLLOW_noncol_ident_in_intValue10502);
					id=noncol_ident();
					state._fsp--;
					if (state.failed) return value;
					if ( state.backtracking==0 ) { value = newBindVariables(id); }
					}
					break;
				case 3 :
					// Parser.g:1450:7: QMARK
					{
					match(input,QMARK,FOLLOW_QMARK_in_intValue10513); if (state.failed) return value;
					if ( state.backtracking==0 ) { value = newBindVariables(null); }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "intValue"



	// $ANTLR start "functionName"
	// Parser.g:1453:1: functionName returns [FunctionName s] : (ks= keyspaceName '.' )? f= allowedFunctionName ;
	public final FunctionName functionName() throws RecognitionException {
		FunctionName s = null;


		String ks =null;
		String f =null;

		try {
			// Parser.g:1454:5: ( (ks= keyspaceName '.' )? f= allowedFunctionName )
			// Parser.g:1454:7: (ks= keyspaceName '.' )? f= allowedFunctionName
			{
			// Parser.g:1454:7: (ks= keyspaceName '.' )?
			int alt191=2;
			alt191 = dfa191.predict(input);
			switch (alt191) {
				case 1 :
					// Parser.g:1454:8: ks= keyspaceName '.'
					{
					pushFollow(FOLLOW_keyspaceName_in_functionName10547);
					ks=keyspaceName();
					state._fsp--;
					if (state.failed) return s;
					match(input,194,FOLLOW_194_in_functionName10549); if (state.failed) return s;
					}
					break;

			}

			pushFollow(FOLLOW_allowedFunctionName_in_functionName10555);
			f=allowedFunctionName();
			state._fsp--;
			if (state.failed) return s;
			if ( state.backtracking==0 ) { s = new FunctionName(ks, f); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return s;
	}
	// $ANTLR end "functionName"



	// $ANTLR start "allowedFunctionName"
	// Parser.g:1457:1: allowedFunctionName returns [String s] : (f= IDENT |f= QUOTED_NAME |u= unreserved_function_keyword | K_TOKEN | K_COUNT );
	public final String allowedFunctionName() throws RecognitionException {
		String s = null;


		Token f=null;
		String u =null;

		try {
			// Parser.g:1458:5: (f= IDENT |f= QUOTED_NAME |u= unreserved_function_keyword | K_TOKEN | K_COUNT )
			int alt192=5;
			switch ( input.LA(1) ) {
			case IDENT:
				{
				alt192=1;
				}
				break;
			case QUOTED_NAME:
				{
				alt192=2;
				}
				break;
			case K_AGGREGATE:
			case K_ALL:
			case K_AS:
			case K_ASCII:
			case K_BIGINT:
			case K_BLOB:
			case K_BOOLEAN:
			case K_CALLED:
			case K_CLUSTERING:
			case K_COMPACT:
			case K_CONTAINS:
			case K_COUNTER:
			case K_CUSTOM:
			case K_DATE:
			case K_DECIMAL:
			case K_DOUBLE:
			case K_DURATION:
			case K_EXISTS:
			case K_FILTERING:
			case K_FINALFUNC:
			case K_FLOAT:
			case K_FROZEN:
			case K_FUNCTION:
			case K_FUNCTIONS:
			case K_GROUP:
			case K_INET:
			case K_INITCOND:
			case K_INPUT:
			case K_INT:
			case K_KEYS:
			case K_KEYSPACES:
			case K_LANGUAGE:
			case K_LIKE:
			case K_LIST:
			case K_LOGIN:
			case K_MAP:
			case K_NOLOGIN:
			case K_NOSUPERUSER:
			case K_OPTIONS:
			case K_PARTITION:
			case K_PASSWORD:
			case K_PER:
			case K_PERMISSION:
			case K_PERMISSIONS:
			case K_RETURNS:
			case K_ROLE:
			case K_ROLES:
			case K_SFUNC:
			case K_SMALLINT:
			case K_STATIC:
			case K_STORAGE:
			case K_STYPE:
			case K_SUPERUSER:
			case K_TEXT:
			case K_TIME:
			case K_TIMESTAMP:
			case K_TIMEUUID:
			case K_TINYINT:
			case K_TRIGGER:
			case K_TUPLE:
			case K_TYPE:
			case K_USER:
			case K_USERS:
			case K_UUID:
			case K_VALUES:
			case K_VARCHAR:
			case K_VARINT:
				{
				alt192=3;
				}
				break;
			case K_TOKEN:
				{
				alt192=4;
				}
				break;
			case K_COUNT:
				{
				alt192=5;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return s;}
				NoViableAltException nvae =
					new NoViableAltException("", 192, 0, input);
				throw nvae;
			}
			switch (alt192) {
				case 1 :
					// Parser.g:1458:7: f= IDENT
					{
					f=(Token)match(input,IDENT,FOLLOW_IDENT_in_allowedFunctionName10582); if (state.failed) return s;
					if ( state.backtracking==0 ) { s = (f!=null?f.getText():null).toLowerCase(); }
					}
					break;
				case 2 :
					// Parser.g:1459:7: f= QUOTED_NAME
					{
					f=(Token)match(input,QUOTED_NAME,FOLLOW_QUOTED_NAME_in_allowedFunctionName10616); if (state.failed) return s;
					if ( state.backtracking==0 ) { s = (f!=null?f.getText():null); }
					}
					break;
				case 3 :
					// Parser.g:1460:7: u= unreserved_function_keyword
					{
					pushFollow(FOLLOW_unreserved_function_keyword_in_allowedFunctionName10644);
					u=unreserved_function_keyword();
					state._fsp--;
					if (state.failed) return s;
					if ( state.backtracking==0 ) { s = u; }
					}
					break;
				case 4 :
					// Parser.g:1461:7: K_TOKEN
					{
					match(input,K_TOKEN,FOLLOW_K_TOKEN_in_allowedFunctionName10654); if (state.failed) return s;
					if ( state.backtracking==0 ) { s = "token"; }
					}
					break;
				case 5 :
					// Parser.g:1462:7: K_COUNT
					{
					match(input,K_COUNT,FOLLOW_K_COUNT_in_allowedFunctionName10686); if (state.failed) return s;
					if ( state.backtracking==0 ) { s = "count"; }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return s;
	}
	// $ANTLR end "allowedFunctionName"



	// $ANTLR start "function"
	// Parser.g:1465:1: function returns [Term.Raw t] : (f= functionName '(' ')' |f= functionName '(' args= functionArgs ')' );
	public final Term.Raw function() throws RecognitionException {
		Term.Raw t = null;


		FunctionName f =null;
		List<Term.Raw> args =null;

		try {
			// Parser.g:1466:5: (f= functionName '(' ')' |f= functionName '(' args= functionArgs ')' )
			int alt193=2;
			alt193 = dfa193.predict(input);
			switch (alt193) {
				case 1 :
					// Parser.g:1466:7: f= functionName '(' ')'
					{
					pushFollow(FOLLOW_functionName_in_function10733);
					f=functionName();
					state._fsp--;
					if (state.failed) return t;
					match(input,187,FOLLOW_187_in_function10735); if (state.failed) return t;
					match(input,188,FOLLOW_188_in_function10737); if (state.failed) return t;
					if ( state.backtracking==0 ) { t = new FunctionCall.Raw(f, Collections.<Term.Raw>emptyList()); }
					}
					break;
				case 2 :
					// Parser.g:1467:7: f= functionName '(' args= functionArgs ')'
					{
					pushFollow(FOLLOW_functionName_in_function10767);
					f=functionName();
					state._fsp--;
					if (state.failed) return t;
					match(input,187,FOLLOW_187_in_function10769); if (state.failed) return t;
					pushFollow(FOLLOW_functionArgs_in_function10773);
					args=functionArgs();
					state._fsp--;
					if (state.failed) return t;
					match(input,188,FOLLOW_188_in_function10775); if (state.failed) return t;
					if ( state.backtracking==0 ) { t = new FunctionCall.Raw(f, args); }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return t;
	}
	// $ANTLR end "function"



	// $ANTLR start "functionArgs"
	// Parser.g:1470:1: functionArgs returns [List<Term.Raw> args] : t1= term ( ',' tn= term )* ;
	public final List<Term.Raw> functionArgs() throws RecognitionException {
		List<Term.Raw> args = null;


		Term.Raw t1 =null;
		Term.Raw tn =null;

		 args = new ArrayList<Term.Raw>(); 
		try {
			// Parser.g:1472:5: (t1= term ( ',' tn= term )* )
			// Parser.g:1472:7: t1= term ( ',' tn= term )*
			{
			pushFollow(FOLLOW_term_in_functionArgs10808);
			t1=term();
			state._fsp--;
			if (state.failed) return args;
			if ( state.backtracking==0 ) {args.add(t1); }
			// Parser.g:1472:32: ( ',' tn= term )*
			loop194:
			while (true) {
				int alt194=2;
				int LA194_0 = input.LA(1);
				if ( (LA194_0==191) ) {
					alt194=1;
				}

				switch (alt194) {
				case 1 :
					// Parser.g:1472:34: ',' tn= term
					{
					match(input,191,FOLLOW_191_in_functionArgs10814); if (state.failed) return args;
					pushFollow(FOLLOW_term_in_functionArgs10818);
					tn=term();
					state._fsp--;
					if (state.failed) return args;
					if ( state.backtracking==0 ) { args.add(tn); }
					}
					break;

				default :
					break loop194;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return args;
	}
	// $ANTLR end "functionArgs"



	// $ANTLR start "term"
	// Parser.g:1475:1: term returns [Term.Raw term] : t= termAddition ;
	public final Term.Raw term() throws RecognitionException {
		Term.Raw term = null;


		Term.Raw t =null;

		try {
			// Parser.g:1476:5: (t= termAddition )
			// Parser.g:1476:7: t= termAddition
			{
			pushFollow(FOLLOW_termAddition_in_term10846);
			t=termAddition();
			state._fsp--;
			if (state.failed) return term;
			if ( state.backtracking==0 ) { term = t; }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return term;
	}
	// $ANTLR end "term"



	// $ANTLR start "termAddition"
	// Parser.g:1479:1: termAddition returns [Term.Raw term] : l= termMultiplication ( '+' r= termMultiplication | '-' r= termMultiplication )* ;
	public final Term.Raw termAddition() throws RecognitionException {
		Term.Raw term = null;


		Term.Raw l =null;
		Term.Raw r =null;

		try {
			// Parser.g:1480:5: (l= termMultiplication ( '+' r= termMultiplication | '-' r= termMultiplication )* )
			// Parser.g:1480:9: l= termMultiplication ( '+' r= termMultiplication | '-' r= termMultiplication )*
			{
			pushFollow(FOLLOW_termMultiplication_in_termAddition10898);
			l=termMultiplication();
			state._fsp--;
			if (state.failed) return term;
			if ( state.backtracking==0 ) {term = l;}
			// Parser.g:1481:9: ( '+' r= termMultiplication | '-' r= termMultiplication )*
			loop195:
			while (true) {
				int alt195=3;
				alt195 = dfa195.predict(input);
				switch (alt195) {
				case 1 :
					// Parser.g:1481:11: '+' r= termMultiplication
					{
					match(input,189,FOLLOW_189_in_termAddition10914); if (state.failed) return term;
					pushFollow(FOLLOW_termMultiplication_in_termAddition10918);
					r=termMultiplication();
					state._fsp--;
					if (state.failed) return term;
					if ( state.backtracking==0 ) {term = FunctionCall.Raw.newOperation('+', term, r);}
					}
					break;
				case 2 :
					// Parser.g:1482:11: '-' r= termMultiplication
					{
					match(input,192,FOLLOW_192_in_termAddition10932); if (state.failed) return term;
					pushFollow(FOLLOW_termMultiplication_in_termAddition10936);
					r=termMultiplication();
					state._fsp--;
					if (state.failed) return term;
					if ( state.backtracking==0 ) {term = FunctionCall.Raw.newOperation('-', term, r);}
					}
					break;

				default :
					break loop195;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return term;
	}
	// $ANTLR end "termAddition"



	// $ANTLR start "termMultiplication"
	// Parser.g:1486:1: termMultiplication returns [Term.Raw term] : l= termGroup ( '\\*' r= termGroup | '/' r= termGroup | '%' r= termGroup )* ;
	public final Term.Raw termMultiplication() throws RecognitionException {
		Term.Raw term = null;


		Term.Raw l =null;
		Term.Raw r =null;

		try {
			// Parser.g:1487:5: (l= termGroup ( '\\*' r= termGroup | '/' r= termGroup | '%' r= termGroup )* )
			// Parser.g:1487:9: l= termGroup ( '\\*' r= termGroup | '/' r= termGroup | '%' r= termGroup )*
			{
			pushFollow(FOLLOW_termGroup_in_termMultiplication10974);
			l=termGroup();
			state._fsp--;
			if (state.failed) return term;
			if ( state.backtracking==0 ) {term = l;}
			// Parser.g:1488:9: ( '\\*' r= termGroup | '/' r= termGroup | '%' r= termGroup )*
			loop196:
			while (true) {
				int alt196=4;
				switch ( input.LA(1) ) {
				case 204:
					{
					alt196=1;
					}
					break;
				case 195:
					{
					alt196=2;
					}
					break;
				case 186:
					{
					alt196=3;
					}
					break;
				}
				switch (alt196) {
				case 1 :
					// Parser.g:1488:11: '\\*' r= termGroup
					{
					match(input,204,FOLLOW_204_in_termMultiplication10990); if (state.failed) return term;
					pushFollow(FOLLOW_termGroup_in_termMultiplication10994);
					r=termGroup();
					state._fsp--;
					if (state.failed) return term;
					if ( state.backtracking==0 ) {term = FunctionCall.Raw.newOperation('*', term, r);}
					}
					break;
				case 2 :
					// Parser.g:1489:11: '/' r= termGroup
					{
					match(input,195,FOLLOW_195_in_termMultiplication11008); if (state.failed) return term;
					pushFollow(FOLLOW_termGroup_in_termMultiplication11012);
					r=termGroup();
					state._fsp--;
					if (state.failed) return term;
					if ( state.backtracking==0 ) {term = FunctionCall.Raw.newOperation('/', term, r);}
					}
					break;
				case 3 :
					// Parser.g:1490:11: '%' r= termGroup
					{
					match(input,186,FOLLOW_186_in_termMultiplication11026); if (state.failed) return term;
					pushFollow(FOLLOW_termGroup_in_termMultiplication11030);
					r=termGroup();
					state._fsp--;
					if (state.failed) return term;
					if ( state.backtracking==0 ) {term = FunctionCall.Raw.newOperation('%', term, r);}
					}
					break;

				default :
					break loop196;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return term;
	}
	// $ANTLR end "termMultiplication"



	// $ANTLR start "termGroup"
	// Parser.g:1494:1: termGroup returns [Term.Raw term] : (t= simpleTerm | '-' t= simpleTerm );
	public final Term.Raw termGroup() throws RecognitionException {
		Term.Raw term = null;


		Term.Raw t =null;

		try {
			// Parser.g:1495:5: (t= simpleTerm | '-' t= simpleTerm )
			int alt197=2;
			int LA197_0 = input.LA(1);
			if ( (LA197_0==BOOLEAN||LA197_0==DURATION||LA197_0==FLOAT||LA197_0==HEXNUMBER||(LA197_0 >= IDENT && LA197_0 <= INTEGER)||(LA197_0 >= K_AGGREGATE && LA197_0 <= K_ALL)||LA197_0==K_AS||LA197_0==K_ASCII||(LA197_0 >= K_BIGINT && LA197_0 <= K_BOOLEAN)||(LA197_0 >= K_CALLED && LA197_0 <= K_CLUSTERING)||(LA197_0 >= K_COMPACT && LA197_0 <= K_COUNTER)||(LA197_0 >= K_CUSTOM && LA197_0 <= K_DECIMAL)||(LA197_0 >= K_DISTINCT && LA197_0 <= K_DOUBLE)||LA197_0==K_DURATION||(LA197_0 >= K_EXISTS && LA197_0 <= K_FLOAT)||LA197_0==K_FROZEN||(LA197_0 >= K_FUNCTION && LA197_0 <= K_FUNCTIONS)||LA197_0==K_GROUP||(LA197_0 >= K_INET && LA197_0 <= K_INPUT)||LA197_0==K_INT||(LA197_0 >= K_JSON && LA197_0 <= K_KEYS)||(LA197_0 >= K_KEYSPACES && LA197_0 <= K_LIKE)||(LA197_0 >= K_LIST && LA197_0 <= K_MAP)||(LA197_0 >= K_NEGATIVE_INFINITY && LA197_0 <= K_NOLOGIN)||LA197_0==K_NOSUPERUSER||LA197_0==K_NULL||LA197_0==K_OPTIONS||(LA197_0 >= K_PARTITION && LA197_0 <= K_POSITIVE_NAN)||LA197_0==K_RETURNS||(LA197_0 >= K_ROLE && LA197_0 <= K_ROLES)||(LA197_0 >= K_SFUNC && LA197_0 <= K_TINYINT)||(LA197_0 >= K_TOKEN && LA197_0 <= K_TRIGGER)||(LA197_0 >= K_TTL && LA197_0 <= K_TYPE)||(LA197_0 >= K_USER && LA197_0 <= K_USERS)||(LA197_0 >= K_UUID && LA197_0 <= K_VARINT)||LA197_0==K_WRITETIME||(LA197_0 >= QMARK && LA197_0 <= QUOTED_NAME)||LA197_0==STRING_LITERAL||LA197_0==UUID||LA197_0==187||LA197_0==196||LA197_0==203||LA197_0==207) ) {
				alt197=1;
			}
			else if ( (LA197_0==192) ) {
				alt197=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return term;}
				NoViableAltException nvae =
					new NoViableAltException("", 197, 0, input);
				throw nvae;
			}

			switch (alt197) {
				case 1 :
					// Parser.g:1495:7: t= simpleTerm
					{
					pushFollow(FOLLOW_simpleTerm_in_termGroup11066);
					t=simpleTerm();
					state._fsp--;
					if (state.failed) return term;
					if ( state.backtracking==0 ) { term = t; }
					}
					break;
				case 2 :
					// Parser.g:1496:7: '-' t= simpleTerm
					{
					match(input,192,FOLLOW_192_in_termGroup11089); if (state.failed) return term;
					pushFollow(FOLLOW_simpleTerm_in_termGroup11094);
					t=simpleTerm();
					state._fsp--;
					if (state.failed) return term;
					if ( state.backtracking==0 ) { term = FunctionCall.Raw.newNegation(t); }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return term;
	}
	// $ANTLR end "termGroup"



	// $ANTLR start "simpleTerm"
	// Parser.g:1499:1: simpleTerm returns [Term.Raw term] : (v= value |f= function | '(' c= comparatorType ')' t= simpleTerm );
	public final Term.Raw simpleTerm() throws RecognitionException {
		Term.Raw term = null;


		Term.Raw v =null;
		Term.Raw f =null;
		CQL3Type.Raw c =null;
		Term.Raw t =null;

		try {
			// Parser.g:1500:5: (v= value |f= function | '(' c= comparatorType ')' t= simpleTerm )
			int alt198=3;
			alt198 = dfa198.predict(input);
			switch (alt198) {
				case 1 :
					// Parser.g:1500:7: v= value
					{
					pushFollow(FOLLOW_value_in_simpleTerm11127);
					v=value();
					state._fsp--;
					if (state.failed) return term;
					if ( state.backtracking==0 ) { term = v; }
					}
					break;
				case 2 :
					// Parser.g:1501:7: f= function
					{
					pushFollow(FOLLOW_function_in_simpleTerm11171);
					f=function();
					state._fsp--;
					if (state.failed) return term;
					if ( state.backtracking==0 ) { term = f; }
					}
					break;
				case 3 :
					// Parser.g:1502:7: '(' c= comparatorType ')' t= simpleTerm
					{
					match(input,187,FOLLOW_187_in_simpleTerm11210); if (state.failed) return term;
					pushFollow(FOLLOW_comparatorType_in_simpleTerm11214);
					c=comparatorType();
					state._fsp--;
					if (state.failed) return term;
					match(input,188,FOLLOW_188_in_simpleTerm11216); if (state.failed) return term;
					pushFollow(FOLLOW_simpleTerm_in_simpleTerm11220);
					t=simpleTerm();
					state._fsp--;
					if (state.failed) return term;
					if ( state.backtracking==0 ) { term = new TypeCast(c, t); }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return term;
	}
	// $ANTLR end "simpleTerm"



	// $ANTLR start "columnOperation"
	// Parser.g:1505:1: columnOperation[List<Pair<ColumnMetadata.Raw, Operation.RawUpdate>> operations] : key= cident columnOperationDifferentiator[operations, key] ;
	public final void columnOperation(List<Pair<ColumnMetadata.Raw, Operation.RawUpdate>> operations) throws RecognitionException {
		ColumnMetadata.Raw key =null;

		try {
			// Parser.g:1506:5: (key= cident columnOperationDifferentiator[operations, key] )
			// Parser.g:1506:7: key= cident columnOperationDifferentiator[operations, key]
			{
			pushFollow(FOLLOW_cident_in_columnOperation11244);
			key=cident();
			state._fsp--;
			if (state.failed) return;
			pushFollow(FOLLOW_columnOperationDifferentiator_in_columnOperation11246);
			columnOperationDifferentiator(operations, key);
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "columnOperation"



	// $ANTLR start "columnOperationDifferentiator"
	// Parser.g:1509:1: columnOperationDifferentiator[List<Pair<ColumnMetadata.Raw, Operation.RawUpdate>> operations, ColumnMetadata.Raw key] : ( '=' normalColumnOperation[operations, key] | shorthandColumnOperation[operations, key] | '[' k= term ']' collectionColumnOperation[operations, key, k] | '.' field= fident udtColumnOperation[operations, key, field] );
	public final void columnOperationDifferentiator(List<Pair<ColumnMetadata.Raw, Operation.RawUpdate>> operations, ColumnMetadata.Raw key) throws RecognitionException {
		Term.Raw k =null;
		FieldIdentifier field =null;

		try {
			// Parser.g:1510:5: ( '=' normalColumnOperation[operations, key] | shorthandColumnOperation[operations, key] | '[' k= term ']' collectionColumnOperation[operations, key, k] | '.' field= fident udtColumnOperation[operations, key, field] )
			int alt199=4;
			switch ( input.LA(1) ) {
			case 200:
				{
				alt199=1;
				}
				break;
			case 190:
			case 193:
				{
				alt199=2;
				}
				break;
			case 203:
				{
				alt199=3;
				}
				break;
			case 194:
				{
				alt199=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 199, 0, input);
				throw nvae;
			}
			switch (alt199) {
				case 1 :
					// Parser.g:1510:7: '=' normalColumnOperation[operations, key]
					{
					match(input,200,FOLLOW_200_in_columnOperationDifferentiator11265); if (state.failed) return;
					pushFollow(FOLLOW_normalColumnOperation_in_columnOperationDifferentiator11267);
					normalColumnOperation(operations, key);
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// Parser.g:1511:7: shorthandColumnOperation[operations, key]
					{
					pushFollow(FOLLOW_shorthandColumnOperation_in_columnOperationDifferentiator11276);
					shorthandColumnOperation(operations, key);
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// Parser.g:1512:7: '[' k= term ']' collectionColumnOperation[operations, key, k]
					{
					match(input,203,FOLLOW_203_in_columnOperationDifferentiator11285); if (state.failed) return;
					pushFollow(FOLLOW_term_in_columnOperationDifferentiator11289);
					k=term();
					state._fsp--;
					if (state.failed) return;
					match(input,205,FOLLOW_205_in_columnOperationDifferentiator11291); if (state.failed) return;
					pushFollow(FOLLOW_collectionColumnOperation_in_columnOperationDifferentiator11293);
					collectionColumnOperation(operations, key, k);
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 4 :
					// Parser.g:1513:7: '.' field= fident udtColumnOperation[operations, key, field]
					{
					match(input,194,FOLLOW_194_in_columnOperationDifferentiator11302); if (state.failed) return;
					pushFollow(FOLLOW_fident_in_columnOperationDifferentiator11306);
					field=fident();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_udtColumnOperation_in_columnOperationDifferentiator11308);
					udtColumnOperation(operations, key, field);
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "columnOperationDifferentiator"



	// $ANTLR start "normalColumnOperation"
	// Parser.g:1516:1: normalColumnOperation[List<Pair<ColumnMetadata.Raw, Operation.RawUpdate>> operations, ColumnMetadata.Raw key] : (t= term ( '+' c= cident )? |c= cident sig= ( '+' | '-' ) t= term |c= cident i= INTEGER );
	public final void normalColumnOperation(List<Pair<ColumnMetadata.Raw, Operation.RawUpdate>> operations, ColumnMetadata.Raw key) throws RecognitionException {
		Token sig=null;
		Token i=null;
		Term.Raw t =null;
		ColumnMetadata.Raw c =null;

		try {
			// Parser.g:1517:5: (t= term ( '+' c= cident )? |c= cident sig= ( '+' | '-' ) t= term |c= cident i= INTEGER )
			int alt201=3;
			alt201 = dfa201.predict(input);
			switch (alt201) {
				case 1 :
					// Parser.g:1517:7: t= term ( '+' c= cident )?
					{
					pushFollow(FOLLOW_term_in_normalColumnOperation11329);
					t=term();
					state._fsp--;
					if (state.failed) return;
					// Parser.g:1517:14: ( '+' c= cident )?
					int alt200=2;
					int LA200_0 = input.LA(1);
					if ( (LA200_0==189) ) {
						alt200=1;
					}
					switch (alt200) {
						case 1 :
							// Parser.g:1517:15: '+' c= cident
							{
							match(input,189,FOLLOW_189_in_normalColumnOperation11332); if (state.failed) return;
							pushFollow(FOLLOW_cident_in_normalColumnOperation11336);
							c=cident();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					if ( state.backtracking==0 ) {
					          if (c == null)
					          {
					              addRawUpdate(operations, key, new Operation.SetValue(t));
					          }
					          else
					          {
					              if (!key.equals(c))
					                  addRecognitionError("Only expressions of the form X = <value> + X are supported.");
					              addRawUpdate(operations, key, new Operation.Prepend(t));
					          }
					      }
					}
					break;
				case 2 :
					// Parser.g:1530:7: c= cident sig= ( '+' | '-' ) t= term
					{
					pushFollow(FOLLOW_cident_in_normalColumnOperation11357);
					c=cident();
					state._fsp--;
					if (state.failed) return;
					sig=input.LT(1);
					if ( input.LA(1)==189||input.LA(1)==192 ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_term_in_normalColumnOperation11371);
					t=term();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) {
					          if (!key.equals(c))
					              addRecognitionError("Only expressions of the form X = X " + (sig!=null?sig.getText():null) + "<value> are supported.");
					          addRawUpdate(operations, key, (sig!=null?sig.getText():null).equals("+") ? new Operation.Addition(t) : new Operation.Substraction(t));
					      }
					}
					break;
				case 3 :
					// Parser.g:1536:7: c= cident i= INTEGER
					{
					pushFollow(FOLLOW_cident_in_normalColumnOperation11389);
					c=cident();
					state._fsp--;
					if (state.failed) return;
					i=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_normalColumnOperation11393); if (state.failed) return;
					if ( state.backtracking==0 ) {
					          // Note that this production *is* necessary because X = X - 3 will in fact be lexed as [ X, '=', X, INTEGER].
					          if (!key.equals(c))
					              // We don't yet allow a '+' in front of an integer, but we could in the future really, so let's be future-proof in our error message
					              addRecognitionError("Only expressions of the form X = X " + ((i!=null?i.getText():null).charAt(0) == '-' ? '-' : '+') + " <value> are supported.");
					          addRawUpdate(operations, key, new Operation.Addition(Constants.Literal.integer((i!=null?i.getText():null))));
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
			// do for sure before leaving
		}
	}
	// $ANTLR end "normalColumnOperation"



	// $ANTLR start "shorthandColumnOperation"
	// Parser.g:1546:1: shorthandColumnOperation[List<Pair<ColumnMetadata.Raw, Operation.RawUpdate>> operations, ColumnMetadata.Raw key] : sig= ( '+=' | '-=' ) t= term ;
	public final void shorthandColumnOperation(List<Pair<ColumnMetadata.Raw, Operation.RawUpdate>> operations, ColumnMetadata.Raw key) throws RecognitionException {
		Token sig=null;
		Term.Raw t =null;

		try {
			// Parser.g:1547:5: (sig= ( '+=' | '-=' ) t= term )
			// Parser.g:1547:7: sig= ( '+=' | '-=' ) t= term
			{
			sig=input.LT(1);
			if ( input.LA(1)==190||input.LA(1)==193 ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			pushFollow(FOLLOW_term_in_shorthandColumnOperation11431);
			t=term();
			state._fsp--;
			if (state.failed) return;
			if ( state.backtracking==0 ) {
			          addRawUpdate(operations, key, (sig!=null?sig.getText():null).equals("+=") ? new Operation.Addition(t) : new Operation.Substraction(t));
			      }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "shorthandColumnOperation"



	// $ANTLR start "collectionColumnOperation"
	// Parser.g:1553:1: collectionColumnOperation[List<Pair<ColumnMetadata.Raw, Operation.RawUpdate>> operations, ColumnMetadata.Raw key, Term.Raw k] : '=' t= term ;
	public final void collectionColumnOperation(List<Pair<ColumnMetadata.Raw, Operation.RawUpdate>> operations, ColumnMetadata.Raw key, Term.Raw k) throws RecognitionException {
		Term.Raw t =null;

		try {
			// Parser.g:1554:5: ( '=' t= term )
			// Parser.g:1554:7: '=' t= term
			{
			match(input,200,FOLLOW_200_in_collectionColumnOperation11457); if (state.failed) return;
			pushFollow(FOLLOW_term_in_collectionColumnOperation11461);
			t=term();
			state._fsp--;
			if (state.failed) return;
			if ( state.backtracking==0 ) {
			          addRawUpdate(operations, key, new Operation.SetElement(k, t));
			      }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "collectionColumnOperation"



	// $ANTLR start "udtColumnOperation"
	// Parser.g:1560:1: udtColumnOperation[List<Pair<ColumnMetadata.Raw, Operation.RawUpdate>> operations, ColumnMetadata.Raw key, FieldIdentifier field] : '=' t= term ;
	public final void udtColumnOperation(List<Pair<ColumnMetadata.Raw, Operation.RawUpdate>> operations, ColumnMetadata.Raw key, FieldIdentifier field) throws RecognitionException {
		Term.Raw t =null;

		try {
			// Parser.g:1561:5: ( '=' t= term )
			// Parser.g:1561:7: '=' t= term
			{
			match(input,200,FOLLOW_200_in_udtColumnOperation11487); if (state.failed) return;
			pushFollow(FOLLOW_term_in_udtColumnOperation11491);
			t=term();
			state._fsp--;
			if (state.failed) return;
			if ( state.backtracking==0 ) {
			          addRawUpdate(operations, key, new Operation.SetField(field, t));
			      }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "udtColumnOperation"



	// $ANTLR start "columnCondition"
	// Parser.g:1567:1: columnCondition[List<Pair<ColumnMetadata.Raw, ColumnCondition.Raw>> conditions] : key= cident (op= relationType t= term | K_IN (values= singleColumnInValues |marker= inMarker ) | '[' element= term ']' (op= relationType t= term | K_IN (values= singleColumnInValues |marker= inMarker ) ) | '.' field= fident (op= relationType t= term | K_IN (values= singleColumnInValues |marker= inMarker ) ) ) ;
	public final void columnCondition(List<Pair<ColumnMetadata.Raw, ColumnCondition.Raw>> conditions) throws RecognitionException {
		ColumnMetadata.Raw key =null;
		Operator op =null;
		Term.Raw t =null;
		List<Term.Raw> values =null;
		AbstractMarker.INRaw marker =null;
		Term.Raw element =null;
		FieldIdentifier field =null;

		try {
			// Parser.g:1569:5: (key= cident (op= relationType t= term | K_IN (values= singleColumnInValues |marker= inMarker ) | '[' element= term ']' (op= relationType t= term | K_IN (values= singleColumnInValues |marker= inMarker ) ) | '.' field= fident (op= relationType t= term | K_IN (values= singleColumnInValues |marker= inMarker ) ) ) )
			// Parser.g:1569:7: key= cident (op= relationType t= term | K_IN (values= singleColumnInValues |marker= inMarker ) | '[' element= term ']' (op= relationType t= term | K_IN (values= singleColumnInValues |marker= inMarker ) ) | '.' field= fident (op= relationType t= term | K_IN (values= singleColumnInValues |marker= inMarker ) ) )
			{
			pushFollow(FOLLOW_cident_in_columnCondition11524);
			key=cident();
			state._fsp--;
			if (state.failed) return;
			// Parser.g:1570:9: (op= relationType t= term | K_IN (values= singleColumnInValues |marker= inMarker ) | '[' element= term ']' (op= relationType t= term | K_IN (values= singleColumnInValues |marker= inMarker ) ) | '.' field= fident (op= relationType t= term | K_IN (values= singleColumnInValues |marker= inMarker ) ) )
			int alt207=4;
			switch ( input.LA(1) ) {
			case 185:
			case 198:
			case 199:
			case 200:
			case 201:
			case 202:
				{
				alt207=1;
				}
				break;
			case K_IN:
				{
				alt207=2;
				}
				break;
			case 203:
				{
				alt207=3;
				}
				break;
			case 194:
				{
				alt207=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 207, 0, input);
				throw nvae;
			}
			switch (alt207) {
				case 1 :
					// Parser.g:1570:11: op= relationType t= term
					{
					pushFollow(FOLLOW_relationType_in_columnCondition11538);
					op=relationType();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_term_in_columnCondition11542);
					t=term();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) { conditions.add(Pair.create(key, ColumnCondition.Raw.simpleCondition(t, op))); }
					}
					break;
				case 2 :
					// Parser.g:1571:11: K_IN (values= singleColumnInValues |marker= inMarker )
					{
					match(input,K_IN,FOLLOW_K_IN_in_columnCondition11556); if (state.failed) return;
					// Parser.g:1572:13: (values= singleColumnInValues |marker= inMarker )
					int alt202=2;
					int LA202_0 = input.LA(1);
					if ( (LA202_0==187) ) {
						alt202=1;
					}
					else if ( (LA202_0==QMARK||LA202_0==196) ) {
						alt202=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						NoViableAltException nvae =
							new NoViableAltException("", 202, 0, input);
						throw nvae;
					}

					switch (alt202) {
						case 1 :
							// Parser.g:1572:15: values= singleColumnInValues
							{
							pushFollow(FOLLOW_singleColumnInValues_in_columnCondition11574);
							values=singleColumnInValues();
							state._fsp--;
							if (state.failed) return;
							if ( state.backtracking==0 ) { conditions.add(Pair.create(key, ColumnCondition.Raw.simpleInCondition(values))); }
							}
							break;
						case 2 :
							// Parser.g:1573:15: marker= inMarker
							{
							pushFollow(FOLLOW_inMarker_in_columnCondition11594);
							marker=inMarker();
							state._fsp--;
							if (state.failed) return;
							if ( state.backtracking==0 ) { conditions.add(Pair.create(key, ColumnCondition.Raw.simpleInCondition(marker))); }
							}
							break;

					}

					}
					break;
				case 3 :
					// Parser.g:1575:11: '[' element= term ']' (op= relationType t= term | K_IN (values= singleColumnInValues |marker= inMarker ) )
					{
					match(input,203,FOLLOW_203_in_columnCondition11622); if (state.failed) return;
					pushFollow(FOLLOW_term_in_columnCondition11626);
					element=term();
					state._fsp--;
					if (state.failed) return;
					match(input,205,FOLLOW_205_in_columnCondition11628); if (state.failed) return;
					// Parser.g:1576:13: (op= relationType t= term | K_IN (values= singleColumnInValues |marker= inMarker ) )
					int alt204=2;
					int LA204_0 = input.LA(1);
					if ( (LA204_0==185||(LA204_0 >= 198 && LA204_0 <= 202)) ) {
						alt204=1;
					}
					else if ( (LA204_0==K_IN) ) {
						alt204=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						NoViableAltException nvae =
							new NoViableAltException("", 204, 0, input);
						throw nvae;
					}

					switch (alt204) {
						case 1 :
							// Parser.g:1576:15: op= relationType t= term
							{
							pushFollow(FOLLOW_relationType_in_columnCondition11646);
							op=relationType();
							state._fsp--;
							if (state.failed) return;
							pushFollow(FOLLOW_term_in_columnCondition11650);
							t=term();
							state._fsp--;
							if (state.failed) return;
							if ( state.backtracking==0 ) { conditions.add(Pair.create(key, ColumnCondition.Raw.collectionCondition(t, element, op))); }
							}
							break;
						case 2 :
							// Parser.g:1577:15: K_IN (values= singleColumnInValues |marker= inMarker )
							{
							match(input,K_IN,FOLLOW_K_IN_in_columnCondition11668); if (state.failed) return;
							// Parser.g:1578:17: (values= singleColumnInValues |marker= inMarker )
							int alt203=2;
							int LA203_0 = input.LA(1);
							if ( (LA203_0==187) ) {
								alt203=1;
							}
							else if ( (LA203_0==QMARK||LA203_0==196) ) {
								alt203=2;
							}

							else {
								if (state.backtracking>0) {state.failed=true; return;}
								NoViableAltException nvae =
									new NoViableAltException("", 203, 0, input);
								throw nvae;
							}

							switch (alt203) {
								case 1 :
									// Parser.g:1578:19: values= singleColumnInValues
									{
									pushFollow(FOLLOW_singleColumnInValues_in_columnCondition11690);
									values=singleColumnInValues();
									state._fsp--;
									if (state.failed) return;
									if ( state.backtracking==0 ) { conditions.add(Pair.create(key, ColumnCondition.Raw.collectionInCondition(element, values))); }
									}
									break;
								case 2 :
									// Parser.g:1579:19: marker= inMarker
									{
									pushFollow(FOLLOW_inMarker_in_columnCondition11714);
									marker=inMarker();
									state._fsp--;
									if (state.failed) return;
									if ( state.backtracking==0 ) { conditions.add(Pair.create(key, ColumnCondition.Raw.collectionInCondition(element, marker))); }
									}
									break;

							}

							}
							break;

					}

					}
					break;
				case 4 :
					// Parser.g:1582:11: '.' field= fident (op= relationType t= term | K_IN (values= singleColumnInValues |marker= inMarker ) )
					{
					match(input,194,FOLLOW_194_in_columnCondition11760); if (state.failed) return;
					pushFollow(FOLLOW_fident_in_columnCondition11764);
					field=fident();
					state._fsp--;
					if (state.failed) return;
					// Parser.g:1583:13: (op= relationType t= term | K_IN (values= singleColumnInValues |marker= inMarker ) )
					int alt206=2;
					int LA206_0 = input.LA(1);
					if ( (LA206_0==185||(LA206_0 >= 198 && LA206_0 <= 202)) ) {
						alt206=1;
					}
					else if ( (LA206_0==K_IN) ) {
						alt206=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						NoViableAltException nvae =
							new NoViableAltException("", 206, 0, input);
						throw nvae;
					}

					switch (alt206) {
						case 1 :
							// Parser.g:1583:15: op= relationType t= term
							{
							pushFollow(FOLLOW_relationType_in_columnCondition11782);
							op=relationType();
							state._fsp--;
							if (state.failed) return;
							pushFollow(FOLLOW_term_in_columnCondition11786);
							t=term();
							state._fsp--;
							if (state.failed) return;
							if ( state.backtracking==0 ) { conditions.add(Pair.create(key, ColumnCondition.Raw.udtFieldCondition(t, field, op))); }
							}
							break;
						case 2 :
							// Parser.g:1584:15: K_IN (values= singleColumnInValues |marker= inMarker )
							{
							match(input,K_IN,FOLLOW_K_IN_in_columnCondition11804); if (state.failed) return;
							// Parser.g:1585:17: (values= singleColumnInValues |marker= inMarker )
							int alt205=2;
							int LA205_0 = input.LA(1);
							if ( (LA205_0==187) ) {
								alt205=1;
							}
							else if ( (LA205_0==QMARK||LA205_0==196) ) {
								alt205=2;
							}

							else {
								if (state.backtracking>0) {state.failed=true; return;}
								NoViableAltException nvae =
									new NoViableAltException("", 205, 0, input);
								throw nvae;
							}

							switch (alt205) {
								case 1 :
									// Parser.g:1585:19: values= singleColumnInValues
									{
									pushFollow(FOLLOW_singleColumnInValues_in_columnCondition11826);
									values=singleColumnInValues();
									state._fsp--;
									if (state.failed) return;
									if ( state.backtracking==0 ) { conditions.add(Pair.create(key, ColumnCondition.Raw.udtFieldInCondition(field, values))); }
									}
									break;
								case 2 :
									// Parser.g:1586:19: marker= inMarker
									{
									pushFollow(FOLLOW_inMarker_in_columnCondition11850);
									marker=inMarker();
									state._fsp--;
									if (state.failed) return;
									if ( state.backtracking==0 ) { conditions.add(Pair.create(key, ColumnCondition.Raw.udtFieldInCondition(field, marker))); }
									}
									break;

							}

							}
							break;

					}

					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "columnCondition"



	// $ANTLR start "properties"
	// Parser.g:1592:1: properties[PropertyDefinitions props] : property[props] ( K_AND property[props] )* ;
	public final void properties(PropertyDefinitions props) throws RecognitionException {
		try {
			// Parser.g:1593:5: ( property[props] ( K_AND property[props] )* )
			// Parser.g:1593:7: property[props] ( K_AND property[props] )*
			{
			pushFollow(FOLLOW_property_in_properties11912);
			property(props);
			state._fsp--;
			if (state.failed) return;
			// Parser.g:1593:23: ( K_AND property[props] )*
			loop208:
			while (true) {
				int alt208=2;
				int LA208_0 = input.LA(1);
				if ( (LA208_0==K_AND) ) {
					alt208=1;
				}

				switch (alt208) {
				case 1 :
					// Parser.g:1593:24: K_AND property[props]
					{
					match(input,K_AND,FOLLOW_K_AND_in_properties11916); if (state.failed) return;
					pushFollow(FOLLOW_property_in_properties11918);
					property(props);
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop208;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "properties"



	// $ANTLR start "property"
	// Parser.g:1596:1: property[PropertyDefinitions props] : (k= noncol_ident '=' simple= propertyValue |k= noncol_ident '=' map= fullMapLiteral );
	public final void property(PropertyDefinitions props) throws RecognitionException {
		ColumnIdentifier k =null;
		String simple =null;
		Maps.Literal map =null;

		try {
			// Parser.g:1597:5: (k= noncol_ident '=' simple= propertyValue |k= noncol_ident '=' map= fullMapLiteral )
			int alt209=2;
			alt209 = dfa209.predict(input);
			switch (alt209) {
				case 1 :
					// Parser.g:1597:7: k= noncol_ident '=' simple= propertyValue
					{
					pushFollow(FOLLOW_noncol_ident_in_property11941);
					k=noncol_ident();
					state._fsp--;
					if (state.failed) return;
					match(input,200,FOLLOW_200_in_property11943); if (state.failed) return;
					pushFollow(FOLLOW_propertyValue_in_property11947);
					simple=propertyValue();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) { try { props.addProperty(k.toString(), simple); } catch (SyntaxException e) { addRecognitionError(e.getMessage()); } }
					}
					break;
				case 2 :
					// Parser.g:1598:7: k= noncol_ident '=' map= fullMapLiteral
					{
					pushFollow(FOLLOW_noncol_ident_in_property11959);
					k=noncol_ident();
					state._fsp--;
					if (state.failed) return;
					match(input,200,FOLLOW_200_in_property11961); if (state.failed) return;
					pushFollow(FOLLOW_fullMapLiteral_in_property11965);
					map=fullMapLiteral();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) { try { props.addProperty(k.toString(), convertPropertyMap(map)); } catch (SyntaxException e) { addRecognitionError(e.getMessage()); } }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "property"



	// $ANTLR start "propertyValue"
	// Parser.g:1601:1: propertyValue returns [String str] : (c= constant |u= unreserved_keyword );
	public final String propertyValue() throws RecognitionException {
		String str = null;


		Constants.Literal c =null;
		String u =null;

		try {
			// Parser.g:1602:5: (c= constant |u= unreserved_keyword )
			int alt210=2;
			int LA210_0 = input.LA(1);
			if ( (LA210_0==BOOLEAN||LA210_0==DURATION||LA210_0==FLOAT||LA210_0==HEXNUMBER||LA210_0==INTEGER||(LA210_0 >= K_NEGATIVE_INFINITY && LA210_0 <= K_NEGATIVE_NAN)||(LA210_0 >= K_POSITIVE_INFINITY && LA210_0 <= K_POSITIVE_NAN)||LA210_0==STRING_LITERAL||LA210_0==UUID) ) {
				alt210=1;
			}
			else if ( ((LA210_0 >= K_AGGREGATE && LA210_0 <= K_ALL)||LA210_0==K_AS||LA210_0==K_ASCII||(LA210_0 >= K_BIGINT && LA210_0 <= K_BOOLEAN)||(LA210_0 >= K_CALLED && LA210_0 <= K_CLUSTERING)||(LA210_0 >= K_COMPACT && LA210_0 <= K_COUNTER)||(LA210_0 >= K_CUSTOM && LA210_0 <= K_DECIMAL)||(LA210_0 >= K_DISTINCT && LA210_0 <= K_DOUBLE)||LA210_0==K_DURATION||(LA210_0 >= K_EXISTS && LA210_0 <= K_FLOAT)||LA210_0==K_FROZEN||(LA210_0 >= K_FUNCTION && LA210_0 <= K_FUNCTIONS)||LA210_0==K_GROUP||(LA210_0 >= K_INET && LA210_0 <= K_INPUT)||LA210_0==K_INT||(LA210_0 >= K_JSON && LA210_0 <= K_KEYS)||(LA210_0 >= K_KEYSPACES && LA210_0 <= K_LIKE)||(LA210_0 >= K_LIST && LA210_0 <= K_MAP)||LA210_0==K_NOLOGIN||LA210_0==K_NOSUPERUSER||LA210_0==K_OPTIONS||(LA210_0 >= K_PARTITION && LA210_0 <= K_PERMISSIONS)||LA210_0==K_RETURNS||(LA210_0 >= K_ROLE && LA210_0 <= K_ROLES)||(LA210_0 >= K_SFUNC && LA210_0 <= K_TINYINT)||LA210_0==K_TRIGGER||(LA210_0 >= K_TTL && LA210_0 <= K_TYPE)||(LA210_0 >= K_USER && LA210_0 <= K_USERS)||(LA210_0 >= K_UUID && LA210_0 <= K_VARINT)||LA210_0==K_WRITETIME) ) {
				alt210=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return str;}
				NoViableAltException nvae =
					new NoViableAltException("", 210, 0, input);
				throw nvae;
			}

			switch (alt210) {
				case 1 :
					// Parser.g:1602:7: c= constant
					{
					pushFollow(FOLLOW_constant_in_propertyValue11990);
					c=constant();
					state._fsp--;
					if (state.failed) return str;
					if ( state.backtracking==0 ) { str = c.getRawText(); }
					}
					break;
				case 2 :
					// Parser.g:1603:7: u= unreserved_keyword
					{
					pushFollow(FOLLOW_unreserved_keyword_in_propertyValue12012);
					u=unreserved_keyword();
					state._fsp--;
					if (state.failed) return str;
					if ( state.backtracking==0 ) { str = u; }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return str;
	}
	// $ANTLR end "propertyValue"



	// $ANTLR start "relationType"
	// Parser.g:1606:1: relationType returns [Operator op] : ( '=' | '<' | '<=' | '>' | '>=' | '!=' );
	public final Operator relationType() throws RecognitionException {
		Operator op = null;


		try {
			// Parser.g:1607:5: ( '=' | '<' | '<=' | '>' | '>=' | '!=' )
			int alt211=6;
			switch ( input.LA(1) ) {
			case 200:
				{
				alt211=1;
				}
				break;
			case 198:
				{
				alt211=2;
				}
				break;
			case 199:
				{
				alt211=3;
				}
				break;
			case 201:
				{
				alt211=4;
				}
				break;
			case 202:
				{
				alt211=5;
				}
				break;
			case 185:
				{
				alt211=6;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return op;}
				NoViableAltException nvae =
					new NoViableAltException("", 211, 0, input);
				throw nvae;
			}
			switch (alt211) {
				case 1 :
					// Parser.g:1607:7: '='
					{
					match(input,200,FOLLOW_200_in_relationType12035); if (state.failed) return op;
					if ( state.backtracking==0 ) { op = Operator.EQ; }
					}
					break;
				case 2 :
					// Parser.g:1608:7: '<'
					{
					match(input,198,FOLLOW_198_in_relationType12046); if (state.failed) return op;
					if ( state.backtracking==0 ) { op = Operator.LT; }
					}
					break;
				case 3 :
					// Parser.g:1609:7: '<='
					{
					match(input,199,FOLLOW_199_in_relationType12057); if (state.failed) return op;
					if ( state.backtracking==0 ) { op = Operator.LTE; }
					}
					break;
				case 4 :
					// Parser.g:1610:7: '>'
					{
					match(input,201,FOLLOW_201_in_relationType12067); if (state.failed) return op;
					if ( state.backtracking==0 ) { op = Operator.GT; }
					}
					break;
				case 5 :
					// Parser.g:1611:7: '>='
					{
					match(input,202,FOLLOW_202_in_relationType12078); if (state.failed) return op;
					if ( state.backtracking==0 ) { op = Operator.GTE; }
					}
					break;
				case 6 :
					// Parser.g:1612:7: '!='
					{
					match(input,185,FOLLOW_185_in_relationType12088); if (state.failed) return op;
					if ( state.backtracking==0 ) { op = Operator.NEQ; }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return op;
	}
	// $ANTLR end "relationType"



	// $ANTLR start "relation"
	// Parser.g:1615:1: relation[WhereClause.Builder clauses] : (name= cident type= relationType t= term |name= cident K_LIKE t= term |name= cident K_IS K_NOT K_NULL | K_TOKEN l= tupleOfIdentifiers type= relationType t= term |name= cident K_IN marker= inMarker |name= cident K_IN inValues= singleColumnInValues |name= cident rt= containsOperator t= term |name= cident '[' key= term ']' type= relationType t= term |ids= tupleOfIdentifiers ( K_IN ( '(' ')' |tupleInMarker= inMarkerForTuple |literals= tupleOfTupleLiterals |markers= tupleOfMarkersForTuples ) |type= relationType literal= tupleLiteral |type= relationType tupleMarker= markerForTuple ) | '(' relation[$clauses] ')' );
	public final void relation(WhereClause.Builder clauses) throws RecognitionException {
		ColumnMetadata.Raw name =null;
		Operator type =null;
		Term.Raw t =null;
		List<ColumnMetadata.Raw> l =null;
		AbstractMarker.INRaw marker =null;
		List<Term.Raw> inValues =null;
		Operator rt =null;
		Term.Raw key =null;
		List<ColumnMetadata.Raw> ids =null;
		Tuples.INRaw tupleInMarker =null;
		List<Tuples.Literal> literals =null;
		List<Tuples.Raw> markers =null;
		Tuples.Literal literal =null;
		Tuples.Raw tupleMarker =null;

		try {
			// Parser.g:1616:5: (name= cident type= relationType t= term |name= cident K_LIKE t= term |name= cident K_IS K_NOT K_NULL | K_TOKEN l= tupleOfIdentifiers type= relationType t= term |name= cident K_IN marker= inMarker |name= cident K_IN inValues= singleColumnInValues |name= cident rt= containsOperator t= term |name= cident '[' key= term ']' type= relationType t= term |ids= tupleOfIdentifiers ( K_IN ( '(' ')' |tupleInMarker= inMarkerForTuple |literals= tupleOfTupleLiterals |markers= tupleOfMarkersForTuples ) |type= relationType literal= tupleLiteral |type= relationType tupleMarker= markerForTuple ) | '(' relation[$clauses] ')' )
			int alt214=10;
			alt214 = dfa214.predict(input);
			switch (alt214) {
				case 1 :
					// Parser.g:1616:7: name= cident type= relationType t= term
					{
					pushFollow(FOLLOW_cident_in_relation12110);
					name=cident();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_relationType_in_relation12114);
					type=relationType();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_term_in_relation12118);
					t=term();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) { clauses.add(new SingleColumnRelation(name, type, t)); }
					}
					break;
				case 2 :
					// Parser.g:1617:7: name= cident K_LIKE t= term
					{
					pushFollow(FOLLOW_cident_in_relation12130);
					name=cident();
					state._fsp--;
					if (state.failed) return;
					match(input,K_LIKE,FOLLOW_K_LIKE_in_relation12132); if (state.failed) return;
					pushFollow(FOLLOW_term_in_relation12136);
					t=term();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) { clauses.add(new SingleColumnRelation(name, Operator.LIKE, t)); }
					}
					break;
				case 3 :
					// Parser.g:1618:7: name= cident K_IS K_NOT K_NULL
					{
					pushFollow(FOLLOW_cident_in_relation12148);
					name=cident();
					state._fsp--;
					if (state.failed) return;
					match(input,K_IS,FOLLOW_K_IS_in_relation12150); if (state.failed) return;
					match(input,K_NOT,FOLLOW_K_NOT_in_relation12152); if (state.failed) return;
					match(input,K_NULL,FOLLOW_K_NULL_in_relation12154); if (state.failed) return;
					if ( state.backtracking==0 ) { clauses.add(new SingleColumnRelation(name, Operator.IS_NOT, Constants.NULL_LITERAL)); }
					}
					break;
				case 4 :
					// Parser.g:1619:7: K_TOKEN l= tupleOfIdentifiers type= relationType t= term
					{
					match(input,K_TOKEN,FOLLOW_K_TOKEN_in_relation12164); if (state.failed) return;
					pushFollow(FOLLOW_tupleOfIdentifiers_in_relation12168);
					l=tupleOfIdentifiers();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_relationType_in_relation12172);
					type=relationType();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_term_in_relation12176);
					t=term();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) { clauses.add(new TokenRelation(l, type, t)); }
					}
					break;
				case 5 :
					// Parser.g:1621:7: name= cident K_IN marker= inMarker
					{
					pushFollow(FOLLOW_cident_in_relation12196);
					name=cident();
					state._fsp--;
					if (state.failed) return;
					match(input,K_IN,FOLLOW_K_IN_in_relation12198); if (state.failed) return;
					pushFollow(FOLLOW_inMarker_in_relation12202);
					marker=inMarker();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) { clauses.add(new SingleColumnRelation(name, Operator.IN, marker)); }
					}
					break;
				case 6 :
					// Parser.g:1623:7: name= cident K_IN inValues= singleColumnInValues
					{
					pushFollow(FOLLOW_cident_in_relation12222);
					name=cident();
					state._fsp--;
					if (state.failed) return;
					match(input,K_IN,FOLLOW_K_IN_in_relation12224); if (state.failed) return;
					pushFollow(FOLLOW_singleColumnInValues_in_relation12228);
					inValues=singleColumnInValues();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) { clauses.add(SingleColumnRelation.createInRelation(name, inValues)); }
					}
					break;
				case 7 :
					// Parser.g:1625:7: name= cident rt= containsOperator t= term
					{
					pushFollow(FOLLOW_cident_in_relation12248);
					name=cident();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_containsOperator_in_relation12252);
					rt=containsOperator();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_term_in_relation12256);
					t=term();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) { clauses.add(new SingleColumnRelation(name, rt, t)); }
					}
					break;
				case 8 :
					// Parser.g:1626:7: name= cident '[' key= term ']' type= relationType t= term
					{
					pushFollow(FOLLOW_cident_in_relation12268);
					name=cident();
					state._fsp--;
					if (state.failed) return;
					match(input,203,FOLLOW_203_in_relation12270); if (state.failed) return;
					pushFollow(FOLLOW_term_in_relation12274);
					key=term();
					state._fsp--;
					if (state.failed) return;
					match(input,205,FOLLOW_205_in_relation12276); if (state.failed) return;
					pushFollow(FOLLOW_relationType_in_relation12280);
					type=relationType();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_term_in_relation12284);
					t=term();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) { clauses.add(new SingleColumnRelation(name, key, type, t)); }
					}
					break;
				case 9 :
					// Parser.g:1627:7: ids= tupleOfIdentifiers ( K_IN ( '(' ')' |tupleInMarker= inMarkerForTuple |literals= tupleOfTupleLiterals |markers= tupleOfMarkersForTuples ) |type= relationType literal= tupleLiteral |type= relationType tupleMarker= markerForTuple )
					{
					pushFollow(FOLLOW_tupleOfIdentifiers_in_relation12296);
					ids=tupleOfIdentifiers();
					state._fsp--;
					if (state.failed) return;
					// Parser.g:1628:7: ( K_IN ( '(' ')' |tupleInMarker= inMarkerForTuple |literals= tupleOfTupleLiterals |markers= tupleOfMarkersForTuples ) |type= relationType literal= tupleLiteral |type= relationType tupleMarker= markerForTuple )
					int alt213=3;
					alt213 = dfa213.predict(input);
					switch (alt213) {
						case 1 :
							// Parser.g:1628:9: K_IN ( '(' ')' |tupleInMarker= inMarkerForTuple |literals= tupleOfTupleLiterals |markers= tupleOfMarkersForTuples )
							{
							match(input,K_IN,FOLLOW_K_IN_in_relation12306); if (state.failed) return;
							// Parser.g:1629:11: ( '(' ')' |tupleInMarker= inMarkerForTuple |literals= tupleOfTupleLiterals |markers= tupleOfMarkersForTuples )
							int alt212=4;
							int LA212_0 = input.LA(1);
							if ( (LA212_0==187) ) {
								switch ( input.LA(2) ) {
								case 188:
									{
									alt212=1;
									}
									break;
								case 187:
									{
									alt212=3;
									}
									break;
								case QMARK:
								case 196:
									{
									alt212=4;
									}
									break;
								default:
									if (state.backtracking>0) {state.failed=true; return;}
									int nvaeMark = input.mark();
									try {
										input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 212, 1, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}
							}
							else if ( (LA212_0==QMARK||LA212_0==196) ) {
								alt212=2;
							}

							else {
								if (state.backtracking>0) {state.failed=true; return;}
								NoViableAltException nvae =
									new NoViableAltException("", 212, 0, input);
								throw nvae;
							}

							switch (alt212) {
								case 1 :
									// Parser.g:1629:13: '(' ')'
									{
									match(input,187,FOLLOW_187_in_relation12320); if (state.failed) return;
									match(input,188,FOLLOW_188_in_relation12322); if (state.failed) return;
									if ( state.backtracking==0 ) { clauses.add(MultiColumnRelation.createInRelation(ids, new ArrayList<Tuples.Literal>())); }
									}
									break;
								case 2 :
									// Parser.g:1631:13: tupleInMarker= inMarkerForTuple
									{
									pushFollow(FOLLOW_inMarkerForTuple_in_relation12354);
									tupleInMarker=inMarkerForTuple();
									state._fsp--;
									if (state.failed) return;
									if ( state.backtracking==0 ) { clauses.add(MultiColumnRelation.createSingleMarkerInRelation(ids, tupleInMarker)); }
									}
									break;
								case 3 :
									// Parser.g:1633:13: literals= tupleOfTupleLiterals
									{
									pushFollow(FOLLOW_tupleOfTupleLiterals_in_relation12388);
									literals=tupleOfTupleLiterals();
									state._fsp--;
									if (state.failed) return;
									if ( state.backtracking==0 ) {
									                  clauses.add(MultiColumnRelation.createInRelation(ids, literals));
									              }
									}
									break;
								case 4 :
									// Parser.g:1637:13: markers= tupleOfMarkersForTuples
									{
									pushFollow(FOLLOW_tupleOfMarkersForTuples_in_relation12422);
									markers=tupleOfMarkersForTuples();
									state._fsp--;
									if (state.failed) return;
									if ( state.backtracking==0 ) { clauses.add(MultiColumnRelation.createInRelation(ids, markers)); }
									}
									break;

							}

							}
							break;
						case 2 :
							// Parser.g:1640:9: type= relationType literal= tupleLiteral
							{
							pushFollow(FOLLOW_relationType_in_relation12464);
							type=relationType();
							state._fsp--;
							if (state.failed) return;
							pushFollow(FOLLOW_tupleLiteral_in_relation12468);
							literal=tupleLiteral();
							state._fsp--;
							if (state.failed) return;
							if ( state.backtracking==0 ) {
							              clauses.add(MultiColumnRelation.createNonInRelation(ids, type, literal));
							          }
							}
							break;
						case 3 :
							// Parser.g:1644:9: type= relationType tupleMarker= markerForTuple
							{
							pushFollow(FOLLOW_relationType_in_relation12494);
							type=relationType();
							state._fsp--;
							if (state.failed) return;
							pushFollow(FOLLOW_markerForTuple_in_relation12498);
							tupleMarker=markerForTuple();
							state._fsp--;
							if (state.failed) return;
							if ( state.backtracking==0 ) { clauses.add(MultiColumnRelation.createNonInRelation(ids, type, tupleMarker)); }
							}
							break;

					}

					}
					break;
				case 10 :
					// Parser.g:1647:7: '(' relation[$clauses] ')'
					{
					match(input,187,FOLLOW_187_in_relation12528); if (state.failed) return;
					pushFollow(FOLLOW_relation_in_relation12530);
					relation(clauses);
					state._fsp--;
					if (state.failed) return;
					match(input,188,FOLLOW_188_in_relation12533); if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "relation"



	// $ANTLR start "containsOperator"
	// Parser.g:1650:1: containsOperator returns [Operator o] : K_CONTAINS ( K_KEY )? ;
	public final Operator containsOperator() throws RecognitionException {
		Operator o = null;


		try {
			// Parser.g:1651:5: ( K_CONTAINS ( K_KEY )? )
			// Parser.g:1651:7: K_CONTAINS ( K_KEY )?
			{
			match(input,K_CONTAINS,FOLLOW_K_CONTAINS_in_containsOperator12554); if (state.failed) return o;
			if ( state.backtracking==0 ) { o = Operator.CONTAINS; }
			// Parser.g:1651:45: ( K_KEY )?
			int alt215=2;
			int LA215_0 = input.LA(1);
			if ( (LA215_0==K_KEY) ) {
				int LA215_1 = input.LA(2);
				if ( (LA215_1==BOOLEAN||LA215_1==DURATION||LA215_1==FLOAT||LA215_1==HEXNUMBER||(LA215_1 >= IDENT && LA215_1 <= INTEGER)||(LA215_1 >= K_AGGREGATE && LA215_1 <= K_ALL)||LA215_1==K_AS||LA215_1==K_ASCII||(LA215_1 >= K_BIGINT && LA215_1 <= K_BOOLEAN)||(LA215_1 >= K_CALLED && LA215_1 <= K_CLUSTERING)||(LA215_1 >= K_COMPACT && LA215_1 <= K_COUNTER)||(LA215_1 >= K_CUSTOM && LA215_1 <= K_DECIMAL)||(LA215_1 >= K_DISTINCT && LA215_1 <= K_DOUBLE)||LA215_1==K_DURATION||(LA215_1 >= K_EXISTS && LA215_1 <= K_FLOAT)||LA215_1==K_FROZEN||(LA215_1 >= K_FUNCTION && LA215_1 <= K_FUNCTIONS)||LA215_1==K_GROUP||(LA215_1 >= K_INET && LA215_1 <= K_INPUT)||LA215_1==K_INT||(LA215_1 >= K_JSON && LA215_1 <= K_KEYS)||(LA215_1 >= K_KEYSPACES && LA215_1 <= K_LIKE)||(LA215_1 >= K_LIST && LA215_1 <= K_MAP)||(LA215_1 >= K_NEGATIVE_INFINITY && LA215_1 <= K_NOLOGIN)||LA215_1==K_NOSUPERUSER||LA215_1==K_NULL||LA215_1==K_OPTIONS||(LA215_1 >= K_PARTITION && LA215_1 <= K_POSITIVE_NAN)||LA215_1==K_RETURNS||(LA215_1 >= K_ROLE && LA215_1 <= K_ROLES)||(LA215_1 >= K_SFUNC && LA215_1 <= K_TINYINT)||(LA215_1 >= K_TOKEN && LA215_1 <= K_TRIGGER)||(LA215_1 >= K_TTL && LA215_1 <= K_TYPE)||(LA215_1 >= K_USER && LA215_1 <= K_USERS)||(LA215_1 >= K_UUID && LA215_1 <= K_VARINT)||LA215_1==K_WRITETIME||(LA215_1 >= QMARK && LA215_1 <= QUOTED_NAME)||LA215_1==STRING_LITERAL||LA215_1==UUID||LA215_1==187||LA215_1==192||LA215_1==196||LA215_1==203||LA215_1==207) ) {
					alt215=1;
				}
			}
			switch (alt215) {
				case 1 :
					// Parser.g:1651:46: K_KEY
					{
					match(input,K_KEY,FOLLOW_K_KEY_in_containsOperator12559); if (state.failed) return o;
					if ( state.backtracking==0 ) { o = Operator.CONTAINS_KEY; }
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return o;
	}
	// $ANTLR end "containsOperator"



	// $ANTLR start "inMarker"
	// Parser.g:1654:1: inMarker returns [AbstractMarker.INRaw marker] : ( QMARK | ':' name= noncol_ident );
	public final AbstractMarker.INRaw inMarker() throws RecognitionException {
		AbstractMarker.INRaw marker = null;


		ColumnIdentifier name =null;

		try {
			// Parser.g:1655:5: ( QMARK | ':' name= noncol_ident )
			int alt216=2;
			int LA216_0 = input.LA(1);
			if ( (LA216_0==QMARK) ) {
				alt216=1;
			}
			else if ( (LA216_0==196) ) {
				alt216=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return marker;}
				NoViableAltException nvae =
					new NoViableAltException("", 216, 0, input);
				throw nvae;
			}

			switch (alt216) {
				case 1 :
					// Parser.g:1655:7: QMARK
					{
					match(input,QMARK,FOLLOW_QMARK_in_inMarker12584); if (state.failed) return marker;
					if ( state.backtracking==0 ) { marker = newINBindVariables(null); }
					}
					break;
				case 2 :
					// Parser.g:1656:7: ':' name= noncol_ident
					{
					match(input,196,FOLLOW_196_in_inMarker12594); if (state.failed) return marker;
					pushFollow(FOLLOW_noncol_ident_in_inMarker12598);
					name=noncol_ident();
					state._fsp--;
					if (state.failed) return marker;
					if ( state.backtracking==0 ) { marker = newINBindVariables(name); }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return marker;
	}
	// $ANTLR end "inMarker"



	// $ANTLR start "tupleOfIdentifiers"
	// Parser.g:1659:1: tupleOfIdentifiers returns [List<ColumnMetadata.Raw> ids] : '(' n1= cident ( ',' ni= cident )* ')' ;
	public final List<ColumnMetadata.Raw> tupleOfIdentifiers() throws RecognitionException {
		List<ColumnMetadata.Raw> ids = null;


		ColumnMetadata.Raw n1 =null;
		ColumnMetadata.Raw ni =null;

		 ids = new ArrayList<ColumnMetadata.Raw>(); 
		try {
			// Parser.g:1661:5: ( '(' n1= cident ( ',' ni= cident )* ')' )
			// Parser.g:1661:7: '(' n1= cident ( ',' ni= cident )* ')'
			{
			match(input,187,FOLLOW_187_in_tupleOfIdentifiers12630); if (state.failed) return ids;
			pushFollow(FOLLOW_cident_in_tupleOfIdentifiers12634);
			n1=cident();
			state._fsp--;
			if (state.failed) return ids;
			if ( state.backtracking==0 ) { ids.add(n1); }
			// Parser.g:1661:39: ( ',' ni= cident )*
			loop217:
			while (true) {
				int alt217=2;
				int LA217_0 = input.LA(1);
				if ( (LA217_0==191) ) {
					alt217=1;
				}

				switch (alt217) {
				case 1 :
					// Parser.g:1661:40: ',' ni= cident
					{
					match(input,191,FOLLOW_191_in_tupleOfIdentifiers12639); if (state.failed) return ids;
					pushFollow(FOLLOW_cident_in_tupleOfIdentifiers12643);
					ni=cident();
					state._fsp--;
					if (state.failed) return ids;
					if ( state.backtracking==0 ) { ids.add(ni); }
					}
					break;

				default :
					break loop217;
				}
			}

			match(input,188,FOLLOW_188_in_tupleOfIdentifiers12649); if (state.failed) return ids;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return ids;
	}
	// $ANTLR end "tupleOfIdentifiers"



	// $ANTLR start "singleColumnInValues"
	// Parser.g:1664:1: singleColumnInValues returns [List<Term.Raw> terms] : '(' (t1= term ( ',' ti= term )* )? ')' ;
	public final List<Term.Raw> singleColumnInValues() throws RecognitionException {
		List<Term.Raw> terms = null;


		Term.Raw t1 =null;
		Term.Raw ti =null;

		 terms = new ArrayList<Term.Raw>(); 
		try {
			// Parser.g:1666:5: ( '(' (t1= term ( ',' ti= term )* )? ')' )
			// Parser.g:1666:7: '(' (t1= term ( ',' ti= term )* )? ')'
			{
			match(input,187,FOLLOW_187_in_singleColumnInValues12679); if (state.failed) return terms;
			// Parser.g:1666:11: (t1= term ( ',' ti= term )* )?
			int alt219=2;
			int LA219_0 = input.LA(1);
			if ( (LA219_0==BOOLEAN||LA219_0==DURATION||LA219_0==FLOAT||LA219_0==HEXNUMBER||(LA219_0 >= IDENT && LA219_0 <= INTEGER)||(LA219_0 >= K_AGGREGATE && LA219_0 <= K_ALL)||LA219_0==K_AS||LA219_0==K_ASCII||(LA219_0 >= K_BIGINT && LA219_0 <= K_BOOLEAN)||(LA219_0 >= K_CALLED && LA219_0 <= K_CLUSTERING)||(LA219_0 >= K_COMPACT && LA219_0 <= K_COUNTER)||(LA219_0 >= K_CUSTOM && LA219_0 <= K_DECIMAL)||(LA219_0 >= K_DISTINCT && LA219_0 <= K_DOUBLE)||LA219_0==K_DURATION||(LA219_0 >= K_EXISTS && LA219_0 <= K_FLOAT)||LA219_0==K_FROZEN||(LA219_0 >= K_FUNCTION && LA219_0 <= K_FUNCTIONS)||LA219_0==K_GROUP||(LA219_0 >= K_INET && LA219_0 <= K_INPUT)||LA219_0==K_INT||(LA219_0 >= K_JSON && LA219_0 <= K_KEYS)||(LA219_0 >= K_KEYSPACES && LA219_0 <= K_LIKE)||(LA219_0 >= K_LIST && LA219_0 <= K_MAP)||(LA219_0 >= K_NEGATIVE_INFINITY && LA219_0 <= K_NOLOGIN)||LA219_0==K_NOSUPERUSER||LA219_0==K_NULL||LA219_0==K_OPTIONS||(LA219_0 >= K_PARTITION && LA219_0 <= K_POSITIVE_NAN)||LA219_0==K_RETURNS||(LA219_0 >= K_ROLE && LA219_0 <= K_ROLES)||(LA219_0 >= K_SFUNC && LA219_0 <= K_TINYINT)||(LA219_0 >= K_TOKEN && LA219_0 <= K_TRIGGER)||(LA219_0 >= K_TTL && LA219_0 <= K_TYPE)||(LA219_0 >= K_USER && LA219_0 <= K_USERS)||(LA219_0 >= K_UUID && LA219_0 <= K_VARINT)||LA219_0==K_WRITETIME||(LA219_0 >= QMARK && LA219_0 <= QUOTED_NAME)||LA219_0==STRING_LITERAL||LA219_0==UUID||LA219_0==187||LA219_0==192||LA219_0==196||LA219_0==203||LA219_0==207) ) {
				alt219=1;
			}
			switch (alt219) {
				case 1 :
					// Parser.g:1666:13: t1= term ( ',' ti= term )*
					{
					pushFollow(FOLLOW_term_in_singleColumnInValues12687);
					t1=term();
					state._fsp--;
					if (state.failed) return terms;
					if ( state.backtracking==0 ) { terms.add(t1); }
					// Parser.g:1666:43: ( ',' ti= term )*
					loop218:
					while (true) {
						int alt218=2;
						int LA218_0 = input.LA(1);
						if ( (LA218_0==191) ) {
							alt218=1;
						}

						switch (alt218) {
						case 1 :
							// Parser.g:1666:44: ',' ti= term
							{
							match(input,191,FOLLOW_191_in_singleColumnInValues12692); if (state.failed) return terms;
							pushFollow(FOLLOW_term_in_singleColumnInValues12696);
							ti=term();
							state._fsp--;
							if (state.failed) return terms;
							if ( state.backtracking==0 ) { terms.add(ti); }
							}
							break;

						default :
							break loop218;
						}
					}

					}
					break;

			}

			match(input,188,FOLLOW_188_in_singleColumnInValues12705); if (state.failed) return terms;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return terms;
	}
	// $ANTLR end "singleColumnInValues"



	// $ANTLR start "tupleOfTupleLiterals"
	// Parser.g:1669:1: tupleOfTupleLiterals returns [List<Tuples.Literal> literals] : '(' t1= tupleLiteral ( ',' ti= tupleLiteral )* ')' ;
	public final List<Tuples.Literal> tupleOfTupleLiterals() throws RecognitionException {
		List<Tuples.Literal> literals = null;


		Tuples.Literal t1 =null;
		Tuples.Literal ti =null;

		 literals = new ArrayList<>(); 
		try {
			// Parser.g:1671:5: ( '(' t1= tupleLiteral ( ',' ti= tupleLiteral )* ')' )
			// Parser.g:1671:7: '(' t1= tupleLiteral ( ',' ti= tupleLiteral )* ')'
			{
			match(input,187,FOLLOW_187_in_tupleOfTupleLiterals12735); if (state.failed) return literals;
			pushFollow(FOLLOW_tupleLiteral_in_tupleOfTupleLiterals12739);
			t1=tupleLiteral();
			state._fsp--;
			if (state.failed) return literals;
			if ( state.backtracking==0 ) { literals.add(t1); }
			// Parser.g:1671:50: ( ',' ti= tupleLiteral )*
			loop220:
			while (true) {
				int alt220=2;
				int LA220_0 = input.LA(1);
				if ( (LA220_0==191) ) {
					alt220=1;
				}

				switch (alt220) {
				case 1 :
					// Parser.g:1671:51: ',' ti= tupleLiteral
					{
					match(input,191,FOLLOW_191_in_tupleOfTupleLiterals12744); if (state.failed) return literals;
					pushFollow(FOLLOW_tupleLiteral_in_tupleOfTupleLiterals12748);
					ti=tupleLiteral();
					state._fsp--;
					if (state.failed) return literals;
					if ( state.backtracking==0 ) { literals.add(ti); }
					}
					break;

				default :
					break loop220;
				}
			}

			match(input,188,FOLLOW_188_in_tupleOfTupleLiterals12754); if (state.failed) return literals;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return literals;
	}
	// $ANTLR end "tupleOfTupleLiterals"



	// $ANTLR start "markerForTuple"
	// Parser.g:1674:1: markerForTuple returns [Tuples.Raw marker] : ( QMARK | ':' name= noncol_ident );
	public final Tuples.Raw markerForTuple() throws RecognitionException {
		Tuples.Raw marker = null;


		ColumnIdentifier name =null;

		try {
			// Parser.g:1675:5: ( QMARK | ':' name= noncol_ident )
			int alt221=2;
			int LA221_0 = input.LA(1);
			if ( (LA221_0==QMARK) ) {
				alt221=1;
			}
			else if ( (LA221_0==196) ) {
				alt221=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return marker;}
				NoViableAltException nvae =
					new NoViableAltException("", 221, 0, input);
				throw nvae;
			}

			switch (alt221) {
				case 1 :
					// Parser.g:1675:7: QMARK
					{
					match(input,QMARK,FOLLOW_QMARK_in_markerForTuple12775); if (state.failed) return marker;
					if ( state.backtracking==0 ) { marker = newTupleBindVariables(null); }
					}
					break;
				case 2 :
					// Parser.g:1676:7: ':' name= noncol_ident
					{
					match(input,196,FOLLOW_196_in_markerForTuple12785); if (state.failed) return marker;
					pushFollow(FOLLOW_noncol_ident_in_markerForTuple12789);
					name=noncol_ident();
					state._fsp--;
					if (state.failed) return marker;
					if ( state.backtracking==0 ) { marker = newTupleBindVariables(name); }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return marker;
	}
	// $ANTLR end "markerForTuple"



	// $ANTLR start "tupleOfMarkersForTuples"
	// Parser.g:1679:1: tupleOfMarkersForTuples returns [List<Tuples.Raw> markers] : '(' m1= markerForTuple ( ',' mi= markerForTuple )* ')' ;
	public final List<Tuples.Raw> tupleOfMarkersForTuples() throws RecognitionException {
		List<Tuples.Raw> markers = null;


		Tuples.Raw m1 =null;
		Tuples.Raw mi =null;

		 markers = new ArrayList<Tuples.Raw>(); 
		try {
			// Parser.g:1681:5: ( '(' m1= markerForTuple ( ',' mi= markerForTuple )* ')' )
			// Parser.g:1681:7: '(' m1= markerForTuple ( ',' mi= markerForTuple )* ')'
			{
			match(input,187,FOLLOW_187_in_tupleOfMarkersForTuples12821); if (state.failed) return markers;
			pushFollow(FOLLOW_markerForTuple_in_tupleOfMarkersForTuples12825);
			m1=markerForTuple();
			state._fsp--;
			if (state.failed) return markers;
			if ( state.backtracking==0 ) { markers.add(m1); }
			// Parser.g:1681:51: ( ',' mi= markerForTuple )*
			loop222:
			while (true) {
				int alt222=2;
				int LA222_0 = input.LA(1);
				if ( (LA222_0==191) ) {
					alt222=1;
				}

				switch (alt222) {
				case 1 :
					// Parser.g:1681:52: ',' mi= markerForTuple
					{
					match(input,191,FOLLOW_191_in_tupleOfMarkersForTuples12830); if (state.failed) return markers;
					pushFollow(FOLLOW_markerForTuple_in_tupleOfMarkersForTuples12834);
					mi=markerForTuple();
					state._fsp--;
					if (state.failed) return markers;
					if ( state.backtracking==0 ) { markers.add(mi); }
					}
					break;

				default :
					break loop222;
				}
			}

			match(input,188,FOLLOW_188_in_tupleOfMarkersForTuples12840); if (state.failed) return markers;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return markers;
	}
	// $ANTLR end "tupleOfMarkersForTuples"



	// $ANTLR start "inMarkerForTuple"
	// Parser.g:1684:1: inMarkerForTuple returns [Tuples.INRaw marker] : ( QMARK | ':' name= noncol_ident );
	public final Tuples.INRaw inMarkerForTuple() throws RecognitionException {
		Tuples.INRaw marker = null;


		ColumnIdentifier name =null;

		try {
			// Parser.g:1685:5: ( QMARK | ':' name= noncol_ident )
			int alt223=2;
			int LA223_0 = input.LA(1);
			if ( (LA223_0==QMARK) ) {
				alt223=1;
			}
			else if ( (LA223_0==196) ) {
				alt223=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return marker;}
				NoViableAltException nvae =
					new NoViableAltException("", 223, 0, input);
				throw nvae;
			}

			switch (alt223) {
				case 1 :
					// Parser.g:1685:7: QMARK
					{
					match(input,QMARK,FOLLOW_QMARK_in_inMarkerForTuple12861); if (state.failed) return marker;
					if ( state.backtracking==0 ) { marker = newTupleINBindVariables(null); }
					}
					break;
				case 2 :
					// Parser.g:1686:7: ':' name= noncol_ident
					{
					match(input,196,FOLLOW_196_in_inMarkerForTuple12871); if (state.failed) return marker;
					pushFollow(FOLLOW_noncol_ident_in_inMarkerForTuple12875);
					name=noncol_ident();
					state._fsp--;
					if (state.failed) return marker;
					if ( state.backtracking==0 ) { marker = newTupleINBindVariables(name); }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return marker;
	}
	// $ANTLR end "inMarkerForTuple"



	// $ANTLR start "comparatorType"
	// Parser.g:1689:1: comparatorType returns [CQL3Type.Raw t] : (n= native_type |c= collection_type |tt= tuple_type |id= userTypeName | K_FROZEN '<' f= comparatorType '>' |s= STRING_LITERAL );
	public final CQL3Type.Raw comparatorType() throws RecognitionException {
		CQL3Type.Raw t = null;


		Token s=null;
		CQL3Type n =null;
		CQL3Type.Raw c =null;
		CQL3Type.Raw tt =null;
		UTName id =null;
		CQL3Type.Raw f =null;

		try {
			// Parser.g:1690:5: (n= native_type |c= collection_type |tt= tuple_type |id= userTypeName | K_FROZEN '<' f= comparatorType '>' |s= STRING_LITERAL )
			int alt224=6;
			alt224 = dfa224.predict(input);
			switch (alt224) {
				case 1 :
					// Parser.g:1690:7: n= native_type
					{
					pushFollow(FOLLOW_native_type_in_comparatorType12900);
					n=native_type();
					state._fsp--;
					if (state.failed) return t;
					if ( state.backtracking==0 ) { t = CQL3Type.Raw.from(n); }
					}
					break;
				case 2 :
					// Parser.g:1691:7: c= collection_type
					{
					pushFollow(FOLLOW_collection_type_in_comparatorType12916);
					c=collection_type();
					state._fsp--;
					if (state.failed) return t;
					if ( state.backtracking==0 ) { t = c; }
					}
					break;
				case 3 :
					// Parser.g:1692:7: tt= tuple_type
					{
					pushFollow(FOLLOW_tuple_type_in_comparatorType12928);
					tt=tuple_type();
					state._fsp--;
					if (state.failed) return t;
					if ( state.backtracking==0 ) { t = tt; }
					}
					break;
				case 4 :
					// Parser.g:1693:7: id= userTypeName
					{
					pushFollow(FOLLOW_userTypeName_in_comparatorType12944);
					id=userTypeName();
					state._fsp--;
					if (state.failed) return t;
					if ( state.backtracking==0 ) { t = CQL3Type.Raw.userType(id); }
					}
					break;
				case 5 :
					// Parser.g:1694:7: K_FROZEN '<' f= comparatorType '>'
					{
					match(input,K_FROZEN,FOLLOW_K_FROZEN_in_comparatorType12956); if (state.failed) return t;
					match(input,198,FOLLOW_198_in_comparatorType12958); if (state.failed) return t;
					pushFollow(FOLLOW_comparatorType_in_comparatorType12962);
					f=comparatorType();
					state._fsp--;
					if (state.failed) return t;
					match(input,201,FOLLOW_201_in_comparatorType12964); if (state.failed) return t;
					if ( state.backtracking==0 ) {
					        try {
					            t = CQL3Type.Raw.frozen(f);
					        } catch (InvalidRequestException e) {
					            addRecognitionError(e.getMessage());
					        }
					      }
					}
					break;
				case 6 :
					// Parser.g:1702:7: s= STRING_LITERAL
					{
					s=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_comparatorType12982); if (state.failed) return t;
					if ( state.backtracking==0 ) {
					        try {
					            t = CQL3Type.Raw.from(new CQL3Type.Custom((s!=null?s.getText():null)));
					        } catch (SyntaxException e) {
					            addRecognitionError("Cannot parse type " + (s!=null?s.getText():null) + ": " + e.getMessage());
					        } catch (ConfigurationException e) {
					            addRecognitionError("Error setting type " + (s!=null?s.getText():null) + ": " + e.getMessage());
					        }
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
			// do for sure before leaving
		}
		return t;
	}
	// $ANTLR end "comparatorType"



	// $ANTLR start "native_type"
	// Parser.g:1714:1: native_type returns [CQL3Type t] : ( K_ASCII | K_BIGINT | K_BLOB | K_BOOLEAN | K_COUNTER | K_DECIMAL | K_DOUBLE | K_DURATION | K_FLOAT | K_INET | K_INT | K_SMALLINT | K_TEXT | K_TIMESTAMP | K_TINYINT | K_UUID | K_VARCHAR | K_VARINT | K_TIMEUUID | K_DATE | K_TIME );
	public final CQL3Type native_type() throws RecognitionException {
		CQL3Type t = null;


		try {
			// Parser.g:1715:5: ( K_ASCII | K_BIGINT | K_BLOB | K_BOOLEAN | K_COUNTER | K_DECIMAL | K_DOUBLE | K_DURATION | K_FLOAT | K_INET | K_INT | K_SMALLINT | K_TEXT | K_TIMESTAMP | K_TINYINT | K_UUID | K_VARCHAR | K_VARINT | K_TIMEUUID | K_DATE | K_TIME )
			int alt225=21;
			switch ( input.LA(1) ) {
			case K_ASCII:
				{
				alt225=1;
				}
				break;
			case K_BIGINT:
				{
				alt225=2;
				}
				break;
			case K_BLOB:
				{
				alt225=3;
				}
				break;
			case K_BOOLEAN:
				{
				alt225=4;
				}
				break;
			case K_COUNTER:
				{
				alt225=5;
				}
				break;
			case K_DECIMAL:
				{
				alt225=6;
				}
				break;
			case K_DOUBLE:
				{
				alt225=7;
				}
				break;
			case K_DURATION:
				{
				alt225=8;
				}
				break;
			case K_FLOAT:
				{
				alt225=9;
				}
				break;
			case K_INET:
				{
				alt225=10;
				}
				break;
			case K_INT:
				{
				alt225=11;
				}
				break;
			case K_SMALLINT:
				{
				alt225=12;
				}
				break;
			case K_TEXT:
				{
				alt225=13;
				}
				break;
			case K_TIMESTAMP:
				{
				alt225=14;
				}
				break;
			case K_TINYINT:
				{
				alt225=15;
				}
				break;
			case K_UUID:
				{
				alt225=16;
				}
				break;
			case K_VARCHAR:
				{
				alt225=17;
				}
				break;
			case K_VARINT:
				{
				alt225=18;
				}
				break;
			case K_TIMEUUID:
				{
				alt225=19;
				}
				break;
			case K_DATE:
				{
				alt225=20;
				}
				break;
			case K_TIME:
				{
				alt225=21;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return t;}
				NoViableAltException nvae =
					new NoViableAltException("", 225, 0, input);
				throw nvae;
			}
			switch (alt225) {
				case 1 :
					// Parser.g:1715:7: K_ASCII
					{
					match(input,K_ASCII,FOLLOW_K_ASCII_in_native_type13011); if (state.failed) return t;
					if ( state.backtracking==0 ) { t = CQL3Type.Native.ASCII; }
					}
					break;
				case 2 :
					// Parser.g:1716:7: K_BIGINT
					{
					match(input,K_BIGINT,FOLLOW_K_BIGINT_in_native_type13025); if (state.failed) return t;
					if ( state.backtracking==0 ) { t = CQL3Type.Native.BIGINT; }
					}
					break;
				case 3 :
					// Parser.g:1717:7: K_BLOB
					{
					match(input,K_BLOB,FOLLOW_K_BLOB_in_native_type13038); if (state.failed) return t;
					if ( state.backtracking==0 ) { t = CQL3Type.Native.BLOB; }
					}
					break;
				case 4 :
					// Parser.g:1718:7: K_BOOLEAN
					{
					match(input,K_BOOLEAN,FOLLOW_K_BOOLEAN_in_native_type13053); if (state.failed) return t;
					if ( state.backtracking==0 ) { t = CQL3Type.Native.BOOLEAN; }
					}
					break;
				case 5 :
					// Parser.g:1719:7: K_COUNTER
					{
					match(input,K_COUNTER,FOLLOW_K_COUNTER_in_native_type13065); if (state.failed) return t;
					if ( state.backtracking==0 ) { t = CQL3Type.Native.COUNTER; }
					}
					break;
				case 6 :
					// Parser.g:1720:7: K_DECIMAL
					{
					match(input,K_DECIMAL,FOLLOW_K_DECIMAL_in_native_type13077); if (state.failed) return t;
					if ( state.backtracking==0 ) { t = CQL3Type.Native.DECIMAL; }
					}
					break;
				case 7 :
					// Parser.g:1721:7: K_DOUBLE
					{
					match(input,K_DOUBLE,FOLLOW_K_DOUBLE_in_native_type13089); if (state.failed) return t;
					if ( state.backtracking==0 ) { t = CQL3Type.Native.DOUBLE; }
					}
					break;
				case 8 :
					// Parser.g:1722:7: K_DURATION
					{
					match(input,K_DURATION,FOLLOW_K_DURATION_in_native_type13102); if (state.failed) return t;
					if ( state.backtracking==0 ) { t = CQL3Type.Native.DURATION; }
					}
					break;
				case 9 :
					// Parser.g:1723:7: K_FLOAT
					{
					match(input,K_FLOAT,FOLLOW_K_FLOAT_in_native_type13115); if (state.failed) return t;
					if ( state.backtracking==0 ) { t = CQL3Type.Native.FLOAT; }
					}
					break;
				case 10 :
					// Parser.g:1724:7: K_INET
					{
					match(input,K_INET,FOLLOW_K_INET_in_native_type13129); if (state.failed) return t;
					if ( state.backtracking==0 ) { t = CQL3Type.Native.INET;}
					}
					break;
				case 11 :
					// Parser.g:1725:7: K_INT
					{
					match(input,K_INT,FOLLOW_K_INT_in_native_type13144); if (state.failed) return t;
					if ( state.backtracking==0 ) { t = CQL3Type.Native.INT; }
					}
					break;
				case 12 :
					// Parser.g:1726:7: K_SMALLINT
					{
					match(input,K_SMALLINT,FOLLOW_K_SMALLINT_in_native_type13160); if (state.failed) return t;
					if ( state.backtracking==0 ) { t = CQL3Type.Native.SMALLINT; }
					}
					break;
				case 13 :
					// Parser.g:1727:7: K_TEXT
					{
					match(input,K_TEXT,FOLLOW_K_TEXT_in_native_type13171); if (state.failed) return t;
					if ( state.backtracking==0 ) { t = CQL3Type.Native.TEXT; }
					}
					break;
				case 14 :
					// Parser.g:1728:7: K_TIMESTAMP
					{
					match(input,K_TIMESTAMP,FOLLOW_K_TIMESTAMP_in_native_type13186); if (state.failed) return t;
					if ( state.backtracking==0 ) { t = CQL3Type.Native.TIMESTAMP; }
					}
					break;
				case 15 :
					// Parser.g:1729:7: K_TINYINT
					{
					match(input,K_TINYINT,FOLLOW_K_TINYINT_in_native_type13196); if (state.failed) return t;
					if ( state.backtracking==0 ) { t = CQL3Type.Native.TINYINT; }
					}
					break;
				case 16 :
					// Parser.g:1730:7: K_UUID
					{
					match(input,K_UUID,FOLLOW_K_UUID_in_native_type13208); if (state.failed) return t;
					if ( state.backtracking==0 ) { t = CQL3Type.Native.UUID; }
					}
					break;
				case 17 :
					// Parser.g:1731:7: K_VARCHAR
					{
					match(input,K_VARCHAR,FOLLOW_K_VARCHAR_in_native_type13223); if (state.failed) return t;
					if ( state.backtracking==0 ) { t = CQL3Type.Native.VARCHAR; }
					}
					break;
				case 18 :
					// Parser.g:1732:7: K_VARINT
					{
					match(input,K_VARINT,FOLLOW_K_VARINT_in_native_type13235); if (state.failed) return t;
					if ( state.backtracking==0 ) { t = CQL3Type.Native.VARINT; }
					}
					break;
				case 19 :
					// Parser.g:1733:7: K_TIMEUUID
					{
					match(input,K_TIMEUUID,FOLLOW_K_TIMEUUID_in_native_type13248); if (state.failed) return t;
					if ( state.backtracking==0 ) { t = CQL3Type.Native.TIMEUUID; }
					}
					break;
				case 20 :
					// Parser.g:1734:7: K_DATE
					{
					match(input,K_DATE,FOLLOW_K_DATE_in_native_type13259); if (state.failed) return t;
					if ( state.backtracking==0 ) { t = CQL3Type.Native.DATE; }
					}
					break;
				case 21 :
					// Parser.g:1735:7: K_TIME
					{
					match(input,K_TIME,FOLLOW_K_TIME_in_native_type13274); if (state.failed) return t;
					if ( state.backtracking==0 ) { t = CQL3Type.Native.TIME; }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return t;
	}
	// $ANTLR end "native_type"



	// $ANTLR start "collection_type"
	// Parser.g:1738:1: collection_type returns [CQL3Type.Raw pt] : ( K_MAP '<' t1= comparatorType ',' t2= comparatorType '>' | K_LIST '<' t= comparatorType '>' | K_SET '<' t= comparatorType '>' );
	public final CQL3Type.Raw collection_type() throws RecognitionException {
		CQL3Type.Raw pt = null;


		CQL3Type.Raw t1 =null;
		CQL3Type.Raw t2 =null;
		CQL3Type.Raw t =null;

		try {
			// Parser.g:1739:5: ( K_MAP '<' t1= comparatorType ',' t2= comparatorType '>' | K_LIST '<' t= comparatorType '>' | K_SET '<' t= comparatorType '>' )
			int alt226=3;
			switch ( input.LA(1) ) {
			case K_MAP:
				{
				alt226=1;
				}
				break;
			case K_LIST:
				{
				alt226=2;
				}
				break;
			case K_SET:
				{
				alt226=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return pt;}
				NoViableAltException nvae =
					new NoViableAltException("", 226, 0, input);
				throw nvae;
			}
			switch (alt226) {
				case 1 :
					// Parser.g:1739:7: K_MAP '<' t1= comparatorType ',' t2= comparatorType '>'
					{
					match(input,K_MAP,FOLLOW_K_MAP_in_collection_type13302); if (state.failed) return pt;
					match(input,198,FOLLOW_198_in_collection_type13305); if (state.failed) return pt;
					pushFollow(FOLLOW_comparatorType_in_collection_type13309);
					t1=comparatorType();
					state._fsp--;
					if (state.failed) return pt;
					match(input,191,FOLLOW_191_in_collection_type13311); if (state.failed) return pt;
					pushFollow(FOLLOW_comparatorType_in_collection_type13315);
					t2=comparatorType();
					state._fsp--;
					if (state.failed) return pt;
					match(input,201,FOLLOW_201_in_collection_type13317); if (state.failed) return pt;
					if ( state.backtracking==0 ) {
					            // if we can't parse either t1 or t2, antlr will "recover" and we may have t1 or t2 null.
					            if (t1 != null && t2 != null)
					                pt = CQL3Type.Raw.map(t1, t2);
					        }
					}
					break;
				case 2 :
					// Parser.g:1745:7: K_LIST '<' t= comparatorType '>'
					{
					match(input,K_LIST,FOLLOW_K_LIST_in_collection_type13335); if (state.failed) return pt;
					match(input,198,FOLLOW_198_in_collection_type13337); if (state.failed) return pt;
					pushFollow(FOLLOW_comparatorType_in_collection_type13341);
					t=comparatorType();
					state._fsp--;
					if (state.failed) return pt;
					match(input,201,FOLLOW_201_in_collection_type13343); if (state.failed) return pt;
					if ( state.backtracking==0 ) { if (t != null) pt = CQL3Type.Raw.list(t); }
					}
					break;
				case 3 :
					// Parser.g:1747:7: K_SET '<' t= comparatorType '>'
					{
					match(input,K_SET,FOLLOW_K_SET_in_collection_type13361); if (state.failed) return pt;
					match(input,198,FOLLOW_198_in_collection_type13364); if (state.failed) return pt;
					pushFollow(FOLLOW_comparatorType_in_collection_type13368);
					t=comparatorType();
					state._fsp--;
					if (state.failed) return pt;
					match(input,201,FOLLOW_201_in_collection_type13370); if (state.failed) return pt;
					if ( state.backtracking==0 ) { if (t != null) pt = CQL3Type.Raw.set(t); }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return pt;
	}
	// $ANTLR end "collection_type"



	// $ANTLR start "tuple_type"
	// Parser.g:1751:1: tuple_type returns [CQL3Type.Raw t] : K_TUPLE '<' t1= comparatorType ( ',' tn= comparatorType )* '>' ;
	public final CQL3Type.Raw tuple_type() throws RecognitionException {
		CQL3Type.Raw t = null;


		CQL3Type.Raw t1 =null;
		CQL3Type.Raw tn =null;

		List<CQL3Type.Raw> types = new ArrayList<>();
		try {
			// Parser.g:1754:5: ( K_TUPLE '<' t1= comparatorType ( ',' tn= comparatorType )* '>' )
			// Parser.g:1754:7: K_TUPLE '<' t1= comparatorType ( ',' tn= comparatorType )* '>'
			{
			match(input,K_TUPLE,FOLLOW_K_TUPLE_in_tuple_type13419); if (state.failed) return t;
			match(input,198,FOLLOW_198_in_tuple_type13421); if (state.failed) return t;
			pushFollow(FOLLOW_comparatorType_in_tuple_type13425);
			t1=comparatorType();
			state._fsp--;
			if (state.failed) return t;
			if ( state.backtracking==0 ) { types.add(t1); }
			// Parser.g:1754:56: ( ',' tn= comparatorType )*
			loop227:
			while (true) {
				int alt227=2;
				int LA227_0 = input.LA(1);
				if ( (LA227_0==191) ) {
					alt227=1;
				}

				switch (alt227) {
				case 1 :
					// Parser.g:1754:57: ',' tn= comparatorType
					{
					match(input,191,FOLLOW_191_in_tuple_type13430); if (state.failed) return t;
					pushFollow(FOLLOW_comparatorType_in_tuple_type13434);
					tn=comparatorType();
					state._fsp--;
					if (state.failed) return t;
					if ( state.backtracking==0 ) { types.add(tn); }
					}
					break;

				default :
					break loop227;
				}
			}

			match(input,201,FOLLOW_201_in_tuple_type13440); if (state.failed) return t;
			}

			if ( state.backtracking==0 ) {t = CQL3Type.Raw.tuple(types);}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return t;
	}
	// $ANTLR end "tuple_type"


	public static class username_return extends ParserRuleReturnScope {
	};


	// $ANTLR start "username"
	// Parser.g:1757:1: username : ( IDENT | STRING_LITERAL | QUOTED_NAME );
	public final Cql_Parser.username_return username() throws RecognitionException {
		Cql_Parser.username_return retval = new Cql_Parser.username_return();
		retval.start = input.LT(1);

		try {
			// Parser.g:1758:5: ( IDENT | STRING_LITERAL | QUOTED_NAME )
			int alt228=3;
			switch ( input.LA(1) ) {
			case IDENT:
				{
				alt228=1;
				}
				break;
			case STRING_LITERAL:
				{
				alt228=2;
				}
				break;
			case QUOTED_NAME:
				{
				alt228=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 228, 0, input);
				throw nvae;
			}
			switch (alt228) {
				case 1 :
					// Parser.g:1758:7: IDENT
					{
					match(input,IDENT,FOLLOW_IDENT_in_username13457); if (state.failed) return retval;
					}
					break;
				case 2 :
					// Parser.g:1759:7: STRING_LITERAL
					{
					match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_username13465); if (state.failed) return retval;
					}
					break;
				case 3 :
					// Parser.g:1760:7: QUOTED_NAME
					{
					match(input,QUOTED_NAME,FOLLOW_QUOTED_NAME_in_username13473); if (state.failed) return retval;
					if ( state.backtracking==0 ) { addRecognitionError("Quoted strings are are not supported for user names and USER is deprecated, please use ROLE");}
					}
					break;

			}
			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "username"


	public static class mbean_return extends ParserRuleReturnScope {
	};


	// $ANTLR start "mbean"
	// Parser.g:1763:1: mbean : STRING_LITERAL ;
	public final Cql_Parser.mbean_return mbean() throws RecognitionException {
		Cql_Parser.mbean_return retval = new Cql_Parser.mbean_return();
		retval.start = input.LT(1);

		try {
			// Parser.g:1764:5: ( STRING_LITERAL )
			// Parser.g:1764:7: STRING_LITERAL
			{
			match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_mbean13492); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "mbean"



	// $ANTLR start "non_type_ident"
	// Parser.g:1769:1: non_type_ident returns [ColumnIdentifier id] : (t= IDENT |t= QUOTED_NAME |k= basic_unreserved_keyword |kk= K_KEY );
	public final ColumnIdentifier non_type_ident() throws RecognitionException {
		ColumnIdentifier id = null;


		Token t=null;
		Token kk=null;
		String k =null;

		try {
			// Parser.g:1770:5: (t= IDENT |t= QUOTED_NAME |k= basic_unreserved_keyword |kk= K_KEY )
			int alt229=4;
			switch ( input.LA(1) ) {
			case IDENT:
				{
				alt229=1;
				}
				break;
			case QUOTED_NAME:
				{
				alt229=2;
				}
				break;
			case K_AGGREGATE:
			case K_ALL:
			case K_AS:
			case K_CALLED:
			case K_CLUSTERING:
			case K_COMPACT:
			case K_CONTAINS:
			case K_CUSTOM:
			case K_EXISTS:
			case K_FILTERING:
			case K_FINALFUNC:
			case K_FROZEN:
			case K_FUNCTION:
			case K_FUNCTIONS:
			case K_GROUP:
			case K_INITCOND:
			case K_INPUT:
			case K_KEYS:
			case K_KEYSPACES:
			case K_LANGUAGE:
			case K_LIKE:
			case K_LIST:
			case K_LOGIN:
			case K_MAP:
			case K_NOLOGIN:
			case K_NOSUPERUSER:
			case K_OPTIONS:
			case K_PARTITION:
			case K_PASSWORD:
			case K_PER:
			case K_PERMISSION:
			case K_PERMISSIONS:
			case K_RETURNS:
			case K_ROLE:
			case K_ROLES:
			case K_SFUNC:
			case K_STATIC:
			case K_STORAGE:
			case K_STYPE:
			case K_SUPERUSER:
			case K_TRIGGER:
			case K_TUPLE:
			case K_TYPE:
			case K_USER:
			case K_USERS:
			case K_VALUES:
				{
				alt229=3;
				}
				break;
			case K_KEY:
				{
				alt229=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return id;}
				NoViableAltException nvae =
					new NoViableAltException("", 229, 0, input);
				throw nvae;
			}
			switch (alt229) {
				case 1 :
					// Parser.g:1770:7: t= IDENT
					{
					t=(Token)match(input,IDENT,FOLLOW_IDENT_in_non_type_ident13517); if (state.failed) return id;
					if ( state.backtracking==0 ) { if (reservedTypeNames.contains((t!=null?t.getText():null))) addRecognitionError("Invalid (reserved) user type name " + (t!=null?t.getText():null)); id = new ColumnIdentifier((t!=null?t.getText():null), false); }
					}
					break;
				case 2 :
					// Parser.g:1771:7: t= QUOTED_NAME
					{
					t=(Token)match(input,QUOTED_NAME,FOLLOW_QUOTED_NAME_in_non_type_ident13548); if (state.failed) return id;
					if ( state.backtracking==0 ) { id = new ColumnIdentifier((t!=null?t.getText():null), true); }
					}
					break;
				case 3 :
					// Parser.g:1772:7: k= basic_unreserved_keyword
					{
					pushFollow(FOLLOW_basic_unreserved_keyword_in_non_type_ident13573);
					k=basic_unreserved_keyword();
					state._fsp--;
					if (state.failed) return id;
					if ( state.backtracking==0 ) { id = new ColumnIdentifier(k, false); }
					}
					break;
				case 4 :
					// Parser.g:1773:7: kk= K_KEY
					{
					kk=(Token)match(input,K_KEY,FOLLOW_K_KEY_in_non_type_ident13585); if (state.failed) return id;
					if ( state.backtracking==0 ) { id = new ColumnIdentifier((kk!=null?kk.getText():null), false); }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return id;
	}
	// $ANTLR end "non_type_ident"



	// $ANTLR start "unreserved_keyword"
	// Parser.g:1776:1: unreserved_keyword returns [String str] : (u= unreserved_function_keyword |k= ( K_TTL | K_COUNT | K_WRITETIME | K_KEY | K_CAST | K_JSON | K_DISTINCT ) );
	public final String unreserved_keyword() throws RecognitionException {
		String str = null;


		Token k=null;
		String u =null;

		try {
			// Parser.g:1777:5: (u= unreserved_function_keyword |k= ( K_TTL | K_COUNT | K_WRITETIME | K_KEY | K_CAST | K_JSON | K_DISTINCT ) )
			int alt230=2;
			int LA230_0 = input.LA(1);
			if ( ((LA230_0 >= K_AGGREGATE && LA230_0 <= K_ALL)||LA230_0==K_AS||LA230_0==K_ASCII||(LA230_0 >= K_BIGINT && LA230_0 <= K_BOOLEAN)||LA230_0==K_CALLED||LA230_0==K_CLUSTERING||(LA230_0 >= K_COMPACT && LA230_0 <= K_CONTAINS)||LA230_0==K_COUNTER||(LA230_0 >= K_CUSTOM && LA230_0 <= K_DECIMAL)||LA230_0==K_DOUBLE||LA230_0==K_DURATION||(LA230_0 >= K_EXISTS && LA230_0 <= K_FLOAT)||LA230_0==K_FROZEN||(LA230_0 >= K_FUNCTION && LA230_0 <= K_FUNCTIONS)||LA230_0==K_GROUP||(LA230_0 >= K_INET && LA230_0 <= K_INPUT)||LA230_0==K_INT||LA230_0==K_KEYS||(LA230_0 >= K_KEYSPACES && LA230_0 <= K_LIKE)||(LA230_0 >= K_LIST && LA230_0 <= K_MAP)||LA230_0==K_NOLOGIN||LA230_0==K_NOSUPERUSER||LA230_0==K_OPTIONS||(LA230_0 >= K_PARTITION && LA230_0 <= K_PERMISSIONS)||LA230_0==K_RETURNS||(LA230_0 >= K_ROLE && LA230_0 <= K_ROLES)||(LA230_0 >= K_SFUNC && LA230_0 <= K_TINYINT)||LA230_0==K_TRIGGER||(LA230_0 >= K_TUPLE && LA230_0 <= K_TYPE)||(LA230_0 >= K_USER && LA230_0 <= K_USERS)||(LA230_0 >= K_UUID && LA230_0 <= K_VARINT)) ) {
				alt230=1;
			}
			else if ( (LA230_0==K_CAST||LA230_0==K_COUNT||LA230_0==K_DISTINCT||(LA230_0 >= K_JSON && LA230_0 <= K_KEY)||LA230_0==K_TTL||LA230_0==K_WRITETIME) ) {
				alt230=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return str;}
				NoViableAltException nvae =
					new NoViableAltException("", 230, 0, input);
				throw nvae;
			}

			switch (alt230) {
				case 1 :
					// Parser.g:1777:7: u= unreserved_function_keyword
					{
					pushFollow(FOLLOW_unreserved_function_keyword_in_unreserved_keyword13628);
					u=unreserved_function_keyword();
					state._fsp--;
					if (state.failed) return str;
					if ( state.backtracking==0 ) { str = u; }
					}
					break;
				case 2 :
					// Parser.g:1778:7: k= ( K_TTL | K_COUNT | K_WRITETIME | K_KEY | K_CAST | K_JSON | K_DISTINCT )
					{
					k=input.LT(1);
					if ( input.LA(1)==K_CAST||input.LA(1)==K_COUNT||input.LA(1)==K_DISTINCT||(input.LA(1) >= K_JSON && input.LA(1) <= K_KEY)||input.LA(1)==K_TTL||input.LA(1)==K_WRITETIME ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return str;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					if ( state.backtracking==0 ) { str = (k!=null?k.getText():null); }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return str;
	}
	// $ANTLR end "unreserved_keyword"



	// $ANTLR start "unreserved_function_keyword"
	// Parser.g:1781:1: unreserved_function_keyword returns [String str] : (u= basic_unreserved_keyword |t= native_type );
	public final String unreserved_function_keyword() throws RecognitionException {
		String str = null;


		String u =null;
		CQL3Type t =null;

		try {
			// Parser.g:1782:5: (u= basic_unreserved_keyword |t= native_type )
			int alt231=2;
			int LA231_0 = input.LA(1);
			if ( ((LA231_0 >= K_AGGREGATE && LA231_0 <= K_ALL)||LA231_0==K_AS||LA231_0==K_CALLED||LA231_0==K_CLUSTERING||(LA231_0 >= K_COMPACT && LA231_0 <= K_CONTAINS)||LA231_0==K_CUSTOM||(LA231_0 >= K_EXISTS && LA231_0 <= K_FINALFUNC)||LA231_0==K_FROZEN||(LA231_0 >= K_FUNCTION && LA231_0 <= K_FUNCTIONS)||LA231_0==K_GROUP||(LA231_0 >= K_INITCOND && LA231_0 <= K_INPUT)||LA231_0==K_KEYS||(LA231_0 >= K_KEYSPACES && LA231_0 <= K_LIKE)||(LA231_0 >= K_LIST && LA231_0 <= K_MAP)||LA231_0==K_NOLOGIN||LA231_0==K_NOSUPERUSER||LA231_0==K_OPTIONS||(LA231_0 >= K_PARTITION && LA231_0 <= K_PERMISSIONS)||LA231_0==K_RETURNS||(LA231_0 >= K_ROLE && LA231_0 <= K_ROLES)||LA231_0==K_SFUNC||(LA231_0 >= K_STATIC && LA231_0 <= K_SUPERUSER)||LA231_0==K_TRIGGER||(LA231_0 >= K_TUPLE && LA231_0 <= K_TYPE)||(LA231_0 >= K_USER && LA231_0 <= K_USERS)||LA231_0==K_VALUES) ) {
				alt231=1;
			}
			else if ( (LA231_0==K_ASCII||(LA231_0 >= K_BIGINT && LA231_0 <= K_BOOLEAN)||LA231_0==K_COUNTER||(LA231_0 >= K_DATE && LA231_0 <= K_DECIMAL)||LA231_0==K_DOUBLE||LA231_0==K_DURATION||LA231_0==K_FLOAT||LA231_0==K_INET||LA231_0==K_INT||LA231_0==K_SMALLINT||(LA231_0 >= K_TEXT && LA231_0 <= K_TINYINT)||LA231_0==K_UUID||(LA231_0 >= K_VARCHAR && LA231_0 <= K_VARINT)) ) {
				alt231=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return str;}
				NoViableAltException nvae =
					new NoViableAltException("", 231, 0, input);
				throw nvae;
			}

			switch (alt231) {
				case 1 :
					// Parser.g:1782:7: u= basic_unreserved_keyword
					{
					pushFollow(FOLLOW_basic_unreserved_keyword_in_unreserved_function_keyword13695);
					u=basic_unreserved_keyword();
					state._fsp--;
					if (state.failed) return str;
					if ( state.backtracking==0 ) { str = u; }
					}
					break;
				case 2 :
					// Parser.g:1783:7: t= native_type
					{
					pushFollow(FOLLOW_native_type_in_unreserved_function_keyword13707);
					t=native_type();
					state._fsp--;
					if (state.failed) return str;
					if ( state.backtracking==0 ) { str = t.toString(); }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return str;
	}
	// $ANTLR end "unreserved_function_keyword"



	// $ANTLR start "basic_unreserved_keyword"
	// Parser.g:1786:1: basic_unreserved_keyword returns [String str] : k= ( K_KEYS | K_AS | K_CLUSTERING | K_COMPACT | K_STORAGE | K_TYPE | K_VALUES | K_MAP | K_LIST | K_FILTERING | K_PERMISSION | K_PERMISSIONS | K_KEYSPACES | K_ALL | K_USER | K_USERS | K_ROLE | K_ROLES | K_SUPERUSER | K_NOSUPERUSER | K_LOGIN | K_NOLOGIN | K_OPTIONS | K_PASSWORD | K_EXISTS | K_CUSTOM | K_TRIGGER | K_CONTAINS | K_STATIC | K_FROZEN | K_TUPLE | K_FUNCTION | K_FUNCTIONS | K_AGGREGATE | K_SFUNC | K_STYPE | K_FINALFUNC | K_INITCOND | K_RETURNS | K_LANGUAGE | K_CALLED | K_INPUT | K_LIKE | K_PER | K_PARTITION | K_GROUP ) ;
	public final String basic_unreserved_keyword() throws RecognitionException {
		String str = null;


		Token k=null;

		try {
			// Parser.g:1787:5: (k= ( K_KEYS | K_AS | K_CLUSTERING | K_COMPACT | K_STORAGE | K_TYPE | K_VALUES | K_MAP | K_LIST | K_FILTERING | K_PERMISSION | K_PERMISSIONS | K_KEYSPACES | K_ALL | K_USER | K_USERS | K_ROLE | K_ROLES | K_SUPERUSER | K_NOSUPERUSER | K_LOGIN | K_NOLOGIN | K_OPTIONS | K_PASSWORD | K_EXISTS | K_CUSTOM | K_TRIGGER | K_CONTAINS | K_STATIC | K_FROZEN | K_TUPLE | K_FUNCTION | K_FUNCTIONS | K_AGGREGATE | K_SFUNC | K_STYPE | K_FINALFUNC | K_INITCOND | K_RETURNS | K_LANGUAGE | K_CALLED | K_INPUT | K_LIKE | K_PER | K_PARTITION | K_GROUP ) )
			// Parser.g:1787:7: k= ( K_KEYS | K_AS | K_CLUSTERING | K_COMPACT | K_STORAGE | K_TYPE | K_VALUES | K_MAP | K_LIST | K_FILTERING | K_PERMISSION | K_PERMISSIONS | K_KEYSPACES | K_ALL | K_USER | K_USERS | K_ROLE | K_ROLES | K_SUPERUSER | K_NOSUPERUSER | K_LOGIN | K_NOLOGIN | K_OPTIONS | K_PASSWORD | K_EXISTS | K_CUSTOM | K_TRIGGER | K_CONTAINS | K_STATIC | K_FROZEN | K_TUPLE | K_FUNCTION | K_FUNCTIONS | K_AGGREGATE | K_SFUNC | K_STYPE | K_FINALFUNC | K_INITCOND | K_RETURNS | K_LANGUAGE | K_CALLED | K_INPUT | K_LIKE | K_PER | K_PARTITION | K_GROUP )
			{
			k=input.LT(1);
			if ( (input.LA(1) >= K_AGGREGATE && input.LA(1) <= K_ALL)||input.LA(1)==K_AS||input.LA(1)==K_CALLED||input.LA(1)==K_CLUSTERING||(input.LA(1) >= K_COMPACT && input.LA(1) <= K_CONTAINS)||input.LA(1)==K_CUSTOM||(input.LA(1) >= K_EXISTS && input.LA(1) <= K_FINALFUNC)||input.LA(1)==K_FROZEN||(input.LA(1) >= K_FUNCTION && input.LA(1) <= K_FUNCTIONS)||input.LA(1)==K_GROUP||(input.LA(1) >= K_INITCOND && input.LA(1) <= K_INPUT)||input.LA(1)==K_KEYS||(input.LA(1) >= K_KEYSPACES && input.LA(1) <= K_LIKE)||(input.LA(1) >= K_LIST && input.LA(1) <= K_MAP)||input.LA(1)==K_NOLOGIN||input.LA(1)==K_NOSUPERUSER||input.LA(1)==K_OPTIONS||(input.LA(1) >= K_PARTITION && input.LA(1) <= K_PERMISSIONS)||input.LA(1)==K_RETURNS||(input.LA(1) >= K_ROLE && input.LA(1) <= K_ROLES)||input.LA(1)==K_SFUNC||(input.LA(1) >= K_STATIC && input.LA(1) <= K_SUPERUSER)||input.LA(1)==K_TRIGGER||(input.LA(1) >= K_TUPLE && input.LA(1) <= K_TYPE)||(input.LA(1) >= K_USER && input.LA(1) <= K_USERS)||input.LA(1)==K_VALUES ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return str;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			if ( state.backtracking==0 ) { str = (k!=null?k.getText():null); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return str;
	}
	// $ANTLR end "basic_unreserved_keyword"

	// $ANTLR start synpred1_Parser
	public final void synpred1_Parser_fragment() throws RecognitionException {
		// Parser.g:275:9: ( K_JSON selectClause )
		// Parser.g:275:10: K_JSON selectClause
		{
		match(input,K_JSON,FOLLOW_K_JSON_in_synpred1_Parser1062); if (state.failed) return;
		pushFollow(FOLLOW_selectClause_in_synpred1_Parser1064);
		selectClause();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred1_Parser

	// $ANTLR start synpred2_Parser
	public final void synpred2_Parser_fragment() throws RecognitionException {
		// Parser.g:297:7: ( K_DISTINCT selectors )
		// Parser.g:297:8: K_DISTINCT selectors
		{
		match(input,K_DISTINCT,FOLLOW_K_DISTINCT_in_synpred2_Parser1265); if (state.failed) return;
		pushFollow(FOLLOW_selectors_in_synpred2_Parser1267);
		selectors();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred2_Parser

	// $ANTLR start synpred3_Parser
	public final void synpred3_Parser_fragment() throws RecognitionException {
		// Parser.g:331:7: ( selectionGroupWithField )
		// Parser.g:331:8: selectionGroupWithField
		{
		pushFollow(FOLLOW_selectionGroupWithField_in_synpred3_Parser1596);
		selectionGroupWithField();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred3_Parser

	// $ANTLR start synpred4_Parser
	public final void synpred4_Parser_fragment() throws RecognitionException {
		// Parser.g:365:7: ( selectionTypeHint )
		// Parser.g:365:8: selectionTypeHint
		{
		pushFollow(FOLLOW_selectionTypeHint_in_synpred4_Parser1883);
		selectionTypeHint();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred4_Parser

	// Delegated rules

	public final boolean synpred2_Parser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred2_Parser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred1_Parser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred1_Parser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred3_Parser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred3_Parser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred4_Parser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred4_Parser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}


	protected DFA1 dfa1 = new DFA1(this);
	protected DFA2 dfa2 = new DFA2(this);
	protected DFA11 dfa11 = new DFA11(this);
	protected DFA17 dfa17 = new DFA17(this);
	protected DFA22 dfa22 = new DFA22(this);
	protected DFA30 dfa30 = new DFA30(this);
	protected DFA31 dfa31 = new DFA31(this);
	protected DFA61 dfa61 = new DFA61(this);
	protected DFA170 dfa170 = new DFA170(this);
	protected DFA171 dfa171 = new DFA171(this);
	protected DFA189 dfa189 = new DFA189(this);
	protected DFA191 dfa191 = new DFA191(this);
	protected DFA193 dfa193 = new DFA193(this);
	protected DFA195 dfa195 = new DFA195(this);
	protected DFA198 dfa198 = new DFA198(this);
	protected DFA201 dfa201 = new DFA201(this);
	protected DFA209 dfa209 = new DFA209(this);
	protected DFA214 dfa214 = new DFA214(this);
	protected DFA213 dfa213 = new DFA213(this);
	protected DFA224 dfa224 = new DFA224(this);
	static final String DFA1_eotS =
		"\63\uffff";
	static final String DFA1_eofS =
		"\63\uffff";
	static final String DFA1_minS =
		"\1\36\7\uffff\2\33\1\56\2\26\1\34\10\uffff\1\172\22\uffff\1\155\2\uffff"+
		"\1\105\5\uffff\1\33";
	static final String DFA1_maxS =
		"\1\u0096\7\uffff\3\u0097\2\u00af\1\u0098\10\uffff\1\172\22\uffff\1\u008c"+
		"\2\uffff\1\165\5\uffff\1\110";
	static final String DFA1_acceptS =
		"\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\6\uffff\1\10\1\11\1\23\1\27\1\31"+
		"\1\40\1\46\1\12\1\uffff\1\34\1\36\1\13\1\14\1\15\1\25\1\30\1\33\1\35\1"+
		"\37\1\42\1\47\1\16\1\17\1\24\1\32\1\41\1\50\1\uffff\1\20\1\44\1\uffff"+
		"\1\21\1\45\1\26\1\43\1\22\1\uffff";
	static final String DFA1_specialS =
		"\63\uffff}>";
	static final String[] DFA1_transitionS = {
			"\1\12\7\uffff\1\4\14\uffff\1\10\4\uffff\1\5\4\uffff\1\11\14\uffff\1\13"+
			"\7\uffff\1\2\13\uffff\1\15\35\uffff\1\14\2\uffff\1\1\17\uffff\1\7\5\uffff"+
			"\1\3\1\6",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\30\22\uffff\1\17\5\uffff\1\25\23\uffff\1\27\5\uffff\1\25\12\uffff"+
			"\1\16\7\uffff\1\24\15\uffff\1\26\15\uffff\1\23\20\uffff\1\21\3\uffff"+
			"\1\22\4\uffff\1\20",
			"\1\40\22\uffff\1\32\31\uffff\1\37\5\uffff\1\33\12\uffff\1\31\7\uffff"+
			"\1\42\33\uffff\1\41\20\uffff\1\35\3\uffff\1\36\4\uffff\1\34",
			"\1\43\52\uffff\1\44\7\uffff\1\50\33\uffff\1\47\24\uffff\1\46\4\uffff"+
			"\1\45",
			"\1\53\4\uffff\1\53\1\51\1\uffff\1\52\2\uffff\1\53\1\uffff\1\53\1\52"+
			"\2\uffff\3\53\1\uffff\3\53\1\uffff\4\53\1\52\3\53\3\uffff\1\52\2\53\1"+
			"\52\1\53\1\uffff\1\52\4\53\1\uffff\1\53\1\uffff\2\53\1\uffff\1\53\3\uffff"+
			"\3\53\1\uffff\1\53\2\uffff\3\53\1\uffff\3\53\1\uffff\3\53\3\uffff\1\52"+
			"\2\uffff\1\53\1\uffff\1\53\4\uffff\1\53\2\uffff\5\53\5\uffff\1\53\1\uffff"+
			"\2\53\1\52\1\uffff\13\53\2\uffff\1\53\1\uffff\3\53\4\uffff\2\53\1\uffff"+
			"\4\53\3\uffff\1\53\10\uffff\2\53\3\uffff\1\53",
			"\1\56\4\uffff\1\56\1\54\1\uffff\1\55\2\uffff\1\56\1\uffff\1\56\1\55"+
			"\2\uffff\3\56\1\uffff\3\56\1\uffff\4\56\1\55\3\56\3\uffff\1\55\2\56\1"+
			"\55\1\56\1\uffff\1\55\4\56\1\uffff\1\56\1\uffff\2\56\1\uffff\1\56\3\uffff"+
			"\3\56\1\uffff\1\56\2\uffff\3\56\1\uffff\3\56\1\uffff\3\56\3\uffff\1\55"+
			"\2\uffff\1\56\1\uffff\1\56\4\uffff\1\56\2\uffff\5\56\5\uffff\1\56\1\uffff"+
			"\2\56\1\55\1\uffff\13\56\2\uffff\1\56\1\uffff\3\56\4\uffff\2\56\1\uffff"+
			"\4\56\3\uffff\1\56\10\uffff\2\56\3\uffff\1\56",
			"\1\61\1\uffff\1\61\5\uffff\1\61\16\uffff\1\61\6\uffff\1\61\2\uffff\1"+
			"\61\2\uffff\1\61\43\uffff\1\61\31\uffff\1\60\1\61\30\uffff\1\57",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\62",
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
			"",
			"",
			"",
			"",
			"",
			"\1\52\7\uffff\1\52\26\uffff\1\53",
			"",
			"",
			"\1\56\47\uffff\1\55\7\uffff\1\55",
			"",
			"",
			"",
			"",
			"",
			"\1\30\54\uffff\1\27"
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
			return "207:1: cqlStatement returns [ParsedStatement stmt] : (st1= selectStatement |st2= insertStatement |st3= updateStatement |st4= batchStatement |st5= deleteStatement |st6= useStatement |st7= truncateStatement |st8= createKeyspaceStatement |st9= createTableStatement |st10= createIndexStatement |st11= dropKeyspaceStatement |st12= dropTableStatement |st13= dropIndexStatement |st14= alterTableStatement |st15= alterKeyspaceStatement |st16= grantPermissionsStatement |st17= revokePermissionsStatement |st18= listPermissionsStatement |st19= createUserStatement |st20= alterUserStatement |st21= dropUserStatement |st22= listUsersStatement |st23= createTriggerStatement |st24= dropTriggerStatement |st25= createTypeStatement |st26= alterTypeStatement |st27= dropTypeStatement |st28= createFunctionStatement |st29= dropFunctionStatement |st30= createAggregateStatement |st31= dropAggregateStatement |st32= createRoleStatement |st33= alterRoleStatement |st34= dropRoleStatement |st35= listRolesStatement |st36= grantRoleStatement |st37= revokeRoleStatement |st38= createMaterializedViewStatement |st39= dropMaterializedViewStatement |st40= alterMaterializedViewStatement );";
		}
	}

	static final String DFA2_eotS =
		"\64\uffff";
	static final String DFA2_eofS =
		"\64\uffff";
	static final String DFA2_minS =
		"\1\6\1\0\62\uffff";
	static final String DFA2_maxS =
		"\1\u00cf\1\0\62\uffff";
	static final String DFA2_acceptS =
		"\2\uffff\1\2\60\uffff\1\1";
	static final String DFA2_specialS =
		"\1\uffff\1\0\62\uffff}>";
	static final String[] DFA2_transitionS = {
			"\1\2\4\uffff\1\2\4\uffff\1\2\3\uffff\1\2\1\uffff\2\2\3\uffff\2\2\4\uffff"+
			"\1\2\1\uffff\1\2\3\uffff\3\2\1\uffff\3\2\1\uffff\4\2\1\uffff\3\2\4\uffff"+
			"\2\2\1\uffff\1\2\2\uffff\4\2\1\uffff\1\2\1\uffff\2\2\1\uffff\1\2\3\uffff"+
			"\3\2\1\uffff\1\2\2\uffff\1\1\2\2\1\uffff\3\2\1\uffff\3\2\4\uffff\3\2"+
			"\1\uffff\1\2\1\uffff\1\2\2\uffff\1\2\2\uffff\7\2\3\uffff\1\2\1\uffff"+
			"\2\2\2\uffff\13\2\1\uffff\2\2\1\uffff\3\2\4\uffff\2\2\1\uffff\4\2\3\uffff"+
			"\1\2\10\uffff\2\2\3\uffff\1\2\2\uffff\1\2\10\uffff\1\2\4\uffff\1\2\3"+
			"\uffff\1\2\6\uffff\2\2\2\uffff\1\2",
			"\1\uffff",
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
			""
	};

	static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
	static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
	static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
	static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
	static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
	static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
	static final short[][] DFA2_transition;

	static {
		int numStates = DFA2_transitionS.length;
		DFA2_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
		}
	}

	protected class DFA2 extends DFA {

		public DFA2(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 2;
			this.eot = DFA2_eot;
			this.eof = DFA2_eof;
			this.min = DFA2_min;
			this.max = DFA2_max;
			this.accept = DFA2_accept;
			this.special = DFA2_special;
			this.transition = DFA2_transition;
		}
		@Override
		public String getDescription() {
			return "275:7: ( ( K_JSON selectClause )=> K_JSON )?";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TokenStream input = (TokenStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA2_1 = input.LA(1);
						 
						int index2_1 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_Parser()) ) {s = 51;}
						else if ( (true) ) {s = 2;}
						 
						input.seek(index2_1);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 2, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA11_eotS =
		"\63\uffff";
	static final String DFA11_eofS =
		"\63\uffff";
	static final String DFA11_minS =
		"\1\6\1\0\61\uffff";
	static final String DFA11_maxS =
		"\1\u00cf\1\0\61\uffff";
	static final String DFA11_acceptS =
		"\2\uffff\1\2\57\uffff\1\1";
	static final String DFA11_specialS =
		"\1\uffff\1\0\61\uffff}>";
	static final String[] DFA11_transitionS = {
			"\1\2\4\uffff\1\2\4\uffff\1\2\3\uffff\1\2\1\uffff\2\2\3\uffff\2\2\4\uffff"+
			"\1\2\1\uffff\1\2\3\uffff\3\2\1\uffff\3\2\1\uffff\4\2\1\uffff\3\2\4\uffff"+
			"\1\1\1\2\1\uffff\1\2\2\uffff\4\2\1\uffff\1\2\1\uffff\2\2\1\uffff\1\2"+
			"\3\uffff\3\2\1\uffff\1\2\2\uffff\3\2\1\uffff\3\2\1\uffff\3\2\4\uffff"+
			"\3\2\1\uffff\1\2\1\uffff\1\2\2\uffff\1\2\2\uffff\7\2\3\uffff\1\2\1\uffff"+
			"\2\2\2\uffff\13\2\1\uffff\2\2\1\uffff\3\2\4\uffff\2\2\1\uffff\4\2\3\uffff"+
			"\1\2\10\uffff\2\2\3\uffff\1\2\2\uffff\1\2\10\uffff\1\2\4\uffff\1\2\3"+
			"\uffff\1\2\6\uffff\2\2\2\uffff\1\2",
			"\1\uffff",
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
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
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

	protected class DFA11 extends DFA {

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
		@Override
		public String getDescription() {
			return "294:1: selectClause returns [boolean isDistinct, List<RawSelector> selectors] : ( ( K_DISTINCT selectors )=> K_DISTINCT s= selectors |s= selectors );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TokenStream input = (TokenStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA11_1 = input.LA(1);
						 
						int index11_1 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred2_Parser()) ) {s = 50;}
						else if ( (true) ) {s = 2;}
						 
						input.seek(index11_1);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 11, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA17_eotS =
		"\62\uffff";
	static final String DFA17_eofS =
		"\62\uffff";
	static final String DFA17_minS =
		"\1\6\56\0\3\uffff";
	static final String DFA17_maxS =
		"\1\u00cf\56\0\3\uffff";
	static final String DFA17_acceptS =
		"\57\uffff\1\3\1\1\1\2";
	static final String DFA17_specialS =
		"\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15"+
		"\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33"+
		"\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51"+
		"\1\52\1\53\1\54\1\55\3\uffff}>";
	static final String[] DFA17_transitionS = {
			"\1\35\4\uffff\1\36\4\uffff\1\34\3\uffff\1\40\1\uffff\1\1\1\33\3\uffff"+
			"\2\3\4\uffff\1\3\1\uffff\1\4\3\uffff\1\5\1\6\1\7\1\uffff\1\3\1\51\1\3"+
			"\1\uffff\2\3\1\31\1\10\1\uffff\1\3\1\27\1\11\4\uffff\1\52\1\12\1\uffff"+
			"\1\13\2\uffff\3\3\1\14\1\uffff\1\3\1\uffff\2\3\1\uffff\1\3\3\uffff\1"+
			"\15\2\3\1\uffff\1\16\2\uffff\2\52\1\3\1\uffff\3\3\1\uffff\3\3\4\uffff"+
			"\1\43\1\41\1\3\1\uffff\1\3\1\uffff\1\44\2\uffff\1\3\2\uffff\5\3\1\42"+
			"\1\41\3\uffff\1\3\1\uffff\2\3\2\uffff\1\3\1\17\4\3\1\20\1\30\1\21\1\26"+
			"\1\22\1\uffff\1\53\1\3\1\uffff\1\50\2\3\4\uffff\2\3\1\uffff\1\23\1\3"+
			"\1\24\1\25\3\uffff\1\47\10\uffff\1\46\1\2\3\uffff\1\32\2\uffff\1\37\10"+
			"\uffff\1\54\4\uffff\1\57\3\uffff\1\45\6\uffff\1\55\3\uffff\1\56",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"",
			""
	};

	static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
	static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
	static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
	static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
	static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
	static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
	static final short[][] DFA17_transition;

	static {
		int numStates = DFA17_transitionS.length;
		DFA17_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
		}
	}

	protected class DFA17 extends DFA {

		public DFA17(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 17;
			this.eot = DFA17_eot;
			this.eof = DFA17_eof;
			this.min = DFA17_min;
			this.max = DFA17_max;
			this.accept = DFA17_accept;
			this.special = DFA17_special;
			this.transition = DFA17_transition;
		}
		@Override
		public String getDescription() {
			return "330:1: selectionGroup returns [Selectable.Raw s] : ( ( selectionGroupWithField )=>f= selectionGroupWithField |g= selectionGroupWithoutField | '-' g= selectionGroup );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TokenStream input = (TokenStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA17_1 = input.LA(1);
						 
						int index17_1 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Parser()) ) {s = 48;}
						else if ( (true) ) {s = 49;}
						 
						input.seek(index17_1);
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA17_2 = input.LA(1);
						 
						int index17_2 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Parser()) ) {s = 48;}
						else if ( (true) ) {s = 49;}
						 
						input.seek(index17_2);
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA17_3 = input.LA(1);
						 
						int index17_3 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Parser()) ) {s = 48;}
						else if ( (true) ) {s = 49;}
						 
						input.seek(index17_3);
						if ( s>=0 ) return s;
						break;

					case 3 : 
						int LA17_4 = input.LA(1);
						 
						int index17_4 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Parser()) ) {s = 48;}
						else if ( (true) ) {s = 49;}
						 
						input.seek(index17_4);
						if ( s>=0 ) return s;
						break;

					case 4 : 
						int LA17_5 = input.LA(1);
						 
						int index17_5 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Parser()) ) {s = 48;}
						else if ( (true) ) {s = 49;}
						 
						input.seek(index17_5);
						if ( s>=0 ) return s;
						break;

					case 5 : 
						int LA17_6 = input.LA(1);
						 
						int index17_6 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Parser()) ) {s = 48;}
						else if ( (true) ) {s = 49;}
						 
						input.seek(index17_6);
						if ( s>=0 ) return s;
						break;

					case 6 : 
						int LA17_7 = input.LA(1);
						 
						int index17_7 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Parser()) ) {s = 48;}
						else if ( (true) ) {s = 49;}
						 
						input.seek(index17_7);
						if ( s>=0 ) return s;
						break;

					case 7 : 
						int LA17_8 = input.LA(1);
						 
						int index17_8 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Parser()) ) {s = 48;}
						else if ( (true) ) {s = 49;}
						 
						input.seek(index17_8);
						if ( s>=0 ) return s;
						break;

					case 8 : 
						int LA17_9 = input.LA(1);
						 
						int index17_9 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Parser()) ) {s = 48;}
						else if ( (true) ) {s = 49;}
						 
						input.seek(index17_9);
						if ( s>=0 ) return s;
						break;

					case 9 : 
						int LA17_10 = input.LA(1);
						 
						int index17_10 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Parser()) ) {s = 48;}
						else if ( (true) ) {s = 49;}
						 
						input.seek(index17_10);
						if ( s>=0 ) return s;
						break;

					case 10 : 
						int LA17_11 = input.LA(1);
						 
						int index17_11 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Parser()) ) {s = 48;}
						else if ( (true) ) {s = 49;}
						 
						input.seek(index17_11);
						if ( s>=0 ) return s;
						break;

					case 11 : 
						int LA17_12 = input.LA(1);
						 
						int index17_12 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Parser()) ) {s = 48;}
						else if ( (true) ) {s = 49;}
						 
						input.seek(index17_12);
						if ( s>=0 ) return s;
						break;

					case 12 : 
						int LA17_13 = input.LA(1);
						 
						int index17_13 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Parser()) ) {s = 48;}
						else if ( (true) ) {s = 49;}
						 
						input.seek(index17_13);
						if ( s>=0 ) return s;
						break;

					case 13 : 
						int LA17_14 = input.LA(1);
						 
						int index17_14 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Parser()) ) {s = 48;}
						else if ( (true) ) {s = 49;}
						 
						input.seek(index17_14);
						if ( s>=0 ) return s;
						break;

					case 14 : 
						int LA17_15 = input.LA(1);
						 
						int index17_15 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Parser()) ) {s = 48;}
						else if ( (true) ) {s = 49;}
						 
						input.seek(index17_15);
						if ( s>=0 ) return s;
						break;

					case 15 : 
						int LA17_16 = input.LA(1);
						 
						int index17_16 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Parser()) ) {s = 48;}
						else if ( (true) ) {s = 49;}
						 
						input.seek(index17_16);
						if ( s>=0 ) return s;
						break;

					case 16 : 
						int LA17_17 = input.LA(1);
						 
						int index17_17 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Parser()) ) {s = 48;}
						else if ( (true) ) {s = 49;}
						 
						input.seek(index17_17);
						if ( s>=0 ) return s;
						break;

					case 17 : 
						int LA17_18 = input.LA(1);
						 
						int index17_18 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Parser()) ) {s = 48;}
						else if ( (true) ) {s = 49;}
						 
						input.seek(index17_18);
						if ( s>=0 ) return s;
						break;

					case 18 : 
						int LA17_19 = input.LA(1);
						 
						int index17_19 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Parser()) ) {s = 48;}
						else if ( (true) ) {s = 49;}
						 
						input.seek(index17_19);
						if ( s>=0 ) return s;
						break;

					case 19 : 
						int LA17_20 = input.LA(1);
						 
						int index17_20 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Parser()) ) {s = 48;}
						else if ( (true) ) {s = 49;}
						 
						input.seek(index17_20);
						if ( s>=0 ) return s;
						break;

					case 20 : 
						int LA17_21 = input.LA(1);
						 
						int index17_21 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Parser()) ) {s = 48;}
						else if ( (true) ) {s = 49;}
						 
						input.seek(index17_21);
						if ( s>=0 ) return s;
						break;

					case 21 : 
						int LA17_22 = input.LA(1);
						 
						int index17_22 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Parser()) ) {s = 48;}
						else if ( (true) ) {s = 49;}
						 
						input.seek(index17_22);
						if ( s>=0 ) return s;
						break;

					case 22 : 
						int LA17_23 = input.LA(1);
						 
						int index17_23 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Parser()) ) {s = 48;}
						else if ( (true) ) {s = 49;}
						 
						input.seek(index17_23);
						if ( s>=0 ) return s;
						break;

					case 23 : 
						int LA17_24 = input.LA(1);
						 
						int index17_24 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Parser()) ) {s = 48;}
						else if ( (true) ) {s = 49;}
						 
						input.seek(index17_24);
						if ( s>=0 ) return s;
						break;

					case 24 : 
						int LA17_25 = input.LA(1);
						 
						int index17_25 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Parser()) ) {s = 48;}
						else if ( (true) ) {s = 49;}
						 
						input.seek(index17_25);
						if ( s>=0 ) return s;
						break;

					case 25 : 
						int LA17_26 = input.LA(1);
						 
						int index17_26 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Parser()) ) {s = 48;}
						else if ( (true) ) {s = 49;}
						 
						input.seek(index17_26);
						if ( s>=0 ) return s;
						break;

					case 26 : 
						int LA17_27 = input.LA(1);
						 
						int index17_27 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Parser()) ) {s = 48;}
						else if ( (true) ) {s = 49;}
						 
						input.seek(index17_27);
						if ( s>=0 ) return s;
						break;

					case 27 : 
						int LA17_28 = input.LA(1);
						 
						int index17_28 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Parser()) ) {s = 48;}
						else if ( (true) ) {s = 49;}
						 
						input.seek(index17_28);
						if ( s>=0 ) return s;
						break;

					case 28 : 
						int LA17_29 = input.LA(1);
						 
						int index17_29 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Parser()) ) {s = 48;}
						else if ( (true) ) {s = 49;}
						 
						input.seek(index17_29);
						if ( s>=0 ) return s;
						break;

					case 29 : 
						int LA17_30 = input.LA(1);
						 
						int index17_30 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Parser()) ) {s = 48;}
						else if ( (true) ) {s = 49;}
						 
						input.seek(index17_30);
						if ( s>=0 ) return s;
						break;

					case 30 : 
						int LA17_31 = input.LA(1);
						 
						int index17_31 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Parser()) ) {s = 48;}
						else if ( (true) ) {s = 49;}
						 
						input.seek(index17_31);
						if ( s>=0 ) return s;
						break;

					case 31 : 
						int LA17_32 = input.LA(1);
						 
						int index17_32 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Parser()) ) {s = 48;}
						else if ( (true) ) {s = 49;}
						 
						input.seek(index17_32);
						if ( s>=0 ) return s;
						break;

					case 32 : 
						int LA17_33 = input.LA(1);
						 
						int index17_33 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Parser()) ) {s = 48;}
						else if ( (true) ) {s = 49;}
						 
						input.seek(index17_33);
						if ( s>=0 ) return s;
						break;

					case 33 : 
						int LA17_34 = input.LA(1);
						 
						int index17_34 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Parser()) ) {s = 48;}
						else if ( (true) ) {s = 49;}
						 
						input.seek(index17_34);
						if ( s>=0 ) return s;
						break;

					case 34 : 
						int LA17_35 = input.LA(1);
						 
						int index17_35 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Parser()) ) {s = 48;}
						else if ( (true) ) {s = 49;}
						 
						input.seek(index17_35);
						if ( s>=0 ) return s;
						break;

					case 35 : 
						int LA17_36 = input.LA(1);
						 
						int index17_36 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Parser()) ) {s = 48;}
						else if ( (true) ) {s = 49;}
						 
						input.seek(index17_36);
						if ( s>=0 ) return s;
						break;

					case 36 : 
						int LA17_37 = input.LA(1);
						 
						int index17_37 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Parser()) ) {s = 48;}
						else if ( (true) ) {s = 49;}
						 
						input.seek(index17_37);
						if ( s>=0 ) return s;
						break;

					case 37 : 
						int LA17_38 = input.LA(1);
						 
						int index17_38 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Parser()) ) {s = 48;}
						else if ( (true) ) {s = 49;}
						 
						input.seek(index17_38);
						if ( s>=0 ) return s;
						break;

					case 38 : 
						int LA17_39 = input.LA(1);
						 
						int index17_39 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Parser()) ) {s = 48;}
						else if ( (true) ) {s = 49;}
						 
						input.seek(index17_39);
						if ( s>=0 ) return s;
						break;

					case 39 : 
						int LA17_40 = input.LA(1);
						 
						int index17_40 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Parser()) ) {s = 48;}
						else if ( (true) ) {s = 49;}
						 
						input.seek(index17_40);
						if ( s>=0 ) return s;
						break;

					case 40 : 
						int LA17_41 = input.LA(1);
						 
						int index17_41 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Parser()) ) {s = 48;}
						else if ( (true) ) {s = 49;}
						 
						input.seek(index17_41);
						if ( s>=0 ) return s;
						break;

					case 41 : 
						int LA17_42 = input.LA(1);
						 
						int index17_42 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Parser()) ) {s = 48;}
						else if ( (true) ) {s = 49;}
						 
						input.seek(index17_42);
						if ( s>=0 ) return s;
						break;

					case 42 : 
						int LA17_43 = input.LA(1);
						 
						int index17_43 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Parser()) ) {s = 48;}
						else if ( (true) ) {s = 49;}
						 
						input.seek(index17_43);
						if ( s>=0 ) return s;
						break;

					case 43 : 
						int LA17_44 = input.LA(1);
						 
						int index17_44 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Parser()) ) {s = 48;}
						else if ( (true) ) {s = 49;}
						 
						input.seek(index17_44);
						if ( s>=0 ) return s;
						break;

					case 44 : 
						int LA17_45 = input.LA(1);
						 
						int index17_45 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Parser()) ) {s = 48;}
						else if ( (true) ) {s = 49;}
						 
						input.seek(index17_45);
						if ( s>=0 ) return s;
						break;

					case 45 : 
						int LA17_46 = input.LA(1);
						 
						int index17_46 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Parser()) ) {s = 48;}
						else if ( (true) ) {s = 49;}
						 
						input.seek(index17_46);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 17, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA22_eotS =
		"\61\uffff";
	static final String DFA22_eofS =
		"\61\uffff";
	static final String DFA22_minS =
		"\1\6\53\uffff\1\0\4\uffff";
	static final String DFA22_maxS =
		"\1\u00cf\53\uffff\1\0\4\uffff";
	static final String DFA22_acceptS =
		"\1\uffff\1\1\53\uffff\1\4\1\5\1\2\1\3";
	static final String DFA22_specialS =
		"\54\uffff\1\0\4\uffff}>";
	static final String[] DFA22_transitionS = {
			"\1\1\4\uffff\1\1\4\uffff\1\1\3\uffff\1\1\1\uffff\2\1\3\uffff\2\1\4\uffff"+
			"\1\1\1\uffff\1\1\3\uffff\3\1\1\uffff\3\1\1\uffff\4\1\1\uffff\3\1\4\uffff"+
			"\2\1\1\uffff\1\1\2\uffff\4\1\1\uffff\1\1\1\uffff\2\1\1\uffff\1\1\3\uffff"+
			"\3\1\1\uffff\1\1\2\uffff\3\1\1\uffff\3\1\1\uffff\3\1\4\uffff\3\1\1\uffff"+
			"\1\1\1\uffff\1\1\2\uffff\1\1\2\uffff\7\1\3\uffff\1\1\1\uffff\2\1\2\uffff"+
			"\13\1\1\uffff\2\1\1\uffff\3\1\4\uffff\2\1\1\uffff\4\1\3\uffff\1\1\10"+
			"\uffff\2\1\3\uffff\1\1\2\uffff\1\1\10\uffff\1\54\10\uffff\1\1\6\uffff"+
			"\1\55\3\uffff\1\56",
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
			"",
			"",
			"",
			"",
			"\1\uffff",
			"",
			"",
			"",
			""
	};

	static final short[] DFA22_eot = DFA.unpackEncodedString(DFA22_eotS);
	static final short[] DFA22_eof = DFA.unpackEncodedString(DFA22_eofS);
	static final char[] DFA22_min = DFA.unpackEncodedStringToUnsignedChars(DFA22_minS);
	static final char[] DFA22_max = DFA.unpackEncodedStringToUnsignedChars(DFA22_maxS);
	static final short[] DFA22_accept = DFA.unpackEncodedString(DFA22_acceptS);
	static final short[] DFA22_special = DFA.unpackEncodedString(DFA22_specialS);
	static final short[][] DFA22_transition;

	static {
		int numStates = DFA22_transitionS.length;
		DFA22_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA22_transition[i] = DFA.unpackEncodedString(DFA22_transitionS[i]);
		}
	}

	protected class DFA22 extends DFA {

		public DFA22(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 22;
			this.eot = DFA22_eot;
			this.eof = DFA22_eof;
			this.min = DFA22_min;
			this.max = DFA22_max;
			this.accept = DFA22_accept;
			this.special = DFA22_special;
			this.transition = DFA22_transition;
		}
		@Override
		public String getDescription() {
			return "361:1: selectionGroupWithoutField returns [Selectable.Raw s] : (sn= simpleUnaliasedSelector | ( selectionTypeHint )=>h= selectionTypeHint |t= selectionTupleOrNestedSelector |l= selectionList |m= selectionMapOrSet );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TokenStream input = (TokenStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA22_44 = input.LA(1);
						 
						int index22_44 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_Parser()) ) {s = 47;}
						else if ( (true) ) {s = 48;}
						 
						input.seek(index22_44);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 22, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA30_eotS =
		"\126\uffff";
	static final String DFA30_eofS =
		"\1\uffff\31\41\1\uffff\1\32\4\41\4\uffff\31\41\31\32";
	static final String DFA30_minS =
		"\1\6\31\41\1\uffff\5\41\2\uffff\2\26\62\41";
	static final String DFA30_maxS =
		"\1\u00c4\31\u00d0\1\uffff\5\u00d0\2\uffff\2\u00ab\62\u00d0";
	static final String DFA30_acceptS =
		"\32\uffff\1\2\5\uffff\1\3\1\1\64\uffff";
	static final String DFA30_specialS =
		"\126\uffff}>";
	static final String[] DFA30_transitionS = {
			"\1\32\4\uffff\1\32\4\uffff\1\32\3\uffff\1\32\1\uffff\1\1\1\32\3\uffff"+
			"\2\3\4\uffff\1\3\1\uffff\1\4\3\uffff\1\5\1\6\1\7\1\uffff\1\3\1\36\1\3"+
			"\1\uffff\2\3\1\31\1\10\1\uffff\1\3\1\27\1\11\4\uffff\1\37\1\12\1\uffff"+
			"\1\13\2\uffff\3\3\1\14\1\uffff\1\3\1\uffff\2\3\1\uffff\1\3\3\uffff\1"+
			"\15\2\3\1\uffff\1\16\2\uffff\2\37\1\3\1\uffff\3\3\1\uffff\3\3\4\uffff"+
			"\2\32\1\3\1\uffff\1\3\1\uffff\1\32\2\uffff\1\3\2\uffff\5\3\2\32\3\uffff"+
			"\1\3\1\uffff\2\3\2\uffff\1\3\1\17\4\3\1\20\1\30\1\21\1\26\1\22\1\uffff"+
			"\1\40\1\3\1\uffff\1\35\2\3\4\uffff\2\3\1\uffff\1\23\1\3\1\24\1\25\3\uffff"+
			"\1\34\10\uffff\1\33\1\2\3\uffff\1\32\2\uffff\1\32\21\uffff\1\32",
			"\1\41\43\uffff\1\41\164\uffff\1\41\1\40\2\41\1\uffff\2\41\1\uffff\1"+
			"\42\2\41\6\uffff\3\41\2\uffff\1\41",
			"\1\41\43\uffff\1\41\164\uffff\1\41\1\40\2\41\1\uffff\2\41\1\uffff\1"+
			"\42\2\41\6\uffff\3\41\2\uffff\1\41",
			"\1\41\43\uffff\1\41\164\uffff\1\41\1\40\2\41\1\uffff\2\41\1\uffff\1"+
			"\42\2\41\6\uffff\3\41\2\uffff\1\41",
			"\1\41\43\uffff\1\41\164\uffff\1\41\1\40\2\41\1\uffff\2\41\1\uffff\1"+
			"\42\2\41\6\uffff\3\41\2\uffff\1\41",
			"\1\41\43\uffff\1\41\164\uffff\1\41\1\40\2\41\1\uffff\2\41\1\uffff\1"+
			"\42\2\41\6\uffff\3\41\2\uffff\1\41",
			"\1\41\43\uffff\1\41\164\uffff\1\41\1\40\2\41\1\uffff\2\41\1\uffff\1"+
			"\42\2\41\6\uffff\3\41\2\uffff\1\41",
			"\1\41\43\uffff\1\41\164\uffff\1\41\1\40\2\41\1\uffff\2\41\1\uffff\1"+
			"\42\2\41\6\uffff\3\41\2\uffff\1\41",
			"\1\41\43\uffff\1\41\164\uffff\1\41\1\40\2\41\1\uffff\2\41\1\uffff\1"+
			"\42\2\41\6\uffff\3\41\2\uffff\1\41",
			"\1\41\43\uffff\1\41\164\uffff\1\41\1\40\2\41\1\uffff\2\41\1\uffff\1"+
			"\42\2\41\6\uffff\3\41\2\uffff\1\41",
			"\1\41\43\uffff\1\41\164\uffff\1\41\1\40\2\41\1\uffff\2\41\1\uffff\1"+
			"\42\2\41\6\uffff\3\41\2\uffff\1\41",
			"\1\41\43\uffff\1\41\164\uffff\1\41\1\40\2\41\1\uffff\2\41\1\uffff\1"+
			"\42\2\41\6\uffff\3\41\2\uffff\1\41",
			"\1\41\43\uffff\1\41\164\uffff\1\41\1\40\2\41\1\uffff\2\41\1\uffff\1"+
			"\42\2\41\6\uffff\3\41\2\uffff\1\41",
			"\1\41\43\uffff\1\41\164\uffff\1\41\1\40\2\41\1\uffff\2\41\1\uffff\1"+
			"\42\2\41\6\uffff\3\41\2\uffff\1\41",
			"\1\41\43\uffff\1\41\164\uffff\1\41\1\40\2\41\1\uffff\2\41\1\uffff\1"+
			"\42\2\41\6\uffff\3\41\2\uffff\1\41",
			"\1\41\43\uffff\1\41\164\uffff\1\41\1\40\2\41\1\uffff\2\41\1\uffff\1"+
			"\42\2\41\6\uffff\3\41\2\uffff\1\41",
			"\1\41\43\uffff\1\41\164\uffff\1\41\1\40\2\41\1\uffff\2\41\1\uffff\1"+
			"\42\2\41\6\uffff\3\41\2\uffff\1\41",
			"\1\41\43\uffff\1\41\164\uffff\1\41\1\40\2\41\1\uffff\2\41\1\uffff\1"+
			"\42\2\41\6\uffff\3\41\2\uffff\1\41",
			"\1\41\43\uffff\1\41\164\uffff\1\41\1\40\2\41\1\uffff\2\41\1\uffff\1"+
			"\42\2\41\6\uffff\3\41\2\uffff\1\41",
			"\1\41\43\uffff\1\41\164\uffff\1\41\1\40\2\41\1\uffff\2\41\1\uffff\1"+
			"\42\2\41\6\uffff\3\41\2\uffff\1\41",
			"\1\41\43\uffff\1\41\164\uffff\1\41\1\40\2\41\1\uffff\2\41\1\uffff\1"+
			"\42\2\41\6\uffff\3\41\2\uffff\1\41",
			"\1\41\43\uffff\1\41\164\uffff\1\41\1\40\2\41\1\uffff\2\41\1\uffff\1"+
			"\42\2\41\6\uffff\3\41\2\uffff\1\41",
			"\1\41\43\uffff\1\41\164\uffff\1\41\1\40\2\41\1\uffff\2\41\1\uffff\1"+
			"\42\2\41\6\uffff\3\41\2\uffff\1\41",
			"\1\41\43\uffff\1\41\164\uffff\1\41\1\40\2\41\1\uffff\2\41\1\uffff\1"+
			"\42\2\41\6\uffff\3\41\2\uffff\1\41",
			"\1\41\43\uffff\1\41\164\uffff\1\41\1\40\2\41\1\uffff\2\41\1\uffff\1"+
			"\42\2\41\6\uffff\3\41\2\uffff\1\41",
			"\1\41\43\uffff\1\41\164\uffff\1\41\1\40\2\41\1\uffff\2\41\1\uffff\1"+
			"\42\2\41\6\uffff\3\41\2\uffff\1\41",
			"",
			"\1\32\43\uffff\1\32\164\uffff\1\32\1\uffff\2\32\1\uffff\2\32\1\uffff"+
			"\1\43\2\32\6\uffff\3\32\2\uffff\1\32",
			"\1\41\43\uffff\1\41\164\uffff\1\41\1\40\2\41\1\uffff\2\41\1\uffff\1"+
			"\42\2\41\6\uffff\3\41\2\uffff\1\41",
			"\1\41\43\uffff\1\41\164\uffff\1\41\1\40\2\41\1\uffff\2\41\1\uffff\1"+
			"\42\2\41\6\uffff\3\41\2\uffff\1\41",
			"\1\41\43\uffff\1\41\164\uffff\1\41\1\40\2\41\1\uffff\2\41\1\uffff\1"+
			"\42\2\41\6\uffff\3\41\2\uffff\1\41",
			"\1\41\43\uffff\1\41\164\uffff\1\41\1\uffff\2\41\1\uffff\2\41\1\uffff"+
			"\1\42\2\41\6\uffff\3\41\2\uffff\1\41",
			"",
			"",
			"\1\44\4\uffff\2\46\4\uffff\1\46\1\uffff\1\47\3\uffff\1\50\1\51\1\52"+
			"\1\uffff\1\46\1\41\1\46\1\uffff\2\46\1\74\1\53\1\uffff\1\46\1\72\1\54"+
			"\4\uffff\1\41\1\55\1\uffff\1\56\2\uffff\3\46\1\57\1\uffff\1\46\1\uffff"+
			"\2\46\1\uffff\1\46\3\uffff\1\60\2\46\1\uffff\1\61\2\uffff\2\41\1\46\1"+
			"\uffff\3\46\1\uffff\3\46\6\uffff\1\46\1\uffff\1\46\4\uffff\1\46\2\uffff"+
			"\5\46\5\uffff\1\46\1\uffff\2\46\2\uffff\1\46\1\62\4\46\1\63\1\73\1\64"+
			"\1\71\1\65\1\uffff\1\40\1\46\1\uffff\1\41\2\46\4\uffff\2\46\1\uffff\1"+
			"\66\1\46\1\67\1\70\3\uffff\1\41\11\uffff\1\45",
			"\1\75\4\uffff\2\77\4\uffff\1\77\1\uffff\1\100\3\uffff\1\101\1\102\1"+
			"\103\1\uffff\1\77\1\32\1\77\1\uffff\2\77\1\125\1\104\1\uffff\1\77\1\123"+
			"\1\105\4\uffff\1\32\1\106\1\uffff\1\107\2\uffff\3\77\1\110\1\uffff\1"+
			"\77\1\uffff\2\77\1\uffff\1\77\3\uffff\1\111\2\77\1\uffff\1\112\2\uffff"+
			"\2\32\1\77\1\uffff\3\77\1\uffff\3\77\6\uffff\1\77\1\uffff\1\77\4\uffff"+
			"\1\77\2\uffff\5\77\5\uffff\1\77\1\uffff\2\77\2\uffff\1\77\1\113\4\77"+
			"\1\114\1\124\1\115\1\122\1\116\1\uffff\1\40\1\77\1\uffff\1\32\2\77\4"+
			"\uffff\2\77\1\uffff\1\117\1\77\1\120\1\121\3\uffff\1\32\11\uffff\1\76",
			"\1\41\43\uffff\1\41\164\uffff\1\41\1\40\2\41\1\uffff\2\41\1\uffff\3"+
			"\41\6\uffff\3\41\2\uffff\1\41",
			"\1\41\43\uffff\1\41\164\uffff\1\41\1\40\2\41\1\uffff\2\41\1\uffff\3"+
			"\41\6\uffff\3\41\2\uffff\1\41",
			"\1\41\43\uffff\1\41\164\uffff\1\41\1\40\2\41\1\uffff\2\41\1\uffff\3"+
			"\41\6\uffff\3\41\2\uffff\1\41",
			"\1\41\43\uffff\1\41\164\uffff\1\41\1\40\2\41\1\uffff\2\41\1\uffff\3"+
			"\41\6\uffff\3\41\2\uffff\1\41",
			"\1\41\43\uffff\1\41\164\uffff\1\41\1\40\2\41\1\uffff\2\41\1\uffff\3"+
			"\41\6\uffff\3\41\2\uffff\1\41",
			"\1\41\43\uffff\1\41\164\uffff\1\41\1\40\2\41\1\uffff\2\41\1\uffff\3"+
			"\41\6\uffff\3\41\2\uffff\1\41",
			"\1\41\43\uffff\1\41\164\uffff\1\41\1\40\2\41\1\uffff\2\41\1\uffff\3"+
			"\41\6\uffff\3\41\2\uffff\1\41",
			"\1\41\43\uffff\1\41\164\uffff\1\41\1\40\2\41\1\uffff\2\41\1\uffff\3"+
			"\41\6\uffff\3\41\2\uffff\1\41",
			"\1\41\43\uffff\1\41\164\uffff\1\41\1\40\2\41\1\uffff\2\41\1\uffff\3"+
			"\41\6\uffff\3\41\2\uffff\1\41",
			"\1\41\43\uffff\1\41\164\uffff\1\41\1\40\2\41\1\uffff\2\41\1\uffff\3"+
			"\41\6\uffff\3\41\2\uffff\1\41",
			"\1\41\43\uffff\1\41\164\uffff\1\41\1\40\2\41\1\uffff\2\41\1\uffff\3"+
			"\41\6\uffff\3\41\2\uffff\1\41",
			"\1\41\43\uffff\1\41\164\uffff\1\41\1\40\2\41\1\uffff\2\41\1\uffff\3"+
			"\41\6\uffff\3\41\2\uffff\1\41",
			"\1\41\43\uffff\1\41\164\uffff\1\41\1\40\2\41\1\uffff\2\41\1\uffff\3"+
			"\41\6\uffff\3\41\2\uffff\1\41",
			"\1\41\43\uffff\1\41\164\uffff\1\41\1\40\2\41\1\uffff\2\41\1\uffff\3"+
			"\41\6\uffff\3\41\2\uffff\1\41",
			"\1\41\43\uffff\1\41\164\uffff\1\41\1\40\2\41\1\uffff\2\41\1\uffff\3"+
			"\41\6\uffff\3\41\2\uffff\1\41",
			"\1\41\43\uffff\1\41\164\uffff\1\41\1\40\2\41\1\uffff\2\41\1\uffff\3"+
			"\41\6\uffff\3\41\2\uffff\1\41",
			"\1\41\43\uffff\1\41\164\uffff\1\41\1\40\2\41\1\uffff\2\41\1\uffff\3"+
			"\41\6\uffff\3\41\2\uffff\1\41",
			"\1\41\43\uffff\1\41\164\uffff\1\41\1\40\2\41\1\uffff\2\41\1\uffff\3"+
			"\41\6\uffff\3\41\2\uffff\1\41",
			"\1\41\43\uffff\1\41\164\uffff\1\41\1\40\2\41\1\uffff\2\41\1\uffff\3"+
			"\41\6\uffff\3\41\2\uffff\1\41",
			"\1\41\43\uffff\1\41\164\uffff\1\41\1\40\2\41\1\uffff\2\41\1\uffff\3"+
			"\41\6\uffff\3\41\2\uffff\1\41",
			"\1\41\43\uffff\1\41\164\uffff\1\41\1\40\2\41\1\uffff\2\41\1\uffff\3"+
			"\41\6\uffff\3\41\2\uffff\1\41",
			"\1\41\43\uffff\1\41\164\uffff\1\41\1\40\2\41\1\uffff\2\41\1\uffff\3"+
			"\41\6\uffff\3\41\2\uffff\1\41",
			"\1\41\43\uffff\1\41\164\uffff\1\41\1\40\2\41\1\uffff\2\41\1\uffff\3"+
			"\41\6\uffff\3\41\2\uffff\1\41",
			"\1\41\43\uffff\1\41\164\uffff\1\41\1\40\2\41\1\uffff\2\41\1\uffff\3"+
			"\41\6\uffff\3\41\2\uffff\1\41",
			"\1\41\43\uffff\1\41\164\uffff\1\41\1\40\2\41\1\uffff\2\41\1\uffff\3"+
			"\41\6\uffff\3\41\2\uffff\1\41",
			"\1\32\43\uffff\1\32\164\uffff\1\32\1\40\2\32\1\uffff\2\32\1\uffff\3"+
			"\32\6\uffff\3\32\2\uffff\1\32",
			"\1\32\43\uffff\1\32\164\uffff\1\32\1\40\2\32\1\uffff\2\32\1\uffff\3"+
			"\32\6\uffff\3\32\2\uffff\1\32",
			"\1\32\43\uffff\1\32\164\uffff\1\32\1\40\2\32\1\uffff\2\32\1\uffff\3"+
			"\32\6\uffff\3\32\2\uffff\1\32",
			"\1\32\43\uffff\1\32\164\uffff\1\32\1\40\2\32\1\uffff\2\32\1\uffff\3"+
			"\32\6\uffff\3\32\2\uffff\1\32",
			"\1\32\43\uffff\1\32\164\uffff\1\32\1\40\2\32\1\uffff\2\32\1\uffff\3"+
			"\32\6\uffff\3\32\2\uffff\1\32",
			"\1\32\43\uffff\1\32\164\uffff\1\32\1\40\2\32\1\uffff\2\32\1\uffff\3"+
			"\32\6\uffff\3\32\2\uffff\1\32",
			"\1\32\43\uffff\1\32\164\uffff\1\32\1\40\2\32\1\uffff\2\32\1\uffff\3"+
			"\32\6\uffff\3\32\2\uffff\1\32",
			"\1\32\43\uffff\1\32\164\uffff\1\32\1\40\2\32\1\uffff\2\32\1\uffff\3"+
			"\32\6\uffff\3\32\2\uffff\1\32",
			"\1\32\43\uffff\1\32\164\uffff\1\32\1\40\2\32\1\uffff\2\32\1\uffff\3"+
			"\32\6\uffff\3\32\2\uffff\1\32",
			"\1\32\43\uffff\1\32\164\uffff\1\32\1\40\2\32\1\uffff\2\32\1\uffff\3"+
			"\32\6\uffff\3\32\2\uffff\1\32",
			"\1\32\43\uffff\1\32\164\uffff\1\32\1\40\2\32\1\uffff\2\32\1\uffff\3"+
			"\32\6\uffff\3\32\2\uffff\1\32",
			"\1\32\43\uffff\1\32\164\uffff\1\32\1\40\2\32\1\uffff\2\32\1\uffff\3"+
			"\32\6\uffff\3\32\2\uffff\1\32",
			"\1\32\43\uffff\1\32\164\uffff\1\32\1\40\2\32\1\uffff\2\32\1\uffff\3"+
			"\32\6\uffff\3\32\2\uffff\1\32",
			"\1\32\43\uffff\1\32\164\uffff\1\32\1\40\2\32\1\uffff\2\32\1\uffff\3"+
			"\32\6\uffff\3\32\2\uffff\1\32",
			"\1\32\43\uffff\1\32\164\uffff\1\32\1\40\2\32\1\uffff\2\32\1\uffff\3"+
			"\32\6\uffff\3\32\2\uffff\1\32",
			"\1\32\43\uffff\1\32\164\uffff\1\32\1\40\2\32\1\uffff\2\32\1\uffff\3"+
			"\32\6\uffff\3\32\2\uffff\1\32",
			"\1\32\43\uffff\1\32\164\uffff\1\32\1\40\2\32\1\uffff\2\32\1\uffff\3"+
			"\32\6\uffff\3\32\2\uffff\1\32",
			"\1\32\43\uffff\1\32\164\uffff\1\32\1\40\2\32\1\uffff\2\32\1\uffff\3"+
			"\32\6\uffff\3\32\2\uffff\1\32",
			"\1\32\43\uffff\1\32\164\uffff\1\32\1\40\2\32\1\uffff\2\32\1\uffff\3"+
			"\32\6\uffff\3\32\2\uffff\1\32",
			"\1\32\43\uffff\1\32\164\uffff\1\32\1\40\2\32\1\uffff\2\32\1\uffff\3"+
			"\32\6\uffff\3\32\2\uffff\1\32",
			"\1\32\43\uffff\1\32\164\uffff\1\32\1\40\2\32\1\uffff\2\32\1\uffff\3"+
			"\32\6\uffff\3\32\2\uffff\1\32",
			"\1\32\43\uffff\1\32\164\uffff\1\32\1\40\2\32\1\uffff\2\32\1\uffff\3"+
			"\32\6\uffff\3\32\2\uffff\1\32",
			"\1\32\43\uffff\1\32\164\uffff\1\32\1\40\2\32\1\uffff\2\32\1\uffff\3"+
			"\32\6\uffff\3\32\2\uffff\1\32",
			"\1\32\43\uffff\1\32\164\uffff\1\32\1\40\2\32\1\uffff\2\32\1\uffff\3"+
			"\32\6\uffff\3\32\2\uffff\1\32",
			"\1\32\43\uffff\1\32\164\uffff\1\32\1\40\2\32\1\uffff\2\32\1\uffff\3"+
			"\32\6\uffff\3\32\2\uffff\1\32"
	};

	static final short[] DFA30_eot = DFA.unpackEncodedString(DFA30_eotS);
	static final short[] DFA30_eof = DFA.unpackEncodedString(DFA30_eofS);
	static final char[] DFA30_min = DFA.unpackEncodedStringToUnsignedChars(DFA30_minS);
	static final char[] DFA30_max = DFA.unpackEncodedStringToUnsignedChars(DFA30_maxS);
	static final short[] DFA30_accept = DFA.unpackEncodedString(DFA30_acceptS);
	static final short[] DFA30_special = DFA.unpackEncodedString(DFA30_specialS);
	static final short[][] DFA30_transition;

	static {
		int numStates = DFA30_transitionS.length;
		DFA30_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA30_transition[i] = DFA.unpackEncodedString(DFA30_transitionS[i]);
		}
	}

	protected class DFA30 extends DFA {

		public DFA30(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 30;
			this.eot = DFA30_eot;
			this.eof = DFA30_eof;
			this.min = DFA30_min;
			this.max = DFA30_max;
			this.accept = DFA30_accept;
			this.special = DFA30_special;
			this.transition = DFA30_transition;
		}
		@Override
		public String getDescription() {
			return "409:1: simpleUnaliasedSelector returns [Selectable.Raw s] : (c= sident |l= selectionLiteral |f= selectionFunction );";
		}
	}

	static final String DFA31_eotS =
		"\13\uffff";
	static final String DFA31_eofS =
		"\13\uffff";
	static final String DFA31_minS =
		"\1\26\4\u00bb\1\uffff\1\6\4\uffff";
	static final String DFA31_maxS =
		"\1\u00ab\4\u00c2\1\uffff\1\u00cf\4\uffff";
	static final String DFA31_acceptS =
		"\5\uffff\1\5\1\uffff\1\2\1\3\1\4\1\1";
	static final String DFA31_specialS =
		"\13\uffff}>";
	static final String[] DFA31_transitionS = {
			"\1\5\4\uffff\2\5\4\uffff\1\5\1\uffff\1\5\3\uffff\3\5\1\uffff\1\5\1\4"+
			"\1\5\1\uffff\2\5\1\1\1\5\1\uffff\3\5\4\uffff\2\5\1\uffff\1\5\2\uffff"+
			"\4\5\1\uffff\1\5\1\uffff\2\5\1\uffff\1\5\3\uffff\3\5\1\uffff\1\5\2\uffff"+
			"\3\5\1\uffff\3\5\1\uffff\3\5\6\uffff\1\5\1\uffff\1\5\4\uffff\1\5\2\uffff"+
			"\5\5\5\uffff\1\5\1\uffff\2\5\2\uffff\13\5\1\uffff\2\5\1\uffff\1\3\2\5"+
			"\4\uffff\2\5\1\uffff\4\5\3\uffff\1\2\10\uffff\2\5",
			"\1\6\6\uffff\1\5",
			"\1\7\6\uffff\1\5",
			"\1\10\6\uffff\1\5",
			"\1\11\6\uffff\1\5",
			"",
			"\1\5\4\uffff\1\5\4\uffff\1\5\3\uffff\1\5\1\uffff\2\5\3\uffff\2\5\4\uffff"+
			"\1\5\1\uffff\1\5\3\uffff\3\5\1\uffff\3\5\1\uffff\4\5\1\uffff\3\5\4\uffff"+
			"\2\5\1\uffff\1\5\2\uffff\4\5\1\uffff\1\5\1\uffff\2\5\1\uffff\1\5\3\uffff"+
			"\3\5\1\uffff\1\5\2\uffff\3\5\1\uffff\3\5\1\uffff\3\5\4\uffff\3\5\1\uffff"+
			"\1\5\1\uffff\1\5\2\uffff\1\5\2\uffff\7\5\3\uffff\1\5\1\uffff\2\5\2\uffff"+
			"\13\5\1\uffff\2\5\1\uffff\3\5\4\uffff\2\5\1\uffff\4\5\3\uffff\1\5\10"+
			"\uffff\2\5\3\uffff\1\5\2\uffff\1\5\10\uffff\2\5\3\uffff\1\5\3\uffff\1"+
			"\5\6\uffff\1\5\1\12\2\uffff\1\5",
			"",
			"",
			"",
			""
	};

	static final short[] DFA31_eot = DFA.unpackEncodedString(DFA31_eotS);
	static final short[] DFA31_eof = DFA.unpackEncodedString(DFA31_eofS);
	static final char[] DFA31_min = DFA.unpackEncodedStringToUnsignedChars(DFA31_minS);
	static final char[] DFA31_max = DFA.unpackEncodedStringToUnsignedChars(DFA31_maxS);
	static final short[] DFA31_accept = DFA.unpackEncodedString(DFA31_acceptS);
	static final short[] DFA31_special = DFA.unpackEncodedString(DFA31_specialS);
	static final short[][] DFA31_transition;

	static {
		int numStates = DFA31_transitionS.length;
		DFA31_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA31_transition[i] = DFA.unpackEncodedString(DFA31_transitionS[i]);
		}
	}

	protected class DFA31 extends DFA {

		public DFA31(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 31;
			this.eot = DFA31_eot;
			this.eof = DFA31_eof;
			this.min = DFA31_min;
			this.max = DFA31_max;
			this.accept = DFA31_accept;
			this.special = DFA31_special;
			this.transition = DFA31_transition;
		}
		@Override
		public String getDescription() {
			return "415:1: selectionFunction returns [Selectable.Raw s] : ( K_COUNT '(' '\\*' ')' | K_WRITETIME '(' c= cident ')' | K_TTL '(' c= cident ')' | K_CAST '(' sn= unaliasedSelector K_AS t= native_type ')' |f= functionName args= selectionFunctionArgs );";
		}
	}

	static final String DFA61_eotS =
		"\35\uffff";
	static final String DFA61_eofS =
		"\35\uffff";
	static final String DFA61_minS =
		"\1\26\31\105\3\uffff";
	static final String DFA61_maxS =
		"\1\u00ab\31\u00cb\3\uffff";
	static final String DFA61_acceptS =
		"\32\uffff\1\1\1\2\1\3";
	static final String DFA61_specialS =
		"\35\uffff}>";
	static final String[] DFA61_transitionS = {
			"\1\1\4\uffff\2\3\4\uffff\1\3\1\uffff\1\4\3\uffff\1\5\1\6\1\7\1\uffff"+
			"\1\3\1\31\1\3\1\uffff\2\3\1\31\1\10\1\uffff\1\3\1\27\1\11\4\uffff\1\31"+
			"\1\12\1\uffff\1\13\2\uffff\3\3\1\14\1\uffff\1\3\1\uffff\2\3\1\uffff\1"+
			"\3\3\uffff\1\15\2\3\1\uffff\1\16\2\uffff\2\31\1\3\1\uffff\3\3\1\uffff"+
			"\3\3\6\uffff\1\3\1\uffff\1\3\4\uffff\1\3\2\uffff\5\3\5\uffff\1\3\1\uffff"+
			"\2\3\2\uffff\1\3\1\17\4\3\1\20\1\30\1\21\1\26\1\22\2\uffff\1\3\1\uffff"+
			"\1\31\2\3\4\uffff\2\3\1\uffff\1\23\1\3\1\24\1\25\3\uffff\1\31\11\uffff"+
			"\1\2",
			"\1\32\171\uffff\1\32\2\uffff\1\34\10\uffff\1\33",
			"\1\32\171\uffff\1\32\2\uffff\1\34\10\uffff\1\33",
			"\1\32\171\uffff\1\32\2\uffff\1\34\10\uffff\1\33",
			"\1\32\171\uffff\1\32\2\uffff\1\34\10\uffff\1\33",
			"\1\32\171\uffff\1\32\2\uffff\1\34\10\uffff\1\33",
			"\1\32\171\uffff\1\32\2\uffff\1\34\10\uffff\1\33",
			"\1\32\171\uffff\1\32\2\uffff\1\34\10\uffff\1\33",
			"\1\32\171\uffff\1\32\2\uffff\1\34\10\uffff\1\33",
			"\1\32\171\uffff\1\32\2\uffff\1\34\10\uffff\1\33",
			"\1\32\171\uffff\1\32\2\uffff\1\34\10\uffff\1\33",
			"\1\32\171\uffff\1\32\2\uffff\1\34\10\uffff\1\33",
			"\1\32\171\uffff\1\32\2\uffff\1\34\10\uffff\1\33",
			"\1\32\171\uffff\1\32\2\uffff\1\34\10\uffff\1\33",
			"\1\32\171\uffff\1\32\2\uffff\1\34\10\uffff\1\33",
			"\1\32\171\uffff\1\32\2\uffff\1\34\10\uffff\1\33",
			"\1\32\171\uffff\1\32\2\uffff\1\34\10\uffff\1\33",
			"\1\32\171\uffff\1\32\2\uffff\1\34\10\uffff\1\33",
			"\1\32\171\uffff\1\32\2\uffff\1\34\10\uffff\1\33",
			"\1\32\171\uffff\1\32\2\uffff\1\34\10\uffff\1\33",
			"\1\32\171\uffff\1\32\2\uffff\1\34\10\uffff\1\33",
			"\1\32\171\uffff\1\32\2\uffff\1\34\10\uffff\1\33",
			"\1\32\171\uffff\1\32\2\uffff\1\34\10\uffff\1\33",
			"\1\32\171\uffff\1\32\2\uffff\1\34\10\uffff\1\33",
			"\1\32\171\uffff\1\32\2\uffff\1\34\10\uffff\1\33",
			"\1\32\171\uffff\1\32\2\uffff\1\34\10\uffff\1\33",
			"",
			"",
			""
	};

	static final short[] DFA61_eot = DFA.unpackEncodedString(DFA61_eotS);
	static final short[] DFA61_eof = DFA.unpackEncodedString(DFA61_eofS);
	static final char[] DFA61_min = DFA.unpackEncodedStringToUnsignedChars(DFA61_minS);
	static final char[] DFA61_max = DFA.unpackEncodedStringToUnsignedChars(DFA61_maxS);
	static final short[] DFA61_accept = DFA.unpackEncodedString(DFA61_acceptS);
	static final short[] DFA61_special = DFA.unpackEncodedString(DFA61_specialS);
	static final short[][] DFA61_transition;

	static {
		int numStates = DFA61_transitionS.length;
		DFA61_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA61_transition[i] = DFA.unpackEncodedString(DFA61_transitionS[i]);
		}
	}

	protected class DFA61 extends DFA {

		public DFA61(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 61;
			this.eot = DFA61_eot;
			this.eof = DFA61_eof;
			this.min = DFA61_min;
			this.max = DFA61_max;
			this.accept = DFA61_accept;
			this.special = DFA61_special;
			this.transition = DFA61_transition;
		}
		@Override
		public String getDescription() {
			return "596:1: deleteOp returns [Operation.RawDeletion op] : (c= cident |c= cident '[' t= term ']' |c= cident '.' field= fident );";
		}
	}

	static final String DFA170_eotS =
		"\35\uffff";
	static final String DFA170_eofS =
		"\1\uffff\32\34\2\uffff";
	static final String DFA170_minS =
		"\1\26\32\u00c2\2\uffff";
	static final String DFA170_maxS =
		"\1\u00ab\32\u00c5\2\uffff";
	static final String DFA170_acceptS =
		"\33\uffff\1\1\1\2";
	static final String DFA170_specialS =
		"\35\uffff}>";
	static final String[] DFA170_transitionS = {
			"\1\1\4\uffff\2\3\4\uffff\1\3\1\uffff\1\4\3\uffff\1\5\1\6\1\7\1\uffff"+
			"\1\3\1\31\1\3\1\uffff\2\3\1\31\1\10\1\uffff\1\3\1\27\1\11\4\uffff\1\31"+
			"\1\12\1\uffff\1\13\2\uffff\3\3\1\14\1\uffff\1\3\1\uffff\2\3\1\uffff\1"+
			"\3\3\uffff\1\15\2\3\1\uffff\1\16\2\uffff\2\31\1\3\1\uffff\3\3\1\uffff"+
			"\3\3\6\uffff\1\3\1\uffff\1\3\4\uffff\1\3\2\uffff\5\3\5\uffff\1\3\1\uffff"+
			"\2\3\2\uffff\1\3\1\17\4\3\1\20\1\30\1\21\1\26\1\22\2\uffff\1\3\1\uffff"+
			"\1\31\2\3\4\uffff\2\3\1\uffff\1\23\1\3\1\24\1\25\3\uffff\1\31\10\uffff"+
			"\1\32\1\2",
			"\1\33\2\uffff\1\34",
			"\1\33\2\uffff\1\34",
			"\1\33\2\uffff\1\34",
			"\1\33\2\uffff\1\34",
			"\1\33\2\uffff\1\34",
			"\1\33\2\uffff\1\34",
			"\1\33\2\uffff\1\34",
			"\1\33\2\uffff\1\34",
			"\1\33\2\uffff\1\34",
			"\1\33\2\uffff\1\34",
			"\1\33\2\uffff\1\34",
			"\1\33\2\uffff\1\34",
			"\1\33\2\uffff\1\34",
			"\1\33\2\uffff\1\34",
			"\1\33\2\uffff\1\34",
			"\1\33\2\uffff\1\34",
			"\1\33\2\uffff\1\34",
			"\1\33\2\uffff\1\34",
			"\1\33\2\uffff\1\34",
			"\1\33\2\uffff\1\34",
			"\1\33\2\uffff\1\34",
			"\1\33\2\uffff\1\34",
			"\1\33\2\uffff\1\34",
			"\1\33\2\uffff\1\34",
			"\1\33\2\uffff\1\34",
			"\1\33\2\uffff\1\34",
			"",
			""
	};

	static final short[] DFA170_eot = DFA.unpackEncodedString(DFA170_eotS);
	static final short[] DFA170_eof = DFA.unpackEncodedString(DFA170_eofS);
	static final char[] DFA170_min = DFA.unpackEncodedStringToUnsignedChars(DFA170_minS);
	static final char[] DFA170_max = DFA.unpackEncodedStringToUnsignedChars(DFA170_maxS);
	static final short[] DFA170_accept = DFA.unpackEncodedString(DFA170_acceptS);
	static final short[] DFA170_special = DFA.unpackEncodedString(DFA170_specialS);
	static final short[][] DFA170_transition;

	static {
		int numStates = DFA170_transitionS.length;
		DFA170_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA170_transition[i] = DFA.unpackEncodedString(DFA170_transitionS[i]);
		}
	}

	protected class DFA170 extends DFA {

		public DFA170(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 170;
			this.eot = DFA170_eot;
			this.eof = DFA170_eof;
			this.min = DFA170_min;
			this.max = DFA170_max;
			this.accept = DFA170_accept;
			this.special = DFA170_special;
			this.transition = DFA170_transition;
		}
		@Override
		public String getDescription() {
			return "1327:7: ( ksName[name] '.' )?";
		}
	}

	static final String DFA171_eotS =
		"\35\uffff";
	static final String DFA171_eofS =
		"\1\uffff\32\34\2\uffff";
	static final String DFA171_minS =
		"\1\26\32\32\2\uffff";
	static final String DFA171_maxS =
		"\1\u00ab\32\u00c5\2\uffff";
	static final String DFA171_acceptS =
		"\33\uffff\1\1\1\2";
	static final String DFA171_specialS =
		"\35\uffff}>";
	static final String[] DFA171_transitionS = {
			"\1\1\4\uffff\2\3\4\uffff\1\3\1\uffff\1\4\3\uffff\1\5\1\6\1\7\1\uffff"+
			"\1\3\1\31\1\3\1\uffff\2\3\1\31\1\10\1\uffff\1\3\1\27\1\11\4\uffff\1\31"+
			"\1\12\1\uffff\1\13\2\uffff\3\3\1\14\1\uffff\1\3\1\uffff\2\3\1\uffff\1"+
			"\3\3\uffff\1\15\2\3\1\uffff\1\16\2\uffff\2\31\1\3\1\uffff\3\3\1\uffff"+
			"\3\3\6\uffff\1\3\1\uffff\1\3\4\uffff\1\3\2\uffff\5\3\5\uffff\1\3\1\uffff"+
			"\2\3\2\uffff\1\3\1\17\4\3\1\20\1\30\1\21\1\26\1\22\2\uffff\1\3\1\uffff"+
			"\1\31\2\3\4\uffff\2\3\1\uffff\1\23\1\3\1\24\1\25\3\uffff\1\31\10\uffff"+
			"\1\32\1\2",
			"\1\34\2\uffff\2\34\2\uffff\1\34\33\uffff\1\34\7\uffff\1\34\5\uffff\1"+
			"\34\12\uffff\1\34\6\uffff\1\34\12\uffff\1\34\3\uffff\1\34\3\uffff\1\34"+
			"\2\uffff\1\34\4\uffff\2\34\6\uffff\1\34\13\uffff\1\34\14\uffff\1\34\5"+
			"\uffff\2\34\32\uffff\1\34\6\uffff\1\33\2\uffff\1\34",
			"\1\34\2\uffff\2\34\2\uffff\1\34\33\uffff\1\34\7\uffff\1\34\5\uffff\1"+
			"\34\12\uffff\1\34\6\uffff\1\34\12\uffff\1\34\3\uffff\1\34\3\uffff\1\34"+
			"\2\uffff\1\34\4\uffff\2\34\6\uffff\1\34\13\uffff\1\34\14\uffff\1\34\5"+
			"\uffff\2\34\32\uffff\1\34\6\uffff\1\33\2\uffff\1\34",
			"\1\34\2\uffff\2\34\2\uffff\1\34\33\uffff\1\34\7\uffff\1\34\5\uffff\1"+
			"\34\12\uffff\1\34\6\uffff\1\34\12\uffff\1\34\3\uffff\1\34\3\uffff\1\34"+
			"\2\uffff\1\34\4\uffff\2\34\6\uffff\1\34\13\uffff\1\34\14\uffff\1\34\5"+
			"\uffff\2\34\32\uffff\1\34\6\uffff\1\33\2\uffff\1\34",
			"\1\34\2\uffff\2\34\2\uffff\1\34\33\uffff\1\34\7\uffff\1\34\5\uffff\1"+
			"\34\12\uffff\1\34\6\uffff\1\34\12\uffff\1\34\3\uffff\1\34\3\uffff\1\34"+
			"\2\uffff\1\34\4\uffff\2\34\6\uffff\1\34\13\uffff\1\34\14\uffff\1\34\5"+
			"\uffff\2\34\32\uffff\1\34\6\uffff\1\33\2\uffff\1\34",
			"\1\34\2\uffff\2\34\2\uffff\1\34\33\uffff\1\34\7\uffff\1\34\5\uffff\1"+
			"\34\12\uffff\1\34\6\uffff\1\34\12\uffff\1\34\3\uffff\1\34\3\uffff\1\34"+
			"\2\uffff\1\34\4\uffff\2\34\6\uffff\1\34\13\uffff\1\34\14\uffff\1\34\5"+
			"\uffff\2\34\32\uffff\1\34\6\uffff\1\33\2\uffff\1\34",
			"\1\34\2\uffff\2\34\2\uffff\1\34\33\uffff\1\34\7\uffff\1\34\5\uffff\1"+
			"\34\12\uffff\1\34\6\uffff\1\34\12\uffff\1\34\3\uffff\1\34\3\uffff\1\34"+
			"\2\uffff\1\34\4\uffff\2\34\6\uffff\1\34\13\uffff\1\34\14\uffff\1\34\5"+
			"\uffff\2\34\32\uffff\1\34\6\uffff\1\33\2\uffff\1\34",
			"\1\34\2\uffff\2\34\2\uffff\1\34\33\uffff\1\34\7\uffff\1\34\5\uffff\1"+
			"\34\12\uffff\1\34\6\uffff\1\34\12\uffff\1\34\3\uffff\1\34\3\uffff\1\34"+
			"\2\uffff\1\34\4\uffff\2\34\6\uffff\1\34\13\uffff\1\34\14\uffff\1\34\5"+
			"\uffff\2\34\32\uffff\1\34\6\uffff\1\33\2\uffff\1\34",
			"\1\34\2\uffff\2\34\2\uffff\1\34\33\uffff\1\34\7\uffff\1\34\5\uffff\1"+
			"\34\12\uffff\1\34\6\uffff\1\34\12\uffff\1\34\3\uffff\1\34\3\uffff\1\34"+
			"\2\uffff\1\34\4\uffff\2\34\6\uffff\1\34\13\uffff\1\34\14\uffff\1\34\5"+
			"\uffff\2\34\32\uffff\1\34\6\uffff\1\33\2\uffff\1\34",
			"\1\34\2\uffff\2\34\2\uffff\1\34\33\uffff\1\34\7\uffff\1\34\5\uffff\1"+
			"\34\12\uffff\1\34\6\uffff\1\34\12\uffff\1\34\3\uffff\1\34\3\uffff\1\34"+
			"\2\uffff\1\34\4\uffff\2\34\6\uffff\1\34\13\uffff\1\34\14\uffff\1\34\5"+
			"\uffff\2\34\32\uffff\1\34\6\uffff\1\33\2\uffff\1\34",
			"\1\34\2\uffff\2\34\2\uffff\1\34\33\uffff\1\34\7\uffff\1\34\5\uffff\1"+
			"\34\12\uffff\1\34\6\uffff\1\34\12\uffff\1\34\3\uffff\1\34\3\uffff\1\34"+
			"\2\uffff\1\34\4\uffff\2\34\6\uffff\1\34\13\uffff\1\34\14\uffff\1\34\5"+
			"\uffff\2\34\32\uffff\1\34\6\uffff\1\33\2\uffff\1\34",
			"\1\34\2\uffff\2\34\2\uffff\1\34\33\uffff\1\34\7\uffff\1\34\5\uffff\1"+
			"\34\12\uffff\1\34\6\uffff\1\34\12\uffff\1\34\3\uffff\1\34\3\uffff\1\34"+
			"\2\uffff\1\34\4\uffff\2\34\6\uffff\1\34\13\uffff\1\34\14\uffff\1\34\5"+
			"\uffff\2\34\32\uffff\1\34\6\uffff\1\33\2\uffff\1\34",
			"\1\34\2\uffff\2\34\2\uffff\1\34\33\uffff\1\34\7\uffff\1\34\5\uffff\1"+
			"\34\12\uffff\1\34\6\uffff\1\34\12\uffff\1\34\3\uffff\1\34\3\uffff\1\34"+
			"\2\uffff\1\34\4\uffff\2\34\6\uffff\1\34\13\uffff\1\34\14\uffff\1\34\5"+
			"\uffff\2\34\32\uffff\1\34\6\uffff\1\33\2\uffff\1\34",
			"\1\34\2\uffff\2\34\2\uffff\1\34\33\uffff\1\34\7\uffff\1\34\5\uffff\1"+
			"\34\12\uffff\1\34\6\uffff\1\34\12\uffff\1\34\3\uffff\1\34\3\uffff\1\34"+
			"\2\uffff\1\34\4\uffff\2\34\6\uffff\1\34\13\uffff\1\34\14\uffff\1\34\5"+
			"\uffff\2\34\32\uffff\1\34\6\uffff\1\33\2\uffff\1\34",
			"\1\34\2\uffff\2\34\2\uffff\1\34\33\uffff\1\34\7\uffff\1\34\5\uffff\1"+
			"\34\12\uffff\1\34\6\uffff\1\34\12\uffff\1\34\3\uffff\1\34\3\uffff\1\34"+
			"\2\uffff\1\34\4\uffff\2\34\6\uffff\1\34\13\uffff\1\34\14\uffff\1\34\5"+
			"\uffff\2\34\32\uffff\1\34\6\uffff\1\33\2\uffff\1\34",
			"\1\34\2\uffff\2\34\2\uffff\1\34\33\uffff\1\34\7\uffff\1\34\5\uffff\1"+
			"\34\12\uffff\1\34\6\uffff\1\34\12\uffff\1\34\3\uffff\1\34\3\uffff\1\34"+
			"\2\uffff\1\34\4\uffff\2\34\6\uffff\1\34\13\uffff\1\34\14\uffff\1\34\5"+
			"\uffff\2\34\32\uffff\1\34\6\uffff\1\33\2\uffff\1\34",
			"\1\34\2\uffff\2\34\2\uffff\1\34\33\uffff\1\34\7\uffff\1\34\5\uffff\1"+
			"\34\12\uffff\1\34\6\uffff\1\34\12\uffff\1\34\3\uffff\1\34\3\uffff\1\34"+
			"\2\uffff\1\34\4\uffff\2\34\6\uffff\1\34\13\uffff\1\34\14\uffff\1\34\5"+
			"\uffff\2\34\32\uffff\1\34\6\uffff\1\33\2\uffff\1\34",
			"\1\34\2\uffff\2\34\2\uffff\1\34\33\uffff\1\34\7\uffff\1\34\5\uffff\1"+
			"\34\12\uffff\1\34\6\uffff\1\34\12\uffff\1\34\3\uffff\1\34\3\uffff\1\34"+
			"\2\uffff\1\34\4\uffff\2\34\6\uffff\1\34\13\uffff\1\34\14\uffff\1\34\5"+
			"\uffff\2\34\32\uffff\1\34\6\uffff\1\33\2\uffff\1\34",
			"\1\34\2\uffff\2\34\2\uffff\1\34\33\uffff\1\34\7\uffff\1\34\5\uffff\1"+
			"\34\12\uffff\1\34\6\uffff\1\34\12\uffff\1\34\3\uffff\1\34\3\uffff\1\34"+
			"\2\uffff\1\34\4\uffff\2\34\6\uffff\1\34\13\uffff\1\34\14\uffff\1\34\5"+
			"\uffff\2\34\32\uffff\1\34\6\uffff\1\33\2\uffff\1\34",
			"\1\34\2\uffff\2\34\2\uffff\1\34\33\uffff\1\34\7\uffff\1\34\5\uffff\1"+
			"\34\12\uffff\1\34\6\uffff\1\34\12\uffff\1\34\3\uffff\1\34\3\uffff\1\34"+
			"\2\uffff\1\34\4\uffff\2\34\6\uffff\1\34\13\uffff\1\34\14\uffff\1\34\5"+
			"\uffff\2\34\32\uffff\1\34\6\uffff\1\33\2\uffff\1\34",
			"\1\34\2\uffff\2\34\2\uffff\1\34\33\uffff\1\34\7\uffff\1\34\5\uffff\1"+
			"\34\12\uffff\1\34\6\uffff\1\34\12\uffff\1\34\3\uffff\1\34\3\uffff\1\34"+
			"\2\uffff\1\34\4\uffff\2\34\6\uffff\1\34\13\uffff\1\34\14\uffff\1\34\5"+
			"\uffff\2\34\32\uffff\1\34\6\uffff\1\33\2\uffff\1\34",
			"\1\34\2\uffff\2\34\2\uffff\1\34\33\uffff\1\34\7\uffff\1\34\5\uffff\1"+
			"\34\12\uffff\1\34\6\uffff\1\34\12\uffff\1\34\3\uffff\1\34\3\uffff\1\34"+
			"\2\uffff\1\34\4\uffff\2\34\6\uffff\1\34\13\uffff\1\34\14\uffff\1\34\5"+
			"\uffff\2\34\32\uffff\1\34\6\uffff\1\33\2\uffff\1\34",
			"\1\34\2\uffff\2\34\2\uffff\1\34\33\uffff\1\34\7\uffff\1\34\5\uffff\1"+
			"\34\12\uffff\1\34\6\uffff\1\34\12\uffff\1\34\3\uffff\1\34\3\uffff\1\34"+
			"\2\uffff\1\34\4\uffff\2\34\6\uffff\1\34\13\uffff\1\34\14\uffff\1\34\5"+
			"\uffff\2\34\32\uffff\1\34\6\uffff\1\33\2\uffff\1\34",
			"\1\34\2\uffff\2\34\2\uffff\1\34\33\uffff\1\34\7\uffff\1\34\5\uffff\1"+
			"\34\12\uffff\1\34\6\uffff\1\34\12\uffff\1\34\3\uffff\1\34\3\uffff\1\34"+
			"\2\uffff\1\34\4\uffff\2\34\6\uffff\1\34\13\uffff\1\34\14\uffff\1\34\5"+
			"\uffff\2\34\32\uffff\1\34\6\uffff\1\33\2\uffff\1\34",
			"\1\34\2\uffff\2\34\2\uffff\1\34\33\uffff\1\34\7\uffff\1\34\5\uffff\1"+
			"\34\12\uffff\1\34\6\uffff\1\34\12\uffff\1\34\3\uffff\1\34\3\uffff\1\34"+
			"\2\uffff\1\34\4\uffff\2\34\6\uffff\1\34\13\uffff\1\34\14\uffff\1\34\5"+
			"\uffff\2\34\32\uffff\1\34\6\uffff\1\33\2\uffff\1\34",
			"\1\34\2\uffff\2\34\2\uffff\1\34\33\uffff\1\34\7\uffff\1\34\5\uffff\1"+
			"\34\12\uffff\1\34\6\uffff\1\34\12\uffff\1\34\3\uffff\1\34\3\uffff\1\34"+
			"\2\uffff\1\34\4\uffff\2\34\6\uffff\1\34\13\uffff\1\34\14\uffff\1\34\5"+
			"\uffff\2\34\32\uffff\1\34\6\uffff\1\33\2\uffff\1\34",
			"\1\34\2\uffff\2\34\2\uffff\1\34\33\uffff\1\34\7\uffff\1\34\5\uffff\1"+
			"\34\12\uffff\1\34\6\uffff\1\34\12\uffff\1\34\3\uffff\1\34\3\uffff\1\34"+
			"\2\uffff\1\34\4\uffff\2\34\6\uffff\1\34\13\uffff\1\34\14\uffff\1\34\5"+
			"\uffff\2\34\32\uffff\1\34\6\uffff\1\33\2\uffff\1\34",
			"",
			""
	};

	static final short[] DFA171_eot = DFA.unpackEncodedString(DFA171_eotS);
	static final short[] DFA171_eof = DFA.unpackEncodedString(DFA171_eofS);
	static final char[] DFA171_min = DFA.unpackEncodedStringToUnsignedChars(DFA171_minS);
	static final char[] DFA171_max = DFA.unpackEncodedStringToUnsignedChars(DFA171_maxS);
	static final short[] DFA171_accept = DFA.unpackEncodedString(DFA171_acceptS);
	static final short[] DFA171_special = DFA.unpackEncodedString(DFA171_specialS);
	static final short[][] DFA171_transition;

	static {
		int numStates = DFA171_transitionS.length;
		DFA171_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA171_transition[i] = DFA.unpackEncodedString(DFA171_transitionS[i]);
		}
	}

	protected class DFA171 extends DFA {

		public DFA171(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 171;
			this.eot = DFA171_eot;
			this.eof = DFA171_eof;
			this.min = DFA171_min;
			this.max = DFA171_max;
			this.accept = DFA171_accept;
			this.special = DFA171_special;
			this.transition = DFA171_transition;
		}
		@Override
		public String getDescription() {
			return "1332:7: ( ksName[name] '.' )?";
		}
	}

	static final String DFA189_eotS =
		"\43\uffff";
	static final String DFA189_eofS =
		"\43\uffff";
	static final String DFA189_minS =
		"\1\6\2\uffff\1\6\4\uffff\31\u00bb\1\u00c2\1\uffff";
	static final String DFA189_maxS =
		"\1\u00cf\2\uffff\1\u00d0\4\uffff\32\u00c4\1\uffff";
	static final String DFA189_acceptS =
		"\1\uffff\1\1\1\2\1\uffff\1\4\1\5\1\6\1\7\32\uffff\1\3";
	static final String DFA189_specialS =
		"\43\uffff}>";
	static final String[] DFA189_transitionS = {
			"\1\1\4\uffff\1\1\4\uffff\1\1\3\uffff\1\1\2\uffff\1\1\115\uffff\2\1\4"+
			"\uffff\1\5\12\uffff\2\1\62\uffff\1\7\4\uffff\1\1\2\uffff\1\1\10\uffff"+
			"\1\4\10\uffff\1\6\6\uffff\1\2\3\uffff\1\3",
			"",
			"",
			"\1\2\4\uffff\1\2\4\uffff\1\2\3\uffff\1\2\1\uffff\1\10\1\2\3\uffff\2"+
			"\12\4\uffff\1\12\1\uffff\1\13\3\uffff\1\14\1\15\1\16\1\uffff\1\12\1\41"+
			"\1\12\1\uffff\2\12\1\40\1\17\1\uffff\1\12\1\36\1\20\4\uffff\1\41\1\21"+
			"\1\uffff\1\22\2\uffff\3\12\1\23\1\uffff\1\12\1\uffff\2\12\1\uffff\1\12"+
			"\3\uffff\1\24\2\12\1\uffff\1\25\2\uffff\2\41\1\12\1\uffff\3\12\1\uffff"+
			"\3\12\4\uffff\2\2\1\12\1\uffff\1\12\1\uffff\1\2\2\uffff\1\12\2\uffff"+
			"\5\12\2\2\3\uffff\1\12\1\uffff\2\12\2\uffff\1\12\1\26\4\12\1\27\1\37"+
			"\1\30\1\35\1\31\1\uffff\1\2\1\12\1\uffff\1\41\2\12\4\uffff\2\12\1\uffff"+
			"\1\32\1\12\1\33\1\34\3\uffff\1\41\10\uffff\1\2\1\11\3\uffff\1\2\2\uffff"+
			"\1\2\10\uffff\1\2\4\uffff\1\2\3\uffff\1\2\6\uffff\1\2\3\uffff\2\2",
			"",
			"",
			"",
			"",
			"\1\2\6\uffff\1\2\1\uffff\1\42",
			"\1\2\6\uffff\1\2\1\uffff\1\42",
			"\1\2\6\uffff\1\2\1\uffff\1\42",
			"\1\2\6\uffff\1\2\1\uffff\1\42",
			"\1\2\6\uffff\1\2\1\uffff\1\42",
			"\1\2\6\uffff\1\2\1\uffff\1\42",
			"\1\2\6\uffff\1\2\1\uffff\1\42",
			"\1\2\6\uffff\1\2\1\uffff\1\42",
			"\1\2\6\uffff\1\2\1\uffff\1\42",
			"\1\2\6\uffff\1\2\1\uffff\1\42",
			"\1\2\6\uffff\1\2\1\uffff\1\42",
			"\1\2\6\uffff\1\2\1\uffff\1\42",
			"\1\2\6\uffff\1\2\1\uffff\1\42",
			"\1\2\6\uffff\1\2\1\uffff\1\42",
			"\1\2\6\uffff\1\2\1\uffff\1\42",
			"\1\2\6\uffff\1\2\1\uffff\1\42",
			"\1\2\6\uffff\1\2\1\uffff\1\42",
			"\1\2\6\uffff\1\2\1\uffff\1\42",
			"\1\2\6\uffff\1\2\1\uffff\1\42",
			"\1\2\6\uffff\1\2\1\uffff\1\42",
			"\1\2\6\uffff\1\2\1\uffff\1\42",
			"\1\2\6\uffff\1\2\1\uffff\1\42",
			"\1\2\6\uffff\1\2\1\uffff\1\42",
			"\1\2\6\uffff\1\2\1\uffff\1\42",
			"\1\2\6\uffff\1\2\1\uffff\1\42",
			"\1\2\1\uffff\1\42",
			""
	};

	static final short[] DFA189_eot = DFA.unpackEncodedString(DFA189_eotS);
	static final short[] DFA189_eof = DFA.unpackEncodedString(DFA189_eofS);
	static final char[] DFA189_min = DFA.unpackEncodedStringToUnsignedChars(DFA189_minS);
	static final char[] DFA189_max = DFA.unpackEncodedStringToUnsignedChars(DFA189_maxS);
	static final short[] DFA189_accept = DFA.unpackEncodedString(DFA189_acceptS);
	static final short[] DFA189_special = DFA.unpackEncodedString(DFA189_specialS);
	static final short[][] DFA189_transition;

	static {
		int numStates = DFA189_transitionS.length;
		DFA189_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA189_transition[i] = DFA.unpackEncodedString(DFA189_transitionS[i]);
		}
	}

	protected class DFA189 extends DFA {

		public DFA189(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 189;
			this.eot = DFA189_eot;
			this.eof = DFA189_eof;
			this.min = DFA189_min;
			this.max = DFA189_max;
			this.accept = DFA189_accept;
			this.special = DFA189_special;
			this.transition = DFA189_transition;
		}
		@Override
		public String getDescription() {
			return "1437:1: value returns [Term.Raw value] : (c= constant |l= collectionLiteral |u= usertypeLiteral |t= tupleLiteral | K_NULL | ':' id= noncol_ident | QMARK );";
		}
	}

	static final String DFA191_eotS =
		"\34\uffff";
	static final String DFA191_eofS =
		"\1\uffff\31\33\2\uffff";
	static final String DFA191_minS =
		"\1\26\31\u00bb\2\uffff";
	static final String DFA191_maxS =
		"\1\u00ab\31\u00c5\2\uffff";
	static final String DFA191_acceptS =
		"\32\uffff\1\1\1\2";
	static final String DFA191_specialS =
		"\34\uffff}>";
	static final String[] DFA191_transitionS = {
			"\1\1\4\uffff\2\3\4\uffff\1\3\1\uffff\1\4\3\uffff\1\5\1\6\1\7\1\uffff"+
			"\1\3\1\32\1\3\1\uffff\2\3\1\31\1\10\1\uffff\1\3\1\27\1\11\4\uffff\1\32"+
			"\1\12\1\uffff\1\13\2\uffff\3\3\1\14\1\uffff\1\3\1\uffff\2\3\1\uffff\1"+
			"\3\3\uffff\1\15\2\3\1\uffff\1\16\2\uffff\2\32\1\3\1\uffff\3\3\1\uffff"+
			"\3\3\6\uffff\1\3\1\uffff\1\3\4\uffff\1\3\2\uffff\5\3\5\uffff\1\3\1\uffff"+
			"\2\3\2\uffff\1\3\1\17\4\3\1\20\1\30\1\21\1\26\1\22\1\uffff\1\33\1\3\1"+
			"\uffff\1\32\2\3\4\uffff\2\3\1\uffff\1\23\1\3\1\24\1\25\3\uffff\1\32\10"+
			"\uffff\1\32\1\2",
			"\1\33\6\uffff\1\32\2\uffff\1\33",
			"\1\33\6\uffff\1\32\2\uffff\1\33",
			"\1\33\6\uffff\1\32\2\uffff\1\33",
			"\1\33\6\uffff\1\32\2\uffff\1\33",
			"\1\33\6\uffff\1\32\2\uffff\1\33",
			"\1\33\6\uffff\1\32\2\uffff\1\33",
			"\1\33\6\uffff\1\32\2\uffff\1\33",
			"\1\33\6\uffff\1\32\2\uffff\1\33",
			"\1\33\6\uffff\1\32\2\uffff\1\33",
			"\1\33\6\uffff\1\32\2\uffff\1\33",
			"\1\33\6\uffff\1\32\2\uffff\1\33",
			"\1\33\6\uffff\1\32\2\uffff\1\33",
			"\1\33\6\uffff\1\32\2\uffff\1\33",
			"\1\33\6\uffff\1\32\2\uffff\1\33",
			"\1\33\6\uffff\1\32\2\uffff\1\33",
			"\1\33\6\uffff\1\32\2\uffff\1\33",
			"\1\33\6\uffff\1\32\2\uffff\1\33",
			"\1\33\6\uffff\1\32\2\uffff\1\33",
			"\1\33\6\uffff\1\32\2\uffff\1\33",
			"\1\33\6\uffff\1\32\2\uffff\1\33",
			"\1\33\6\uffff\1\32\2\uffff\1\33",
			"\1\33\6\uffff\1\32\2\uffff\1\33",
			"\1\33\6\uffff\1\32\2\uffff\1\33",
			"\1\33\6\uffff\1\32\2\uffff\1\33",
			"\1\33\6\uffff\1\32\2\uffff\1\33",
			"",
			""
	};

	static final short[] DFA191_eot = DFA.unpackEncodedString(DFA191_eotS);
	static final short[] DFA191_eof = DFA.unpackEncodedString(DFA191_eofS);
	static final char[] DFA191_min = DFA.unpackEncodedStringToUnsignedChars(DFA191_minS);
	static final char[] DFA191_max = DFA.unpackEncodedStringToUnsignedChars(DFA191_maxS);
	static final short[] DFA191_accept = DFA.unpackEncodedString(DFA191_acceptS);
	static final short[] DFA191_special = DFA.unpackEncodedString(DFA191_specialS);
	static final short[][] DFA191_transition;

	static {
		int numStates = DFA191_transitionS.length;
		DFA191_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA191_transition[i] = DFA.unpackEncodedString(DFA191_transitionS[i]);
		}
	}

	protected class DFA191 extends DFA {

		public DFA191(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 191;
			this.eot = DFA191_eot;
			this.eof = DFA191_eof;
			this.min = DFA191_min;
			this.max = DFA191_max;
			this.accept = DFA191_accept;
			this.special = DFA191_special;
			this.transition = DFA191_transition;
		}
		@Override
		public String getDescription() {
			return "1454:7: (ks= keyspaceName '.' )?";
		}
	}

	static final String DFA193_eotS =
		"\72\uffff";
	static final String DFA193_eofS =
		"\72\uffff";
	static final String DFA193_minS =
		"\1\26\31\u00bb\1\u00c2\1\u00bb\1\u00c2\1\26\1\6\31\u00bb\2\uffff";
	static final String DFA193_maxS =
		"\1\u00ab\32\u00c2\1\u00bb\1\u00c2\1\u00ab\1\u00cf\31\u00bb\2\uffff";
	static final String DFA193_acceptS =
		"\70\uffff\1\1\1\2";
	static final String DFA193_specialS =
		"\72\uffff}>";
	static final String[] DFA193_transitionS = {
			"\1\1\4\uffff\2\3\4\uffff\1\3\1\uffff\1\4\3\uffff\1\5\1\6\1\7\1\uffff"+
			"\1\3\1\34\1\3\1\uffff\2\3\1\31\1\10\1\uffff\1\3\1\27\1\11\4\uffff\1\34"+
			"\1\12\1\uffff\1\13\2\uffff\3\3\1\14\1\uffff\1\3\1\uffff\2\3\1\uffff\1"+
			"\3\3\uffff\1\15\2\3\1\uffff\1\16\2\uffff\2\34\1\3\1\uffff\3\3\1\uffff"+
			"\3\3\6\uffff\1\3\1\uffff\1\3\4\uffff\1\3\2\uffff\5\3\5\uffff\1\3\1\uffff"+
			"\2\3\2\uffff\1\3\1\17\4\3\1\20\1\30\1\21\1\26\1\22\1\uffff\1\33\1\3\1"+
			"\uffff\1\34\2\3\4\uffff\2\3\1\uffff\1\23\1\3\1\24\1\25\3\uffff\1\34\10"+
			"\uffff\1\32\1\2",
			"\1\36\6\uffff\1\35",
			"\1\36\6\uffff\1\35",
			"\1\36\6\uffff\1\35",
			"\1\36\6\uffff\1\35",
			"\1\36\6\uffff\1\35",
			"\1\36\6\uffff\1\35",
			"\1\36\6\uffff\1\35",
			"\1\36\6\uffff\1\35",
			"\1\36\6\uffff\1\35",
			"\1\36\6\uffff\1\35",
			"\1\36\6\uffff\1\35",
			"\1\36\6\uffff\1\35",
			"\1\36\6\uffff\1\35",
			"\1\36\6\uffff\1\35",
			"\1\36\6\uffff\1\35",
			"\1\36\6\uffff\1\35",
			"\1\36\6\uffff\1\35",
			"\1\36\6\uffff\1\35",
			"\1\36\6\uffff\1\35",
			"\1\36\6\uffff\1\35",
			"\1\36\6\uffff\1\35",
			"\1\36\6\uffff\1\35",
			"\1\36\6\uffff\1\35",
			"\1\36\6\uffff\1\35",
			"\1\36\6\uffff\1\35",
			"\1\35",
			"\1\36",
			"\1\35",
			"\1\37\4\uffff\2\41\4\uffff\1\41\1\uffff\1\42\3\uffff\1\43\1\44\1\45"+
			"\1\uffff\1\41\1\uffff\1\41\1\uffff\2\41\1\67\1\46\1\uffff\1\41\1\65\1"+
			"\47\5\uffff\1\50\1\uffff\1\51\2\uffff\3\41\1\52\1\uffff\1\41\1\uffff"+
			"\2\41\1\uffff\1\41\3\uffff\1\53\2\41\1\uffff\1\54\4\uffff\1\41\1\uffff"+
			"\3\41\1\uffff\3\41\6\uffff\1\41\1\uffff\1\41\4\uffff\1\41\2\uffff\5\41"+
			"\5\uffff\1\41\1\uffff\2\41\2\uffff\1\41\1\55\4\41\1\56\1\66\1\57\1\64"+
			"\1\60\1\uffff\1\33\1\41\2\uffff\2\41\4\uffff\2\41\1\uffff\1\61\1\41\1"+
			"\62\1\63\15\uffff\1\40",
			"\1\71\4\uffff\1\71\4\uffff\1\71\3\uffff\1\71\1\uffff\2\71\3\uffff\2"+
			"\71\4\uffff\1\71\1\uffff\1\71\3\uffff\3\71\1\uffff\3\71\1\uffff\4\71"+
			"\1\uffff\3\71\4\uffff\2\71\1\uffff\1\71\2\uffff\4\71\1\uffff\1\71\1\uffff"+
			"\2\71\1\uffff\1\71\3\uffff\3\71\1\uffff\1\71\2\uffff\3\71\1\uffff\3\71"+
			"\1\uffff\3\71\4\uffff\3\71\1\uffff\1\71\1\uffff\1\71\2\uffff\1\71\2\uffff"+
			"\7\71\3\uffff\1\71\1\uffff\2\71\2\uffff\13\71\1\uffff\2\71\1\uffff\3"+
			"\71\4\uffff\2\71\1\uffff\4\71\3\uffff\1\71\10\uffff\2\71\3\uffff\1\71"+
			"\2\uffff\1\71\10\uffff\1\71\1\70\3\uffff\1\71\3\uffff\1\71\6\uffff\1"+
			"\71\3\uffff\1\71",
			"\1\36",
			"\1\36",
			"\1\36",
			"\1\36",
			"\1\36",
			"\1\36",
			"\1\36",
			"\1\36",
			"\1\36",
			"\1\36",
			"\1\36",
			"\1\36",
			"\1\36",
			"\1\36",
			"\1\36",
			"\1\36",
			"\1\36",
			"\1\36",
			"\1\36",
			"\1\36",
			"\1\36",
			"\1\36",
			"\1\36",
			"\1\36",
			"\1\36",
			"",
			""
	};

	static final short[] DFA193_eot = DFA.unpackEncodedString(DFA193_eotS);
	static final short[] DFA193_eof = DFA.unpackEncodedString(DFA193_eofS);
	static final char[] DFA193_min = DFA.unpackEncodedStringToUnsignedChars(DFA193_minS);
	static final char[] DFA193_max = DFA.unpackEncodedStringToUnsignedChars(DFA193_maxS);
	static final short[] DFA193_accept = DFA.unpackEncodedString(DFA193_acceptS);
	static final short[] DFA193_special = DFA.unpackEncodedString(DFA193_specialS);
	static final short[][] DFA193_transition;

	static {
		int numStates = DFA193_transitionS.length;
		DFA193_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA193_transition[i] = DFA.unpackEncodedString(DFA193_transitionS[i]);
		}
	}

	protected class DFA193 extends DFA {

		public DFA193(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 193;
			this.eot = DFA193_eot;
			this.eof = DFA193_eof;
			this.min = DFA193_min;
			this.max = DFA193_max;
			this.accept = DFA193_accept;
			this.special = DFA193_special;
			this.transition = DFA193_transition;
		}
		@Override
		public String getDescription() {
			return "1465:1: function returns [Term.Raw t] : (f= functionName '(' ')' |f= functionName '(' args= functionArgs ')' );";
		}
	}

	static final String DFA195_eotS =
		"\37\uffff";
	static final String DFA195_eofS =
		"\1\1\36\uffff";
	static final String DFA195_minS =
		"\1\35\1\uffff\1\6\1\uffff\31\u009f\1\uffff\1\u009f";
	static final String DFA195_maxS =
		"\1\u00d0\1\uffff\1\u00cf\1\uffff\31\u00c2\1\uffff\1\u00c2";
	static final String DFA195_acceptS =
		"\1\uffff\1\3\1\uffff\1\2\31\uffff\1\1\1\uffff";
	static final String DFA195_specialS =
		"\37\uffff}>";
	static final String[] DFA195_transitionS = {
			"\1\1\1\uffff\2\1\27\uffff\1\1\22\uffff\2\1\5\uffff\1\1\12\uffff\1\1\22"+
			"\uffff\1\1\2\uffff\1\1\4\uffff\1\1\34\uffff\1\1\11\uffff\1\1\15\uffff"+
			"\1\1\16\uffff\1\1\1\2\1\uffff\1\1\1\3\3\uffff\2\1\7\uffff\1\1\2\uffff"+
			"\1\1",
			"",
			"\1\35\4\uffff\1\35\4\uffff\1\35\3\uffff\1\35\1\uffff\1\4\1\35\3\uffff"+
			"\2\6\4\uffff\1\6\1\uffff\1\7\3\uffff\1\10\1\11\1\12\1\uffff\1\6\1\36"+
			"\1\6\1\uffff\2\6\1\34\1\13\1\uffff\1\6\1\32\1\14\4\uffff\1\36\1\15\1"+
			"\uffff\1\16\2\uffff\3\6\1\17\1\uffff\1\6\1\uffff\2\6\1\uffff\1\6\3\uffff"+
			"\1\20\2\6\1\uffff\1\21\2\uffff\2\36\1\6\1\uffff\3\6\1\uffff\3\6\4\uffff"+
			"\2\35\1\6\1\uffff\1\6\1\uffff\1\35\2\uffff\1\6\2\uffff\5\6\2\35\3\uffff"+
			"\1\6\1\uffff\2\6\2\uffff\1\6\1\22\4\6\1\23\1\33\1\24\1\31\1\25\1\uffff"+
			"\1\35\1\6\1\uffff\1\36\2\6\4\uffff\2\6\1\uffff\1\26\1\6\1\27\1\30\3\uffff"+
			"\1\36\10\uffff\1\35\1\5\3\uffff\1\35\2\uffff\1\35\10\uffff\1\35\4\uffff"+
			"\1\35\3\uffff\1\35\6\uffff\1\35\3\uffff\1\35",
			"",
			"\1\1\33\uffff\1\35\3\uffff\1\1\2\uffff\1\35",
			"\1\1\33\uffff\1\35\3\uffff\1\1\2\uffff\1\35",
			"\1\1\33\uffff\1\35\3\uffff\1\1\2\uffff\1\35",
			"\1\1\33\uffff\1\35\3\uffff\1\1\2\uffff\1\35",
			"\1\1\33\uffff\1\35\3\uffff\1\1\2\uffff\1\35",
			"\1\1\33\uffff\1\35\3\uffff\1\1\2\uffff\1\35",
			"\1\1\33\uffff\1\35\3\uffff\1\1\2\uffff\1\35",
			"\1\1\33\uffff\1\35\3\uffff\1\1\2\uffff\1\35",
			"\1\1\33\uffff\1\35\3\uffff\1\1\2\uffff\1\35",
			"\1\1\33\uffff\1\35\3\uffff\1\1\2\uffff\1\35",
			"\1\1\33\uffff\1\35\3\uffff\1\1\2\uffff\1\35",
			"\1\1\33\uffff\1\35\3\uffff\1\1\2\uffff\1\35",
			"\1\1\33\uffff\1\35\3\uffff\1\1\2\uffff\1\35",
			"\1\1\33\uffff\1\35\3\uffff\1\1\2\uffff\1\35",
			"\1\1\33\uffff\1\35\3\uffff\1\1\2\uffff\1\35",
			"\1\1\33\uffff\1\35\3\uffff\1\1\2\uffff\1\35",
			"\1\1\33\uffff\1\35\3\uffff\1\1\2\uffff\1\35",
			"\1\1\33\uffff\1\35\3\uffff\1\1\2\uffff\1\35",
			"\1\1\33\uffff\1\35\3\uffff\1\1\2\uffff\1\35",
			"\1\1\33\uffff\1\35\3\uffff\1\1\2\uffff\1\35",
			"\1\1\33\uffff\1\35\3\uffff\1\1\2\uffff\1\35",
			"\1\1\33\uffff\1\35\3\uffff\1\1\2\uffff\1\35",
			"\1\1\33\uffff\1\35\3\uffff\1\1\2\uffff\1\35",
			"\1\1\33\uffff\1\35\3\uffff\1\1\2\uffff\1\35",
			"\1\1\33\uffff\1\35\3\uffff\1\1\2\uffff\1\35",
			"",
			"\1\1\37\uffff\1\1\2\uffff\1\35"
	};

	static final short[] DFA195_eot = DFA.unpackEncodedString(DFA195_eotS);
	static final short[] DFA195_eof = DFA.unpackEncodedString(DFA195_eofS);
	static final char[] DFA195_min = DFA.unpackEncodedStringToUnsignedChars(DFA195_minS);
	static final char[] DFA195_max = DFA.unpackEncodedStringToUnsignedChars(DFA195_maxS);
	static final short[] DFA195_accept = DFA.unpackEncodedString(DFA195_acceptS);
	static final short[] DFA195_special = DFA.unpackEncodedString(DFA195_specialS);
	static final short[][] DFA195_transition;

	static {
		int numStates = DFA195_transitionS.length;
		DFA195_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA195_transition[i] = DFA.unpackEncodedString(DFA195_transitionS[i]);
		}
	}

	protected class DFA195 extends DFA {

		public DFA195(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 195;
			this.eot = DFA195_eot;
			this.eof = DFA195_eof;
			this.min = DFA195_min;
			this.max = DFA195_max;
			this.accept = DFA195_accept;
			this.special = DFA195_special;
			this.transition = DFA195_transition;
		}
		@Override
		public String getDescription() {
			return "()* loopback of 1481:9: ( '+' r= termMultiplication | '-' r= termMultiplication )*";
		}
	}

	static final String DFA198_eotS =
		"\110\uffff";
	static final String DFA198_eofS =
		"\3\uffff\1\1\42\uffff\1\1\7\uffff\32\42";
	static final String DFA198_minS =
		"\1\6\1\uffff\1\6\1\35\1\uffff\1\u00ba\31\u00bb\1\u00bc\2\u00bb\1\uffff"+
		"\1\u00bb\1\u00c2\1\u00bb\1\6\1\26\1\6\1\52\1\161\3\u00bb\32\35";
	static final String DFA198_maxS =
		"\1\u00cf\1\uffff\1\u00cf\1\u00d0\1\uffff\1\u00cc\2\u00c2\1\u00c6\27\u00c2"+
		"\2\u00c6\1\uffff\1\u00c6\2\u00c2\1\u00d0\1\u00ab\1\u00cf\2\u00c2\3\u00bc"+
		"\32\u00d0";
	static final String DFA198_acceptS =
		"\1\uffff\1\1\2\uffff\1\2\35\uffff\1\3\45\uffff";
	static final String DFA198_specialS =
		"\110\uffff}>";
	static final String[] DFA198_transitionS = {
			"\1\1\4\uffff\1\1\4\uffff\1\1\3\uffff\1\1\1\uffff\1\4\1\1\3\uffff\2\4"+
			"\4\uffff\1\4\1\uffff\1\4\3\uffff\3\4\1\uffff\3\4\1\uffff\4\4\1\uffff"+
			"\3\4\4\uffff\2\4\1\uffff\1\4\2\uffff\4\4\1\uffff\1\4\1\uffff\2\4\1\uffff"+
			"\1\4\3\uffff\3\4\1\uffff\1\4\2\uffff\3\4\1\uffff\3\4\1\uffff\3\4\4\uffff"+
			"\2\1\1\4\1\uffff\1\4\1\uffff\1\1\2\uffff\1\4\2\uffff\5\4\2\1\3\uffff"+
			"\1\4\1\uffff\2\4\2\uffff\13\4\1\uffff\2\4\1\uffff\3\4\4\uffff\2\4\1\uffff"+
			"\4\4\3\uffff\1\4\10\uffff\1\3\1\4\3\uffff\1\1\2\uffff\1\1\10\uffff\1"+
			"\2\10\uffff\1\1\6\uffff\1\1\3\uffff\1\1",
			"",
			"\1\1\4\uffff\1\1\4\uffff\1\1\3\uffff\1\1\1\uffff\1\6\1\1\3\uffff\2\45"+
			"\4\uffff\1\45\1\uffff\1\11\3\uffff\1\12\1\13\1\14\1\uffff\1\45\1\44\1"+
			"\45\1\uffff\2\45\1\36\1\15\1\uffff\1\45\1\34\1\16\4\uffff\1\44\1\17\1"+
			"\uffff\1\20\2\uffff\3\45\1\21\1\uffff\1\43\1\uffff\2\45\1\uffff\1\45"+
			"\3\uffff\1\22\2\45\1\uffff\1\23\2\uffff\1\44\1\37\1\45\1\uffff\3\45\1"+
			"\uffff\1\40\1\45\1\10\4\uffff\2\1\1\45\1\uffff\1\45\1\uffff\1\1\2\uffff"+
			"\1\45\2\uffff\5\45\2\1\3\uffff\1\45\1\uffff\2\45\1\uffff\1\42\1\45\1"+
			"\24\4\45\1\25\1\35\1\26\1\33\1\27\1\uffff\1\1\1\45\1\uffff\1\44\1\41"+
			"\1\45\4\uffff\2\45\1\uffff\1\30\1\45\1\31\1\32\3\uffff\1\44\10\uffff"+
			"\1\1\1\7\3\uffff\1\5\2\uffff\1\1\10\uffff\1\1\4\uffff\1\1\3\uffff\1\1"+
			"\6\uffff\1\1\3\uffff\1\1",
			"\1\1\1\uffff\2\1\27\uffff\1\1\22\uffff\2\1\5\uffff\1\1\12\uffff\1\1"+
			"\22\uffff\1\1\2\uffff\1\1\4\uffff\1\1\34\uffff\1\1\11\uffff\1\1\15\uffff"+
			"\1\1\14\uffff\1\1\1\uffff\2\1\1\uffff\2\1\1\uffff\1\4\3\1\6\uffff\2\1"+
			"\2\uffff\1\1",
			"",
			"\1\1\1\uffff\1\46\1\1\1\uffff\2\1\2\uffff\1\1\10\uffff\1\1",
			"\1\1\1\42\5\uffff\1\47",
			"\1\1\1\42\5\uffff\1\47",
			"\1\1\1\42\5\uffff\1\47\3\uffff\1\42",
			"\1\1\1\42\5\uffff\1\47",
			"\1\1\1\42\5\uffff\1\47",
			"\1\1\1\42\5\uffff\1\47",
			"\1\1\1\42\5\uffff\1\47",
			"\1\1\1\42\5\uffff\1\47",
			"\1\1\1\42\5\uffff\1\47",
			"\1\1\1\42\5\uffff\1\47",
			"\1\1\1\42\5\uffff\1\47",
			"\1\1\1\42\5\uffff\1\47",
			"\1\1\1\42\5\uffff\1\47",
			"\1\1\1\42\5\uffff\1\47",
			"\1\1\1\42\5\uffff\1\47",
			"\1\1\1\42\5\uffff\1\47",
			"\1\1\1\42\5\uffff\1\47",
			"\1\1\1\42\5\uffff\1\47",
			"\1\1\1\42\5\uffff\1\47",
			"\1\1\1\42\5\uffff\1\47",
			"\1\1\1\42\5\uffff\1\47",
			"\1\1\1\42\5\uffff\1\47",
			"\1\1\1\42\5\uffff\1\47",
			"\1\1\1\42\5\uffff\1\47",
			"\1\1\6\uffff\1\47",
			"\1\42\5\uffff\1\47",
			"\1\1\1\42\5\uffff\1\47\3\uffff\1\42",
			"\1\1\1\42\5\uffff\1\47\3\uffff\1\42",
			"",
			"\1\1\1\42\5\uffff\1\47\3\uffff\1\42",
			"\1\47",
			"\1\1\1\42\5\uffff\1\47",
			"\1\42\4\uffff\1\42\4\uffff\1\42\3\uffff\1\42\1\uffff\2\42\3\uffff\2"+
			"\42\1\1\1\uffff\2\1\1\42\1\uffff\1\42\3\uffff\3\42\1\uffff\3\42\1\uffff"+
			"\4\42\1\uffff\3\42\1\uffff\1\1\2\uffff\2\42\1\uffff\1\42\2\uffff\4\42"+
			"\1\uffff\1\42\1\uffff\2\42\1\uffff\1\51\1\1\2\uffff\3\42\1\1\1\42\2\uffff"+
			"\3\42\1\uffff\3\42\1\1\3\42\4\uffff\3\42\1\uffff\1\42\1\uffff\1\42\2"+
			"\uffff\1\42\1\uffff\1\1\2\42\1\52\4\42\1\1\2\uffff\1\42\1\uffff\2\42"+
			"\2\uffff\13\42\1\uffff\2\42\1\uffff\3\42\2\uffff\1\1\1\uffff\2\42\1\uffff"+
			"\4\42\1\uffff\1\1\1\uffff\1\42\10\uffff\2\42\1\uffff\1\1\1\uffff\1\42"+
			"\2\uffff\1\42\7\uffff\1\1\1\42\2\1\1\uffff\2\1\2\uffff\1\1\1\50\1\1\5"+
			"\uffff\1\42\2\1\1\uffff\1\42\1\1",
			"\1\53\4\uffff\2\55\4\uffff\1\55\1\uffff\1\1\3\uffff\3\1\1\uffff\1\55"+
			"\1\uffff\1\55\1\uffff\2\55\2\1\1\uffff\1\55\2\1\5\uffff\1\1\1\uffff\1"+
			"\1\2\uffff\3\55\1\1\1\uffff\1\55\1\uffff\2\55\1\uffff\1\55\3\uffff\1"+
			"\1\2\55\1\uffff\1\1\3\uffff\1\42\1\55\1\uffff\3\55\1\uffff\3\55\6\uffff"+
			"\1\55\1\uffff\1\55\4\uffff\1\55\2\uffff\5\55\5\uffff\1\55\1\uffff\2\55"+
			"\2\uffff\1\55\1\1\4\55\5\1\1\uffff\1\1\1\55\2\uffff\2\55\4\uffff\2\55"+
			"\1\uffff\1\1\1\55\2\1\15\uffff\1\54",
			"\1\1\4\uffff\1\1\4\uffff\1\1\3\uffff\1\1\1\uffff\1\56\1\1\3\uffff\2"+
			"\60\4\uffff\1\60\1\uffff\1\61\3\uffff\1\62\1\63\1\64\1\uffff\1\60\1\107"+
			"\1\60\1\uffff\2\60\1\106\1\65\1\uffff\1\60\1\104\1\66\4\uffff\1\107\1"+
			"\67\1\uffff\1\70\2\uffff\3\60\1\71\1\uffff\1\60\1\uffff\2\60\1\uffff"+
			"\1\60\3\uffff\1\72\2\60\1\uffff\1\73\2\uffff\2\107\1\60\1\uffff\3\60"+
			"\1\uffff\3\60\4\uffff\2\1\1\60\1\uffff\1\60\1\uffff\1\1\2\uffff\1\60"+
			"\2\uffff\5\60\2\1\3\uffff\1\60\1\uffff\2\60\2\uffff\1\60\1\74\4\60\1"+
			"\75\1\105\1\76\1\103\1\77\1\uffff\1\1\1\60\1\uffff\1\107\2\60\4\uffff"+
			"\2\60\1\uffff\1\100\1\60\1\101\1\102\3\uffff\1\107\10\uffff\1\1\1\57"+
			"\3\uffff\1\1\2\uffff\1\1\10\uffff\1\1\4\uffff\1\1\3\uffff\1\1\6\uffff"+
			"\1\1\3\uffff\1\1",
			"\1\1\u0090\uffff\1\42\6\uffff\1\42",
			"\1\1\111\uffff\1\42\6\uffff\1\42",
			"\1\1\1\42",
			"\1\1\1\42",
			"\1\1\1\42",
			"\1\42\1\uffff\2\42\27\uffff\1\42\22\uffff\2\42\5\uffff\1\42\12\uffff"+
			"\1\42\22\uffff\1\42\2\uffff\1\42\4\uffff\1\42\34\uffff\1\42\11\uffff"+
			"\1\42\15\uffff\1\42\14\uffff\1\42\1\1\2\42\1\uffff\2\42\1\uffff\1\1\3"+
			"\42\6\uffff\2\42\2\uffff\1\42",
			"\1\42\1\uffff\2\42\27\uffff\1\42\22\uffff\2\42\5\uffff\1\42\12\uffff"+
			"\1\42\22\uffff\1\42\2\uffff\1\42\4\uffff\1\42\34\uffff\1\42\11\uffff"+
			"\1\42\15\uffff\1\42\14\uffff\1\42\1\1\2\42\1\uffff\2\42\1\uffff\1\1\3"+
			"\42\6\uffff\2\42\2\uffff\1\42",
			"\1\42\1\uffff\2\42\27\uffff\1\42\22\uffff\2\42\5\uffff\1\42\12\uffff"+
			"\1\42\22\uffff\1\42\2\uffff\1\42\4\uffff\1\42\34\uffff\1\42\11\uffff"+
			"\1\42\15\uffff\1\42\14\uffff\1\42\1\1\2\42\1\uffff\2\42\1\uffff\1\1\3"+
			"\42\6\uffff\2\42\2\uffff\1\42",
			"\1\42\1\uffff\2\42\27\uffff\1\42\22\uffff\2\42\5\uffff\1\42\12\uffff"+
			"\1\42\22\uffff\1\42\2\uffff\1\42\4\uffff\1\42\34\uffff\1\42\11\uffff"+
			"\1\42\15\uffff\1\42\14\uffff\1\42\1\1\2\42\1\uffff\2\42\1\uffff\1\1\3"+
			"\42\6\uffff\2\42\2\uffff\1\42",
			"\1\42\1\uffff\2\42\27\uffff\1\42\22\uffff\2\42\5\uffff\1\42\12\uffff"+
			"\1\42\22\uffff\1\42\2\uffff\1\42\4\uffff\1\42\34\uffff\1\42\11\uffff"+
			"\1\42\15\uffff\1\42\14\uffff\1\42\1\1\2\42\1\uffff\2\42\1\uffff\1\1\3"+
			"\42\6\uffff\2\42\2\uffff\1\42",
			"\1\42\1\uffff\2\42\27\uffff\1\42\22\uffff\2\42\5\uffff\1\42\12\uffff"+
			"\1\42\22\uffff\1\42\2\uffff\1\42\4\uffff\1\42\34\uffff\1\42\11\uffff"+
			"\1\42\15\uffff\1\42\14\uffff\1\42\1\1\2\42\1\uffff\2\42\1\uffff\1\1\3"+
			"\42\6\uffff\2\42\2\uffff\1\42",
			"\1\42\1\uffff\2\42\27\uffff\1\42\22\uffff\2\42\5\uffff\1\42\12\uffff"+
			"\1\42\22\uffff\1\42\2\uffff\1\42\4\uffff\1\42\34\uffff\1\42\11\uffff"+
			"\1\42\15\uffff\1\42\14\uffff\1\42\1\1\2\42\1\uffff\2\42\1\uffff\1\1\3"+
			"\42\6\uffff\2\42\2\uffff\1\42",
			"\1\42\1\uffff\2\42\27\uffff\1\42\22\uffff\2\42\5\uffff\1\42\12\uffff"+
			"\1\42\22\uffff\1\42\2\uffff\1\42\4\uffff\1\42\34\uffff\1\42\11\uffff"+
			"\1\42\15\uffff\1\42\14\uffff\1\42\1\1\2\42\1\uffff\2\42\1\uffff\1\1\3"+
			"\42\6\uffff\2\42\2\uffff\1\42",
			"\1\42\1\uffff\2\42\27\uffff\1\42\22\uffff\2\42\5\uffff\1\42\12\uffff"+
			"\1\42\22\uffff\1\42\2\uffff\1\42\4\uffff\1\42\34\uffff\1\42\11\uffff"+
			"\1\42\15\uffff\1\42\14\uffff\1\42\1\1\2\42\1\uffff\2\42\1\uffff\1\1\3"+
			"\42\6\uffff\2\42\2\uffff\1\42",
			"\1\42\1\uffff\2\42\27\uffff\1\42\22\uffff\2\42\5\uffff\1\42\12\uffff"+
			"\1\42\22\uffff\1\42\2\uffff\1\42\4\uffff\1\42\34\uffff\1\42\11\uffff"+
			"\1\42\15\uffff\1\42\14\uffff\1\42\1\1\2\42\1\uffff\2\42\1\uffff\1\1\3"+
			"\42\6\uffff\2\42\2\uffff\1\42",
			"\1\42\1\uffff\2\42\27\uffff\1\42\22\uffff\2\42\5\uffff\1\42\12\uffff"+
			"\1\42\22\uffff\1\42\2\uffff\1\42\4\uffff\1\42\34\uffff\1\42\11\uffff"+
			"\1\42\15\uffff\1\42\14\uffff\1\42\1\1\2\42\1\uffff\2\42\1\uffff\1\1\3"+
			"\42\6\uffff\2\42\2\uffff\1\42",
			"\1\42\1\uffff\2\42\27\uffff\1\42\22\uffff\2\42\5\uffff\1\42\12\uffff"+
			"\1\42\22\uffff\1\42\2\uffff\1\42\4\uffff\1\42\34\uffff\1\42\11\uffff"+
			"\1\42\15\uffff\1\42\14\uffff\1\42\1\1\2\42\1\uffff\2\42\1\uffff\1\1\3"+
			"\42\6\uffff\2\42\2\uffff\1\42",
			"\1\42\1\uffff\2\42\27\uffff\1\42\22\uffff\2\42\5\uffff\1\42\12\uffff"+
			"\1\42\22\uffff\1\42\2\uffff\1\42\4\uffff\1\42\34\uffff\1\42\11\uffff"+
			"\1\42\15\uffff\1\42\14\uffff\1\42\1\1\2\42\1\uffff\2\42\1\uffff\1\1\3"+
			"\42\6\uffff\2\42\2\uffff\1\42",
			"\1\42\1\uffff\2\42\27\uffff\1\42\22\uffff\2\42\5\uffff\1\42\12\uffff"+
			"\1\42\22\uffff\1\42\2\uffff\1\42\4\uffff\1\42\34\uffff\1\42\11\uffff"+
			"\1\42\15\uffff\1\42\14\uffff\1\42\1\1\2\42\1\uffff\2\42\1\uffff\1\1\3"+
			"\42\6\uffff\2\42\2\uffff\1\42",
			"\1\42\1\uffff\2\42\27\uffff\1\42\22\uffff\2\42\5\uffff\1\42\12\uffff"+
			"\1\42\22\uffff\1\42\2\uffff\1\42\4\uffff\1\42\34\uffff\1\42\11\uffff"+
			"\1\42\15\uffff\1\42\14\uffff\1\42\1\1\2\42\1\uffff\2\42\1\uffff\1\1\3"+
			"\42\6\uffff\2\42\2\uffff\1\42",
			"\1\42\1\uffff\2\42\27\uffff\1\42\22\uffff\2\42\5\uffff\1\42\12\uffff"+
			"\1\42\22\uffff\1\42\2\uffff\1\42\4\uffff\1\42\34\uffff\1\42\11\uffff"+
			"\1\42\15\uffff\1\42\14\uffff\1\42\1\1\2\42\1\uffff\2\42\1\uffff\1\1\3"+
			"\42\6\uffff\2\42\2\uffff\1\42",
			"\1\42\1\uffff\2\42\27\uffff\1\42\22\uffff\2\42\5\uffff\1\42\12\uffff"+
			"\1\42\22\uffff\1\42\2\uffff\1\42\4\uffff\1\42\34\uffff\1\42\11\uffff"+
			"\1\42\15\uffff\1\42\14\uffff\1\42\1\1\2\42\1\uffff\2\42\1\uffff\1\1\3"+
			"\42\6\uffff\2\42\2\uffff\1\42",
			"\1\42\1\uffff\2\42\27\uffff\1\42\22\uffff\2\42\5\uffff\1\42\12\uffff"+
			"\1\42\22\uffff\1\42\2\uffff\1\42\4\uffff\1\42\34\uffff\1\42\11\uffff"+
			"\1\42\15\uffff\1\42\14\uffff\1\42\1\1\2\42\1\uffff\2\42\1\uffff\1\1\3"+
			"\42\6\uffff\2\42\2\uffff\1\42",
			"\1\42\1\uffff\2\42\27\uffff\1\42\22\uffff\2\42\5\uffff\1\42\12\uffff"+
			"\1\42\22\uffff\1\42\2\uffff\1\42\4\uffff\1\42\34\uffff\1\42\11\uffff"+
			"\1\42\15\uffff\1\42\14\uffff\1\42\1\1\2\42\1\uffff\2\42\1\uffff\1\1\3"+
			"\42\6\uffff\2\42\2\uffff\1\42",
			"\1\42\1\uffff\2\42\27\uffff\1\42\22\uffff\2\42\5\uffff\1\42\12\uffff"+
			"\1\42\22\uffff\1\42\2\uffff\1\42\4\uffff\1\42\34\uffff\1\42\11\uffff"+
			"\1\42\15\uffff\1\42\14\uffff\1\42\1\1\2\42\1\uffff\2\42\1\uffff\1\1\3"+
			"\42\6\uffff\2\42\2\uffff\1\42",
			"\1\42\1\uffff\2\42\27\uffff\1\42\22\uffff\2\42\5\uffff\1\42\12\uffff"+
			"\1\42\22\uffff\1\42\2\uffff\1\42\4\uffff\1\42\34\uffff\1\42\11\uffff"+
			"\1\42\15\uffff\1\42\14\uffff\1\42\1\1\2\42\1\uffff\2\42\1\uffff\1\1\3"+
			"\42\6\uffff\2\42\2\uffff\1\42",
			"\1\42\1\uffff\2\42\27\uffff\1\42\22\uffff\2\42\5\uffff\1\42\12\uffff"+
			"\1\42\22\uffff\1\42\2\uffff\1\42\4\uffff\1\42\34\uffff\1\42\11\uffff"+
			"\1\42\15\uffff\1\42\14\uffff\1\42\1\1\2\42\1\uffff\2\42\1\uffff\1\1\3"+
			"\42\6\uffff\2\42\2\uffff\1\42",
			"\1\42\1\uffff\2\42\27\uffff\1\42\22\uffff\2\42\5\uffff\1\42\12\uffff"+
			"\1\42\22\uffff\1\42\2\uffff\1\42\4\uffff\1\42\34\uffff\1\42\11\uffff"+
			"\1\42\15\uffff\1\42\14\uffff\1\42\1\1\2\42\1\uffff\2\42\1\uffff\1\1\3"+
			"\42\6\uffff\2\42\2\uffff\1\42",
			"\1\42\1\uffff\2\42\27\uffff\1\42\22\uffff\2\42\5\uffff\1\42\12\uffff"+
			"\1\42\22\uffff\1\42\2\uffff\1\42\4\uffff\1\42\34\uffff\1\42\11\uffff"+
			"\1\42\15\uffff\1\42\14\uffff\1\42\1\1\2\42\1\uffff\2\42\1\uffff\1\1\3"+
			"\42\6\uffff\2\42\2\uffff\1\42",
			"\1\42\1\uffff\2\42\27\uffff\1\42\22\uffff\2\42\5\uffff\1\42\12\uffff"+
			"\1\42\22\uffff\1\42\2\uffff\1\42\4\uffff\1\42\34\uffff\1\42\11\uffff"+
			"\1\42\15\uffff\1\42\14\uffff\1\42\1\1\2\42\1\uffff\2\42\1\uffff\1\1\3"+
			"\42\6\uffff\2\42\2\uffff\1\42",
			"\1\42\1\uffff\2\42\27\uffff\1\42\22\uffff\2\42\5\uffff\1\42\12\uffff"+
			"\1\42\22\uffff\1\42\2\uffff\1\42\4\uffff\1\42\34\uffff\1\42\11\uffff"+
			"\1\42\15\uffff\1\42\14\uffff\1\42\1\uffff\2\42\1\uffff\2\42\1\uffff\1"+
			"\1\3\42\6\uffff\2\42\2\uffff\1\42"
	};

	static final short[] DFA198_eot = DFA.unpackEncodedString(DFA198_eotS);
	static final short[] DFA198_eof = DFA.unpackEncodedString(DFA198_eofS);
	static final char[] DFA198_min = DFA.unpackEncodedStringToUnsignedChars(DFA198_minS);
	static final char[] DFA198_max = DFA.unpackEncodedStringToUnsignedChars(DFA198_maxS);
	static final short[] DFA198_accept = DFA.unpackEncodedString(DFA198_acceptS);
	static final short[] DFA198_special = DFA.unpackEncodedString(DFA198_specialS);
	static final short[][] DFA198_transition;

	static {
		int numStates = DFA198_transitionS.length;
		DFA198_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA198_transition[i] = DFA.unpackEncodedString(DFA198_transitionS[i]);
		}
	}

	protected class DFA198 extends DFA {

		public DFA198(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 198;
			this.eot = DFA198_eot;
			this.eof = DFA198_eof;
			this.min = DFA198_min;
			this.max = DFA198_max;
			this.accept = DFA198_accept;
			this.special = DFA198_special;
			this.transition = DFA198_transition;
		}
		@Override
		public String getDescription() {
			return "1499:1: simpleTerm returns [Term.Raw term] : (v= value |f= function | '(' c= comparatorType ')' t= simpleTerm );";
		}
	}

	static final String DFA201_eotS =
		"\36\uffff";
	static final String DFA201_eofS =
		"\36\uffff";
	static final String DFA201_minS =
		"\1\6\1\uffff\32\27\2\uffff";
	static final String DFA201_maxS =
		"\1\u00cf\1\uffff\32\u00c2\2\uffff";
	static final String DFA201_acceptS =
		"\1\uffff\1\1\32\uffff\1\2\1\3";
	static final String DFA201_specialS =
		"\36\uffff}>";
	static final String[] DFA201_transitionS = {
			"\1\1\4\uffff\1\1\4\uffff\1\1\3\uffff\1\1\1\uffff\1\2\1\1\3\uffff\2\4"+
			"\4\uffff\1\4\1\uffff\1\5\3\uffff\1\6\1\7\1\10\1\uffff\1\4\1\33\1\4\1"+
			"\uffff\2\4\1\32\1\11\1\uffff\1\4\1\30\1\12\4\uffff\1\33\1\13\1\uffff"+
			"\1\14\2\uffff\3\4\1\15\1\uffff\1\4\1\uffff\2\4\1\uffff\1\4\3\uffff\1"+
			"\16\2\4\1\uffff\1\17\2\uffff\2\33\1\4\1\uffff\3\4\1\uffff\3\4\4\uffff"+
			"\2\1\1\4\1\uffff\1\4\1\uffff\1\1\2\uffff\1\4\2\uffff\5\4\2\1\3\uffff"+
			"\1\4\1\uffff\2\4\2\uffff\1\4\1\20\4\4\1\21\1\31\1\22\1\27\1\23\1\uffff"+
			"\1\1\1\4\1\uffff\1\33\2\4\4\uffff\2\4\1\uffff\1\24\1\4\1\25\1\26\3\uffff"+
			"\1\33\10\uffff\1\1\1\3\3\uffff\1\1\2\uffff\1\1\10\uffff\1\1\4\uffff\1"+
			"\1\3\uffff\1\1\6\uffff\1\1\3\uffff\1\1",
			"",
			"\1\35\u00a3\uffff\1\1\1\uffff\1\34\2\uffff\1\34\1\uffff\1\1",
			"\1\35\u00a3\uffff\1\1\1\uffff\1\34\2\uffff\1\34\1\uffff\1\1",
			"\1\35\u00a3\uffff\1\1\1\uffff\1\34\2\uffff\1\34\1\uffff\1\1",
			"\1\35\u00a3\uffff\1\1\1\uffff\1\34\2\uffff\1\34\1\uffff\1\1",
			"\1\35\u00a3\uffff\1\1\1\uffff\1\34\2\uffff\1\34\1\uffff\1\1",
			"\1\35\u00a3\uffff\1\1\1\uffff\1\34\2\uffff\1\34\1\uffff\1\1",
			"\1\35\u00a3\uffff\1\1\1\uffff\1\34\2\uffff\1\34\1\uffff\1\1",
			"\1\35\u00a3\uffff\1\1\1\uffff\1\34\2\uffff\1\34\1\uffff\1\1",
			"\1\35\u00a3\uffff\1\1\1\uffff\1\34\2\uffff\1\34\1\uffff\1\1",
			"\1\35\u00a3\uffff\1\1\1\uffff\1\34\2\uffff\1\34\1\uffff\1\1",
			"\1\35\u00a3\uffff\1\1\1\uffff\1\34\2\uffff\1\34\1\uffff\1\1",
			"\1\35\u00a3\uffff\1\1\1\uffff\1\34\2\uffff\1\34\1\uffff\1\1",
			"\1\35\u00a3\uffff\1\1\1\uffff\1\34\2\uffff\1\34\1\uffff\1\1",
			"\1\35\u00a3\uffff\1\1\1\uffff\1\34\2\uffff\1\34\1\uffff\1\1",
			"\1\35\u00a3\uffff\1\1\1\uffff\1\34\2\uffff\1\34\1\uffff\1\1",
			"\1\35\u00a3\uffff\1\1\1\uffff\1\34\2\uffff\1\34\1\uffff\1\1",
			"\1\35\u00a3\uffff\1\1\1\uffff\1\34\2\uffff\1\34\1\uffff\1\1",
			"\1\35\u00a3\uffff\1\1\1\uffff\1\34\2\uffff\1\34\1\uffff\1\1",
			"\1\35\u00a3\uffff\1\1\1\uffff\1\34\2\uffff\1\34\1\uffff\1\1",
			"\1\35\u00a3\uffff\1\1\1\uffff\1\34\2\uffff\1\34\1\uffff\1\1",
			"\1\35\u00a3\uffff\1\1\1\uffff\1\34\2\uffff\1\34\1\uffff\1\1",
			"\1\35\u00a3\uffff\1\1\1\uffff\1\34\2\uffff\1\34\1\uffff\1\1",
			"\1\35\u00a3\uffff\1\1\1\uffff\1\34\2\uffff\1\34\1\uffff\1\1",
			"\1\35\u00a3\uffff\1\1\1\uffff\1\34\2\uffff\1\34\1\uffff\1\1",
			"\1\35\u00a3\uffff\1\1\1\uffff\1\34\2\uffff\1\34\1\uffff\1\1",
			"\1\35\u00a5\uffff\1\34\2\uffff\1\34\1\uffff\1\1",
			"",
			""
	};

	static final short[] DFA201_eot = DFA.unpackEncodedString(DFA201_eotS);
	static final short[] DFA201_eof = DFA.unpackEncodedString(DFA201_eofS);
	static final char[] DFA201_min = DFA.unpackEncodedStringToUnsignedChars(DFA201_minS);
	static final char[] DFA201_max = DFA.unpackEncodedStringToUnsignedChars(DFA201_maxS);
	static final short[] DFA201_accept = DFA.unpackEncodedString(DFA201_acceptS);
	static final short[] DFA201_special = DFA.unpackEncodedString(DFA201_specialS);
	static final short[][] DFA201_transition;

	static {
		int numStates = DFA201_transitionS.length;
		DFA201_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA201_transition[i] = DFA.unpackEncodedString(DFA201_transitionS[i]);
		}
	}

	protected class DFA201 extends DFA {

		public DFA201(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 201;
			this.eot = DFA201_eot;
			this.eof = DFA201_eof;
			this.min = DFA201_min;
			this.max = DFA201_max;
			this.accept = DFA201_accept;
			this.special = DFA201_special;
			this.transition = DFA201_transition;
		}
		@Override
		public String getDescription() {
			return "1516:1: normalColumnOperation[List<Pair<ColumnMetadata.Raw, Operation.RawUpdate>> operations, ColumnMetadata.Raw key] : (t= term ( '+' c= cident )? |c= cident sig= ( '+' | '-' ) t= term |c= cident i= INTEGER );";
		}
	}

	static final String DFA209_eotS =
		"\35\uffff";
	static final String DFA209_eofS =
		"\35\uffff";
	static final String DFA209_minS =
		"\1\26\31\u00c8\1\6\2\uffff";
	static final String DFA209_maxS =
		"\1\u00ab\31\u00c8\1\u00cf\2\uffff";
	static final String DFA209_acceptS =
		"\33\uffff\1\1\1\2";
	static final String DFA209_specialS =
		"\35\uffff}>";
	static final String[] DFA209_transitionS = {
			"\1\1\4\uffff\2\3\4\uffff\1\3\1\uffff\1\4\3\uffff\1\5\1\6\1\7\1\uffff"+
			"\1\3\1\31\1\3\1\uffff\2\3\1\31\1\10\1\uffff\1\3\1\27\1\11\4\uffff\1\31"+
			"\1\12\1\uffff\1\13\2\uffff\3\3\1\14\1\uffff\1\3\1\uffff\2\3\1\uffff\1"+
			"\3\3\uffff\1\15\2\3\1\uffff\1\16\2\uffff\2\31\1\3\1\uffff\3\3\1\uffff"+
			"\3\3\6\uffff\1\3\1\uffff\1\3\4\uffff\1\3\2\uffff\5\3\5\uffff\1\3\1\uffff"+
			"\2\3\2\uffff\1\3\1\17\4\3\1\20\1\30\1\21\1\26\1\22\2\uffff\1\3\1\uffff"+
			"\1\31\2\3\4\uffff\2\3\1\uffff\1\23\1\3\1\24\1\25\3\uffff\1\31\11\uffff"+
			"\1\2",
			"\1\32",
			"\1\32",
			"\1\32",
			"\1\32",
			"\1\32",
			"\1\32",
			"\1\32",
			"\1\32",
			"\1\32",
			"\1\32",
			"\1\32",
			"\1\32",
			"\1\32",
			"\1\32",
			"\1\32",
			"\1\32",
			"\1\32",
			"\1\32",
			"\1\32",
			"\1\32",
			"\1\32",
			"\1\32",
			"\1\32",
			"\1\32",
			"\1\32",
			"\1\33\4\uffff\1\33\4\uffff\1\33\3\uffff\1\33\2\uffff\1\33\3\uffff\2"+
			"\33\4\uffff\1\33\1\uffff\1\33\3\uffff\3\33\1\uffff\3\33\1\uffff\4\33"+
			"\1\uffff\3\33\4\uffff\2\33\1\uffff\1\33\2\uffff\4\33\1\uffff\1\33\1\uffff"+
			"\2\33\1\uffff\1\33\3\uffff\3\33\1\uffff\1\33\2\uffff\3\33\1\uffff\3\33"+
			"\1\uffff\3\33\4\uffff\3\33\1\uffff\1\33\4\uffff\1\33\2\uffff\7\33\3\uffff"+
			"\1\33\1\uffff\2\33\2\uffff\13\33\2\uffff\1\33\1\uffff\3\33\4\uffff\2"+
			"\33\1\uffff\4\33\3\uffff\1\33\15\uffff\1\33\2\uffff\1\33\34\uffff\1\34",
			"",
			""
	};

	static final short[] DFA209_eot = DFA.unpackEncodedString(DFA209_eotS);
	static final short[] DFA209_eof = DFA.unpackEncodedString(DFA209_eofS);
	static final char[] DFA209_min = DFA.unpackEncodedStringToUnsignedChars(DFA209_minS);
	static final char[] DFA209_max = DFA.unpackEncodedStringToUnsignedChars(DFA209_maxS);
	static final short[] DFA209_accept = DFA.unpackEncodedString(DFA209_acceptS);
	static final short[] DFA209_special = DFA.unpackEncodedString(DFA209_specialS);
	static final short[][] DFA209_transition;

	static {
		int numStates = DFA209_transitionS.length;
		DFA209_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA209_transition[i] = DFA.unpackEncodedString(DFA209_transitionS[i]);
		}
	}

	protected class DFA209 extends DFA {

		public DFA209(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 209;
			this.eot = DFA209_eot;
			this.eof = DFA209_eof;
			this.min = DFA209_min;
			this.max = DFA209_max;
			this.accept = DFA209_accept;
			this.special = DFA209_special;
			this.transition = DFA209_transition;
		}
		@Override
		public String getDescription() {
			return "1596:1: property[PropertyDefinitions props] : (k= noncol_ident '=' simple= propertyValue |k= noncol_ident '=' map= fullMapLiteral );";
		}
	}

	static final String DFA214_eotS =
		"\77\uffff";
	static final String DFA214_eofS =
		"\77\uffff";
	static final String DFA214_minS =
		"\1\26\31\60\1\uffff\1\26\3\uffff\1\u00aa\2\uffff\31\60\4\uffff";
	static final String DFA214_maxS =
		"\1\u00bb\31\u00cb\1\uffff\1\u00bb\3\uffff\1\u00c4\2\uffff\31\u00cb\4\uffff";
	static final String DFA214_acceptS =
		"\32\uffff\1\4\1\uffff\1\1\1\2\1\3\1\uffff\1\7\1\10\31\uffff\1\12\1\5\1"+
		"\6\1\11";
	static final String DFA214_specialS =
		"\77\uffff}>";
	static final String[] DFA214_transitionS = {
			"\1\1\4\uffff\2\3\4\uffff\1\3\1\uffff\1\4\3\uffff\1\5\1\6\1\7\1\uffff"+
			"\1\3\1\31\1\3\1\uffff\2\3\1\31\1\10\1\uffff\1\3\1\27\1\11\4\uffff\1\31"+
			"\1\12\1\uffff\1\13\2\uffff\3\3\1\14\1\uffff\1\3\1\uffff\2\3\1\uffff\1"+
			"\3\3\uffff\1\15\2\3\1\uffff\1\16\2\uffff\2\31\1\3\1\uffff\3\3\1\uffff"+
			"\3\3\6\uffff\1\3\1\uffff\1\3\4\uffff\1\3\2\uffff\5\3\5\uffff\1\3\1\uffff"+
			"\2\3\2\uffff\1\3\1\17\4\3\1\20\1\30\1\21\1\26\1\22\1\uffff\1\32\1\3\1"+
			"\uffff\1\31\2\3\4\uffff\2\3\1\uffff\1\23\1\3\1\24\1\25\3\uffff\1\31\11"+
			"\uffff\1\2\17\uffff\1\33",
			"\1\40\34\uffff\1\37\7\uffff\1\36\6\uffff\1\35\134\uffff\1\34\14\uffff"+
			"\5\34\1\41",
			"\1\40\34\uffff\1\37\7\uffff\1\36\6\uffff\1\35\134\uffff\1\34\14\uffff"+
			"\5\34\1\41",
			"\1\40\34\uffff\1\37\7\uffff\1\36\6\uffff\1\35\134\uffff\1\34\14\uffff"+
			"\5\34\1\41",
			"\1\40\34\uffff\1\37\7\uffff\1\36\6\uffff\1\35\134\uffff\1\34\14\uffff"+
			"\5\34\1\41",
			"\1\40\34\uffff\1\37\7\uffff\1\36\6\uffff\1\35\134\uffff\1\34\14\uffff"+
			"\5\34\1\41",
			"\1\40\34\uffff\1\37\7\uffff\1\36\6\uffff\1\35\134\uffff\1\34\14\uffff"+
			"\5\34\1\41",
			"\1\40\34\uffff\1\37\7\uffff\1\36\6\uffff\1\35\134\uffff\1\34\14\uffff"+
			"\5\34\1\41",
			"\1\40\34\uffff\1\37\7\uffff\1\36\6\uffff\1\35\134\uffff\1\34\14\uffff"+
			"\5\34\1\41",
			"\1\40\34\uffff\1\37\7\uffff\1\36\6\uffff\1\35\134\uffff\1\34\14\uffff"+
			"\5\34\1\41",
			"\1\40\34\uffff\1\37\7\uffff\1\36\6\uffff\1\35\134\uffff\1\34\14\uffff"+
			"\5\34\1\41",
			"\1\40\34\uffff\1\37\7\uffff\1\36\6\uffff\1\35\134\uffff\1\34\14\uffff"+
			"\5\34\1\41",
			"\1\40\34\uffff\1\37\7\uffff\1\36\6\uffff\1\35\134\uffff\1\34\14\uffff"+
			"\5\34\1\41",
			"\1\40\34\uffff\1\37\7\uffff\1\36\6\uffff\1\35\134\uffff\1\34\14\uffff"+
			"\5\34\1\41",
			"\1\40\34\uffff\1\37\7\uffff\1\36\6\uffff\1\35\134\uffff\1\34\14\uffff"+
			"\5\34\1\41",
			"\1\40\34\uffff\1\37\7\uffff\1\36\6\uffff\1\35\134\uffff\1\34\14\uffff"+
			"\5\34\1\41",
			"\1\40\34\uffff\1\37\7\uffff\1\36\6\uffff\1\35\134\uffff\1\34\14\uffff"+
			"\5\34\1\41",
			"\1\40\34\uffff\1\37\7\uffff\1\36\6\uffff\1\35\134\uffff\1\34\14\uffff"+
			"\5\34\1\41",
			"\1\40\34\uffff\1\37\7\uffff\1\36\6\uffff\1\35\134\uffff\1\34\14\uffff"+
			"\5\34\1\41",
			"\1\40\34\uffff\1\37\7\uffff\1\36\6\uffff\1\35\134\uffff\1\34\14\uffff"+
			"\5\34\1\41",
			"\1\40\34\uffff\1\37\7\uffff\1\36\6\uffff\1\35\134\uffff\1\34\14\uffff"+
			"\5\34\1\41",
			"\1\40\34\uffff\1\37\7\uffff\1\36\6\uffff\1\35\134\uffff\1\34\14\uffff"+
			"\5\34\1\41",
			"\1\40\34\uffff\1\37\7\uffff\1\36\6\uffff\1\35\134\uffff\1\34\14\uffff"+
			"\5\34\1\41",
			"\1\40\34\uffff\1\37\7\uffff\1\36\6\uffff\1\35\134\uffff\1\34\14\uffff"+
			"\5\34\1\41",
			"\1\40\34\uffff\1\37\7\uffff\1\36\6\uffff\1\35\134\uffff\1\34\14\uffff"+
			"\5\34\1\41",
			"\1\40\34\uffff\1\37\7\uffff\1\36\6\uffff\1\35\134\uffff\1\34\14\uffff"+
			"\5\34\1\41",
			"",
			"\1\42\4\uffff\2\44\4\uffff\1\44\1\uffff\1\45\3\uffff\1\46\1\47\1\50"+
			"\1\uffff\1\44\1\72\1\44\1\uffff\2\44\1\72\1\51\1\uffff\1\44\1\70\1\52"+
			"\4\uffff\1\72\1\53\1\uffff\1\54\2\uffff\3\44\1\55\1\uffff\1\44\1\uffff"+
			"\2\44\1\uffff\1\44\3\uffff\1\56\2\44\1\uffff\1\57\2\uffff\2\72\1\44\1"+
			"\uffff\3\44\1\uffff\3\44\6\uffff\1\44\1\uffff\1\44\4\uffff\1\44\2\uffff"+
			"\5\44\5\uffff\1\44\1\uffff\2\44\2\uffff\1\44\1\60\4\44\1\61\1\71\1\62"+
			"\1\67\1\63\1\uffff\1\73\1\44\1\uffff\1\72\2\44\4\uffff\2\44\1\uffff\1"+
			"\64\1\44\1\65\1\66\3\uffff\1\72\11\uffff\1\43\17\uffff\1\73",
			"",
			"",
			"",
			"\1\74\20\uffff\1\75\10\uffff\1\74",
			"",
			"",
			"\1\73\34\uffff\1\73\7\uffff\1\73\6\uffff\1\73\134\uffff\1\73\2\uffff"+
			"\1\76\2\uffff\1\76\6\uffff\6\73",
			"\1\73\34\uffff\1\73\7\uffff\1\73\6\uffff\1\73\134\uffff\1\73\2\uffff"+
			"\1\76\2\uffff\1\76\6\uffff\6\73",
			"\1\73\34\uffff\1\73\7\uffff\1\73\6\uffff\1\73\134\uffff\1\73\2\uffff"+
			"\1\76\2\uffff\1\76\6\uffff\6\73",
			"\1\73\34\uffff\1\73\7\uffff\1\73\6\uffff\1\73\134\uffff\1\73\2\uffff"+
			"\1\76\2\uffff\1\76\6\uffff\6\73",
			"\1\73\34\uffff\1\73\7\uffff\1\73\6\uffff\1\73\134\uffff\1\73\2\uffff"+
			"\1\76\2\uffff\1\76\6\uffff\6\73",
			"\1\73\34\uffff\1\73\7\uffff\1\73\6\uffff\1\73\134\uffff\1\73\2\uffff"+
			"\1\76\2\uffff\1\76\6\uffff\6\73",
			"\1\73\34\uffff\1\73\7\uffff\1\73\6\uffff\1\73\134\uffff\1\73\2\uffff"+
			"\1\76\2\uffff\1\76\6\uffff\6\73",
			"\1\73\34\uffff\1\73\7\uffff\1\73\6\uffff\1\73\134\uffff\1\73\2\uffff"+
			"\1\76\2\uffff\1\76\6\uffff\6\73",
			"\1\73\34\uffff\1\73\7\uffff\1\73\6\uffff\1\73\134\uffff\1\73\2\uffff"+
			"\1\76\2\uffff\1\76\6\uffff\6\73",
			"\1\73\34\uffff\1\73\7\uffff\1\73\6\uffff\1\73\134\uffff\1\73\2\uffff"+
			"\1\76\2\uffff\1\76\6\uffff\6\73",
			"\1\73\34\uffff\1\73\7\uffff\1\73\6\uffff\1\73\134\uffff\1\73\2\uffff"+
			"\1\76\2\uffff\1\76\6\uffff\6\73",
			"\1\73\34\uffff\1\73\7\uffff\1\73\6\uffff\1\73\134\uffff\1\73\2\uffff"+
			"\1\76\2\uffff\1\76\6\uffff\6\73",
			"\1\73\34\uffff\1\73\7\uffff\1\73\6\uffff\1\73\134\uffff\1\73\2\uffff"+
			"\1\76\2\uffff\1\76\6\uffff\6\73",
			"\1\73\34\uffff\1\73\7\uffff\1\73\6\uffff\1\73\134\uffff\1\73\2\uffff"+
			"\1\76\2\uffff\1\76\6\uffff\6\73",
			"\1\73\34\uffff\1\73\7\uffff\1\73\6\uffff\1\73\134\uffff\1\73\2\uffff"+
			"\1\76\2\uffff\1\76\6\uffff\6\73",
			"\1\73\34\uffff\1\73\7\uffff\1\73\6\uffff\1\73\134\uffff\1\73\2\uffff"+
			"\1\76\2\uffff\1\76\6\uffff\6\73",
			"\1\73\34\uffff\1\73\7\uffff\1\73\6\uffff\1\73\134\uffff\1\73\2\uffff"+
			"\1\76\2\uffff\1\76\6\uffff\6\73",
			"\1\73\34\uffff\1\73\7\uffff\1\73\6\uffff\1\73\134\uffff\1\73\2\uffff"+
			"\1\76\2\uffff\1\76\6\uffff\6\73",
			"\1\73\34\uffff\1\73\7\uffff\1\73\6\uffff\1\73\134\uffff\1\73\2\uffff"+
			"\1\76\2\uffff\1\76\6\uffff\6\73",
			"\1\73\34\uffff\1\73\7\uffff\1\73\6\uffff\1\73\134\uffff\1\73\2\uffff"+
			"\1\76\2\uffff\1\76\6\uffff\6\73",
			"\1\73\34\uffff\1\73\7\uffff\1\73\6\uffff\1\73\134\uffff\1\73\2\uffff"+
			"\1\76\2\uffff\1\76\6\uffff\6\73",
			"\1\73\34\uffff\1\73\7\uffff\1\73\6\uffff\1\73\134\uffff\1\73\2\uffff"+
			"\1\76\2\uffff\1\76\6\uffff\6\73",
			"\1\73\34\uffff\1\73\7\uffff\1\73\6\uffff\1\73\134\uffff\1\73\2\uffff"+
			"\1\76\2\uffff\1\76\6\uffff\6\73",
			"\1\73\34\uffff\1\73\7\uffff\1\73\6\uffff\1\73\134\uffff\1\73\2\uffff"+
			"\1\76\2\uffff\1\76\6\uffff\6\73",
			"\1\73\34\uffff\1\73\7\uffff\1\73\6\uffff\1\73\134\uffff\1\73\2\uffff"+
			"\1\76\2\uffff\1\76\6\uffff\6\73",
			"",
			"",
			"",
			""
	};

	static final short[] DFA214_eot = DFA.unpackEncodedString(DFA214_eotS);
	static final short[] DFA214_eof = DFA.unpackEncodedString(DFA214_eofS);
	static final char[] DFA214_min = DFA.unpackEncodedStringToUnsignedChars(DFA214_minS);
	static final char[] DFA214_max = DFA.unpackEncodedStringToUnsignedChars(DFA214_maxS);
	static final short[] DFA214_accept = DFA.unpackEncodedString(DFA214_acceptS);
	static final short[] DFA214_special = DFA.unpackEncodedString(DFA214_specialS);
	static final short[][] DFA214_transition;

	static {
		int numStates = DFA214_transitionS.length;
		DFA214_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA214_transition[i] = DFA.unpackEncodedString(DFA214_transitionS[i]);
		}
	}

	protected class DFA214 extends DFA {

		public DFA214(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 214;
			this.eot = DFA214_eot;
			this.eof = DFA214_eof;
			this.min = DFA214_min;
			this.max = DFA214_max;
			this.accept = DFA214_accept;
			this.special = DFA214_special;
			this.transition = DFA214_transition;
		}
		@Override
		public String getDescription() {
			return "1615:1: relation[WhereClause.Builder clauses] : (name= cident type= relationType t= term |name= cident K_LIKE t= term |name= cident K_IS K_NOT K_NULL | K_TOKEN l= tupleOfIdentifiers type= relationType t= term |name= cident K_IN marker= inMarker |name= cident K_IN inValues= singleColumnInValues |name= cident rt= containsOperator t= term |name= cident '[' key= term ']' type= relationType t= term |ids= tupleOfIdentifiers ( K_IN ( '(' ')' |tupleInMarker= inMarkerForTuple |literals= tupleOfTupleLiterals |markers= tupleOfMarkersForTuples ) |type= relationType literal= tupleLiteral |type= relationType tupleMarker= markerForTuple ) | '(' relation[$clauses] ')' );";
		}
	}

	static final String DFA213_eotS =
		"\12\uffff";
	static final String DFA213_eofS =
		"\12\uffff";
	static final String DFA213_minS =
		"\1\115\1\uffff\6\u00aa\2\uffff";
	static final String DFA213_maxS =
		"\1\u00ca\1\uffff\6\u00c4\2\uffff";
	static final String DFA213_acceptS =
		"\1\uffff\1\1\6\uffff\1\2\1\3";
	static final String DFA213_specialS =
		"\12\uffff}>";
	static final String[] DFA213_transitionS = {
			"\1\1\153\uffff\1\7\14\uffff\1\3\1\4\1\2\1\5\1\6",
			"",
			"\1\11\20\uffff\1\10\10\uffff\1\11",
			"\1\11\20\uffff\1\10\10\uffff\1\11",
			"\1\11\20\uffff\1\10\10\uffff\1\11",
			"\1\11\20\uffff\1\10\10\uffff\1\11",
			"\1\11\20\uffff\1\10\10\uffff\1\11",
			"\1\11\20\uffff\1\10\10\uffff\1\11",
			"",
			""
	};

	static final short[] DFA213_eot = DFA.unpackEncodedString(DFA213_eotS);
	static final short[] DFA213_eof = DFA.unpackEncodedString(DFA213_eofS);
	static final char[] DFA213_min = DFA.unpackEncodedStringToUnsignedChars(DFA213_minS);
	static final char[] DFA213_max = DFA.unpackEncodedStringToUnsignedChars(DFA213_maxS);
	static final short[] DFA213_accept = DFA.unpackEncodedString(DFA213_acceptS);
	static final short[] DFA213_special = DFA.unpackEncodedString(DFA213_specialS);
	static final short[][] DFA213_transition;

	static {
		int numStates = DFA213_transitionS.length;
		DFA213_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA213_transition[i] = DFA.unpackEncodedString(DFA213_transitionS[i]);
		}
	}

	protected class DFA213 extends DFA {

		public DFA213(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 213;
			this.eot = DFA213_eot;
			this.eof = DFA213_eof;
			this.min = DFA213_min;
			this.max = DFA213_max;
			this.accept = DFA213_accept;
			this.special = DFA213_special;
			this.transition = DFA213_transition;
		}
		@Override
		public String getDescription() {
			return "1628:7: ( K_IN ( '(' ')' |tupleInMarker= inMarkerForTuple |literals= tupleOfTupleLiterals |markers= tupleOfMarkersForTuples ) |type= relationType literal= tupleLiteral |type= relationType tupleMarker= markerForTuple )";
		}
	}

	static final String DFA224_eotS =
		"\40\uffff";
	static final String DFA224_eofS =
		"\1\uffff\25\35\2\32\1\uffff\1\32\1\uffff\1\32\4\uffff";
	static final String DFA224_minS =
		"\1\26\27\103\1\uffff\1\103\1\uffff\1\103\4\uffff";
	static final String DFA224_maxS =
		"\1\u00af\27\u00c9\1\uffff\1\u00c9\1\uffff\1\u00c9\4\uffff";
	static final String DFA224_acceptS =
		"\30\uffff\1\2\1\uffff\1\4\1\uffff\1\6\1\1\1\3\1\5";
	static final String DFA224_specialS =
		"\40\uffff}>";
	static final String[] DFA224_transitionS = {
			"\1\32\4\uffff\2\32\4\uffff\1\32\1\uffff\1\1\3\uffff\1\2\1\3\1\4\1\uffff"+
			"\3\32\1\uffff\3\32\1\5\1\uffff\1\32\1\24\1\6\4\uffff\1\32\1\7\1\uffff"+
			"\1\10\2\uffff\3\32\1\11\1\uffff\1\33\1\uffff\2\32\1\uffff\1\32\3\uffff"+
			"\1\12\2\32\1\uffff\1\13\2\uffff\3\32\1\uffff\3\32\1\uffff\1\27\1\32\1"+
			"\26\6\uffff\1\32\1\uffff\1\32\4\uffff\1\32\2\uffff\5\32\5\uffff\1\32"+
			"\1\uffff\2\32\1\uffff\1\30\1\32\1\14\4\32\1\15\1\25\1\16\1\23\1\17\2"+
			"\uffff\1\32\1\uffff\1\32\1\31\1\32\4\uffff\2\32\1\uffff\1\20\1\32\1\21"+
			"\1\22\3\uffff\1\32\11\uffff\1\32\3\uffff\1\34",
			"\1\35\14\uffff\1\35\12\uffff\1\35\34\uffff\1\35\12\uffff\1\35\70\uffff"+
			"\1\35\2\uffff\1\35\2\uffff\1\32\2\uffff\1\35\3\uffff\1\35",
			"\1\35\14\uffff\1\35\12\uffff\1\35\34\uffff\1\35\12\uffff\1\35\70\uffff"+
			"\1\35\2\uffff\1\35\2\uffff\1\32\2\uffff\1\35\3\uffff\1\35",
			"\1\35\14\uffff\1\35\12\uffff\1\35\34\uffff\1\35\12\uffff\1\35\70\uffff"+
			"\1\35\2\uffff\1\35\2\uffff\1\32\2\uffff\1\35\3\uffff\1\35",
			"\1\35\14\uffff\1\35\12\uffff\1\35\34\uffff\1\35\12\uffff\1\35\70\uffff"+
			"\1\35\2\uffff\1\35\2\uffff\1\32\2\uffff\1\35\3\uffff\1\35",
			"\1\35\14\uffff\1\35\12\uffff\1\35\34\uffff\1\35\12\uffff\1\35\70\uffff"+
			"\1\35\2\uffff\1\35\2\uffff\1\32\2\uffff\1\35\3\uffff\1\35",
			"\1\35\14\uffff\1\35\12\uffff\1\35\34\uffff\1\35\12\uffff\1\35\70\uffff"+
			"\1\35\2\uffff\1\35\2\uffff\1\32\2\uffff\1\35\3\uffff\1\35",
			"\1\35\14\uffff\1\35\12\uffff\1\35\34\uffff\1\35\12\uffff\1\35\70\uffff"+
			"\1\35\2\uffff\1\35\2\uffff\1\32\2\uffff\1\35\3\uffff\1\35",
			"\1\35\14\uffff\1\35\12\uffff\1\35\34\uffff\1\35\12\uffff\1\35\70\uffff"+
			"\1\35\2\uffff\1\35\2\uffff\1\32\2\uffff\1\35\3\uffff\1\35",
			"\1\35\14\uffff\1\35\12\uffff\1\35\34\uffff\1\35\12\uffff\1\35\70\uffff"+
			"\1\35\2\uffff\1\35\2\uffff\1\32\2\uffff\1\35\3\uffff\1\35",
			"\1\35\14\uffff\1\35\12\uffff\1\35\34\uffff\1\35\12\uffff\1\35\70\uffff"+
			"\1\35\2\uffff\1\35\2\uffff\1\32\2\uffff\1\35\3\uffff\1\35",
			"\1\35\14\uffff\1\35\12\uffff\1\35\34\uffff\1\35\12\uffff\1\35\70\uffff"+
			"\1\35\2\uffff\1\35\2\uffff\1\32\2\uffff\1\35\3\uffff\1\35",
			"\1\35\14\uffff\1\35\12\uffff\1\35\34\uffff\1\35\12\uffff\1\35\70\uffff"+
			"\1\35\2\uffff\1\35\2\uffff\1\32\2\uffff\1\35\3\uffff\1\35",
			"\1\35\14\uffff\1\35\12\uffff\1\35\34\uffff\1\35\12\uffff\1\35\70\uffff"+
			"\1\35\2\uffff\1\35\2\uffff\1\32\2\uffff\1\35\3\uffff\1\35",
			"\1\35\14\uffff\1\35\12\uffff\1\35\34\uffff\1\35\12\uffff\1\35\70\uffff"+
			"\1\35\2\uffff\1\35\2\uffff\1\32\2\uffff\1\35\3\uffff\1\35",
			"\1\35\14\uffff\1\35\12\uffff\1\35\34\uffff\1\35\12\uffff\1\35\70\uffff"+
			"\1\35\2\uffff\1\35\2\uffff\1\32\2\uffff\1\35\3\uffff\1\35",
			"\1\35\14\uffff\1\35\12\uffff\1\35\34\uffff\1\35\12\uffff\1\35\70\uffff"+
			"\1\35\2\uffff\1\35\2\uffff\1\32\2\uffff\1\35\3\uffff\1\35",
			"\1\35\14\uffff\1\35\12\uffff\1\35\34\uffff\1\35\12\uffff\1\35\70\uffff"+
			"\1\35\2\uffff\1\35\2\uffff\1\32\2\uffff\1\35\3\uffff\1\35",
			"\1\35\14\uffff\1\35\12\uffff\1\35\34\uffff\1\35\12\uffff\1\35\70\uffff"+
			"\1\35\2\uffff\1\35\2\uffff\1\32\2\uffff\1\35\3\uffff\1\35",
			"\1\35\14\uffff\1\35\12\uffff\1\35\34\uffff\1\35\12\uffff\1\35\70\uffff"+
			"\1\35\2\uffff\1\35\2\uffff\1\32\2\uffff\1\35\3\uffff\1\35",
			"\1\35\14\uffff\1\35\12\uffff\1\35\34\uffff\1\35\12\uffff\1\35\70\uffff"+
			"\1\35\2\uffff\1\35\2\uffff\1\32\2\uffff\1\35\3\uffff\1\35",
			"\1\35\14\uffff\1\35\12\uffff\1\35\34\uffff\1\35\12\uffff\1\35\70\uffff"+
			"\1\35\2\uffff\1\35\2\uffff\1\32\2\uffff\1\35\3\uffff\1\35",
			"\1\32\14\uffff\1\32\12\uffff\1\32\34\uffff\1\32\12\uffff\1\32\70\uffff"+
			"\1\32\2\uffff\1\32\2\uffff\1\32\2\uffff\1\32\1\30\2\uffff\1\32",
			"\1\32\14\uffff\1\32\12\uffff\1\32\34\uffff\1\32\12\uffff\1\32\70\uffff"+
			"\1\32\2\uffff\1\32\2\uffff\1\32\2\uffff\1\32\1\30\2\uffff\1\32",
			"",
			"\1\32\14\uffff\1\32\12\uffff\1\32\34\uffff\1\32\12\uffff\1\32\70\uffff"+
			"\1\32\2\uffff\1\32\2\uffff\1\32\2\uffff\1\32\1\36\2\uffff\1\32",
			"",
			"\1\32\14\uffff\1\32\12\uffff\1\32\34\uffff\1\32\12\uffff\1\32\70\uffff"+
			"\1\32\2\uffff\1\32\2\uffff\1\32\2\uffff\1\32\1\37\2\uffff\1\32",
			"",
			"",
			"",
			""
	};

	static final short[] DFA224_eot = DFA.unpackEncodedString(DFA224_eotS);
	static final short[] DFA224_eof = DFA.unpackEncodedString(DFA224_eofS);
	static final char[] DFA224_min = DFA.unpackEncodedStringToUnsignedChars(DFA224_minS);
	static final char[] DFA224_max = DFA.unpackEncodedStringToUnsignedChars(DFA224_maxS);
	static final short[] DFA224_accept = DFA.unpackEncodedString(DFA224_acceptS);
	static final short[] DFA224_special = DFA.unpackEncodedString(DFA224_specialS);
	static final short[][] DFA224_transition;

	static {
		int numStates = DFA224_transitionS.length;
		DFA224_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA224_transition[i] = DFA.unpackEncodedString(DFA224_transitionS[i]);
		}
	}

	protected class DFA224 extends DFA {

		public DFA224(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 224;
			this.eot = DFA224_eot;
			this.eof = DFA224_eof;
			this.min = DFA224_min;
			this.max = DFA224_max;
			this.accept = DFA224_accept;
			this.special = DFA224_special;
			this.transition = DFA224_transition;
		}
		@Override
		public String getDescription() {
			return "1689:1: comparatorType returns [CQL3Type.Raw t] : (n= native_type |c= collection_type |tt= tuple_type |id= userTypeName | K_FROZEN '<' f= comparatorType '>' |s= STRING_LITERAL );";
		}
	}

	public static final BitSet FOLLOW_selectStatement_in_cqlStatement59 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insertStatement_in_cqlStatement88 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_updateStatement_in_cqlStatement117 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_batchStatement_in_cqlStatement146 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_deleteStatement_in_cqlStatement176 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_useStatement_in_cqlStatement205 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_truncateStatement_in_cqlStatement237 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_createKeyspaceStatement_in_cqlStatement264 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_createTableStatement_in_cqlStatement285 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_createIndexStatement_in_cqlStatement308 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dropKeyspaceStatement_in_cqlStatement331 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dropTableStatement_in_cqlStatement353 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dropIndexStatement_in_cqlStatement378 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_alterTableStatement_in_cqlStatement403 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_alterKeyspaceStatement_in_cqlStatement427 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_grantPermissionsStatement_in_cqlStatement448 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_revokePermissionsStatement_in_cqlStatement466 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_listPermissionsStatement_in_cqlStatement483 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_createUserStatement_in_cqlStatement502 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_alterUserStatement_in_cqlStatement526 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dropUserStatement_in_cqlStatement551 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_listUsersStatement_in_cqlStatement577 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_createTriggerStatement_in_cqlStatement602 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dropTriggerStatement_in_cqlStatement623 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_createTypeStatement_in_cqlStatement646 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_alterTypeStatement_in_cqlStatement670 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dropTypeStatement_in_cqlStatement695 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_createFunctionStatement_in_cqlStatement721 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dropFunctionStatement_in_cqlStatement741 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_createAggregateStatement_in_cqlStatement763 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dropAggregateStatement_in_cqlStatement782 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_createRoleStatement_in_cqlStatement803 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_alterRoleStatement_in_cqlStatement827 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dropRoleStatement_in_cqlStatement852 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_listRolesStatement_in_cqlStatement878 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_grantRoleStatement_in_cqlStatement903 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_revokeRoleStatement_in_cqlStatement928 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_createMaterializedViewStatement_in_cqlStatement952 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dropMaterializedViewStatement_in_cqlStatement964 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_alterMaterializedViewStatement_in_cqlStatement978 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_USE_in_useStatement1004 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x00000C023D874FFEL});
	public static final BitSet FOLLOW_keyspaceName_in_useStatement1008 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_SELECT_in_selectStatement1042 = new BitSet(new long[]{0x5877BB8A18D10840L,0x68FE4AE1DDCB8B5EL,0x08048C023D876FFEL,0x0000000000009811L});
	public static final BitSet FOLLOW_K_JSON_in_selectStatement1068 = new BitSet(new long[]{0x5877BB8A18D10840L,0x68FE4AE1DDCB8B5EL,0x08048C023D876FFEL,0x0000000000009811L});
	public static final BitSet FOLLOW_selectClause_in_selectStatement1077 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_K_FROM_in_selectStatement1085 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x00000C023D874FFEL});
	public static final BitSet FOLLOW_columnFamilyName_in_selectStatement1089 = new BitSet(new long[]{0x0000000020000002L,0x0009000020000800L,0x0000000080000000L});
	public static final BitSet FOLLOW_K_WHERE_in_selectStatement1099 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x080008023D876FFEL,0x0000000000004000L});
	public static final BitSet FOLLOW_whereClause_in_selectStatement1103 = new BitSet(new long[]{0x0000000020000002L,0x0009000020000800L});
	public static final BitSet FOLLOW_K_GROUP_in_selectStatement1116 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_K_BY_in_selectStatement1118 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x000008023D874FFEL});
	public static final BitSet FOLLOW_groupByClause_in_selectStatement1120 = new BitSet(new long[]{0x0000000020000002L,0x0009000020000000L,0x8000000000000000L});
	public static final BitSet FOLLOW_191_in_selectStatement1125 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x000008023D874FFEL});
	public static final BitSet FOLLOW_groupByClause_in_selectStatement1127 = new BitSet(new long[]{0x0000000020000002L,0x0009000020000000L,0x8000000000000000L});
	public static final BitSet FOLLOW_K_ORDER_in_selectStatement1144 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_K_BY_in_selectStatement1146 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x000008023D874FFEL});
	public static final BitSet FOLLOW_orderByClause_in_selectStatement1148 = new BitSet(new long[]{0x0000000020000002L,0x0008000020000000L,0x8000000000000000L});
	public static final BitSet FOLLOW_191_in_selectStatement1153 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x000008023D874FFEL});
	public static final BitSet FOLLOW_orderByClause_in_selectStatement1155 = new BitSet(new long[]{0x0000000020000002L,0x0008000020000000L,0x8000000000000000L});
	public static final BitSet FOLLOW_K_PER_in_selectStatement1172 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_K_PARTITION_in_selectStatement1174 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_K_LIMIT_in_selectStatement1176 = new BitSet(new long[]{0x0000000000800000L,0x0000000000000000L,0x0000040000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_intValue_in_selectStatement1180 = new BitSet(new long[]{0x0000000020000002L,0x0000000020000000L});
	public static final BitSet FOLLOW_K_LIMIT_in_selectStatement1195 = new BitSet(new long[]{0x0000000000800000L,0x0000000000000000L,0x0000040000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_intValue_in_selectStatement1199 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_K_ALLOW_in_selectStatement1214 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_K_FILTERING_in_selectStatement1216 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_DISTINCT_in_selectClause1271 = new BitSet(new long[]{0x5877BB8A18D10840L,0x68FE4AE1DDCB8B5EL,0x08048C023D876FFEL,0x0000000000009811L});
	public static final BitSet FOLLOW_selectors_in_selectClause1275 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_selectors_in_selectClause1287 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_selector_in_selectors1312 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x8000000000000000L});
	public static final BitSet FOLLOW_191_in_selectors1317 = new BitSet(new long[]{0x5877BB8A18D10840L,0x68FE4AE1DDCB8B5EL,0x08048C023D876FFEL,0x0000000000008811L});
	public static final BitSet FOLLOW_selector_in_selectors1321 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x8000000000000000L});
	public static final BitSet FOLLOW_204_in_selectors1333 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unaliasedSelector_in_selector1366 = new BitSet(new long[]{0x0000000200000002L});
	public static final BitSet FOLLOW_K_AS_in_selector1369 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x000008023D874FFEL});
	public static final BitSet FOLLOW_noncol_ident_in_selector1373 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_selectionAddition_in_unaliasedSelector1402 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_selectionMultiplication_in_selectionAddition1429 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x2000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_189_in_selectionAddition1445 = new BitSet(new long[]{0x5877BB8A18D10840L,0x68FE4AE1DDCB8B5EL,0x08048C023D876FFEL,0x0000000000008811L});
	public static final BitSet FOLLOW_selectionMultiplication_in_selectionAddition1449 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x2000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_192_in_selectionAddition1463 = new BitSet(new long[]{0x5877BB8A18D10840L,0x68FE4AE1DDCB8B5EL,0x08048C023D876FFEL,0x0000000000008811L});
	public static final BitSet FOLLOW_selectionMultiplication_in_selectionAddition1467 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x2000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_selectionGroup_in_selectionMultiplication1505 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0400000000000000L,0x0000000000001008L});
	public static final BitSet FOLLOW_204_in_selectionMultiplication1521 = new BitSet(new long[]{0x5877BB8A18D10840L,0x68FE4AE1DDCB8B5EL,0x08048C023D876FFEL,0x0000000000008811L});
	public static final BitSet FOLLOW_selectionGroup_in_selectionMultiplication1525 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0400000000000000L,0x0000000000001008L});
	public static final BitSet FOLLOW_195_in_selectionMultiplication1539 = new BitSet(new long[]{0x5877BB8A18D10840L,0x68FE4AE1DDCB8B5EL,0x08048C023D876FFEL,0x0000000000008811L});
	public static final BitSet FOLLOW_selectionGroup_in_selectionMultiplication1543 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0400000000000000L,0x0000000000001008L});
	public static final BitSet FOLLOW_186_in_selectionMultiplication1557 = new BitSet(new long[]{0x5877BB8A18D10840L,0x68FE4AE1DDCB8B5EL,0x08048C023D876FFEL,0x0000000000008811L});
	public static final BitSet FOLLOW_selectionGroup_in_selectionMultiplication1561 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0400000000000000L,0x0000000000001008L});
	public static final BitSet FOLLOW_selectionGroupWithField_in_selectionGroup1603 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_selectionGroupWithoutField_in_selectionGroup1615 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_192_in_selectionGroup1625 = new BitSet(new long[]{0x5877BB8A18D10840L,0x68FE4AE1DDCB8B5EL,0x08048C023D876FFEL,0x0000000000008811L});
	public static final BitSet FOLLOW_selectionGroup_in_selectionGroup1629 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_selectionGroupWithoutField_in_selectionGroupWithField1654 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000804L});
	public static final BitSet FOLLOW_selectorModifier_in_selectionGroupWithField1658 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fieldSelectorModifier_in_selectorModifier1685 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000804L});
	public static final BitSet FOLLOW_selectorModifier_in_selectorModifier1690 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_203_in_selectorModifier1701 = new BitSet(new long[]{0x5877BB8A18D10840L,0x68FE4AE1DDCB8B5EL,0x0804AC023D876FFEL,0x0000000000008811L});
	public static final BitSet FOLLOW_collectionSubSelection_in_selectorModifier1705 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_205_in_selectorModifier1708 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000804L});
	public static final BitSet FOLLOW_selectorModifier_in_selectorModifier1712 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_194_in_fieldSelectorModifier1745 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x000008023D874FFEL});
	public static final BitSet FOLLOW_fident_in_fieldSelectorModifier1749 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_term_in_collectionSubSelection1787 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000200000000000L});
	public static final BitSet FOLLOW_RANGE_in_collectionSubSelection1793 = new BitSet(new long[]{0x5877BB8A18D10842L,0x68FE4AE1DDCB8B5EL,0x08048C023D876FFEL,0x0000000000008811L});
	public static final BitSet FOLLOW_term_in_collectionSubSelection1798 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RANGE_in_collectionSubSelection1813 = new BitSet(new long[]{0x5877BB8A18D10840L,0x68FE4AE1DDCB8B5EL,0x08048C023D876FFEL,0x0000000000008811L});
	public static final BitSet FOLLOW_term_in_collectionSubSelection1819 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simpleUnaliasedSelector_in_selectionGroupWithoutField1871 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_selectionTypeHint_in_selectionGroupWithoutField1889 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_selectionTupleOrNestedSelector_in_selectionGroupWithoutField1901 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_selectionList_in_selectionGroupWithoutField1913 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_selectionMapOrSet_in_selectionGroupWithoutField1925 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_187_in_selectionTypeHint1953 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x000088023D874FFFL});
	public static final BitSet FOLLOW_comparatorType_in_selectionTypeHint1957 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_188_in_selectionTypeHint1959 = new BitSet(new long[]{0x5877BB8A18D10840L,0x68FE4AE1DDCB8B5EL,0x08048C023D876FFEL,0x0000000000008810L});
	public static final BitSet FOLLOW_selectionGroupWithoutField_in_selectionTypeHint1963 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_203_in_selectionList2004 = new BitSet(new long[]{0x5877BB8A18D10840L,0x68FE4AE1DDCB8B5EL,0x08048C023D876FFEL,0x000000000000A811L});
	public static final BitSet FOLLOW_unaliasedSelector_in_selectionList2010 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x8000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_191_in_selectionList2016 = new BitSet(new long[]{0x5877BB8A18D10840L,0x68FE4AE1DDCB8B5EL,0x08048C023D876FFEL,0x0000000000008811L});
	public static final BitSet FOLLOW_unaliasedSelector_in_selectionList2020 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x8000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_205_in_selectionList2030 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_207_in_selectionMapOrSet2051 = new BitSet(new long[]{0x5877BB8A18D10840L,0x68FE4AE1DDCB8B5EL,0x08048C023D876FFEL,0x0000000000008811L});
	public static final BitSet FOLLOW_unaliasedSelector_in_selectionMapOrSet2055 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x8000000000000000L,0x0000000000010010L});
	public static final BitSet FOLLOW_selectionMap_in_selectionMapOrSet2061 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_selectionSet_in_selectionMapOrSet2070 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_208_in_selectionMapOrSet2076 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_207_in_selectionMapOrSet2084 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_208_in_selectionMapOrSet2086 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_196_in_selectionMap2131 = new BitSet(new long[]{0x5877BB8A18D10840L,0x68FE4AE1DDCB8B5EL,0x08048C023D876FFEL,0x0000000000008811L});
	public static final BitSet FOLLOW_unaliasedSelector_in_selectionMap2135 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x8000000000000000L});
	public static final BitSet FOLLOW_191_in_selectionMap2143 = new BitSet(new long[]{0x5877BB8A18D10840L,0x68FE4AE1DDCB8B5EL,0x08048C023D876FFEL,0x0000000000008811L});
	public static final BitSet FOLLOW_unaliasedSelector_in_selectionMap2147 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_196_in_selectionMap2149 = new BitSet(new long[]{0x5877BB8A18D10840L,0x68FE4AE1DDCB8B5EL,0x08048C023D876FFEL,0x0000000000008811L});
	public static final BitSet FOLLOW_unaliasedSelector_in_selectionMap2153 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x8000000000000000L});
	public static final BitSet FOLLOW_191_in_selectionSet2205 = new BitSet(new long[]{0x5877BB8A18D10840L,0x68FE4AE1DDCB8B5EL,0x08048C023D876FFEL,0x0000000000008811L});
	public static final BitSet FOLLOW_unaliasedSelector_in_selectionSet2209 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x8000000000000000L});
	public static final BitSet FOLLOW_187_in_selectionTupleOrNestedSelector2255 = new BitSet(new long[]{0x5877BB8A18D10840L,0x68FE4AE1DDCB8B5EL,0x08048C023D876FFEL,0x0000000000008811L});
	public static final BitSet FOLLOW_unaliasedSelector_in_selectionTupleOrNestedSelector2259 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x9000000000000000L});
	public static final BitSet FOLLOW_191_in_selectionTupleOrNestedSelector2264 = new BitSet(new long[]{0x5877BB8A18D10840L,0x68FE4AE1DDCB8B5EL,0x08048C023D876FFEL,0x0000000000008811L});
	public static final BitSet FOLLOW_unaliasedSelector_in_selectionTupleOrNestedSelector2268 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x9000000000000000L});
	public static final BitSet FOLLOW_188_in_selectionTupleOrNestedSelector2275 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_sident_in_simpleUnaliasedSelector2300 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_selectionLiteral_in_simpleUnaliasedSelector2346 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_selectionFunction_in_simpleUnaliasedSelector2382 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_COUNT_in_selectionFunction2428 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_187_in_selectionFunction2430 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_204_in_selectionFunction2432 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_188_in_selectionFunction2434 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_WRITETIME_in_selectionFunction2465 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_187_in_selectionFunction2467 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x000008023D874FFEL});
	public static final BitSet FOLLOW_cident_in_selectionFunction2471 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_188_in_selectionFunction2473 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_TTL_in_selectionFunction2496 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_187_in_selectionFunction2504 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x000008023D874FFEL});
	public static final BitSet FOLLOW_cident_in_selectionFunction2508 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_188_in_selectionFunction2510 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_CAST_in_selectionFunction2533 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_187_in_selectionFunction2540 = new BitSet(new long[]{0x5877BB8A18D10840L,0x68FE4AE1DDCB8B5EL,0x08048C023D876FFEL,0x0000000000008811L});
	public static final BitSet FOLLOW_unaliasedSelector_in_selectionFunction2544 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_K_AS_in_selectionFunction2546 = new BitSet(new long[]{0x5064038800000000L,0x0000000000088010L,0x0000000034000F84L});
	public static final BitSet FOLLOW_native_type_in_selectionFunction2550 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_188_in_selectionFunction2552 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionName_in_selectionFunction2564 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_selectionFunctionArgs_in_selectionFunction2568 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constant_in_selectionLiteral2593 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_NULL_in_selectionLiteral2623 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_196_in_selectionLiteral2657 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x000008023D874FFEL});
	public static final BitSet FOLLOW_noncol_ident_in_selectionLiteral2661 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QMARK_in_selectionLiteral2682 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_187_in_selectionFunctionArgs2738 = new BitSet(new long[]{0x5877BB8A18D10840L,0x68FE4AE1DDCB8B5EL,0x18048C023D876FFEL,0x0000000000008811L});
	public static final BitSet FOLLOW_unaliasedSelector_in_selectionFunctionArgs2743 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x9000000000000000L});
	public static final BitSet FOLLOW_191_in_selectionFunctionArgs2759 = new BitSet(new long[]{0x5877BB8A18D10840L,0x68FE4AE1DDCB8B5EL,0x08048C023D876FFEL,0x0000000000008811L});
	public static final BitSet FOLLOW_unaliasedSelector_in_selectionFunctionArgs2763 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x9000000000000000L});
	public static final BitSet FOLLOW_188_in_selectionFunctionArgs2778 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_sident2801 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QUOTED_NAME_in_sident2826 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unreserved_keyword_in_sident2845 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_relationOrExpression_in_whereClause2876 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_K_AND_in_whereClause2880 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x080008023D876FFEL,0x0000000000004000L});
	public static final BitSet FOLLOW_relationOrExpression_in_whereClause2882 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_relation_in_relationOrExpression2904 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_customIndexExpression_in_relationOrExpression2913 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_206_in_customIndexExpression2941 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x00000C023D874FFEL});
	public static final BitSet FOLLOW_idxName_in_customIndexExpression2943 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x8000000000000000L});
	public static final BitSet FOLLOW_191_in_customIndexExpression2946 = new BitSet(new long[]{0x5877BB8A18D10840L,0x68FE4AE1DDCB8B5EL,0x08048C023D876FFEL,0x0000000000008811L});
	public static final BitSet FOLLOW_term_in_customIndexExpression2950 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_188_in_customIndexExpression2952 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cident_in_orderByClause2982 = new BitSet(new long[]{0x0200000400000002L});
	public static final BitSet FOLLOW_K_ASC_in_orderByClause2985 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_DESC_in_orderByClause2989 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cident_in_groupByClause3015 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_INSERT_in_insertStatement3040 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_K_INTO_in_insertStatement3042 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x00000C023D874FFEL});
	public static final BitSet FOLLOW_columnFamilyName_in_insertStatement3046 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L,0x0800000000000000L});
	public static final BitSet FOLLOW_normalInsertStatement_in_insertStatement3060 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_JSON_in_insertStatement3075 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000840000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_jsonInsertStatement_in_insertStatement3079 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_187_in_normalInsertStatement3115 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x000008023D874FFEL});
	public static final BitSet FOLLOW_cident_in_normalInsertStatement3119 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x9000000000000000L});
	public static final BitSet FOLLOW_191_in_normalInsertStatement3126 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x000008023D874FFEL});
	public static final BitSet FOLLOW_cident_in_normalInsertStatement3130 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x9000000000000000L});
	public static final BitSet FOLLOW_188_in_normalInsertStatement3137 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_K_VALUES_in_normalInsertStatement3145 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_187_in_normalInsertStatement3153 = new BitSet(new long[]{0x5877BB8A18D10840L,0x68FE4AE1DDCB8B5EL,0x08048C023D876FFEL,0x0000000000008811L});
	public static final BitSet FOLLOW_term_in_normalInsertStatement3157 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x9000000000000000L});
	public static final BitSet FOLLOW_191_in_normalInsertStatement3163 = new BitSet(new long[]{0x5877BB8A18D10840L,0x68FE4AE1DDCB8B5EL,0x08048C023D876FFEL,0x0000000000008811L});
	public static final BitSet FOLLOW_term_in_normalInsertStatement3167 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x9000000000000000L});
	public static final BitSet FOLLOW_188_in_normalInsertStatement3174 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L,0x0000000002000000L});
	public static final BitSet FOLLOW_K_IF_in_normalInsertStatement3184 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_K_NOT_in_normalInsertStatement3186 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_K_EXISTS_in_normalInsertStatement3188 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_usingClause_in_normalInsertStatement3203 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_jsonValue_in_jsonInsertStatement3249 = new BitSet(new long[]{0x0080000000000002L,0x0000000000001000L,0x0000000002000000L});
	public static final BitSet FOLLOW_K_DEFAULT_in_jsonInsertStatement3259 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_K_NULL_in_jsonInsertStatement3263 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L,0x0000000002000000L});
	public static final BitSet FOLLOW_K_UNSET_in_jsonInsertStatement3271 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L,0x0000000002000000L});
	public static final BitSet FOLLOW_K_IF_in_jsonInsertStatement3287 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_K_NOT_in_jsonInsertStatement3289 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_K_EXISTS_in_jsonInsertStatement3291 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_usingClause_in_jsonInsertStatement3306 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_jsonValue3341 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_196_in_jsonValue3351 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x000008023D874FFEL});
	public static final BitSet FOLLOW_noncol_ident_in_jsonValue3355 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QMARK_in_jsonValue3369 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_USING_in_usingClause3400 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010200L});
	public static final BitSet FOLLOW_usingClauseObjective_in_usingClause3402 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_K_AND_in_usingClause3407 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010200L});
	public static final BitSet FOLLOW_usingClauseObjective_in_usingClause3409 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_K_TIMESTAMP_in_usingClauseObjective3431 = new BitSet(new long[]{0x0000000000800000L,0x0000000000000000L,0x0000040000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_intValue_in_usingClauseObjective3435 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_TTL_in_usingClauseObjective3445 = new BitSet(new long[]{0x0000000000800000L,0x0000000000000000L,0x0000040000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_intValue_in_usingClauseObjective3449 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_UPDATE_in_updateStatement3483 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x00000C023D874FFEL});
	public static final BitSet FOLLOW_columnFamilyName_in_updateStatement3487 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000001L});
	public static final BitSet FOLLOW_usingClause_in_updateStatement3497 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_K_SET_in_updateStatement3509 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x000008023D874FFEL});
	public static final BitSet FOLLOW_columnOperation_in_updateStatement3511 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x8000000080000000L});
	public static final BitSet FOLLOW_191_in_updateStatement3515 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x000008023D874FFEL});
	public static final BitSet FOLLOW_columnOperation_in_updateStatement3517 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x8000000080000000L});
	public static final BitSet FOLLOW_K_WHERE_in_updateStatement3528 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x080008023D876FFEL,0x0000000000004000L});
	public static final BitSet FOLLOW_whereClause_in_updateStatement3532 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
	public static final BitSet FOLLOW_K_IF_in_updateStatement3542 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x000008023D874FFEL});
	public static final BitSet FOLLOW_K_EXISTS_in_updateStatement3546 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_updateConditions_in_updateStatement3554 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_columnCondition_in_updateConditions3596 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_K_AND_in_updateConditions3601 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x000008023D874FFEL});
	public static final BitSet FOLLOW_columnCondition_in_updateConditions3603 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_K_DELETE_in_deleteStatement3640 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B7EL,0x000008023D874FFEL});
	public static final BitSet FOLLOW_deleteSelection_in_deleteStatement3646 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_K_FROM_in_deleteStatement3659 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x00000C023D874FFEL});
	public static final BitSet FOLLOW_columnFamilyName_in_deleteStatement3663 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000082000000L});
	public static final BitSet FOLLOW_usingClauseDelete_in_deleteStatement3673 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000080000000L});
	public static final BitSet FOLLOW_K_WHERE_in_deleteStatement3685 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x080008023D876FFEL,0x0000000000004000L});
	public static final BitSet FOLLOW_whereClause_in_deleteStatement3689 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
	public static final BitSet FOLLOW_K_IF_in_deleteStatement3699 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x000008023D874FFEL});
	public static final BitSet FOLLOW_K_EXISTS_in_deleteStatement3703 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_updateConditions_in_deleteStatement3711 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_deleteOp_in_deleteSelection3758 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x8000000000000000L});
	public static final BitSet FOLLOW_191_in_deleteSelection3773 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x000008023D874FFEL});
	public static final BitSet FOLLOW_deleteOp_in_deleteSelection3777 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x8000000000000000L});
	public static final BitSet FOLLOW_cident_in_deleteOp3804 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cident_in_deleteOp3831 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_203_in_deleteOp3833 = new BitSet(new long[]{0x5877BB8A18D10840L,0x68FE4AE1DDCB8B5EL,0x08048C023D876FFEL,0x0000000000008811L});
	public static final BitSet FOLLOW_term_in_deleteOp3837 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_205_in_deleteOp3839 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cident_in_deleteOp3851 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_194_in_deleteOp3853 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x000008023D874FFEL});
	public static final BitSet FOLLOW_fident_in_deleteOp3857 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_USING_in_usingClauseDelete3877 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_K_TIMESTAMP_in_usingClauseDelete3879 = new BitSet(new long[]{0x0000000000800000L,0x0000000000000000L,0x0000040000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_intValue_in_usingClauseDelete3883 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_BEGIN_in_batchStatement3917 = new BitSet(new long[]{0x0004002000000000L,0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_K_UNLOGGED_in_batchStatement3927 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_K_COUNTER_in_batchStatement3933 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_K_BATCH_in_batchStatement3946 = new BitSet(new long[]{0x0100000100000000L,0x0000000000040000L,0x0000000002200000L});
	public static final BitSet FOLLOW_usingClause_in_batchStatement3950 = new BitSet(new long[]{0x0100000100000000L,0x0000000000040000L,0x0000000000200000L});
	public static final BitSet FOLLOW_batchStatementObjective_in_batchStatement3970 = new BitSet(new long[]{0x0100000100000000L,0x0000000000040000L,0x0000000000200000L,0x0000000000000020L});
	public static final BitSet FOLLOW_197_in_batchStatement3972 = new BitSet(new long[]{0x0100000100000000L,0x0000000000040000L,0x0000000000200000L});
	public static final BitSet FOLLOW_K_APPLY_in_batchStatement3986 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_K_BATCH_in_batchStatement3988 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insertStatement_in_batchStatementObjective4019 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_updateStatement_in_batchStatementObjective4032 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_deleteStatement_in_batchStatementObjective4045 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_CREATE_in_createAggregateStatement4078 = new BitSet(new long[]{0x0000000008000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_K_OR_in_createAggregateStatement4081 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_K_REPLACE_in_createAggregateStatement4083 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_K_AGGREGATE_in_createAggregateStatement4095 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB9B5EL,0x00000C023D876FFEL});
	public static final BitSet FOLLOW_K_IF_in_createAggregateStatement4104 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_K_NOT_in_createAggregateStatement4106 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_K_EXISTS_in_createAggregateStatement4108 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x00000C023D876FFEL});
	public static final BitSet FOLLOW_functionName_in_createAggregateStatement4122 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_187_in_createAggregateStatement4130 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x100088023D874FFFL});
	public static final BitSet FOLLOW_comparatorType_in_createAggregateStatement4154 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x9000000000000000L});
	public static final BitSet FOLLOW_191_in_createAggregateStatement4170 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x000088023D874FFFL});
	public static final BitSet FOLLOW_comparatorType_in_createAggregateStatement4174 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x9000000000000000L});
	public static final BitSet FOLLOW_188_in_createAggregateStatement4198 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_K_SFUNC_in_createAggregateStatement4206 = new BitSet(new long[]{0x5077AB8A18400000L,0x683E4281DD0B8B5EL,0x000008003D866FFEL});
	public static final BitSet FOLLOW_allowedFunctionName_in_createAggregateStatement4212 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_K_STYPE_in_createAggregateStatement4220 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x000088023D874FFFL});
	public static final BitSet FOLLOW_comparatorType_in_createAggregateStatement4226 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010008L});
	public static final BitSet FOLLOW_K_FINALFUNC_in_createAggregateStatement4244 = new BitSet(new long[]{0x5077AB8A18400000L,0x683E4281DD0B8B5EL,0x000008003D866FFEL});
	public static final BitSet FOLLOW_allowedFunctionName_in_createAggregateStatement4250 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
	public static final BitSet FOLLOW_K_INITCOND_in_createAggregateStatement4277 = new BitSet(new long[]{0x5877BB8A18D10840L,0x68FE4AE1DDCB8B5EL,0x08048C023D876FFEL,0x0000000000008811L});
	public static final BitSet FOLLOW_term_in_createAggregateStatement4283 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_DROP_in_dropAggregateStatement4330 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_K_AGGREGATE_in_dropAggregateStatement4332 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB9B5EL,0x00000C023D876FFEL});
	public static final BitSet FOLLOW_K_IF_in_dropAggregateStatement4341 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_K_EXISTS_in_dropAggregateStatement4343 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x00000C023D876FFEL});
	public static final BitSet FOLLOW_functionName_in_dropAggregateStatement4358 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_187_in_dropAggregateStatement4376 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x100088023D874FFFL});
	public static final BitSet FOLLOW_comparatorType_in_dropAggregateStatement4404 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x9000000000000000L});
	public static final BitSet FOLLOW_191_in_dropAggregateStatement4422 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x000088023D874FFFL});
	public static final BitSet FOLLOW_comparatorType_in_dropAggregateStatement4426 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x9000000000000000L});
	public static final BitSet FOLLOW_188_in_dropAggregateStatement4454 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_CREATE_in_createFunctionStatement4511 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000100L});
	public static final BitSet FOLLOW_K_OR_in_createFunctionStatement4514 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_K_REPLACE_in_createFunctionStatement4516 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_K_FUNCTION_in_createFunctionStatement4528 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB9B5EL,0x00000C023D876FFEL});
	public static final BitSet FOLLOW_K_IF_in_createFunctionStatement4537 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_K_NOT_in_createFunctionStatement4539 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_K_EXISTS_in_createFunctionStatement4541 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x00000C023D876FFEL});
	public static final BitSet FOLLOW_functionName_in_createFunctionStatement4555 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_187_in_createFunctionStatement4563 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x100008023D874FFEL});
	public static final BitSet FOLLOW_noncol_ident_in_createFunctionStatement4587 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x000088023D874FFFL});
	public static final BitSet FOLLOW_comparatorType_in_createFunctionStatement4591 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x9000000000000000L});
	public static final BitSet FOLLOW_191_in_createFunctionStatement4607 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x000008023D874FFEL});
	public static final BitSet FOLLOW_noncol_ident_in_createFunctionStatement4611 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x000088023D874FFFL});
	public static final BitSet FOLLOW_comparatorType_in_createFunctionStatement4615 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x9000000000000000L});
	public static final BitSet FOLLOW_188_in_createFunctionStatement4639 = new BitSet(new long[]{0x0000080000000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_K_RETURNS_in_createFunctionStatement4650 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_K_NULL_in_createFunctionStatement4652 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
	public static final BitSet FOLLOW_K_CALLED_in_createFunctionStatement4658 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
	public static final BitSet FOLLOW_K_ON_in_createFunctionStatement4664 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_K_NULL_in_createFunctionStatement4666 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_K_INPUT_in_createFunctionStatement4668 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_K_RETURNS_in_createFunctionStatement4676 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x000088023D874FFFL});
	public static final BitSet FOLLOW_comparatorType_in_createFunctionStatement4682 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_K_LANGUAGE_in_createFunctionStatement4690 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_IDENT_in_createFunctionStatement4696 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_K_AS_in_createFunctionStatement4704 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_createFunctionStatement4710 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_DROP_in_dropFunctionStatement4748 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_K_FUNCTION_in_dropFunctionStatement4750 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB9B5EL,0x00000C023D876FFEL});
	public static final BitSet FOLLOW_K_IF_in_dropFunctionStatement4759 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_K_EXISTS_in_dropFunctionStatement4761 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x00000C023D876FFEL});
	public static final BitSet FOLLOW_functionName_in_dropFunctionStatement4776 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_187_in_dropFunctionStatement4794 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x100088023D874FFFL});
	public static final BitSet FOLLOW_comparatorType_in_dropFunctionStatement4822 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x9000000000000000L});
	public static final BitSet FOLLOW_191_in_dropFunctionStatement4840 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x000088023D874FFFL});
	public static final BitSet FOLLOW_comparatorType_in_dropFunctionStatement4844 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x9000000000000000L});
	public static final BitSet FOLLOW_188_in_dropFunctionStatement4872 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_CREATE_in_createKeyspaceStatement4931 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_K_KEYSPACE_in_createKeyspaceStatement4933 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB9B5EL,0x00000C023D874FFEL});
	public static final BitSet FOLLOW_K_IF_in_createKeyspaceStatement4936 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_K_NOT_in_createKeyspaceStatement4938 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_K_EXISTS_in_createKeyspaceStatement4940 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x00000C023D874FFEL});
	public static final BitSet FOLLOW_keyspaceName_in_createKeyspaceStatement4949 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_K_WITH_in_createKeyspaceStatement4957 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x000008023D874FFEL});
	public static final BitSet FOLLOW_properties_in_createKeyspaceStatement4959 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_CREATE_in_createTableStatement4994 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_K_COLUMNFAMILY_in_createTableStatement4996 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB9B5EL,0x00000C023D874FFEL});
	public static final BitSet FOLLOW_K_IF_in_createTableStatement4999 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_K_NOT_in_createTableStatement5001 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_K_EXISTS_in_createTableStatement5003 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x00000C023D874FFEL});
	public static final BitSet FOLLOW_columnFamilyName_in_createTableStatement5018 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_cfamDefinition_in_createTableStatement5028 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_187_in_cfamDefinition5047 = new BitSet(new long[]{0x5877BB8A18400000L,0x693E4281DDCB8B5EL,0x000008023D874FFEL});
	public static final BitSet FOLLOW_cfamColumns_in_cfamDefinition5049 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x9000000000000000L});
	public static final BitSet FOLLOW_191_in_cfamDefinition5054 = new BitSet(new long[]{0x5877BB8A18400000L,0x693E4281DDCB8B5EL,0x900008023D874FFEL});
	public static final BitSet FOLLOW_cfamColumns_in_cfamDefinition5056 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x9000000000000000L});
	public static final BitSet FOLLOW_188_in_cfamDefinition5063 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_K_WITH_in_cfamDefinition5073 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x000008023D874FFEL});
	public static final BitSet FOLLOW_cfamProperty_in_cfamDefinition5075 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_K_AND_in_cfamDefinition5080 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x000008023D874FFEL});
	public static final BitSet FOLLOW_cfamProperty_in_cfamDefinition5082 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_ident_in_cfamColumns5117 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x000088023D874FFFL});
	public static final BitSet FOLLOW_comparatorType_in_cfamColumns5121 = new BitSet(new long[]{0x0000000000000002L,0x0100000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_K_STATIC_in_cfamColumns5124 = new BitSet(new long[]{0x0000000000000002L,0x0100000000000000L});
	public static final BitSet FOLLOW_K_PRIMARY_in_cfamColumns5141 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_K_KEY_in_cfamColumns5143 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_PRIMARY_in_cfamColumns5155 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_K_KEY_in_cfamColumns5157 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_187_in_cfamColumns5159 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x080008023D874FFEL});
	public static final BitSet FOLLOW_pkDef_in_cfamColumns5161 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x9000000000000000L});
	public static final BitSet FOLLOW_191_in_cfamColumns5165 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x000008023D874FFEL});
	public static final BitSet FOLLOW_ident_in_cfamColumns5169 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x9000000000000000L});
	public static final BitSet FOLLOW_188_in_cfamColumns5176 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ident_in_pkDef5213 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_187_in_pkDef5223 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x000008023D874FFEL});
	public static final BitSet FOLLOW_ident_in_pkDef5227 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x9000000000000000L});
	public static final BitSet FOLLOW_191_in_pkDef5233 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x000008023D874FFEL});
	public static final BitSet FOLLOW_ident_in_pkDef5237 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x9000000000000000L});
	public static final BitSet FOLLOW_188_in_pkDef5244 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_property_in_cfamProperty5262 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_COMPACT_in_cfamProperty5271 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_K_STORAGE_in_cfamProperty5273 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_CLUSTERING_in_cfamProperty5283 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
	public static final BitSet FOLLOW_K_ORDER_in_cfamProperty5285 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_K_BY_in_cfamProperty5287 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_187_in_cfamProperty5289 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x000008023D874FFEL});
	public static final BitSet FOLLOW_cfamOrdering_in_cfamProperty5291 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x9000000000000000L});
	public static final BitSet FOLLOW_191_in_cfamProperty5295 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x000008023D874FFEL});
	public static final BitSet FOLLOW_cfamOrdering_in_cfamProperty5297 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x9000000000000000L});
	public static final BitSet FOLLOW_188_in_cfamProperty5302 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ident_in_cfamOrdering5330 = new BitSet(new long[]{0x0200000400000000L});
	public static final BitSet FOLLOW_K_ASC_in_cfamOrdering5333 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_DESC_in_cfamOrdering5337 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_CREATE_in_createTypeStatement5376 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_K_TYPE_in_createTypeStatement5378 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB9B5EL,0x000008023D874FFEL});
	public static final BitSet FOLLOW_K_IF_in_createTypeStatement5381 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_K_NOT_in_createTypeStatement5383 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_K_EXISTS_in_createTypeStatement5385 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x000008023D874FFEL});
	public static final BitSet FOLLOW_userTypeName_in_createTypeStatement5403 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_187_in_createTypeStatement5416 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x000008023D874FFEL});
	public static final BitSet FOLLOW_typeColumns_in_createTypeStatement5418 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x9000000000000000L});
	public static final BitSet FOLLOW_191_in_createTypeStatement5423 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x900008023D874FFEL});
	public static final BitSet FOLLOW_typeColumns_in_createTypeStatement5425 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x9000000000000000L});
	public static final BitSet FOLLOW_188_in_createTypeStatement5432 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fident_in_typeColumns5452 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x000088023D874FFFL});
	public static final BitSet FOLLOW_comparatorType_in_typeColumns5456 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_CREATE_in_createIndexStatement5491 = new BitSet(new long[]{0x0010000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_K_CUSTOM_in_createIndexStatement5494 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_K_INDEX_in_createIndexStatement5500 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E6281DDCB9B5EL,0x00000C023D874FFEL});
	public static final BitSet FOLLOW_K_IF_in_createIndexStatement5503 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_K_NOT_in_createIndexStatement5505 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_K_EXISTS_in_createIndexStatement5507 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E6281DDCB8B5EL,0x00000C023D874FFEL});
	public static final BitSet FOLLOW_idxName_in_createIndexStatement5523 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
	public static final BitSet FOLLOW_K_ON_in_createIndexStatement5528 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x00000C023D874FFEL});
	public static final BitSet FOLLOW_columnFamilyName_in_createIndexStatement5532 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_187_in_createIndexStatement5534 = new BitSet(new long[]{0xD877BB8A18400000L,0x683E4281DDCB8BDEL,0x100008023D874FFEL});
	public static final BitSet FOLLOW_indexIdent_in_createIndexStatement5537 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x9000000000000000L});
	public static final BitSet FOLLOW_191_in_createIndexStatement5541 = new BitSet(new long[]{0xD877BB8A18400000L,0x683E4281DDCB8BDEL,0x000008023D874FFEL});
	public static final BitSet FOLLOW_indexIdent_in_createIndexStatement5543 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x9000000000000000L});
	public static final BitSet FOLLOW_188_in_createIndexStatement5550 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000102000000L});
	public static final BitSet FOLLOW_K_USING_in_createIndexStatement5561 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_createIndexStatement5565 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_K_WITH_in_createIndexStatement5580 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x000008023D874FFEL});
	public static final BitSet FOLLOW_properties_in_createIndexStatement5582 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cident_in_indexIdent5614 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_VALUES_in_indexIdent5642 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_187_in_indexIdent5644 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x000008023D874FFEL});
	public static final BitSet FOLLOW_cident_in_indexIdent5648 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_188_in_indexIdent5650 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_KEYS_in_indexIdent5661 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_187_in_indexIdent5663 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x000008023D874FFEL});
	public static final BitSet FOLLOW_cident_in_indexIdent5667 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_188_in_indexIdent5669 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_ENTRIES_in_indexIdent5682 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_187_in_indexIdent5684 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x000008023D874FFEL});
	public static final BitSet FOLLOW_cident_in_indexIdent5688 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_188_in_indexIdent5690 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_FULL_in_indexIdent5700 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_187_in_indexIdent5702 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x000008023D874FFEL});
	public static final BitSet FOLLOW_cident_in_indexIdent5706 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_188_in_indexIdent5708 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_CREATE_in_createMaterializedViewStatement5745 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_K_MATERIALIZED_in_createMaterializedViewStatement5747 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_K_VIEW_in_createMaterializedViewStatement5749 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB9B5EL,0x00000C023D874FFEL});
	public static final BitSet FOLLOW_K_IF_in_createMaterializedViewStatement5752 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_K_NOT_in_createMaterializedViewStatement5754 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_K_EXISTS_in_createMaterializedViewStatement5756 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x00000C023D874FFEL});
	public static final BitSet FOLLOW_columnFamilyName_in_createMaterializedViewStatement5764 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_K_AS_in_createMaterializedViewStatement5766 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
	public static final BitSet FOLLOW_K_SELECT_in_createMaterializedViewStatement5776 = new BitSet(new long[]{0x5877BB8A18D10840L,0x68FE4AE1DDCB8B5EL,0x08048C023D876FFEL,0x0000000000009811L});
	public static final BitSet FOLLOW_selectors_in_createMaterializedViewStatement5780 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_K_FROM_in_createMaterializedViewStatement5782 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x00000C023D874FFEL});
	public static final BitSet FOLLOW_columnFamilyName_in_createMaterializedViewStatement5786 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L,0x0000000080000000L});
	public static final BitSet FOLLOW_K_WHERE_in_createMaterializedViewStatement5797 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x080008023D876FFEL,0x0000000000004000L});
	public static final BitSet FOLLOW_whereClause_in_createMaterializedViewStatement5801 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
	public static final BitSet FOLLOW_K_PRIMARY_in_createMaterializedViewStatement5813 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_K_KEY_in_createMaterializedViewStatement5815 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_187_in_createMaterializedViewStatement5827 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_187_in_createMaterializedViewStatement5829 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x000008023D874FFEL});
	public static final BitSet FOLLOW_cident_in_createMaterializedViewStatement5833 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x9000000000000000L});
	public static final BitSet FOLLOW_191_in_createMaterializedViewStatement5839 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x000008023D874FFEL});
	public static final BitSet FOLLOW_cident_in_createMaterializedViewStatement5843 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x9000000000000000L});
	public static final BitSet FOLLOW_188_in_createMaterializedViewStatement5850 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x9000000000000000L});
	public static final BitSet FOLLOW_191_in_createMaterializedViewStatement5854 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x000008023D874FFEL});
	public static final BitSet FOLLOW_cident_in_createMaterializedViewStatement5858 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x9000000000000000L});
	public static final BitSet FOLLOW_188_in_createMaterializedViewStatement5865 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_187_in_createMaterializedViewStatement5875 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x000008023D874FFEL});
	public static final BitSet FOLLOW_cident_in_createMaterializedViewStatement5879 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x9000000000000000L});
	public static final BitSet FOLLOW_191_in_createMaterializedViewStatement5885 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x000008023D874FFEL});
	public static final BitSet FOLLOW_cident_in_createMaterializedViewStatement5889 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x9000000000000000L});
	public static final BitSet FOLLOW_188_in_createMaterializedViewStatement5896 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_K_WITH_in_createMaterializedViewStatement5928 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x000008023D874FFEL});
	public static final BitSet FOLLOW_cfamProperty_in_createMaterializedViewStatement5930 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_K_AND_in_createMaterializedViewStatement5935 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x000008023D874FFEL});
	public static final BitSet FOLLOW_cfamProperty_in_createMaterializedViewStatement5937 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_K_CREATE_in_createTriggerStatement5975 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_K_TRIGGER_in_createTriggerStatement5977 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB9B5EL,0x000008023D874FFEL});
	public static final BitSet FOLLOW_K_IF_in_createTriggerStatement5980 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_K_NOT_in_createTriggerStatement5982 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_K_EXISTS_in_createTriggerStatement5984 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x000008023D874FFEL});
	public static final BitSet FOLLOW_cident_in_createTriggerStatement5994 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
	public static final BitSet FOLLOW_K_ON_in_createTriggerStatement6005 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x00000C023D874FFEL});
	public static final BitSet FOLLOW_columnFamilyName_in_createTriggerStatement6009 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_K_USING_in_createTriggerStatement6011 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_createTriggerStatement6015 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_DROP_in_dropTriggerStatement6056 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_K_TRIGGER_in_dropTriggerStatement6058 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB9B5EL,0x000008023D874FFEL});
	public static final BitSet FOLLOW_K_IF_in_dropTriggerStatement6061 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_K_EXISTS_in_dropTriggerStatement6063 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x000008023D874FFEL});
	public static final BitSet FOLLOW_cident_in_dropTriggerStatement6073 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
	public static final BitSet FOLLOW_K_ON_in_dropTriggerStatement6076 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x00000C023D874FFEL});
	public static final BitSet FOLLOW_columnFamilyName_in_dropTriggerStatement6080 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_ALTER_in_alterKeyspaceStatement6120 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_K_KEYSPACE_in_alterKeyspaceStatement6122 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x00000C023D874FFEL});
	public static final BitSet FOLLOW_keyspaceName_in_alterKeyspaceStatement6126 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_K_WITH_in_alterKeyspaceStatement6136 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x000008023D874FFEL});
	public static final BitSet FOLLOW_properties_in_alterKeyspaceStatement6138 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_ALTER_in_alterTableStatement6173 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_K_COLUMNFAMILY_in_alterTableStatement6175 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x00000C023D874FFEL});
	public static final BitSet FOLLOW_columnFamilyName_in_alterTableStatement6179 = new BitSet(new long[]{0x2000000044000000L,0x0200000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_K_ALTER_in_alterTableStatement6193 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x000008023D874FFEL});
	public static final BitSet FOLLOW_cident_in_alterTableStatement6197 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_K_TYPE_in_alterTableStatement6200 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x000088023D874FFFL});
	public static final BitSet FOLLOW_comparatorType_in_alterTableStatement6204 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_ADD_in_alterTableStatement6223 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x080008023D874FFEL});
	public static final BitSet FOLLOW_cident_in_alterTableStatement6238 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x000088023D874FFFL});
	public static final BitSet FOLLOW_comparatorType_in_alterTableStatement6244 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_cfisStatic_in_alterTableStatement6250 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_187_in_alterTableStatement6279 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x000008023D874FFEL});
	public static final BitSet FOLLOW_cident_in_alterTableStatement6284 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x000088023D874FFFL});
	public static final BitSet FOLLOW_comparatorType_in_alterTableStatement6289 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x9000000000000008L});
	public static final BitSet FOLLOW_cfisStatic_in_alterTableStatement6294 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x9000000000000000L});
	public static final BitSet FOLLOW_191_in_alterTableStatement6323 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x000008023D874FFEL});
	public static final BitSet FOLLOW_cident_in_alterTableStatement6327 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x000088023D874FFFL});
	public static final BitSet FOLLOW_comparatorType_in_alterTableStatement6332 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x9000000000000008L});
	public static final BitSet FOLLOW_cfisStatic_in_alterTableStatement6337 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x9000000000000000L});
	public static final BitSet FOLLOW_188_in_alterTableStatement6344 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_DROP_in_alterTableStatement6364 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x080008023D874FFEL});
	public static final BitSet FOLLOW_cident_in_alterTableStatement6380 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_187_in_alterTableStatement6410 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x000008023D874FFEL});
	public static final BitSet FOLLOW_cident_in_alterTableStatement6415 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x9000000000000000L});
	public static final BitSet FOLLOW_191_in_alterTableStatement6445 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x000008023D874FFEL});
	public static final BitSet FOLLOW_cident_in_alterTableStatement6449 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x9000000000000000L});
	public static final BitSet FOLLOW_188_in_alterTableStatement6456 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_K_USING_in_alterTableStatement6484 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_K_TIMESTAMP_in_alterTableStatement6486 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_INTEGER_in_alterTableStatement6490 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_WITH_in_alterTableStatement6512 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x000008023D874FFEL});
	public static final BitSet FOLLOW_properties_in_alterTableStatement6515 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_RENAME_in_alterTableStatement6548 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x000008023D874FFEL});
	public static final BitSet FOLLOW_cident_in_alterTableStatement6602 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_K_TO_in_alterTableStatement6604 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x000008023D874FFEL});
	public static final BitSet FOLLOW_cident_in_alterTableStatement6608 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_K_AND_in_alterTableStatement6629 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x000008023D874FFEL});
	public static final BitSet FOLLOW_cident_in_alterTableStatement6633 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_K_TO_in_alterTableStatement6635 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x000008023D874FFEL});
	public static final BitSet FOLLOW_cident_in_alterTableStatement6639 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_K_STATIC_in_cfisStatic6692 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_ALTER_in_alterMaterializedViewStatement6728 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_K_MATERIALIZED_in_alterMaterializedViewStatement6730 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_K_VIEW_in_alterMaterializedViewStatement6732 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x00000C023D874FFEL});
	public static final BitSet FOLLOW_columnFamilyName_in_alterMaterializedViewStatement6736 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_K_WITH_in_alterMaterializedViewStatement6748 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x000008023D874FFEL});
	public static final BitSet FOLLOW_properties_in_alterMaterializedViewStatement6750 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_ALTER_in_alterTypeStatement6781 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_K_TYPE_in_alterTypeStatement6783 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x000008023D874FFEL});
	public static final BitSet FOLLOW_userTypeName_in_alterTypeStatement6787 = new BitSet(new long[]{0x0000000044000000L,0x0200000000000000L});
	public static final BitSet FOLLOW_K_ALTER_in_alterTypeStatement6801 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x000008023D874FFEL});
	public static final BitSet FOLLOW_fident_in_alterTypeStatement6805 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_K_TYPE_in_alterTypeStatement6807 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x000088023D874FFFL});
	public static final BitSet FOLLOW_comparatorType_in_alterTypeStatement6811 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_ADD_in_alterTypeStatement6827 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x000008023D874FFEL});
	public static final BitSet FOLLOW_fident_in_alterTypeStatement6833 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x000088023D874FFFL});
	public static final BitSet FOLLOW_comparatorType_in_alterTypeStatement6837 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_RENAME_in_alterTypeStatement6860 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x000008023D874FFEL});
	public static final BitSet FOLLOW_renamedColumns_in_alterTypeStatement6864 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fident_in_renamedColumns6925 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_K_TO_in_renamedColumns6927 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x000008023D874FFEL});
	public static final BitSet FOLLOW_fident_in_renamedColumns6931 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_K_AND_in_renamedColumns6937 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x000008023D874FFEL});
	public static final BitSet FOLLOW_fident_in_renamedColumns6941 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_K_TO_in_renamedColumns6943 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x000008023D874FFEL});
	public static final BitSet FOLLOW_fident_in_renamedColumns6947 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_K_DROP_in_dropKeyspaceStatement6984 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_K_KEYSPACE_in_dropKeyspaceStatement6986 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB9B5EL,0x00000C023D874FFEL});
	public static final BitSet FOLLOW_K_IF_in_dropKeyspaceStatement6989 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_K_EXISTS_in_dropKeyspaceStatement6991 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x00000C023D874FFEL});
	public static final BitSet FOLLOW_keyspaceName_in_dropKeyspaceStatement7000 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_DROP_in_dropTableStatement7034 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_K_COLUMNFAMILY_in_dropTableStatement7036 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB9B5EL,0x00000C023D874FFEL});
	public static final BitSet FOLLOW_K_IF_in_dropTableStatement7039 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_K_EXISTS_in_dropTableStatement7041 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x00000C023D874FFEL});
	public static final BitSet FOLLOW_columnFamilyName_in_dropTableStatement7050 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_DROP_in_dropTypeStatement7084 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_K_TYPE_in_dropTypeStatement7086 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB9B5EL,0x000008023D874FFEL});
	public static final BitSet FOLLOW_K_IF_in_dropTypeStatement7089 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_K_EXISTS_in_dropTypeStatement7091 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x000008023D874FFEL});
	public static final BitSet FOLLOW_userTypeName_in_dropTypeStatement7100 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_DROP_in_dropIndexStatement7134 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_K_INDEX_in_dropIndexStatement7136 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB9B5EL,0x00000C023D874FFEL});
	public static final BitSet FOLLOW_K_IF_in_dropIndexStatement7139 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_K_EXISTS_in_dropIndexStatement7141 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x00000C023D874FFEL});
	public static final BitSet FOLLOW_indexName_in_dropIndexStatement7150 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_DROP_in_dropMaterializedViewStatement7190 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_K_MATERIALIZED_in_dropMaterializedViewStatement7192 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_K_VIEW_in_dropMaterializedViewStatement7194 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB9B5EL,0x00000C023D874FFEL});
	public static final BitSet FOLLOW_K_IF_in_dropMaterializedViewStatement7197 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_K_EXISTS_in_dropMaterializedViewStatement7199 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x00000C023D874FFEL});
	public static final BitSet FOLLOW_columnFamilyName_in_dropMaterializedViewStatement7208 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_TRUNCATE_in_truncateStatement7239 = new BitSet(new long[]{0x5877FB8A18400000L,0x683E4281DDCB8B5EL,0x00000C023D874FFEL});
	public static final BitSet FOLLOW_K_COLUMNFAMILY_in_truncateStatement7242 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x00000C023D874FFEL});
	public static final BitSet FOLLOW_columnFamilyName_in_truncateStatement7248 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_GRANT_in_grantPermissionsStatement7273 = new BitSet(new long[]{0x2408001050000000L,0x8000001000000001L});
	public static final BitSet FOLLOW_permissionOrAll_in_grantPermissionsStatement7285 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
	public static final BitSet FOLLOW_K_ON_in_grantPermissionsStatement7293 = new BitSet(new long[]{0x5877FB8A18400000L,0x683E428DDFCB8B5EL,0x00000C023D874FFEL});
	public static final BitSet FOLLOW_resource_in_grantPermissionsStatement7305 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_K_TO_in_grantPermissionsStatement7313 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x00008C023D874FFEL});
	public static final BitSet FOLLOW_userOrRoleName_in_grantPermissionsStatement7327 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_REVOKE_in_revokePermissionsStatement7358 = new BitSet(new long[]{0x2408001050000000L,0x8000001000000001L});
	public static final BitSet FOLLOW_permissionOrAll_in_revokePermissionsStatement7370 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
	public static final BitSet FOLLOW_K_ON_in_revokePermissionsStatement7378 = new BitSet(new long[]{0x5877FB8A18400000L,0x683E428DDFCB8B5EL,0x00000C023D874FFEL});
	public static final BitSet FOLLOW_resource_in_revokePermissionsStatement7390 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_K_FROM_in_revokePermissionsStatement7398 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x00008C023D874FFEL});
	public static final BitSet FOLLOW_userOrRoleName_in_revokePermissionsStatement7412 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_GRANT_in_grantRoleStatement7443 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x00008C023D874FFEL});
	public static final BitSet FOLLOW_userOrRoleName_in_grantRoleStatement7457 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_K_TO_in_grantRoleStatement7465 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x00008C023D874FFEL});
	public static final BitSet FOLLOW_userOrRoleName_in_grantRoleStatement7479 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_REVOKE_in_revokeRoleStatement7510 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x00008C023D874FFEL});
	public static final BitSet FOLLOW_userOrRoleName_in_revokeRoleStatement7524 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_K_FROM_in_revokeRoleStatement7532 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x00008C023D874FFEL});
	public static final BitSet FOLLOW_userOrRoleName_in_revokeRoleStatement7546 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_LIST_in_listPermissionsStatement7584 = new BitSet(new long[]{0x2408001050000000L,0x8000001000000001L});
	public static final BitSet FOLLOW_permissionOrAll_in_listPermissionsStatement7596 = new BitSet(new long[]{0x0000000000000002L,0x0000310000000000L});
	public static final BitSet FOLLOW_K_ON_in_listPermissionsStatement7606 = new BitSet(new long[]{0x5877FB8A18400000L,0x683E428DDFCB8B5EL,0x00000C023D874FFEL});
	public static final BitSet FOLLOW_resource_in_listPermissionsStatement7608 = new BitSet(new long[]{0x0000000000000002L,0x0000110000000000L});
	public static final BitSet FOLLOW_K_OF_in_listPermissionsStatement7623 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x00008C023D874FFEL});
	public static final BitSet FOLLOW_roleName_in_listPermissionsStatement7625 = new BitSet(new long[]{0x0000000000000002L,0x0000010000000000L});
	public static final BitSet FOLLOW_K_NORECURSIVE_in_listPermissionsStatement7639 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_permission7675 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_ALL_in_permissionOrAll7732 = new BitSet(new long[]{0x0000000000000002L,0x0020000000000000L});
	public static final BitSet FOLLOW_K_PERMISSIONS_in_permissionOrAll7736 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_permission_in_permissionOrAll7757 = new BitSet(new long[]{0x0000000000000002L,0x0010000000000000L});
	public static final BitSet FOLLOW_K_PERMISSION_in_permissionOrAll7761 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dataResource_in_resource7789 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_roleResource_in_resource7801 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionResource_in_resource7813 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_jmxResource_in_resource7825 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_ALL_in_dataResource7848 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_K_KEYSPACES_in_dataResource7850 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_KEYSPACE_in_dataResource7860 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x00000C023D874FFEL});
	public static final BitSet FOLLOW_keyspaceName_in_dataResource7866 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_COLUMNFAMILY_in_dataResource7878 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x00000C023D874FFEL});
	public static final BitSet FOLLOW_columnFamilyName_in_dataResource7887 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_ALL_in_jmxResource7916 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_K_MBEANS_in_jmxResource7918 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_MBEAN_in_jmxResource7938 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_mbean_in_jmxResource7940 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_MBEANS_in_jmxResource7950 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_mbean_in_jmxResource7952 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_ALL_in_roleResource7975 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
	public static final BitSet FOLLOW_K_ROLES_in_roleResource7977 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_ROLE_in_roleResource7987 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x00008C023D874FFEL});
	public static final BitSet FOLLOW_userOrRoleName_in_roleResource7993 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_ALL_in_functionResource8025 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_K_FUNCTIONS_in_functionResource8027 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_ALL_in_functionResource8037 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_K_FUNCTIONS_in_functionResource8039 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_K_IN_in_functionResource8041 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_K_KEYSPACE_in_functionResource8043 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x00000C023D874FFEL});
	public static final BitSet FOLLOW_keyspaceName_in_functionResource8049 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_FUNCTION_in_functionResource8064 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x00000C023D876FFEL});
	public static final BitSet FOLLOW_functionName_in_functionResource8068 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_187_in_functionResource8086 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x100088023D874FFFL});
	public static final BitSet FOLLOW_comparatorType_in_functionResource8114 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x9000000000000000L});
	public static final BitSet FOLLOW_191_in_functionResource8132 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x000088023D874FFFL});
	public static final BitSet FOLLOW_comparatorType_in_functionResource8136 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x9000000000000000L});
	public static final BitSet FOLLOW_188_in_functionResource8164 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_CREATE_in_createUserStatement8212 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_K_USER_in_createUserStatement8214 = new BitSet(new long[]{0x0000000000400000L,0x0000000000001000L,0x0000880000000000L});
	public static final BitSet FOLLOW_K_IF_in_createUserStatement8217 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_K_NOT_in_createUserStatement8219 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_K_EXISTS_in_createUserStatement8221 = new BitSet(new long[]{0x0000000000400000L,0x0000000000000000L,0x0000880000000000L});
	public static final BitSet FOLLOW_username_in_createUserStatement8229 = new BitSet(new long[]{0x0000000000000002L,0x0000020000000000L,0x0000000100000040L});
	public static final BitSet FOLLOW_K_WITH_in_createUserStatement8241 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_userPassword_in_createUserStatement8243 = new BitSet(new long[]{0x0000000000000002L,0x0000020000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_K_SUPERUSER_in_createUserStatement8257 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_NOSUPERUSER_in_createUserStatement8263 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_ALTER_in_alterUserStatement8308 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_K_USER_in_alterUserStatement8310 = new BitSet(new long[]{0x0000000000400000L,0x0000000000000000L,0x0000880000000000L});
	public static final BitSet FOLLOW_username_in_alterUserStatement8314 = new BitSet(new long[]{0x0000000000000002L,0x0000020000000000L,0x0000000100000040L});
	public static final BitSet FOLLOW_K_WITH_in_alterUserStatement8326 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_userPassword_in_alterUserStatement8328 = new BitSet(new long[]{0x0000000000000002L,0x0000020000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_K_SUPERUSER_in_alterUserStatement8342 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_NOSUPERUSER_in_alterUserStatement8356 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_DROP_in_dropUserStatement8402 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_K_USER_in_dropUserStatement8404 = new BitSet(new long[]{0x0000000000400000L,0x0000000000001000L,0x0000880000000000L});
	public static final BitSet FOLLOW_K_IF_in_dropUserStatement8407 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_K_EXISTS_in_dropUserStatement8409 = new BitSet(new long[]{0x0000000000400000L,0x0000000000000000L,0x0000880000000000L});
	public static final BitSet FOLLOW_username_in_dropUserStatement8417 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_LIST_in_listUsersStatement8442 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_K_USERS_in_listUsersStatement8444 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_CREATE_in_createRoleStatement8478 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
	public static final BitSet FOLLOW_K_ROLE_in_createRoleStatement8480 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB9B5EL,0x00008C023D874FFEL});
	public static final BitSet FOLLOW_K_IF_in_createRoleStatement8483 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_K_NOT_in_createRoleStatement8485 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_K_EXISTS_in_createRoleStatement8487 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x00008C023D874FFEL});
	public static final BitSet FOLLOW_userOrRoleName_in_createRoleStatement8495 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_K_WITH_in_createRoleStatement8505 = new BitSet(new long[]{0x0000000000000000L,0x0004400080000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_roleOptions_in_createRoleStatement8507 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_ALTER_in_alterRoleStatement8551 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
	public static final BitSet FOLLOW_K_ROLE_in_alterRoleStatement8553 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x00008C023D874FFEL});
	public static final BitSet FOLLOW_userOrRoleName_in_alterRoleStatement8557 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_K_WITH_in_alterRoleStatement8567 = new BitSet(new long[]{0x0000000000000000L,0x0004400080000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_roleOptions_in_alterRoleStatement8569 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_DROP_in_dropRoleStatement8613 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
	public static final BitSet FOLLOW_K_ROLE_in_dropRoleStatement8615 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB9B5EL,0x00008C023D874FFEL});
	public static final BitSet FOLLOW_K_IF_in_dropRoleStatement8618 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_K_EXISTS_in_dropRoleStatement8620 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x00008C023D874FFEL});
	public static final BitSet FOLLOW_userOrRoleName_in_dropRoleStatement8628 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_LIST_in_listRolesStatement8668 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
	public static final BitSet FOLLOW_K_ROLES_in_listRolesStatement8670 = new BitSet(new long[]{0x0000000000000002L,0x0000110000000000L});
	public static final BitSet FOLLOW_K_OF_in_listRolesStatement8680 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x00008C023D874FFEL});
	public static final BitSet FOLLOW_roleName_in_listRolesStatement8682 = new BitSet(new long[]{0x0000000000000002L,0x0000010000000000L});
	public static final BitSet FOLLOW_K_NORECURSIVE_in_listRolesStatement8695 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_roleOption_in_roleOptions8726 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_K_AND_in_roleOptions8730 = new BitSet(new long[]{0x0000000000000000L,0x0004400080000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_roleOption_in_roleOptions8732 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_K_PASSWORD_in_roleOption8754 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_200_in_roleOption8756 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_roleOption8760 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_OPTIONS_in_roleOption8771 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_200_in_roleOption8773 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_fullMapLiteral_in_roleOption8777 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_SUPERUSER_in_roleOption8788 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_200_in_roleOption8790 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BOOLEAN_in_roleOption8794 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_LOGIN_in_roleOption8805 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_200_in_roleOption8807 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BOOLEAN_in_roleOption8811 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_PASSWORD_in_userPassword8833 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_userPassword8837 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_cident8868 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QUOTED_NAME_in_cident8893 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unreserved_keyword_in_cident8912 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_ident8938 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QUOTED_NAME_in_ident8963 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unreserved_keyword_in_ident8982 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_fident9007 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QUOTED_NAME_in_fident9032 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unreserved_keyword_in_fident9051 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_noncol_ident9077 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QUOTED_NAME_in_noncol_ident9102 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unreserved_keyword_in_noncol_ident9121 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ksName_in_keyspaceName9154 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ksName_in_indexName9188 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_194_in_indexName9191 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x00000C023D874FFEL});
	public static final BitSet FOLLOW_idxName_in_indexName9195 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ksName_in_columnFamilyName9227 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_194_in_columnFamilyName9230 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x00000C023D874FFEL});
	public static final BitSet FOLLOW_cfName_in_columnFamilyName9234 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_noncol_ident_in_userTypeName9259 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_194_in_userTypeName9261 = new BitSet(new long[]{0x0011A80218400000L,0x683E4281DD830B4EL,0x000008000986407AL});
	public static final BitSet FOLLOW_non_type_ident_in_userTypeName9267 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_roleName_in_userOrRoleName9299 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_ksName9322 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QUOTED_NAME_in_ksName9347 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unreserved_keyword_in_ksName9366 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QMARK_in_ksName9376 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_cfName9398 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QUOTED_NAME_in_cfName9423 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unreserved_keyword_in_cfName9442 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QMARK_in_cfName9452 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_idxName9474 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QUOTED_NAME_in_idxName9499 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unreserved_keyword_in_idxName9518 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QMARK_in_idxName9528 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_roleName9550 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_roleName9575 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QUOTED_NAME_in_roleName9591 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unreserved_keyword_in_roleName9610 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QMARK_in_roleName9620 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_constant9645 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTEGER_in_constant9657 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_constant9676 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOLEAN_in_constant9697 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DURATION_in_constant9716 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UUID_in_constant9734 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HEXNUMBER_in_constant9756 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_constant9772 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_POSITIVE_INFINITY_in_constant9792 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_NEGATIVE_INFINITY_in_constant9807 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_207_in_fullMapLiteral9848 = new BitSet(new long[]{0x5877BB8A18D10840L,0x68FE4AE1DDCB8B5EL,0x08048C023D876FFEL,0x0000000000018811L});
	public static final BitSet FOLLOW_term_in_fullMapLiteral9854 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_196_in_fullMapLiteral9856 = new BitSet(new long[]{0x5877BB8A18D10840L,0x68FE4AE1DDCB8B5EL,0x08048C023D876FFEL,0x0000000000008811L});
	public static final BitSet FOLLOW_term_in_fullMapLiteral9860 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x8000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_191_in_fullMapLiteral9866 = new BitSet(new long[]{0x5877BB8A18D10840L,0x68FE4AE1DDCB8B5EL,0x08048C023D876FFEL,0x0000000000008811L});
	public static final BitSet FOLLOW_term_in_fullMapLiteral9870 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_196_in_fullMapLiteral9872 = new BitSet(new long[]{0x5877BB8A18D10840L,0x68FE4AE1DDCB8B5EL,0x08048C023D876FFEL,0x0000000000008811L});
	public static final BitSet FOLLOW_term_in_fullMapLiteral9876 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x8000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_208_in_fullMapLiteral9892 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_mapLiteral_in_setOrMapLiteral9916 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_setLiteral_in_setOrMapLiteral9929 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_191_in_setLiteral9974 = new BitSet(new long[]{0x5877BB8A18D10840L,0x68FE4AE1DDCB8B5EL,0x08048C023D876FFEL,0x0000000000008811L});
	public static final BitSet FOLLOW_term_in_setLiteral9978 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x8000000000000000L});
	public static final BitSet FOLLOW_196_in_mapLiteral10023 = new BitSet(new long[]{0x5877BB8A18D10840L,0x68FE4AE1DDCB8B5EL,0x08048C023D876FFEL,0x0000000000008811L});
	public static final BitSet FOLLOW_term_in_mapLiteral10027 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x8000000000000000L});
	public static final BitSet FOLLOW_191_in_mapLiteral10033 = new BitSet(new long[]{0x5877BB8A18D10840L,0x68FE4AE1DDCB8B5EL,0x08048C023D876FFEL,0x0000000000008811L});
	public static final BitSet FOLLOW_term_in_mapLiteral10037 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_196_in_mapLiteral10039 = new BitSet(new long[]{0x5877BB8A18D10840L,0x68FE4AE1DDCB8B5EL,0x08048C023D876FFEL,0x0000000000008811L});
	public static final BitSet FOLLOW_term_in_mapLiteral10043 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x8000000000000000L});
	public static final BitSet FOLLOW_listLiteral_in_collectionLiteral10071 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_207_in_collectionLiteral10081 = new BitSet(new long[]{0x5877BB8A18D10840L,0x68FE4AE1DDCB8B5EL,0x08048C023D876FFEL,0x0000000000008811L});
	public static final BitSet FOLLOW_term_in_collectionLiteral10085 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x8000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_setOrMapLiteral_in_collectionLiteral10089 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_208_in_collectionLiteral10094 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_207_in_collectionLiteral10112 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_208_in_collectionLiteral10114 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_203_in_listLiteral10155 = new BitSet(new long[]{0x5877BB8A18D10840L,0x68FE4AE1DDCB8B5EL,0x08048C023D876FFEL,0x000000000000A811L});
	public static final BitSet FOLLOW_term_in_listLiteral10161 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x8000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_191_in_listLiteral10167 = new BitSet(new long[]{0x5877BB8A18D10840L,0x68FE4AE1DDCB8B5EL,0x08048C023D876FFEL,0x0000000000008811L});
	public static final BitSet FOLLOW_term_in_listLiteral10171 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x8000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_205_in_listLiteral10181 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_207_in_usertypeLiteral10225 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x000008023D874FFEL});
	public static final BitSet FOLLOW_fident_in_usertypeLiteral10229 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_196_in_usertypeLiteral10231 = new BitSet(new long[]{0x5877BB8A18D10840L,0x68FE4AE1DDCB8B5EL,0x08048C023D876FFEL,0x0000000000008811L});
	public static final BitSet FOLLOW_term_in_usertypeLiteral10235 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x8000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_191_in_usertypeLiteral10241 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x000008023D874FFEL});
	public static final BitSet FOLLOW_fident_in_usertypeLiteral10245 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_196_in_usertypeLiteral10247 = new BitSet(new long[]{0x5877BB8A18D10840L,0x68FE4AE1DDCB8B5EL,0x08048C023D876FFEL,0x0000000000008811L});
	public static final BitSet FOLLOW_term_in_usertypeLiteral10251 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x8000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_208_in_usertypeLiteral10258 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_187_in_tupleLiteral10295 = new BitSet(new long[]{0x5877BB8A18D10840L,0x68FE4AE1DDCB8B5EL,0x08048C023D876FFEL,0x0000000000008811L});
	public static final BitSet FOLLOW_term_in_tupleLiteral10299 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x9000000000000000L});
	public static final BitSet FOLLOW_191_in_tupleLiteral10305 = new BitSet(new long[]{0x5877BB8A18D10840L,0x68FE4AE1DDCB8B5EL,0x08048C023D876FFEL,0x0000000000008811L});
	public static final BitSet FOLLOW_term_in_tupleLiteral10309 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x9000000000000000L});
	public static final BitSet FOLLOW_188_in_tupleLiteral10316 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constant_in_value10339 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_collectionLiteral_in_value10361 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_usertypeLiteral_in_value10374 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tupleLiteral_in_value10389 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_NULL_in_value10405 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_196_in_value10429 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x000008023D874FFEL});
	public static final BitSet FOLLOW_noncol_ident_in_value10433 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QMARK_in_value10444 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTEGER_in_intValue10484 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_196_in_intValue10498 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x000008023D874FFEL});
	public static final BitSet FOLLOW_noncol_ident_in_intValue10502 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QMARK_in_intValue10513 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_keyspaceName_in_functionName10547 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_194_in_functionName10549 = new BitSet(new long[]{0x5077AB8A18400000L,0x683E4281DD0B8B5EL,0x000008003D866FFEL});
	public static final BitSet FOLLOW_allowedFunctionName_in_functionName10555 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_allowedFunctionName10582 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QUOTED_NAME_in_allowedFunctionName10616 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unreserved_function_keyword_in_allowedFunctionName10644 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_TOKEN_in_allowedFunctionName10654 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_COUNT_in_allowedFunctionName10686 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionName_in_function10733 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_187_in_function10735 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_188_in_function10737 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionName_in_function10767 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_187_in_function10769 = new BitSet(new long[]{0x5877BB8A18D10840L,0x68FE4AE1DDCB8B5EL,0x08048C023D876FFEL,0x0000000000008811L});
	public static final BitSet FOLLOW_functionArgs_in_function10773 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_188_in_function10775 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_term_in_functionArgs10808 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x8000000000000000L});
	public static final BitSet FOLLOW_191_in_functionArgs10814 = new BitSet(new long[]{0x5877BB8A18D10840L,0x68FE4AE1DDCB8B5EL,0x08048C023D876FFEL,0x0000000000008811L});
	public static final BitSet FOLLOW_term_in_functionArgs10818 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x8000000000000000L});
	public static final BitSet FOLLOW_termAddition_in_term10846 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_termMultiplication_in_termAddition10898 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x2000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_189_in_termAddition10914 = new BitSet(new long[]{0x5877BB8A18D10840L,0x68FE4AE1DDCB8B5EL,0x08048C023D876FFEL,0x0000000000008811L});
	public static final BitSet FOLLOW_termMultiplication_in_termAddition10918 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x2000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_192_in_termAddition10932 = new BitSet(new long[]{0x5877BB8A18D10840L,0x68FE4AE1DDCB8B5EL,0x08048C023D876FFEL,0x0000000000008811L});
	public static final BitSet FOLLOW_termMultiplication_in_termAddition10936 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x2000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_termGroup_in_termMultiplication10974 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0400000000000000L,0x0000000000001008L});
	public static final BitSet FOLLOW_204_in_termMultiplication10990 = new BitSet(new long[]{0x5877BB8A18D10840L,0x68FE4AE1DDCB8B5EL,0x08048C023D876FFEL,0x0000000000008811L});
	public static final BitSet FOLLOW_termGroup_in_termMultiplication10994 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0400000000000000L,0x0000000000001008L});
	public static final BitSet FOLLOW_195_in_termMultiplication11008 = new BitSet(new long[]{0x5877BB8A18D10840L,0x68FE4AE1DDCB8B5EL,0x08048C023D876FFEL,0x0000000000008811L});
	public static final BitSet FOLLOW_termGroup_in_termMultiplication11012 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0400000000000000L,0x0000000000001008L});
	public static final BitSet FOLLOW_186_in_termMultiplication11026 = new BitSet(new long[]{0x5877BB8A18D10840L,0x68FE4AE1DDCB8B5EL,0x08048C023D876FFEL,0x0000000000008811L});
	public static final BitSet FOLLOW_termGroup_in_termMultiplication11030 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0400000000000000L,0x0000000000001008L});
	public static final BitSet FOLLOW_simpleTerm_in_termGroup11066 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_192_in_termGroup11089 = new BitSet(new long[]{0x5877BB8A18D10840L,0x68FE4AE1DDCB8B5EL,0x08048C023D876FFEL,0x0000000000008810L});
	public static final BitSet FOLLOW_simpleTerm_in_termGroup11094 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_value_in_simpleTerm11127 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_function_in_simpleTerm11171 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_187_in_simpleTerm11210 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x000088023D874FFFL});
	public static final BitSet FOLLOW_comparatorType_in_simpleTerm11214 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_188_in_simpleTerm11216 = new BitSet(new long[]{0x5877BB8A18D10840L,0x68FE4AE1DDCB8B5EL,0x08048C023D876FFEL,0x0000000000008810L});
	public static final BitSet FOLLOW_simpleTerm_in_simpleTerm11220 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cident_in_columnOperation11244 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x4000000000000000L,0x0000000000000906L});
	public static final BitSet FOLLOW_columnOperationDifferentiator_in_columnOperation11246 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_200_in_columnOperationDifferentiator11265 = new BitSet(new long[]{0x5877BB8A18D10840L,0x68FE4AE1DDCB8B5EL,0x08048C023D876FFEL,0x0000000000008811L});
	public static final BitSet FOLLOW_normalColumnOperation_in_columnOperationDifferentiator11267 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_shorthandColumnOperation_in_columnOperationDifferentiator11276 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_203_in_columnOperationDifferentiator11285 = new BitSet(new long[]{0x5877BB8A18D10840L,0x68FE4AE1DDCB8B5EL,0x08048C023D876FFEL,0x0000000000008811L});
	public static final BitSet FOLLOW_term_in_columnOperationDifferentiator11289 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_205_in_columnOperationDifferentiator11291 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_collectionColumnOperation_in_columnOperationDifferentiator11293 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_194_in_columnOperationDifferentiator11302 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x000008023D874FFEL});
	public static final BitSet FOLLOW_fident_in_columnOperationDifferentiator11306 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_udtColumnOperation_in_columnOperationDifferentiator11308 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_term_in_normalColumnOperation11329 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x2000000000000000L});
	public static final BitSet FOLLOW_189_in_normalColumnOperation11332 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x000008023D874FFEL});
	public static final BitSet FOLLOW_cident_in_normalColumnOperation11336 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cident_in_normalColumnOperation11357 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x2000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_set_in_normalColumnOperation11361 = new BitSet(new long[]{0x5877BB8A18D10840L,0x68FE4AE1DDCB8B5EL,0x08048C023D876FFEL,0x0000000000008811L});
	public static final BitSet FOLLOW_term_in_normalColumnOperation11371 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cident_in_normalColumnOperation11389 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_INTEGER_in_normalColumnOperation11393 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_shorthandColumnOperation11421 = new BitSet(new long[]{0x5877BB8A18D10840L,0x68FE4AE1DDCB8B5EL,0x08048C023D876FFEL,0x0000000000008811L});
	public static final BitSet FOLLOW_term_in_shorthandColumnOperation11431 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_200_in_collectionColumnOperation11457 = new BitSet(new long[]{0x5877BB8A18D10840L,0x68FE4AE1DDCB8B5EL,0x08048C023D876FFEL,0x0000000000008811L});
	public static final BitSet FOLLOW_term_in_collectionColumnOperation11461 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_200_in_udtColumnOperation11487 = new BitSet(new long[]{0x5877BB8A18D10840L,0x68FE4AE1DDCB8B5EL,0x08048C023D876FFEL,0x0000000000008811L});
	public static final BitSet FOLLOW_term_in_udtColumnOperation11491 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cident_in_columnCondition11524 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L,0x0200000000000000L,0x0000000000000FC4L});
	public static final BitSet FOLLOW_relationType_in_columnCondition11538 = new BitSet(new long[]{0x5877BB8A18D10840L,0x68FE4AE1DDCB8B5EL,0x08048C023D876FFEL,0x0000000000008811L});
	public static final BitSet FOLLOW_term_in_columnCondition11542 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_IN_in_columnCondition11556 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0800040000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_singleColumnInValues_in_columnCondition11574 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_inMarker_in_columnCondition11594 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_203_in_columnCondition11622 = new BitSet(new long[]{0x5877BB8A18D10840L,0x68FE4AE1DDCB8B5EL,0x08048C023D876FFEL,0x0000000000008811L});
	public static final BitSet FOLLOW_term_in_columnCondition11626 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_205_in_columnCondition11628 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L,0x0200000000000000L,0x00000000000007C0L});
	public static final BitSet FOLLOW_relationType_in_columnCondition11646 = new BitSet(new long[]{0x5877BB8A18D10840L,0x68FE4AE1DDCB8B5EL,0x08048C023D876FFEL,0x0000000000008811L});
	public static final BitSet FOLLOW_term_in_columnCondition11650 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_IN_in_columnCondition11668 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0800040000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_singleColumnInValues_in_columnCondition11690 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_inMarker_in_columnCondition11714 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_194_in_columnCondition11760 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x000008023D874FFEL});
	public static final BitSet FOLLOW_fident_in_columnCondition11764 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L,0x0200000000000000L,0x00000000000007C0L});
	public static final BitSet FOLLOW_relationType_in_columnCondition11782 = new BitSet(new long[]{0x5877BB8A18D10840L,0x68FE4AE1DDCB8B5EL,0x08048C023D876FFEL,0x0000000000008811L});
	public static final BitSet FOLLOW_term_in_columnCondition11786 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_IN_in_columnCondition11804 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0800040000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_singleColumnInValues_in_columnCondition11826 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_inMarker_in_columnCondition11850 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_property_in_properties11912 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_K_AND_in_properties11916 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x000008023D874FFEL});
	public static final BitSet FOLLOW_property_in_properties11918 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_noncol_ident_in_property11941 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_200_in_property11943 = new BitSet(new long[]{0x5877BB8A18910840L,0x68FE42E1DDCB8B5EL,0x000480023D874FFEL});
	public static final BitSet FOLLOW_propertyValue_in_property11947 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_noncol_ident_in_property11959 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_200_in_property11961 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_fullMapLiteral_in_property11965 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constant_in_propertyValue11990 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unreserved_keyword_in_propertyValue12012 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_200_in_relationType12035 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_198_in_relationType12046 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_199_in_relationType12057 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_201_in_relationType12067 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_202_in_relationType12078 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_185_in_relationType12088 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cident_in_relation12110 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0200000000000000L,0x00000000000007C0L});
	public static final BitSet FOLLOW_relationType_in_relation12114 = new BitSet(new long[]{0x5877BB8A18D10840L,0x68FE4AE1DDCB8B5EL,0x08048C023D876FFEL,0x0000000000008811L});
	public static final BitSet FOLLOW_term_in_relation12118 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cident_in_relation12130 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_K_LIKE_in_relation12132 = new BitSet(new long[]{0x5877BB8A18D10840L,0x68FE4AE1DDCB8B5EL,0x08048C023D876FFEL,0x0000000000008811L});
	public static final BitSet FOLLOW_term_in_relation12136 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cident_in_relation12148 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_K_IS_in_relation12150 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_K_NOT_in_relation12152 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_K_NULL_in_relation12154 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_TOKEN_in_relation12164 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_tupleOfIdentifiers_in_relation12168 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0200000000000000L,0x00000000000007C0L});
	public static final BitSet FOLLOW_relationType_in_relation12172 = new BitSet(new long[]{0x5877BB8A18D10840L,0x68FE4AE1DDCB8B5EL,0x08048C023D876FFEL,0x0000000000008811L});
	public static final BitSet FOLLOW_term_in_relation12176 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cident_in_relation12196 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_K_IN_in_relation12198 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000040000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_inMarker_in_relation12202 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cident_in_relation12222 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_K_IN_in_relation12224 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_singleColumnInValues_in_relation12228 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cident_in_relation12248 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_containsOperator_in_relation12252 = new BitSet(new long[]{0x5877BB8A18D10840L,0x68FE4AE1DDCB8B5EL,0x08048C023D876FFEL,0x0000000000008811L});
	public static final BitSet FOLLOW_term_in_relation12256 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cident_in_relation12268 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_203_in_relation12270 = new BitSet(new long[]{0x5877BB8A18D10840L,0x68FE4AE1DDCB8B5EL,0x08048C023D876FFEL,0x0000000000008811L});
	public static final BitSet FOLLOW_term_in_relation12274 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_205_in_relation12276 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0200000000000000L,0x00000000000007C0L});
	public static final BitSet FOLLOW_relationType_in_relation12280 = new BitSet(new long[]{0x5877BB8A18D10840L,0x68FE4AE1DDCB8B5EL,0x08048C023D876FFEL,0x0000000000008811L});
	public static final BitSet FOLLOW_term_in_relation12284 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tupleOfIdentifiers_in_relation12296 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L,0x0200000000000000L,0x00000000000007C0L});
	public static final BitSet FOLLOW_K_IN_in_relation12306 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0800040000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_187_in_relation12320 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_188_in_relation12322 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_inMarkerForTuple_in_relation12354 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tupleOfTupleLiterals_in_relation12388 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tupleOfMarkersForTuples_in_relation12422 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_relationType_in_relation12464 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_tupleLiteral_in_relation12468 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_relationType_in_relation12494 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000040000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_markerForTuple_in_relation12498 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_187_in_relation12528 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x080008023D876FFEL});
	public static final BitSet FOLLOW_relation_in_relation12530 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_188_in_relation12533 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_CONTAINS_in_containsOperator12554 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
	public static final BitSet FOLLOW_K_KEY_in_containsOperator12559 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QMARK_in_inMarker12584 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_196_in_inMarker12594 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x000008023D874FFEL});
	public static final BitSet FOLLOW_noncol_ident_in_inMarker12598 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_187_in_tupleOfIdentifiers12630 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x000008023D874FFEL});
	public static final BitSet FOLLOW_cident_in_tupleOfIdentifiers12634 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x9000000000000000L});
	public static final BitSet FOLLOW_191_in_tupleOfIdentifiers12639 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x000008023D874FFEL});
	public static final BitSet FOLLOW_cident_in_tupleOfIdentifiers12643 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x9000000000000000L});
	public static final BitSet FOLLOW_188_in_tupleOfIdentifiers12649 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_187_in_singleColumnInValues12679 = new BitSet(new long[]{0x5877BB8A18D10840L,0x68FE4AE1DDCB8B5EL,0x18048C023D876FFEL,0x0000000000008811L});
	public static final BitSet FOLLOW_term_in_singleColumnInValues12687 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x9000000000000000L});
	public static final BitSet FOLLOW_191_in_singleColumnInValues12692 = new BitSet(new long[]{0x5877BB8A18D10840L,0x68FE4AE1DDCB8B5EL,0x08048C023D876FFEL,0x0000000000008811L});
	public static final BitSet FOLLOW_term_in_singleColumnInValues12696 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x9000000000000000L});
	public static final BitSet FOLLOW_188_in_singleColumnInValues12705 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_187_in_tupleOfTupleLiterals12735 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_tupleLiteral_in_tupleOfTupleLiterals12739 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x9000000000000000L});
	public static final BitSet FOLLOW_191_in_tupleOfTupleLiterals12744 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_tupleLiteral_in_tupleOfTupleLiterals12748 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x9000000000000000L});
	public static final BitSet FOLLOW_188_in_tupleOfTupleLiterals12754 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QMARK_in_markerForTuple12775 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_196_in_markerForTuple12785 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x000008023D874FFEL});
	public static final BitSet FOLLOW_noncol_ident_in_markerForTuple12789 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_187_in_tupleOfMarkersForTuples12821 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000040000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_markerForTuple_in_tupleOfMarkersForTuples12825 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x9000000000000000L});
	public static final BitSet FOLLOW_191_in_tupleOfMarkersForTuples12830 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000040000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_markerForTuple_in_tupleOfMarkersForTuples12834 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x9000000000000000L});
	public static final BitSet FOLLOW_188_in_tupleOfMarkersForTuples12840 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QMARK_in_inMarkerForTuple12861 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_196_in_inMarkerForTuple12871 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x000008023D874FFEL});
	public static final BitSet FOLLOW_noncol_ident_in_inMarkerForTuple12875 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_native_type_in_comparatorType12900 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_collection_type_in_comparatorType12916 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tuple_type_in_comparatorType12928 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_userTypeName_in_comparatorType12944 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_FROZEN_in_comparatorType12956 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_198_in_comparatorType12958 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x000088023D874FFFL});
	public static final BitSet FOLLOW_comparatorType_in_comparatorType12962 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_201_in_comparatorType12964 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_comparatorType12982 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_ASCII_in_native_type13011 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_BIGINT_in_native_type13025 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_BLOB_in_native_type13038 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_BOOLEAN_in_native_type13053 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_COUNTER_in_native_type13065 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_DECIMAL_in_native_type13077 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_DOUBLE_in_native_type13089 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_DURATION_in_native_type13102 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_FLOAT_in_native_type13115 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_INET_in_native_type13129 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_INT_in_native_type13144 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_SMALLINT_in_native_type13160 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_TEXT_in_native_type13171 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_TIMESTAMP_in_native_type13186 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_TINYINT_in_native_type13196 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_UUID_in_native_type13208 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_VARCHAR_in_native_type13223 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_VARINT_in_native_type13235 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_TIMEUUID_in_native_type13248 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_DATE_in_native_type13259 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_TIME_in_native_type13274 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_MAP_in_collection_type13302 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_198_in_collection_type13305 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x000088023D874FFFL});
	public static final BitSet FOLLOW_comparatorType_in_collection_type13309 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x8000000000000000L});
	public static final BitSet FOLLOW_191_in_collection_type13311 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x000088023D874FFFL});
	public static final BitSet FOLLOW_comparatorType_in_collection_type13315 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_201_in_collection_type13317 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_LIST_in_collection_type13335 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_198_in_collection_type13337 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x000088023D874FFFL});
	public static final BitSet FOLLOW_comparatorType_in_collection_type13341 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_201_in_collection_type13343 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_SET_in_collection_type13361 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_198_in_collection_type13364 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x000088023D874FFFL});
	public static final BitSet FOLLOW_comparatorType_in_collection_type13368 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_201_in_collection_type13370 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_TUPLE_in_tuple_type13419 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_198_in_tuple_type13421 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x000088023D874FFFL});
	public static final BitSet FOLLOW_comparatorType_in_tuple_type13425 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x8000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_191_in_tuple_type13430 = new BitSet(new long[]{0x5877BB8A18400000L,0x683E4281DDCB8B5EL,0x000088023D874FFFL});
	public static final BitSet FOLLOW_comparatorType_in_tuple_type13434 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x8000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_201_in_tuple_type13440 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_username13457 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_username13465 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QUOTED_NAME_in_username13473 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_mbean13492 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_non_type_ident13517 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QUOTED_NAME_in_non_type_ident13548 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_basic_unreserved_keyword_in_non_type_ident13573 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_KEY_in_non_type_ident13585 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unreserved_function_keyword_in_unreserved_keyword13628 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_unreserved_keyword13644 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_basic_unreserved_keyword_in_unreserved_function_keyword13695 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_native_type_in_unreserved_function_keyword13707 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_basic_unreserved_keyword13745 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_JSON_in_synpred1_Parser1062 = new BitSet(new long[]{0x5877BB8A18D10840L,0x68FE4AE1DDCB8B5EL,0x08048C023D876FFEL,0x0000000000009811L});
	public static final BitSet FOLLOW_selectClause_in_synpred1_Parser1064 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_DISTINCT_in_synpred2_Parser1265 = new BitSet(new long[]{0x5877BB8A18D10840L,0x68FE4AE1DDCB8B5EL,0x08048C023D876FFEL,0x0000000000009811L});
	public static final BitSet FOLLOW_selectors_in_synpred2_Parser1267 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_selectionGroupWithField_in_synpred3_Parser1596 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_selectionTypeHint_in_synpred4_Parser1883 = new BitSet(new long[]{0x0000000000000002L});
}
