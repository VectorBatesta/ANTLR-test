grammar GyhLang;
@header{
    import java.util.ArrayList;
}

@members{
    private String _varNome;
    private String _varTipo;
    private String _varValor;
    private Simbolo _varSimbolo;
    private TabelaSimbolo _varTabela = new TabelaSimbolo();

    //===
    private GyhProgram program = new GyhProgram();

    private ArrayList<Comando> listCmd = new ArrayList<>();

    
    //===

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
        if(_varTabela.exists(nome){
            System.out.println("\n Erro Semantico: variavel nao declarada: " + nome);
        }
    }
}


//============================================================================
//================================== REGRAS ==================================
//============================================================================

prog: DELIM PCDEC ListaDeclaracoes DELIM PCPROG
    {
        program.setVarTabela(_varTabela);
        program.setComando(listCmd);
        program.generateTarget();
    } ;

ListaDeclaracoes: (Declaracao)+;

Declaracao: VAR DELIM TipoVar
        {
            addTabelaSimbolo(_input.LT(-3).getText(), _input.LT(-1).getText(), null);
        } ;

ListaComandos: (Comando)+;


Comando: ComandoAtribuicao | ComandoEntrada | ComandoSaida | ComandoCondicao | ComandoRepeticao | SubAlgoritmo;
ComandoAtribuicao: VAR
        {
            if(_varTabela.exists(_input.LT(-1).getText()) == null){
                System.out.println("\n\nVariavel nao declarada " + _input.LT(-1).getText());
            }
        }
    ATRIB ExpressaoAritmetica;
ComandoEntrada: PCLER VAR
        {
            verificaVar(_input.LT(-1).getText());
            ComandoLeitura cmd = new ComandoLeitura();
            cmd.setId(_input.LT(-1).getText());
            listCmd.add(cmd);
        } ;
ComandoSaida: PCIMPRIMIR (VAR 
        {
            verificaVar(_input.LT(-1).getText());
            ComandoEscrita cmd = new ComandoEscrita();
            cmd.setId(_input.LT(-1).getText());
            listCmd.add(cmd);
        }
                         | CADEIA);
ComandoCondicao: PCSE ExpressaoRelacional PCENTAO Comando (PCSENAO Comando)?;
ComandoRepeticao: PCENQTO ExpressaoRelacional Comando;



ExpressaoAritmetica: TermoAritmetico (('+' | '-') ExpressaoAritmetica)?;
//TermoAritmetico → FatorAritmetico TermoAritmetico2;
//TermoAritmetico2 → '*' FatorAritmetico TermoAritmetico2 | '/' FatorAritmetico TermoAritmetico2 | e;
//FatorAritmetico → NUMINT | NUMREAL | VARIAVEL | '(' ExpressaoAritmetica ')'
//ExpressaoRelacional → TermoRelacional ExpressaoRelacional2;
//ExpressaoRelacional2 → OperadorBooleano TermoRelacional ExpressaoRelacional2 | e;
//TermoRelacional → ExpressaoAritmetica OP_REL ExpressaoAritmetica | '(' ExpressaoRelacional ')';
//OperadorBooleano → 'E' | 'OU';
//ListaComandos → Comando ListaComandos2;
//ListaComandos2 → ListaComandos | e;
//SubAlgoritmo → 'INI' ListaComandos 'FIM';







TipoVar: PCINT | PCREAL;


PCDEC: 'DEC';
PCPROG : 'PROG';
PCINT : 'INT';
PCLER : 'LER';
PCREAL : 'REAL';
PCIMPRIMIR : 'IMPRIMIR';
PCSE : 'SE';
PCENTAO : 'ENTAO';
PCENQTO : 'ENQTO';
PCINI : 'INI';
PCFIM : 'FIM';

WS: (' ' | '\t' | '\r' | '\n' ) -> skip;

COMMENT: '#' ([A-Z] | [a-z] | [0-9] | ' ' | '\t' | '<' | '\r' | '>')* '\n' -> skip;

VAR: [a-z]([a-z]|[0-9]|[A-Z])*;

NUMINT: [0-9]+;
NUMREAL: [0-9]* ('.') [0-9]+;

OPARIT: '*' | '/' | '+' | '-';
OPBOOL: 'E' | 'OU';
OPMAIOR: '>';
OPMENOR: '<';
OPIGUAL: ('=')('=');

CADEIA: '"' ([A-Z] | [a-z] | [0-9] | ' ' | '\t' | '<' | '\r' | '>')* '"';

ATRIB : ':=';

AbrePar: '(';
FechaPar: ')';

DELIM: ':';
