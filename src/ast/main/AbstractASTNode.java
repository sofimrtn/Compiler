package ast.main;

public abstract class AbstractASTNode implements ASTNode {

    int line;
    int column;

    public AbstractASTNode(int line, int column) {
        super();
        this.line = line;
        this.column = column;
    }

    @Override
    public int getLine() {
        return line;
    }

    @Override
    public int getColumn() {
        return column;
    }

    public void setLine(int line) {
        this.line = line;
    }

    public void setColumn(int column) {
        this.column = column;
    }
}