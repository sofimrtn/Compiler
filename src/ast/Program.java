package ast;

import ast.definition.Definition;
import ast.main.AbstractASTNode;

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
}