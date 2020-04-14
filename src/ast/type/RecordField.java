package ast.type;

import ast.main.ASTNode;
import visitor.Visitor;


public class RecordField implements ASTNode {

    private String name;
    private Type type;

    private int offset;

    public RecordField(int line, int column, String name, Type type) {
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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RecordField that = (RecordField) o;
        if (name == null) {
            if (that.name != null)
                return false;
        } else if (!name.equals(that.name))
            return false;
        return true;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public int getLine() {
        return 0;
    }

    @Override
    public int getColumn() {
        return 0;
    }

    @Override
    public <T, P> T accept(Visitor<T, P> visitor, P param) {
        return visitor.visit(this,param);
    }

    public int getSize() {
        return this.getType().getSize();
    }

    public int getOffset(){
        return offset;
    }

    public void setOffset(int offset){
        this.offset = offset;
    }
}