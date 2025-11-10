package org.example;

public class DefuseTheBomb {

    public int[] decrypt(int[] code, int k) {
        int[] result = new int[code.length];

        for (int i = 0; i < code.length; i++) {
            int r;
            int l;
            if (k < 0) {
                r = 0;
                l = k;
            } else {
                r = k + 1;
                l = 1;
            }

            while (l != r) {
                int idx = (i + l) % code.length;
                if (idx < 0) {
                    idx += code.length;
                }
                result[i] = result[i] + code[idx];
                l++;
            }
        }

        return result;
    }
}
