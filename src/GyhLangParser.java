// Generated from GyhLang.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GyhLangParser extends Parser {
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
	public static final int
		RULE_prog = 0;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog"
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

	@Override
	public String getGrammarFileName() { return "GyhLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GyhLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public List<TerminalNode> DELIM() { return getTokens(GyhLangParser.DELIM); }
		public TerminalNode DELIM(int i) {
			return getToken(GyhLangParser.DELIM, i);
		}
		public TerminalNode PCDEC() { return getToken(GyhLangParser.PCDEC, 0); }
		public TerminalNode ListaDeclaracoes() { return getToken(GyhLangParser.ListaDeclaracoes, 0); }
		public TerminalNode PCPROG() { return getToken(GyhLangParser.PCPROG, 0); }
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GyhLangListener ) ((GyhLangListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GyhLangListener ) ((GyhLangListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2);
			match(DELIM);
			setState(3);
			match(PCDEC);
			setState(4);
			match(ListaDeclaracoes);
			setState(5);
			match(DELIM);
			setState(6);
			match(PCPROG);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\37\13\4\2\t\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\2\2\3\2\2\2\2\t\2\4\3\2\2\2\4\5\7\37\2\2\5\6"+
		"\7\6\2\2\6\7\7\3\2\2\7\b\7\37\2\2\b\t\7\7\2\2\t\3\3\2\2\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}