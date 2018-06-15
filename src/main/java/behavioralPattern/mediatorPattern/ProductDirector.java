package behavioralPattern.mediatorPattern;

/**
 * Created by Ning on 6/14/18.
 */
public class ProductDirector extends Colleague {

    public ProductDirector(String name, Mediator mediator) {
        super(name, mediator);
    }

    public void contact(String message) {
        mediator.contact(message, this);
    }

    public String getMessage(String message) {
        System.out.println("Product Director " + name + " : " + message);
        return message;
    }
}
