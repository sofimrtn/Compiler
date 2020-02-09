package ast.type;

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
}