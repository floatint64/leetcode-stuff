package org.example;

public class ShiftingLetters {
    public String shiftingLetters(String s, int[] shifts) {
        char[] chars = s.toCharArray();

        long[] diff = new long[s.length() + 1];

        for (int i = 1; i < chars.length; i++) {
            diff[i] = chars[i] - chars[i - 1];
        }

        for (int i = 0; i < shifts.length; i++) {
            diff[0] += shifts[i];
            diff[i + 1] -= shifts[i];
        }

        for (int i = 1; i < diff.length; i++) {
            diff[i] += diff[i - 1];
        }

        char baseChar = chars[0];

        for (int i = 0; i < chars.length; i++) {
            int charNum = baseChar - 'a';
            chars[i] = (char)('a' + ((charNum + diff[i]) % 26));
        }

        return String.valueOf(chars);
    }
}
