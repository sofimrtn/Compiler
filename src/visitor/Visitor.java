package visitor;

import ast.definition.FuncDefinition;
import ast.definition.VarDefinition;
import ast.expression.*;
import ast.statement.Assignment;
import ast.type.Array;
import ast.type.CharType;
import ast.type.ErrorType;

public interface Visitor<T,P> {

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
    //definitions
    T visit (VarDefinition varDefinition, P param);
    T visit (FuncDefinition funcDefinition, P param);

}
