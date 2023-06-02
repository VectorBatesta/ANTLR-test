// Generated from GyhLang.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GyhLangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ListaDeclaracoes=1, Declaracao=2, TipoVar=3, PCDEC=4, PCPROG=5, PCINT=6, 
		PCLER=7, PCREAL=8, PCIMPRIMIR=9, PCSE=10, PCENTAO=11, PCENQTO=12, PCINI=13, 
		PCFIM=14, WS=15, COMMENT=16, VAR=17, NUMINT=18, NUMREAL=19, OPARIT=20, 
		OPBOOL=21, OPMAIOR=22, OPMENOR=23, OPIGUAL=24, CADEIA=25, ATRIB=26, AbrePar=27, 
		FechaPar=28, DELIM=29;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ListaDeclaracoes", "Declaracao", "TipoVar", "PCDEC", "PCPROG", "PCINT", 
			"PCLER", "PCREAL", "PCIMPRIMIR", "PCSE", "PCENTAO", "PCENQTO", "PCINI", 
			"PCFIM", "WS", "COMMENT", "VAR", "NUMINT", "NUMREAL", "OPARIT", "OPBOOL", 
			"OPMAIOR", "OPMENOR", "OPIGUAL", "CADEIA", "ATRIB", "AbrePar", "FechaPar", 
			"DELIM"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'DEC'", "'PROG'", "'INT'", "'LER'", "'REAL'", 
			"'IMPRIMIR'", "'SE'", "'ENTAO'", "'ENQTO'", "'INI'", "'FIM'", null, null, 
			null, null, null, null, null, "'>'", "'<'", null, null, "':='", "'('", 
			"')'", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ListaDeclaracoes", "Declaracao", "TipoVar", "PCDEC", "PCPROG", 
			"PCINT", "PCLER", "PCREAL", "PCIMPRIMIR", "PCSE", "PCENTAO", "PCENQTO", 
			"PCINI", "PCFIM", "WS", "COMMENT", "VAR", "NUMINT", "NUMREAL", "OPARIT", 
			"OPBOOL", "OPMAIOR", "OPMENOR", "OPIGUAL", "CADEIA", "ATRIB", "AbrePar", 
			"FechaPar", "DELIM"
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


	public GyhLangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "GyhLang.g4"; }

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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 0:
			ListaDeclaracoes_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void ListaDeclaracoes_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			System.out.println("declareixon!!");
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\37\u00c9\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\2\6"+
		"\2A\n\2\r\2\16\2B\3\3\3\3\3\3\3\3\3\4\3\4\5\4K\n\4\3\5\3\5\3\5\3\5\3\6"+
		"\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3"+
		"\20\3\20\3\20\3\20\3\21\3\21\7\21\u0089\n\21\f\21\16\21\u008c\13\21\3"+
		"\21\3\21\3\21\3\21\3\22\3\22\7\22\u0094\n\22\f\22\16\22\u0097\13\22\3"+
		"\23\6\23\u009a\n\23\r\23\16\23\u009b\3\24\7\24\u009f\n\24\f\24\16\24\u00a2"+
		"\13\24\3\24\3\24\6\24\u00a6\n\24\r\24\16\24\u00a7\3\25\3\25\3\26\3\26"+
		"\3\26\5\26\u00af\n\26\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\32\3\32\7\32"+
		"\u00ba\n\32\f\32\16\32\u00bd\13\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34"+
		"\3\35\3\35\3\36\3\36\2\2\37\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32"+
		"\63\33\65\34\67\359\36;\37\3\2\b\5\2\13\f\17\17\"\"\n\2\13\13\17\17\""+
		"\"\62;>>@@C\\c|\3\2c|\5\2\62;C\\c|\3\2\62;\5\2,-//\61\61\2\u00d1\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2"+
		"%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61"+
		"\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2"+
		"\3@\3\2\2\2\5D\3\2\2\2\7J\3\2\2\2\tL\3\2\2\2\13P\3\2\2\2\rU\3\2\2\2\17"+
		"Y\3\2\2\2\21]\3\2\2\2\23b\3\2\2\2\25k\3\2\2\2\27n\3\2\2\2\31t\3\2\2\2"+
		"\33z\3\2\2\2\35~\3\2\2\2\37\u0082\3\2\2\2!\u0086\3\2\2\2#\u0091\3\2\2"+
		"\2%\u0099\3\2\2\2\'\u00a0\3\2\2\2)\u00a9\3\2\2\2+\u00ae\3\2\2\2-\u00b0"+
		"\3\2\2\2/\u00b2\3\2\2\2\61\u00b4\3\2\2\2\63\u00b7\3\2\2\2\65\u00c0\3\2"+
		"\2\2\67\u00c3\3\2\2\29\u00c5\3\2\2\2;\u00c7\3\2\2\2=>\5\5\3\2>?\b\2\2"+
		"\2?A\3\2\2\2@=\3\2\2\2AB\3\2\2\2B@\3\2\2\2BC\3\2\2\2C\4\3\2\2\2DE\5#\22"+
		"\2EF\5;\36\2FG\5\7\4\2G\6\3\2\2\2HK\5\r\7\2IK\5\21\t\2JH\3\2\2\2JI\3\2"+
		"\2\2K\b\3\2\2\2LM\7F\2\2MN\7G\2\2NO\7E\2\2O\n\3\2\2\2PQ\7R\2\2QR\7T\2"+
		"\2RS\7Q\2\2ST\7I\2\2T\f\3\2\2\2UV\7K\2\2VW\7P\2\2WX\7V\2\2X\16\3\2\2\2"+
		"YZ\7N\2\2Z[\7G\2\2[\\\7T\2\2\\\20\3\2\2\2]^\7T\2\2^_\7G\2\2_`\7C\2\2`"+
		"a\7N\2\2a\22\3\2\2\2bc\7K\2\2cd\7O\2\2de\7R\2\2ef\7T\2\2fg\7K\2\2gh\7"+
		"O\2\2hi\7K\2\2ij\7T\2\2j\24\3\2\2\2kl\7U\2\2lm\7G\2\2m\26\3\2\2\2no\7"+
		"G\2\2op\7P\2\2pq\7V\2\2qr\7C\2\2rs\7Q\2\2s\30\3\2\2\2tu\7G\2\2uv\7P\2"+
		"\2vw\7S\2\2wx\7V\2\2xy\7Q\2\2y\32\3\2\2\2z{\7K\2\2{|\7P\2\2|}\7K\2\2}"+
		"\34\3\2\2\2~\177\7H\2\2\177\u0080\7K\2\2\u0080\u0081\7O\2\2\u0081\36\3"+
		"\2\2\2\u0082\u0083\t\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085\b\20\3\2\u0085"+
		" \3\2\2\2\u0086\u008a\7%\2\2\u0087\u0089\t\3\2\2\u0088\u0087\3\2\2\2\u0089"+
		"\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008d\3\2"+
		"\2\2\u008c\u008a\3\2\2\2\u008d\u008e\7\f\2\2\u008e\u008f\3\2\2\2\u008f"+
		"\u0090\b\21\3\2\u0090\"\3\2\2\2\u0091\u0095\t\4\2\2\u0092\u0094\t\5\2"+
		"\2\u0093\u0092\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096"+
		"\3\2\2\2\u0096$\3\2\2\2\u0097\u0095\3\2\2\2\u0098\u009a\t\6\2\2\u0099"+
		"\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2"+
		"\2\2\u009c&\3\2\2\2\u009d\u009f\t\6\2\2\u009e\u009d\3\2\2\2\u009f\u00a2"+
		"\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a3\3\2\2\2\u00a2"+
		"\u00a0\3\2\2\2\u00a3\u00a5\7\60\2\2\u00a4\u00a6\t\6\2\2\u00a5\u00a4\3"+
		"\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8"+
		"(\3\2\2\2\u00a9\u00aa\t\7\2\2\u00aa*\3\2\2\2\u00ab\u00af\7G\2\2\u00ac"+
		"\u00ad\7Q\2\2\u00ad\u00af\7W\2\2\u00ae\u00ab\3\2\2\2\u00ae\u00ac\3\2\2"+
		"\2\u00af,\3\2\2\2\u00b0\u00b1\7@\2\2\u00b1.\3\2\2\2\u00b2\u00b3\7>\2\2"+
		"\u00b3\60\3\2\2\2\u00b4\u00b5\7?\2\2\u00b5\u00b6\7?\2\2\u00b6\62\3\2\2"+
		"\2\u00b7\u00bb\7$\2\2\u00b8\u00ba\t\3\2\2\u00b9\u00b8\3\2\2\2\u00ba\u00bd"+
		"\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00be\3\2\2\2\u00bd"+
		"\u00bb\3\2\2\2\u00be\u00bf\7$\2\2\u00bf\64\3\2\2\2\u00c0\u00c1\7<\2\2"+
		"\u00c1\u00c2\7?\2\2\u00c2\66\3\2\2\2\u00c3\u00c4\7*\2\2\u00c48\3\2\2\2"+
		"\u00c5\u00c6\7+\2\2\u00c6:\3\2\2\2\u00c7\u00c8\7<\2\2\u00c8<\3\2\2\2\17"+
		"\2BJ\u0088\u008a\u0093\u0095\u009b\u00a0\u00a7\u00ae\u00b9\u00bb\4\3\2"+
		"\2\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}