package ast.type;

public class Array extends AbstractType {

    private int size;
    private Type type; //OF relationship

    public Array(int line, int column, int size, Type type) {
        super(line, column);
        this.size=size;
        this.type=type;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}