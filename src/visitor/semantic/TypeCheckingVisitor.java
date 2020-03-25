package visitor.semantic;

import ast.expression.*;
import ast.statement.Assignment;
import ast.statement.IfElse;
import ast.statement.Statement;
import ast.statement.While;
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
        cast.setLValue(false);
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
            fieldAccess.setType(new ErrorType(fieldAccess, "")); //TODO
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
        funcInvocation.getVar().getType().parenthesis(funcInvocation.getExpressions());
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
        realLiteral.setType(DoubleType.getInstance());
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
        variable.setType(variable.getDefinition().getType());
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
}
