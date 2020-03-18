package ast.statement;

import ast.main.AbstractASTNode;
import visitor.Visitor;

public abstract class AbstractStatement extends AbstractASTNode implements Statement{

    public AbstractStatement(int line, int column) {
        super(line, column);
    }

    @Override
    public <T, P> T accept(Visitor<T, P> visitor, P param) {
        return null;
    }
}