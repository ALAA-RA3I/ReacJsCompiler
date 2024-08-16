package AST;

public class JsxAttribute {
    String attribute ;

    AttributeValue attributeValue ;

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public AttributeValue getAttributeValue() {
        return attributeValue;
    }

    public void setAttributeValue(AttributeValue attributeValue) {
        this.attributeValue = attributeValue;
    }

    @Override
    public String toString() {
        return "JsxAttribute{" + "\n"+
                "attribute='" + attribute + '\'' + "\n"+
                ", attributeValue=" + attributeValue + "\n"+
                '}';
    }

}
