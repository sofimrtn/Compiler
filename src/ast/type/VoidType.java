package ast.type;

public class VoidType extends AbstractType {

    public VoidType() {
        super(0, 0);
    }

    //Singleton pattern
    private static VoidType instance = new VoidType();

    public static VoidType getInstance(){
        return instance;
    }
}