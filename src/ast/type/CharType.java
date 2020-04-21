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
    public boolean isBuiltInType(){
        return true;
    }

    @Override
    public Type logic( Type type ) {
        if (type instanceof ErrorType) {
            return type;
        }
        if (type instanceof CharType || type instanceof IntType) {
            return IntType.getInstance();
        }
        return null;
    }

    @Override
    public Type logic() {
        return this;
    }

    @Override
    public Type canBeCastTo(Type type){
        if(type instanceof ErrorType){
            return type;
        }
        if(type instanceof CharType || type instanceof IntType || type instanceof DoubleType){
            return this;
        }
        return null;
    }

    @Override
    public int numberOfBytes() {
        return 1;
    }

    @Override
    public Type arithmetic(Type type){
        if(type instanceof ErrorType || type instanceof IntType || type instanceof DoubleType){
            return type;
        }
        if(type instanceof CharType){
            return this;
        }
        return null;
    }

    @Override
    public Type comparison( Type type ) {
        if (type instanceof ErrorType) {
            return type;
        }
        if (type instanceof CharType || type instanceof IntType || type instanceof DoubleType) {
            return IntType.getInstance();
        }

        return null;
    }

    @Override
    public Type promotesTo(Type type){
        if(type instanceof ErrorType || type instanceof IntType || type instanceof DoubleType){
            return type;
        }
        if(type instanceof CharType){
            return this;
        }
        return null;
    }

    @Override
    public <T, P> T accept(Visitor<T, P> visitor, P param) {
        return visitor.visit(this,param);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        CharType other = (CharType) obj;
        if (instance == null) {
            if (other.instance != null)
                return false;
        } else if (!instance.equals(other.instance))
            return false;
        return true;
    }

    @Override
    public String suffix(){
        return "b";
    }

    @Override
    public String toString() {
        return "CharType";
    }
}