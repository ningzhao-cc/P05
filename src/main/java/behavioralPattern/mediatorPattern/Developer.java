package behavioralPattern.mediatorPattern;

/**
 * Created by Ning on 6/14/18.
 */
public class Developer extends Colleague {

    public Developer(String name, Mediator mediator) {
        super(name, mediator);
    }

    public void contact(String message) {
        mediator.contact(message, this);
    }

    public String getMessage(String message) {
        System.out.println("Developer " + name + " : " + message);
        return message;
    }
}
