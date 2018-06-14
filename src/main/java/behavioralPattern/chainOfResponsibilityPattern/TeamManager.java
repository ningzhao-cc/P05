package behavioralPattern.chainOfResponsibilityPattern;

/**
 * Created by Ning on 6/14/18.
 */
public class TeamManager implements Handler {
    final static private int MAX = 100;
    final static private Handler SUCCESSOR = new EngineerManager();
    @Override
    public boolean handleRequest(Request request) {
        if (request.getBudget() <= MAX) {
            System.out.println("Approved by Team Manager!");
            return true;
        }
        System.out.println("Team Manager asks for approval from Engineer Manager");
        return SUCCESSOR.handleRequest(request);
    }
}
