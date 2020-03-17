package ast.main;

import visitor.Visitor;

public interface ASTNode {
    int getLine();
    int getColumn();
    public <T, P> T accept(Visitor<T, P> visitor, P param );
}