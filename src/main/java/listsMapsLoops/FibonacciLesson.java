package listsMapsLoops;

import java.util.List;
import java.util.Map;

public interface FibonacciLesson {
    String fibonacciAppender(Integer n);

    Integer calcFibonacci(Integer n);

    List<Integer> createFibonacciList(Integer countFibonacciNumbers);

    Map<Integer, Integer> createFibonacciMap(Integer countFibonacciNumbers);
}
