package org.example;

public class ShiftingLettersII {
    public String shiftingLetters(String s, int[][] shifts) {
        char[] buff = s.toCharArray();

        for (int i = 0; i < shifts.length; i++) {
            int start = shifts[i][0];
            int stop = shifts[i][1]; // inclusive
            int dir = shifts[i][2];

            dir = dir == 1 ? 1 : -1;

            for (int j = start; j <= stop; j++) {
                buff[j] += dir;
                if (buff[j] < 'a') {
                    buff[j] = 'z';
                }
                if (buff[j] > 'z') {
                    buff[j] = 'a';
                }
            }
        }

        return String.valueOf(buff);
    }
}
