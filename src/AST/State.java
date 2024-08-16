package AST;

public class State {

    String  use_state_value ;
    String use_state_method ;
    String hooks_name ;

 StateFields stateFields ;

 Expression expression ;



    public void setUse_state_value(String use_state_value) {
        this.use_state_value = use_state_value;
    }

    public String getUse_state_method() {
        return use_state_method;
    }

    public void setUse_state_method(String use_state_method) {
        this.use_state_method = use_state_method;
    }

    public String getHooks_name() {
        return hooks_name;
    }

    public void setHooks_name(String hooks_name) {
        this.hooks_name = hooks_name;
    }

    public StateFields getStateFields() {
        return stateFields;
    }

    public void setStateFields(StateFields stateFields) {
        this.stateFields = stateFields;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    @Override
    public String toString() {
        if (stateFields != null) {
            return "State{" +
                    "use_state_value='" + use_state_value + '\'' +
                    ", use_state_method='" + use_state_method + '\'' +
                    ", hooks_name='" + hooks_name + '\'' +
                    ", stateFields=" + stateFields +
                    '}';
        } else {
            return "State{" +
                    "use_state_value='" + use_state_value + '\'' +
                    ", use_state_method='" + use_state_method + '\'' +
                    ", hooks_name='" + hooks_name + '\'' +
                    ", expression=" + expression +
                    '}';
        }
    }
}
