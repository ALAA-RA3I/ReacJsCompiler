package AST;

public class FunctionBody {
    String method_name ;
    Arguments arguments ;

    public String getMethod_name() {
        return method_name;
    }

    public void setMethod_name(String method_name) {
        this.method_name = method_name;
    }

    public Arguments getArguments() {
        return arguments;
    }

    public void setArguments(Arguments arguments) {
        this.arguments = arguments;
    }

    @Override
    public String toString() {
        return "FunctionBody{" +
                "method_name='" + method_name + '\'' +
                ", arguments=" + arguments +
                '}';
    }
}
