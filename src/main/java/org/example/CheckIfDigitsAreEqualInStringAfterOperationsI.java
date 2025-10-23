package org.example;

public class CheckIfDigitsAreEqualInStringAfterOperationsI {
    public boolean hasSameDigits(String s) {
        char[][] buffs = new char[s.length()][];
        buffs[s.length() - 1] = s.toCharArray();
        for (int i = s.length() - 1; i >= 2; i--) {
            buffs[i - 1] = new char[buffs[i].length - 1];
            for (int x = 0; x < buffs[i - 1].length; x++) {
                buffs[i - 1][x] = (char)((buffs[i][x] + buffs[i][x + 1]) % 10);
            }
        }
        return buffs[1][0] == buffs[1][1];
    }
}
