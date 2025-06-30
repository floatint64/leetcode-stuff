package org.example;

public class ReverseOnlyLetters {
    public String reverseOnlyLetters(String s) {
        char[] chars = s.toCharArray();

        int l = 0;
        int r = chars.length - 1;

        while (l < r) {
            if (!((chars[l] >= 'a' && chars[l] <= 'z') || (chars[l] >= 'A' && chars[l] <= 'Z'))) {
                l++;
                continue;
            }

            if (!((chars[r] >= 'a' && chars[r] <= 'z') || (chars[r] >= 'A' && chars[r] <= 'Z'))) {
                r--;
                continue;
            }

            char tmp = chars[l];
            chars[l] = chars[r];
            chars[r] = tmp;
            l++;
            r--;
        }

        return String.valueOf(chars);
    }
}
