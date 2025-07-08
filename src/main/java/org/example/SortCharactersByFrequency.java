package org.example;

import java.util.*;

public class SortCharactersByFrequency {
    public String frequencySort(String s) {
        char[] result = new char[s.length()];

        int[][] count = new int['z' + 1][2];

        for (char c : s.toCharArray()) {
            count[c][0]++;
            count[c][1] = c;
        }

        Arrays.sort(count, (a, b) -> b[0] - a[0]);

        int insertPos = 0;

        int charIdx = 0;
        while (charIdx < count.length && count[charIdx][0] > 0) {
            while (count[charIdx][0] > 0) {
                result[insertPos++] = (char)count[charIdx][1];
                count[charIdx][0]--;
            }
            charIdx++;
        }

        return String.valueOf(result);
    }
}
