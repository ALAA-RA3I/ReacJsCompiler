lexer grammar ReactLexer ;

IMPORT : 'import';
FROM : 'from' ;
PATH  : '\'' ( '\\' . | ~[\r\n'] )* '\'';

FUNCTION : 'function' ;

CONST : 'const';
LET : 'let';
VAR : 'var';
CONSOLELOG : 'console.log';
EQ : '=';
STYLE : 'style=' ;
SRC : 'src=' ;
REQUIRE : 'require' ;
EXPORT : 'export default' ;
SEMICOLON : ';' ;
O_SQUARE_BRACKET:'[';
C_SQUARE_BRACKET:']';
O_CARLY : '{' ;
C_CARLY : '}';
DOUBLE_O_CARLY : '{{' ;
DOUBLE_C_CARLY : '}}' ;
O_BRACKET : '(' ;
C_BRACKET : ')' ;
RETURN : 'return' ;
COLON : ':' ;
POINT : '.' ;
ARROW : '=>' ;
ARROW_FUNCTION : '()=> ';
COMMA : ',' ;
NUMBER : [0-9]+ ;
IDENTIFIER : [a-zA-Z_][a-zA-Z0-9_]* ;


STRING : '"' (~["\r\n] | '\\' .)* '"';
WS: [ \t]+ -> channel(HIDDEN) ;
NEW_LINE : [\n\r]+ -> channel(HIDDEN) ;
MULTI_LINE_COMMENT  : '/*' .*? '*/' -> skip;
COMMENT : '//' -> skip ;
SLASH : '/';
JSX_TAG : '<'[a-z0-9]+ ;
CLOSE_TAG : '>'  ;
JSX_CLOSE_TAG :  '</'[a-z0-9]+ '>' ;
ATTRIBUTE: [a-zA-Z]+ '=' ;











