package org.example;

public class ANumberAfterADoubleReversal {
    public boolean isSameAfterReversals(int num) {
        int r1 = 0;

        int originalNum = num;

        while (num > 0) {
            r1 = r1 * 10 + (num % 10);
            num /= 10;
        }

        int r2 = 0;

        while (r1 > 0) {
            r2 = r2 * 10 + (r1 % 10);
            r1 /= 10;
        }

        return r2 == originalNum;
    }
}
