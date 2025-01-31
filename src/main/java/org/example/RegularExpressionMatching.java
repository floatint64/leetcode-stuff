package org.example;

public class RegularExpressionMatching {
    public boolean isMatch(String s, String p) {

        char[] patternChars = p.toCharArray();
        char[] sChars = s.toCharArray();

        int strCharIdx = 0;
        int comparedChars = 0;
        int i = 0;
        while (i < patternChars.length && strCharIdx < sChars.length) {
            // decode pattern
            if ((i + 1) < patternChars.length && patternChars[i + 1] == '*') {
                char l;
                char r;
                if (patternChars[i] == '.') {
                    l = 'a';
                    r = 'z';
                } else {
                    l = patternChars[i];
                    r = patternChars[i];
                }
                char nextChar = 0;
                if ((i + 2) < patternChars.length) {
                    nextChar = patternChars[i + 2];
                }
                while (strCharIdx < sChars.length && (l <= sChars[strCharIdx] && sChars[strCharIdx] <= r)) {
                    comparedChars++;
                    strCharIdx++;
                }

                if (l == r && l <= nextChar && nextChar <= r) {
                    i++;
                }
                i++;
            } else {
                // single char match
                if (patternChars[i] == '.') {
                    comparedChars++;
                } else if (patternChars[i] == sChars[strCharIdx]) {
                    comparedChars++;
                }
                strCharIdx++;
            }
            i++;
        }

        return comparedChars == sChars.length && i >= patternChars.length;
    }
}
