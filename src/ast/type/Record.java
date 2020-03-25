package ast.type;

import visitor.Visitor;

import java.util.List;

public class Record extends AbstractType{

    private List<RecordField> fields;

    public Record(int line, int column, List<RecordField> fields) {
        super(line, column);
        this.fields=fields;
    }

    public void setFields(List<RecordField> fields) {
        this.fields = fields;
    }

    public List<RecordField> getFields() {
        return fields;
    }

    @Override
    public Type dot(String name){ //buscar en la lista de fields uno con igual nombre que name. Si lo hay devolver tipo, sino null
        //TODO
        return null;
    }

    @Override
    public <T, P> T accept(Visitor<T, P> visitor, P param) {
        return visitor.visit(this,param);
    }
}