package org.example;

public class GreatestEnglishLetterInUpperAndLowerCase {
    public String greatestLetter(String s) {

        boolean[] contains = new boolean['z' + 1];

        for (int i = 0; i < s.length(); i++) {
            contains[s.charAt(i)] = true;
        }

        for (char i = 'Z'; i >= 'A'; i--) {
            if (contains[i] && contains[i + 32]) {
                return String.valueOf(i);
            }
        }

        return "";
    }
}
