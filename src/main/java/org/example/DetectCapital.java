package org.example;

public class DetectCapital {
    public boolean detectCapitalUse(String word) {
        int uppersCount = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) >= 'A' && word.charAt(i) <= 'Z') {
                uppersCount++;
            }
        }

        boolean isFirstUpper = word.charAt(0) >= 'A' && word.charAt(0) <= 'Z';

        return uppersCount == word.length() || (uppersCount == 1 && isFirstUpper) || uppersCount == 0;
    }
}
