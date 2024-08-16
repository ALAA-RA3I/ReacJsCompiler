package AST;

import java.util.ArrayList;

public class JsxSelfCloseTage {
    String jsx_tag ;
    ArrayList<JsxAttributes> jsxAttributes = new ArrayList<JsxAttributes>() ;

    public String getJsx_tag() {
        return jsx_tag;
    }

    public void setJsx_tag(String jsx_tag) {
        this.jsx_tag = jsx_tag;
    }

    public ArrayList<JsxAttributes> getJsxAttributes() {
        return jsxAttributes;
    }

    public void setJsxAttributes(ArrayList<JsxAttributes> jsxAttributes) {
        this.jsxAttributes = jsxAttributes;
    }


    @Override
    public String toString() {
        if (!jsxAttributes.isEmpty()) {
        return "JsxSelfCloseTage{" + "\n"+
                "jsx_tag='" + jsx_tag + '\'' + "\n"+
                ", jsxAttributes=" + jsxAttributes + "\n"+
                '}'  ;
    }
        else {
            return "JsxSelfCloseTage{" + "\n"+
                    "jsx_tag='" + jsx_tag + '\'' + "\n"+
                    '}' ;
        }
    }
}
