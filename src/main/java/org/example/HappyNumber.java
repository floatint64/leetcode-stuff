package org.example;

import java.util.HashSet;

public class HappyNumber {
    public boolean isHappy(int n) {
        var cache = new HashSet<Integer>();

        while (n != 1) {

            int newN = 0;
            while (n > 0) {
                int digit = n % 10;
                newN += digit * digit;
                n /= 10;
            }

            if (cache.contains(newN)) {
                return false;
            } else {
                cache.add(newN);
            }

            n = newN;

        }

        return true;
    }
}
