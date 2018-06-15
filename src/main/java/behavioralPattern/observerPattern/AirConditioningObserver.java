package behavioralPattern.observerPattern;

/**
 * Created by Ning on 6/15/18.
 */
public class AirConditioningObserver implements Observer {
    boolean acState = false;
    @Override
    public void update() {
        System.out.println("AC Observer has received");
        acState = !acState;
        System.out.println("now ac is on ? " + acState);
    }
}
