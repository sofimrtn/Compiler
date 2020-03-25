package ast;

import ast.definition.Definition;
import ast.main.AbstractASTNode;
import visitor.Visitor;

import java.util.List;

public class Program extends AbstractASTNode {

    private List<Definition> definitions;

    public Program(int line, int column, List<Definition> definitions) {
        super(line, column);
        this.definitions=definitions;
    }

    public List<Definition> getDefinitions() {
        return definitions;
    }

    @Override
    public <T, P> T accept(Visitor<T, P> visitor, P param) {
        return visitor.visit(this,param);
    }
}