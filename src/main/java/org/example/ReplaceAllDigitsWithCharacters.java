package org.example;

public class ReplaceAllDigitsWithCharacters {
    public String replaceDigits(String s) {
        char[] buff = s.toCharArray();

        for (int i = 0; i < buff.length; i++) {
            if ((i & 1) > 0) {
                int shift = buff[i] - '0';
                buff[i] = (char)(buff[i - 1] + shift);
            }
        }

        return String.valueOf(buff);
    }
}
