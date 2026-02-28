package org.example;

public class ConcatenationOfConsecutiveBinaryNumbers {
    private static final long MOD = 1000000007;
    public int concatenatedBinary(int n) {
        int bitsCnt = 1;
        int bitsIncNum = 2;

        long res = 0;
        for (int i = 1; i <= n; i++) {
            if (i == bitsIncNum) {
                bitsCnt++;
                bitsIncNum <<= 1;
            }

            res = (res << bitsCnt) | i;
            res %= MOD;
        }

        return (int)res;
    }
}
