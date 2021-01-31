// Generated from C:/Users/Vincent/dev/CCalcCop/CCalc/src/parser\Calc.g4 by ANTLR 4.9.1
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
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, LITERAL=19, BOOLEAN=20, IDENTIFIER=21, WS=22, LINE_COMMENT=23;
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
			"T__17", "LITERAL", "BOOLEAN", "IDENTIFIER", "WS", "LINE_COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'='", "'-'", "'!'", "'*'", "'/'", "'&&'", "'||'", 
			"'+'", "'>'", "'<'", "'>='", "'<='", "'=='", "'!='", "'?'", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "LITERAL", "BOOLEAN", "IDENTIFIER", 
			"WS", "LINE_COMMENT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\31\u008b\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\n\3"+
		"\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3"+
		"\20\3\20\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\7\24_\n\24"+
		"\f\24\16\24b\13\24\5\24d\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\5\25o\n\25\3\26\3\26\7\26s\n\26\f\26\16\26v\13\26\3\27\6\27y\n\27"+
		"\r\27\16\27z\3\27\3\27\3\30\3\30\3\30\3\30\7\30\u0083\n\30\f\30\16\30"+
		"\u0086\13\30\3\30\3\30\3\30\3\30\2\2\31\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27"+
		"-\30/\31\3\2\5\4\2\62;c|\5\2\13\f\17\17\"\"\3\2\f\f\2\u0090\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2"+
		"\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\3\61\3\2"+
		"\2\2\5\63\3\2\2\2\7\65\3\2\2\2\t\67\3\2\2\2\139\3\2\2\2\r;\3\2\2\2\17"+
		"=\3\2\2\2\21?\3\2\2\2\23B\3\2\2\2\25E\3\2\2\2\27G\3\2\2\2\31I\3\2\2\2"+
		"\33K\3\2\2\2\35N\3\2\2\2\37Q\3\2\2\2!T\3\2\2\2#W\3\2\2\2%Y\3\2\2\2\'c"+
		"\3\2\2\2)n\3\2\2\2+p\3\2\2\2-x\3\2\2\2/~\3\2\2\2\61\62\7*\2\2\62\4\3\2"+
		"\2\2\63\64\7+\2\2\64\6\3\2\2\2\65\66\7?\2\2\66\b\3\2\2\2\678\7/\2\28\n"+
		"\3\2\2\29:\7#\2\2:\f\3\2\2\2;<\7,\2\2<\16\3\2\2\2=>\7\61\2\2>\20\3\2\2"+
		"\2?@\7(\2\2@A\7(\2\2A\22\3\2\2\2BC\7~\2\2CD\7~\2\2D\24\3\2\2\2EF\7-\2"+
		"\2F\26\3\2\2\2GH\7@\2\2H\30\3\2\2\2IJ\7>\2\2J\32\3\2\2\2KL\7@\2\2LM\7"+
		"?\2\2M\34\3\2\2\2NO\7>\2\2OP\7?\2\2P\36\3\2\2\2QR\7?\2\2RS\7?\2\2S \3"+
		"\2\2\2TU\7#\2\2UV\7?\2\2V\"\3\2\2\2WX\7A\2\2X$\3\2\2\2YZ\7<\2\2Z&\3\2"+
		"\2\2[d\7\62\2\2\\`\4\63;\2]_\4\62;\2^]\3\2\2\2_b\3\2\2\2`^\3\2\2\2`a\3"+
		"\2\2\2ad\3\2\2\2b`\3\2\2\2c[\3\2\2\2c\\\3\2\2\2d(\3\2\2\2ef\7v\2\2fg\7"+
		"t\2\2gh\7w\2\2ho\7g\2\2ij\7h\2\2jk\7c\2\2kl\7n\2\2lm\7u\2\2mo\7g\2\2n"+
		"e\3\2\2\2ni\3\2\2\2o*\3\2\2\2pt\4c|\2qs\t\2\2\2rq\3\2\2\2sv\3\2\2\2tr"+
		"\3\2\2\2tu\3\2\2\2u,\3\2\2\2vt\3\2\2\2wy\t\3\2\2xw\3\2\2\2yz\3\2\2\2z"+
		"x\3\2\2\2z{\3\2\2\2{|\3\2\2\2|}\b\27\2\2}.\3\2\2\2~\177\7\61\2\2\177\u0080"+
		"\7\61\2\2\u0080\u0084\3\2\2\2\u0081\u0083\n\4\2\2\u0082\u0081\3\2\2\2"+
		"\u0083\u0086\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0087"+
		"\3\2\2\2\u0086\u0084\3\2\2\2\u0087\u0088\7\f\2\2\u0088\u0089\3\2\2\2\u0089"+
		"\u008a\b\30\2\2\u008a\60\3\2\2\2\t\2`cntz\u0084\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}