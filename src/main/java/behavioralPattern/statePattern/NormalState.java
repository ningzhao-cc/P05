package behavioralPattern.statePattern;

/**
 * Created by Ning on 6/15/18.
 */
public class NormalState implements State {
    @Override
    public void update() {
        System.out.println("everything is good");
    }
}
