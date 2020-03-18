package visitor.semantic;

import ast.definition.FuncDefinition;
import ast.definition.VarDefinition;
import ast.expression.Variable;
import visitor.AbstractVisitor;

public class VisitorIdentification extends AbstractVisitor<Object, Object> {

    @Override
    public Object visit(Variable variable, Object param) {
        return null;
    }

    @Override
    public Object visit(VarDefinition varDefinition, Object param){
        return null;
    }

    @Override
    public Object visit(FuncDefinition funcDefinition, Object param) {
        return null;
    }
}
