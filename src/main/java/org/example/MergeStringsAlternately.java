package org.example;

public class MergeStringsAlternately {
    public String mergeAlternately(String word1, String word2) {
        char[] result = new char[word1.length() + word2.length()];
        int pos = 0;

        int i = 0;
        int j = 0;

        while (result[result.length - 1] == 0) {
            if (i < word1.length()) {
                result[pos++] = word1.charAt(i++);
            }

            if (j < word2.length()) {
                result[pos++] = word2.charAt(j++);
            }
        }

        return String.copyValueOf(result);
    }
}
