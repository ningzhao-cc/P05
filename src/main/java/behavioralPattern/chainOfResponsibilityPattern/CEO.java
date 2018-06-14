package behavioralPattern.chainOfResponsibilityPattern;

/**
 * Created by Ning on 6/14/18.
 */
public class CEO implements Handler {

    final static private int MAX = 10000;

    @Override
    public boolean handleRequest(Request request) {
        if (request.getBudget() <= MAX) {
            System.out.println("Approved by CEO");
            return true;
        }
        System.out.println("Rejected by CEO");
        return false;
    }
}
