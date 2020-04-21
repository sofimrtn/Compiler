package visitor.codeGenerator;

import ast.expression.*;

public class ValueCGVisitor extends AbstractCGVisitor {

    private AddressCGVisitor address;

    public ValueCGVisitor(CodeGenerator cg) {
        super(cg);
    }

    @Override
    public Object visit(Arithmetic arithmetic, Object param) {
        arithmetic.getLeft().accept(this,param);
        arithmetic.getRight().accept(this,param);
        cg.arithmetic(arithmetic);
        return null;
    }

    @Override
    public Object visit(ArrayAccess arrayAccess, Object param) {
        //address[[arrayAccess]]
        arrayAccess.accept(address,param);
        //load<arrayAccess.getType().suffix()>
        cg.load(arrayAccess.getType().suffix());
        return null;
    }

    @Override
    public Object visit(Cast cast, Object param) {
        cast.getExpression().accept(this,param);
        cg.cast(cast.getExpression().getType(), cast.getType());
        return null;
    }

    @Override
    public Object visit(CharLiteral charLiteral, Object param) {
        cg.push(charLiteral.getValue());
        return null;
    }

    @Override
    public Object visit(Comparison comparison, Object param) {
        comparison.getLeft().accept(this,param);
        comparison.getRight().accept(this,param);
        cg.comparison(comparison);
        return null;
    }

    @Override
    public Object visit(FieldAccess fieldAccess, Object param) {
        //address[[fieldAccess]]
        fieldAccess.accept(address,param);
        //load<fieldAcces.getType.suffix>
        cg.load(fieldAccess.getType().suffix());
        return null;
    }

    @Override
    public Object visit(FuncInvocation funcInvocation, Object param) {
        //TODO proxima clase
        //expresion
        //value[[args_i]]
        //call{nombre}
        //si void, pop.
        return null;
    }

    @Override
    public Object visit(IntLiteral intLiteral, Object param) {
        cg.push(intLiteral.getValue());
        return null;
    }

    @Override
    public Object visit(LogicOperator logicOperator, Object param) {
        logicOperator.getLeft().accept(this,param);
        logicOperator.getRight().accept(this,param);
        cg.logical(logicOperator);
        return null;
    }

    @Override
    public Object visit(Negation negation, Object param) {
        negation.getExpression().accept(this,param);
        cg.not();
        return null;
    }

    @Override
    public Object visit(RealLiteral realLiteral, Object param) {
        cg.push(realLiteral.getValue());
        return null;
    }

    @Override
    public Object visit(UnaryMinus unaryMinus, Object param) {
        return super.visit(unaryMinus, param);
    }

    @Override
    public Object visit(Variable variable, Object param) {
        //address[[variable]]
        variable.accept(address,param);
        //load<variable.getDefinition.getType.suffix>
        cg.load(variable.getType().suffix());
        return null;
    }

    public void setAddressVisitor(AddressCGVisitor address) {
        this.address = address;
    }
}
