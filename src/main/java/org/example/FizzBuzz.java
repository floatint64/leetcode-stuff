package org.example;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    private static final String[] RESULTS = new String[10001];

    static {
        for (int i = 1; i <= 10000; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                RESULTS[i] = "FizzBuzz";
            } else if (i % 5 == 0){
                RESULTS[i] = "Buzz";
            } else if (i % 3 == 0) {
                RESULTS[i] = "Fizz";
            } else {
                RESULTS[i] = Integer.toString(i);
            }
        }
    }
    public List<String> fizzBuzz(int n) {
        var result = new ArrayList<String>(n);
        for (int i = 1; i <= n; i++) {
            result.add(RESULTS[i]);
        }
        return result;
    }
}
