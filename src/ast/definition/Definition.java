package ast.definition;

import ast.main.ASTNode;
import ast.type.Type;

public interface Definition extends ASTNode {

    Type getType();
    String getName();
}