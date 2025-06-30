package org.example;

public class FaultyKeyboard {
    public String finalString(String s) {
        StringBuilder sb = new StringBuilder(s.length());

        char[] chars = s.toCharArray();

        for (char c : chars) {
            if (c == 'i') {
                sb.reverse();
            } else {
                sb.append(c);
            }
        }

        return sb.toString();
    }
}
