package ast.type;

public class RecordField extends AbstractType{

    private String name;
    private Type type;

    public RecordField(int line, int column, String name, Type type) {
        super(line,column);
        this.name=name;
        this.type=type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}