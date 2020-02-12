package ast.expression;

import java.util.List;

public class FuncInvocation extends AbstractExpression{

    private List<Expression> expressions;
    private Variable var;


    public FuncInvocation(int line, int column, List<Expression> expressions, Variable var) {
        super(line, column);
        this.expressions=expressions;
        this.var=var;
    }
}