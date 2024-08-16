package AST;

public class FunctionalDeclaration {
String function_name ;

Functionalbody functionalbody ;

    public String getFunction_name() {
        return function_name;
    }

    public void setFunction_name(String function_name) {
        this.function_name = function_name;
    }

    public Functionalbody getFunctionalbody() {
        return functionalbody;
    }

    public void setFunctionalbody(Functionalbody functionalbody) {
        this.functionalbody = functionalbody;
    }

    @Override
    public String toString() {
        return "{" + "\n"+
                "function_name='" + function_name + '\'' + "\n"+
                ", functionalbody=" + functionalbody + "\n"+
                '}';
    }
}
