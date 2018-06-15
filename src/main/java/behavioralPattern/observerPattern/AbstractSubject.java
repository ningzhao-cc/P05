package behavioralPattern.observerPattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Ning on 6/15/18.
 */
public abstract class AbstractSubject implements Subject {
    private List<Observer> observers = new ArrayList<>();

    public void add(Observer observer) {
        observers.add(observer);
    }

    public void delete(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        Iterator<Observer> iter = observers.iterator();
        while (iter.hasNext()) {
            iter.next().update();
        }
    }
}
