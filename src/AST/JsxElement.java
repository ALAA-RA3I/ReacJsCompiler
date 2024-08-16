package AST;


public class JsxElement {
JsxTag jsxTag;
JsxSelfCloseTage jsxSelfCloseTage;

    public JsxSelfCloseTage getJsxSelfCloseTage() {
        return jsxSelfCloseTage;
    }

    public void setJsxSelfCloseTage(JsxSelfCloseTage jsxSelfCloseTage) {
        this.jsxSelfCloseTage = jsxSelfCloseTage;
    }

    public JsxTag getJsxTag() {
        return jsxTag;
    }
    public void setJsxTag(JsxTag jsxTag) {
        this.jsxTag = jsxTag;
    }

    @Override
    public String toString() {
        if(jsxTag!=null) {
            return "{" + "\n"+
                    "jsxTag=" + jsxTag +
                    '}';
        }
     else {
            return "{" +  "\n"+
                    "JsxSelfCloseTage=" + jsxSelfCloseTage +
                    '}';
        }
    }
}
