grammar GyhLang;

prog: DELIM PCDEC ListaDeclaracoes DELIM PCPROG;

ListaDeclaracoes: (Declaracao {System.out.println("declareixon!!");}
    )+;

Declaracao: VAR DELIM TipoVar {System.out.println(_input.LT(-3).getText());};

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
