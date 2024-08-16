package AST;

public class AttributeValue {
    String string ;

    JsFunction jsFunction ;

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public JsFunction getJsFunction() {
        return jsFunction;
    }

    public void setJsFunction(JsFunction jsFunction) {
        this.jsFunction = jsFunction;
    }

    @Override
    public String toString() {
        if(string!=null) {
            return "AttributeValue{" +
                    "string='" + string + '\'' +
                    '}';
        }
        else {
            return "AttributeValue{" +
                    ", jsFunction=" + jsFunction +
                    '}';
        }
    }
}
