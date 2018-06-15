package behavioralPattern.observerPattern;

/**
 * Created by Ning on 6/15/18.
 */
public class ConcreteSubject extends AbstractSubject {
    @Override
    public void operation() {
        System.out.println("updating!");
        notifyObservers();
    }
}
