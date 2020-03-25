package ast.expression;

import ast.main.ASTNode;
import ast.type.Type;

public interface Expression extends ASTNode{

    void setLValue(boolean lValue);
    boolean getLValue();

    Type getType();
    void setType(Type type);
}