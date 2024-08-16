package AST;

import java.util.ArrayList;

public class ImportStatment {
ArrayList<String> framework_property = new ArrayList<String>();
String path;

    public ArrayList<String> getFramework_property() {
        return framework_property;
    }

    public void setFramework_property(ArrayList<String> framework_property) {
        this.framework_property = framework_property;
    }

    public String getLib_name() {
        return path;
    }

    public void setLib_name(String lib_name) {
        this.path = lib_name;
    }

    @Override
    public String toString() {
        return  "{" +
                "framework_property=" + framework_property + "\n"+
                ", path='" + path + '\'' + "\n"+
                '}';
    }
}
