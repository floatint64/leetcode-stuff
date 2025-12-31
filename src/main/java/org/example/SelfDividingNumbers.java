package org.example;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>(10000);

        for (int i = left; i <= right; i++) {

            int n = i;

            boolean skip = false;

            while (n > 0) {
                int p = n % 10;

                if (p == 0) {
                    skip = true;
                    break;
                }

                if (i % p != 0) {
                    skip = true;
                    break;
                }

                n /= 10;
            }

            if (!skip) {
                result.add(i);
            }

        }


        return result;
    }
}
