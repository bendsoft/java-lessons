package listsMapsLoops;

import listsMapsLoops.lessons.FibonacciStream;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.Map;

public class fibonacciStreamTests {
    private FibonacciStreamsLesson mySolution = new FibonacciStream();

    @Test
    public void testCreateFibonacciListWithStream() {
        List<Integer> fibonacciNumbers = mySolution.createFibonacciListWithStream(5);
        Assert.assertThat(fibonacciNumbers, CoreMatchers.hasItems(1, 1, 2, 3, 5));
    }

    @Test
    public void testCreateFibonacciMapWithStream() {
        Map<Integer, Integer> fibonacciByIndex = mySolution.createFibonacciMapWithStream(5);
        Assert.assertThat(fibonacciByIndex.get(5), CoreMatchers.is(5));
    }
}
