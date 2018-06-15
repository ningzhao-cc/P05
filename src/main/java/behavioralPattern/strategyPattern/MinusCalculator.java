package behavioralPattern.strategyPattern;

import java.util.List;

/**
 * Created by Ning on 6/15/18.
 */
public class MinusCalculator implements Calculator {
    @Override
    public int calculate(List<Integer> list) {
        int res = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            res -= list.get(i);
        }
        return res;
    }
}
