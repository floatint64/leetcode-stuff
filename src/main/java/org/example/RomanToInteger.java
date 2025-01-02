package org.example;

import java.util.Map;

public class RomanToInteger {
    private static final Map<Character, Integer> NUM_MAP = Map.of(
            'I', 1,
            'V', 5,
            'X', 10,
            'L', 50,
            'C', 100,
            'D', 500,
            'M', 1000
    );

    public int romanToInt(String s) {
        int num = 0;

        int i = 0;
        while (i < s.length()) {
            int a = NUM_MAP.get(s.charAt(i));
            int b = i + 1 < s.length() ? NUM_MAP.get(s.charAt(i + 1)) : 0;
            if (a > b) {
                num += a;
                i++;
            } else if (a < b){
                num += b - a;
                i += 2;
            } else {
                num += a;
                i += 1;
            }
        }

        return num;
    }
}
