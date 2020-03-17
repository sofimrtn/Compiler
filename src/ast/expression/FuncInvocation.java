package ast.expression;

import ast.statement.Statement;
import visitor.Visitor;

import java.util.List;

public class FuncInvocation extends AbstractExpression implements Statement {

    public List<Expression> getExpressions() {
        return expressions;
    }

    public Variable getVar() {
        return var;
    }

    private List<Expression> expressions;
    private Variable var;


    public FuncInvocation(int line, int column, List<Expression> expressions, Variable var) {
        super(line, column);
        this.expressions=expressions;
        this.var=var;
    }

    @Override
    public <T, P> T accept(Visitor<T, P> visitor, P param) {
        return visitor.visit(this,param);
    }
}