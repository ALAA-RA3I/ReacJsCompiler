package AST;

public class VariableDeclaration {
    String variable;

    Expression value;

    public String getVariable() {
        return variable;
    }

    public void setVariable(String variable) {
        this.variable = variable;
    }

    public Expression getValue() {
        return value;
    }

    public void setValue(Expression value) {
        this.value = value;
    }

    @Override
    public String toString() {
        if (value != null) {
            return "VariableDeclaration{" +
                    "variable='" + variable + '\'' +
                    ", value=" + value +
                    '}';
        } else {
            return "VariableDeclaration{" +
                    "variable='" + variable + '\'' +
                    '}';
        }
    }
}
