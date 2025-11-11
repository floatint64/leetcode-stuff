package org.example;

public class FibonacciNumber {
    private static int[] fibs = new int[31];

    static {
        fibs[0] = 0;
        fibs[1] = 1;
        for (int i = 2; i < 31; i++) {
            fibs[i] = fibs[i - 1] + fibs[i - 2];
        }
    }

    public int fib(int n) {
        return fibs[n];
    }
}
