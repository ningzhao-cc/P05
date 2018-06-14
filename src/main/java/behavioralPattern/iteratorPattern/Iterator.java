package behavioralPattern.iteratorPattern;

/**
 * Created by Ning on 6/14/18.
 */
public interface Iterator {
    boolean hasNext();
    Object next();


    Object first();
    Object last();

    boolean hasPrevious();
    Object previous();
}
