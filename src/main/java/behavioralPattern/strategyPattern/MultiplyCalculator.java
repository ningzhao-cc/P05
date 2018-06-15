package behavioralPattern.strategyPattern;

import java.util.List;

/**
 * Created by Ning on 6/15/18.
 */
public class MultiplyCalculator implements Calculator {
    @Override
    public int calculate(List<Integer> list) {
        int prod = 1;
        for (int i : list) {
            prod *= i;
        }
        return prod;
    }
}
