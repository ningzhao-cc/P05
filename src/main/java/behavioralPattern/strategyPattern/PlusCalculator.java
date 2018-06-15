package behavioralPattern.strategyPattern;

import java.util.List;

/**
 * Created by Ning on 6/15/18.
 */
public class PlusCalculator implements Calculator {
    @Override
    public int calculate(List<Integer> list) {
        int sum = 0;
        for (int i : list) {
            sum += i;
        }
        return sum;
    }
}
