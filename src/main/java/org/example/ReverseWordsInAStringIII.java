package org.example;

public class ReverseWordsInAStringIII {
    public String reverseWords(String s) {
        char[] src = s.toCharArray();
        char[] buff = new char[s.length()];
        int lastInsertPos = 0;

        int i = 0;


        int lastPos = 0;
        while (i < src.length) {
            if (src[i] == ' ') {
                for (int j = i - 1; j >= lastPos; j--) {
                    buff[lastInsertPos++] = src[j];
                }
                buff[lastInsertPos++] = src[i];
                lastPos = i + 1;
            }
            i++;
        }

        if (lastPos < src.length) {
            for (int j = src.length - 1; j >= lastPos; j--) {
                buff[lastInsertPos++] = src[j];
            }
        }

        return String.valueOf(buff);
    }
}
