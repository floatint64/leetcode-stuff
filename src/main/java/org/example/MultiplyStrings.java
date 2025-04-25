package org.example;

import java.util.Arrays;
import java.util.stream.Collectors;

public class MultiplyStrings {

    public String multiply(String num1, String num2) {
        String bn;
        String sn;
        if (num1.length() > num2.length()) {
            bn = num1;
            sn = num2;
        } else {
            bn = num2;
            sn = num1;
        }

         int r[] = new int[sn.length() + bn.length()];

        int idx = 1;
        int overflow = 0;
        for (int i = sn.length() - 1; i >= 0; i--, idx++) {

            int idx2 = idx;
            for (int j = bn.length() - 1; j >= 0; j--, idx2++) {
                int val = overflow + r[r.length - idx2] + (sn.charAt(i) - 48) * (bn.charAt(j) - 48);
                if (val >= 10) {
                    overflow = val / 10;
                    val %= 10;
                } else {
                    overflow = 0;
                }
                r[r.length - idx2] = val;
            }

            r[r.length - idx2] = overflow;
            overflow = 0;
        }


        StringBuilder sb = new StringBuilder(r.length);
        // skip lead zero
        int i = 0;
        while (i < r.length && r[i] == 0) {
            i++;
        }

        int j = i;
        if (j == r.length) {
            sb.append(0);
        } else {
            while (j < r.length) {
                sb.append(r[j++]);
            }
        }



        return sb.toString();
    }
}
