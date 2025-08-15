package org.example;

public class PowerOfFour {
    public boolean isPowerOfFour(int n) {
        return n == 1 || n == 4 ||
                (n == (4 << 2))  ||
                (n == (4 << 4)) ||
                (n == (4 << 6)) ||
                (n == (4 << 8)) ||
                (n == (4 << 10)) ||
                (n == (4 << 12)) ||
                (n == (4 << 14)) ||
                (n == (4 << 16)) ||
                (n == (4 << 18)) ||
                (n == (4 << 20)) ||
                (n == (4 << 22)) ||
                (n == (4 << 24)) ||
                (n == (4 << 26)) ||
                (n == (4 << 28));
    }
}
