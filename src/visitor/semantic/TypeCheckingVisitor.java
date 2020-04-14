package visitor.semantic;

import ast.definition.FuncDefinition;
import ast.expression.*;
import ast.statement.*;
import ast.type.*;
import visitor.AbstractVisitor;

public class TypeCheckingVisitor extends AbstractVisitor<Object, Object> {

    @Override
    public Object visit(Arithmetic arithmetic, Object param) {
        arithmetic.getLeft().accept(this,param);
        arithmetic.getRight().accept(this,param);
        arithmetic.setLValue(false);

        arithmetic.setType(arithmetic.getLeft().getType().arithmetic(arithmetic.getRight().getType()));
        if(arithmetic.getType() == null){
            arithmetic.setType(new ErrorType(arithmetic, "Incompatible types " + arithmetic.getLeft().getType() +
                    " and " + arithmetic.getRight().getType()));
        }
        return null;
    }

    @Override
    public Object visit(ArrayAccess arrayAccess, Object param) {
        arrayAccess.getLeft().accept(this, param);
        arrayAccess.getRight().accept(this,param);
        arrayAccess.setLValue(true);

        arrayAccess.setType(arrayAccess.getLeft().getType().squareBrackets(arrayAccess.getRight().getType()));

        if(arrayAccess.getType() == null){
            arrayAccess.setType(new ErrorType(arrayAccess.getRight(), "IntType expected, received "
                    + arrayAccess.getType()));
        }
        return null;
    }

    @Override
    public Object visit(Cast cast, Object param) {
        cast.getExpression().accept(this,param);
        cast.getType().accept(this, param);
        cast.setLValue(false);

        cast.setType(cast.getType().canBeCastTo(cast.getExpression().getType()));
        if(cast.getType() == null){
            cast.setType(new ErrorType(cast, "Cannot cast expression"));
        }
        return null;
    }

    @Override
    public Object visit(CharLiteral charLiteral, Object param) {
        charLiteral.setLValue(false);
        charLiteral.setType(CharType.getInstance());
        return null;
    }

    @Override
    public Object visit(Comparison comparison, Object param) {
        comparison.getLeft().accept(this,param);
        comparison.getRight().accept(this,param);
        comparison.setLValue(false);

        comparison.setType(comparison.getLeft().getType().comparison(comparison.getRight().getType()));
        if(comparison.getType() == null){
            comparison.setType(new ErrorType(comparison, "Incompatible types " + comparison.getLeft().getType()
                            + " and " + comparison.getRight().getType()));
        }
        return null;
    }

    @Override
    public Object visit(FieldAccess fieldAccess, Object param) {
        fieldAccess.getExpression().accept(this,param);
        if(fieldAccess.getExpression().getLValue()){
            fieldAccess.setLValue(true);
        }
        fieldAccess.setType(fieldAccess.getExpression().getType().dot(fieldAccess.getName()));

        if(fieldAccess.getType() == null){
            fieldAccess.setType(new ErrorType(fieldAccess, "Incompatible types for field access"));
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
        //en el tipo del parametro de la funcion, comprobar si el tipo de los parametros es igual.
        funcInvocation.setType(funcInvocation.getVar().getType().parenthesis(funcInvocation.getExpressions()));
        if(funcInvocation.getType() == null){
            funcInvocation.setType(new ErrorType(funcInvocation, "Invocation not possible, incopatible" +
                    "type"));
        }
        return null;
    }

    @Override
    public Object visit(FuncDefinition funcDefinition, Object param) {
        funcDefinition.getType().accept(this,param);
        if(funcDefinition.getStatements()!=null){
            for(Statement s : funcDefinition.getStatements()){
                s.accept(this,funcDefinition.getType());
            }
        }
        return null;
    }

    @Override
    public Object visit(IntLiteral intLiteral, Object param) {
        intLiteral.setLValue(false);
        intLiteral.setType(IntType.getInstance());
        return null;
    }

    @Override
    public Object visit(LogicOperator logicOperator, Object param) {
        logicOperator.getLeft().accept(this,param);
        logicOperator.getRight().accept(this,param);
        logicOperator.setLValue(false);

        logicOperator.setType(logicOperator.getLeft().getType().logic(logicOperator.getRight().getType()));
        if(logicOperator.getType() == null){
            logicOperator.setType(new ErrorType(logicOperator, "Incompatible types " + logicOperator.getLeft().getType()
                                + " and " + logicOperator.getRight().getType()));
        }
        return null;
    }

    @Override
    public Object visit(Negation negation, Object param) {
        negation.getExpression().accept(this,param);
        negation.setLValue(false);

        negation.setType(negation.getExpression().getType().logic());
        if(negation.getType() == null){
            negation.setType(new ErrorType(negation, "Incompatible type " + negation.getExpression().getType()));
        }
        return null;
    }

    @Override
    public Object visit(RealLiteral realLiteral, Object param) {
        realLiteral.setLValue(false);
        realLiteral.setType(DoubleType.getInstance());
        return null;
    }

    @Override
    public Object visit(UnaryMinus unaryMinus, Object param) {
        unaryMinus.getExpression().accept(this,param);
        unaryMinus.setLValue(false);

        unaryMinus.setType(unaryMinus.getExpression().getType().arithmetic());
        if(unaryMinus.getType() == null){
            unaryMinus.setType(new ErrorType(unaryMinus, "Incompatible type " + unaryMinus.getExpression().getType()));
        }
        return null;
    }

    @Override
    public Object visit(Variable variable, Object param) {
        variable.setLValue(true);
        if(variable.getDefinition() != null){
            variable.setType(variable.getDefinition().getType());
        }
        return null;
    }

    @Override
    public Object visit(Assignment assignment, Object o) {
        assignment.getLeft().accept(this, o);
        assignment.getRight().accept(this, o);
        if(!assignment.getLeft().getLValue()) {
            new ErrorType(assignment, "LValue expected");
        }
        assignment.setLValue(false);

        if (assignment.getLeft().getType() != null && assignment.getRight().getType() != null) {
            assignment.getLeft().setType(assignment.getRight().getType().promotesTo(assignment.getLeft().getType()));
            if(assignment.getLeft().getType() == null){
                assignment.getLeft().setType(new ErrorType(assignment.getLeft(), "Incompatible types "));
            }
        }
        return null;
    }

    @Override
    public Object visit(While wh, Object param){
        wh.getCondition().accept(this,param);
        if(!wh.getCondition().getType().isLogical()){
            wh.getCondition().setType(new ErrorType(wh.getCondition(),
                    "Logical type expected, current type " + wh.getCondition().getType()));
        }
        for(Statement st : wh.getStatements()){
            st.accept(this,param);
        }
        return null;
    }

    @Override
    public Object visit(IfElse ifElse, Object param){
        ifElse.getCondition().accept(this,param);
        if(!ifElse.getCondition().getType().isLogical()){
            ifElse.getCondition().setType(new ErrorType(ifElse.getCondition(),
                    "Logical type expected, current type " + ifElse.getCondition().getType()));
        }
        for(Statement st : ifElse.getIfStatements()){
            st.accept(this,param);
        }
        for(Statement st : ifElse.getElseStatements()){
            st.accept(this,param);
        }
        return null;
    }

    @Override
    public Boolean visit(Input input, Object param){
        input.getExpression().accept(this,param);
        if(!input.getExpression().getLValue()){
            new ErrorType(input, "LValue expected");
        }
        return null;
    }

    @Override
    public Object visit(Return ret, Object param){
        Type returnType = ((FuncType)param).getType();
        ret.getExpression().accept(this,param);
        if(!ret.getExpression().getType().equals(returnType)){
            new ErrorType(ret, "Return types dont match");
        }
        return null;
    }
}
