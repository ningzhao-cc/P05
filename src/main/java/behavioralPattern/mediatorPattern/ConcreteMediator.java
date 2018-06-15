package behavioralPattern.mediatorPattern;

/**
 * Created by Ning on 6/14/18.
 */
public class ConcreteMediator implements Mediator {

    private Developer dev;
    private ProductDirector pd;

    @Override
    public void contact(String message, Colleague colleague) {
        if (colleague == pd) {
            dev.getMessage(message);
        }
        if (colleague == dev) {
            pd.getMessage(message);
        }
    }

    public ProductDirector getPd() {
        return pd;
    }

    public Developer getDev() {
        return dev;
    }

    public void setDev(Developer dev) {
        this.dev = dev;
    }

    public void setPd(ProductDirector pd) {
        this.pd = pd;
    }
}
