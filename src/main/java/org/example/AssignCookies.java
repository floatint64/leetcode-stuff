package org.example;

import java.util.Arrays;

public class AssignCookies {
    public int findContentChildren(int[] g, int[] s) {
        if (s.length == 0) {
            return 0;
        }

        Arrays.sort(g);
        Arrays.sort(s);

        int res = 0;

        int l = 0;
        int r = 0;

        while (l < g.length && r < s.length) {
            if (s[r] >= g[l]) {
                res++;
                l++;
                r++;
            } else {
                r++;
            }
        }

        return res;
    }
}
