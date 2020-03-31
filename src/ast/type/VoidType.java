package ast.type;

import visitor.Visitor;

public class VoidType extends AbstractType {

    public VoidType() {
        super(0, 0);
    }

    //Singleton pattern
    private static VoidType instance = new VoidType();

    public static VoidType getInstance(){
        return instance;
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