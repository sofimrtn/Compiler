package visitor;

import ast.expression.*;

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
}
