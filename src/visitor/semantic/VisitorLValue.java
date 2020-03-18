package visitor.semantic;

import ast.expression.*;
import ast.statement.Assignment;
import ast.type.ErrorType;
import visitor.AbstractVisitor;

public class VisitorLValue extends AbstractVisitor<Object, Object> {

    @Override
    public Object visit(Arithmetic arithmetic, Object param) {
        arithmetic.getLeft().accept(this,param);
        arithmetic.getRight().accept(this,param);
        arithmetic.setLValue(false);
        return null;
    }

    @Override
    public Object visit(ArrayAccess arrayAccess, Object param) {
        arrayAccess.getLeft().accept(this, param);
        arrayAccess.getRight().accept(this,param);
        arrayAccess.setLValue(true);
        return null;
    }

    @Override
    public Object visit(Cast cast, Object param) {
        cast.getExpression().accept(this,param);
        cast.setLValue(false);
        return null;
    }

    @Override
    public Object visit(CharLiteral charLiteral, Object param) {
        charLiteral.setLValue(false);
        return null;
    }

    @Override
    public Object visit(Comparison comparison, Object param) {
        comparison.getLeft().accept(this,param);
        comparison.getRight().accept(this,param);
        comparison.setLValue(false);
        return null;
    }

    @Override
    public Object visit(FieldAccess fieldAccess, Object param) {
        fieldAccess.getExpression().accept(this,param);
        if(fieldAccess.getExpression().getLValue()){
            fieldAccess.setLValue(true);
        }
        return null;
    }

    @Override
    public Object visit(FuncInvocation funcInvocation, Object param) {
        funcInvocation.getVar().accept(this,param);
        for(Expression e : funcInvocation.getExpressions()){
            e.accept(this,param);
        }
        funcInvocation.setLValue(false);
        return null;
    }

    @Override
    public Object visit(IntLiteral intLiteral, Object param) {
        intLiteral.setLValue(false);
        return null;
    }

    @Override
    public Object visit(LogicOperator logicOperator, Object param) {
        logicOperator.getLeft().accept(this,param);
        logicOperator.getRight().accept(this,param);
        logicOperator.setLValue(false);
        return null;
    }

    @Override
    public Object visit(Negation negation, Object param) {
        negation.getExpression().accept(this,param);
        negation.setLValue(false);
        return null;
    }

    @Override
    public Object visit(RealLiteral realLiteral, Object param) {
        realLiteral.setLValue(false);
        return null;
    }

    @Override
    public Object visit(UnaryMinus unaryMinus, Object param) {
        unaryMinus.getExpression().accept(this,param);
        unaryMinus.setLValue(false);
        return null;
    }

    @Override
    public Object visit(Variable variable, Object param) {
        variable.setLValue(true);
        return null;
    }

    @Override
    public Object visit(Assignment assignment, Object o) {
        assignment.getLeft().accept(this, o);
        assignment.getRight().accept(this, o);
        if(!assignment.getLeft().getLValue()) {
            new ErrorType(assignment, "Se esperaba LValue");
        }
        assignment.setLValue(false);
        return null;
    }
}
