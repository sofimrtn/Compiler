package visitor.codeGenerator;

import ast.Program;
import ast.definition.FuncDefinition;
import ast.definition.VarDefinition;
import ast.expression.*;
import ast.statement.*;
import ast.type.*;
import visitor.Visitor;

public abstract class AbstractCGVisitor implements Visitor<Object,Object> {

    CodeGenerator cg;

    public AbstractCGVisitor (CodeGenerator cg){
        this.cg=cg;
    }

    @Override
    public Object visit(Program program, Object param) {
        throw new RuntimeException();
    }

    @Override
    public Object visit(VarDefinition varDefinition, Object param) {
        throw new RuntimeException();
    }

    @Override
    public Object visit(FuncDefinition funcDefinition, Object param) {
        throw new RuntimeException();
    }

    @Override
    public Object visit(Arithmetic arithmetic, Object param) {
        throw new RuntimeException();
    }

    @Override
    public Object visit(ArrayAccess arrayAccess, Object param) {
        throw new RuntimeException();
    }

    @Override
    public Object visit(Cast cast, Object param) {
        throw new RuntimeException();
    }

    @Override
    public Object visit(CharLiteral charLiteral, Object param) {
        throw new RuntimeException();
    }

    @Override
    public Object visit(Comparison comparison, Object param) {
        throw new RuntimeException();
    }

    @Override
    public Object visit(FieldAccess fieldAccess, Object param) {
        throw new RuntimeException();
    }

    @Override
    public Object visit(FuncInvocation funcInvocation, Object param) {
        throw new RuntimeException();
    }

    @Override
    public Object visit(IntLiteral intLiteral, Object param) {
        throw new RuntimeException();
    }

    @Override
    public Object visit(LogicOperator logicOperator, Object param) {
        throw new RuntimeException();
    }

    @Override
    public Object visit(Negation negation, Object param) {
        throw new RuntimeException();
    }

    @Override
    public Object visit(RealLiteral realLiteral, Object param) {
        throw new RuntimeException();
    }

    @Override
    public Object visit(UnaryMinus unaryMinus, Object param) {
        throw new RuntimeException();
    }

    @Override
    public Object visit(Variable variable, Object param) {
        throw new RuntimeException();
    }

    @Override
    public Object visit(Assignment assignment, Object param) {
        throw new RuntimeException();
    }

    @Override
    public Object visit(IfElse ifElse, Object param) {
        throw new RuntimeException();
    }

    @Override
    public Object visit(Input input, Object param) {
        throw new RuntimeException();
    }

    @Override
    public Object visit(Print print, Object param) {
        throw new RuntimeException();
    }

    @Override
    public Object visit(Return ret, Object param) {
        throw new RuntimeException();
    }

    @Override
    public Object visit(While wh, Object param) {
        throw new RuntimeException();
    }

    @Override
    public Object visit(Array array, Object param) {
        throw new RuntimeException();
    }

    @Override
    public Object visit(CharType charType, Object param) {
        throw new RuntimeException();
    }

    @Override
    public Object visit(DoubleType doubleType, Object param) {
        throw new RuntimeException();
    }

    @Override
    public Object visit(ErrorType errorType, Object param) {
        throw new RuntimeException();
    }

    @Override
    public Object visit(FuncType funcType, Object param) {
        throw new RuntimeException();
    }

    @Override
    public Object visit(IntType intType, Object param) {
        throw new RuntimeException();
    }

    @Override
    public Object visit(Record record, Object param) {
        throw new RuntimeException();
    }

    @Override
    public Object visit(RecordField recordField, Object param) {
        throw new RuntimeException();
    }

    @Override
    public Object visit(VoidType voidType, Object param) {
        throw new RuntimeException();
    }
}
