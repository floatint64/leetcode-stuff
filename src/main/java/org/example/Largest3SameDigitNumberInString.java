package org.example;

public class Largest3SameDigitNumberInString {
    public String largestGoodInteger(String num) {

        char maxNum = 0;

        for (int i = 0; i < num.length() - 2; i++) {
            if (num.charAt(i) == num.charAt(i + 1) && num.charAt(i + 1) == num.charAt(i + 2)) {
                maxNum = (char) Math.max(maxNum, num.charAt(i));
            }
        }

        if (maxNum == 0) {
            return "";
        }

        char[] str = {maxNum, maxNum, maxNum};
        return new String(str);
    }
}
