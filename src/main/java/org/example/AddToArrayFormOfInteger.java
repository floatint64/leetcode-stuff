package org.example;

import java.util.ArrayList;
import java.util.List;

public class AddToArrayFormOfInteger {
    public List<Integer> addToArrayForm(int[] num, int k) {
        var result = new ArrayList<Integer>(num.length + 1);

        int overflow = 0;

        int numIdx = num.length - 1;

        while (k > 0 || numIdx >= 0 || overflow > 0) {
            int val = overflow;
            if (k > 0) {
                val += k % 10;
                k /= 10;
            }
            if (numIdx >= 0) {
                val += num[numIdx--];
            }

            if (val >= 10) {
                overflow = 1;
                val %= 10;
            } else {
                overflow = 0;
            }

            result.addFirst(val);
        }

        return result;
    }
}
