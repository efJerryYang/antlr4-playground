// Generated from grammars/XPath.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class XPathParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, NodeType=5, Number=6, AxisName=7, PATHSEP=8, 
		ABRPATH=9, LPAR=10, RPAR=11, LBRAC=12, RBRAC=13, MINUS=14, PLUS=15, DOT=16, 
		MUL=17, DOTDOT=18, AT=19, COMMA=20, PIPE=21, LESS=22, MORE_=23, LE=24, 
		GE=25, COLON=26, CC=27, APOS=28, QUOT=29, AND=30, OR=31, DIV=32, MOD=33, 
		Literal=34, Whitespace=35, NCName=36;
	public static final int
		RULE_main = 0, RULE_locationPath = 1, RULE_absoluteLocationPathNoroot = 2, 
		RULE_relativeLocationPath = 3, RULE_step = 4, RULE_axisSpecifier = 5, 
		RULE_nodeTest = 6, RULE_predicate = 7, RULE_abbreviatedStep = 8, RULE_expr = 9, 
		RULE_primaryExpr = 10, RULE_functionCall = 11, RULE_unionExprNoRoot = 12, 
		RULE_pathExprNoRoot = 13, RULE_filterExpr = 14, RULE_orExpr = 15, RULE_andExpr = 16, 
		RULE_equalityExpr = 17, RULE_relationalExpr = 18, RULE_additiveExpr = 19, 
		RULE_multiplicativeExpr = 20, RULE_unaryExprNoRoot = 21, RULE_qName = 22, 
		RULE_functionName = 23, RULE_variableReference = 24, RULE_nameTest = 25, 
		RULE_nCName = 26;
	private static String[] makeRuleNames() {
		return new String[] {
			"main", "locationPath", "absoluteLocationPathNoroot", "relativeLocationPath", 
			"step", "axisSpecifier", "nodeTest", "predicate", "abbreviatedStep", 
			"expr", "primaryExpr", "functionCall", "unionExprNoRoot", "pathExprNoRoot", 
			"filterExpr", "orExpr", "andExpr", "equalityExpr", "relationalExpr", 
			"additiveExpr", "multiplicativeExpr", "unaryExprNoRoot", "qName", "functionName", 
			"variableReference", "nameTest", "nCName"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'processing-instruction'", "'='", "'!='", "'$'", null, null, null, 
			"'/'", "'//'", "'('", "')'", "'['", "']'", "'-'", "'+'", "'.'", "'*'", 
			"'..'", "'@'", "','", "'|'", "'<'", "'>'", "'<='", "'>='", "':'", "'::'", 
			"'''", "'\"'", "'and'", "'or'", "'div'", "'mod'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "NodeType", "Number", "AxisName", "PATHSEP", 
			"ABRPATH", "LPAR", "RPAR", "LBRAC", "RBRAC", "MINUS", "PLUS", "DOT", 
			"MUL", "DOTDOT", "AT", "COMMA", "PIPE", "LESS", "MORE_", "LE", "GE", 
			"COLON", "CC", "APOS", "QUOT", "AND", "OR", "DIV", "MOD", "Literal", 
			"Whitespace", "NCName"
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
	public String getGrammarFileName() { return "XPath.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public XPathParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MainContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode EOF() { return getToken(XPathParser.EOF, 0); }
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).exitMain(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			expr();
			setState(55);
			match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LocationPathContext extends ParserRuleContext {
		public RelativeLocationPathContext relativeLocationPath() {
			return getRuleContext(RelativeLocationPathContext.class,0);
		}
		public AbsoluteLocationPathNorootContext absoluteLocationPathNoroot() {
			return getRuleContext(AbsoluteLocationPathNorootContext.class,0);
		}
		public LocationPathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_locationPath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).enterLocationPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).exitLocationPath(this);
		}
	}

	public final LocationPathContext locationPath() throws RecognitionException {
		LocationPathContext _localctx = new LocationPathContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_locationPath);
		try {
			setState(59);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case NodeType:
			case AxisName:
			case DOT:
			case MUL:
			case DOTDOT:
			case AT:
			case AND:
			case OR:
			case DIV:
			case MOD:
			case NCName:
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				relativeLocationPath();
				}
				break;
			case PATHSEP:
			case ABRPATH:
				enterOuterAlt(_localctx, 2);
				{
				setState(58);
				absoluteLocationPathNoroot();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AbsoluteLocationPathNorootContext extends ParserRuleContext {
		public TerminalNode PATHSEP() { return getToken(XPathParser.PATHSEP, 0); }
		public RelativeLocationPathContext relativeLocationPath() {
			return getRuleContext(RelativeLocationPathContext.class,0);
		}
		public TerminalNode ABRPATH() { return getToken(XPathParser.ABRPATH, 0); }
		public AbsoluteLocationPathNorootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_absoluteLocationPathNoroot; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).enterAbsoluteLocationPathNoroot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).exitAbsoluteLocationPathNoroot(this);
		}
	}

	public final AbsoluteLocationPathNorootContext absoluteLocationPathNoroot() throws RecognitionException {
		AbsoluteLocationPathNorootContext _localctx = new AbsoluteLocationPathNorootContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_absoluteLocationPathNoroot);
		try {
			setState(65);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PATHSEP:
				enterOuterAlt(_localctx, 1);
				{
				setState(61);
				match(PATHSEP);
				setState(62);
				relativeLocationPath();
				}
				break;
			case ABRPATH:
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				match(ABRPATH);
				setState(64);
				relativeLocationPath();
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

	@SuppressWarnings("CheckReturnValue")
	public static class RelativeLocationPathContext extends ParserRuleContext {
		public List<StepContext> step() {
			return getRuleContexts(StepContext.class);
		}
		public StepContext step(int i) {
			return getRuleContext(StepContext.class,i);
		}
		public List<TerminalNode> PATHSEP() { return getTokens(XPathParser.PATHSEP); }
		public TerminalNode PATHSEP(int i) {
			return getToken(XPathParser.PATHSEP, i);
		}
		public List<TerminalNode> ABRPATH() { return getTokens(XPathParser.ABRPATH); }
		public TerminalNode ABRPATH(int i) {
			return getToken(XPathParser.ABRPATH, i);
		}
		public RelativeLocationPathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relativeLocationPath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).enterRelativeLocationPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).exitRelativeLocationPath(this);
		}
	}

	public final RelativeLocationPathContext relativeLocationPath() throws RecognitionException {
		RelativeLocationPathContext _localctx = new RelativeLocationPathContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_relativeLocationPath);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			step();
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PATHSEP || _la==ABRPATH) {
				{
				{
				setState(68);
				_la = _input.LA(1);
				if ( !(_la==PATHSEP || _la==ABRPATH) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(69);
				step();
				}
				}
				setState(74);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StepContext extends ParserRuleContext {
		public AxisSpecifierContext axisSpecifier() {
			return getRuleContext(AxisSpecifierContext.class,0);
		}
		public NodeTestContext nodeTest() {
			return getRuleContext(NodeTestContext.class,0);
		}
		public List<PredicateContext> predicate() {
			return getRuleContexts(PredicateContext.class);
		}
		public PredicateContext predicate(int i) {
			return getRuleContext(PredicateContext.class,i);
		}
		public AbbreviatedStepContext abbreviatedStep() {
			return getRuleContext(AbbreviatedStepContext.class,0);
		}
		public StepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_step; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).enterStep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).exitStep(this);
		}
	}

	public final StepContext step() throws RecognitionException {
		StepContext _localctx = new StepContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_step);
		int _la;
		try {
			setState(84);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case NodeType:
			case AxisName:
			case MUL:
			case AT:
			case AND:
			case OR:
			case DIV:
			case MOD:
			case NCName:
				enterOuterAlt(_localctx, 1);
				{
				setState(75);
				axisSpecifier();
				setState(76);
				nodeTest();
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRAC) {
					{
					{
					setState(77);
					predicate();
					}
					}
					setState(82);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case DOT:
			case DOTDOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
				abbreviatedStep();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AxisSpecifierContext extends ParserRuleContext {
		public TerminalNode AxisName() { return getToken(XPathParser.AxisName, 0); }
		public TerminalNode CC() { return getToken(XPathParser.CC, 0); }
		public TerminalNode AT() { return getToken(XPathParser.AT, 0); }
		public AxisSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_axisSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).enterAxisSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).exitAxisSpecifier(this);
		}
	}

	public final AxisSpecifierContext axisSpecifier() throws RecognitionException {
		AxisSpecifierContext _localctx = new AxisSpecifierContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_axisSpecifier);
		int _la;
		try {
			setState(91);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				match(AxisName);
				setState(87);
				match(CC);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AT) {
					{
					setState(88);
					match(AT);
					}
				}

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

	@SuppressWarnings("CheckReturnValue")
	public static class NodeTestContext extends ParserRuleContext {
		public NameTestContext nameTest() {
			return getRuleContext(NameTestContext.class,0);
		}
		public TerminalNode NodeType() { return getToken(XPathParser.NodeType, 0); }
		public TerminalNode LPAR() { return getToken(XPathParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(XPathParser.RPAR, 0); }
		public TerminalNode Literal() { return getToken(XPathParser.Literal, 0); }
		public NodeTestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nodeTest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).enterNodeTest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).exitNodeTest(this);
		}
	}

	public final NodeTestContext nodeTest() throws RecognitionException {
		NodeTestContext _localctx = new NodeTestContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_nodeTest);
		try {
			setState(101);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(93);
				nameTest();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
				match(NodeType);
				setState(95);
				match(LPAR);
				setState(96);
				match(RPAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(97);
				match(T__0);
				setState(98);
				match(LPAR);
				setState(99);
				match(Literal);
				setState(100);
				match(RPAR);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PredicateContext extends ParserRuleContext {
		public TerminalNode LBRAC() { return getToken(XPathParser.LBRAC, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RBRAC() { return getToken(XPathParser.RBRAC, 0); }
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).enterPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).exitPredicate(this);
		}
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_predicate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(LBRAC);
			setState(104);
			expr();
			setState(105);
			match(RBRAC);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AbbreviatedStepContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(XPathParser.DOT, 0); }
		public TerminalNode DOTDOT() { return getToken(XPathParser.DOTDOT, 0); }
		public AbbreviatedStepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abbreviatedStep; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).enterAbbreviatedStep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).exitAbbreviatedStep(this);
		}
	}

	public final AbbreviatedStepContext abbreviatedStep() throws RecognitionException {
		AbbreviatedStepContext _localctx = new AbbreviatedStepContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_abbreviatedStep);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			_la = _input.LA(1);
			if ( !(_la==DOT || _la==DOTDOT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public OrExprContext orExpr() {
			return getRuleContext(OrExprContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			orExpr();
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

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryExprContext extends ParserRuleContext {
		public VariableReferenceContext variableReference() {
			return getRuleContext(VariableReferenceContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(XPathParser.LPAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(XPathParser.RPAR, 0); }
		public TerminalNode Literal() { return getToken(XPathParser.Literal, 0); }
		public TerminalNode Number() { return getToken(XPathParser.Number, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public PrimaryExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).enterPrimaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).exitPrimaryExpr(this);
		}
	}

	public final PrimaryExprContext primaryExpr() throws RecognitionException {
		PrimaryExprContext _localctx = new PrimaryExprContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_primaryExpr);
		try {
			setState(119);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				variableReference();
				}
				break;
			case LPAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				match(LPAR);
				setState(113);
				expr();
				setState(114);
				match(RPAR);
				}
				break;
			case Literal:
				enterOuterAlt(_localctx, 3);
				{
				setState(116);
				match(Literal);
				}
				break;
			case Number:
				enterOuterAlt(_localctx, 4);
				{
				setState(117);
				match(Number);
				}
				break;
			case NodeType:
			case AxisName:
			case AND:
			case OR:
			case DIV:
			case MOD:
			case NCName:
				enterOuterAlt(_localctx, 5);
				{
				setState(118);
				functionCall();
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallContext extends ParserRuleContext {
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(XPathParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(XPathParser.RPAR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(XPathParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(XPathParser.COMMA, i);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).exitFunctionCall(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			functionName();
			setState(122);
			match(LPAR);
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 102006474738L) != 0)) {
				{
				setState(123);
				expr();
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(124);
					match(COMMA);
					setState(125);
					expr();
					}
					}
					setState(130);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(133);
			match(RPAR);
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

	@SuppressWarnings("CheckReturnValue")
	public static class UnionExprNoRootContext extends ParserRuleContext {
		public PathExprNoRootContext pathExprNoRoot() {
			return getRuleContext(PathExprNoRootContext.class,0);
		}
		public TerminalNode PIPE() { return getToken(XPathParser.PIPE, 0); }
		public UnionExprNoRootContext unionExprNoRoot() {
			return getRuleContext(UnionExprNoRootContext.class,0);
		}
		public TerminalNode PATHSEP() { return getToken(XPathParser.PATHSEP, 0); }
		public UnionExprNoRootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unionExprNoRoot; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).enterUnionExprNoRoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).exitUnionExprNoRoot(this);
		}
	}

	public final UnionExprNoRootContext unionExprNoRoot() throws RecognitionException {
		UnionExprNoRootContext _localctx = new UnionExprNoRootContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_unionExprNoRoot);
		int _la;
		try {
			setState(143);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				pathExprNoRoot();
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PIPE) {
					{
					setState(136);
					match(PIPE);
					setState(137);
					unionExprNoRoot();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				match(PATHSEP);
				setState(141);
				match(PIPE);
				setState(142);
				unionExprNoRoot();
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

	@SuppressWarnings("CheckReturnValue")
	public static class PathExprNoRootContext extends ParserRuleContext {
		public LocationPathContext locationPath() {
			return getRuleContext(LocationPathContext.class,0);
		}
		public FilterExprContext filterExpr() {
			return getRuleContext(FilterExprContext.class,0);
		}
		public RelativeLocationPathContext relativeLocationPath() {
			return getRuleContext(RelativeLocationPathContext.class,0);
		}
		public TerminalNode PATHSEP() { return getToken(XPathParser.PATHSEP, 0); }
		public TerminalNode ABRPATH() { return getToken(XPathParser.ABRPATH, 0); }
		public PathExprNoRootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pathExprNoRoot; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).enterPathExprNoRoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).exitPathExprNoRoot(this);
		}
	}

	public final PathExprNoRootContext pathExprNoRoot() throws RecognitionException {
		PathExprNoRootContext _localctx = new PathExprNoRootContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_pathExprNoRoot);
		int _la;
		try {
			setState(151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				locationPath();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(146);
				filterExpr();
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PATHSEP || _la==ABRPATH) {
					{
					setState(147);
					_la = _input.LA(1);
					if ( !(_la==PATHSEP || _la==ABRPATH) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(148);
					relativeLocationPath();
					}
				}

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

	@SuppressWarnings("CheckReturnValue")
	public static class FilterExprContext extends ParserRuleContext {
		public PrimaryExprContext primaryExpr() {
			return getRuleContext(PrimaryExprContext.class,0);
		}
		public List<PredicateContext> predicate() {
			return getRuleContexts(PredicateContext.class);
		}
		public PredicateContext predicate(int i) {
			return getRuleContext(PredicateContext.class,i);
		}
		public FilterExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filterExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).enterFilterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).exitFilterExpr(this);
		}
	}

	public final FilterExprContext filterExpr() throws RecognitionException {
		FilterExprContext _localctx = new FilterExprContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_filterExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			primaryExpr();
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRAC) {
				{
				{
				setState(154);
				predicate();
				}
				}
				setState(159);
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

	@SuppressWarnings("CheckReturnValue")
	public static class OrExprContext extends ParserRuleContext {
		public List<AndExprContext> andExpr() {
			return getRuleContexts(AndExprContext.class);
		}
		public AndExprContext andExpr(int i) {
			return getRuleContext(AndExprContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(XPathParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(XPathParser.OR, i);
		}
		public OrExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).enterOrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).exitOrExpr(this);
		}
	}

	public final OrExprContext orExpr() throws RecognitionException {
		OrExprContext _localctx = new OrExprContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_orExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			andExpr();
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(161);
				match(OR);
				setState(162);
				andExpr();
				}
				}
				setState(167);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AndExprContext extends ParserRuleContext {
		public List<EqualityExprContext> equalityExpr() {
			return getRuleContexts(EqualityExprContext.class);
		}
		public EqualityExprContext equalityExpr(int i) {
			return getRuleContext(EqualityExprContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(XPathParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(XPathParser.AND, i);
		}
		public AndExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).enterAndExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).exitAndExpr(this);
		}
	}

	public final AndExprContext andExpr() throws RecognitionException {
		AndExprContext _localctx = new AndExprContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_andExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			equalityExpr();
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(169);
				match(AND);
				setState(170);
				equalityExpr();
				}
				}
				setState(175);
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

	@SuppressWarnings("CheckReturnValue")
	public static class EqualityExprContext extends ParserRuleContext {
		public List<RelationalExprContext> relationalExpr() {
			return getRuleContexts(RelationalExprContext.class);
		}
		public RelationalExprContext relationalExpr(int i) {
			return getRuleContext(RelationalExprContext.class,i);
		}
		public EqualityExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).enterEqualityExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).exitEqualityExpr(this);
		}
	}

	public final EqualityExprContext equalityExpr() throws RecognitionException {
		EqualityExprContext _localctx = new EqualityExprContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_equalityExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			relationalExpr();
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1 || _la==T__2) {
				{
				{
				setState(177);
				_la = _input.LA(1);
				if ( !(_la==T__1 || _la==T__2) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(178);
				relationalExpr();
				}
				}
				setState(183);
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

	@SuppressWarnings("CheckReturnValue")
	public static class RelationalExprContext extends ParserRuleContext {
		public List<AdditiveExprContext> additiveExpr() {
			return getRuleContexts(AdditiveExprContext.class);
		}
		public AdditiveExprContext additiveExpr(int i) {
			return getRuleContext(AdditiveExprContext.class,i);
		}
		public List<TerminalNode> LESS() { return getTokens(XPathParser.LESS); }
		public TerminalNode LESS(int i) {
			return getToken(XPathParser.LESS, i);
		}
		public List<TerminalNode> MORE_() { return getTokens(XPathParser.MORE_); }
		public TerminalNode MORE_(int i) {
			return getToken(XPathParser.MORE_, i);
		}
		public List<TerminalNode> LE() { return getTokens(XPathParser.LE); }
		public TerminalNode LE(int i) {
			return getToken(XPathParser.LE, i);
		}
		public List<TerminalNode> GE() { return getTokens(XPathParser.GE); }
		public TerminalNode GE(int i) {
			return getToken(XPathParser.GE, i);
		}
		public RelationalExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).enterRelationalExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).exitRelationalExpr(this);
		}
	}

	public final RelationalExprContext relationalExpr() throws RecognitionException {
		RelationalExprContext _localctx = new RelationalExprContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_relationalExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			additiveExpr();
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 62914560L) != 0)) {
				{
				{
				setState(185);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 62914560L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(186);
				additiveExpr();
				}
				}
				setState(191);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AdditiveExprContext extends ParserRuleContext {
		public List<MultiplicativeExprContext> multiplicativeExpr() {
			return getRuleContexts(MultiplicativeExprContext.class);
		}
		public MultiplicativeExprContext multiplicativeExpr(int i) {
			return getRuleContext(MultiplicativeExprContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(XPathParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(XPathParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(XPathParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(XPathParser.MINUS, i);
		}
		public AdditiveExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).enterAdditiveExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).exitAdditiveExpr(this);
		}
	}

	public final AdditiveExprContext additiveExpr() throws RecognitionException {
		AdditiveExprContext _localctx = new AdditiveExprContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_additiveExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			multiplicativeExpr();
			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MINUS || _la==PLUS) {
				{
				{
				setState(193);
				_la = _input.LA(1);
				if ( !(_la==MINUS || _la==PLUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(194);
				multiplicativeExpr();
				}
				}
				setState(199);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MultiplicativeExprContext extends ParserRuleContext {
		public UnaryExprNoRootContext unaryExprNoRoot() {
			return getRuleContext(UnaryExprNoRootContext.class,0);
		}
		public MultiplicativeExprContext multiplicativeExpr() {
			return getRuleContext(MultiplicativeExprContext.class,0);
		}
		public TerminalNode MUL() { return getToken(XPathParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(XPathParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(XPathParser.MOD, 0); }
		public TerminalNode PATHSEP() { return getToken(XPathParser.PATHSEP, 0); }
		public MultiplicativeExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).enterMultiplicativeExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).exitMultiplicativeExpr(this);
		}
	}

	public final MultiplicativeExprContext multiplicativeExpr() throws RecognitionException {
		MultiplicativeExprContext _localctx = new MultiplicativeExprContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_multiplicativeExpr);
		int _la;
		try {
			setState(210);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(200);
				unaryExprNoRoot();
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 12885032960L) != 0)) {
					{
					setState(201);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 12885032960L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(202);
					multiplicativeExpr();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(205);
				match(PATHSEP);
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DIV || _la==MOD) {
					{
					setState(206);
					_la = _input.LA(1);
					if ( !(_la==DIV || _la==MOD) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(207);
					multiplicativeExpr();
					}
				}

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

	@SuppressWarnings("CheckReturnValue")
	public static class UnaryExprNoRootContext extends ParserRuleContext {
		public UnionExprNoRootContext unionExprNoRoot() {
			return getRuleContext(UnionExprNoRootContext.class,0);
		}
		public List<TerminalNode> MINUS() { return getTokens(XPathParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(XPathParser.MINUS, i);
		}
		public UnaryExprNoRootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExprNoRoot; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).enterUnaryExprNoRoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).exitUnaryExprNoRoot(this);
		}
	}

	public final UnaryExprNoRootContext unaryExprNoRoot() throws RecognitionException {
		UnaryExprNoRootContext _localctx = new UnaryExprNoRootContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_unaryExprNoRoot);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MINUS) {
				{
				{
				setState(212);
				match(MINUS);
				}
				}
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(218);
			unionExprNoRoot();
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

	@SuppressWarnings("CheckReturnValue")
	public static class QNameContext extends ParserRuleContext {
		public List<NCNameContext> nCName() {
			return getRuleContexts(NCNameContext.class);
		}
		public NCNameContext nCName(int i) {
			return getRuleContext(NCNameContext.class,i);
		}
		public TerminalNode COLON() { return getToken(XPathParser.COLON, 0); }
		public QNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).enterQName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).exitQName(this);
		}
	}

	public final QNameContext qName() throws RecognitionException {
		QNameContext _localctx = new QNameContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_qName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			nCName();
			setState(223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(221);
				match(COLON);
				setState(222);
				nCName();
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionNameContext extends ParserRuleContext {
		public List<NCNameContext> nCName() {
			return getRuleContexts(NCNameContext.class);
		}
		public NCNameContext nCName(int i) {
			return getRuleContext(NCNameContext.class,i);
		}
		public TerminalNode COLON() { return getToken(XPathParser.COLON, 0); }
		public TerminalNode NCName() { return getToken(XPathParser.NCName, 0); }
		public TerminalNode AxisName() { return getToken(XPathParser.AxisName, 0); }
		public TerminalNode AND() { return getToken(XPathParser.AND, 0); }
		public TerminalNode OR() { return getToken(XPathParser.OR, 0); }
		public TerminalNode DIV() { return getToken(XPathParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(XPathParser.MOD, 0); }
		public FunctionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).enterFunctionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).exitFunctionName(this);
		}
	}

	public final FunctionNameContext functionName() throws RecognitionException {
		FunctionNameContext _localctx = new FunctionNameContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_functionName);
		try {
			setState(235);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(225);
				nCName();
				setState(226);
				match(COLON);
				setState(227);
				nCName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(229);
				match(NCName);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(230);
				match(AxisName);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(231);
				match(AND);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(232);
				match(OR);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(233);
				match(DIV);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(234);
				match(MOD);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VariableReferenceContext extends ParserRuleContext {
		public QNameContext qName() {
			return getRuleContext(QNameContext.class,0);
		}
		public VariableReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).enterVariableReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).exitVariableReference(this);
		}
	}

	public final VariableReferenceContext variableReference() throws RecognitionException {
		VariableReferenceContext _localctx = new VariableReferenceContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_variableReference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(T__3);
			setState(238);
			qName();
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

	@SuppressWarnings("CheckReturnValue")
	public static class NameTestContext extends ParserRuleContext {
		public TerminalNode MUL() { return getToken(XPathParser.MUL, 0); }
		public NCNameContext nCName() {
			return getRuleContext(NCNameContext.class,0);
		}
		public TerminalNode COLON() { return getToken(XPathParser.COLON, 0); }
		public QNameContext qName() {
			return getRuleContext(QNameContext.class,0);
		}
		public NameTestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nameTest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).enterNameTest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).exitNameTest(this);
		}
	}

	public final NameTestContext nameTest() throws RecognitionException {
		NameTestContext _localctx = new NameTestContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_nameTest);
		try {
			setState(246);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(240);
				match(MUL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(241);
				nCName();
				setState(242);
				match(COLON);
				setState(243);
				match(MUL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(245);
				qName();
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

	@SuppressWarnings("CheckReturnValue")
	public static class NCNameContext extends ParserRuleContext {
		public TerminalNode NCName() { return getToken(XPathParser.NCName, 0); }
		public TerminalNode AxisName() { return getToken(XPathParser.AxisName, 0); }
		public TerminalNode NodeType() { return getToken(XPathParser.NodeType, 0); }
		public TerminalNode AND() { return getToken(XPathParser.AND, 0); }
		public TerminalNode OR() { return getToken(XPathParser.OR, 0); }
		public TerminalNode DIV() { return getToken(XPathParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(XPathParser.MOD, 0); }
		public NCNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nCName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).enterNCName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).exitNCName(this);
		}
	}

	public final NCNameContext nCName() throws RecognitionException {
		NCNameContext _localctx = new NCNameContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_nCName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 84825604256L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
		"\u0004\u0001$\u00fb\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0003\u0001<\b\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002B\b\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0005\u0003G\b\u0003\n\u0003\f\u0003J\t\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004O\b\u0004\n\u0004\f\u0004"+
		"R\t\u0004\u0001\u0004\u0003\u0004U\b\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0003\u0005Z\b\u0005\u0003\u0005\\\b\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0003\u0006f\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0003\nx\b\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u007f\b\u000b\n\u000b\f\u000b"+
		"\u0082\t\u000b\u0003\u000b\u0084\b\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0003\f\u008b\b\f\u0001\f\u0001\f\u0001\f\u0003\f\u0090"+
		"\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u0096\b\r\u0003\r\u0098\b"+
		"\r\u0001\u000e\u0001\u000e\u0005\u000e\u009c\b\u000e\n\u000e\f\u000e\u009f"+
		"\t\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u00a4\b\u000f"+
		"\n\u000f\f\u000f\u00a7\t\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0005"+
		"\u0010\u00ac\b\u0010\n\u0010\f\u0010\u00af\t\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0005\u0011\u00b4\b\u0011\n\u0011\f\u0011\u00b7\t\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u00bc\b\u0012\n\u0012\f\u0012"+
		"\u00bf\t\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u00c4\b"+
		"\u0013\n\u0013\f\u0013\u00c7\t\u0013\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0003\u0014\u00cc\b\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014"+
		"\u00d1\b\u0014\u0003\u0014\u00d3\b\u0014\u0001\u0015\u0005\u0015\u00d6"+
		"\b\u0015\n\u0015\f\u0015\u00d9\t\u0015\u0001\u0015\u0001\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0003\u0016\u00e0\b\u0016\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0003\u0017\u00ec\b\u0017\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0003\u0019\u00f7\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0000\u0000\u001b\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u001a\u001c\u001e \"$&(*,.024\u0000\b\u0001\u0000\b\t\u0002"+
		"\u0000\u0010\u0010\u0012\u0012\u0001\u0000\u0002\u0003\u0001\u0000\u0016"+
		"\u0019\u0001\u0000\u000e\u000f\u0002\u0000\u0011\u0011 !\u0001\u0000 "+
		"!\u0004\u0000\u0005\u0005\u0007\u0007\u001e!$$\u0105\u00006\u0001\u0000"+
		"\u0000\u0000\u0002;\u0001\u0000\u0000\u0000\u0004A\u0001\u0000\u0000\u0000"+
		"\u0006C\u0001\u0000\u0000\u0000\bT\u0001\u0000\u0000\u0000\n[\u0001\u0000"+
		"\u0000\u0000\fe\u0001\u0000\u0000\u0000\u000eg\u0001\u0000\u0000\u0000"+
		"\u0010k\u0001\u0000\u0000\u0000\u0012m\u0001\u0000\u0000\u0000\u0014w"+
		"\u0001\u0000\u0000\u0000\u0016y\u0001\u0000\u0000\u0000\u0018\u008f\u0001"+
		"\u0000\u0000\u0000\u001a\u0097\u0001\u0000\u0000\u0000\u001c\u0099\u0001"+
		"\u0000\u0000\u0000\u001e\u00a0\u0001\u0000\u0000\u0000 \u00a8\u0001\u0000"+
		"\u0000\u0000\"\u00b0\u0001\u0000\u0000\u0000$\u00b8\u0001\u0000\u0000"+
		"\u0000&\u00c0\u0001\u0000\u0000\u0000(\u00d2\u0001\u0000\u0000\u0000*"+
		"\u00d7\u0001\u0000\u0000\u0000,\u00dc\u0001\u0000\u0000\u0000.\u00eb\u0001"+
		"\u0000\u0000\u00000\u00ed\u0001\u0000\u0000\u00002\u00f6\u0001\u0000\u0000"+
		"\u00004\u00f8\u0001\u0000\u0000\u000067\u0003\u0012\t\u000078\u0005\u0000"+
		"\u0000\u00018\u0001\u0001\u0000\u0000\u00009<\u0003\u0006\u0003\u0000"+
		":<\u0003\u0004\u0002\u0000;9\u0001\u0000\u0000\u0000;:\u0001\u0000\u0000"+
		"\u0000<\u0003\u0001\u0000\u0000\u0000=>\u0005\b\u0000\u0000>B\u0003\u0006"+
		"\u0003\u0000?@\u0005\t\u0000\u0000@B\u0003\u0006\u0003\u0000A=\u0001\u0000"+
		"\u0000\u0000A?\u0001\u0000\u0000\u0000B\u0005\u0001\u0000\u0000\u0000"+
		"CH\u0003\b\u0004\u0000DE\u0007\u0000\u0000\u0000EG\u0003\b\u0004\u0000"+
		"FD\u0001\u0000\u0000\u0000GJ\u0001\u0000\u0000\u0000HF\u0001\u0000\u0000"+
		"\u0000HI\u0001\u0000\u0000\u0000I\u0007\u0001\u0000\u0000\u0000JH\u0001"+
		"\u0000\u0000\u0000KL\u0003\n\u0005\u0000LP\u0003\f\u0006\u0000MO\u0003"+
		"\u000e\u0007\u0000NM\u0001\u0000\u0000\u0000OR\u0001\u0000\u0000\u0000"+
		"PN\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000QU\u0001\u0000\u0000"+
		"\u0000RP\u0001\u0000\u0000\u0000SU\u0003\u0010\b\u0000TK\u0001\u0000\u0000"+
		"\u0000TS\u0001\u0000\u0000\u0000U\t\u0001\u0000\u0000\u0000VW\u0005\u0007"+
		"\u0000\u0000W\\\u0005\u001b\u0000\u0000XZ\u0005\u0013\u0000\u0000YX\u0001"+
		"\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000Z\\\u0001\u0000\u0000\u0000"+
		"[V\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000\\\u000b\u0001\u0000"+
		"\u0000\u0000]f\u00032\u0019\u0000^_\u0005\u0005\u0000\u0000_`\u0005\n"+
		"\u0000\u0000`f\u0005\u000b\u0000\u0000ab\u0005\u0001\u0000\u0000bc\u0005"+
		"\n\u0000\u0000cd\u0005\"\u0000\u0000df\u0005\u000b\u0000\u0000e]\u0001"+
		"\u0000\u0000\u0000e^\u0001\u0000\u0000\u0000ea\u0001\u0000\u0000\u0000"+
		"f\r\u0001\u0000\u0000\u0000gh\u0005\f\u0000\u0000hi\u0003\u0012\t\u0000"+
		"ij\u0005\r\u0000\u0000j\u000f\u0001\u0000\u0000\u0000kl\u0007\u0001\u0000"+
		"\u0000l\u0011\u0001\u0000\u0000\u0000mn\u0003\u001e\u000f\u0000n\u0013"+
		"\u0001\u0000\u0000\u0000ox\u00030\u0018\u0000pq\u0005\n\u0000\u0000qr"+
		"\u0003\u0012\t\u0000rs\u0005\u000b\u0000\u0000sx\u0001\u0000\u0000\u0000"+
		"tx\u0005\"\u0000\u0000ux\u0005\u0006\u0000\u0000vx\u0003\u0016\u000b\u0000"+
		"wo\u0001\u0000\u0000\u0000wp\u0001\u0000\u0000\u0000wt\u0001\u0000\u0000"+
		"\u0000wu\u0001\u0000\u0000\u0000wv\u0001\u0000\u0000\u0000x\u0015\u0001"+
		"\u0000\u0000\u0000yz\u0003.\u0017\u0000z\u0083\u0005\n\u0000\u0000{\u0080"+
		"\u0003\u0012\t\u0000|}\u0005\u0014\u0000\u0000}\u007f\u0003\u0012\t\u0000"+
		"~|\u0001\u0000\u0000\u0000\u007f\u0082\u0001\u0000\u0000\u0000\u0080~"+
		"\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081\u0084"+
		"\u0001\u0000\u0000\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0083{\u0001"+
		"\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084\u0085\u0001"+
		"\u0000\u0000\u0000\u0085\u0086\u0005\u000b\u0000\u0000\u0086\u0017\u0001"+
		"\u0000\u0000\u0000\u0087\u008a\u0003\u001a\r\u0000\u0088\u0089\u0005\u0015"+
		"\u0000\u0000\u0089\u008b\u0003\u0018\f\u0000\u008a\u0088\u0001\u0000\u0000"+
		"\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u0090\u0001\u0000\u0000"+
		"\u0000\u008c\u008d\u0005\b\u0000\u0000\u008d\u008e\u0005\u0015\u0000\u0000"+
		"\u008e\u0090\u0003\u0018\f\u0000\u008f\u0087\u0001\u0000\u0000\u0000\u008f"+
		"\u008c\u0001\u0000\u0000\u0000\u0090\u0019\u0001\u0000\u0000\u0000\u0091"+
		"\u0098\u0003\u0002\u0001\u0000\u0092\u0095\u0003\u001c\u000e\u0000\u0093"+
		"\u0094\u0007\u0000\u0000\u0000\u0094\u0096\u0003\u0006\u0003\u0000\u0095"+
		"\u0093\u0001\u0000\u0000\u0000\u0095\u0096\u0001\u0000\u0000\u0000\u0096"+
		"\u0098\u0001\u0000\u0000\u0000\u0097\u0091\u0001\u0000\u0000\u0000\u0097"+
		"\u0092\u0001\u0000\u0000\u0000\u0098\u001b\u0001\u0000\u0000\u0000\u0099"+
		"\u009d\u0003\u0014\n\u0000\u009a\u009c\u0003\u000e\u0007\u0000\u009b\u009a"+
		"\u0001\u0000\u0000\u0000\u009c\u009f\u0001\u0000\u0000\u0000\u009d\u009b"+
		"\u0001\u0000\u0000\u0000\u009d\u009e\u0001\u0000\u0000\u0000\u009e\u001d"+
		"\u0001\u0000\u0000\u0000\u009f\u009d\u0001\u0000\u0000\u0000\u00a0\u00a5"+
		"\u0003 \u0010\u0000\u00a1\u00a2\u0005\u001f\u0000\u0000\u00a2\u00a4\u0003"+
		" \u0010\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a4\u00a7\u0001\u0000"+
		"\u0000\u0000\u00a5\u00a3\u0001\u0000\u0000\u0000\u00a5\u00a6\u0001\u0000"+
		"\u0000\u0000\u00a6\u001f\u0001\u0000\u0000\u0000\u00a7\u00a5\u0001\u0000"+
		"\u0000\u0000\u00a8\u00ad\u0003\"\u0011\u0000\u00a9\u00aa\u0005\u001e\u0000"+
		"\u0000\u00aa\u00ac\u0003\"\u0011\u0000\u00ab\u00a9\u0001\u0000\u0000\u0000"+
		"\u00ac\u00af\u0001\u0000\u0000\u0000\u00ad\u00ab\u0001\u0000\u0000\u0000"+
		"\u00ad\u00ae\u0001\u0000\u0000\u0000\u00ae!\u0001\u0000\u0000\u0000\u00af"+
		"\u00ad\u0001\u0000\u0000\u0000\u00b0\u00b5\u0003$\u0012\u0000\u00b1\u00b2"+
		"\u0007\u0002\u0000\u0000\u00b2\u00b4\u0003$\u0012\u0000\u00b3\u00b1\u0001"+
		"\u0000\u0000\u0000\u00b4\u00b7\u0001\u0000\u0000\u0000\u00b5\u00b3\u0001"+
		"\u0000\u0000\u0000\u00b5\u00b6\u0001\u0000\u0000\u0000\u00b6#\u0001\u0000"+
		"\u0000\u0000\u00b7\u00b5\u0001\u0000\u0000\u0000\u00b8\u00bd\u0003&\u0013"+
		"\u0000\u00b9\u00ba\u0007\u0003\u0000\u0000\u00ba\u00bc\u0003&\u0013\u0000"+
		"\u00bb\u00b9\u0001\u0000\u0000\u0000\u00bc\u00bf\u0001\u0000\u0000\u0000"+
		"\u00bd\u00bb\u0001\u0000\u0000\u0000\u00bd\u00be\u0001\u0000\u0000\u0000"+
		"\u00be%\u0001\u0000\u0000\u0000\u00bf\u00bd\u0001\u0000\u0000\u0000\u00c0"+
		"\u00c5\u0003(\u0014\u0000\u00c1\u00c2\u0007\u0004\u0000\u0000\u00c2\u00c4"+
		"\u0003(\u0014\u0000\u00c3\u00c1\u0001\u0000\u0000\u0000\u00c4\u00c7\u0001"+
		"\u0000\u0000\u0000\u00c5\u00c3\u0001\u0000\u0000\u0000\u00c5\u00c6\u0001"+
		"\u0000\u0000\u0000\u00c6\'\u0001\u0000\u0000\u0000\u00c7\u00c5\u0001\u0000"+
		"\u0000\u0000\u00c8\u00cb\u0003*\u0015\u0000\u00c9\u00ca\u0007\u0005\u0000"+
		"\u0000\u00ca\u00cc\u0003(\u0014\u0000\u00cb\u00c9\u0001\u0000\u0000\u0000"+
		"\u00cb\u00cc\u0001\u0000\u0000\u0000\u00cc\u00d3\u0001\u0000\u0000\u0000"+
		"\u00cd\u00d0\u0005\b\u0000\u0000\u00ce\u00cf\u0007\u0006\u0000\u0000\u00cf"+
		"\u00d1\u0003(\u0014\u0000\u00d0\u00ce\u0001\u0000\u0000\u0000\u00d0\u00d1"+
		"\u0001\u0000\u0000\u0000\u00d1\u00d3\u0001\u0000\u0000\u0000\u00d2\u00c8"+
		"\u0001\u0000\u0000\u0000\u00d2\u00cd\u0001\u0000\u0000\u0000\u00d3)\u0001"+
		"\u0000\u0000\u0000\u00d4\u00d6\u0005\u000e\u0000\u0000\u00d5\u00d4\u0001"+
		"\u0000\u0000\u0000\u00d6\u00d9\u0001\u0000\u0000\u0000\u00d7\u00d5\u0001"+
		"\u0000\u0000\u0000\u00d7\u00d8\u0001\u0000\u0000\u0000\u00d8\u00da\u0001"+
		"\u0000\u0000\u0000\u00d9\u00d7\u0001\u0000\u0000\u0000\u00da\u00db\u0003"+
		"\u0018\f\u0000\u00db+\u0001\u0000\u0000\u0000\u00dc\u00df\u00034\u001a"+
		"\u0000\u00dd\u00de\u0005\u001a\u0000\u0000\u00de\u00e0\u00034\u001a\u0000"+
		"\u00df\u00dd\u0001\u0000\u0000\u0000\u00df\u00e0\u0001\u0000\u0000\u0000"+
		"\u00e0-\u0001\u0000\u0000\u0000\u00e1\u00e2\u00034\u001a\u0000\u00e2\u00e3"+
		"\u0005\u001a\u0000\u0000\u00e3\u00e4\u00034\u001a\u0000\u00e4\u00ec\u0001"+
		"\u0000\u0000\u0000\u00e5\u00ec\u0005$\u0000\u0000\u00e6\u00ec\u0005\u0007"+
		"\u0000\u0000\u00e7\u00ec\u0005\u001e\u0000\u0000\u00e8\u00ec\u0005\u001f"+
		"\u0000\u0000\u00e9\u00ec\u0005 \u0000\u0000\u00ea\u00ec\u0005!\u0000\u0000"+
		"\u00eb\u00e1\u0001\u0000\u0000\u0000\u00eb\u00e5\u0001\u0000\u0000\u0000"+
		"\u00eb\u00e6\u0001\u0000\u0000\u0000\u00eb\u00e7\u0001\u0000\u0000\u0000"+
		"\u00eb\u00e8\u0001\u0000\u0000\u0000\u00eb\u00e9\u0001\u0000\u0000\u0000"+
		"\u00eb\u00ea\u0001\u0000\u0000\u0000\u00ec/\u0001\u0000\u0000\u0000\u00ed"+
		"\u00ee\u0005\u0004\u0000\u0000\u00ee\u00ef\u0003,\u0016\u0000\u00ef1\u0001"+
		"\u0000\u0000\u0000\u00f0\u00f7\u0005\u0011\u0000\u0000\u00f1\u00f2\u0003"+
		"4\u001a\u0000\u00f2\u00f3\u0005\u001a\u0000\u0000\u00f3\u00f4\u0005\u0011"+
		"\u0000\u0000\u00f4\u00f7\u0001\u0000\u0000\u0000\u00f5\u00f7\u0003,\u0016"+
		"\u0000\u00f6\u00f0\u0001\u0000\u0000\u0000\u00f6\u00f1\u0001\u0000\u0000"+
		"\u0000\u00f6\u00f5\u0001\u0000\u0000\u0000\u00f73\u0001\u0000\u0000\u0000"+
		"\u00f8\u00f9\u0007\u0007\u0000\u0000\u00f95\u0001\u0000\u0000\u0000\u001c"+
		";AHPTY[ew\u0080\u0083\u008a\u008f\u0095\u0097\u009d\u00a5\u00ad\u00b5"+
		"\u00bd\u00c5\u00cb\u00d0\u00d2\u00d7\u00df\u00eb\u00f6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}