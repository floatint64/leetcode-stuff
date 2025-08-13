package org.example;

public class PowerOfThree {
    public boolean isPowerOfThree(int n) {
        if (n < 1 || n % 2 == 0) {
            return false;
        }

        double t = Math.log(n) / Math.log(3);

        return Math.ceil(t) - t < 1e-10;
    }
}
