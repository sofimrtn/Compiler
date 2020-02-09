package ast.type;

import ast.main.AbstractASTNode;

public abstract class AbstractType extends AbstractASTNode implements Type {

    public AbstractType(int line, int column) {
        super(line, column);
    }
}