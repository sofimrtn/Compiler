package ast.statement;

import ast.expression.*;
import java.util.List;

public class While extends AbstractStatement{

    private Expression condition; //condition relationship
    private List<Statement> statements;

    public While(int line, int column, Expression condition, List<Statement> statements) {
        super(line, column);
        this.condition=condition;
        this.statements=statements;
    }

    public Expression getCondition() {
        return condition;
    }

    public void setCondition(Expression condition) {
        this.condition = condition;
    }

    public List<Statement> getStatements() {
        return statements;
    }

    public void setStatements(List<Statement> statements) {
        this.statements = statements;
    }
}