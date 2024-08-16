package AST;

import java.util.ArrayList;

public class EventBody {


      String method_name ;

      String string_value ;
    ArrayList<String> property  = new ArrayList<String>();

    public String getMethod_name() {
        return method_name;
    }

    public void setMethod_name(String method_name) {
        this.method_name = method_name;
    }

    public String getString_value() {
        return string_value;
    }

    public void setString_value(String string_value) {
        this.string_value = string_value;
    }

    public ArrayList<String> getProperty() {
        return property;
    }

    public void setProperty(ArrayList<String> property) {
        this.property = property;
    }

    @Override
    public String toString() {
        if(property != null){
            return "EventBody{" +
                    "method_name='" + method_name + '\'' +
                    ", property=" + property +
                    '}';
        }
       else {
            return "EventBody{" +
                    "method_name='" + method_name + '\'' +
                    ", string_value=" + string_value +
                    '}';
        }    }
}
