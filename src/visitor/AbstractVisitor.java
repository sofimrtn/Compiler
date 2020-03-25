package visitor;

import ast.Program;
import ast.definition.Definition;
import ast.definition.FuncDefinition;
import ast.definition.VarDefinition;
import ast.expression.*;
import ast.statement.*;
import ast.type.*;

public class AbstractVisitor<T, P> implements Visitor<T, P> {

    @Override
    public T visit(VarDefinition varDefinition, P param) {
        varDefinition.accept(this,param);
        return null;
    }

    @Override
    public T visit(FuncDefinition funcDefinition, P param) {
        for(Statement s : funcDefinition.getStatements()){
            s.accept(this,param);
        }
        funcDefinition.accept(this,param);
        return null;
    }

    @Override
    public T visit (Program program, P param){
        for(Definition d : program.getDefinitions()){
            d.accept(this,param);
        }
        return null;
    }

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

    @Override
    public T visit(Assignment assignment, P param) {
        if(assignment.getLeft()!=null){
            assignment.getLeft().accept(this,param);
        }
        if(assignment.getRight()!=null){
            assignment.getRight().accept(this,param);
        }
        return null;
    }

    @Override
    public T visit(IfElse ifElse, P param) {
        if(ifElse.getCondition()!=null){
            ifElse.getCondition().accept(this,param);
        }
        if(ifElse.getIfStatements()!=null){
            for(Statement st : ifElse.getIfStatements()){
                st.accept(this,param);
            }
        }
        if(ifElse.getElseStatements()!=null){
            for(Statement st : ifElse.getElseStatements()){
                st.accept(this,param);
            }
        }
        return null;
    }

    @Override
    public T visit(Input input, P param) {
        if(input.getExpression()!=null){
            input.getExpression().accept(this,param);
        }
        return null;
    }

    @Override
    public T visit(Print print, P param) {
        if(print.getExpression()!=null){
            print.getExpression().accept(this,param);
        }
        return null;
    }

    @Override
    public T visit(Return ret, P param) {
        if(ret.getExpression()!=null){
            ret.getExpression().accept(this,param);
        }
        return null;
    }

    @Override
    public T visit(While wh, P param) {
        if (wh.getCondition()!=null){
            wh.getCondition().accept(this,param);
        }
        if(wh.getStatements()!=null){
            for(Statement st : wh.getStatements()){
                st.accept(this,param);
            }
        }
        return null;
    }

    @Override
    public T visit(Array array, P param) {
        return null;
    }

    @Override
    public T visit(CharType charType, P param) {
        return null;
    }

    @Override
    public T visit(DoubleType doubleType, P param) {
        return null;
    }

    @Override
    public T visit(ErrorType errorType, P param) {
        if(errorType.getNode()!=null){
            errorType.getNode().accept(this,param);
        }
        return null;
    }

    @Override
    public T visit(FuncType funcType, P param) {
        if(funcType.getVariables() != null){
            for(VarDefinition var : funcType.getVariables()){
                var.accept(this,param);
            }
        }
        return null;
    }

    @Override
    public T visit(IntType intType, P param) {
        return null;
    }

    @Override
    public T visit(Record record, P param) {
        if(record.getFields()!=null){
            for(RecordField field : record.getFields()){
                field.accept(this,param);
            }
        }
        return null;
    }

    @Override
    public T visit(RecordField recordField, P param) {
        if(recordField!=null){
            recordField.getType().accept(this,param);
        }
        return null;
    }

    @Override
    public T visit(VoidType voidType, P param) {
        return null;
    }

}
