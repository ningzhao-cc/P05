package behavioralPattern.mediatorPattern;

/**
 * Created by Ning on 6/14/18.
 */
public abstract class Colleague {
    String name;
    Mediator mediator;

    public Colleague(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }
}
