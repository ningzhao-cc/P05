package behavioralPattern.iteratorPattern;

/**
 * Created by Ning on 6/14/18.
 */
public interface Container {
    Iterator iterator();
    Object get(int i);
    int size();
}
