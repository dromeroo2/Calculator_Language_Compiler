lexer grammar lexerCalc;

// Palabras Reservadas
BEGIN: 'BEGIN' ;
END: 'END' ;
IF: 'IF' ;
THEN: 'THEN' ;
ELSE: 'ELSE' ;
ENDIF: 'ENDIF' ;
WHILE: 'WHILE' ;
ENDWHILE: 'ENDWHILE' ;
FUNC: 'FUNC' ;
ENDFUNC: 'ENDFUNC' ;
RETURN: 'RETURN' ;
PRINT: 'PRINT' ;

// MEJORA: Bucle FOR
FOR: 'FOR' ;
TO: 'TO' ;
DO: 'DO' ;

// Operadores
PLUS: '+' ;
MINUS: '-' ;
TIMES: '*' ;
DIVIDE: '/' ;
MOD: '%' ;
SQRT: 'SQRT' | 'sqrt';
POWER: '^' ;
LPAREN: '(' ;
RPAREN: ')' ;

// Operadores lógicos
LESS: '<' ;
GREATER: '>' ;
EQUALS: '=' ;

// Identificadores
IDENTIFIER: [a-zA-Z_][a-zA-Z0-9_]* ;
NUMBER: '-'? DIGITS ('.' DIGITS)? ;
fragment DIGITS: [0-9]+ ;

// Signos de puntuación
COMMA: ',' ;
SEMICOLON: ';' ;

// MEJORA: Comentarios
LINE_COMMENT: '//' ~[\r\n]* -> skip ;

// Espacios en blanco
WS: [ \t\r\n]+ -> skip ;
