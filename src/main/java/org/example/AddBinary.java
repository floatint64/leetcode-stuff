package org.example;

public class AddBinary {
    public String addBinary(String a, String b) {
        String sn;
        String bn;
        if (a.length() > b.length()) {
            bn = a;
            sn = b;
        } else {
            bn = b;
            sn = a;
        }

        int minLen = sn.length();
        int maxLen = bn.length();

        int[] r = new int[maxLen + 1];

        int overflow = 0;
        int idx = 1;
        for (int i = minLen - 1; i >= 0; i--, idx++) {
            int l = sn.charAt(sn.length() - idx) - '0';
            int rr = bn.charAt(bn.length() - idx) - '0';
            int val = l ^ rr;

            r[r.length - idx] = val  ^ overflow;

            overflow = ((l & rr) | (l & overflow)) | (rr & overflow);
        }

        if (minLen == maxLen && overflow > 0) {
            r[0] = 1;
        }


        int i = 0;
        for (i = maxLen - minLen - 1; i >= 0; i--, idx++) {
            int val = (bn.charAt(i) - '0');

            r[r.length - idx] = val  ^ overflow;

            overflow = val & overflow;
        }

        if (overflow > 0) {
            r[0] = 1;
        }

        StringBuilder sb = new StringBuilder();

        int j = r[0] == 0 ? 1 : 0;

        for (int k = j; k < r.length; k++) {
            sb.append(r[k]);
        }


        return sb.toString();
    }
}
