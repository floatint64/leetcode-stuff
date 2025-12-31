package org.example;

public class CountTheDigitsThatDivideANumber {
    public int countDigits(int num) {
        int r = 0;

        int tmpNum = num;

        while (tmpNum > 0) {
            int p = tmpNum % 10;
            if (num % p == 0) {
                r++;
            }
            tmpNum /= 10;
        }

        return r;
    }
}
