package AST;

public class JsFunction {
    FunctionBody functionBody;

    public FunctionBody getFunctionBody() {
        return functionBody;
    }

    public void setFunctionBody(FunctionBody functionBody) {
        this.functionBody = functionBody;
    }

    @Override
    public String toString() {
        return "JsFunction{" + "\n"+
                "functionBody=" + functionBody + "\n"+
                '}';
    }
}
