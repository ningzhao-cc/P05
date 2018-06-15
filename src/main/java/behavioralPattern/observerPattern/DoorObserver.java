package behavioralPattern.observerPattern;

/**
 * Created by Ning on 6/15/18.
 */
public class DoorObserver implements Observer {
    boolean doorState = false;
    @Override
    public void update() {
        System.out.println("Door Observer has received");
        doorState = !doorState;
        System.out.println("now door is open ? " + doorState);
    }
}
