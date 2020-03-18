package ast.definition;

import ast.main.ASTNode;
import ast.type.Type;
import visitor.Visitor;

public interface Definition extends ASTNode {

    Type getType();
    String getName();
    int getScope();
    void setScope(int scope);

    @Override
    public <T, P> T accept(Visitor<T, P> visitor, P param);
}