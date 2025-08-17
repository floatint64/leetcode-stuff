package org.example;

public class NumberOf1Bits {
    private static final int[] BITS_COUNT_MAP = new int[256];
    static {
        for (int i = 1; i < 256; i++) {
            int cnt = 0;
            int n = i;
            while (n > 0) {
                if ((n & 1) > 0) {
                    cnt++;
                }
                n /= 2;
            }
            BITS_COUNT_MAP[i] = cnt;
        }
    }

    public int hammingWeight(int n) {
        return BITS_COUNT_MAP[(byte)n & 0xFF] +
                BITS_COUNT_MAP[(byte) (n >>> 8) & 0xFF] +
                BITS_COUNT_MAP[(byte) (n >>> 16) & 0xFF] +
                BITS_COUNT_MAP[(byte) (n >>> 24) & 0xFF];
    }
}
