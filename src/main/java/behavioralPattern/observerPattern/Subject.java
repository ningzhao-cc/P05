package behavioralPattern.observerPattern;

/**
 * Created by Ning on 6/15/18.
 */
public interface Subject {

    void add(Observer observer);

    void delete(Observer observer);

    void notifyObservers();

    void operation();
}
