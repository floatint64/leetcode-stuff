package org.example;

public class ShiftingLettersII {
    public String shiftingLetters(String s, int[][] shifts) {
        char[] buff = s.toCharArray();

        int[] diff = new int[s.length() + 1];

        diff[0] = 0;
        for (int i = 1; i < s.length(); i++) {
            diff[i] = buff[i] - buff[i - 1];
        }

        for (int i = 0; i < shifts.length; i++) {
            int shift = 0;
            if (shifts[i][2] == 1) {
                shift = 1;
            } else {
                shift = -1;
            }

            diff[shifts[i][0]] += shift;
            diff[shifts[i][1] + 1] -= shift;
        }

        int[] res = new int[s.length()];
        res[0] = diff[0];
        for (int i = 1; i < s.length(); i++) {
            res[i] = res[i - 1] + diff[i];
        }

        char f = buff[0];
        for (int i = 0; i < res.length; i++) {
            int shift = res[i];
            shift = shift % 26;
            if (shift < 0) {
                shift += 26;
            }
            buff[i] = (char)('a' + (((f - 'a') + shift) % 26));
        }

        return String.valueOf(buff);
    }
}
