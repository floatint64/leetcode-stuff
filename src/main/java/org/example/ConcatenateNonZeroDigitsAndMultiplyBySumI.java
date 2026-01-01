package org.example;

public class ConcatenateNonZeroDigitsAndMultiplyBySumI {
    public long sumAndMultiply(int n) {
        long x = 0;
        long mul = 1;
        long sum = 0;

        while (n > 0) {
            long p = n % 10;
            if (p > 0) {
                sum += p;
                x += p * mul;
                mul *= 10;
            }
            n /= 10;
        }

        return x * sum;
    }
}
