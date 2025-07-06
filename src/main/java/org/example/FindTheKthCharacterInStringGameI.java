package org.example;

public class FindTheKthCharacterInStringGameI {
    public char kthCharacter(int k) {
        char[] buff = new char[k*2];
        int insertPos = 0;
        buff[insertPos++] = 'a';

        while (insertPos < k) {
            int currStrLen = insertPos;
            for (int i = 0; i < currStrLen; i++) {
                buff[insertPos++] = (char)((buff[i] + 1) % 'z');
            }
        }

        return buff[k - 1];
    }
}
