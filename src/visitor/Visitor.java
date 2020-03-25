package visitor;

import ast.Program;
import ast.definition.FuncDefinition;
import ast.definition.VarDefinition;
import ast.expression.*;
import ast.statement.*;
import ast.type.*;

public interface Visitor<T,P> {

    T visit (Program program, P param);
    //definitions
    T visit (VarDefinition varDefinition, P param);
    T visit (FuncDefinition funcDefinition, P param);
    //expressions
    T visit (Arithmetic arithmetic, P param);
    T visit (ArrayAccess arrayAccess, P param);
    T visit (Cast cast, P param);
    T visit (CharLiteral charLiteral, P param);
    T visit (Comparison comparison, P param);
    T visit (FieldAccess fieldAccess, P param);
    T visit (FuncInvocation funcInvocation, P param);
    T visit (IntLiteral intLiteral, P param);
    T visit (LogicOperator logicOperator, P param);
    T visit (Negation negation, P param);
    T visit (RealLiteral realLiteral, P param);
    T visit (UnaryMinus unaryMinus, P param);
    T visit (Variable variable, P param);
    //statements
    T visit (Assignment assignment, P param);
    T visit (IfElse ifElse, P param);
    T visit (Input input, P param);
    T visit (Print print, P param);
    T visit (Return ret, P param);
    T visit (While wh, P param);
    //types
    T visit (Array array, P param);
    T visit (CharType charType, P param);
    T visit (DoubleType doubleType, P param);
    T visit (ErrorType errorType, P param);
    T visit (FuncType funcType, P param);
    T visit (IntType intType, P param);
    T visit (Record record, P param);
    T visit (RecordField recordField, P param);
    T visit (VoidType voidType, P param);
}
