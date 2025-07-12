package org.example;

public class ConsecutiveCharacters {
    public int maxPower(String s) {
        int max = 0;

        int[] cache = new int['z' + 1];

        char[] chars = s.toCharArray();
        char last = chars[0];
        for (int i = 0; i < chars.length; i++) {
            cache[chars[i]]++;
            if (last == chars[i]) {
                max = Math.max(max, cache[chars[i]]);
            } else {
                cache[last] = 0;
            }
            last = chars[i];
        }

        return max;
    }
}
