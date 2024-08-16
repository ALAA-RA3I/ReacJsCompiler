package AST;

import java.util.ArrayList;

public class StateFields {

     ArrayList<String> property = new ArrayList<String>() ;

   ArrayList  <String> string = new ArrayList<String>();


    public ArrayList<String> getProperty() {
        return property;
    }

    public void setProperty(ArrayList<String> property) {
        this.property = property;
    }

    public ArrayList<String> getString() {
        return string;
    }

    public void setString(ArrayList<String> string) {
        this.string = string;
    }

    @Override
    public String toString() {
        return "{" + "\n"+
                "property=" + property + "\n"+
                ", string=" + string + "\n"+
                '}';
    }
}
