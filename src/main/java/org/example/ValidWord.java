package org.example;

public class ValidWord {
    public boolean isValid(String word) {
        boolean hasVowel = false;
        boolean hasConsonant = false;
        if (word.length() < 3) {
            return false;
        }
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (!((c >= '0' && c <= '9') || (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))) {
                return false;
            }

            // 'a', 'e', 'i', 'o', 'u'
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                hasVowel = true;
            } else if (!(c >= '0' && c <= '9')) {
                hasConsonant = true;
            }
        }

        return hasVowel && hasConsonant;
    }
}
