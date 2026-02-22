package org.example;

public class BinaryGap {
    public int binaryGap(int n) {
        int max = 0;

        int lastPos = -1;
        int cnt = 0;

        while (n > 0) {
            cnt++;
            if ((n & 1) > 0) {
                if (lastPos < 0) {
                    lastPos = cnt;
                } else {
                    max = Math.max(max, cnt - lastPos);
                    lastPos = cnt;
                }
            }

            n >>= 1;
        }

        return max;
    }
}
