package org.example;

public class PrimeNumberOfSetBitsInBinaryRepresentation {
    public int countPrimeSetBits(int left, int right) {
        int result = 0;

        for (int i = left; i <= right; i++) {
            switch (getBitsCount(i)) {
                case 2,3,5,7,11,13,17,19 -> result++;
            }
        }

        return result;
    }

    private static int getBitsCount(int n) {
        int result = 0;

        while (n > 0) {
            if ((n & 1) > 0) {
                result++;
            }

            n >>= 1;
        }

        return result;
    }
}
