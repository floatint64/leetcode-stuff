package org.example;

public class Maximum69Number {
    public int maximum69Number(int num) {
        int[] digits = null;
        if (num >= 1 && num <= 9) {
            digits = new int[1];
        } else if (num >= 10 && num <= 99) {
            digits = new int[2];
        } else if (num >= 100 && num <= 999) {
            digits = new int[3];
        } else if (num >= 1000 && num <= 9999) {
            digits = new int[4];
        }

        int j = digits.length - 1;
        while (num > 0) {
            int t = num % 10;
            digits[j--] = t;
            num /= 10;
        }

        for (int i = 0; i < digits.length; i++) {
            if (digits[i] < 9) {
                digits[i] = 9;
                break;
            }
        }

        int result = 0;
        int mul = 1;

        for (int i = digits.length - 1; i >= 0; i--) {
            result += digits[i] * mul;
            mul *= 10;
        }

        return result;
    }
}
