package AST;

public class JsxAttributes {
    JsxAttribute jsxAttribute;
    JsxStyleAttribute jsxStyleِAttribute ;
    JsxSrcAttribute  jsxSrcAttribute ;

    public JsxAttribute getJsxAttribute() {
        return jsxAttribute;
    }

    public void setJsxAttribute(JsxAttribute jsxAttribute) {
        this.jsxAttribute = jsxAttribute;
    }

    public JsxStyleAttribute getJsxStyleِAttribute() {
        return jsxStyleِAttribute;
    }

    public void setJsxStyleِAttribute(JsxStyleAttribute jsxStyleِAttribute) {
        this.jsxStyleِAttribute = jsxStyleِAttribute;
    }

    public JsxSrcAttribute getJsxSrcAttribute() {
        return jsxSrcAttribute;
    }

    public void setJsxSrcAttribute(JsxSrcAttribute jsxSrcAttribute) {
        this.jsxSrcAttribute = jsxSrcAttribute;
    }

    @Override
    public String toString() {
        if(jsxAttribute!= null){
            return "JsxAttributes{" + "\n"+
                    "jsxAttribute=" + jsxAttribute + "\n"+
                    '}';
        }
        else if (jsxSrcAttribute != null) {
            return "JsxAttributes{" + "\n"+
                    ", jsxSrcAttribute=" + jsxSrcAttribute + "\n"+
                    '}';
        }
         else  {
            return "JsxAttributes{" + "\n"+
                    ", jsxSrcAttribute=" + jsxStyleِAttribute + "\n"+
                    '}';
        }

    }
}
