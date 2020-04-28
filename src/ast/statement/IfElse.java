package ast.statement;

import ast.expression.*;
import visitor.Visitor;

import java.util.List;

public class IfElse extends AbstractStatement{

    private List<Statement> ifStatements;
    private List<Statement> elseStatements;

    private Expression condition; //condition relationship

    public IfElse(int line, int column, Expression condition,
                  List<Statement> ifStatements, List<Statement> elseStatements) {
        super(line, column);
        this.condition=condition;
        this.ifStatements=ifStatements;
        this.elseStatements=elseStatements;
    }

    public List<Statement> getIfStatements() {
        return ifStatements;
    }

    public void setIfStatements(List<Statement> ifStatements) {
        this.ifStatements = ifStatements;
    }

    public List<Statement> getElseStatements() {
        return elseStatements;
    }

    public void setElseStatements(List<Statement> elseStatements) {
        this.elseStatements = elseStatements;
    }

    public Expression getCondition() {
        return condition;
    }

    public void setCondition(Expression condition) {
        this.condition = condition;
    }

    @Override
    public String toString() {
        return "IfElse";
    }

    @Override
    public <T, P> T accept(Visitor<T, P> visitor, P param) {
        return visitor.visit(this,param);
    }
}