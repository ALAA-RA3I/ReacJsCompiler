package AST;

import java.util.ArrayList;

public class HandlerEvent {
    String methodName ;

    Parameters parameters ;

    EventBody eventBody ;

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public Parameters getParameters() {
        return parameters;
    }

    public void setParameters(Parameters parameters) {
        this.parameters = parameters;
    }

    public EventBody getEventBody() {
        return eventBody;
    }

    public void setEventBody(EventBody eventBody) {
        this.eventBody = eventBody;
    }

    @Override
    public String toString() {
        return "{" +
                "methodName ='" + methodName + '\'' + "\n"+
                ", parameters =" + parameters + "\n"+
                ", eventBody =" + eventBody + "\n"+
                '}';
    }
}
