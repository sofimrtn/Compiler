package ast.statement;

import ast.main.AbstractASTNode;

public abstract class AbstractStatement extends AbstractASTNode implements Statement{

    public AbstractStatement(int line, int column) {
        super(line, column);
    }
}