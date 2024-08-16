package AST;

public class SrcValue {
    String string ;

    String identifier ;

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    @Override
    public String toString() {
        if (string != null) {
            return "SrcValue{" +
                    "string='" + string + '\'' +
                    '}';

        } else {
            return "SrcValue{"+
                    ", identifier='" + identifier + '\'' +
                    '}';
        }
    }
}
