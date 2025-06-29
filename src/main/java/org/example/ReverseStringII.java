package org.example;

public class ReverseStringII {
    public String reverseStr(String s, int k) {
        char[] chrs = s.toCharArray();

        int i = 0;

        while (i < chrs.length) {
            int maxSub = Math.min(chrs.length - i, k);
            int l = i;
            int r = i + maxSub - 1;
            while (l < r) {
                char tmp = chrs[l];
                chrs[l] = chrs[r];
                chrs[r] = tmp;
                l++;
                r--;
            }
            i += k * 2;
        }

        return String.valueOf(chrs);
    }
}
