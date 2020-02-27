grammar Pmm;	

@header
{
    import ast.*;
    import ast.expression.*;
    import ast.type.*;
    import ast.definition.*;
}

program returns [Program ast]
    : (varDefinition';')* funcDefinition* mainDefinition //main always goes at the end and is mandatory TODO
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
        | e1=expression operator=('*'|'/'|'%') e2=expression {$ast = new Arithmetic($e1.start.getLine(), $e1.start.getCharPositionInLine()+1, $e1.ast, $operator.text, $e2.ast);}
        | e1=expression operator=('+'|'-') e2=expression {$ast = new Arithmetic($e1.start.getLine(), $e1.start.getCharPositionInLine()+1, $e1.ast, $operator.text, $e2.ast);}
        | e1=expression operator=('>'|'>='|'<'|'<='|'!='|'==') e2=expression {$ast = new Arithmetic($e1.start.getLine(), $e1.start.getCharPositionInLine()+1, $e1.ast, $operator.text, $e2.ast);}
        | e1=expression operator=('&&'|'||') e2=expression {$ast = new Arithmetic($e1.start.getLine(), $e1.start.getCharPositionInLine()+1, $e1.ast, $operator.text, $e2.ast);}
        | funcInvocation {} //invocation as an expression TODO
        | INT_CONSTANT {$ast = new IntLiteral($INT_CONSTANT.getLine(), $INT_CONSTANT.getCharPositionInLine() + 1, LexerHelper.lexemeToInt($INT_CONSTANT.text));}
        | CHAR_CONSTANT {$ast = new CharLiteral($CHAR_CONSTANT.getLine(), $CHAR_CONSTANT.getCharPositionInLine() + 1, LexerHelper.lexemeToChar($CHAR_CONSTANT.text));}
        | REAL_CONSTANT {$ast = new RealLiteral($REAL_CONSTANT.getLine(),$REAL_CONSTANT.getCharPositionInLine() + 1, LexerHelper.lexemeToReal($REAL_CONSTANT.text));}
        | ID {$ast = new Variable($ID.getLine(), $ID.getCharPositionInLine() + 1, $ID.text);}
        ;

expressions returns [List<Expression> ast = new ArrayList<Expression>()]
    : expression {$ast.add($expression.ast);}(',' expression {$ast.add($expression.ast);})*
    ;

//-----------STATEMENTS---------//
statement returns [List<Statement> ast = new ArrayList<Statement>()]//devuelve una lista
        : PRINT  expressions';' {$ast = new Print($PRINT.getLine(), $PRINT.getCharPositionInLine()+1, $expressions.ast);}
        | INPUT expression ';' {$ast = new Input($INPUT.getLine(), $INPUT.getCharPositionInLine()+1, $expression.ast);}
        | RETURN expression';' {$ast = new Return($RETURN.getLine(), $RETURN.getCharPositionInLine()+1, $expression.ast);}
        | funcInvocation ';' //invocations as an statement. Always with ; at the end. This is a procedure. TODO
        | e1=expression '=' e2=expression ';' {$ast = new Assignment($e1.start.getLine(), $e1.start.getCharPositionInLine()+1, $e1.ast, $e2.ast);}
        | w='while' expression ':' whileBody {$ast = new While($w.getLine(), $w.getCharPositionInLine()+1, $expression.ast, $whileBody.ast);}
        | i='if' expression ':' ifBody {$ast = new IfElse($i.getLine(), $i.getCharPositionInLine()+1, $expression.ast, $ifBody.ast, $ifBody.ast);}
        ;

whileBody returns [List<Statement> ast = new ArrayList<Statement>()]
    : body {$ast.addAll($body.ast);}
    ;

ifBody returns [List<Statement> ast = new ArrayList<Statement>()]
    : body ('else' body)*  //ifStatements and else statements must be separated!!! TODO
    ;

body returns [List<Statement> ast = new ArrayList<Statement>()]
    : (statement |'{'statement'}' |'{' statement+ '}')  //TODO
    ;
//-----------TYPE----------//
type returns [Type ast]
    : 'int' {$ast = new IntType();}
    | 'char' {$ast = new CharType();}
    | 'double' {$ast = new DoubleType();}
    | 'void' {$ast = new VoidType();}
    | (par='['INT_CONSTANT']')+ type {$ast = new Array($par.getLine(), $par.getCharPositionInLine()+1, LexerHelper.lexemeToInt($INT_CONSTANT.text), $type.ast);}
    //array
    | STRUCT '{' fields '}' {$ast = new Record($STRUCT.getLine(), $STRUCT.getCharPositionInLine()+1, $fields.ast);}
    //record
    ;

//-----------DEFINITIONS-----------//
varDefinition returns [List<VarDefinition> ast = new ArrayList<VarDefinition>()] //check if "fields" goes here too. TODO
            : oneVariable {$ast.add($oneVariable.ast);}
            | multipleVariables {$ast.addAll($multipleVariables.ast);}
            ;

oneVariable returns [VarDefinition ast]
          : ID ':' type {$ast = new VarDefinition($ID.getLine(),$ID.getCharPositionInLine()+1, $type.ast, $ID.text);}
          ;

multipleVariables returns [List<VarDefinition> ast = new ArrayList<VarDefinition>()] //as type comes last, it's assigned at the end.
    : ID {$ast.add(new VarDefinition($ID.getLine(), $ID.getCharPositionInLine()+1, null, $ID.text));}(',' ID{$ast.add(new VarDefinition($ID.getLine(), $ID.getCharPositionInLine()+1, null, $ID.text));})+ ':' type {for(VarDefinition var : $ast){var.setType($type.ast);}}
    ;

fields returns [List<RecordField> ast = new ArrayList<>()] //only used while defining records
    : (varDefinition {for(VarDefinition var: $varDefinition.ast) {$ast.add(new RecordField(var.getLine(), var.getColumn(),var.getName(),var.getType()));}}';')+ ;

funcDefinition: DEF ID  params ':' type? '{' funcBody '}'; //TODO

funcBody : (varDefinition';')* statement* ; //TODO


params: '(' ')' //could be empty -no parameters- TODO
        | '(' oneVariable (',' oneVariable)* ')' //could have one or more parameters (one variable declarations).
        ;

mainDefinition: DEF MAIN '(' ')' ':' '{' funcBody '}' ; //receives no parameters and always returns void. TODO

//-----------INVOCATION-----------//
funcInvocation returns [FuncInvocation ast] //REVISAR TODO
    : ID '(' expressions? ')' {$ast = new FuncInvocation($ID.getLine(), $ID.getCharPositionInLine()+1, $expressions.ast, null);}
    ; //could be empty. ALSO break it down if it gets messy.

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



