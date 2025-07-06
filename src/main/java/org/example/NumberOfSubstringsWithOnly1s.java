package org.example;

public class NumberOfSubstringsWithOnly1s {
    public int numSub(String s) {
        char[] chars = s.toCharArray();
        final int mod = (int) 1e9 + 7;

        int result = 0;
        int cnt = 0;

        for (int i = 0; i < chars.length; ++i) {
            if (chars[i] == '1') {
                cnt++;
            } else {
                cnt = 0;
            }
            result = (result + cnt) % mod;
        }
        return result;
    }
}
