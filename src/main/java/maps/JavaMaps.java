package maps;

import loops.FibonacciTool;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class JavaMaps {
    private FibonacciTool fibonacciTool = new FibonacciTool();

    Map<Integer, Integer> createFibonacciMap(Integer countFibonacciNumbers) {
        Map<Integer, Integer> fibonacciMap = new HashMap<>();

        if (countFibonacciNumbers <= 1) {
            fibonacciMap.put(countFibonacciNumbers, countFibonacciNumbers);
        } else {
            for (int i = 1; i <= countFibonacciNumbers; i++) {
                fibonacciMap.put(i, fibonacciTool.calcFibonacci(i));
            }
        }
        return fibonacciMap;
    }

    Map<Integer, Integer> createFibonacciMapWithStream(Integer countFibonacciNumbers) {
        if (countFibonacciNumbers <= 1) {
            Map<Integer, Integer> fibonacciMap = new HashMap<>();
            fibonacciMap.put(countFibonacciNumbers, countFibonacciNumbers);
            return fibonacciMap;
        }

        return IntStream.range(1,countFibonacciNumbers)
                .boxed()
                .map(n -> new FibonacciPair(n, fibonacciTool.calcFibonacci(n)))
                .collect(Collectors.toMap(FibonacciPair::getIndex, FibonacciPair::getFibonacciNumber));
    }

    private class FibonacciPair {
        private Integer fibonacciNumber;
        private Integer index;

        FibonacciPair(Integer index, Integer fibonacciNumber) {
            this.index = index;
            this.fibonacciNumber = fibonacciNumber;
        }

        public Integer getIndex() {
            return index;
        }

        public Integer getFibonacciNumber() {
            return fibonacciNumber;
        }
    }
}
