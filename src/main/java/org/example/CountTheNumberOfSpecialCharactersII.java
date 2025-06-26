package org.example;

public class CountTheNumberOfSpecialCharactersII {
    public int numberOfSpecialChars(String word) {

        int[] charPoses = new int['z' + 1];

        for (char c = 'A'; c <= 'Z'; c++) {
            charPoses[c] = Integer.MAX_VALUE;
            charPoses[c + 32] = -1;
        }

        char[] chrs = word.toCharArray();

        for (int i = 0; i < chrs.length; i++) {
            if (chrs[i] >= 'a' && chrs[i] <= 'z') {
                charPoses[chrs[i]] = i;
            } else {
                charPoses[chrs[i]] = Math.min(charPoses[chrs[i]], i);
            }
        }

        int result = 0;

        for (char c = 'A'; c <= 'Z'; c++) {
            if (charPoses[c + 32] >= 0 && charPoses[c] < Integer.MAX_VALUE && charPoses[c] > charPoses[c + 32]) {
                result++;
            }
        }

        return result;
    }
}
