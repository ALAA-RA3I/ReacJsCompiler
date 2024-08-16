package AST;

import java.util.ArrayList;

public class Functionalbody {
 ArrayList<HandlerEvent> handlerEvents = new ArrayList<HandlerEvent>();
ArrayList<VariableDeclaration> variableDeclarations = new ArrayList<VariableDeclaration>();
ArrayList<Hooks> hooks = new ArrayList<Hooks>();
 JsxElement jsxElement ;

    public ArrayList<HandlerEvent> getHandlerEvents() {
        return handlerEvents;
    }

    public void setHandlerEvents(ArrayList<HandlerEvent> handlerEvents) {
        this.handlerEvents = handlerEvents;
    }

    public ArrayList<VariableDeclaration> getVariableDeclarations() {
        return variableDeclarations;
    }

    public void setVariableDeclarations(ArrayList<VariableDeclaration> variableDeclarations) {
        this.variableDeclarations = variableDeclarations;
    }

    public ArrayList<Hooks> getHooks() {
        return hooks;
    }

    public void setHooks(ArrayList<Hooks> hooks) {
        this.hooks = hooks;
    }

    public JsxElement getJsxElement() {
        return jsxElement;
    }

    public void setJsxElement(JsxElement jsxElement) {
        this.jsxElement = jsxElement;
    }

    @Override
    public String toString() {
        return "Functionalbody{" +
                "handlerEvents=" + handlerEvents +
                ", variableDeclarations=" + variableDeclarations +
                ", hooks=" + hooks +
                ", jsxElement=" + jsxElement +
                '}';
    }
}
