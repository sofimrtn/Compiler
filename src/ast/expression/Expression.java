package ast.expression;

import ast.main.ASTNode;

public interface Expression extends ASTNode{

    void setLValue(boolean lValue);
    boolean getLValue();
}