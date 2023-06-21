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
		MAISMENOS=10, VEZESDIV=11, ExpressaoAritmetica=12, TermoAritmetico=13, 
		FatorAritmetico=14, ExpressaoRelacional=15, TermoRelacional=16, SubAlgoritmo=17, 
		OP_REL=18, TipoVar=19, PCDEC=20, PCPROG=21, PCINT=22, PCLER=23, PCREAL=24, 
		PCIMPRIMIR=25, PCSE=26, PCSENAO=27, PCENTAO=28, PCENQTO=29, PCINI=30, 
		PCFIM=31, WS=32, COMMENT=33, VAR=34, NUMINT=35, NUMREAL=36, OPARIT=37, 
		OPBOOL=38, OPMAIORIGUAL=39, OPMAIOR=40, OPMENORIGUAL=41, OPMENOR=42, OPIGUAL=43, 
		OPDIF=44, CADEIA=45, ATRIB=46, AbrePar=47, FechaPar=48, DELIM=49;
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
			"MAISMENOS", "VEZESDIV", "ExpressaoAritmetica", "TermoAritmetico", "FatorAritmetico", 
			"ExpressaoRelacional", "TermoRelacional", "SubAlgoritmo", "OP_REL", "TipoVar", 
			"PCDEC", "PCPROG", "PCINT", "PCLER", "PCREAL", "PCIMPRIMIR", "PCSE", 
			"PCSENAO", "PCENTAO", "PCENQTO", "PCINI", "PCFIM", "WS", "COMMENT", "VAR", 
			"NUMINT", "NUMREAL", "OPARIT", "OPBOOL", "OPMAIORIGUAL", "OPMAIOR", "OPMENORIGUAL", 
			"OPMENOR", "OPIGUAL", "OPDIF", "CADEIA", "ATRIB", "AbrePar", "FechaPar", 
			"DELIM"
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
		case 2:
			ListaComandos_action((RuleContext)_localctx, actionIndex);
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
		case 7:
			ComandoCondicao_action((RuleContext)_localctx, actionIndex);
			break;
		case 8:
			ComandoRepeticao_action((RuleContext)_localctx, actionIndex);
			break;
		case 11:
			ExpressaoAritmetica_action((RuleContext)_localctx, actionIndex);
			break;
		case 12:
			TermoAritmetico_action((RuleContext)_localctx, actionIndex);
			break;
		case 13:
			FatorAritmetico_action((RuleContext)_localctx, actionIndex);
			break;
		case 14:
			ExpressaoRelacional_action((RuleContext)_localctx, actionIndex);
			break;
		case 15:
			TermoRelacional_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void Declaracao_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:

			            if (_varTabela.exists(_input.LT(-3).getText(), _input.LT(-1).getText())){
			                System.out.println("\n\nErro semantico, variavel ja declarada: " + _input.LT(-1).getText());
			            }
			            else{
			                addTabelaSimbolo(_input.LT(-3).getText(), _input.LT(-1).getText(), null);
			            }
			        
			break;
		}
	}
	private void ListaComandos_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:

			            listCmd.addAll(auxList);
			            auxList.removeAll(auxList);
			        
			break;
		}
	}
	private void ComandoAtribuicao_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:

			            if(_varTabela.exists(_input.LT(-1).getText()) == false){
			                System.out.println("\n\nVariavel nao declarada: " + _input.LT(-1).getText());
			            }
			            _varID = _input.LT(-1).getText();
			            _varEXP = "";
			        
			break;
		case 3:

			            auxList.add(new ComandoAtribuicao(_varID, _varEXP));
			        
			break;
		}
	}
	private void ComandoEntrada_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4:

			            verificaVar(_input.LT(-1).getText());
			            ComandoLeitura cmd = new ComandoLeitura();
			            cmd.setId(_input.LT(-1).getText());
			            auxList.add(cmd);
			        
			break;
		}
	}
	private void ComandoSaida_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5:

			            verificaVar(_input.LT(-1).getText());
			            ComandoEscrita cmd = new ComandoEscrita();
			            cmd.setId(_input.LT(-1).getText());
			            auxList.add(cmd);
			        
			break;
		}
	}
	private void ComandoCondicao_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 6:

			            _varEXP = "";
			            _varCOND = "";
			        
			break;
		case 7:

			            _varListTrue.addAll(auxList);
			            auxList.removeAll(auxList);
			        
			break;
		case 8:

			            _varListFalse.addAll(auxList);
			            auxList.removeAll(auxList);
			        
			break;
		case 9:

			            auxList.add(new ComandoCondicao(_varCOND, _varListTrue, _varListFalse));
			        
			break;
		}
	}
	private void ComandoRepeticao_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 10:

			        _varEXP = "";
			        _varREPET = "";
			        _varCOND = "";
			    
			break;
		case 11:

			        _varREPET = _varCOND;
			    
			break;
		case 12:

			        _varListRepet.addAll(auxList);
			        auxList.removeAll(auxList);
			        auxList.add(new ComandoRepeticao(_varREPET, _varListRepet));
			    
			break;
		}
	}
	private void ExpressaoAritmetica_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 13:

			            _varEXP += _input.LT(-1).getText();
			        
			break;
		}
	}
	private void TermoAritmetico_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 14:

			            _varEXP += _input.LT(-1).getText();
			        
			break;
		}
	}
	private void FatorAritmetico_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 15:
			_varEXP += _input.LT(-1).getText();
			break;
		case 16:
			_varEXP += _input.LT(-1).getText();
			break;
		case 17:
			_varEXP += _input.LT(-1).getText();
			break;
		case 18:
			_varEXP += " ( ";
			break;
		case 19:
			_varEXP += " ( ";
			break;
		}
	}
	private void ExpressaoRelacional_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 20:

			            _varCOND += "&&";
			        
			break;
		case 21:

			            _varCOND += "||";
			        
			break;
		}
	}
	private void TermoRelacional_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 22:

			        _varCOND += _varEXP;
			        _varEXP = "";
			    
			break;
		case 23:

			        _varCOND += _input.LT(-1).getText();
			    
			break;
		case 24:

			        _varCOND += _varEXP;
			        _varEXP = "";
			    
			break;
		case 25:

			        _varEXP += "(";
			    
			break;
		case 26:

			        _varEXP += ")";
			    
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\63\u01af\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\3\2\6\2g\n\2\r"+
		"\2\16\2h\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\6\4s\n\4\r\4\16\4t\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\5\5}\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\3\b\5\b\u008e\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5"+
		"\t\u009a\n\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r"+
		"\3\r\3\r\3\r\3\r\7\r\u00ae\n\r\f\r\16\r\u00b1\13\r\3\16\3\16\3\16\3\16"+
		"\3\16\7\16\u00b8\n\16\f\16\16\16\u00bb\13\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00cc\n\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00d5\n\20\3\20\7\20\u00d8\n\20\f"+
		"\20\16\20\u00db\13\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\5\21\u00ea\n\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\5\23\u00f6\n\23\3\24\3\24\5\24\u00fa\n\24\3\25\3\25\3\25\3"+
		"\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3"+
		"\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3"+
		"\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3!\3"+
		"!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\7\"\u0166\n\"\f\"\16\"\u0169\13\""+
		"\3\"\3\"\3\"\3\"\3#\3#\7#\u0171\n#\f#\16#\u0174\13#\3$\6$\u0177\n$\r$"+
		"\16$\u0178\3%\7%\u017c\n%\f%\16%\u017f\13%\3%\3%\6%\u0183\n%\r%\16%\u0184"+
		"\3&\3&\3\'\3\'\3\'\5\'\u018c\n\'\3(\3(\3(\3)\3)\3*\3*\3*\3+\3+\3,\3,\3"+
		",\3-\3-\3-\3.\3.\7.\u01a0\n.\f.\16.\u01a3\13.\3.\3.\3/\3/\3/\3\60\3\60"+
		"\3\61\3\61\3\62\3\62\2\2\63\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32"+
		"\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a"+
		"\62c\63\3\2\n\4\2--//\4\2,,\61\61\5\2\13\f\17\17\"\"\n\2\13\13\17\17\""+
		"\"\62;>>@@C\\c|\3\2c|\5\2\62;C\\c|\3\2\62;\5\2,-//\61\61\2\u01e0\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2"+
		"%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61"+
		"\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2"+
		"\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I"+
		"\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2"+
		"\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2"+
		"\2c\3\2\2\2\3f\3\2\2\2\5j\3\2\2\2\7r\3\2\2\2\t|\3\2\2\2\13~\3\2\2\2\r"+
		"\u0084\3\2\2\2\17\u0088\3\2\2\2\21\u008f\3\2\2\2\23\u009d\3\2\2\2\25\u00a4"+
		"\3\2\2\2\27\u00a6\3\2\2\2\31\u00a8\3\2\2\2\33\u00b2\3\2\2\2\35\u00cb\3"+
		"\2\2\2\37\u00cd\3\2\2\2!\u00e9\3\2\2\2#\u00eb\3\2\2\2%\u00f5\3\2\2\2\'"+
		"\u00f9\3\2\2\2)\u00fb\3\2\2\2+\u00ff\3\2\2\2-\u0104\3\2\2\2/\u0108\3\2"+
		"\2\2\61\u010c\3\2\2\2\63\u0111\3\2\2\2\65\u011a\3\2\2\2\67\u011d\3\2\2"+
		"\29\u0123\3\2\2\2;\u0129\3\2\2\2=\u012f\3\2\2\2?\u0133\3\2\2\2A\u0137"+
		"\3\2\2\2C\u013b\3\2\2\2E\u016e\3\2\2\2G\u0176\3\2\2\2I\u017d\3\2\2\2K"+
		"\u0186\3\2\2\2M\u018b\3\2\2\2O\u018d\3\2\2\2Q\u0190\3\2\2\2S\u0192\3\2"+
		"\2\2U\u0195\3\2\2\2W\u0197\3\2\2\2Y\u019a\3\2\2\2[\u019d\3\2\2\2]\u01a6"+
		"\3\2\2\2_\u01a9\3\2\2\2a\u01ab\3\2\2\2c\u01ad\3\2\2\2eg\5\5\3\2fe\3\2"+
		"\2\2gh\3\2\2\2hf\3\2\2\2hi\3\2\2\2i\4\3\2\2\2jk\5E#\2kl\5c\62\2lm\5\'"+
		"\24\2mn\b\3\2\2n\6\3\2\2\2op\5\t\5\2pq\b\4\3\2qs\3\2\2\2ro\3\2\2\2st\3"+
		"\2\2\2tr\3\2\2\2tu\3\2\2\2u\b\3\2\2\2v}\5\13\6\2w}\5\r\7\2x}\5\17\b\2"+
		"y}\5\21\t\2z}\5\23\n\2{}\5#\22\2|v\3\2\2\2|w\3\2\2\2|x\3\2\2\2|y\3\2\2"+
		"\2|z\3\2\2\2|{\3\2\2\2}\n\3\2\2\2~\177\5E#\2\177\u0080\b\6\4\2\u0080\u0081"+
		"\5]/\2\u0081\u0082\5\31\r\2\u0082\u0083\b\6\5\2\u0083\f\3\2\2\2\u0084"+
		"\u0085\5/\30\2\u0085\u0086\5E#\2\u0086\u0087\b\7\6\2\u0087\16\3\2\2\2"+
		"\u0088\u008d\5\63\32\2\u0089\u008a\5E#\2\u008a\u008b\b\b\7\2\u008b\u008e"+
		"\3\2\2\2\u008c\u008e\5[.\2\u008d\u0089\3\2\2\2\u008d\u008c\3\2\2\2\u008e"+
		"\20\3\2\2\2\u008f\u0090\5\65\33\2\u0090\u0091\b\t\b\2\u0091\u0092\5\37"+
		"\20\2\u0092\u0093\59\35\2\u0093\u0094\5\t\5\2\u0094\u0099\b\t\t\2\u0095"+
		"\u0096\5\67\34\2\u0096\u0097\5\t\5\2\u0097\u0098\b\t\n\2\u0098\u009a\3"+
		"\2\2\2\u0099\u0095\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009b\3\2\2\2\u009b"+
		"\u009c\b\t\13\2\u009c\22\3\2\2\2\u009d\u009e\5;\36\2\u009e\u009f\b\n\f"+
		"\2\u009f\u00a0\5\37\20\2\u00a0\u00a1\b\n\r\2\u00a1\u00a2\5\t\5\2\u00a2"+
		"\u00a3\b\n\16\2\u00a3\24\3\2\2\2\u00a4\u00a5\t\2\2\2\u00a5\26\3\2\2\2"+
		"\u00a6\u00a7\t\3\2\2\u00a7\30\3\2\2\2\u00a8\u00af\5\33\16\2\u00a9\u00aa"+
		"\5\25\13\2\u00aa\u00ab\b\r\17\2\u00ab\u00ac\5\31\r\2\u00ac\u00ae\3\2\2"+
		"\2\u00ad\u00a9\3\2\2\2\u00ae\u00b1\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0"+
		"\3\2\2\2\u00b0\32\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2\u00b9\5\35\17\2\u00b3"+
		"\u00b4\5\27\f\2\u00b4\u00b5\b\16\20\2\u00b5\u00b6\5\35\17\2\u00b6\u00b8"+
		"\3\2\2\2\u00b7\u00b3\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9"+
		"\u00ba\3\2\2\2\u00ba\34\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc\u00bd\5G$\2"+
		"\u00bd\u00be\b\17\21\2\u00be\u00cc\3\2\2\2\u00bf\u00c0\5I%\2\u00c0\u00c1"+
		"\b\17\22\2\u00c1\u00cc\3\2\2\2\u00c2\u00c3\5E#\2\u00c3\u00c4\b\17\23\2"+
		"\u00c4\u00cc\3\2\2\2\u00c5\u00c6\7*\2\2\u00c6\u00c7\b\17\24\2\u00c7\u00c8"+
		"\5\31\r\2\u00c8\u00c9\7+\2\2\u00c9\u00ca\b\17\25\2\u00ca\u00cc\3\2\2\2"+
		"\u00cb\u00bc\3\2\2\2\u00cb\u00bf\3\2\2\2\u00cb\u00c2\3\2\2\2\u00cb\u00c5"+
		"\3\2\2\2\u00cc\36\3\2\2\2\u00cd\u00d9\5!\21\2\u00ce\u00cf\7G\2\2\u00cf"+
		"\u00d5\b\20\26\2\u00d0\u00d1\7Q\2\2\u00d1\u00d2\7W\2\2\u00d2\u00d3\3\2"+
		"\2\2\u00d3\u00d5\b\20\27\2\u00d4\u00ce\3\2\2\2\u00d4\u00d0\3\2\2\2\u00d5"+
		"\u00d6\3\2\2\2\u00d6\u00d8\5!\21\2\u00d7\u00d4\3\2\2\2\u00d8\u00db\3\2"+
		"\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da \3\2\2\2\u00db\u00d9"+
		"\3\2\2\2\u00dc\u00dd\5\31\r\2\u00dd\u00de\b\21\30\2\u00de\u00df\5%\23"+
		"\2\u00df\u00e0\b\21\31\2\u00e0\u00e1\5\31\r\2\u00e1\u00e2\b\21\32\2\u00e2"+
		"\u00ea\3\2\2\2\u00e3\u00e4\7*\2\2\u00e4\u00e5\b\21\33\2\u00e5\u00e6\5"+
		"\37\20\2\u00e6\u00e7\7+\2\2\u00e7\u00e8\b\21\34\2\u00e8\u00ea\3\2\2\2"+
		"\u00e9\u00dc\3\2\2\2\u00e9\u00e3\3\2\2\2\u00ea\"\3\2\2\2\u00eb\u00ec\5"+
		"=\37\2\u00ec\u00ed\5\7\4\2\u00ed\u00ee\5? \2\u00ee$\3\2\2\2\u00ef\u00f6"+
		"\5S*\2\u00f0\u00f6\5W,\2\u00f1\u00f6\5Q)\2\u00f2\u00f6\5O(\2\u00f3\u00f6"+
		"\5Y-\2\u00f4\u00f6\5U+\2\u00f5\u00ef\3\2\2\2\u00f5\u00f0\3\2\2\2\u00f5"+
		"\u00f1\3\2\2\2\u00f5\u00f2\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f4\3\2"+
		"\2\2\u00f6&\3\2\2\2\u00f7\u00fa\5-\27\2\u00f8\u00fa\5\61\31\2\u00f9\u00f7"+
		"\3\2\2\2\u00f9\u00f8\3\2\2\2\u00fa(\3\2\2\2\u00fb\u00fc\7F\2\2\u00fc\u00fd"+
		"\7G\2\2\u00fd\u00fe\7E\2\2\u00fe*\3\2\2\2\u00ff\u0100\7R\2\2\u0100\u0101"+
		"\7T\2\2\u0101\u0102\7Q\2\2\u0102\u0103\7I\2\2\u0103,\3\2\2\2\u0104\u0105"+
		"\7K\2\2\u0105\u0106\7P\2\2\u0106\u0107\7V\2\2\u0107.\3\2\2\2\u0108\u0109"+
		"\7N\2\2\u0109\u010a\7G\2\2\u010a\u010b\7T\2\2\u010b\60\3\2\2\2\u010c\u010d"+
		"\7T\2\2\u010d\u010e\7G\2\2\u010e\u010f\7C\2\2\u010f\u0110\7N\2\2\u0110"+
		"\62\3\2\2\2\u0111\u0112\7K\2\2\u0112\u0113\7O\2\2\u0113\u0114\7R\2\2\u0114"+
		"\u0115\7T\2\2\u0115\u0116\7K\2\2\u0116\u0117\7O\2\2\u0117\u0118\7K\2\2"+
		"\u0118\u0119\7T\2\2\u0119\64\3\2\2\2\u011a\u011b\7U\2\2\u011b\u011c\7"+
		"G\2\2\u011c\66\3\2\2\2\u011d\u011e\7U\2\2\u011e\u011f\7G\2\2\u011f\u0120"+
		"\7P\2\2\u0120\u0121\7C\2\2\u0121\u0122\7Q\2\2\u01228\3\2\2\2\u0123\u0124"+
		"\7G\2\2\u0124\u0125\7P\2\2\u0125\u0126\7V\2\2\u0126\u0127\7C\2\2\u0127"+
		"\u0128\7Q\2\2\u0128:\3\2\2\2\u0129\u012a\7G\2\2\u012a\u012b\7P\2\2\u012b"+
		"\u012c\7S\2\2\u012c\u012d\7V\2\2\u012d\u012e\7Q\2\2\u012e<\3\2\2\2\u012f"+
		"\u0130\7K\2\2\u0130\u0131\7P\2\2\u0131\u0132\7K\2\2\u0132>\3\2\2\2\u0133"+
		"\u0134\7H\2\2\u0134\u0135\7K\2\2\u0135\u0136\7O\2\2\u0136@\3\2\2\2\u0137"+
		"\u0138\t\4\2\2\u0138\u0139\3\2\2\2\u0139\u013a\b!\35\2\u013aB\3\2\2\2"+
		"\u013b\u0167\7%\2\2\u013c\u0166\t\5\2\2\u013d\u013e\7\u00c5\2\2\u013e"+
		"\u0166\7\u00a3\2\2\u013f\u0140\7\u00c5\2\2\u0140\u0166\7\uffff\2\2\u0141"+
		"\u0142\7\u00c5\2\2\u0142\u0166\7\u00ab\2\2\u0143\u0144\7\u00c5\2\2\u0144"+
		"\u0166\7\u2032\2\2\u0145\u0146\7\u00c5\2\2\u0146\u0166\7\u00af\2\2\u0147"+
		"\u0148\7\u00c5\2\2\u0148\u0166\7\uffff\2\2\u0149\u014a\7\u00c5\2\2\u014a"+
		"\u0166\7\u00b5\2\2\u014b\u014c\7\u00c5\2\2\u014c\u0166\7\u201e\2\2\u014d"+
		"\u014e\7\u00c5\2\2\u014e\u0166\7\u00bc\2\2\u014f\u0150\7\u00c5\2\2\u0150"+
		"\u0166\7\u0163\2\2\u0151\u0152\7\u00c5\2\2\u0152\u0166\7\u00a5\2\2\u0153"+
		"\u0154\7\u00c5\2\2\u0154\u0166\7\u0194\2\2\u0155\u0156\7\u00c5\2\2\u0156"+
		"\u0166\7\u00b7\2\2\u0157\u0158\7\u00c5\2\2\u0158\u0166\7\u2024\2\2\u0159"+
		"\u015a\7\u00c5\2\2\u015a\u0166\7\u00a4\2\2\u015b\u015c\7\u00c5\2\2\u015c"+
		"\u0166\7\u201c\2\2\u015d\u015e\7\u00c5\2\2\u015e\u0166\7\u00ac\2\2\u015f"+
		"\u0160\7\u00c5\2\2\u0160\u0166\7\u0162\2\2\u0161\u0162\7\u00c5\2\2\u0162"+
		"\u0166\7\u00b6\2\2\u0163\u0164\7\u00c5\2\2\u0164\u0166\7\u201f\2\2\u0165"+
		"\u013c\3\2\2\2\u0165\u013d\3\2\2\2\u0165\u013f\3\2\2\2\u0165\u0141\3\2"+
		"\2\2\u0165\u0143\3\2\2\2\u0165\u0145\3\2\2\2\u0165\u0147\3\2\2\2\u0165"+
		"\u0149\3\2\2\2\u0165\u014b\3\2\2\2\u0165\u014d\3\2\2\2\u0165\u014f\3\2"+
		"\2\2\u0165\u0151\3\2\2\2\u0165\u0153\3\2\2\2\u0165\u0155\3\2\2\2\u0165"+
		"\u0157\3\2\2\2\u0165\u0159\3\2\2\2\u0165\u015b\3\2\2\2\u0165\u015d\3\2"+
		"\2\2\u0165\u015f\3\2\2\2\u0165\u0161\3\2\2\2\u0165\u0163\3\2\2\2\u0166"+
		"\u0169\3\2\2\2\u0167\u0165\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u016a\3\2"+
		"\2\2\u0169\u0167\3\2\2\2\u016a\u016b\7\f\2\2\u016b\u016c\3\2\2\2\u016c"+
		"\u016d\b\"\35\2\u016dD\3\2\2\2\u016e\u0172\t\6\2\2\u016f\u0171\t\7\2\2"+
		"\u0170\u016f\3\2\2\2\u0171\u0174\3\2\2\2\u0172\u0170\3\2\2\2\u0172\u0173"+
		"\3\2\2\2\u0173F\3\2\2\2\u0174\u0172\3\2\2\2\u0175\u0177\t\b\2\2\u0176"+
		"\u0175\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u0176\3\2\2\2\u0178\u0179\3\2"+
		"\2\2\u0179H\3\2\2\2\u017a\u017c\t\b\2\2\u017b\u017a\3\2\2\2\u017c\u017f"+
		"\3\2\2\2\u017d\u017b\3\2\2\2\u017d\u017e\3\2\2\2\u017e\u0180\3\2\2\2\u017f"+
		"\u017d\3\2\2\2\u0180\u0182\7\60\2\2\u0181\u0183\t\b\2\2\u0182\u0181\3"+
		"\2\2\2\u0183\u0184\3\2\2\2\u0184\u0182\3\2\2\2\u0184\u0185\3\2\2\2\u0185"+
		"J\3\2\2\2\u0186\u0187\t\t\2\2\u0187L\3\2\2\2\u0188\u018c\7G\2\2\u0189"+
		"\u018a\7Q\2\2\u018a\u018c\7W\2\2\u018b\u0188\3\2\2\2\u018b\u0189\3\2\2"+
		"\2\u018cN\3\2\2\2\u018d\u018e\7@\2\2\u018e\u018f\7?\2\2\u018fP\3\2\2\2"+
		"\u0190\u0191\7@\2\2\u0191R\3\2\2\2\u0192\u0193\7>\2\2\u0193\u0194\7?\2"+
		"\2\u0194T\3\2\2\2\u0195\u0196\7>\2\2\u0196V\3\2\2\2\u0197\u0198\7?\2\2"+
		"\u0198\u0199\7?\2\2\u0199X\3\2\2\2\u019a\u019b\7#\2\2\u019b\u019c\7?\2"+
		"\2\u019cZ\3\2\2\2\u019d\u01a1\7$\2\2\u019e\u01a0\t\5\2\2\u019f\u019e\3"+
		"\2\2\2\u01a0\u01a3\3\2\2\2\u01a1\u019f\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2"+
		"\u01a4\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a4\u01a5\7$\2\2\u01a5\\\3\2\2\2"+
		"\u01a6\u01a7\7<\2\2\u01a7\u01a8\7?\2\2\u01a8^\3\2\2\2\u01a9\u01aa\7*\2"+
		"\2\u01aa`\3\2\2\2\u01ab\u01ac\7+\2\2\u01acb\3\2\2\2\u01ad\u01ae\7<\2\2"+
		"\u01aed\3\2\2\2\32\2ht|\u008d\u0099\u00af\u00b9\u00cb\u00d4\u00d9\u00e9"+
		"\u00f5\u00f9\u0165\u0167\u0170\u0172\u0178\u017d\u0184\u018b\u019f\u01a1"+
		"\36\3\3\2\3\4\3\3\6\4\3\6\5\3\7\6\3\b\7\3\t\b\3\t\t\3\t\n\3\t\13\3\n\f"+
		"\3\n\r\3\n\16\3\r\17\3\16\20\3\17\21\3\17\22\3\17\23\3\17\24\3\17\25\3"+
		"\20\26\3\20\27\3\21\30\3\21\31\3\21\32\3\21\33\3\21\34\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}