package ast.type;

import ast.expression.Expression;
import ast.main.ASTNode;

import java.util.List;

public interface Type extends ASTNode {

    boolean isLogical();
    Type arithmetic(Type type);
    Type arithmetic();
    Type comparison(Type type);
    Type logic(Type type);
    Type logic();
    Type promotesTo(Type type);
    boolean isBuiltInType();
    Type squareBrackets(Type type);
    Type dot(String name);
    Type parenthesis(List<Expression> expressions);
}