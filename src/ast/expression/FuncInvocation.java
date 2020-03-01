package ast.expression;

import ast.statement.Statement;

import java.util.List;

public class FuncInvocation extends AbstractExpression implements Statement {

    private List<Expression> expressions;
    private Variable var;


    public FuncInvocation(int line, int column, List<Expression> expressions, Variable var) {
        super(line, column);
        this.expressions=expressions;
        this.var=var;
    }
}