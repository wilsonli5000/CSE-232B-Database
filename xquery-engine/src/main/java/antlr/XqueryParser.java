// Generated from /Users/wilsonli/IdeaProjects/xquery-engine/src/main/resources/Xquery.g4 by ANTLR 4.5.1
package src.main.java.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class XqueryParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, StringConstant=35, NUM=36, TXT=37, NAME=38, 
		WS=39;
	public static final int
		RULE_xq = 0, RULE_var = 1, RULE_forClause = 2, RULE_letClause = 3, RULE_whereClause = 4, 
		RULE_returnClause = 5, RULE_cond = 6, RULE_ap = 7, RULE_fname = 8, RULE_rp = 9, 
		RULE_fltr = 10, RULE_constant = 11;
	public static final String[] ruleNames = {
		"xq", "var", "forClause", "letClause", "whereClause", "returnClause", 
		"cond", "ap", "fname", "rp", "fltr", "constant"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'$'", "'('", "')'", "','", "'/'", "'//'", "'<'", "'>'", "'{'", 
		"'}'", "'for'", "'in'", "'let'", "':='", "'where'", "'return'", "'='", 
		"'eq'", "'=='", "'is'", "'empty'", "'some'", "'satisfies'", "'and'", "'or'", 
		"'not'", "'document(\"'", "'\"'", "'.'", "'@'", "'*'", "'..'", "'['", 
		"']'", null, null, "'text()'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, "StringConstant", 
		"NUM", "TXT", "NAME", "WS"
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
	public String getGrammarFileName() { return "Xquery.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public XqueryParser(TokenStream input) {
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
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterXQVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitXQVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitXQVariable(this);
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
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterXQAp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitXQAp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitXQAp(this);
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
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterXQWithPar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitXQWithPar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitXQWithPar(this);
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
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterFLWR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitFLWR(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitFLWR(this);
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
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterTwoXQ(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitTwoXQ(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitTwoXQ(this);
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
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterXQLet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitXQLet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitXQLet(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class XQStrConstContext extends XqContext {
		public TerminalNode StringConstant() { return getToken(XqueryParser.StringConstant, 0); }
		public XQStrConstContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterXQStrConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitXQStrConst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitXQStrConst(this);
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
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterXQRp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitXQRp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitXQRp(this);
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
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterXQRpAll(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitXQRpAll(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitXQRpAll(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class XQTagContext extends XqContext {
		public List<TerminalNode> NAME() { return getTokens(XqueryParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(XqueryParser.NAME, i);
		}
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public XQTagContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterXQTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitXQTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitXQTag(this);
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
			setState(55);
			switch (_input.LA(1)) {
			case T__12:
				{
				_localctx = new XQLetContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(25);
				letClause();
				setState(26);
				xq(1);
				}
				break;
			case T__0:
				{
				_localctx = new XQVariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(28);
				match(T__0);
				setState(29);
				var();
				}
				break;
			case StringConstant:
				{
				_localctx = new XQStrConstContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(30);
				match(StringConstant);
				}
				break;
			case T__26:
				{
				_localctx = new XQApContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(31);
				ap();
				}
				break;
			case T__1:
				{
				_localctx = new XQWithParContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(32);
				match(T__1);
				setState(33);
				xq(0);
				setState(34);
				match(T__2);
				}
				break;
			case T__6:
				{
				_localctx = new XQTagContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(36);
				match(T__6);
				setState(37);
				match(NAME);
				setState(38);
				match(T__7);
				setState(39);
				match(T__8);
				setState(40);
				xq(0);
				setState(41);
				match(T__9);
				setState(42);
				match(T__6);
				setState(43);
				match(T__4);
				setState(44);
				match(NAME);
				setState(45);
				match(T__7);
				}
				break;
			case T__10:
				{
				_localctx = new FLWRContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(47);
				forClause();
				setState(49);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(48);
					letClause();
					}
				}

				setState(51);
				whereClause();
				setState(53);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(52);
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
			setState(68);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(66);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new TwoXQContext(new XqContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_xq);
						setState(57);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(58);
						match(T__3);
						setState(59);
						xq(7);
						}
						break;
					case 2:
						{
						_localctx = new XQRpContext(new XqContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_xq);
						setState(60);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(61);
						match(T__4);
						setState(62);
						rp(0);
						}
						break;
					case 3:
						{
						_localctx = new XQRpAllContext(new XqContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_xq);
						setState(63);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(64);
						match(T__5);
						setState(65);
						rp(0);
						}
						break;
					}
					} 
				}
				setState(70);
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
		public TerminalNode NAME() { return getToken(XqueryParser.NAME, 0); }
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
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
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterForClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitForClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitForClause(this);
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
			setState(73);
			match(T__10);
			setState(74);
			match(T__0);
			setState(75);
			var();
			setState(76);
			match(T__11);
			setState(77);
			xq(0);
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(78);
				match(T__3);
				setState(79);
				match(T__0);
				setState(80);
				var();
				setState(81);
				match(T__11);
				setState(82);
				xq(0);
				}
				}
				setState(88);
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
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterLetClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitLetClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitLetClause(this);
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
			setState(89);
			match(T__12);
			setState(90);
			match(T__0);
			setState(91);
			var();
			setState(92);
			match(T__13);
			setState(93);
			xq(0);
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(94);
				match(T__3);
				setState(95);
				match(T__0);
				setState(96);
				var();
				setState(97);
				match(T__13);
				setState(98);
				xq(0);
				}
				}
				setState(104);
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
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterWhereClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitWhereClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitWhereClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(T__14);
			setState(106);
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
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterReturnClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitReturnClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitReturnClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnClauseContext returnClause() throws RecognitionException {
		ReturnClauseContext _localctx = new ReturnClauseContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_returnClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(T__15);
			setState(109);
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
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterXQCondEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitXQCondEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitXQCondEqual(this);
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
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterXQCondIs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitXQCondIs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitXQCondIs(this);
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
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterXQCondAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitXQCondAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitXQCondAnd(this);
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
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterXQCondNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitXQCondNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitXQCondNot(this);
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
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterXQCondEmpty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitXQCondEmpty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitXQCondEmpty(this);
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
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterXQCondSome(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitXQCondSome(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitXQCondSome(this);
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
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterXQCondOR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitXQCondOR(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitXQCondOR(this);
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
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterXQCondWithPar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitXQCondWithPar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitXQCondWithPar(this);
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
			setState(156);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				_localctx = new XQCondSomeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(112);
				match(T__21);
				setState(113);
				var();
				setState(114);
				match(T__11);
				setState(115);
				xq(0);
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(116);
					match(T__3);
					setState(117);
					var();
					setState(118);
					match(T__11);
					setState(119);
					xq(0);
					}
					}
					setState(125);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(126);
				match(T__22);
				setState(127);
				cond(5);
				}
				break;
			case 2:
				{
				_localctx = new XQCondNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(129);
				match(T__25);
				setState(130);
				cond(1);
				}
				break;
			case 3:
				{
				_localctx = new XQCondEqualContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(131);
				xq(0);
				setState(132);
				match(T__16);
				setState(133);
				xq(0);
				}
				break;
			case 4:
				{
				_localctx = new XQCondEqualContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(135);
				xq(0);
				setState(136);
				match(T__17);
				setState(137);
				xq(0);
				}
				break;
			case 5:
				{
				_localctx = new XQCondIsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(139);
				xq(0);
				setState(140);
				match(T__18);
				setState(141);
				xq(0);
				}
				break;
			case 6:
				{
				_localctx = new XQCondIsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(143);
				xq(0);
				setState(144);
				match(T__19);
				setState(145);
				xq(0);
				}
				break;
			case 7:
				{
				_localctx = new XQCondEmptyContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(147);
				match(T__20);
				setState(148);
				match(T__1);
				setState(149);
				xq(0);
				setState(150);
				match(T__2);
				}
				break;
			case 8:
				{
				_localctx = new XQCondWithParContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(152);
				match(T__1);
				setState(153);
				cond(0);
				setState(154);
				match(T__2);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(166);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(164);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new XQCondAndContext(new CondContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_cond);
						setState(158);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(159);
						match(T__23);
						setState(160);
						cond(4);
						}
						break;
					case 2:
						{
						_localctx = new XQCondORContext(new CondContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_cond);
						setState(161);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(162);
						match(T__24);
						setState(163);
						cond(3);
						}
						break;
					}
					} 
				}
				setState(168);
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
		public FnameContext fname() {
			return getRuleContext(FnameContext.class,0);
		}
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public APChildrenContext(ApContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterAPChildren(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitAPChildren(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitAPChildren(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class APAllContext extends ApContext {
		public FnameContext fname() {
			return getRuleContext(FnameContext.class,0);
		}
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public APAllContext(ApContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterAPAll(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitAPAll(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitAPAll(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ApContext ap() throws RecognitionException {
		ApContext _localctx = new ApContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ap);
		try {
			setState(183);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new APChildrenContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				match(T__26);
				setState(170);
				fname();
				setState(171);
				match(T__27);
				setState(172);
				match(T__2);
				setState(173);
				match(T__4);
				setState(174);
				rp(0);
				}
				break;
			case 2:
				_localctx = new APAllContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(176);
				match(T__26);
				setState(177);
				fname();
				setState(178);
				match(T__27);
				setState(179);
				match(T__2);
				setState(180);
				match(T__5);
				setState(181);
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

	public static class FnameContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(XqueryParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(XqueryParser.NAME, i);
		}
		public FnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterFname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitFname(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitFname(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FnameContext fname() throws RecognitionException {
		FnameContext _localctx = new FnameContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_fname);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(NAME);
			setState(188);
			_la = _input.LA(1);
			if (_la==T__28) {
				{
				setState(186);
				match(T__28);
				setState(187);
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
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterAllChildren(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitAllChildren(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitAllChildren(this);
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
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterRPChildren(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitRPChildren(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitRPChildren(this);
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
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterRPwithPar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitRPwithPar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitRPwithPar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TagNameContext extends RpContext {
		public TerminalNode NAME() { return getToken(XqueryParser.NAME, 0); }
		public TagNameContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterTagName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitTagName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitTagName(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AttributeContext extends RpContext {
		public TerminalNode NAME() { return getToken(XqueryParser.NAME, 0); }
		public AttributeContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitAttribute(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParentContext extends RpContext {
		public ParentContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterParent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitParent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitParent(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TextContext extends RpContext {
		public TerminalNode TXT() { return getToken(XqueryParser.TXT, 0); }
		public TextContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitText(this);
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
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterRPAll(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitRPAll(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitRPAll(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CurrentContext extends RpContext {
		public CurrentContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterCurrent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitCurrent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitCurrent(this);
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
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterTwoRP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitTwoRP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitTwoRP(this);
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
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterRPCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitRPCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitRPCondition(this);
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
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_rp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			switch (_input.LA(1)) {
			case NAME:
				{
				_localctx = new TagNameContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(191);
				match(NAME);
				}
				break;
			case T__29:
				{
				_localctx = new AttributeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(192);
				match(T__29);
				setState(193);
				match(NAME);
				}
				break;
			case T__30:
				{
				_localctx = new AllChildrenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(194);
				match(T__30);
				}
				break;
			case T__28:
				{
				_localctx = new CurrentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(195);
				match(T__28);
				}
				break;
			case T__31:
				{
				_localctx = new ParentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(196);
				match(T__31);
				}
				break;
			case TXT:
				{
				_localctx = new TextContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(197);
				match(TXT);
				}
				break;
			case T__1:
				{
				_localctx = new RPwithParContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(198);
				match(T__1);
				setState(199);
				rp(0);
				setState(200);
				match(T__2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(220);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(218);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new RPChildrenContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(204);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(205);
						match(T__4);
						setState(206);
						rp(5);
						}
						break;
					case 2:
						{
						_localctx = new RPAllContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(207);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(208);
						match(T__5);
						setState(209);
						rp(4);
						}
						break;
					case 3:
						{
						_localctx = new TwoRPContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(210);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(211);
						match(T__3);
						setState(212);
						rp(2);
						}
						break;
					case 4:
						{
						_localctx = new RPConditionContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(213);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(214);
						match(T__32);
						setState(215);
						fltr(0);
						setState(216);
						match(T__33);
						}
						break;
					}
					} 
				}
				setState(222);
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
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterFRPnot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitFRPnot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitFRPnot(this);
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
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterFRPwithPar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitFRPwithPar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitFRPwithPar(this);
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
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterFRPconst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitFRPconst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitFRPconst(this);
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
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterFRP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitFRP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitFRP(this);
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
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterFRPor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitFRPor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitFRPor(this);
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
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterFRPequal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitFRPequal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitFRPequal(this);
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
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterFRPis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitFRPis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitFRPis(this);
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
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterFRPand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitFRPand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitFRPand(this);
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
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_fltr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				_localctx = new FRPnotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(224);
				match(T__25);
				setState(225);
				fltr(2);
				}
				break;
			case 2:
				{
				_localctx = new FRPContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(226);
				rp(0);
				}
				break;
			case 3:
				{
				_localctx = new FRPequalContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(227);
				rp(0);
				setState(228);
				match(T__16);
				setState(229);
				rp(0);
				}
				break;
			case 4:
				{
				_localctx = new FRPequalContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(231);
				rp(0);
				setState(232);
				match(T__17);
				setState(233);
				rp(0);
				}
				break;
			case 5:
				{
				_localctx = new FRPisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(235);
				rp(0);
				setState(236);
				match(T__18);
				setState(237);
				rp(0);
				}
				break;
			case 6:
				{
				_localctx = new FRPisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(239);
				rp(0);
				setState(240);
				match(T__19);
				setState(241);
				rp(0);
				}
				break;
			case 7:
				{
				_localctx = new FRPwithParContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(243);
				match(T__1);
				setState(244);
				fltr(0);
				setState(245);
				match(T__2);
				}
				break;
			case 8:
				{
				_localctx = new FRPconstContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(247);
				rp(0);
				setState(248);
				match(T__16);
				setState(249);
				constant();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(261);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(259);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new FRPandContext(new FltrContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_fltr);
						setState(253);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(254);
						match(T__23);
						setState(255);
						fltr(5);
						}
						break;
					case 2:
						{
						_localctx = new FRPorContext(new FltrContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_fltr);
						setState(256);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(257);
						match(T__24);
						setState(258);
						fltr(4);
						}
						break;
					}
					} 
				}
				setState(263);
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
		public TerminalNode NAME() { return getToken(XqueryParser.NAME, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_constant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(T__27);
			setState(265);
			match(NAME);
			setState(266);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 0:
			return xq_sempred((XqContext)_localctx, predIndex);
		case 6:
			return cond_sempred((CondContext)_localctx, predIndex);
		case 9:
			return rp_sempred((RpContext)_localctx, predIndex);
		case 10:
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3)\u010f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\64\n\2\3\2\3\2"+
		"\5\28\n\2\5\2:\n\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2E\n\2\f\2\16"+
		"\2H\13\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4W\n\4"+
		"\f\4\16\4Z\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5g\n\5\f"+
		"\5\16\5j\13\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\7\b|\n\b\f\b\16\b\177\13\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\5\b\u009f\n\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u00a7\n\b\f"+
		"\b\16\b\u00aa\13\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\5\t\u00ba\n\t\3\n\3\n\3\n\5\n\u00bf\n\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00cd\n\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00dd\n\13\f\13"+
		"\16\13\u00e0\13\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00fe"+
		"\n\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u0106\n\f\f\f\16\f\u0109\13\f\3\r\3\r"+
		"\3\r\3\r\3\r\2\6\2\16\24\26\16\2\4\6\b\n\f\16\20\22\24\26\30\2\2\u012e"+
		"\29\3\2\2\2\4I\3\2\2\2\6K\3\2\2\2\b[\3\2\2\2\nk\3\2\2\2\fn\3\2\2\2\16"+
		"\u009e\3\2\2\2\20\u00b9\3\2\2\2\22\u00bb\3\2\2\2\24\u00cc\3\2\2\2\26\u00fd"+
		"\3\2\2\2\30\u010a\3\2\2\2\32\33\b\2\1\2\33\34\5\b\5\2\34\35\5\2\2\3\35"+
		":\3\2\2\2\36\37\7\3\2\2\37:\5\4\3\2 :\7%\2\2!:\5\20\t\2\"#\7\4\2\2#$\5"+
		"\2\2\2$%\7\5\2\2%:\3\2\2\2&\'\7\t\2\2\'(\7(\2\2()\7\n\2\2)*\7\13\2\2*"+
		"+\5\2\2\2+,\7\f\2\2,-\7\t\2\2-.\7\7\2\2./\7(\2\2/\60\7\n\2\2\60:\3\2\2"+
		"\2\61\63\5\6\4\2\62\64\5\b\5\2\63\62\3\2\2\2\63\64\3\2\2\2\64\65\3\2\2"+
		"\2\65\67\5\n\6\2\668\5\f\7\2\67\66\3\2\2\2\678\3\2\2\28:\3\2\2\29\32\3"+
		"\2\2\29\36\3\2\2\29 \3\2\2\29!\3\2\2\29\"\3\2\2\29&\3\2\2\29\61\3\2\2"+
		"\2:F\3\2\2\2;<\f\b\2\2<=\7\6\2\2=E\5\2\2\t>?\f\7\2\2?@\7\7\2\2@E\5\24"+
		"\13\2AB\f\6\2\2BC\7\b\2\2CE\5\24\13\2D;\3\2\2\2D>\3\2\2\2DA\3\2\2\2EH"+
		"\3\2\2\2FD\3\2\2\2FG\3\2\2\2G\3\3\2\2\2HF\3\2\2\2IJ\7(\2\2J\5\3\2\2\2"+
		"KL\7\r\2\2LM\7\3\2\2MN\5\4\3\2NO\7\16\2\2OX\5\2\2\2PQ\7\6\2\2QR\7\3\2"+
		"\2RS\5\4\3\2ST\7\16\2\2TU\5\2\2\2UW\3\2\2\2VP\3\2\2\2WZ\3\2\2\2XV\3\2"+
		"\2\2XY\3\2\2\2Y\7\3\2\2\2ZX\3\2\2\2[\\\7\17\2\2\\]\7\3\2\2]^\5\4\3\2^"+
		"_\7\20\2\2_h\5\2\2\2`a\7\6\2\2ab\7\3\2\2bc\5\4\3\2cd\7\20\2\2de\5\2\2"+
		"\2eg\3\2\2\2f`\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2\2\2i\t\3\2\2\2jh\3\2"+
		"\2\2kl\7\21\2\2lm\5\16\b\2m\13\3\2\2\2no\7\22\2\2op\5\2\2\2p\r\3\2\2\2"+
		"qr\b\b\1\2rs\7\30\2\2st\5\4\3\2tu\7\16\2\2u}\5\2\2\2vw\7\6\2\2wx\5\4\3"+
		"\2xy\7\16\2\2yz\5\2\2\2z|\3\2\2\2{v\3\2\2\2|\177\3\2\2\2}{\3\2\2\2}~\3"+
		"\2\2\2~\u0080\3\2\2\2\177}\3\2\2\2\u0080\u0081\7\31\2\2\u0081\u0082\5"+
		"\16\b\7\u0082\u009f\3\2\2\2\u0083\u0084\7\34\2\2\u0084\u009f\5\16\b\3"+
		"\u0085\u0086\5\2\2\2\u0086\u0087\7\23\2\2\u0087\u0088\5\2\2\2\u0088\u009f"+
		"\3\2\2\2\u0089\u008a\5\2\2\2\u008a\u008b\7\24\2\2\u008b\u008c\5\2\2\2"+
		"\u008c\u009f\3\2\2\2\u008d\u008e\5\2\2\2\u008e\u008f\7\25\2\2\u008f\u0090"+
		"\5\2\2\2\u0090\u009f\3\2\2\2\u0091\u0092\5\2\2\2\u0092\u0093\7\26\2\2"+
		"\u0093\u0094\5\2\2\2\u0094\u009f\3\2\2\2\u0095\u0096\7\27\2\2\u0096\u0097"+
		"\7\4\2\2\u0097\u0098\5\2\2\2\u0098\u0099\7\5\2\2\u0099\u009f\3\2\2\2\u009a"+
		"\u009b\7\4\2\2\u009b\u009c\5\16\b\2\u009c\u009d\7\5\2\2\u009d\u009f\3"+
		"\2\2\2\u009eq\3\2\2\2\u009e\u0083\3\2\2\2\u009e\u0085\3\2\2\2\u009e\u0089"+
		"\3\2\2\2\u009e\u008d\3\2\2\2\u009e\u0091\3\2\2\2\u009e\u0095\3\2\2\2\u009e"+
		"\u009a\3\2\2\2\u009f\u00a8\3\2\2\2\u00a0\u00a1\f\5\2\2\u00a1\u00a2\7\32"+
		"\2\2\u00a2\u00a7\5\16\b\6\u00a3\u00a4\f\4\2\2\u00a4\u00a5\7\33\2\2\u00a5"+
		"\u00a7\5\16\b\5\u00a6\u00a0\3\2\2\2\u00a6\u00a3\3\2\2\2\u00a7\u00aa\3"+
		"\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\17\3\2\2\2\u00aa"+
		"\u00a8\3\2\2\2\u00ab\u00ac\7\35\2\2\u00ac\u00ad\5\22\n\2\u00ad\u00ae\7"+
		"\36\2\2\u00ae\u00af\7\5\2\2\u00af\u00b0\7\7\2\2\u00b0\u00b1\5\24\13\2"+
		"\u00b1\u00ba\3\2\2\2\u00b2\u00b3\7\35\2\2\u00b3\u00b4\5\22\n\2\u00b4\u00b5"+
		"\7\36\2\2\u00b5\u00b6\7\5\2\2\u00b6\u00b7\7\b\2\2\u00b7\u00b8\5\24\13"+
		"\2\u00b8\u00ba\3\2\2\2\u00b9\u00ab\3\2\2\2\u00b9\u00b2\3\2\2\2\u00ba\21"+
		"\3\2\2\2\u00bb\u00be\7(\2\2\u00bc\u00bd\7\37\2\2\u00bd\u00bf\7(\2\2\u00be"+
		"\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\23\3\2\2\2\u00c0\u00c1\b\13\1"+
		"\2\u00c1\u00cd\7(\2\2\u00c2\u00c3\7 \2\2\u00c3\u00cd\7(\2\2\u00c4\u00cd"+
		"\7!\2\2\u00c5\u00cd\7\37\2\2\u00c6\u00cd\7\"\2\2\u00c7\u00cd\7\'\2\2\u00c8"+
		"\u00c9\7\4\2\2\u00c9\u00ca\5\24\13\2\u00ca\u00cb\7\5\2\2\u00cb\u00cd\3"+
		"\2\2\2\u00cc\u00c0\3\2\2\2\u00cc\u00c2\3\2\2\2\u00cc\u00c4\3\2\2\2\u00cc"+
		"\u00c5\3\2\2\2\u00cc\u00c6\3\2\2\2\u00cc\u00c7\3\2\2\2\u00cc\u00c8\3\2"+
		"\2\2\u00cd\u00de\3\2\2\2\u00ce\u00cf\f\6\2\2\u00cf\u00d0\7\7\2\2\u00d0"+
		"\u00dd\5\24\13\7\u00d1\u00d2\f\5\2\2\u00d2\u00d3\7\b\2\2\u00d3\u00dd\5"+
		"\24\13\6\u00d4\u00d5\f\3\2\2\u00d5\u00d6\7\6\2\2\u00d6\u00dd\5\24\13\4"+
		"\u00d7\u00d8\f\4\2\2\u00d8\u00d9\7#\2\2\u00d9\u00da\5\26\f\2\u00da\u00db"+
		"\7$\2\2\u00db\u00dd\3\2\2\2\u00dc\u00ce\3\2\2\2\u00dc\u00d1\3\2\2\2\u00dc"+
		"\u00d4\3\2\2\2\u00dc\u00d7\3\2\2\2\u00dd\u00e0\3\2\2\2\u00de\u00dc\3\2"+
		"\2\2\u00de\u00df\3\2\2\2\u00df\25\3\2\2\2\u00e0\u00de\3\2\2\2\u00e1\u00e2"+
		"\b\f\1\2\u00e2\u00e3\7\34\2\2\u00e3\u00fe\5\26\f\4\u00e4\u00fe\5\24\13"+
		"\2\u00e5\u00e6\5\24\13\2\u00e6\u00e7\7\23\2\2\u00e7\u00e8\5\24\13\2\u00e8"+
		"\u00fe\3\2\2\2\u00e9\u00ea\5\24\13\2\u00ea\u00eb\7\24\2\2\u00eb\u00ec"+
		"\5\24\13\2\u00ec\u00fe\3\2\2\2\u00ed\u00ee\5\24\13\2\u00ee\u00ef\7\25"+
		"\2\2\u00ef\u00f0\5\24\13\2\u00f0\u00fe\3\2\2\2\u00f1\u00f2\5\24\13\2\u00f2"+
		"\u00f3\7\26\2\2\u00f3\u00f4\5\24\13\2\u00f4\u00fe\3\2\2\2\u00f5\u00f6"+
		"\7\4\2\2\u00f6\u00f7\5\26\f\2\u00f7\u00f8\7\5\2\2\u00f8\u00fe\3\2\2\2"+
		"\u00f9\u00fa\5\24\13\2\u00fa\u00fb\7\23\2\2\u00fb\u00fc\5\30\r\2\u00fc"+
		"\u00fe\3\2\2\2\u00fd\u00e1\3\2\2\2\u00fd\u00e4\3\2\2\2\u00fd\u00e5\3\2"+
		"\2\2\u00fd\u00e9\3\2\2\2\u00fd\u00ed\3\2\2\2\u00fd\u00f1\3\2\2\2\u00fd"+
		"\u00f5\3\2\2\2\u00fd\u00f9\3\2\2\2\u00fe\u0107\3\2\2\2\u00ff\u0100\f\6"+
		"\2\2\u0100\u0101\7\32\2\2\u0101\u0106\5\26\f\7\u0102\u0103\f\5\2\2\u0103"+
		"\u0104\7\33\2\2\u0104\u0106\5\26\f\6\u0105\u00ff\3\2\2\2\u0105\u0102\3"+
		"\2\2\2\u0106\u0109\3\2\2\2\u0107\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108"+
		"\27\3\2\2\2\u0109\u0107\3\2\2\2\u010a\u010b\7\36\2\2\u010b\u010c\7(\2"+
		"\2\u010c\u010d\7\36\2\2\u010d\31\3\2\2\2\25\63\679DFXh}\u009e\u00a6\u00a8"+
		"\u00b9\u00be\u00cc\u00dc\u00de\u00fd\u0105\u0107";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}