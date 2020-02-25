grammar Pmm;	

program: expression
       ;

expression: expression ('+'|'-') expression
        | INT_CONSTANT
        | CHAR_CONSTANT
        ;








/*LEXER*/

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



