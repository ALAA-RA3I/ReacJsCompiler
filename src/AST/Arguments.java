package AST;

import java.util.ArrayList;

public class Arguments {
    ArrayList<String> strings = new ArrayList<String>() ;

    public ArrayList<String> getStrings() {
        return strings;
    }

    public void setStrings(ArrayList<String> strings) {
        this.strings = strings;
    }

    @Override
    public String toString() {
        return "Arguments{" + "\n"+
                "strings=" + strings + "\n"+
                '}';
    }
}
