package behavioralPattern.statePattern;

/**
 * Created by Ning on 6/15/18.
 */
public class Instrument {
    private State state;

    public Instrument() {
        setState(new NormalState());
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }
}
