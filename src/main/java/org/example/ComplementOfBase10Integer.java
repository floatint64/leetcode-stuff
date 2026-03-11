package org.example;

public class ComplementOfBase10Integer {
    public int bitwiseComplement(int n) {
        if (n == 0) {
            return 1;
        }

        int result = 0;

        int[] bitSwap = {1, 0};

        int pos = 0;
        while (n > 0) {
            int bit = (n & 1) > 0 ? 1 : 0;
            result |= bitSwap[bit] << pos++;
            n /= 2;
        }

        return result;
    }
}
