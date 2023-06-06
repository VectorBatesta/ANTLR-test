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

    public void addTabelaSimbolo(String nome, String tipo, String valor){
        _varSimbolo = new Simbolo(nome, tipo, valor);
        if (_varTabela.exists(nome)){
            System.out.println("\n Erro Semantico: variavel ja declarada" + _varSimbolo.toString());
        }
        else{
            _varTabela.add(_varSimbolo);
        }
    }
}


prog: DELIM PCDEC ListaDeclaracoes DELIM PCPROG;

ListaDeclaracoes [int qtdeDec]: {$qtdeDec=0;}
    (Declaracao
     {$qtdeDec++;}
    )+
    {System.out.println("\n\nA quantidade de declaracoes foi: " + $qtdeDec);} ;

Declaracao: VAR DELIM TipoVar
        {
            addTabelaSimbolo(_input.LT(-3).getText(), _input.LT(-1).getText(), null);
        };

ListaComandos: (comando)+;


Comando: ComandoAtribuicao | ComandoEntrada | ComandoSaida | ComandoCondicao | ComandoRepeticao | SubAlgoritmo;
ComandoAtribuicao: VAR
        {
            if(_varTabela.exists(_input.LT(-1).getText()) == null){
                System.out.println("\n\nVariavel nao declarada " + _input.LT(-1).getText());
            }
        }
    ATRIB ExpressaoAritmetica;
ComandoEntrada: PCLER VAR;
ComandoSaida: PCIMPRIMIR ComandoSaida2;
ComandoSaida2: VAR | CADEIA;
ComandoCondicao: PCSE ExpressaoRelacional PCENTAO Comando (PCSENAO Comando)?;
ComandoRepeticao: PCENQTO ExpressaoRelacional Comando;



//ExpressaoAritmetica → TermoAritmetico ExpressaoAritmetica2;
//ExpressaoAritmetica2 → '+' ExpressaoAritmetica | '-' ExpressaoAritmetica | e;
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
