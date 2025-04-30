package org.example;

public class IntegerReplacement {
    public int integerReplacement(int n) {
        if (n == 1) {
            return 0;
        }

        int opsCount = 0;
        while (n > 1) {
            if ((n & 1) == 0) {
                n /= 2;
            } else {
                int nextN = n < Integer.MAX_VALUE ? n + 1 : n - 1;
                int prevN = n - 1;

                if (prevN == 2) {
                    n = prevN;
                } else if (((prevN / 2) & 1) == 0) {
                    n = prevN;
                } else if (((nextN / 2) & 1) == 0) {
                    n = nextN;
                } else {
                    n--;
                }
            }
            opsCount++;
        }

        return opsCount;
    }
}
