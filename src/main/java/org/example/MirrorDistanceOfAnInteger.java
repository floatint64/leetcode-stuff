package org.example;

public class MirrorDistanceOfAnInteger {
    public int mirrorDistance(int n) {
        int reversed = 0;
        int nOriginal = n;

        while (n > 0) {
            reversed *= 10;
            int mod = n % 10;
            reversed += mod;
            n /= 10;
        }

        return Math.abs(nOriginal - reversed);
    }
}
