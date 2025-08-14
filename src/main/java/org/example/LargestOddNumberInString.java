package org.example;

public class LargestOddNumberInString {
    public String largestOddNumber(String num) {

        int i = num.length() - 1;

        while (i >= 0) {
            if (((num.charAt(i) - '0') & 1) > 0) {
                return num.substring(0, i + 1);
            }
            i--;
        }

        return "";
    }
}
