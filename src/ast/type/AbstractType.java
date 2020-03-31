package ast.type;

import ast.expression.Expression;
import ast.main.AbstractASTNode;
import visitor.Visitor;

import java.util.List;

public abstract class AbstractType extends AbstractASTNode implements Type {

    public AbstractType(int line, int column) {
        super(line, column);
    }

    @Override
    public boolean isLogical(){
        return false;
    }

    @Override
    public Type arithmetic(Type type){
        return null;
    }

    @Override
    public Type arithmetic(){
        return null;
    }

    @Override
    public Type comparison(Type type){
        return null;
    }

    @Override
    public Type logic(Type type){ //solo int como en el arithmetic
        return null;
    }

    @Override
    public Type logic(){ //solo int como en el arithmetic
        return null;
    }

    @Override
    public Type promotesTo(Type type){
        return null;
    }

    @Override
    public Type canBeCastTo(Type type){
        return null;
    }

    @Override
    public boolean isBuiltInType(){
        return false;
    }

    @Override
    public Type squareBrackets(Type type){
        return null;
    }

    @Override
    public Type dot(String name){
        return null;
    }

    @Override
    public Type parenthesis(List<Expression> expressions){
        return null;
    }

    @Override
    public <T, P> T accept(Visitor<T, P> visitor, P param) {
        return null;
    }
}