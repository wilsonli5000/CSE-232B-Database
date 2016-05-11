// Generated from /Users/wilsonli/IdeaProjects/xquery-engine/src/main/resources/Xquery.g4 by ANTLR 4.5.1
package src.main.java.antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class XqueryLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, NUM=7, DOC=8, TXT=9, NAME=10, 
		OPAR=11, CPAR=12, OBRAC=13, CBRAC=14, DOT=15, DDOT=16, COMMA=17, AT=18, 
		PATH=19, DPATH=20, STAR=21, EQUL=22, DEQUL=23, NEWLINE=24, WS=25;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "NUM", "DOC", "TXT", "NAME", 
		"OPAR", "CPAR", "OBRAC", "CBRAC", "DOT", "DDOT", "COMMA", "AT", "PATH", 
		"DPATH", "STAR", "EQUL", "DEQUL", "NEWLINE", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'\"'", "'eq'", "'is'", "'and'", "'or'", "'not'", null, "'document'", 
		"'text()'", null, "'('", "')'", "'['", "']'", "'.'", "'..'", "','", "'@'", 
		"'/'", "'//'", "'*'", "'='", "'=='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, "NUM", "DOC", "TXT", "NAME", 
		"OPAR", "CPAR", "OBRAC", "CBRAC", "DOT", "DDOT", "COMMA", "AT", "PATH", 
		"DPATH", "STAR", "EQUL", "DEQUL", "NEWLINE", "WS"
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


	public XqueryLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Xquery.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\33\u008b\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3"+
		"\6\3\6\3\7\3\7\3\7\3\7\3\b\6\bJ\n\b\r\b\16\bK\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\6\13_\n\13\r\13\16\13`\3"+
		"\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\22\3\22"+
		"\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30"+
		"\3\31\5\31\u0081\n\31\3\31\3\31\3\32\6\32\u0086\n\32\r\32\16\32\u0087"+
		"\3\32\3\32\2\2\33\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\3\2"+
		"\5\3\2\62;\7\2//\62;C\\aac|\4\2\13\13\"\"\u008e\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\3\65\3\2\2\2\5\67\3\2\2\2\7:\3\2\2\2\t=\3\2\2\2\13A\3\2\2\2\rD"+
		"\3\2\2\2\17I\3\2\2\2\21M\3\2\2\2\23V\3\2\2\2\25^\3\2\2\2\27b\3\2\2\2\31"+
		"d\3\2\2\2\33f\3\2\2\2\35h\3\2\2\2\37j\3\2\2\2!l\3\2\2\2#o\3\2\2\2%q\3"+
		"\2\2\2\'s\3\2\2\2)u\3\2\2\2+x\3\2\2\2-z\3\2\2\2/|\3\2\2\2\61\u0080\3\2"+
		"\2\2\63\u0085\3\2\2\2\65\66\7$\2\2\66\4\3\2\2\2\678\7g\2\289\7s\2\29\6"+
		"\3\2\2\2:;\7k\2\2;<\7u\2\2<\b\3\2\2\2=>\7c\2\2>?\7p\2\2?@\7f\2\2@\n\3"+
		"\2\2\2AB\7q\2\2BC\7t\2\2C\f\3\2\2\2DE\7p\2\2EF\7q\2\2FG\7v\2\2G\16\3\2"+
		"\2\2HJ\t\2\2\2IH\3\2\2\2JK\3\2\2\2KI\3\2\2\2KL\3\2\2\2L\20\3\2\2\2MN\7"+
		"f\2\2NO\7q\2\2OP\7e\2\2PQ\7w\2\2QR\7o\2\2RS\7g\2\2ST\7p\2\2TU\7v\2\2U"+
		"\22\3\2\2\2VW\7v\2\2WX\7g\2\2XY\7z\2\2YZ\7v\2\2Z[\7*\2\2[\\\7+\2\2\\\24"+
		"\3\2\2\2]_\t\3\2\2^]\3\2\2\2_`\3\2\2\2`^\3\2\2\2`a\3\2\2\2a\26\3\2\2\2"+
		"bc\7*\2\2c\30\3\2\2\2de\7+\2\2e\32\3\2\2\2fg\7]\2\2g\34\3\2\2\2hi\7_\2"+
		"\2i\36\3\2\2\2jk\7\60\2\2k \3\2\2\2lm\7\60\2\2mn\7\60\2\2n\"\3\2\2\2o"+
		"p\7.\2\2p$\3\2\2\2qr\7B\2\2r&\3\2\2\2st\7\61\2\2t(\3\2\2\2uv\7\61\2\2"+
		"vw\7\61\2\2w*\3\2\2\2xy\7,\2\2y,\3\2\2\2z{\7?\2\2{.\3\2\2\2|}\7?\2\2}"+
		"~\7?\2\2~\60\3\2\2\2\177\u0081\7\17\2\2\u0080\177\3\2\2\2\u0080\u0081"+
		"\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0083\7\f\2\2\u0083\62\3\2\2\2\u0084"+
		"\u0086\t\4\2\2\u0085\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0085\3\2"+
		"\2\2\u0087\u0088\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a\b\32\2\2\u008a"+
		"\64\3\2\2\2\7\2K`\u0080\u0087\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}