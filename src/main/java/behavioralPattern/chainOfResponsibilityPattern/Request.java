package behavioralPattern.chainOfResponsibilityPattern;

/**
 * Created by Ning on 6/14/18.
 */
public class Request {
    private int budget;

    public Request(int budget) {
        this.budget = budget;
    }

    public int getBudget() {
        return this.budget;
    }

    public void setBudget(int newBudget) {
        this.budget = newBudget;
    }
}
