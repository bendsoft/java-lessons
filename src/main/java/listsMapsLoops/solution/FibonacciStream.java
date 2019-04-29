package listsMapsLoops.solution;

import listsMapsLoops.FibonacciLesson;
import listsMapsLoops.FibonacciStreamsLesson;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FibonacciStream implements FibonacciStreamsLesson {
    private FibonacciLesson fibonacci = new Fibonacci();

    @Override
    public List<Integer> createFibonacciListWithStream(Integer countFibonacciNumbers) {
        if (countFibonacciNumbers <= 1) {
            return new ArrayList<>(countFibonacciNumbers);
        }

        return IntStream.range(1, countFibonacciNumbers + 1).parallel()
                .boxed()
                .map(fibonacci::calcFibonacci)
                .collect(Collectors.toList());
    }

    @Override
    public Map<Integer, Integer> createFibonacciMapWithStream(Integer countFibonacciNumbers) {
        if (countFibonacciNumbers <= 1) {
            Map<Integer, Integer> fibonacciMap = new HashMap<>();
            fibonacciMap.put(countFibonacciNumbers, countFibonacciNumbers);
            return fibonacciMap;
        }

        return IntStream.range(1, countFibonacciNumbers + 1)
                .boxed()
                .map(n -> new FibonacciPair(n, fibonacci.calcFibonacci(n)))
                .collect(Collectors.toMap(FibonacciPair::getIndex, FibonacciPair::getFibonacciNumber));
    }
}
