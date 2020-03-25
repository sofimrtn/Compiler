package ast.type;

import visitor.Visitor;

public class CharType extends AbstractType {

    public CharType() {
        super(0, 0);
    }

    //Singleton pattern
    private static CharType instance = new CharType();

    public static CharType getInstance(){
        return instance;
    }

    @Override
    public Type arithmetic(Type type){
        if(type instanceof ErrorType || type instanceof CharType){
            return type;
        }
        return null;
    }

    @Override
    public boolean isBuiltInType(){
        return true;
    }

    @Override
    public <T, P> T accept(Visitor<T, P> visitor, P param) {
        return visitor.visit(this,param);
    }

}