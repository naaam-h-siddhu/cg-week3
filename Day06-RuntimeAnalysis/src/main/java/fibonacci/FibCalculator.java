package fibonacci;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class FibCalculator {
    public static int fibonacciRecursive(int n) {
        if (n <= 1) return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    public static int fibonacciIterative(int n) {
        int a = 0, b = 1, sum;
        for (int i = 2; i <= n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }

    public static void main(String[] args) {
        int n = 40;
        long startOfRecursion = System.nanoTime();
        int result1 =fibonacciRecursive(n);
        long endOfRecursion = System.nanoTime();


        long startOfIterative = System.nanoTime();
        int result2 = fibonacciIterative(n);
        long endOfIterative = System.nanoTime();


        System.out.println("Time taken by the recursive function: "+ (endOfRecursion-startOfRecursion)+" nanoseconds");
        System.out.println("Time taken by the iterative function: "+(endOfIterative-startOfIterative) +" nanoseconds");
    }

}
