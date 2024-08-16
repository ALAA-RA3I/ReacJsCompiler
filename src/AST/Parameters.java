package AST;

import java.util.ArrayList;

public class Parameters {
    ArrayList<String> parameter_names = new ArrayList<String>();

    public ArrayList<String> getParameter_names() {
        return parameter_names;
    }

    public void setParameter_names(ArrayList<String> parameter_names) {
        this.parameter_names = parameter_names;
    }

    @Override
    public String toString() {
        return "{" +
                "parameter_names=" + parameter_names + "\n"+
                '}';
    }
}
