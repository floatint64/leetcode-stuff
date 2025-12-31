package org.example;

public class CheckIfNumberHasEqualDigitCountAndDigitValue {
    public boolean digitCount(String num) {
        int[] map = new int['9' - '0' + 1];

        for (int i = 0; i < num.length(); i++) {
            map[num.charAt(i) - '0']++;
        }

        for (int i = 0; i < num.length();i++) {
            if (num.charAt(i) - '0' != map[i]) {
                return false;
            }
        }

        return true;
    }
}
