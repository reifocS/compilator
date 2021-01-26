// Generated from C:/Users/Vincent/dev/CCalcCop/CCalc/src/parser\Calc.g4 by ANTLR 4.9
package parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CalcLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, LITERAL=20, BOOLEAN=21, IDENTIFIER=22, WS=23, LINE_COMMENT=24;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "LITERAL", "BOOLEAN", "IDENTIFIER", "WS", "LINE_COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "'defun'", "')'", "'='", "'-'", "'!'", "'*'", "'/'", "'&&'", 
			"'||'", "'+'", "'>'", "'<'", "'>='", "'<='", "'=='", "'!='", "'?'", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "LITERAL", "BOOLEAN", 
			"IDENTIFIER", "WS", "LINE_COMMENT"
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


	public CalcLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Calc.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\32\u0093\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7"+
		"\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23"+
		"\3\24\3\24\3\25\3\25\3\25\7\25g\n\25\f\25\16\25j\13\25\5\25l\n\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26w\n\26\3\27\3\27\7\27{\n"+
		"\27\f\27\16\27~\13\27\3\30\6\30\u0081\n\30\r\30\16\30\u0082\3\30\3\30"+
		"\3\31\3\31\3\31\3\31\7\31\u008b\n\31\f\31\16\31\u008e\13\31\3\31\3\31"+
		"\3\31\3\31\2\2\32\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\3\2\5\4\2"+
		"\62;c|\5\2\13\f\17\17\"\"\3\2\f\f\2\u0098\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
		"\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2"+
		"\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\3\63\3\2\2\2"+
		"\5\65\3\2\2\2\7;\3\2\2\2\t=\3\2\2\2\13?\3\2\2\2\rA\3\2\2\2\17C\3\2\2\2"+
		"\21E\3\2\2\2\23G\3\2\2\2\25J\3\2\2\2\27M\3\2\2\2\31O\3\2\2\2\33Q\3\2\2"+
		"\2\35S\3\2\2\2\37V\3\2\2\2!Y\3\2\2\2#\\\3\2\2\2%_\3\2\2\2\'a\3\2\2\2)"+
		"k\3\2\2\2+v\3\2\2\2-x\3\2\2\2/\u0080\3\2\2\2\61\u0086\3\2\2\2\63\64\7"+
		"*\2\2\64\4\3\2\2\2\65\66\7f\2\2\66\67\7g\2\2\678\7h\2\289\7w\2\29:\7p"+
		"\2\2:\6\3\2\2\2;<\7+\2\2<\b\3\2\2\2=>\7?\2\2>\n\3\2\2\2?@\7/\2\2@\f\3"+
		"\2\2\2AB\7#\2\2B\16\3\2\2\2CD\7,\2\2D\20\3\2\2\2EF\7\61\2\2F\22\3\2\2"+
		"\2GH\7(\2\2HI\7(\2\2I\24\3\2\2\2JK\7~\2\2KL\7~\2\2L\26\3\2\2\2MN\7-\2"+
		"\2N\30\3\2\2\2OP\7@\2\2P\32\3\2\2\2QR\7>\2\2R\34\3\2\2\2ST\7@\2\2TU\7"+
		"?\2\2U\36\3\2\2\2VW\7>\2\2WX\7?\2\2X \3\2\2\2YZ\7?\2\2Z[\7?\2\2[\"\3\2"+
		"\2\2\\]\7#\2\2]^\7?\2\2^$\3\2\2\2_`\7A\2\2`&\3\2\2\2ab\7<\2\2b(\3\2\2"+
		"\2cl\7\62\2\2dh\4\63;\2eg\4\62;\2fe\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2"+
		"\2\2il\3\2\2\2jh\3\2\2\2kc\3\2\2\2kd\3\2\2\2l*\3\2\2\2mn\7v\2\2no\7t\2"+
		"\2op\7w\2\2pw\7g\2\2qr\7h\2\2rs\7c\2\2st\7n\2\2tu\7u\2\2uw\7g\2\2vm\3"+
		"\2\2\2vq\3\2\2\2w,\3\2\2\2x|\4c|\2y{\t\2\2\2zy\3\2\2\2{~\3\2\2\2|z\3\2"+
		"\2\2|}\3\2\2\2}.\3\2\2\2~|\3\2\2\2\177\u0081\t\3\2\2\u0080\177\3\2\2\2"+
		"\u0081\u0082\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084"+
		"\3\2\2\2\u0084\u0085\b\30\2\2\u0085\60\3\2\2\2\u0086\u0087\7\61\2\2\u0087"+
		"\u0088\7\61\2\2\u0088\u008c\3\2\2\2\u0089\u008b\n\4\2\2\u008a\u0089\3"+
		"\2\2\2\u008b\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d"+
		"\u008f\3\2\2\2\u008e\u008c\3\2\2\2\u008f\u0090\7\f\2\2\u0090\u0091\3\2"+
		"\2\2\u0091\u0092\b\31\2\2\u0092\62\3\2\2\2\t\2hkv|\u0082\u008c\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}