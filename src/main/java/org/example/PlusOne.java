package org.example;

import java.util.Arrays;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        int[] result = new int[digits.length + 1];

        int overflow = 1;

        for (int i = digits.length - 1; i >= 0; i--) {
            int newVal = digits[i] + overflow;
            if (newVal >= 10) {
                overflow = Math.max(1, newVal - 10);
                result[i + 1] = 0;
            } else {
                overflow = 0;
                result[i + 1] = newVal;
            }
        }

        if (overflow > 0) {
            result[0] = overflow;
            return result;
        } else {
            return Arrays.copyOfRange(result, 1, result.length);
        }
    }
}
