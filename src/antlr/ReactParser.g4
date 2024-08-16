parser grammar ReactParser ;

options {tokenVocab= ReactLexer ;}


program : importStatment+  functionalDelaration  exportStatement+;

importStatment : IMPORT IDENTIFIER (COMMA O_CARLY IDENTIFIER (COMMA IDENTIFIER)* C_CARLY)? FROM PATH SEMICOLON;
exportStatement : EXPORT IDENTIFIER SEMICOLON ;
                                                               //////////////////////////////////
functionalDelaration: (FUNCTION IDENTIFIER O_BRACKET C_BRACKET|CONST IDENTIFIER EQ ARROW_FUNCTION) O_CARLY functionalbody C_CARLY;
///////// functional body ////////////////

                 //////////////////////////////
functionalbody : (variableDeclaration | hooks | handlerEvent)*  RETURN  O_BRACKET jsxElement C_BRACKET SEMICOLON;


variableDeclaration : (CONST|LET|VAR) IDENTIFIER (EQ expression)? SEMICOLON;
expression: IDENTIFIER|NUMBER|STRING ;

///////////////////////////
hooks : (state|ref|effect);
                                                                                                               //             ///////        //
state :  CONST  O_SQUARE_BRACKET IDENTIFIER COMMA IDENTIFIER  C_SQUARE_BRACKET EQ IDENTIFIER O_BRACKET O_CARLY? (stateFields|expression) C_CARLY? C_BRACKET SEMICOLON ;
ref : CONST IDENTIFIER EQ IDENTIFIER O_BRACKET  parameters? C_BRACKET SEMICOLON;
effect : IDENTIFIER O_BRACKET  ARROW_FUNCTION O_CARLY   CONSOLELOG O_BRACKET STRING (COMMA IDENTIFIER)? C_BRACKET  C_CARLY COMMA  O_SQUARE_BRACKET IDENTIFIER? C_SQUARE_BRACKET C_BRACKET SEMICOLON;

stateFields : IDENTIFIER COLON STRING  (COMMA IDENTIFIER COLON STRING)* ;
////////// method click //////////
handlerEvent :CONST? IDENTIFIER EQ O_BRACKET parameters? C_BRACKET ARROW eventBody ;
parameters : IDENTIFIER (COMMA IDENTIFIER)* ;
                                                  //                                 /////////       //
eventBody : O_CARLY IDENTIFIER  O_BRACKET  O_CARLY? ((IDENTIFIER (COMMA IDENTIFIER)*)|STRING) C_CARLY?  C_BRACKET  SEMICOLON   C_CARLY;


jsxElement : jsxTag
           | jsxSelfCloseTag  ;


jsxSelfCloseTag : JSX_TAG jsxAttributes* SLASH CLOSE_TAG;
jsxTag : JSX_TAG jsxAttributes* CLOSE_TAG  jsxContent* JSX_CLOSE_TAG ;


jsxAttributes : jsxAttribute
              |jsxstyleAttribute
              |jsxsrcAttribute
              ;


jsxContent :  jsxElement
           ////////////////
           | expression
           | O_CARLY IDENTIFIER POINT IDENTIFIER C_CARLY
           ;


jsxAttribute : (ATTRIBUTE attributeValue) ;
jsxstyleAttribute : (STYLE styleValue) ;
jsxsrcAttribute : (SRC srcValue);

attributeValue : STRING
               | jsFunction   ;
styleValue : DOUBLE_O_CARLY IDENTIFIER COLON (NUMBER|STRING) (COMMA IDENTIFIER COLON (NUMBER|STRING))* DOUBLE_C_CARLY ;
srcValue: O_CARLY  REQUIRE O_BRACKET STRING C_BRACKET   C_CARLY
                       | O_CARLY IDENTIFIER POINT IDENTIFIER C_CARLY
                       ;

jsFunction : O_CARLY O_BRACKET C_BRACKET ARROW functionBody  C_CARLY ;
functionBody : IDENTIFIER O_BRACKET arguments  C_BRACKET ;
arguments : STRING (COMMA STRING)* ;





