package StatePattern;

public class StateContext {

    private State state;

    public StateContext() {
        state = null;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}