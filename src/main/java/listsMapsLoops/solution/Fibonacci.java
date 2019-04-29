package listsMapsLoops.solution;

import listsMapsLoops.FibonacciLesson;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Fibonacci implements FibonacciLesson {
    @Override
    public String fibonacciAppender(Integer n) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            stringBuilder.append(calcFibonacci(i));
        }

        return stringBuilder.toString();
    }

    @Override
    public Integer calcFibonacci(Integer n) {
        if (n <= 1) {
            return n;
        } else {
            return calcFibonacci(n - 1) + calcFibonacci(n - 2);
        }
    }

    @Override
    public List<Integer> createFibonacciList(Integer countFibonacciNumbers) {
        List<Integer> fibonacciList = new ArrayList<>();

        if (countFibonacciNumbers <= 1) {
            fibonacciList.add(countFibonacciNumbers);
        } else {
            for (int i = 1; i <= countFibonacciNumbers; i++) {
                fibonacciList.add(calcFibonacci(i));
            }
        }
        return fibonacciList;
    }

    @Override
    public Map<Integer, Integer> createFibonacciMap(Integer countFibonacciNumbers) {
        Map<Integer, Integer> fibonacciMap = new HashMap<>();

        if (countFibonacciNumbers <= 1) {
            fibonacciMap.put(countFibonacciNumbers, countFibonacciNumbers);
        } else {
            for (int i = 1; i <= countFibonacciNumbers; i++) {
                fibonacciMap.put(i, calcFibonacci(i));
            }
        }
        return fibonacciMap;
    }
}
