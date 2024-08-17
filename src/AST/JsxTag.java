package AST;

import java.util.ArrayList;

public class JsxTag {
String jsx_tag ;

String jsx_close_tag ;
ArrayList<JsxAttributes> jsxAttributes = new ArrayList<JsxAttributes>() ;

ArrayList<JsxContent> jsxContents = new ArrayList<JsxContent>() ;

    public String getJsx_tag() {
        return jsx_tag;
    }

    public String getJsx_close_tag() {
        return jsx_close_tag;
    }

    public void setJsx_close_tag(String jsx_close_tag) {
        this.jsx_close_tag = jsx_close_tag;
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
    public ArrayList<JsxContent> getJsxContents() {
        return jsxContents;
    }

    public void setJsxContents(ArrayList<JsxContent> jsxContents) {
        this.jsxContents = jsxContents;
    }
    @Override
    public String toString() {
        if (!jsxAttributes.isEmpty() && !jsxContents.isEmpty()) {
            return "JsxTag{" + "\n"+
                    "jsx_tag='" + jsx_tag + '\'' + "\n"+
                    ", jsxAttributes=" + jsxAttributes + "\n"+
                    ", jsxContents=" + jsxContents + "\n"+
                    '}';
        }
      else if (!jsxAttributes.isEmpty()) {
            return "JsxTag{" + "\n"+
                    "jsx_tag='" + jsx_tag + '\'' +"\n"+
                    ", jsxAttributes=" + jsxAttributes + "\n"+
                    '}';
        }
        else{
            return "JsxTag{" + "\n"+
                    "jsx_tag='" + jsx_tag + '\'' + "\n"+
                    ", jsxContents=" + jsxContents + "\n"+
                    '}';
        }
    }
}
