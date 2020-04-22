package visitor.codeGenerator;

import ast.definition.VarDefinition;
import ast.expression.ArrayAccess;
import ast.expression.FieldAccess;
import ast.expression.Variable;

public class AddressCGVisitor extends AbstractCGVisitor {

    private ValueCGVisitor value;

    public AddressCGVisitor(CodeGenerator cg, ValueCGVisitor value) {
        super(cg);
        this.value = value;
    }

    @Override
    public Object visit(ArrayAccess arrayAccess, Object param) {
        //address[[array.getLeft]]
        arrayAccess.getLeft().accept(this,param); //meter en la pila DIRECCION donde empieza vector
        //value[[array.getRight]]
        arrayAccess.getRight().accept(value, param); //meter en pila VALOR del indice
        //push size
        cg.push(arrayAccess.getType().numberOfBytes()); //meter tamaño de cada elemento
        cg.mul(arrayAccess.getType().suffix()); //mul
        cg.add(arrayAccess.getType().suffix()); //add
        return null;
    }

    @Override
    public Object visit(FieldAccess fieldAccess, Object param) {
        //address[[expression]]
        fieldAccess.getExpression().accept(this,param);
        //push offset
        cg.push(fieldAccess.getExpression().getType().getField(fieldAccess.getName()).getOffset());
        //add
        cg.add(fieldAccess.getType().suffix());
        return null;
    }

    @Override
    public Object visit(Variable variable, Object param) {
        VarDefinition var = (VarDefinition) variable.getDefinition();
        if (variable.getDefinition().getScope() == 0) {
            cg.pusha(var.getOffset());
        } else {
            cg.pushBP();
            cg.push(var.getOffset());
            cg.add(var.getType().suffix());
        }
        return null;
    }
}
