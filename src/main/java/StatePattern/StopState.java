package StatePattern;

public class StopState implements State {

    @Override
    public void doAction(StateContext stateContext) {
        System.out.println("Player is in stop state");
        stateContext.setState(this);
    }

    @Override
    public String toString() {
        return "Stop State";
    }
}