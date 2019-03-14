package StatePattern;

public class StartState implements State {

    @Override
    public void doAction(StateContext stateContext) {
        System.out.println("Player is in start state");
        stateContext.setState(this);
    }

    @Override
    public String toString() {
        return "Start State";
    }
}