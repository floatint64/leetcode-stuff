package org.example;

import java.util.Arrays;

public class SortVowelsInAString {
    public String sortVowels(String s) {
        int[] vowels = new int[s.length()];
        int[] idxs = new int[s.length()];

        Arrays.fill(vowels, 256);
        Arrays.fill(idxs, -1);

        int pos = 0;

        char[] buff = s.toCharArray();

        for (int i = 0; i < buff.length; i++) {
            if (buff[i] == 'A' || buff[i] == 'E' || buff[i] == 'I' || buff[i] == 'O' || buff[i] == 'U' ||
                buff[i] == 'a' || buff[i] == 'e' || buff[i] == 'i' || buff[i] == 'o' || buff[i] == 'u') {

                vowels[pos] = buff[i];
                idxs[pos] = i;
                pos++;
            }
        }

        Arrays.sort(vowels);

        pos = 0;

        for (int i = 0; i < buff.length; i++) {
            if (idxs[pos] == i) {
                buff[i] = (char)vowels[pos];
                pos++;
            }
        }

        return String.valueOf(buff);
    }
}
