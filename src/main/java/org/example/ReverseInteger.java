package org.example;

public class ReverseInteger {
    public int reverse(int x) {
        int result = 0;

        while (x != 0) {
            int prevResult = result;
            result *= 10;
            if ((prevResult > Integer.MAX_VALUE / 10) || (prevResult < Integer.MIN_VALUE / 10)) {
                result = 0;
                break;
            }
            int curr = x % 10;
            prevResult = result;
            result += curr;
            if ((curr > 0 && prevResult > Integer.MAX_VALUE - curr) || (curr < 0 && prevResult < Integer.MIN_VALUE - curr)) {
                result = 0;
                break;
            }
            x /= 10;
        }

        return result;
    }
}
