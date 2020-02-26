grammar Pmm;	

@header
{
    import ast.*;
    import ast.expression.*;
    import ast.type.*;
}

program returns [Program ast]: (varDefinition';')* funcDefinition* mainDefinition //main always goes at the end and is mandatory
       ;

//-----------EXPRESSIONS---------//
expression returns [Expression ast]
        : '(' expression ')' {$ast = $expression.ast;}
        | e1=expression '[' e2=expression ']' {$ast = new ArrayAccess($e1.start.getLine(), $e1.start.getCharPositionInLine()+1, $e1.ast, $e2.ast);}
        // vector[1][2] expr[2] expr[expr]
        | expression '.' ID {$ast = new FieldAccess($expression.start.getLine(),$expression.start.getCharPositionInLine()+1, $expression.ast, $ID.text);}
        //always .ID eg p[].field or p.field[]. Field is an ID. and ID.ID is expr. and expr[] is expr.
        | par='(' type ')' expression {$ast = new Cast($par.getLine(), $par.getCharPositionInLine()+1, $type.ast, $expression.ast);}
        //casting
        | operator='-' expression {$ast = new UnaryMinus($operator.getLine(),$operator.getCharPositionInLine()+1,$expression.ast);}
        | operator='!' expression {$ast = new Negation($operator.getLine(),$operator.getCharPositionInLine()+1,$expression.ast);}
        | e1=expression operator=('*'|'/'|'%') e2=expression {$ast = new Arithmetic($e1.start.getLine(), $e1.start.getgetCharPositionInLine()+1, $e1.ast, $operator.text, $e2.ast);}
        | e1=expression operator=('+'|'-') e2=expression {$ast = new Arithmetic($e1.start.getLine(), $e1.start.getgetCharPositionInLine()+1, $e1.ast, $operator.text, $e2.ast);}
        | e1=expression operator=('>'|'>='|'<'|'<='|'!='|'==') e2=expression {$ast = new Arithmetic($e1.start.getLine(), $e1.start.getgetCharPositionInLine()+1, $e1.ast, $operator.text, $e2.ast);}
        | e1=expression operator=('&&'|'||') e2=expression {$ast = new Arithmetic($e1.start.getLine(), $e1.start.getgetCharPositionInLine()+1, $e1.ast, $operator.text, $e2.ast);}
        | funcInvocation {} //invocation as an expression
        | INT_CONSTANT {$ast = new IntLiteral($INT_CONSTANT.getLine(), $INT_CONSTANT.getCharPositionInLine() + 1, LexerHelper.lexemeToInt($INT_CONSTANT.text));}
        | CHAR_CONSTANT {$ast = new CharLiteral($CHAR_CONSTANT.getLine(), $CHAR_CONSTANT.getCharPositionInLine() + 1, LexerHelper.lexemeToChar($CHAR_CONSTANT.text));}
        | REAL_CONSTANT {$ast = new RealLiteral($REAL_CONSTANT.getLine(),$REAL_CONSTANT.getCharPositionInLine() + 1, LexerHelper.lexemeToReal($REAL_CONSTANT.text));}
        | ID {$ast = new Variable($ID.getLine(), $ID.getCharPositionInLine() + 1, $ID.text);}
        ;

expressions: expression (',' expression)* ;

//-----------STATEMENTS---------//
statement //devuelve una lista
        : PRINT  expressions';'
        | INPUT expressions';'
        | RETURN expression';' //return only goes followed by one expr.
        | funcInvocation ';' //invocations as an statement. Always with ; at the end. This is a procedure.
        | expression '=' expression ';'
        | 'while' expression ':' whileBody //could break this down into parts if it gets too messy looking
        | 'if' expression ':' ifBody //same as while
        ;

whileBody: body ;

ifBody: body ('else' body)* ;

body: (statement |'{'statement'}' |'{' statement+ '}') ;
//-----------TYPE----------//
type returns [Type ast]
    : 'int'
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

mainDefinition: DEF MAIN '(' ')' ':' '{' funcBody '}' ; //receives no parameters and always returns void.

//-----------INVOCATION-----------//
funcInvocation : ID '(' expressions? ')' ; //could be empty. ALSO break it down if it gets messy.

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

MAIN: 'main'
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


CHAR_CONSTANT:  '\'' . '\''
                |'\'' '.' '\''
                | '\'' '\\' INT_CONSTANT INT_CONSTANT INT_CONSTANT'\''
                | '\'' '\\n' '\''
                | '\'' '\\t' '\''
                | '\'' '-' '\''
                | '\'' '~' '\''
            ;

ID: [a-zA-Z_][a-zA-Z0-9_]*
    ;



