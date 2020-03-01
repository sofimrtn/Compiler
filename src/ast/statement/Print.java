package ast.statement;

import ast.expression.*;
import java.util.List;

public class Print extends AbstractStatement{

    private List<Expression> expressions;

    public Print(int line, int column, List<Expression> expressions) {
        super(line, column);
        this.expressions=expressions;
    }

    public List<Expression> getExpressions() {
        return expressions;
    }

    public void setExpressions(List<Expression> expressions) {
        this.expressions = expressions;
    }
}