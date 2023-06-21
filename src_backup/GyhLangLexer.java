// Generated from GyhLang.g4 by ANTLR 4.7.2

    import java.util.ArrayList;

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
		ListaDeclaracoes=1, Declaracao=2, ListaComandos=3, Comando=4, ComandoAtribuicao=5, 
		ComandoEntrada=6, ComandoSaida=7, ComandoCondicao=8, ComandoRepeticao=9, 
		ExpressaoAritmetica=10, TermoAritmetico=11, FatorAritmetico=12, ExpressaoRelacional=13, 
		TermoRelacional=14, SubAlgoritmo=15, OP_REL=16, TipoVar=17, PCDEC=18, 
		PCPROG=19, PCINT=20, PCLER=21, PCREAL=22, PCIMPRIMIR=23, PCSE=24, PCSENAO=25, 
		PCENTAO=26, PCENQTO=27, PCINI=28, PCFIM=29, WS=30, COMMENT=31, VAR=32, 
		NUMINT=33, NUMREAL=34, OPARIT=35, OPBOOL=36, OPMAIORIGUAL=37, OPMAIOR=38, 
		OPMENORIGUAL=39, OPMENOR=40, OPIGUAL=41, OPDIF=42, CADEIA=43, ATRIB=44, 
		AbrePar=45, FechaPar=46, DELIM=47;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ListaDeclaracoes", "Declaracao", "ListaComandos", "Comando", "ComandoAtribuicao", 
			"ComandoEntrada", "ComandoSaida", "ComandoCondicao", "ComandoRepeticao", 
			"ExpressaoAritmetica", "TermoAritmetico", "FatorAritmetico", "ExpressaoRelacional", 
			"TermoRelacional", "SubAlgoritmo", "OP_REL", "TipoVar", "PCDEC", "PCPROG", 
			"PCINT", "PCLER", "PCREAL", "PCIMPRIMIR", "PCSE", "PCSENAO", "PCENTAO", 
			"PCENQTO", "PCINI", "PCFIM", "WS", "COMMENT", "VAR", "NUMINT", "NUMREAL", 
			"OPARIT", "OPBOOL", "OPMAIORIGUAL", "OPMAIOR", "OPMENORIGUAL", "OPMENOR", 
			"OPIGUAL", "OPDIF", "CADEIA", "ATRIB", "AbrePar", "FechaPar", "DELIM"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "'DEC'", "'PROG'", "'INT'", "'LER'", 
			"'REAL'", "'IMPRIMIR'", "'SE'", "'SENAO'", "'ENTAO'", "'ENQTO'", "'INI'", 
			"'FIM'", null, null, null, null, null, null, null, "'>='", "'>'", "'<='", 
			"'<'", null, "'!='", null, "':='", "'('", "')'", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ListaDeclaracoes", "Declaracao", "ListaComandos", "Comando", "ComandoAtribuicao", 
			"ComandoEntrada", "ComandoSaida", "ComandoCondicao", "ComandoRepeticao", 
			"ExpressaoAritmetica", "TermoAritmetico", "FatorAritmetico", "ExpressaoRelacional", 
			"TermoRelacional", "SubAlgoritmo", "OP_REL", "TipoVar", "PCDEC", "PCPROG", 
			"PCINT", "PCLER", "PCREAL", "PCIMPRIMIR", "PCSE", "PCSENAO", "PCENTAO", 
			"PCENQTO", "PCINI", "PCFIM", "WS", "COMMENT", "VAR", "NUMINT", "NUMREAL", 
			"OPARIT", "OPBOOL", "OPMAIORIGUAL", "OPMAIOR", "OPMENORIGUAL", "OPMENOR", 
			"OPIGUAL", "OPDIF", "CADEIA", "ATRIB", "AbrePar", "FechaPar", "DELIM"
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


	    private String _varNome;
	    private String _varTipo;
	    private String _varValor;
	    private Simbolo _varSimbolo;
	    private TabelaSimbolo _varTabela = new TabelaSimbolo();

	    //===
	    private GyhProgram program = new GyhProgram();

	    private ArrayList<Comando> listCmd = new ArrayList<>();

	    
	    //===

	    public void generateCommand(){
	        program.generateTarget();
	    }

	    public void addTabelaSimbolo(String nome, String tipo, String valor){
	        _varSimbolo = new Simbolo(nome, tipo, valor);
	        if (_varTabela.exists(nome)){
	            System.out.println("\n Erro Semantico: variavel ja declarada: " + _varSimbolo.toString());
	        }
	        else{
	            _varTabela.add(_varSimbolo);
	        }
	    }

	    public void verificaVar(String nome){
	        if(_varTabela.exists(nome)){
	            System.out.println("\n Erro Semantico: variavel nao declarada: " + nome);
	        }
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
		case 1:
			Declaracao_action((RuleContext)_localctx, actionIndex);
			break;
		case 4:
			ComandoAtribuicao_action((RuleContext)_localctx, actionIndex);
			break;
		case 5:
			ComandoEntrada_action((RuleContext)_localctx, actionIndex);
			break;
		case 6:
			ComandoSaida_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void Declaracao_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:

			            addTabelaSimbolo(_input.LT(-3).getText(), _input.LT(-1).getText(), null);
			        
			break;
		}
	}
	private void ComandoAtribuicao_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:

			            if(_varTabela.exists(_input.LT(-1).getText()) == null){
			                System.out.println("\n\nVariavel nao declarada " + _input.LT(-1).getText());
			            }
			        
			break;
		}
	}
	private void ComandoEntrada_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:

			            verificaVar(_input.LT(-1).getText());
			            ComandoLeitura cmd = new ComandoLeitura();
			            cmd.setId(_input.LT(-1).getText());
			            listCmd.add(cmd);
			        
			break;
		}
	}
	private void ComandoSaida_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:

			            verificaVar(_input.LT(-1).getText());
			            ComandoEscrita cmd = new ComandoEscrita();
			            cmd.setId(_input.LT(-1).getText());
			            listCmd.add(cmd);
			        
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\61\u015f\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\6\2c\n\2\r\2\16\2d\3\3\3\3\3\3"+
		"\3\3\3\3\3\4\6\4m\n\4\r\4\16\4n\3\5\3\5\3\5\3\5\3\5\3\5\5\5w\n\5\3\6\3"+
		"\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\5\b\u0087\n\b\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\5\t\u0090\n\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\5"+
		"\13\u0099\n\13\3\f\3\f\3\f\7\f\u009e\n\f\f\f\16\f\u00a1\13\f\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\5\r\u00aa\n\r\3\16\3\16\3\16\3\16\7\16\u00b0\n\16\f"+
		"\16\16\16\u00b3\13\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00bd"+
		"\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\5\21\u00ce\n\21\3\22\3\22\5\22\u00d2\n\22\3\23\3\23\3\23\3"+
		"\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3"+
		"\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3"+
		"\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3"+
		"\36\3\37\3\37\3\37\3\37\3 \3 \7 \u0116\n \f \16 \u0119\13 \3 \3 \3 \3"+
		" \3!\3!\7!\u0121\n!\f!\16!\u0124\13!\3\"\6\"\u0127\n\"\r\"\16\"\u0128"+
		"\3#\7#\u012c\n#\f#\16#\u012f\13#\3#\3#\6#\u0133\n#\r#\16#\u0134\3$\3$"+
		"\3%\3%\3%\5%\u013c\n%\3&\3&\3&\3\'\3\'\3(\3(\3(\3)\3)\3*\3*\3*\3+\3+\3"+
		"+\3,\3,\7,\u0150\n,\f,\16,\u0153\13,\3,\3,\3-\3-\3-\3.\3.\3/\3/\3\60\3"+
		"\60\2\2\61\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61\3\2\n\4\2--//\4"+
		"\2,,\61\61\5\2\13\f\17\17\"\"\n\2\13\13\17\17\"\"\62;>>@@C\\c|\3\2c|\5"+
		"\2\62;C\\c|\3\2\62;\5\2,-//\61\61\2\u017b\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
		"\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2"+
		"\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2"+
		"\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2"+
		"\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M"+
		"\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2"+
		"\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\3b\3\2\2\2\5f\3\2\2\2\7l\3\2\2\2"+
		"\tv\3\2\2\2\13x\3\2\2\2\r}\3\2\2\2\17\u0081\3\2\2\2\21\u0088\3\2\2\2\23"+
		"\u0091\3\2\2\2\25\u0095\3\2\2\2\27\u009a\3\2\2\2\31\u00a9\3\2\2\2\33\u00ab"+
		"\3\2\2\2\35\u00bc\3\2\2\2\37\u00be\3\2\2\2!\u00cd\3\2\2\2#\u00d1\3\2\2"+
		"\2%\u00d3\3\2\2\2\'\u00d7\3\2\2\2)\u00dc\3\2\2\2+\u00e0\3\2\2\2-\u00e4"+
		"\3\2\2\2/\u00e9\3\2\2\2\61\u00f2\3\2\2\2\63\u00f5\3\2\2\2\65\u00fb\3\2"+
		"\2\2\67\u0101\3\2\2\29\u0107\3\2\2\2;\u010b\3\2\2\2=\u010f\3\2\2\2?\u0113"+
		"\3\2\2\2A\u011e\3\2\2\2C\u0126\3\2\2\2E\u012d\3\2\2\2G\u0136\3\2\2\2I"+
		"\u013b\3\2\2\2K\u013d\3\2\2\2M\u0140\3\2\2\2O\u0142\3\2\2\2Q\u0145\3\2"+
		"\2\2S\u0147\3\2\2\2U\u014a\3\2\2\2W\u014d\3\2\2\2Y\u0156\3\2\2\2[\u0159"+
		"\3\2\2\2]\u015b\3\2\2\2_\u015d\3\2\2\2ac\5\5\3\2ba\3\2\2\2cd\3\2\2\2d"+
		"b\3\2\2\2de\3\2\2\2e\4\3\2\2\2fg\5A!\2gh\5_\60\2hi\5#\22\2ij\b\3\2\2j"+
		"\6\3\2\2\2km\5\t\5\2lk\3\2\2\2mn\3\2\2\2nl\3\2\2\2no\3\2\2\2o\b\3\2\2"+
		"\2pw\5\13\6\2qw\5\r\7\2rw\5\17\b\2sw\5\21\t\2tw\5\23\n\2uw\5\37\20\2v"+
		"p\3\2\2\2vq\3\2\2\2vr\3\2\2\2vs\3\2\2\2vt\3\2\2\2vu\3\2\2\2w\n\3\2\2\2"+
		"xy\5A!\2yz\b\6\3\2z{\5Y-\2{|\5\25\13\2|\f\3\2\2\2}~\5+\26\2~\177\5A!\2"+
		"\177\u0080\b\7\4\2\u0080\16\3\2\2\2\u0081\u0086\5/\30\2\u0082\u0083\5"+
		"A!\2\u0083\u0084\b\b\5\2\u0084\u0087\3\2\2\2\u0085\u0087\5W,\2\u0086\u0082"+
		"\3\2\2\2\u0086\u0085\3\2\2\2\u0087\20\3\2\2\2\u0088\u0089\5\61\31\2\u0089"+
		"\u008a\5\33\16\2\u008a\u008b\5\65\33\2\u008b\u008f\5\t\5\2\u008c\u008d"+
		"\5\63\32\2\u008d\u008e\5\t\5\2\u008e\u0090\3\2\2\2\u008f\u008c\3\2\2\2"+
		"\u008f\u0090\3\2\2\2\u0090\22\3\2\2\2\u0091\u0092\5\67\34\2\u0092\u0093"+
		"\5\33\16\2\u0093\u0094\5\t\5\2\u0094\24\3\2\2\2\u0095\u0098\5\27\f\2\u0096"+
		"\u0097\t\2\2\2\u0097\u0099\5\25\13\2\u0098\u0096\3\2\2\2\u0098\u0099\3"+
		"\2\2\2\u0099\26\3\2\2\2\u009a\u009f\5\31\r\2\u009b\u009c\t\3\2\2\u009c"+
		"\u009e\5\31\r\2\u009d\u009b\3\2\2\2\u009e\u00a1\3\2\2\2\u009f\u009d\3"+
		"\2\2\2\u009f\u00a0\3\2\2\2\u00a0\30\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2"+
		"\u00aa\5C\"\2\u00a3\u00aa\5E#\2\u00a4\u00aa\5A!\2\u00a5\u00a6\7*\2\2\u00a6"+
		"\u00a7\5\25\13\2\u00a7\u00a8\7+\2\2\u00a8\u00aa\3\2\2\2\u00a9\u00a2\3"+
		"\2\2\2\u00a9\u00a3\3\2\2\2\u00a9\u00a4\3\2\2\2\u00a9\u00a5\3\2\2\2\u00aa"+
		"\32\3\2\2\2\u00ab\u00b1\5\35\17\2\u00ac\u00ad\5I%\2\u00ad\u00ae\5\35\17"+
		"\2\u00ae\u00b0\3\2\2\2\u00af\u00ac\3\2\2\2\u00b0\u00b3\3\2\2\2\u00b1\u00af"+
		"\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\34\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4"+
		"\u00b5\5\25\13\2\u00b5\u00b6\5!\21\2\u00b6\u00b7\5\25\13\2\u00b7\u00bd"+
		"\3\2\2\2\u00b8\u00b9\7*\2\2\u00b9\u00ba\5\33\16\2\u00ba\u00bb\7+\2\2\u00bb"+
		"\u00bd\3\2\2\2\u00bc\u00b4\3\2\2\2\u00bc\u00b8\3\2\2\2\u00bd\36\3\2\2"+
		"\2\u00be\u00bf\7K\2\2\u00bf\u00c0\7P\2\2\u00c0\u00c1\7K\2\2\u00c1\u00c2"+
		"\3\2\2\2\u00c2\u00c3\5\7\4\2\u00c3\u00c4\7H\2\2\u00c4\u00c5\7K\2\2\u00c5"+
		"\u00c6\7O\2\2\u00c6 \3\2\2\2\u00c7\u00ce\5O(\2\u00c8\u00ce\5S*\2\u00c9"+
		"\u00ce\5M\'\2\u00ca\u00ce\5K&\2\u00cb\u00ce\5U+\2\u00cc\u00ce\5Q)\2\u00cd"+
		"\u00c7\3\2\2\2\u00cd\u00c8\3\2\2\2\u00cd\u00c9\3\2\2\2\u00cd\u00ca\3\2"+
		"\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00cc\3\2\2\2\u00ce\"\3\2\2\2\u00cf\u00d2"+
		"\5)\25\2\u00d0\u00d2\5-\27\2\u00d1\u00cf\3\2\2\2\u00d1\u00d0\3\2\2\2\u00d2"+
		"$\3\2\2\2\u00d3\u00d4\7F\2\2\u00d4\u00d5\7G\2\2\u00d5\u00d6\7E\2\2\u00d6"+
		"&\3\2\2\2\u00d7\u00d8\7R\2\2\u00d8\u00d9\7T\2\2\u00d9\u00da\7Q\2\2\u00da"+
		"\u00db\7I\2\2\u00db(\3\2\2\2\u00dc\u00dd\7K\2\2\u00dd\u00de\7P\2\2\u00de"+
		"\u00df\7V\2\2\u00df*\3\2\2\2\u00e0\u00e1\7N\2\2\u00e1\u00e2\7G\2\2\u00e2"+
		"\u00e3\7T\2\2\u00e3,\3\2\2\2\u00e4\u00e5\7T\2\2\u00e5\u00e6\7G\2\2\u00e6"+
		"\u00e7\7C\2\2\u00e7\u00e8\7N\2\2\u00e8.\3\2\2\2\u00e9\u00ea\7K\2\2\u00ea"+
		"\u00eb\7O\2\2\u00eb\u00ec\7R\2\2\u00ec\u00ed\7T\2\2\u00ed\u00ee\7K\2\2"+
		"\u00ee\u00ef\7O\2\2\u00ef\u00f0\7K\2\2\u00f0\u00f1\7T\2\2\u00f1\60\3\2"+
		"\2\2\u00f2\u00f3\7U\2\2\u00f3\u00f4\7G\2\2\u00f4\62\3\2\2\2\u00f5\u00f6"+
		"\7U\2\2\u00f6\u00f7\7G\2\2\u00f7\u00f8\7P\2\2\u00f8\u00f9\7C\2\2\u00f9"+
		"\u00fa\7Q\2\2\u00fa\64\3\2\2\2\u00fb\u00fc\7G\2\2\u00fc\u00fd\7P\2\2\u00fd"+
		"\u00fe\7V\2\2\u00fe\u00ff\7C\2\2\u00ff\u0100\7Q\2\2\u0100\66\3\2\2\2\u0101"+
		"\u0102\7G\2\2\u0102\u0103\7P\2\2\u0103\u0104\7S\2\2\u0104\u0105\7V\2\2"+
		"\u0105\u0106\7Q\2\2\u01068\3\2\2\2\u0107\u0108\7K\2\2\u0108\u0109\7P\2"+
		"\2\u0109\u010a\7K\2\2\u010a:\3\2\2\2\u010b\u010c\7H\2\2\u010c\u010d\7"+
		"K\2\2\u010d\u010e\7O\2\2\u010e<\3\2\2\2\u010f\u0110\t\4\2\2\u0110\u0111"+
		"\3\2\2\2\u0111\u0112\b\37\6\2\u0112>\3\2\2\2\u0113\u0117\7%\2\2\u0114"+
		"\u0116\t\5\2\2\u0115\u0114\3\2\2\2\u0116\u0119\3\2\2\2\u0117\u0115\3\2"+
		"\2\2\u0117\u0118\3\2\2\2\u0118\u011a\3\2\2\2\u0119\u0117\3\2\2\2\u011a"+
		"\u011b\7\f\2\2\u011b\u011c\3\2\2\2\u011c\u011d\b \6\2\u011d@\3\2\2\2\u011e"+
		"\u0122\t\6\2\2\u011f\u0121\t\7\2\2\u0120\u011f\3\2\2\2\u0121\u0124\3\2"+
		"\2\2\u0122\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123B\3\2\2\2\u0124\u0122"+
		"\3\2\2\2\u0125\u0127\t\b\2\2\u0126\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128"+
		"\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129D\3\2\2\2\u012a\u012c\t\b\2\2"+
		"\u012b\u012a\3\2\2\2\u012c\u012f\3\2\2\2\u012d\u012b\3\2\2\2\u012d\u012e"+
		"\3\2\2\2\u012e\u0130\3\2\2\2\u012f\u012d\3\2\2\2\u0130\u0132\7\60\2\2"+
		"\u0131\u0133\t\b\2\2\u0132\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0132"+
		"\3\2\2\2\u0134\u0135\3\2\2\2\u0135F\3\2\2\2\u0136\u0137\t\t\2\2\u0137"+
		"H\3\2\2\2\u0138\u013c\7G\2\2\u0139\u013a\7Q\2\2\u013a\u013c\7W\2\2\u013b"+
		"\u0138\3\2\2\2\u013b\u0139\3\2\2\2\u013cJ\3\2\2\2\u013d\u013e\7@\2\2\u013e"+
		"\u013f\7?\2\2\u013fL\3\2\2\2\u0140\u0141\7@\2\2\u0141N\3\2\2\2\u0142\u0143"+
		"\7>\2\2\u0143\u0144\7?\2\2\u0144P\3\2\2\2\u0145\u0146\7>\2\2\u0146R\3"+
		"\2\2\2\u0147\u0148\7?\2\2\u0148\u0149\7?\2\2\u0149T\3\2\2\2\u014a\u014b"+
		"\7#\2\2\u014b\u014c\7?\2\2\u014cV\3\2\2\2\u014d\u0151\7$\2\2\u014e\u0150"+
		"\t\5\2\2\u014f\u014e\3\2\2\2\u0150\u0153\3\2\2\2\u0151\u014f\3\2\2\2\u0151"+
		"\u0152\3\2\2\2\u0152\u0154\3\2\2\2\u0153\u0151\3\2\2\2\u0154\u0155\7$"+
		"\2\2\u0155X\3\2\2\2\u0156\u0157\7<\2\2\u0157\u0158\7?\2\2\u0158Z\3\2\2"+
		"\2\u0159\u015a\7*\2\2\u015a\\\3\2\2\2\u015b\u015c\7+\2\2\u015c^\3\2\2"+
		"\2\u015d\u015e\7<\2\2\u015e`\3\2\2\2\31\2dnv\u0086\u008f\u0098\u009f\u00a9"+
		"\u00b1\u00bc\u00cd\u00d1\u0115\u0117\u0120\u0122\u0128\u012d\u0134\u013b"+
		"\u014f\u0151\7\3\3\2\3\6\3\3\7\4\3\b\5\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}