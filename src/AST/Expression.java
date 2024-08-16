package AST;

public class Expression {
String identifier ;

String number ;

String string ;

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    @Override
    public String toString() {
        if(string != null) {
            return "Expression{" +
                    ", string = '" + string + '\'' +
                    '}';
        }
        else if(number != null){
            return "Expression{" +
                    ", number = '" + number + '\'' +
                    '}';
        }
        else {
            return "Expression{" +
                    ", identifier = '" + identifier + '\'' +
                    '}';
        }
    }
}
