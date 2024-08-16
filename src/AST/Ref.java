package AST;

public class Ref {
String refName;

    String hooks_name ;

    Parameters parameters ;

    public String getRefName() {
        return refName;
    }

    public void setRefName(String refName) {
        this.refName = refName;
    }

    public String getHooks_name() {
        return hooks_name;
    }

    public void setHooks_name(String hooks_name) {
        this.hooks_name = hooks_name;
    }

    public Parameters getParameters() {
        return parameters;
    }

    public void setParameters(Parameters parameters) {
        this.parameters = parameters;
    }

    @Override
    public String toString() {
        if (parameters != null) {
            return "Ref {" +
                    "refName='" + refName + '\'' +
                    ", hooks_name='" + hooks_name + '\'' +
                    ", expression=" + parameters +
                    '}';
        }
        else {
            return "Ref {" +
                    "refName='" + refName + '\'' +
                    ", hooks_name='" + hooks_name + '\'' +
                    '}';
        }
    }

}
