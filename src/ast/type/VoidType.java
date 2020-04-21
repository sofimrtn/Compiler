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
    public int numberOfBytes() {
        return 0;
    }

    @Override
    public boolean isBuiltInType(){
        return true;
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
        VoidType other = (VoidType) obj;
        if (instance == null) {
            if (other.instance != null)
                return false;
        } else if (!instance.equals(other.instance))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "VoidType";
    }
}