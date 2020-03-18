package ast.type;

import ast.main.AbstractASTNode;
import visitor.Visitor;

public abstract class AbstractType extends AbstractASTNode implements Type {

    public AbstractType(int line, int column) {
        super(line, column);
    }

    @Override
    public <T, P> T accept(Visitor<T, P> visitor, P param) {
        return null;
    }
}