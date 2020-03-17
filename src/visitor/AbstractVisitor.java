package visitor;

import ast.expression.*;

public class AbstractVisitor<T, P> implements Visitor<T, P> {

    @Override
    public T visit(Arithmetic arithmetic, P param) {
        if(arithmetic.getLeft()!=null){
            arithmetic.getLeft().accept(this, param);
        }
        if(arithmetic.getRight()!=null) {
            arithmetic.getRight().accept(this, param);
        }
        return null;
    }

    @Override
    public T visit(ArrayAccess arrayAccess, P param) {
        if(arrayAccess.getLeft()!=null){
            arrayAccess.getLeft().accept(this,param);
        }
        if(arrayAccess.getRight()!=null){
            arrayAccess.getRight().accept(this, param);
        }
        return null;
    }

    @Override
    public T visit(Cast cast, P param) {
        if(cast.getExpression()!=null){
            cast.getExpression().accept(this,param);
        }
        return null;
    }

    @Override
    public T visit(CharLiteral charLiteral, P param) {
        return null;
    }

    @Override
    public T visit(Comparison comparison, P param) {
        if(comparison.getLeft()!=null){
            comparison.getLeft().accept(this,param);
        }
        if(comparison.getRight()!=null){
            comparison.getRight().accept(this,param);
        }
        return null;
    }

    @Override
    public T visit(FieldAccess fieldAccess, P param) {
        if(fieldAccess.getExpression()!=null){
            fieldAccess.getExpression().accept(this,param);
        }
        return null;
    }

    @Override
    public T visit(FuncInvocation funcInvocation, P param) {
        if(!funcInvocation.getExpressions().isEmpty()){
            for(Expression e : funcInvocation.getExpressions()){
                e.accept(this,param);
            }
        }
        if(funcInvocation.getVar()!=null){
            funcInvocation.getVar().accept(this,param);
        }
        return null;
    }

    @Override
    public T visit(IntLiteral intLiteral, P param) {
        return null;
    }

    @Override
    public T visit(LogicOperator logicOperator, P param) {
        if(logicOperator.getLeft()!=null){
            logicOperator.getLeft().accept(this, param);
        }
        if(logicOperator.getRight()!=null){
            logicOperator.getRight().accept(this,param);
        }
        return null;
    }

    @Override
    public T visit(Negation negation, P param) {
        if(negation.getExpression()!=null){
            negation.getExpression().accept(this, param);
        }
        return null;
    }

    @Override
    public T visit(RealLiteral realLiteral, P param) {
        return null;
    }

    @Override
    public T visit(UnaryMinus unaryMinus, P param) {
        if(unaryMinus.getExpression()!=null){
            unaryMinus.getExpression().accept(this, param);
        }
        return null;
    }

    @Override
    public T visit(Variable variable, P param) {
        return null;
    }
}
