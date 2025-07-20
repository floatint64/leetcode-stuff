package org.example;

public class SumOfDigitsInBaseK {
    public int sumBase(int n, int k) {
        int result = 0;

        while (n > 0) {
            int mod = n % k;
            result = result + mod;
            n /= k;
        }

        return result;
    }
}
