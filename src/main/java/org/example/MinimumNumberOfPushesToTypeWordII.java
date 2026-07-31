package org.example;

import java.util.Arrays;

public class MinimumNumberOfPushesToTypeWordII {
    public int minimumPushes(String word) {
        int[] charCnt = new int['z' + 1];

        for (int i = 0; i < word.length(); i++) {
            charCnt[word.charAt(i)]++;
        }

        int[] sortedCharCnt = new int[26];
        int idx = 0;

        for (char i = 'a'; i <= 'z'; i++) {
            sortedCharCnt[idx++] = charCnt[i];
        }

        Arrays.sort(sortedCharCnt);

        int result = 0;
        int distinctCharCnt = 0;

        int coeff = 1;
        for (int i = sortedCharCnt.length - 1; i >= 0; i--) {
            if (sortedCharCnt[i] > 0) {
                distinctCharCnt++;
                if (distinctCharCnt == 9) {
                    coeff++;
                    distinctCharCnt = 1;
                }
                result += sortedCharCnt[i] * coeff;
            }
        }

        return result;
    }
}
