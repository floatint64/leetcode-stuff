package org.example;

public class StringToInteger {
    public int myAtoi(String s) {

        int i = 0;
        int n = s.length();

        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        if (i >= n) {
            return 0;
        }

        // check sign
        boolean positive = true;
        if (s.charAt(i) == '-') {
            positive = false;
            i++;
        } else if (s.charAt(i) == '+') {
            i++;
        }

        long result = 0;

        long maxValue = positive ? Integer.MAX_VALUE : Integer.MIN_VALUE;

        while (i < n) {
            int digit = Character.digit(s.charAt(i++), 10);

            if (digit < 0) {
                return positive ? (int)result : -(int)result;
            } else if (digit == 0 && result == 0) {
                continue;
            }

            result *= 10;

            result += digit;

            if (maxValue < 0 && result > -maxValue) {
                return Integer.MIN_VALUE;
            } else if (maxValue > 0 && result > maxValue) {
                return Integer.MAX_VALUE;
            }
        }


        return positive ? (int)result : -(int)result;
    }
}
