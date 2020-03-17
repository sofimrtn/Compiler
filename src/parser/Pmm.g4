grammar Pmm;	

@header

{
    import ast.*;
    import ast.expression.*;
    import ast.type.*;
    import ast.definition.*;
    import ast.statement.*;
}

program returns [Program ast]
 : {List<Definition> definitions = new ArrayList<Definition>();}(varDefinition{definitions.addAll($varDefinition.ast);}';'| funcDefinition{definitions.add($funcDefinition.ast);})*  mainDefinition{definitions.add($mainDefinition.ast);$ast = new Program(0,0,definitions);} EOF//main always goes at the end and is mandatory
 ;

//-----------EXPRESSIONS---------//
expression returns [Expression ast]
 : '(' expression ')' {$ast = $expression.ast;}
 | e1=expression '[' e2=expression ']' {$ast = new ArrayAccess($e1.start.getLine(), $e1.start.getCharPositionInLine()+1, $e1.ast, $e2.ast);}
 // vector[1][2] expr[2] expr[expr]
 | exp=expression '.' ID {$ast = new FieldAccess($exp.start.getLine(),$exp.start.getCharPositionInLine()+1, $exp.ast, $ID.text);}
 //always .ID eg p[].field or p.field[]. Field is an ID. and ID.ID is expr. and expr[] is expr.
 | par='(' type ')' expression {$ast = new Cast($par.getLine(), $par.getCharPositionInLine()+1, $type.ast, $expression.ast);}
 //casting
 | operator='-' expression {$ast = new UnaryMinus($operator.getLine(),$operator.getCharPositionInLine()+1,$expression.ast);}
 | operator='!' expression {$ast = new Negation($operator.getLine(),$operator.getCharPositionInLine()+1,$expression.ast);}
 | e1=expression operator=('*'|'/'|'%') e2=expression {$ast = new Arithmetic($e1.start.getLine(), $e1.start.getCharPositionInLine()+1, $e1.ast, $operator.text, $e2.ast);}
 | e1=expression operator=('+'|'-') e2=expression {$ast = new Arithmetic($e1.start.getLine(), $e1.start.getCharPositionInLine()+1, $e1.ast, $operator.text, $e2.ast);}
 | e1=expression operator=('>'|'>='|'<'|'<='|'!='|'==') e2=expression {$ast = new Arithmetic($e1.start.getLine(), $e1.start.getCharPositionInLine()+1, $e1.ast, $operator.text, $e2.ast);}
 | e1=expression operator=('&&'|'||') e2=expression {$ast = new Arithmetic($e1.start.getLine(), $e1.start.getCharPositionInLine()+1, $e1.ast, $operator.text, $e2.ast);}
 | funcInvocation {$ast = $funcInvocation.ast;} //invocation as an expression
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
 : PRINT  expressions';' {for(Expression exp : $expressions.ast) {$ast.add(new Print($PRINT.getLine(), $PRINT.getCharPositionInLine()+1, exp));}}
 | INPUT expression ';' {$ast.add(new Input($INPUT.getLine(), $INPUT.getCharPositionInLine()+1, $expression.ast));}
 | RETURN expression';' {$ast.add(new Return($RETURN.getLine(), $RETURN.getCharPositionInLine()+1, $expression.ast));}
 | funcInvocation ';' {$ast.add((Statement)$funcInvocation.ast);} //invocations as an statement. Always with ; at the end. This is a procedure.
 | e1=expression '=' e2=expression ';' {$ast.add(new Assignment($e1.start.getLine(), $e1.start.getCharPositionInLine()+1, $e1.ast, $e2.ast));}
 | w='while' expression ':' whileBody {$ast.add(new While($w.getLine(), $w.getCharPositionInLine()+1, $expression.ast, $whileBody.ast));}
 | i='if' e1=expression ':' f=ifBody { IfElse ifSt = new IfElse($i.getLine(), $i.getCharPositionInLine()+1, $e1.ast, $f.ast, new ArrayList<Statement>());}  (e=elseSt  {ifSt.setElseStatements($e.ast);})?  {$ast.add(ifSt);}
 ;

whileBody returns [List<Statement> ast = new ArrayList<Statement>()]
 : body {$ast.addAll($body.ast);}
 ;

ifBody returns [List<Statement> ast = new ArrayList<Statement>()]
 : b=body {$ast.addAll($b.ast);}
 ;
elseSt returns [List<Statement> ast = new ArrayList<Statement>()]
 : 'else' body {$ast.addAll($body.ast);}
 ;
body returns [List<Statement> ast = new ArrayList<Statement>()]
 : (s1=statement {$ast.addAll($s1.ast);} |'{'s2=statement {$ast.addAll($s2.ast);}'}' |'{' (s3=statement {$ast.addAll($s3.ast);})+ '}')
 ;
//-----------TYPE----------//
type returns [Type ast]
 : 'int' {$ast = new IntType();}
 | 'char' {$ast = new CharType();}
 | 'double' {$ast = new DoubleType();}
 | 'void' {$ast = new VoidType();}
 | (par='['size=INT_CONSTANT']') type {$ast = new Array($par.getLine(), $par.getCharPositionInLine()+1, LexerHelper.lexemeToInt($size.text), $type.ast);}
 //array
 | STRUCT '{' fields '}' {$ast = new Record($STRUCT.getLine(), $STRUCT.getCharPositionInLine()+1, $fields.ast);}
 //record
 | {$ast = new VoidType();}
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
 : id1=ID {$ast.add(new VarDefinition($id1.getLine(), $id1.getCharPositionInLine()+1, null, $id1.text));}(','id2=ID{if($ast.contains(new VarDefinition($id2.getLine(), $id2.getCharPositionInLine()+1, null, $id2.text))){new ErrorType($id2.getLine(), $id2.getCharPositionInLine()+1, "Duplicate variable error: " + $id2.text);}else{$ast.add(new VarDefinition($id2.getLine(), $id2.getCharPositionInLine()+1, null, $id2.text));}})+ ':' type {for(VarDefinition var : $ast){var.setType($type.ast);}}
 ;

fields returns [List<RecordField> ast = new ArrayList<>()] //only used while defining records
 : (varDefinition {for(VarDefinition var: $varDefinition.ast) {$ast.add(new RecordField(var.getLine(), var.getColumn(),var.getName(),var.getType()));}}';')+
 ;

funcDefinition returns [FuncDefinition ast]
 : DEF ID  params ':' t=type '{' funcBody '}' {$ast = new FuncDefinition($DEF.getLine(), $DEF.getCharPositionInLine()+1,new FuncType($t.start.getLine(), $t.start.getCharPositionInLine()+1, $t.ast, $params.ast), $ID.text, $funcBody.ast );}
 ;

funcBody returns [List<Statement> ast = new ArrayList<Statement>()]
 : (varDefinition {$ast.addAll($varDefinition.ast);}';')* (statement {$ast.addAll($statement.ast);})*
 ;


params returns [List<VarDefinition> ast = new ArrayList<VarDefinition>()]
 : '(' ')' //could be empty -no parameters-
 | '(' v1=oneVariable {$ast.add($v1.ast);} (',' v2=oneVariable {$ast.add($v2.ast);})* ')' //could have one or more parameters (one variable declarations).
 ;

mainDefinition returns [FuncDefinition ast]
 : DEF MAIN '(' ')' ':' ('void')? '{' funcBody '}' {$ast = new FuncDefinition($DEF.getLine(),$DEF.getCharPositionInLine()+1,new FuncType($DEF.getLine(), $DEF.getCharPositionInLine()+1,VoidType.getInstance(),new ArrayList<VarDefinition>()),$MAIN.text, $funcBody.ast);}
 ; //receives no parameters and always returns void.

//-----------INVOCATION-----------//
funcInvocation returns [FuncInvocation ast]
 : ID arguments {$ast = new FuncInvocation($ID.getLine(), $ID.getCharPositionInLine()+1, $arguments.ast, new Variable($ID.getLine(),$ID.getCharPositionInLine()+1, $ID.text));}
 ; //could be empty. ALSO break it down if it gets messy.
arguments returns [List<Expression> ast = new ArrayList<Expression>()]
 : '(' ')'
 | '(' expressions {$ast.addAll($expressions.ast);} ')'
 ;

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



