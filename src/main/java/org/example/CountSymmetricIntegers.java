package org.example;

public class CountSymmetricIntegers {
    public int countSymmetricIntegers(int low, int high) {
        int result = 0;

        for (int num = low; num <= high; num++) {
            int digitCount = 1;
            if (num >= 10 && num <= 99) {
                digitCount = 2;
            } else if (num >= 100 && num <= 999) {
                digitCount = 3;
            } else if (num >= 1000 && num <= 9999) {
                digitCount = 4;
            } else if (num >= 10000 && num <= 99999) {
                digitCount = 5;
            }

            if (digitCount == 1 || digitCount == 3 || digitCount == 5) {
                continue;
            }

            int leftPartSum = 0;
            int rightPartSum = 0;

            int numTmp = num;
            for (int d = 0; d < digitCount / 2; d++) {
                rightPartSum += numTmp % 10;
                numTmp /= 10;
            }

            for (int d = 0; d < digitCount / 2; d++) {
                leftPartSum += numTmp % 10;
                numTmp /= 10;
            }

            if (leftPartSum == rightPartSum) {
                result++;
            }
        }

        return result;
    }
}
