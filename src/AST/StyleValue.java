package AST;

import java.util.ArrayList;

public class StyleValue {
ArrayList<String> identifier = new ArrayList<String>() ;
ArrayList<String> string = new ArrayList<String>();
ArrayList<Integer> number = new ArrayList<Integer>() ;

    public ArrayList<String> getIdentifier() {
        return identifier;
    }

    public void setIdentifier(ArrayList<String> identifier) {
        this.identifier = identifier;
    }

    public ArrayList<String> getString() {
        return string;
    }

    public void setString(ArrayList<String> string) {
        this.string = string;
    }

    public ArrayList<Integer> getNumber() {
        return number;
    }

    public void setNumber(ArrayList<Integer> number) {
        this.number = number;
    }

    @Override
    public String toString() {
        if(string.isEmpty()) {
            return "StyleValue{" +
                    "identifier=" + identifier +
                    ", number=" + number +
                    '}';
        }
        else if(number.isEmpty()) {
            return "StyleValue{" +
                    "identifier=" + identifier +
                    ", string=" + string +
                    '}';
        }
        else {
            return "StyleValue{" +
                    "identifier=" + identifier +
                    ", string=" + string +
                    ", number=" + number +
                    '}';
        }
    }

}
