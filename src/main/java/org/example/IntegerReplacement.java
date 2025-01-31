package org.example;

public class IntegerReplacement {
    public int integerReplacement(int n) {
        if (n == 1) {
            return 0;
        }

        int opsCount = 0;

        if ((n & 1) > 0) {
            n++;
            opsCount++;
        }

        while (n > 2) {
            if ((n & 1) > 0) {
                n--;
                opsCount++;
            }
            n >>= 1;
            opsCount++;
        }

        // 0 + 1 or 2 - 1
        opsCount++;

        return opsCount;
    }
}
