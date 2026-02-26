package org.example;

public class NumberOfStepsToReduceANumberInBinaryRepresentationToOne {
    public int numSteps(String s) {
        int result = 0;

        var bits = s.toCharArray();

        int i = s.length() - 1;

        int overflow = 0;
        while (i > 0) {
            if (bits[i] != '0') {
                overflow = inc(bits, i);
            } else {
                i--;
            }
            result++;
        }

        if (overflow > 0) {
            result++;
        }

        return result;
    }

    private static int inc(char[] arr, int pos) {
        int overflow = 1;

        while (pos >= 0 && overflow > 0) {
            int val = arr[pos] - '0' + overflow;
            if (val > 1) {
                overflow = 1;
                val %= 2;
            } else {
                overflow = 0;
            }
            arr[pos--] = (char)(val + '0');
        }

        return overflow;
    }
}
