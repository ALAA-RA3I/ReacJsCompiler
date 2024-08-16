package AST;

public class Effect {
    String hooks_name ;

    String string_value ;

    String dependency ;

    public String getHooks_name() {
        return hooks_name;
    }

    public void setHooks_name(String hooks_name) {
        this.hooks_name = hooks_name;
    }

    public String getString_value() {
        return string_value;
    }

    public void setString_value(String string_value) {
        this.string_value = string_value;
    }

    public String getDependency() {
        return dependency;
    }

    public void setDependency(String dependency) {
        this.dependency = dependency;
    }

    @Override
    public String toString() {
        if(dependency != null){
            return "Effect{" +
                    "hooks_name='" + hooks_name + '\'' +
                    ", string_value='" + string_value + '\'' +
                    ", dependency='" + dependency + '\'' +
                    '}';
        }
        else {
            return "Effect{" +
                    "hooks_name='" + hooks_name + '\'' +
                    ", string_value='" + string_value + '\'' +
                    '}';
        }
        }

}
