package org.example;

public class CapitalizeTheTitle {
    public String capitalizeTitle(String title) {
        char[] s = title.toCharArray();
        int[] w = new int[s.length];

        int lastWordPos = 0;

        for (int i = 0; i < s.length; i++) {
            if (s[i] == ' ') {
                w[lastWordPos++] = i;
            }
        }

        if (w[Math.max(0, lastWordPos - 1)] != s.length) {
            w[lastWordPos++] = s.length;
        }

        int si = 0;
        for (int i = 0; i < lastWordPos; i++) {
            int wordLen = w[i] - si;
            if (wordLen > 2) {
                if (s[si] >= 'a' && s[si] <= 'z') {
                    s[si] = (char)(s[si] - 32);
                }
                for (int j = 1; j < wordLen; j++) {
                    if (s[si + j] >= 'A' && s[si + j] <= 'Z') {
                        s[si + j] = (char)(s[si + j] + 32);
                    }
                }
            } else {
                for (int j = 0; j < wordLen; j++) {
                    if (s[si + j] >= 'A' && s[si + j] <= 'Z') {
                        s[si + j] = (char)(s[si + j] + 32);
                    }
                }
            }
            si += wordLen + 1;
        }

        return String.valueOf(s);
    }
}
