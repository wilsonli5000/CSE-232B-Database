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
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, NUM=23, DOC=24, TXT=25, 
		NAME=26, OPAR=27, CPAR=28, OBRAC=29, CBRAC=30, DOT=31, DDOT=32, COMMA=33, 
		AT=34, PATH=35, DPATH=36, STAR=37, EQUL=38, DEQUL=39, NEWLINE=40, WS=41, 
		SCONST=42;
	public static final int
		RULE_ap = 0, RULE_doc = 1, RULE_fname = 2, RULE_rp = 3, RULE_fltr = 4, 
		RULE_constant = 5, RULE_prog = 6, RULE_xq = 7, RULE_vlist = 8, RULE_var = 9, 
		RULE_forClause = 10, RULE_letClause = 11, RULE_whereClause = 12, RULE_returnClause = 13, 
		RULE_cond = 14;
	public static final String[] ruleNames = {
		"ap", "doc", "fname", "rp", "fltr", "constant", "prog", "xq", "vlist", 
		"var", "forClause", "letClause", "whereClause", "returnClause", "cond"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'\"'", "'eq'", "'is'", "'and'", "'or'", "'not'", "'$'", "'<'", 
		"'>'", "'{'", "'}'", "'</'", "'join('", "'for'", "'in'", "'let'", "':='", 
		"'where'", "'return'", "'empty'", "'some'", "'satisfies'", null, "'document'", 
		"'text()'", null, "'('", "')'", "'['", "']'", "'.'", "'..'", "','", "'@'", 
		"'/'", "'//'", "'*'", "'='", "'=='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, "NUM", 
		"DOC", "TXT", "NAME", "OPAR", "CPAR", "OBRAC", "CBRAC", "DOT", "DDOT", 
		"COMMA", "AT", "PATH", "DPATH", "STAR", "EQUL", "DEQUL", "NEWLINE", "WS", 
		"SCONST"
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
		public DocContext doc() {
			return getRuleContext(DocContext.class,0);
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
		enterRule(_localctx, 0, RULE_ap);
		try {
			setState(38);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				_localctx = new APChildrenContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(30);
				doc();
				setState(31);
				match(PATH);
				setState(32);
				rp(0);
				}
				break;
			case 2:
				_localctx = new APAllContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(34);
				doc();
				setState(35);
				match(DPATH);
				setState(36);
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
		public TerminalNode DOC() { return getToken(XqueryParser.DOC, 0); }
		public FnameContext fname() {
			return getRuleContext(FnameContext.class,0);
		}
		public DocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterDoc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitDoc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitDoc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DocContext doc() throws RecognitionException {
		DocContext _localctx = new DocContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_doc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(DOC);
			setState(41);
			match(OPAR);
			setState(42);
			match(T__0);
			setState(43);
			fname();
			setState(44);
			match(T__0);
			setState(45);
			match(CPAR);
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
		enterRule(_localctx, 4, RULE_fname);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(NAME);
			setState(50);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(48);
				match(DOT);
				setState(49);
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
	public static class RPindexContext extends RpContext {
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public TerminalNode NUM() { return getToken(XqueryParser.NUM, 0); }
		public RPindexContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterRPindex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitRPindex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitRPindex(this);
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
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_rp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			switch (_input.LA(1)) {
			case NAME:
				{
				_localctx = new TagNameContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(53);
				match(NAME);
				}
				break;
			case AT:
				{
				_localctx = new AttributeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(54);
				match(AT);
				setState(55);
				match(NAME);
				}
				break;
			case STAR:
				{
				_localctx = new AllChildrenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(56);
				match(STAR);
				}
				break;
			case DOT:
				{
				_localctx = new CurrentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(57);
				match(DOT);
				}
				break;
			case DDOT:
				{
				_localctx = new ParentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(58);
				match(DDOT);
				}
				break;
			case TXT:
				{
				_localctx = new TextContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(59);
				match(TXT);
				}
				break;
			case OPAR:
				{
				_localctx = new RPwithParContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(60);
				match(OPAR);
				setState(61);
				rp(0);
				setState(62);
				match(CPAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(86);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(84);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new RPChildrenContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(66);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(67);
						match(PATH);
						setState(68);
						rp(6);
						}
						break;
					case 2:
						{
						_localctx = new RPAllContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(69);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(70);
						match(DPATH);
						setState(71);
						rp(5);
						}
						break;
					case 3:
						{
						_localctx = new TwoRPContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(72);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(73);
						match(COMMA);
						setState(74);
						rp(3);
						}
						break;
					case 4:
						{
						_localctx = new RPConditionContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(75);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(76);
						match(OBRAC);
						setState(77);
						fltr(0);
						setState(78);
						match(CBRAC);
						}
						break;
					case 5:
						{
						_localctx = new RPindexContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(80);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(81);
						match(OBRAC);
						setState(82);
						match(NUM);
						setState(83);
						match(CBRAC);
						}
						break;
					}
					} 
				}
				setState(88);
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
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_fltr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				_localctx = new FRPnotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(90);
				match(T__5);
				setState(91);
				fltr(2);
				}
				break;
			case 2:
				{
				_localctx = new FRPContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(92);
				rp(0);
				}
				break;
			case 3:
				{
				_localctx = new FRPequalContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(93);
				rp(0);
				setState(94);
				match(EQUL);
				setState(95);
				rp(0);
				}
				break;
			case 4:
				{
				_localctx = new FRPequalContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(97);
				rp(0);
				setState(98);
				match(T__1);
				setState(99);
				rp(0);
				}
				break;
			case 5:
				{
				_localctx = new FRPisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(101);
				rp(0);
				setState(102);
				match(DEQUL);
				setState(103);
				rp(0);
				}
				break;
			case 6:
				{
				_localctx = new FRPisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(105);
				rp(0);
				setState(106);
				match(T__2);
				setState(107);
				rp(0);
				}
				break;
			case 7:
				{
				_localctx = new FRPwithParContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(109);
				match(OPAR);
				setState(110);
				fltr(0);
				setState(111);
				match(CPAR);
				}
				break;
			case 8:
				{
				_localctx = new FRPconstContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(113);
				rp(0);
				setState(114);
				match(EQUL);
				setState(115);
				constant();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(127);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(125);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new FRPandContext(new FltrContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_fltr);
						setState(119);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(120);
						match(T__3);
						setState(121);
						fltr(5);
						}
						break;
					case 2:
						{
						_localctx = new FRPorContext(new FltrContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_fltr);
						setState(122);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(123);
						match(T__4);
						setState(124);
						fltr(4);
						}
						break;
					}
					} 
				}
				setState(129);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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
		enterRule(_localctx, 10, RULE_constant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(T__0);
			setState(131);
			match(NAME);
			setState(132);
			match(T__0);
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

	public static class ProgContext extends ParserRuleContext {
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(XqueryParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(XqueryParser.NEWLINE, i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			xq(0);
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(135);
				match(NEWLINE);
				}
				}
				setState(140);
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
	public static class XQAPContext extends XqContext {
		public ApContext ap() {
			return getRuleContext(ApContext.class,0);
		}
		public XQAPContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterXQAP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitXQAP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitXQAP(this);
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
		public List<TerminalNode> NEWLINE() { return getTokens(XqueryParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(XqueryParser.NEWLINE, i);
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
	public static class VariableContext extends XqContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public VariableContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringConstContext extends XqContext {
		public TerminalNode SCONST() { return getToken(XqueryParser.SCONST, 0); }
		public StringConstContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterStringConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitStringConst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitStringConst(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class XQueryContext extends XqContext {
		public ForClauseContext forClause() {
			return getRuleContext(ForClauseContext.class,0);
		}
		public ReturnClauseContext returnClause() {
			return getRuleContext(ReturnClauseContext.class,0);
		}
		public LetClauseContext letClause() {
			return getRuleContext(LetClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public XQueryContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterXQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitXQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitXQuery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class XQwithParContext extends XqContext {
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public XQwithParContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterXQwithPar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitXQwithPar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitXQwithPar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class JoinContext extends XqContext {
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public List<VlistContext> vlist() {
			return getRuleContexts(VlistContext.class);
		}
		public VlistContext vlist(int i) {
			return getRuleContext(VlistContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(XqueryParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(XqueryParser.NEWLINE, i);
		}
		public JoinContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterJoin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitJoin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitJoin(this);
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
	public static class XQRPallContext extends XqContext {
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public XQRPallContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterXQRPall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitXQRPall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitXQRPall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class XQRPContext extends XqContext {
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public XQRPContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterXQRP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitXQRP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitXQRP(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ResultContext extends XqContext {
		public List<TerminalNode> NAME() { return getTokens(XqueryParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(XqueryParser.NAME, i);
		}
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(XqueryParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(XqueryParser.NEWLINE, i);
		}
		public ResultContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterResult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitResult(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitResult(this);
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
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_xq, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			switch (_input.LA(1)) {
			case T__15:
				{
				_localctx = new XQLetContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(142);
				letClause();
				setState(143);
				xq(2);
				}
				break;
			case T__6:
				{
				_localctx = new VariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(145);
				match(T__6);
				setState(146);
				var();
				}
				break;
			case SCONST:
				{
				_localctx = new StringConstContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(147);
				match(SCONST);
				}
				break;
			case DOC:
				{
				_localctx = new XQAPContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(148);
				ap();
				}
				break;
			case OPAR:
				{
				_localctx = new XQwithParContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(149);
				match(OPAR);
				setState(150);
				xq(0);
				setState(151);
				match(CPAR);
				}
				break;
			case T__7:
				{
				_localctx = new ResultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(153);
				match(T__7);
				setState(154);
				match(NAME);
				setState(155);
				match(T__8);
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(156);
					match(NEWLINE);
					}
					}
					setState(161);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(162);
				match(T__9);
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(163);
					match(NEWLINE);
					}
					}
					setState(168);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(169);
				xq(0);
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(170);
					match(NEWLINE);
					}
					}
					setState(175);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(176);
				match(T__10);
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(177);
					match(NEWLINE);
					}
					}
					setState(182);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(183);
				match(T__11);
				setState(184);
				match(NAME);
				setState(185);
				match(T__8);
				}
				break;
			case T__13:
				{
				_localctx = new XQueryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(187);
				forClause();
				setState(189);
				_la = _input.LA(1);
				if (_la==T__15) {
					{
					setState(188);
					letClause();
					}
				}

				setState(192);
				_la = _input.LA(1);
				if (_la==T__17) {
					{
					setState(191);
					whereClause();
					}
				}

				setState(194);
				returnClause();
				}
				break;
			case T__12:
				{
				_localctx = new JoinContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(196);
				match(T__12);
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(197);
					match(NEWLINE);
					}
					}
					setState(202);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(203);
				xq(0);
				setState(204);
				match(COMMA);
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(205);
					match(NEWLINE);
					}
					}
					setState(210);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(211);
				xq(0);
				setState(212);
				match(COMMA);
				setState(216);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(213);
					match(NEWLINE);
					}
					}
					setState(218);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(219);
				vlist();
				setState(220);
				match(COMMA);
				setState(221);
				vlist();
				setState(225);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(222);
					match(NEWLINE);
					}
					}
					setState(227);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(228);
				match(CPAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(249);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(247);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						_localctx = new TwoXQContext(new XqContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_xq);
						setState(232);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(233);
						match(COMMA);
						setState(237);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NEWLINE) {
							{
							{
							setState(234);
							match(NEWLINE);
							}
							}
							setState(239);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(240);
						xq(6);
						}
						break;
					case 2:
						{
						_localctx = new XQRPContext(new XqContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_xq);
						setState(241);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(242);
						match(PATH);
						setState(243);
						rp(0);
						}
						break;
					case 3:
						{
						_localctx = new XQRPallContext(new XqContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_xq);
						setState(244);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(245);
						match(DPATH);
						setState(246);
						rp(0);
						}
						break;
					}
					} 
				}
				setState(251);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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

	public static class VlistContext extends ParserRuleContext {
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public VlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterVlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitVlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitVlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VlistContext vlist() throws RecognitionException {
		VlistContext _localctx = new VlistContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_vlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			match(OBRAC);
			setState(253);
			var();
			setState(258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(254);
				match(COMMA);
				setState(255);
				var();
				}
				}
				setState(260);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(261);
			match(CBRAC);
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
		enterRule(_localctx, 18, RULE_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
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
		public List<TerminalNode> NEWLINE() { return getTokens(XqueryParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(XqueryParser.NEWLINE, i);
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
		enterRule(_localctx, 20, RULE_forClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			match(T__13);
			setState(266);
			match(T__6);
			setState(267);
			var();
			setState(268);
			match(T__14);
			setState(269);
			xq(0);
			setState(284);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(270);
				match(COMMA);
				setState(274);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(271);
					match(NEWLINE);
					}
					}
					setState(276);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(277);
				match(T__6);
				setState(278);
				var();
				setState(279);
				match(T__14);
				setState(280);
				xq(0);
				}
				}
				setState(286);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(287);
				match(NEWLINE);
				}
				}
				setState(292);
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
		public List<TerminalNode> NEWLINE() { return getTokens(XqueryParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(XqueryParser.NEWLINE, i);
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
		enterRule(_localctx, 22, RULE_letClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			match(T__15);
			setState(294);
			match(T__6);
			setState(295);
			var();
			setState(296);
			match(T__16);
			setState(297);
			xq(0);
			setState(312);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(298);
				match(COMMA);
				setState(302);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(299);
					match(NEWLINE);
					}
					}
					setState(304);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(305);
				match(T__6);
				setState(306);
				var();
				setState(307);
				match(T__16);
				setState(308);
				xq(0);
				}
				}
				setState(314);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(318);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(315);
				match(NEWLINE);
				}
				}
				setState(320);
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
		public List<TerminalNode> NEWLINE() { return getTokens(XqueryParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(XqueryParser.NEWLINE, i);
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
		enterRule(_localctx, 24, RULE_whereClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			match(T__17);
			setState(322);
			cond(0);
			setState(326);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(323);
				match(NEWLINE);
				}
				}
				setState(328);
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

	public static class ReturnClauseContext extends ParserRuleContext {
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(XqueryParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(XqueryParser.NEWLINE, i);
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
		enterRule(_localctx, 26, RULE_returnClause);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			match(T__18);
			setState(333);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(330);
				match(NEWLINE);
				}
				}
				setState(335);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(336);
			xq(0);
			setState(346);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(340);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NEWLINE) {
						{
						{
						setState(337);
						match(NEWLINE);
						}
						}
						setState(342);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(343);
					xq(0);
					}
					} 
				}
				setState(348);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
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
	public static class CondorContext extends CondContext {
		public List<CondContext> cond() {
			return getRuleContexts(CondContext.class);
		}
		public CondContext cond(int i) {
			return getRuleContext(CondContext.class,i);
		}
		public CondorContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterCondor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitCondor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitCondor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CondequalContext extends CondContext {
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public CondequalContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterCondequal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitCondequal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitCondequal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CondSomeContext extends CondContext {
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
		public CondSomeContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterCondSome(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitCondSome(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitCondSome(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CondEmptyContext extends CondContext {
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(XqueryParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(XqueryParser.NEWLINE, i);
		}
		public CondEmptyContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterCondEmpty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitCondEmpty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitCondEmpty(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CondisContext extends CondContext {
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public CondisContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterCondis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitCondis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitCondis(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CondnotContext extends CondContext {
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public CondnotContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterCondnot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitCondnot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitCondnot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CondwithParContext extends CondContext {
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public CondwithParContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterCondwithPar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitCondwithPar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitCondwithPar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CondandContext extends CondContext {
		public List<CondContext> cond() {
			return getRuleContexts(CondContext.class);
		}
		public CondContext cond(int i) {
			return getRuleContext(CondContext.class,i);
		}
		public CondandContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterCondand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitCondand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitCondand(this);
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
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_cond, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				_localctx = new CondSomeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(350);
				match(T__20);
				setState(351);
				var();
				setState(352);
				match(T__14);
				setState(353);
				xq(0);
				setState(361);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(354);
					match(COMMA);
					setState(355);
					var();
					setState(356);
					match(T__14);
					setState(357);
					xq(0);
					}
					}
					setState(363);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(364);
				match(T__21);
				setState(365);
				cond(5);
				}
				break;
			case 2:
				{
				_localctx = new CondnotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(367);
				match(T__5);
				setState(368);
				cond(1);
				}
				break;
			case 3:
				{
				_localctx = new CondequalContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(369);
				xq(0);
				setState(370);
				match(EQUL);
				setState(371);
				xq(0);
				}
				break;
			case 4:
				{
				_localctx = new CondequalContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(373);
				xq(0);
				setState(374);
				match(T__1);
				setState(375);
				xq(0);
				}
				break;
			case 5:
				{
				_localctx = new CondisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(377);
				xq(0);
				setState(378);
				match(DEQUL);
				setState(379);
				xq(0);
				}
				break;
			case 6:
				{
				_localctx = new CondisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(381);
				xq(0);
				setState(382);
				match(T__2);
				setState(383);
				xq(0);
				}
				break;
			case 7:
				{
				_localctx = new CondEmptyContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(385);
				match(T__19);
				setState(389);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(386);
					match(NEWLINE);
					}
					}
					setState(391);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(392);
				match(OPAR);
				setState(396);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(393);
					match(NEWLINE);
					}
					}
					setState(398);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(399);
				xq(0);
				setState(403);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(400);
					match(NEWLINE);
					}
					}
					setState(405);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(406);
				match(CPAR);
				}
				break;
			case 8:
				{
				_localctx = new CondwithParContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(408);
				match(OPAR);
				setState(409);
				cond(0);
				setState(410);
				match(CPAR);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(422);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(420);
					switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
					case 1:
						{
						_localctx = new CondandContext(new CondContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_cond);
						setState(414);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(415);
						match(T__3);
						setState(416);
						cond(4);
						}
						break;
					case 2:
						{
						_localctx = new CondorContext(new CondContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_cond);
						setState(417);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(418);
						match(T__4);
						setState(419);
						cond(3);
						}
						break;
					}
					} 
				}
				setState(424);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return rp_sempred((RpContext)_localctx, predIndex);
		case 4:
			return fltr_sempred((FltrContext)_localctx, predIndex);
		case 7:
			return xq_sempred((XqContext)_localctx, predIndex);
		case 14:
			return cond_sempred((CondContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean rp_sempred(RpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 2);
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean fltr_sempred(FltrContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 4);
		case 6:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean xq_sempred(XqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 5);
		case 8:
			return precpred(_ctx, 7);
		case 9:
			return precpred(_ctx, 6);
		}
		return true;
	}
	private boolean cond_sempred(CondContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 3);
		case 11:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3,\u01ac\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\5\2)\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\5\4\65\n"+
		"\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5C\n\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5W\n"+
		"\5\f\5\16\5Z\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6x\n\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u0080\n\6\f\6\16\6\u0083\13\6\3\7\3\7\3\7"+
		"\3\7\3\b\3\b\7\b\u008b\n\b\f\b\16\b\u008e\13\b\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00a0\n\t\f\t\16\t\u00a3"+
		"\13\t\3\t\3\t\7\t\u00a7\n\t\f\t\16\t\u00aa\13\t\3\t\3\t\7\t\u00ae\n\t"+
		"\f\t\16\t\u00b1\13\t\3\t\3\t\7\t\u00b5\n\t\f\t\16\t\u00b8\13\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\5\t\u00c0\n\t\3\t\5\t\u00c3\n\t\3\t\3\t\3\t\3\t\7\t\u00c9"+
		"\n\t\f\t\16\t\u00cc\13\t\3\t\3\t\3\t\7\t\u00d1\n\t\f\t\16\t\u00d4\13\t"+
		"\3\t\3\t\3\t\7\t\u00d9\n\t\f\t\16\t\u00dc\13\t\3\t\3\t\3\t\3\t\7\t\u00e2"+
		"\n\t\f\t\16\t\u00e5\13\t\3\t\3\t\5\t\u00e9\n\t\3\t\3\t\3\t\7\t\u00ee\n"+
		"\t\f\t\16\t\u00f1\13\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00fa\n\t\f\t\16"+
		"\t\u00fd\13\t\3\n\3\n\3\n\3\n\7\n\u0103\n\n\f\n\16\n\u0106\13\n\3\n\3"+
		"\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u0113\n\f\f\f\16\f\u0116"+
		"\13\f\3\f\3\f\3\f\3\f\3\f\7\f\u011d\n\f\f\f\16\f\u0120\13\f\3\f\7\f\u0123"+
		"\n\f\f\f\16\f\u0126\13\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u012f\n\r\f\r"+
		"\16\r\u0132\13\r\3\r\3\r\3\r\3\r\3\r\7\r\u0139\n\r\f\r\16\r\u013c\13\r"+
		"\3\r\7\r\u013f\n\r\f\r\16\r\u0142\13\r\3\16\3\16\3\16\7\16\u0147\n\16"+
		"\f\16\16\16\u014a\13\16\3\17\3\17\7\17\u014e\n\17\f\17\16\17\u0151\13"+
		"\17\3\17\3\17\7\17\u0155\n\17\f\17\16\17\u0158\13\17\3\17\7\17\u015b\n"+
		"\17\f\17\16\17\u015e\13\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\7\20\u016a\n\20\f\20\16\20\u016d\13\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\7\20\u0186\n\20\f\20\16\20\u0189\13\20\3\20\3\20"+
		"\7\20\u018d\n\20\f\20\16\20\u0190\13\20\3\20\3\20\7\20\u0194\n\20\f\20"+
		"\16\20\u0197\13\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u019f\n\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\7\20\u01a7\n\20\f\20\16\20\u01aa\13\20\3\20"+
		"\2\6\b\n\20\36\21\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36\2\2\u01e0\2("+
		"\3\2\2\2\4*\3\2\2\2\6\61\3\2\2\2\bB\3\2\2\2\nw\3\2\2\2\f\u0084\3\2\2\2"+
		"\16\u0088\3\2\2\2\20\u00e8\3\2\2\2\22\u00fe\3\2\2\2\24\u0109\3\2\2\2\26"+
		"\u010b\3\2\2\2\30\u0127\3\2\2\2\32\u0143\3\2\2\2\34\u014b\3\2\2\2\36\u019e"+
		"\3\2\2\2 !\5\4\3\2!\"\7%\2\2\"#\5\b\5\2#)\3\2\2\2$%\5\4\3\2%&\7&\2\2&"+
		"\'\5\b\5\2\')\3\2\2\2( \3\2\2\2($\3\2\2\2)\3\3\2\2\2*+\7\32\2\2+,\7\35"+
		"\2\2,-\7\3\2\2-.\5\6\4\2./\7\3\2\2/\60\7\36\2\2\60\5\3\2\2\2\61\64\7\34"+
		"\2\2\62\63\7!\2\2\63\65\7\34\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65\7\3\2"+
		"\2\2\66\67\b\5\1\2\67C\7\34\2\289\7$\2\29C\7\34\2\2:C\7\'\2\2;C\7!\2\2"+
		"<C\7\"\2\2=C\7\33\2\2>?\7\35\2\2?@\5\b\5\2@A\7\36\2\2AC\3\2\2\2B\66\3"+
		"\2\2\2B8\3\2\2\2B:\3\2\2\2B;\3\2\2\2B<\3\2\2\2B=\3\2\2\2B>\3\2\2\2CX\3"+
		"\2\2\2DE\f\7\2\2EF\7%\2\2FW\5\b\5\bGH\f\6\2\2HI\7&\2\2IW\5\b\5\7JK\f\4"+
		"\2\2KL\7#\2\2LW\5\b\5\5MN\f\5\2\2NO\7\37\2\2OP\5\n\6\2PQ\7 \2\2QW\3\2"+
		"\2\2RS\f\3\2\2ST\7\37\2\2TU\7\31\2\2UW\7 \2\2VD\3\2\2\2VG\3\2\2\2VJ\3"+
		"\2\2\2VM\3\2\2\2VR\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y\t\3\2\2\2ZX"+
		"\3\2\2\2[\\\b\6\1\2\\]\7\b\2\2]x\5\n\6\4^x\5\b\5\2_`\5\b\5\2`a\7(\2\2"+
		"ab\5\b\5\2bx\3\2\2\2cd\5\b\5\2de\7\4\2\2ef\5\b\5\2fx\3\2\2\2gh\5\b\5\2"+
		"hi\7)\2\2ij\5\b\5\2jx\3\2\2\2kl\5\b\5\2lm\7\5\2\2mn\5\b\5\2nx\3\2\2\2"+
		"op\7\35\2\2pq\5\n\6\2qr\7\36\2\2rx\3\2\2\2st\5\b\5\2tu\7(\2\2uv\5\f\7"+
		"\2vx\3\2\2\2w[\3\2\2\2w^\3\2\2\2w_\3\2\2\2wc\3\2\2\2wg\3\2\2\2wk\3\2\2"+
		"\2wo\3\2\2\2ws\3\2\2\2x\u0081\3\2\2\2yz\f\6\2\2z{\7\6\2\2{\u0080\5\n\6"+
		"\7|}\f\5\2\2}~\7\7\2\2~\u0080\5\n\6\6\177y\3\2\2\2\177|\3\2\2\2\u0080"+
		"\u0083\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\13\3\2\2\2"+
		"\u0083\u0081\3\2\2\2\u0084\u0085\7\3\2\2\u0085\u0086\7\34\2\2\u0086\u0087"+
		"\7\3\2\2\u0087\r\3\2\2\2\u0088\u008c\5\20\t\2\u0089\u008b\7*\2\2\u008a"+
		"\u0089\3\2\2\2\u008b\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2"+
		"\2\2\u008d\17\3\2\2\2\u008e\u008c\3\2\2\2\u008f\u0090\b\t\1\2\u0090\u0091"+
		"\5\30\r\2\u0091\u0092\5\20\t\4\u0092\u00e9\3\2\2\2\u0093\u0094\7\t\2\2"+
		"\u0094\u00e9\5\24\13\2\u0095\u00e9\7,\2\2\u0096\u00e9\5\2\2\2\u0097\u0098"+
		"\7\35\2\2\u0098\u0099\5\20\t\2\u0099\u009a\7\36\2\2\u009a\u00e9\3\2\2"+
		"\2\u009b\u009c\7\n\2\2\u009c\u009d\7\34\2\2\u009d\u00a1\7\13\2\2\u009e"+
		"\u00a0\7*\2\2\u009f\u009e\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f\3\2"+
		"\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a4\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4"+
		"\u00a8\7\f\2\2\u00a5\u00a7\7*\2\2\u00a6\u00a5\3\2\2\2\u00a7\u00aa\3\2"+
		"\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00ab\3\2\2\2\u00aa"+
		"\u00a8\3\2\2\2\u00ab\u00af\5\20\t\2\u00ac\u00ae\7*\2\2\u00ad\u00ac\3\2"+
		"\2\2\u00ae\u00b1\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0"+
		"\u00b2\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2\u00b6\7\r\2\2\u00b3\u00b5\7*"+
		"\2\2\u00b4\u00b3\3\2\2\2\u00b5\u00b8\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6"+
		"\u00b7\3\2\2\2\u00b7\u00b9\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b9\u00ba\7\16"+
		"\2\2\u00ba\u00bb\7\34\2\2\u00bb\u00bc\7\13\2\2\u00bc\u00e9\3\2\2\2\u00bd"+
		"\u00bf\5\26\f\2\u00be\u00c0\5\30\r\2\u00bf\u00be\3\2\2\2\u00bf\u00c0\3"+
		"\2\2\2\u00c0\u00c2\3\2\2\2\u00c1\u00c3\5\32\16\2\u00c2\u00c1\3\2\2\2\u00c2"+
		"\u00c3\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c5\5\34\17\2\u00c5\u00e9\3"+
		"\2\2\2\u00c6\u00ca\7\17\2\2\u00c7\u00c9\7*\2\2\u00c8\u00c7\3\2\2\2\u00c9"+
		"\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cd\3\2"+
		"\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00ce\5\20\t\2\u00ce\u00d2\7#\2\2\u00cf"+
		"\u00d1\7*\2\2\u00d0\u00cf\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d0\3\2"+
		"\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d5\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5"+
		"\u00d6\5\20\t\2\u00d6\u00da\7#\2\2\u00d7\u00d9\7*\2\2\u00d8\u00d7\3\2"+
		"\2\2\u00d9\u00dc\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db"+
		"\u00dd\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd\u00de\5\22\n\2\u00de\u00df\7"+
		"#\2\2\u00df\u00e3\5\22\n\2\u00e0\u00e2\7*\2\2\u00e1\u00e0\3\2\2\2\u00e2"+
		"\u00e5\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e6\3\2"+
		"\2\2\u00e5\u00e3\3\2\2\2\u00e6\u00e7\7\36\2\2\u00e7\u00e9\3\2\2\2\u00e8"+
		"\u008f\3\2\2\2\u00e8\u0093\3\2\2\2\u00e8\u0095\3\2\2\2\u00e8\u0096\3\2"+
		"\2\2\u00e8\u0097\3\2\2\2\u00e8\u009b\3\2\2\2\u00e8\u00bd\3\2\2\2\u00e8"+
		"\u00c6\3\2\2\2\u00e9\u00fb\3\2\2\2\u00ea\u00eb\f\7\2\2\u00eb\u00ef\7#"+
		"\2\2\u00ec\u00ee\7*\2\2\u00ed\u00ec\3\2\2\2\u00ee\u00f1\3\2\2\2\u00ef"+
		"\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f2\3\2\2\2\u00f1\u00ef\3\2"+
		"\2\2\u00f2\u00fa\5\20\t\b\u00f3\u00f4\f\t\2\2\u00f4\u00f5\7%\2\2\u00f5"+
		"\u00fa\5\b\5\2\u00f6\u00f7\f\b\2\2\u00f7\u00f8\7&\2\2\u00f8\u00fa\5\b"+
		"\5\2\u00f9\u00ea\3\2\2\2\u00f9\u00f3\3\2\2\2\u00f9\u00f6\3\2\2\2\u00fa"+
		"\u00fd\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\21\3\2\2"+
		"\2\u00fd\u00fb\3\2\2\2\u00fe\u00ff\7\37\2\2\u00ff\u0104\5\24\13\2\u0100"+
		"\u0101\7#\2\2\u0101\u0103\5\24\13\2\u0102\u0100\3\2\2\2\u0103\u0106\3"+
		"\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0107\3\2\2\2\u0106"+
		"\u0104\3\2\2\2\u0107\u0108\7 \2\2\u0108\23\3\2\2\2\u0109\u010a\7\34\2"+
		"\2\u010a\25\3\2\2\2\u010b\u010c\7\20\2\2\u010c\u010d\7\t\2\2\u010d\u010e"+
		"\5\24\13\2\u010e\u010f\7\21\2\2\u010f\u011e\5\20\t\2\u0110\u0114\7#\2"+
		"\2\u0111\u0113\7*\2\2\u0112\u0111\3\2\2\2\u0113\u0116\3\2\2\2\u0114\u0112"+
		"\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0117\3\2\2\2\u0116\u0114\3\2\2\2\u0117"+
		"\u0118\7\t\2\2\u0118\u0119\5\24\13\2\u0119\u011a\7\21\2\2\u011a\u011b"+
		"\5\20\t\2\u011b\u011d\3\2\2\2\u011c\u0110\3\2\2\2\u011d\u0120\3\2\2\2"+
		"\u011e\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0124\3\2\2\2\u0120\u011e"+
		"\3\2\2\2\u0121\u0123\7*\2\2\u0122\u0121\3\2\2\2\u0123\u0126\3\2\2\2\u0124"+
		"\u0122\3\2\2\2\u0124\u0125\3\2\2\2\u0125\27\3\2\2\2\u0126\u0124\3\2\2"+
		"\2\u0127\u0128\7\22\2\2\u0128\u0129\7\t\2\2\u0129\u012a\5\24\13\2\u012a"+
		"\u012b\7\23\2\2\u012b\u013a\5\20\t\2\u012c\u0130\7#\2\2\u012d\u012f\7"+
		"*\2\2\u012e\u012d\3\2\2\2\u012f\u0132\3\2\2\2\u0130\u012e\3\2\2\2\u0130"+
		"\u0131\3\2\2\2\u0131\u0133\3\2\2\2\u0132\u0130\3\2\2\2\u0133\u0134\7\t"+
		"\2\2\u0134\u0135\5\24\13\2\u0135\u0136\7\23\2\2\u0136\u0137\5\20\t\2\u0137"+
		"\u0139\3\2\2\2\u0138\u012c\3\2\2\2\u0139\u013c\3\2\2\2\u013a\u0138\3\2"+
		"\2\2\u013a\u013b\3\2\2\2\u013b\u0140\3\2\2\2\u013c\u013a\3\2\2\2\u013d"+
		"\u013f\7*\2\2\u013e\u013d\3\2\2\2\u013f\u0142\3\2\2\2\u0140\u013e\3\2"+
		"\2\2\u0140\u0141\3\2\2\2\u0141\31\3\2\2\2\u0142\u0140\3\2\2\2\u0143\u0144"+
		"\7\24\2\2\u0144\u0148\5\36\20\2\u0145\u0147\7*\2\2\u0146\u0145\3\2\2\2"+
		"\u0147\u014a\3\2\2\2\u0148\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149\33"+
		"\3\2\2\2\u014a\u0148\3\2\2\2\u014b\u014f\7\25\2\2\u014c\u014e\7*\2\2\u014d"+
		"\u014c\3\2\2\2\u014e\u0151\3\2\2\2\u014f\u014d\3\2\2\2\u014f\u0150\3\2"+
		"\2\2\u0150\u0152\3\2\2\2\u0151\u014f\3\2\2\2\u0152\u015c\5\20\t\2\u0153"+
		"\u0155\7*\2\2\u0154\u0153\3\2\2\2\u0155\u0158\3\2\2\2\u0156\u0154\3\2"+
		"\2\2\u0156\u0157\3\2\2\2\u0157\u0159\3\2\2\2\u0158\u0156\3\2\2\2\u0159"+
		"\u015b\5\20\t\2\u015a\u0156\3\2\2\2\u015b\u015e\3\2\2\2\u015c\u015a\3"+
		"\2\2\2\u015c\u015d\3\2\2\2\u015d\35\3\2\2\2\u015e\u015c\3\2\2\2\u015f"+
		"\u0160\b\20\1\2\u0160\u0161\7\27\2\2\u0161\u0162\5\24\13\2\u0162\u0163"+
		"\7\21\2\2\u0163\u016b\5\20\t\2\u0164\u0165\7#\2\2\u0165\u0166\5\24\13"+
		"\2\u0166\u0167\7\21\2\2\u0167\u0168\5\20\t\2\u0168\u016a\3\2\2\2\u0169"+
		"\u0164\3\2\2\2\u016a\u016d\3\2\2\2\u016b\u0169\3\2\2\2\u016b\u016c\3\2"+
		"\2\2\u016c\u016e\3\2\2\2\u016d\u016b\3\2\2\2\u016e\u016f\7\30\2\2\u016f"+
		"\u0170\5\36\20\7\u0170\u019f\3\2\2\2\u0171\u0172\7\b\2\2\u0172\u019f\5"+
		"\36\20\3\u0173\u0174\5\20\t\2\u0174\u0175\7(\2\2\u0175\u0176\5\20\t\2"+
		"\u0176\u019f\3\2\2\2\u0177\u0178\5\20\t\2\u0178\u0179\7\4\2\2\u0179\u017a"+
		"\5\20\t\2\u017a\u019f\3\2\2\2\u017b\u017c\5\20\t\2\u017c\u017d\7)\2\2"+
		"\u017d\u017e\5\20\t\2\u017e\u019f\3\2\2\2\u017f\u0180\5\20\t\2\u0180\u0181"+
		"\7\5\2\2\u0181\u0182\5\20\t\2\u0182\u019f\3\2\2\2\u0183\u0187\7\26\2\2"+
		"\u0184\u0186\7*\2\2\u0185\u0184\3\2\2\2\u0186\u0189\3\2\2\2\u0187\u0185"+
		"\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u018a\3\2\2\2\u0189\u0187\3\2\2\2\u018a"+
		"\u018e\7\35\2\2\u018b\u018d\7*\2\2\u018c\u018b\3\2\2\2\u018d\u0190\3\2"+
		"\2\2\u018e\u018c\3\2\2\2\u018e\u018f\3\2\2\2\u018f\u0191\3\2\2\2\u0190"+
		"\u018e\3\2\2\2\u0191\u0195\5\20\t\2\u0192\u0194\7*\2\2\u0193\u0192\3\2"+
		"\2\2\u0194\u0197\3\2\2\2\u0195\u0193\3\2\2\2\u0195\u0196\3\2\2\2\u0196"+
		"\u0198\3\2\2\2\u0197\u0195\3\2\2\2\u0198\u0199\7\36\2\2\u0199\u019f\3"+
		"\2\2\2\u019a\u019b\7\35\2\2\u019b\u019c\5\36\20\2\u019c\u019d\7\36\2\2"+
		"\u019d\u019f\3\2\2\2\u019e\u015f\3\2\2\2\u019e\u0171\3\2\2\2\u019e\u0173"+
		"\3\2\2\2\u019e\u0177\3\2\2\2\u019e\u017b\3\2\2\2\u019e\u017f\3\2\2\2\u019e"+
		"\u0183\3\2\2\2\u019e\u019a\3\2\2\2\u019f\u01a8\3\2\2\2\u01a0\u01a1\f\5"+
		"\2\2\u01a1\u01a2\7\6\2\2\u01a2\u01a7\5\36\20\6\u01a3\u01a4\f\4\2\2\u01a4"+
		"\u01a5\7\7\2\2\u01a5\u01a7\5\36\20\5\u01a6\u01a0\3\2\2\2\u01a6\u01a3\3"+
		"\2\2\2\u01a7\u01aa\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9"+
		"\37\3\2\2\2\u01aa\u01a8\3\2\2\2+(\64BVXw\177\u0081\u008c\u00a1\u00a8\u00af"+
		"\u00b6\u00bf\u00c2\u00ca\u00d2\u00da\u00e3\u00e8\u00ef\u00f9\u00fb\u0104"+
		"\u0114\u011e\u0124\u0130\u013a\u0140\u0148\u014f\u0156\u015c\u016b\u0187"+
		"\u018e\u0195\u019e\u01a6\u01a8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}