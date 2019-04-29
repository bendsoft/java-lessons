package lists;

import loops.FibonacciTool;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class JavaLists {
    private FibonacciTool fibonacciTool = new FibonacciTool();

    List<Integer> createFibonacciList(Integer countFibonacciNumbers) {
        List<Integer> fibonacciList = new ArrayList<>();

        if (countFibonacciNumbers <= 1) {
            fibonacciList.add(countFibonacciNumbers);
        } else {
            for (int i = 1; i <= countFibonacciNumbers; i++) {
                fibonacciList.add(fibonacciTool.calcFibonacci(i));
            }
        }
        return fibonacciList;
    }

    List<Integer> createFibonacciListWithStream(Integer countFibonacciNumbers) {
        if (countFibonacciNumbers <= 1) {
            return new ArrayList<>(countFibonacciNumbers);
        }

        return IntStream.range(1,countFibonacciNumbers)
                .boxed()
                .map(n -> fibonacciTool.calcFibonacci(n))
                .collect(Collectors.toList());
    }
}
