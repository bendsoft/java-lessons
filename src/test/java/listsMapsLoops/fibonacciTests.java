package listsMapsLoops;

import listsMapsLoops.lessons.Fibonacci;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.Map;

public class fibonacciTests {
    private FibonacciLesson mySolution = new Fibonacci();

    @Test
    public void testCalcFibonacci() {
        Integer fifthFibonacci = mySolution.calcFibonacci(5);
        Assert.assertThat(fifthFibonacci, CoreMatchers.is(5));
    }

    @Test
    public void testFibonacciAppender() {
        String fibonacciNumbersAppended = mySolution.fibonacciAppender(5);
        Assert.assertEquals(fibonacciNumbersAppended, "11235");
    }

    @Test
    public void testCreateFibonacciList() {
        List<Integer> fibonacciNumbers = mySolution.createFibonacciList(5);
        Assert.assertThat(fibonacciNumbers, CoreMatchers.hasItems(1, 1, 2, 3, 5));
    }

    @Test
    public void testCreateFibonacciMap() {
        Map<Integer, Integer> fibonacciByIndex = mySolution.createFibonacciMap(5);
        Assert.assertThat(fibonacciByIndex.get(5), CoreMatchers.is(5));
    }
}
