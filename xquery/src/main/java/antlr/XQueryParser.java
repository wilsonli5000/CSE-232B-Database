// Generated from /Users/wilsonli/IdeaProjects/xquery/src/main/resources/XQuery.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class XQueryParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, StringConstant=36, NUM=37, DOC=38, 
		TXT=39, NAME=40, WS=41;
	public static final int
		RULE_xq = 0, RULE_var = 1, RULE_forClause = 2, RULE_letClause = 3, RULE_whereClause = 4, 
		RULE_returnClause = 5, RULE_cond = 6, RULE_ap = 7, RULE_doc = 8, RULE_fname = 9, 
		RULE_rp = 10, RULE_fltr = 11, RULE_constant = 12;
	public static final String[] ruleNames = {
		"xq", "var", "forClause", "letClause", "whereClause", "returnClause", 
		"cond", "ap", "doc", "fname", "rp", "fltr", "constant"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'$'", "'('", "')'", "','", "'/'", "'//'", "'<'", "'>'", "'{'", 
		"'}'", "'for'", "'in'", "'let'", "':='", "'where'", "'return'", "'='", 
		"'eq'", "'=='", "'is'", "'empty'", "'some'", "'satisfies'", "'and'", "'or'", 
		"'not'", "'\"'", "'\")'", "'.'", "'@'", "'*'", "'..'", "'['", "']'", "'\"'", 
		null, null, "'document'", "'text()'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"StringConstant", "NUM", "DOC", "TXT", "NAME", "WS"
	};
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
	public String getGrammarFileName() { return "XQuery.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public XQueryParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class XqContext extends ParserRuleContext {
		public XqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xq; }
	 
		public XqContext() { }
		public void copyFrom(XqContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class XQVariableContext extends XqContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public XQVariableContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterXQVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitXQVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitXQVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class XQApContext extends XqContext {
		public ApContext ap() {
			return getRuleContext(ApContext.class,0);
		}
		public XQApContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterXQAp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitXQAp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitXQAp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class XQWithParContext extends XqContext {
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public XQWithParContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterXQWithPar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitXQWithPar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitXQWithPar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FLWRContext extends XqContext {
		public ForClauseContext forClause() {
			return getRuleContext(ForClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public LetClauseContext letClause() {
			return getRuleContext(LetClauseContext.class,0);
		}
		public ReturnClauseContext returnClause() {
			return getRuleContext(ReturnClauseContext.class,0);
		}
		public FLWRContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterFLWR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitFLWR(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitFLWR(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TwoXQContext extends XqContext {
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public TwoXQContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterTwoXQ(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitTwoXQ(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitTwoXQ(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class XQLetContext extends XqContext {
		public LetClauseContext letClause() {
			return getRuleContext(LetClauseContext.class,0);
		}
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public XQLetContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterXQLet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitXQLet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitXQLet(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class XQStrConstContext extends XqContext {
		public TerminalNode StringConstant() { return getToken(XQueryParser.StringConstant, 0); }
		public XQStrConstContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterXQStrConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitXQStrConst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitXQStrConst(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class XQRpContext extends XqContext {
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public XQRpContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterXQRp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitXQRp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitXQRp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class XQRpAllContext extends XqContext {
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public XQRpAllContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterXQRpAll(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitXQRpAll(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitXQRpAll(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class XQTagContext extends XqContext {
		public List<TerminalNode> NAME() { return getTokens(XQueryParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(XQueryParser.NAME, i);
		}
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public XQTagContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterXQTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitXQTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitXQTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final XqContext xq() throws RecognitionException {
		return xq(0);
	}

	private XqContext xq(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		XqContext _localctx = new XqContext(_ctx, _parentState);
		XqContext _prevctx = _localctx;
		int _startState = 0;
		enterRecursionRule(_localctx, 0, RULE_xq, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			switch (_input.LA(1)) {
			case T__12:
				{
				_localctx = new XQLetContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(27);
				letClause();
				setState(28);
				xq(1);
				}
				break;
			case T__0:
				{
				_localctx = new XQVariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(30);
				match(T__0);
				setState(31);
				var();
				}
				break;
			case StringConstant:
				{
				_localctx = new XQStrConstContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(32);
				match(StringConstant);
				}
				break;
			case DOC:
				{
				_localctx = new XQApContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(33);
				ap();
				}
				break;
			case T__1:
				{
				_localctx = new XQWithParContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(34);
				match(T__1);
				setState(35);
				xq(0);
				setState(36);
				match(T__2);
				}
				break;
			case T__6:
				{
				_localctx = new XQTagContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(38);
				match(T__6);
				setState(39);
				match(NAME);
				setState(40);
				match(T__7);
				setState(41);
				match(T__8);
				setState(42);
				xq(0);
				setState(43);
				match(T__9);
				setState(44);
				match(T__6);
				setState(45);
				match(T__4);
				setState(46);
				match(NAME);
				setState(47);
				match(T__7);
				}
				break;
			case T__10:
				{
				_localctx = new FLWRContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(49);
				forClause();
				setState(51);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(50);
					letClause();
					}
				}

				setState(53);
				whereClause();
				setState(55);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(54);
					returnClause();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(70);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(68);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new TwoXQContext(new XqContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_xq);
						setState(59);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(60);
						match(T__3);
						setState(61);
						xq(7);
						}
						break;
					case 2:
						{
						_localctx = new XQRpContext(new XqContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_xq);
						setState(62);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(63);
						match(T__4);
						setState(64);
						rp(0);
						}
						break;
					case 3:
						{
						_localctx = new XQRpAllContext(new XqContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_xq);
						setState(65);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(66);
						match(T__5);
						setState(67);
						rp(0);
						}
						break;
					}
					} 
				}
				setState(72);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class VarContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(XQueryParser.NAME, 0); }
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(NAME);
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

	public static class ForClauseContext extends ParserRuleContext {
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public ForClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterForClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitForClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitForClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForClauseContext forClause() throws RecognitionException {
		ForClauseContext _localctx = new ForClauseContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_forClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(T__10);
			setState(76);
			match(T__0);
			setState(77);
			var();
			setState(78);
			match(T__11);
			setState(79);
			xq(0);
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(80);
				match(T__3);
				setState(81);
				match(T__0);
				setState(82);
				var();
				setState(83);
				match(T__11);
				setState(84);
				xq(0);
				}
				}
				setState(90);
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

	public static class LetClauseContext extends ParserRuleContext {
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public LetClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterLetClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitLetClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitLetClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LetClauseContext letClause() throws RecognitionException {
		LetClauseContext _localctx = new LetClauseContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_letClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(T__12);
			setState(92);
			match(T__0);
			setState(93);
			var();
			setState(94);
			match(T__13);
			setState(95);
			xq(0);
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(96);
				match(T__3);
				setState(97);
				match(T__0);
				setState(98);
				var();
				setState(99);
				match(T__13);
				setState(100);
				xq(0);
				}
				}
				setState(106);
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

	public static class WhereClauseContext extends ParserRuleContext {
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterWhereClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitWhereClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitWhereClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(T__14);
			setState(108);
			cond(0);
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

	public static class ReturnClauseContext extends ParserRuleContext {
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public ReturnClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterReturnClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitReturnClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitReturnClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnClauseContext returnClause() throws RecognitionException {
		ReturnClauseContext _localctx = new ReturnClauseContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_returnClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(T__15);
			setState(111);
			xq(0);
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

	public static class CondContext extends ParserRuleContext {
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
	 
		public CondContext() { }
		public void copyFrom(CondContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class XQCondEqualContext extends CondContext {
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public XQCondEqualContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterXQCondEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitXQCondEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitXQCondEqual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class XQCondIsContext extends CondContext {
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public XQCondIsContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterXQCondIs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitXQCondIs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitXQCondIs(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class XQCondAndContext extends CondContext {
		public List<CondContext> cond() {
			return getRuleContexts(CondContext.class);
		}
		public CondContext cond(int i) {
			return getRuleContext(CondContext.class,i);
		}
		public XQCondAndContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterXQCondAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitXQCondAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitXQCondAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class XQCondNotContext extends CondContext {
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public XQCondNotContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterXQCondNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitXQCondNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitXQCondNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class XQCondEmptyContext extends CondContext {
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public XQCondEmptyContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterXQCondEmpty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitXQCondEmpty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitXQCondEmpty(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class XQCondSomeContext extends CondContext {
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public XQCondSomeContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterXQCondSome(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitXQCondSome(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitXQCondSome(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class XQCondORContext extends CondContext {
		public List<CondContext> cond() {
			return getRuleContexts(CondContext.class);
		}
		public CondContext cond(int i) {
			return getRuleContext(CondContext.class,i);
		}
		public XQCondORContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterXQCondOR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitXQCondOR(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitXQCondOR(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class XQCondWithParContext extends CondContext {
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public XQCondWithParContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterXQCondWithPar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitXQCondWithPar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitXQCondWithPar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondContext cond() throws RecognitionException {
		return cond(0);
	}

	private CondContext cond(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CondContext _localctx = new CondContext(_ctx, _parentState);
		CondContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_cond, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				_localctx = new XQCondSomeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(114);
				match(T__21);
				setState(115);
				var();
				setState(116);
				match(T__11);
				setState(117);
				xq(0);
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(118);
					match(T__3);
					setState(119);
					var();
					setState(120);
					match(T__11);
					setState(121);
					xq(0);
					}
					}
					setState(127);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(128);
				match(T__22);
				setState(129);
				cond(5);
				}
				break;
			case 2:
				{
				_localctx = new XQCondNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(131);
				match(T__25);
				setState(132);
				cond(1);
				}
				break;
			case 3:
				{
				_localctx = new XQCondEqualContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(133);
				xq(0);
				setState(134);
				match(T__16);
				setState(135);
				xq(0);
				}
				break;
			case 4:
				{
				_localctx = new XQCondEqualContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(137);
				xq(0);
				setState(138);
				match(T__17);
				setState(139);
				xq(0);
				}
				break;
			case 5:
				{
				_localctx = new XQCondIsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(141);
				xq(0);
				setState(142);
				match(T__18);
				setState(143);
				xq(0);
				}
				break;
			case 6:
				{
				_localctx = new XQCondIsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(145);
				xq(0);
				setState(146);
				match(T__19);
				setState(147);
				xq(0);
				}
				break;
			case 7:
				{
				_localctx = new XQCondEmptyContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(149);
				match(T__20);
				setState(150);
				match(T__1);
				setState(151);
				xq(0);
				setState(152);
				match(T__2);
				}
				break;
			case 8:
				{
				_localctx = new XQCondWithParContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(154);
				match(T__1);
				setState(155);
				cond(0);
				setState(156);
				match(T__2);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(168);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(166);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new XQCondAndContext(new CondContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_cond);
						setState(160);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(161);
						match(T__23);
						setState(162);
						cond(4);
						}
						break;
					case 2:
						{
						_localctx = new XQCondORContext(new CondContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_cond);
						setState(163);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(164);
						match(T__24);
						setState(165);
						cond(3);
						}
						break;
					}
					} 
				}
				setState(170);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ApContext extends ParserRuleContext {
		public ApContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ap; }
	 
		public ApContext() { }
		public void copyFrom(ApContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class APChildrenContext extends ApContext {
		public DocContext doc() {
			return getRuleContext(DocContext.class,0);
		}
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public APChildrenContext(ApContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterAPChildren(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitAPChildren(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitAPChildren(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class APAllContext extends ApContext {
		public DocContext doc() {
			return getRuleContext(DocContext.class,0);
		}
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public APAllContext(ApContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterAPAll(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitAPAll(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitAPAll(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ApContext ap() throws RecognitionException {
		ApContext _localctx = new ApContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ap);
		try {
			setState(179);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new APChildrenContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				doc();
				setState(172);
				match(T__4);
				setState(173);
				rp(0);
				}
				break;
			case 2:
				_localctx = new APAllContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(175);
				doc();
				setState(176);
				match(T__5);
				setState(177);
				rp(0);
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

	public static class DocContext extends ParserRuleContext {
		public TerminalNode DOC() { return getToken(XQueryParser.DOC, 0); }
		public FnameContext fname() {
			return getRuleContext(FnameContext.class,0);
		}
		public DocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterDoc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitDoc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitDoc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DocContext doc() throws RecognitionException {
		DocContext _localctx = new DocContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_doc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(DOC);
			setState(182);
			match(T__1);
			setState(183);
			match(T__26);
			setState(184);
			fname();
			setState(185);
			match(T__27);
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

	public static class FnameContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(XQueryParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(XQueryParser.NAME, i);
		}
		public FnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterFname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitFname(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitFname(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FnameContext fname() throws RecognitionException {
		FnameContext _localctx = new FnameContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_fname);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(NAME);
			setState(190);
			_la = _input.LA(1);
			if (_la==T__28) {
				{
				setState(188);
				match(T__28);
				setState(189);
				match(NAME);
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

	public static class RpContext extends ParserRuleContext {
		public RpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rp; }
	 
		public RpContext() { }
		public void copyFrom(RpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AllChildrenContext extends RpContext {
		public AllChildrenContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterAllChildren(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitAllChildren(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitAllChildren(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RPChildrenContext extends RpContext {
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public RPChildrenContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterRPChildren(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitRPChildren(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitRPChildren(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RPwithParContext extends RpContext {
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public RPwithParContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterRPwithPar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitRPwithPar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitRPwithPar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TagNameContext extends RpContext {
		public TerminalNode NAME() { return getToken(XQueryParser.NAME, 0); }
		public TagNameContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterTagName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitTagName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitTagName(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AttributeContext extends RpContext {
		public TerminalNode NAME() { return getToken(XQueryParser.NAME, 0); }
		public AttributeContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitAttribute(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParentContext extends RpContext {
		public ParentContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterParent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitParent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitParent(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TextContext extends RpContext {
		public TerminalNode TXT() { return getToken(XQueryParser.TXT, 0); }
		public TextContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitText(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RPAllContext extends RpContext {
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public RPAllContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterRPAll(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitRPAll(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitRPAll(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CurrentContext extends RpContext {
		public CurrentContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterCurrent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitCurrent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitCurrent(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TwoRPContext extends RpContext {
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public TwoRPContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterTwoRP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitTwoRP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitTwoRP(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RPConditionContext extends RpContext {
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public FltrContext fltr() {
			return getRuleContext(FltrContext.class,0);
		}
		public RPConditionContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterRPCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitRPCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitRPCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RpContext rp() throws RecognitionException {
		return rp(0);
	}

	private RpContext rp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RpContext _localctx = new RpContext(_ctx, _parentState);
		RpContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_rp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			switch (_input.LA(1)) {
			case NAME:
				{
				_localctx = new TagNameContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(193);
				match(NAME);
				}
				break;
			case T__29:
				{
				_localctx = new AttributeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(194);
				match(T__29);
				setState(195);
				match(NAME);
				}
				break;
			case T__30:
				{
				_localctx = new AllChildrenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(196);
				match(T__30);
				}
				break;
			case T__28:
				{
				_localctx = new CurrentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(197);
				match(T__28);
				}
				break;
			case T__31:
				{
				_localctx = new ParentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(198);
				match(T__31);
				}
				break;
			case TXT:
				{
				_localctx = new TextContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(199);
				match(TXT);
				}
				break;
			case T__1:
				{
				_localctx = new RPwithParContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(200);
				match(T__1);
				setState(201);
				rp(0);
				setState(202);
				match(T__2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(222);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(220);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new RPChildrenContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(206);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(207);
						match(T__4);
						setState(208);
						rp(5);
						}
						break;
					case 2:
						{
						_localctx = new RPAllContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(209);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(210);
						match(T__5);
						setState(211);
						rp(4);
						}
						break;
					case 3:
						{
						_localctx = new TwoRPContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(212);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(213);
						match(T__3);
						setState(214);
						rp(2);
						}
						break;
					case 4:
						{
						_localctx = new RPConditionContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(215);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(216);
						match(T__32);
						setState(217);
						fltr(0);
						setState(218);
						match(T__33);
						}
						break;
					}
					} 
				}
				setState(224);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class FltrContext extends ParserRuleContext {
		public FltrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fltr; }
	 
		public FltrContext() { }
		public void copyFrom(FltrContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FRPnotContext extends FltrContext {
		public FltrContext fltr() {
			return getRuleContext(FltrContext.class,0);
		}
		public FRPnotContext(FltrContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterFRPnot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitFRPnot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitFRPnot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FRPwithParContext extends FltrContext {
		public FltrContext fltr() {
			return getRuleContext(FltrContext.class,0);
		}
		public FRPwithParContext(FltrContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterFRPwithPar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitFRPwithPar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitFRPwithPar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FRPconstContext extends FltrContext {
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public FRPconstContext(FltrContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterFRPconst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitFRPconst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitFRPconst(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FRPContext extends FltrContext {
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public FRPContext(FltrContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterFRP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitFRP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitFRP(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FRPorContext extends FltrContext {
		public List<FltrContext> fltr() {
			return getRuleContexts(FltrContext.class);
		}
		public FltrContext fltr(int i) {
			return getRuleContext(FltrContext.class,i);
		}
		public FRPorContext(FltrContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterFRPor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitFRPor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitFRPor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FRPequalContext extends FltrContext {
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public FRPequalContext(FltrContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterFRPequal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitFRPequal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitFRPequal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FRPisContext extends FltrContext {
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public FRPisContext(FltrContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterFRPis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitFRPis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitFRPis(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FRPandContext extends FltrContext {
		public List<FltrContext> fltr() {
			return getRuleContexts(FltrContext.class);
		}
		public FltrContext fltr(int i) {
			return getRuleContext(FltrContext.class,i);
		}
		public FRPandContext(FltrContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterFRPand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitFRPand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitFRPand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FltrContext fltr() throws RecognitionException {
		return fltr(0);
	}

	private FltrContext fltr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		FltrContext _localctx = new FltrContext(_ctx, _parentState);
		FltrContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_fltr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				_localctx = new FRPnotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(226);
				match(T__25);
				setState(227);
				fltr(2);
				}
				break;
			case 2:
				{
				_localctx = new FRPContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(228);
				rp(0);
				}
				break;
			case 3:
				{
				_localctx = new FRPequalContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(229);
				rp(0);
				setState(230);
				match(T__16);
				setState(231);
				rp(0);
				}
				break;
			case 4:
				{
				_localctx = new FRPequalContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(233);
				rp(0);
				setState(234);
				match(T__17);
				setState(235);
				rp(0);
				}
				break;
			case 5:
				{
				_localctx = new FRPisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(237);
				rp(0);
				setState(238);
				match(T__18);
				setState(239);
				rp(0);
				}
				break;
			case 6:
				{
				_localctx = new FRPisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(241);
				rp(0);
				setState(242);
				match(T__19);
				setState(243);
				rp(0);
				}
				break;
			case 7:
				{
				_localctx = new FRPwithParContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(245);
				match(T__1);
				setState(246);
				fltr(0);
				setState(247);
				match(T__2);
				}
				break;
			case 8:
				{
				_localctx = new FRPconstContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(249);
				rp(0);
				setState(250);
				match(T__16);
				setState(251);
				constant();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(263);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(261);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new FRPandContext(new FltrContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_fltr);
						setState(255);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(256);
						match(T__23);
						setState(257);
						fltr(5);
						}
						break;
					case 2:
						{
						_localctx = new FRPorContext(new FltrContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_fltr);
						setState(258);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(259);
						match(T__24);
						setState(260);
						fltr(4);
						}
						break;
					}
					} 
				}
				setState(265);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ConstantContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(XQueryParser.NAME, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_constant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			match(T__34);
			setState(267);
			match(NAME);
			setState(268);
			match(T__34);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 0:
			return xq_sempred((XqContext)_localctx, predIndex);
		case 6:
			return cond_sempred((CondContext)_localctx, predIndex);
		case 10:
			return rp_sempred((RpContext)_localctx, predIndex);
		case 11:
			return fltr_sempred((FltrContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean xq_sempred(XqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean cond_sempred(CondContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean rp_sempred(RpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 4);
		case 6:
			return precpred(_ctx, 3);
		case 7:
			return precpred(_ctx, 1);
		case 8:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean fltr_sempred(FltrContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 4);
		case 10:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3+\u0111\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\66\n"+
		"\2\3\2\3\2\5\2:\n\2\5\2<\n\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2G"+
		"\n\2\f\2\16\2J\13\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\7\4Y\n\4\f\4\16\4\\\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\7\5i\n\5\f\5\16\5l\13\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\7\b~\n\b\f\b\16\b\u0081\13\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00a1\n\b\3\b\3\b\3\b\3\b\3\b\3\b\7"+
		"\b\u00a9\n\b\f\b\16\b\u00ac\13\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00b6"+
		"\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\5\13\u00c1\n\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00cf\n\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00df\n\f\f\f\16\f\u00e2\13"+
		"\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0100\n\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\7\r\u0108\n\r\f\r\16\r\u010b\13\r\3\16\3\16\3\16\3\16\3\16"+
		"\2\6\2\16\26\30\17\2\4\6\b\n\f\16\20\22\24\26\30\32\2\2\u012f\2;\3\2\2"+
		"\2\4K\3\2\2\2\6M\3\2\2\2\b]\3\2\2\2\nm\3\2\2\2\fp\3\2\2\2\16\u00a0\3\2"+
		"\2\2\20\u00b5\3\2\2\2\22\u00b7\3\2\2\2\24\u00bd\3\2\2\2\26\u00ce\3\2\2"+
		"\2\30\u00ff\3\2\2\2\32\u010c\3\2\2\2\34\35\b\2\1\2\35\36\5\b\5\2\36\37"+
		"\5\2\2\3\37<\3\2\2\2 !\7\3\2\2!<\5\4\3\2\"<\7&\2\2#<\5\20\t\2$%\7\4\2"+
		"\2%&\5\2\2\2&\'\7\5\2\2\'<\3\2\2\2()\7\t\2\2)*\7*\2\2*+\7\n\2\2+,\7\13"+
		"\2\2,-\5\2\2\2-.\7\f\2\2./\7\t\2\2/\60\7\7\2\2\60\61\7*\2\2\61\62\7\n"+
		"\2\2\62<\3\2\2\2\63\65\5\6\4\2\64\66\5\b\5\2\65\64\3\2\2\2\65\66\3\2\2"+
		"\2\66\67\3\2\2\2\679\5\n\6\28:\5\f\7\298\3\2\2\29:\3\2\2\2:<\3\2\2\2;"+
		"\34\3\2\2\2; \3\2\2\2;\"\3\2\2\2;#\3\2\2\2;$\3\2\2\2;(\3\2\2\2;\63\3\2"+
		"\2\2<H\3\2\2\2=>\f\b\2\2>?\7\6\2\2?G\5\2\2\t@A\f\7\2\2AB\7\7\2\2BG\5\26"+
		"\f\2CD\f\6\2\2DE\7\b\2\2EG\5\26\f\2F=\3\2\2\2F@\3\2\2\2FC\3\2\2\2GJ\3"+
		"\2\2\2HF\3\2\2\2HI\3\2\2\2I\3\3\2\2\2JH\3\2\2\2KL\7*\2\2L\5\3\2\2\2MN"+
		"\7\r\2\2NO\7\3\2\2OP\5\4\3\2PQ\7\16\2\2QZ\5\2\2\2RS\7\6\2\2ST\7\3\2\2"+
		"TU\5\4\3\2UV\7\16\2\2VW\5\2\2\2WY\3\2\2\2XR\3\2\2\2Y\\\3\2\2\2ZX\3\2\2"+
		"\2Z[\3\2\2\2[\7\3\2\2\2\\Z\3\2\2\2]^\7\17\2\2^_\7\3\2\2_`\5\4\3\2`a\7"+
		"\20\2\2aj\5\2\2\2bc\7\6\2\2cd\7\3\2\2de\5\4\3\2ef\7\20\2\2fg\5\2\2\2g"+
		"i\3\2\2\2hb\3\2\2\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2k\t\3\2\2\2lj\3\2\2\2"+
		"mn\7\21\2\2no\5\16\b\2o\13\3\2\2\2pq\7\22\2\2qr\5\2\2\2r\r\3\2\2\2st\b"+
		"\b\1\2tu\7\30\2\2uv\5\4\3\2vw\7\16\2\2w\177\5\2\2\2xy\7\6\2\2yz\5\4\3"+
		"\2z{\7\16\2\2{|\5\2\2\2|~\3\2\2\2}x\3\2\2\2~\u0081\3\2\2\2\177}\3\2\2"+
		"\2\177\u0080\3\2\2\2\u0080\u0082\3\2\2\2\u0081\177\3\2\2\2\u0082\u0083"+
		"\7\31\2\2\u0083\u0084\5\16\b\7\u0084\u00a1\3\2\2\2\u0085\u0086\7\34\2"+
		"\2\u0086\u00a1\5\16\b\3\u0087\u0088\5\2\2\2\u0088\u0089\7\23\2\2\u0089"+
		"\u008a\5\2\2\2\u008a\u00a1\3\2\2\2\u008b\u008c\5\2\2\2\u008c\u008d\7\24"+
		"\2\2\u008d\u008e\5\2\2\2\u008e\u00a1\3\2\2\2\u008f\u0090\5\2\2\2\u0090"+
		"\u0091\7\25\2\2\u0091\u0092\5\2\2\2\u0092\u00a1\3\2\2\2\u0093\u0094\5"+
		"\2\2\2\u0094\u0095\7\26\2\2\u0095\u0096\5\2\2\2\u0096\u00a1\3\2\2\2\u0097"+
		"\u0098\7\27\2\2\u0098\u0099\7\4\2\2\u0099\u009a\5\2\2\2\u009a\u009b\7"+
		"\5\2\2\u009b\u00a1\3\2\2\2\u009c\u009d\7\4\2\2\u009d\u009e\5\16\b\2\u009e"+
		"\u009f\7\5\2\2\u009f\u00a1\3\2\2\2\u00a0s\3\2\2\2\u00a0\u0085\3\2\2\2"+
		"\u00a0\u0087\3\2\2\2\u00a0\u008b\3\2\2\2\u00a0\u008f\3\2\2\2\u00a0\u0093"+
		"\3\2\2\2\u00a0\u0097\3\2\2\2\u00a0\u009c\3\2\2\2\u00a1\u00aa\3\2\2\2\u00a2"+
		"\u00a3\f\5\2\2\u00a3\u00a4\7\32\2\2\u00a4\u00a9\5\16\b\6\u00a5\u00a6\f"+
		"\4\2\2\u00a6\u00a7\7\33\2\2\u00a7\u00a9\5\16\b\5\u00a8\u00a2\3\2\2\2\u00a8"+
		"\u00a5\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2"+
		"\2\2\u00ab\17\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00ae\5\22\n\2\u00ae\u00af"+
		"\7\7\2\2\u00af\u00b0\5\26\f\2\u00b0\u00b6\3\2\2\2\u00b1\u00b2\5\22\n\2"+
		"\u00b2\u00b3\7\b\2\2\u00b3\u00b4\5\26\f\2\u00b4\u00b6\3\2\2\2\u00b5\u00ad"+
		"\3\2\2\2\u00b5\u00b1\3\2\2\2\u00b6\21\3\2\2\2\u00b7\u00b8\7(\2\2\u00b8"+
		"\u00b9\7\4\2\2\u00b9\u00ba\7\35\2\2\u00ba\u00bb\5\24\13\2\u00bb\u00bc"+
		"\7\36\2\2\u00bc\23\3\2\2\2\u00bd\u00c0\7*\2\2\u00be\u00bf\7\37\2\2\u00bf"+
		"\u00c1\7*\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\25\3\2\2\2"+
		"\u00c2\u00c3\b\f\1\2\u00c3\u00cf\7*\2\2\u00c4\u00c5\7 \2\2\u00c5\u00cf"+
		"\7*\2\2\u00c6\u00cf\7!\2\2\u00c7\u00cf\7\37\2\2\u00c8\u00cf\7\"\2\2\u00c9"+
		"\u00cf\7)\2\2\u00ca\u00cb\7\4\2\2\u00cb\u00cc\5\26\f\2\u00cc\u00cd\7\5"+
		"\2\2\u00cd\u00cf\3\2\2\2\u00ce\u00c2\3\2\2\2\u00ce\u00c4\3\2\2\2\u00ce"+
		"\u00c6\3\2\2\2\u00ce\u00c7\3\2\2\2\u00ce\u00c8\3\2\2\2\u00ce\u00c9\3\2"+
		"\2\2\u00ce\u00ca\3\2\2\2\u00cf\u00e0\3\2\2\2\u00d0\u00d1\f\6\2\2\u00d1"+
		"\u00d2\7\7\2\2\u00d2\u00df\5\26\f\7\u00d3\u00d4\f\5\2\2\u00d4\u00d5\7"+
		"\b\2\2\u00d5\u00df\5\26\f\6\u00d6\u00d7\f\3\2\2\u00d7\u00d8\7\6\2\2\u00d8"+
		"\u00df\5\26\f\4\u00d9\u00da\f\4\2\2\u00da\u00db\7#\2\2\u00db\u00dc\5\30"+
		"\r\2\u00dc\u00dd\7$\2\2\u00dd\u00df\3\2\2\2\u00de\u00d0\3\2\2\2\u00de"+
		"\u00d3\3\2\2\2\u00de\u00d6\3\2\2\2\u00de\u00d9\3\2\2\2\u00df\u00e2\3\2"+
		"\2\2\u00e0\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\27\3\2\2\2\u00e2\u00e0"+
		"\3\2\2\2\u00e3\u00e4\b\r\1\2\u00e4\u00e5\7\34\2\2\u00e5\u0100\5\30\r\4"+
		"\u00e6\u0100\5\26\f\2\u00e7\u00e8\5\26\f\2\u00e8\u00e9\7\23\2\2\u00e9"+
		"\u00ea\5\26\f\2\u00ea\u0100\3\2\2\2\u00eb\u00ec\5\26\f\2\u00ec\u00ed\7"+
		"\24\2\2\u00ed\u00ee\5\26\f\2\u00ee\u0100\3\2\2\2\u00ef\u00f0\5\26\f\2"+
		"\u00f0\u00f1\7\25\2\2\u00f1\u00f2\5\26\f\2\u00f2\u0100\3\2\2\2\u00f3\u00f4"+
		"\5\26\f\2\u00f4\u00f5\7\26\2\2\u00f5\u00f6\5\26\f\2\u00f6\u0100\3\2\2"+
		"\2\u00f7\u00f8\7\4\2\2\u00f8\u00f9\5\30\r\2\u00f9\u00fa\7\5\2\2\u00fa"+
		"\u0100\3\2\2\2\u00fb\u00fc\5\26\f\2\u00fc\u00fd\7\23\2\2\u00fd\u00fe\5"+
		"\32\16\2\u00fe\u0100\3\2\2\2\u00ff\u00e3\3\2\2\2\u00ff\u00e6\3\2\2\2\u00ff"+
		"\u00e7\3\2\2\2\u00ff\u00eb\3\2\2\2\u00ff\u00ef\3\2\2\2\u00ff\u00f3\3\2"+
		"\2\2\u00ff\u00f7\3\2\2\2\u00ff\u00fb\3\2\2\2\u0100\u0109\3\2\2\2\u0101"+
		"\u0102\f\6\2\2\u0102\u0103\7\32\2\2\u0103\u0108\5\30\r\7\u0104\u0105\f"+
		"\5\2\2\u0105\u0106\7\33\2\2\u0106\u0108\5\30\r\6\u0107\u0101\3\2\2\2\u0107"+
		"\u0104\3\2\2\2\u0108\u010b\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u010a\3\2"+
		"\2\2\u010a\31\3\2\2\2\u010b\u0109\3\2\2\2\u010c\u010d\7%\2\2\u010d\u010e"+
		"\7*\2\2\u010e\u010f\7%\2\2\u010f\33\3\2\2\2\25\659;FHZj\177\u00a0\u00a8"+
		"\u00aa\u00b5\u00c0\u00ce\u00de\u00e0\u00ff\u0107\u0109";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}