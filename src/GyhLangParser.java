// Generated from GyhLang.g4 by ANTLR 4.7.2

    import java.util.ArrayList;

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
		ListaDeclaracoes=1, Declaracao=2, ListaComandos=3, Comando=4, ComandoAtribuicao=5, 
		ComandoEntrada=6, ComandoSaida=7, ComandoCondicao=8, ComandoRepeticao=9, 
		MAISMENOS=10, VEZESDIV=11, ExpressaoAritmetica=12, TermoAritmetico=13, 
		FatorAritmetico=14, ExpressaoRelacional=15, TermoRelacional=16, SubAlgoritmo=17, 
		OP_REL=18, TipoVar=19, PCDEC=20, PCPROG=21, PCINT=22, PCLER=23, PCREAL=24, 
		PCIMPRIMIR=25, PCSE=26, PCSENAO=27, PCENTAO=28, PCENQTO=29, PCINI=30, 
		PCFIM=31, WS=32, COMMENT=33, VAR=34, NUMINT=35, NUMREAL=36, OPARIT=37, 
		OPBOOL=38, OPMAIORIGUAL=39, OPMAIOR=40, OPMENORIGUAL=41, OPMENOR=42, OPIGUAL=43, 
		OPDIF=44, CADEIA=45, ATRIB=46, AbrePar=47, FechaPar=48, DELIM=49;
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
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "'DEC'", "'PROG'", "'INT'", 
			"'LER'", "'REAL'", "'IMPRIMIR'", "'SE'", "'SENAO'", "'ENTAO'", "'ENQTO'", 
			"'INI'", "'FIM'", null, null, null, null, null, null, null, "'>='", "'>'", 
			"'<='", "'<'", null, "'!='", null, "':='", "'('", "')'", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ListaDeclaracoes", "Declaracao", "ListaComandos", "Comando", "ComandoAtribuicao", 
			"ComandoEntrada", "ComandoSaida", "ComandoCondicao", "ComandoRepeticao", 
			"MAISMENOS", "VEZESDIV", "ExpressaoAritmetica", "TermoAritmetico", "FatorAritmetico", 
			"ExpressaoRelacional", "TermoRelacional", "SubAlgoritmo", "OP_REL", "TipoVar", 
			"PCDEC", "PCPROG", "PCINT", "PCLER", "PCREAL", "PCIMPRIMIR", "PCSE", 
			"PCSENAO", "PCENTAO", "PCENQTO", "PCINI", "PCFIM", "WS", "COMMENT", "VAR", 
			"NUMINT", "NUMREAL", "OPARIT", "OPBOOL", "OPMAIORIGUAL", "OPMAIOR", "OPMENORIGUAL", 
			"OPMENOR", "OPIGUAL", "OPDIF", "CADEIA", "ATRIB", "AbrePar", "FechaPar", 
			"DELIM"
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


	    private String _varNome;
	    private String _varTipo;
	    private String _varValor;
	    private Simbolo _varSimbolo;
	    private TabelaSimbolo _varTabela = new TabelaSimbolo();

	    //===
	    private GyhProgram program = new GyhProgram();

	    private ArrayList<Comando> listCmd = new ArrayList<>();
	    private ArrayList<Comando> auxList = new ArrayList<>();

	    //cond
	    private String _varCOND;
	    private ArrayList<Comando> _varListTrue = new ArrayList<>();
	    private ArrayList<Comando> _varListFalse = new ArrayList<>();

	    //repet
	    private String _varREPET;
	    private ArrayList<Comando> _varListRepet = new ArrayList<>();
	    
	    //atrib
	    private String _varID;
	    private String _varEXP;

	    
	    
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
	        if(_varTabela.exists(nome) == false){
	            System.out.println("\n Erro Semantico: variavel nao declarada: " + nome);
	        }
	    }

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
		public TerminalNode ListaComandos() { return getToken(GyhLangParser.ListaComandos, 0); }
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
			setState(7);
			match(ListaComandos);

			        program.setVarTabela(_varTabela);
			        program.setComando(listCmd);
			        program.generateTarget();
			    
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\63\r\4\2\t\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\2\2\3\2\2\2\2\13\2\4\3\2\2\2\4\5\7\63"+
		"\2\2\5\6\7\26\2\2\6\7\7\3\2\2\7\b\7\63\2\2\b\t\7\27\2\2\t\n\7\5\2\2\n"+
		"\13\b\2\1\2\13\3\3\2\2\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}