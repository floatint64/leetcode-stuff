package org.example;

public class FindTheOriginalTypedStringI {
    public int possibleStringCount(String word) {

        if (word.length() == 1) {
            return 1;
        }

        char[] src = word.toCharArray();

        int result = 1;

        int[] counts = new int['z' + 1];

        for (int i = 1; i < src.length; i++) {
            counts[src[i]] += src[i - 1] == src[i] ? 1 : 0;
        }

        for (char c = 'a'; c <= 'z'; c++) {
            if (counts[c] > 0) {
                result += counts[c];
            }
        }

        return result;
    }
}
