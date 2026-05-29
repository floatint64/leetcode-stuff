package org.example;

public class SumOfDigitsOfStringAfterConvert {
    public int getLucky(String s, int k) {
        int[] a = new int[s.length() * 10];
        int len = 0;
        for (int i = 0; i < s.length(); i++) {
            a[len++] = s.charAt(i) - 96;
        }

        int n = 0;
        for (int i = 0; i < len; i++) {
            while (a[i] > 0) {
                n += a[i] % 10;
                a[i] /= 10;
            }
        }

        k--;

        while (k > 0) {
            int t = 0;
            while (n > 0) {
                t += n % 10;
                n /= 10;
            }
            k--;
            n = t;
        }

        return n;
    }
}
