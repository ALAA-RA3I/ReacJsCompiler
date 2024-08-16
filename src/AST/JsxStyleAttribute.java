package AST;

public class JsxStyleAttribute {
    String style ;

    StyleValue styleValue ;

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public StyleValue getStyleValue() {
        return styleValue;
    }

    public void setStyleValue(StyleValue styleValue) {
        this.styleValue = styleValue;
    }

    @Override
    public String toString() {
        return "JsxStyleAttribute{" + "\n"+
                "style='" + style + '\'' + "\n"+
                ", styleValue=" + styleValue + "\n"+
                '}';
    }
}
