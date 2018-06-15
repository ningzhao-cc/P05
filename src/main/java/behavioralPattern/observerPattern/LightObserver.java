package behavioralPattern.observerPattern;

/**
 * Created by Ning on 6/15/18.
 */
public class LightObserver implements Observer {
    boolean lightState = false;
    @Override
    public void update() {
        System.out.println("Door Observer has received");
        lightState = !lightState;
        System.out.println("now door is open ? " + lightState);
    }
}
