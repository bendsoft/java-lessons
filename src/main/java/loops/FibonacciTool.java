package loops;

public class FibonacciTool {
    public String fibonacciAppender(Integer n) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            stringBuilder.append(calcFibonacci(i));
        }

        return stringBuilder.toString();
    }

    public Integer calcFibonacci(Integer n) {
        if (n <= 1) {
            return n;
        } else {
            return calcFibonacci(n-1) + calcFibonacci(n-2);
        }
    }
}
