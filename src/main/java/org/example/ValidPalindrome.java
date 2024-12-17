package org.example;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {

        int l = 0;
        int r = s.length() - 1;

        while (l < r) {
            while (l < r && !Character.isLetterOrDigit(s.codePointAt(l))) {
                l++;
            }
            while (l < r && !Character.isLetterOrDigit(s.codePointAt(r))) {
                r--;
            }

            var ll = Character.toLowerCase(s.codePointAt(l));
            var rl = Character.toLowerCase(s.codePointAt(r));

            if (ll != rl) {
                return false;
            }

            l++;
            r--;
        }

        return true;
    }
}
