package ast.main;

import ast.definition.Definition;

import java.util.List;

public class Program extends AbstractASTNode{

    private List<Definition> definitions;

    public Program(int line, int column) {
        super(line, column);
    }

    public List<Definition> getDefinitions() {
        return definitions;
    }
}