grammar Calc;

// syntactic rules

program  : funcDef* body EOF
         ;
funcDef  : head body
         ;
head     : functionId '(' variableId* ')'
         ;
body     : varDef* expression
         ;
varDef   : variableId '=' expression
         ;
expression : LITERAL #IntLit
           | BOOLEAN #BoolLit
           | functionId '(' expression* ')' #FunCall
           | variableId #Var
           | ('-' | '!') expression #UnExp
           | expression ('*' | '/') expression #BinExp
           | <assoc = right> expression ('&&' | '||') expression #BinExp
           | expression ('-' | '+' | '>' | '<' | '>=' | '<=' | '==' | '!=') expression #BinExp
           | '(' expression ')' # ParenthesisExp
           | <assoc = right> expression '?' expression ':' expression #CondExp
           ;

variableId : IDENTIFIER
           ;
functionId : IDENTIFIER
           ;

// lexical rules

// OP       : '+' | '*' | '/' | '==' | '<' | '>=' | '!=' | '||' | '&&' | '<=' | '>' | '-'
//         ;
LITERAL  : '0' | ('1'..'9')('0'..'9')*
         ;
BOOLEAN  : 'true' | 'false'
         ;
IDENTIFIER : ('a'..'z')('a'..'z' | '0'..'9')*
         ;
WS       : [ \t\n\r]+ -> channel(HIDDEN)
         ;
LINE_COMMENT : '//' ~'\n'* '\n' -> channel(HIDDEN)
         ;

