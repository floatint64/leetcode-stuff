package org.example;

public class NumberOfEvenAndOddBits {
    public int[] evenOddBit(int n) {
        int[] counts = {0,0};

        int idx = 0;
        while (n > 0) {
            int t = n % 2;
            if (t > 0) {
                if ((idx & 1) == 0) {
                    counts[0]++;
                } else {
                    counts[1]++;
                }
            }
            n /= 2;
            idx++;
        }

        return counts;
    }
}
