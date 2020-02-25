grammar Pmm;	

program: varDefinition funcDefinition
       ;

//-----------EXPRESSIONS---------//
expression: '(' expression ')'
        | expression '[' expression ']' // vector[1][2]
        | expression '.' ID //always .ID eg p[].field or p.field[]. Field is an ID. and ID.ID is expr. and expr[] is expr.
        | '(' type ')' expression //casting
        | '-' expression
        | '!' expression
        | expression ('*'|'/'|'%') expression
        | expression ('+'|'-') expression
        | expression ('>'|'>='|'<'|'<='|'!='|'==') expression
        | expression ('&&'|'||') expression
        | expression ('=') expression
        | funcInvocation //invocation as an expression
        | INT_CONSTANT
        | CHAR_CONSTANT
        | REAL_CONSTANT
        | ID
        ;

//-----------STATEMENTS---------//
statement: (PRINT|INPUT) expression (',' expression)* ';'
        | RETURN expression ';' //return only goes followed by one expr.
        | funcInvocation ';' //invocations as an statement. Always with ; at the end.
        | expression '=' expression ';'
        | 'while' expression ':' (statement |'{' statement+ '}')
        | 'if' expression ':' statement+ ('else' statement+)*
        ;

//-----------TYPE----------//
type: 'int'
    | 'char'
    | 'double'
    | 'void'
    | ('['INT_CONSTANT']')+ type //array
    | STRUCT '{' recordField+ '}' //record
    ;

//-----------DEFINITIONS-----------//
varDefinition: oneVariable
            | multipleVariables
            ;

oneVariable: ID ':' type ;

multipleVariables: ID (',' ID)+ ':' type ;

recordField: varDefinition ';' ; //only used while defining records

funcDefinition: DEF ID  params ':' type? '{' funcBody '}';

funcBody : (varDefinition';')* statement* ;


params: '(' ')' //could be empty -no parameters-
        | '(' oneVariable (',' oneVariable)* ')' //could have one or more parameters (one variable declarations).
        ;


//-----------INVOCATION-----------//
funcInvocation : ID '(' (expression (',' expression)*)? ')' ; //could be empty

//procInvocation ?????

/*LEXER*/
PRINT: 'print'
    ;

RETURN: 'return'
    ;

INPUT: 'input'
    ;

DEF: 'def'
    ;

STRUCT: 'struct'
    ;

ONE_LINE_COMMENT: '#' ~[\r\n\f]* -> skip
        ;

COMMENT: '"""' .*? '"""' -> skip
        ;

WHITESPACE: [ \t\r\n\fEOF]+ -> skip
        ;

INT_CONSTANT: '0'
            | [1-9][0-9]*
            ;

REAL_CONSTANT: INT_CONSTANT? ('.') [0-9]+
               | INT_CONSTANT '.'
               | INT_CONSTANT [eE] [+-]? [0-9]+
               | INT_CONSTANT '.' [0-9]* [eE] [+-]? [0-9]+
               ;


CHAR_CONSTANT:  '\'' [a-zA-Z] '\''
                |'\'' '.' '\''
                | '\'' '\\' INT_CONSTANT INT_CONSTANT INT_CONSTANT'\''
                | '\'' '\\n' '\''
                | '\'' '\\t' '\''
                | '\'' '-' '\''
                | '\'' '~' '\''
            ;

ID: [a-zA-Z_][a-zA-Z0-9_]*
    ;



