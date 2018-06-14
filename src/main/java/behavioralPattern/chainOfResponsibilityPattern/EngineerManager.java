package behavioralPattern.chainOfResponsibilityPattern;

/**
 * Created by Ning on 6/14/18.
 */
public class EngineerManager implements Handler {
    final static private int MAX = 1000;
    final static private Handler SUCCESSOR = new CEO();

    @Override
    public boolean handleRequest(Request request) {
        if (request.getBudget() <= MAX) {
            System.out.println("Approved by Engineer Manager");
            return true;
        }

        System.out.println("Engineer Manager asks for approval from CEO");
        return SUCCESSOR.handleRequest(request);
    }
}
