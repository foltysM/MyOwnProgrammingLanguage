// Generated from Dwunasta.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DwunastaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, IF=4, ENDIF=5, THEN=6, BEGINFUNCTION=7, LOOP_BEGIN=8, 
		LOOP_END=9, ENDFUNCTION=10, PRINT=11, LEFT_SQ_BRCKT=12, RIGHT_SQ_BRCKT=13, 
		READ=14, ARRAY=15, CASTINT=16, ASSIGN=17, CASTREAL=18, ID=19, REAL=20, 
		INT=21, ADD=22, SEMICOLON=23, SUB=24, STRING=25, WS=26;
	public static final int
		RULE_prog = 0, RULE_start = 1, RULE_expr = 2, RULE_function = 3, RULE_blockif = 4, 
		RULE_math_stmnt = 5, RULE_equal = 6, RULE_repetitions = 7, RULE_value = 8, 
		RULE_fparam = 9, RULE_fblock = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "start", "expr", "function", "blockif", "math_stmnt", "equal", 
			"repetitions", "value", "fparam", "fblock"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'=='", "'('", "')'", "'if'", "'endif'", "'then'", "'beginf'", 
			"'loop'", "'endloop'", "'endf'", "'print'", "'['", "']'", "'scan'", null, 
			"'(int)'", "'='", "'(real)'", null, null, null, "'+'", "';'", "'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "IF", "ENDIF", "THEN", "BEGINFUNCTION", "LOOP_BEGIN", 
			"LOOP_END", "ENDFUNCTION", "PRINT", "LEFT_SQ_BRCKT", "RIGHT_SQ_BRCKT", 
			"READ", "ARRAY", "CASTINT", "ASSIGN", "CASTREAL", "ID", "REAL", "INT", 
			"ADD", "SEMICOLON", "SUB", "STRING", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Dwunasta.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DwunastaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public StartContext start() {
			return getRuleContext(StartContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DwunastaListener ) ((DwunastaListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DwunastaListener ) ((DwunastaListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			start();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StartContext extends ParserRuleContext {
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(DwunastaParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(DwunastaParser.SEMICOLON, i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DwunastaListener ) ((DwunastaListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DwunastaListener ) ((DwunastaListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << BEGINFUNCTION) | (1L << LOOP_BEGIN) | (1L << PRINT) | (1L << READ) | (1L << ID))) != 0)) {
				{
				setState(28);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IF:
				case LOOP_BEGIN:
				case PRINT:
				case READ:
				case ID:
					{
					{
					setState(24);
					expr();
					setState(25);
					match(SEMICOLON);
					}
					}
					break;
				case BEGINFUNCTION:
					{
					setState(27);
					function();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(32);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CallContext extends ExprContext {
		public TerminalNode ID() { return getToken(DwunastaParser.ID, 0); }
		public CallContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DwunastaListener ) ((DwunastaListener)listener).enterCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DwunastaListener ) ((DwunastaListener)listener).exitCall(this);
		}
	}
	public static class PrintContext extends ExprContext {
		public TerminalNode PRINT() { return getToken(DwunastaParser.PRINT, 0); }
		public TerminalNode ID() { return getToken(DwunastaParser.ID, 0); }
		public PrintContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DwunastaListener ) ((DwunastaListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DwunastaListener ) ((DwunastaListener)listener).exitPrint(this);
		}
	}
	public static class ReadContext extends ExprContext {
		public TerminalNode READ() { return getToken(DwunastaParser.READ, 0); }
		public TerminalNode ID() { return getToken(DwunastaParser.ID, 0); }
		public ReadContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DwunastaListener ) ((DwunastaListener)listener).enterRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DwunastaListener ) ((DwunastaListener)listener).exitRead(this);
		}
	}
	public static class Print_arr_valContext extends ExprContext {
		public TerminalNode PRINT() { return getToken(DwunastaParser.PRINT, 0); }
		public TerminalNode ID() { return getToken(DwunastaParser.ID, 0); }
		public TerminalNode LEFT_SQ_BRCKT() { return getToken(DwunastaParser.LEFT_SQ_BRCKT, 0); }
		public TerminalNode INT() { return getToken(DwunastaParser.INT, 0); }
		public TerminalNode RIGHT_SQ_BRCKT() { return getToken(DwunastaParser.RIGHT_SQ_BRCKT, 0); }
		public Print_arr_valContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DwunastaListener ) ((DwunastaListener)listener).enterPrint_arr_val(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DwunastaListener ) ((DwunastaListener)listener).exitPrint_arr_val(this);
		}
	}
	public static class LoopContext extends ExprContext {
		public TerminalNode LOOP_BEGIN() { return getToken(DwunastaParser.LOOP_BEGIN, 0); }
		public RepetitionsContext repetitions() {
			return getRuleContext(RepetitionsContext.class,0);
		}
		public StartContext start() {
			return getRuleContext(StartContext.class,0);
		}
		public TerminalNode LOOP_END() { return getToken(DwunastaParser.LOOP_END, 0); }
		public LoopContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DwunastaListener ) ((DwunastaListener)listener).enterLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DwunastaListener ) ((DwunastaListener)listener).exitLoop(this);
		}
	}
	public static class Assign_stringContext extends ExprContext {
		public TerminalNode ID() { return getToken(DwunastaParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(DwunastaParser.ASSIGN, 0); }
		public TerminalNode STRING() { return getToken(DwunastaParser.STRING, 0); }
		public Assign_stringContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DwunastaListener ) ((DwunastaListener)listener).enterAssign_string(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DwunastaListener ) ((DwunastaListener)listener).exitAssign_string(this);
		}
	}
	public static class IfContext extends ExprContext {
		public TerminalNode IF() { return getToken(DwunastaParser.IF, 0); }
		public EqualContext equal() {
			return getRuleContext(EqualContext.class,0);
		}
		public TerminalNode THEN() { return getToken(DwunastaParser.THEN, 0); }
		public BlockifContext blockif() {
			return getRuleContext(BlockifContext.class,0);
		}
		public TerminalNode ENDIF() { return getToken(DwunastaParser.ENDIF, 0); }
		public IfContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DwunastaListener ) ((DwunastaListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DwunastaListener ) ((DwunastaListener)listener).exitIf(this);
		}
	}
	public static class AssignContext extends ExprContext {
		public TerminalNode ID() { return getToken(DwunastaParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(DwunastaParser.ASSIGN, 0); }
		public Math_stmntContext math_stmnt() {
			return getRuleContext(Math_stmntContext.class,0);
		}
		public AssignContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DwunastaListener ) ((DwunastaListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DwunastaListener ) ((DwunastaListener)listener).exitAssign(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expr);
		try {
			setState(60);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new LoopContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(33);
				match(LOOP_BEGIN);
				setState(34);
				repetitions();
				setState(35);
				start();
				setState(36);
				match(LOOP_END);
				}
				break;
			case 2:
				_localctx = new IfContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(38);
				match(IF);
				setState(39);
				equal();
				setState(40);
				match(THEN);
				setState(41);
				blockif();
				setState(42);
				match(ENDIF);
				}
				break;
			case 3:
				_localctx = new AssignContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(44);
				match(ID);
				setState(45);
				match(ASSIGN);
				setState(46);
				math_stmnt();
				}
				break;
			case 4:
				_localctx = new Print_arr_valContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(47);
				match(PRINT);
				setState(48);
				match(ID);
				setState(49);
				match(LEFT_SQ_BRCKT);
				setState(50);
				match(INT);
				setState(51);
				match(RIGHT_SQ_BRCKT);
				}
				break;
			case 5:
				_localctx = new Assign_stringContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(52);
				match(ID);
				setState(53);
				match(ASSIGN);
				setState(54);
				match(STRING);
				}
				break;
			case 6:
				_localctx = new PrintContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(55);
				match(PRINT);
				setState(56);
				match(ID);
				}
				break;
			case 7:
				_localctx = new ReadContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(57);
				match(READ);
				setState(58);
				match(ID);
				}
				break;
			case 8:
				_localctx = new CallContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(59);
				match(ID);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode BEGINFUNCTION() { return getToken(DwunastaParser.BEGINFUNCTION, 0); }
		public FparamContext fparam() {
			return getRuleContext(FparamContext.class,0);
		}
		public FblockContext fblock() {
			return getRuleContext(FblockContext.class,0);
		}
		public TerminalNode ENDFUNCTION() { return getToken(DwunastaParser.ENDFUNCTION, 0); }
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DwunastaListener ) ((DwunastaListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DwunastaListener ) ((DwunastaListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(BEGINFUNCTION);
			setState(63);
			fparam();
			setState(64);
			fblock();
			setState(65);
			match(ENDFUNCTION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockifContext extends ParserRuleContext {
		public StartContext start() {
			return getRuleContext(StartContext.class,0);
		}
		public BlockifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockif; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DwunastaListener ) ((DwunastaListener)listener).enterBlockif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DwunastaListener ) ((DwunastaListener)listener).exitBlockif(this);
		}
	}

	public final BlockifContext blockif() throws RecognitionException {
		BlockifContext _localctx = new BlockifContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_blockif);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			start();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Math_stmntContext extends ParserRuleContext {
		public Math_stmntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_math_stmnt; }
	 
		public Math_stmntContext() { }
		public void copyFrom(Math_stmntContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Single0Context extends Math_stmntContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public Single0Context(Math_stmntContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DwunastaListener ) ((DwunastaListener)listener).enterSingle0(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DwunastaListener ) ((DwunastaListener)listener).exitSingle0(this);
		}
	}
	public static class AddContext extends Math_stmntContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TerminalNode ADD() { return getToken(DwunastaParser.ADD, 0); }
		public AddContext(Math_stmntContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DwunastaListener ) ((DwunastaListener)listener).enterAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DwunastaListener ) ((DwunastaListener)listener).exitAdd(this);
		}
	}
	public static class SubContext extends Math_stmntContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TerminalNode SUB() { return getToken(DwunastaParser.SUB, 0); }
		public SubContext(Math_stmntContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DwunastaListener ) ((DwunastaListener)listener).enterSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DwunastaListener ) ((DwunastaListener)listener).exitSub(this);
		}
	}

	public final Math_stmntContext math_stmnt() throws RecognitionException {
		Math_stmntContext _localctx = new Math_stmntContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_math_stmnt);
		try {
			setState(78);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new Single0Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				value();
				}
				break;
			case 2:
				_localctx = new AddContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(70);
				value();
				setState(71);
				match(ADD);
				setState(72);
				value();
				}
				break;
			case 3:
				_localctx = new SubContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(74);
				value();
				setState(75);
				match(SUB);
				setState(76);
				value();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EqualContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DwunastaParser.ID, 0); }
		public TerminalNode INT() { return getToken(DwunastaParser.INT, 0); }
		public EqualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DwunastaListener ) ((DwunastaListener)listener).enterEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DwunastaListener ) ((DwunastaListener)listener).exitEqual(this);
		}
	}

	public final EqualContext equal() throws RecognitionException {
		EqualContext _localctx = new EqualContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_equal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(ID);
			setState(81);
			match(T__0);
			setState(82);
			match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RepetitionsContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(DwunastaParser.INT, 0); }
		public RepetitionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repetitions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DwunastaListener ) ((DwunastaListener)listener).enterRepetitions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DwunastaListener ) ((DwunastaListener)listener).exitRepetitions(this);
		}
	}

	public final RepetitionsContext repetitions() throws RecognitionException {
		RepetitionsContext _localctx = new RepetitionsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_repetitions);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueContext extends ParserRuleContext {
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	 
		public ValueContext() { }
		public void copyFrom(ValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParContext extends ValueContext {
		public Math_stmntContext math_stmnt() {
			return getRuleContext(Math_stmntContext.class,0);
		}
		public ParContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DwunastaListener ) ((DwunastaListener)listener).enterPar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DwunastaListener ) ((DwunastaListener)listener).exitPar(this);
		}
	}
	public static class StringContext extends ValueContext {
		public TerminalNode STRING() { return getToken(DwunastaParser.STRING, 0); }
		public StringContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DwunastaListener ) ((DwunastaListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DwunastaListener ) ((DwunastaListener)listener).exitString(this);
		}
	}
	public static class Id_assignContext extends ValueContext {
		public TerminalNode ID() { return getToken(DwunastaParser.ID, 0); }
		public Id_assignContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DwunastaListener ) ((DwunastaListener)listener).enterId_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DwunastaListener ) ((DwunastaListener)listener).exitId_assign(this);
		}
	}
	public static class ArrayContext extends ValueContext {
		public TerminalNode ARRAY() { return getToken(DwunastaParser.ARRAY, 0); }
		public ArrayContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DwunastaListener ) ((DwunastaListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DwunastaListener ) ((DwunastaListener)listener).exitArray(this);
		}
	}
	public static class CastintContext extends ValueContext {
		public TerminalNode CASTINT() { return getToken(DwunastaParser.CASTINT, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public CastintContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DwunastaListener ) ((DwunastaListener)listener).enterCastint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DwunastaListener ) ((DwunastaListener)listener).exitCastint(this);
		}
	}
	public static class RealContext extends ValueContext {
		public TerminalNode REAL() { return getToken(DwunastaParser.REAL, 0); }
		public RealContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DwunastaListener ) ((DwunastaListener)listener).enterReal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DwunastaListener ) ((DwunastaListener)listener).exitReal(this);
		}
	}
	public static class CastrealContext extends ValueContext {
		public TerminalNode CASTREAL() { return getToken(DwunastaParser.CASTREAL, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public CastrealContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DwunastaListener ) ((DwunastaListener)listener).enterCastreal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DwunastaListener ) ((DwunastaListener)listener).exitCastreal(this);
		}
	}
	public static class IntContext extends ValueContext {
		public TerminalNode INT() { return getToken(DwunastaParser.INT, 0); }
		public IntContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DwunastaListener ) ((DwunastaListener)listener).enterInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DwunastaListener ) ((DwunastaListener)listener).exitInt(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_value);
		try {
			setState(99);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				_localctx = new IntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				match(INT);
				}
				break;
			case REAL:
				_localctx = new RealContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				match(REAL);
				}
				break;
			case STRING:
				_localctx = new StringContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(88);
				match(STRING);
				}
				break;
			case ARRAY:
				_localctx = new ArrayContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(89);
				match(ARRAY);
				}
				break;
			case CASTINT:
				_localctx = new CastintContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(90);
				match(CASTINT);
				setState(91);
				value();
				}
				break;
			case CASTREAL:
				_localctx = new CastrealContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(92);
				match(CASTREAL);
				setState(93);
				value();
				}
				break;
			case T__1:
				_localctx = new ParContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(94);
				match(T__1);
				setState(95);
				math_stmnt();
				setState(96);
				match(T__2);
				}
				break;
			case ID:
				_localctx = new Id_assignContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(98);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FparamContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DwunastaParser.ID, 0); }
		public FparamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fparam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DwunastaListener ) ((DwunastaListener)listener).enterFparam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DwunastaListener ) ((DwunastaListener)listener).exitFparam(this);
		}
	}

	public final FparamContext fparam() throws RecognitionException {
		FparamContext _localctx = new FparamContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_fparam);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FblockContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(DwunastaParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(DwunastaParser.SEMICOLON, i);
		}
		public FblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fblock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DwunastaListener ) ((DwunastaListener)listener).enterFblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DwunastaListener ) ((DwunastaListener)listener).exitFblock(this);
		}
	}

	public final FblockContext fblock() throws RecognitionException {
		FblockContext _localctx = new FblockContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_fblock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << LOOP_BEGIN) | (1L << PRINT) | (1L << READ) | (1L << ID))) != 0)) {
				{
				{
				setState(103);
				expr();
				setState(104);
				match(SEMICOLON);
				}
				}
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\34r\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\3\2\3\2\3\3\3\3\3\3\3\3\7\3\37\n\3\f\3\16\3\"\13\3\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4?\n\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7Q\n\7\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\nf\n\n\3\13\3\13\3\f"+
		"\3\f\3\f\7\fm\n\f\f\f\16\fp\13\f\3\f\2\2\r\2\4\6\b\n\f\16\20\22\24\26"+
		"\2\2\2y\2\30\3\2\2\2\4 \3\2\2\2\6>\3\2\2\2\b@\3\2\2\2\nE\3\2\2\2\fP\3"+
		"\2\2\2\16R\3\2\2\2\20V\3\2\2\2\22e\3\2\2\2\24g\3\2\2\2\26n\3\2\2\2\30"+
		"\31\5\4\3\2\31\3\3\2\2\2\32\33\5\6\4\2\33\34\7\31\2\2\34\37\3\2\2\2\35"+
		"\37\5\b\5\2\36\32\3\2\2\2\36\35\3\2\2\2\37\"\3\2\2\2 \36\3\2\2\2 !\3\2"+
		"\2\2!\5\3\2\2\2\" \3\2\2\2#$\7\n\2\2$%\5\20\t\2%&\5\4\3\2&\'\7\13\2\2"+
		"\'?\3\2\2\2()\7\6\2\2)*\5\16\b\2*+\7\b\2\2+,\5\n\6\2,-\7\7\2\2-?\3\2\2"+
		"\2./\7\25\2\2/\60\7\23\2\2\60?\5\f\7\2\61\62\7\r\2\2\62\63\7\25\2\2\63"+
		"\64\7\16\2\2\64\65\7\27\2\2\65?\7\17\2\2\66\67\7\25\2\2\678\7\23\2\28"+
		"?\7\33\2\29:\7\r\2\2:?\7\25\2\2;<\7\20\2\2<?\7\25\2\2=?\7\25\2\2>#\3\2"+
		"\2\2>(\3\2\2\2>.\3\2\2\2>\61\3\2\2\2>\66\3\2\2\2>9\3\2\2\2>;\3\2\2\2>"+
		"=\3\2\2\2?\7\3\2\2\2@A\7\t\2\2AB\5\24\13\2BC\5\26\f\2CD\7\f\2\2D\t\3\2"+
		"\2\2EF\5\4\3\2F\13\3\2\2\2GQ\5\22\n\2HI\5\22\n\2IJ\7\30\2\2JK\5\22\n\2"+
		"KQ\3\2\2\2LM\5\22\n\2MN\7\32\2\2NO\5\22\n\2OQ\3\2\2\2PG\3\2\2\2PH\3\2"+
		"\2\2PL\3\2\2\2Q\r\3\2\2\2RS\7\25\2\2ST\7\3\2\2TU\7\27\2\2U\17\3\2\2\2"+
		"VW\7\27\2\2W\21\3\2\2\2Xf\7\27\2\2Yf\7\26\2\2Zf\7\33\2\2[f\7\21\2\2\\"+
		"]\7\22\2\2]f\5\22\n\2^_\7\24\2\2_f\5\22\n\2`a\7\4\2\2ab\5\f\7\2bc\7\5"+
		"\2\2cf\3\2\2\2df\7\25\2\2eX\3\2\2\2eY\3\2\2\2eZ\3\2\2\2e[\3\2\2\2e\\\3"+
		"\2\2\2e^\3\2\2\2e`\3\2\2\2ed\3\2\2\2f\23\3\2\2\2gh\7\25\2\2h\25\3\2\2"+
		"\2ij\5\6\4\2jk\7\31\2\2km\3\2\2\2li\3\2\2\2mp\3\2\2\2nl\3\2\2\2no\3\2"+
		"\2\2o\27\3\2\2\2pn\3\2\2\2\b\36 >Pen";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}