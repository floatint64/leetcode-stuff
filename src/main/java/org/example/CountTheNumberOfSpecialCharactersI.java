package org.example;

public class CountTheNumberOfSpecialCharactersI {
    public int numberOfSpecialChars(String word) {
        int result = 0;
        boolean[] contains = new boolean['z' + 1];

        for (int i = 0; i < word.length(); i++) {
            contains[word.charAt(i)] = true;
        }

        for (char i = 'A'; i <= 'Z'; i++) {
            result += contains[i] && contains[i + 32] ? 1 : 0;
        }

        return result;
    }
}
