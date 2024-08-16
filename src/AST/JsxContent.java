package AST;

public class JsxContent {

    JsxElement jsxElement ;

  Expression expression;

String property ;

    public JsxElement getJsxElement() {
        return jsxElement;
    }

    public void setJsxElement(JsxElement jsxElement) {
        this.jsxElement = jsxElement;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    @Override
    public String toString() {
        if(jsxElement != null){
            return "JsxContent{" +
                    "jsxElement=" + jsxElement +
                    '}';
        } else if (expression!= null) {
            return "JsxContent{" +
                    ", expression ='" + expression + '\'' +
                    '}';
        }
            else {
                return "JsxContent{" +
                        " property=" + property +
                        '}';
        }

    }
}
