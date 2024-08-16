package AST;

public class Hooks {
State state ;

Ref ref ;

Effect effect ;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public Ref getRef() {
        return ref;
    }

    public void setRef(Ref ref) {
        this.ref = ref;
    }

    public Effect getEffect() {
        return effect;
    }

    public void setEffect(Effect effect) {
        this.effect = effect;
    }

    @Override
    public String toString() {
        if (state != null) {
            return "Hooks{" +
                    "state =" + state +
                    '}';
        }
        else if (ref != null) {
            return "Hooks{" +
                    "ref =" + ref +
                    '}';
        }
        else  {
            return "Hooks{" +
                    "effect =" + effect +
                    '}';
        }
    }
}
