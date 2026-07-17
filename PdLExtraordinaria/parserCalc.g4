parser grammar parserCalc;

options { tokenVocab=lexerCalc; }

// Regla principal del programa
program: statement+ EOF ;

// Reglas para construcciones
statement
    : function                  #ElementoFuncion
    | beginStatement            #ElementoBegin
    | functionCallStatement     #ElementoLlamadaFuncion
    ;

// Función
function
    : FUNC IDENTIFIER LPAREN param? RPAREN (beginStatement | sentence | expression)+ ENDFUNC SEMICOLON #DefinicionFuncion
    ;

// Parámetros que llevará una función
param: IDENTIFIER (COMMA IDENTIFIER)* ;

// Llamada a función
functionCallStatement
    : IDENTIFIER LPAREN args? RPAREN SEMICOLON #LlamadaFuncion
    ;

// Argumentos de una llamada a función
args: expression (COMMA expression)* ;

// Enunciado Begin...End
beginStatement
    : BEGIN sentence+ END SEMICOLON #BloqueBegin
    ;

// Sentencias de Asignación, Control de Flujo, Funciones predefinidas y Llamadas a funciones
sentence
    : asignStatement            #SentenciaAsignacion
    | ifStatement               #SentenciaIf
    | whileStatement            #SentenciaWhile
    | forStatement              #SentenciaFor
    | returnStatement           #SentenciaReturn
    | printStatement            #SentenciaPrint
    | functionCallStatement     #SentenciaLlamadaFuncion
    ;

// Sentencia Asignación
asignStatement: IDENTIFIER EQUALS expression SEMICOLON ;

// Sentencia IF / ELSE
ifStatement: IF LPAREN condition RPAREN THEN (sentence | expression)+ (ELSE (sentence | expression)+ )? ENDIF SEMICOLON ;

// Sentencia While
whileStatement: WHILE LPAREN condition RPAREN (sentence | expression)* ENDWHILE SEMICOLON ;

// MEJORA: Sentencia For
forStatement: FOR IDENTIFIER EQUALS expression TO expression DO beginStatement ;

// Sentencia Return
returnStatement: RETURN expression SEMICOLON ;

// Sentencia Print
printStatement: PRINT expression SEMICOLON ;

// Condición Lógica
condition
    : expression compOperator expression    #CondicionComparacion
    ;

// Operadores de Comparación
compOperator
    : GREATER
    | LESS
    | EQUALS
    ;

// Expresiones Aritméticas, Lógicas, Llamada a función, Variables y Números
expression
    : expression op=(PLUS | MINUS) expression           #SumaResta
    | expression op=(TIMES | DIVIDE | MOD) expression   #MultDivMod
    | expression POWER expression                       #Potencia
    | MINUS expression                                  #Negacion
    | SQRT LPAREN expression RPAREN                     #RaizCuadrada
    | LPAREN expression RPAREN                          #Parentesis
    | IDENTIFIER LPAREN args? RPAREN                    #LlamadaFuncionExpr
    | IDENTIFIER                                        #Variable
    | NUMBER                                            #Numero
    ;
