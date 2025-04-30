package org.example;

public class IntegerReplacement {
    public int integerReplacement(int n) {
        int result = 0;

        while (n != 1) {
            if (n == 3) {
                n--;
            } else if ((n & 1) == 0) {
                n >>>= 1;
            } else if ((n % 4) == 3) {
                n++;
            } else {
                n--;
            }
            result++;
        }

        return result;
    }
}
