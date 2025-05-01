package org.example;

public class FirstBadVersion {

    private final int k;

    public FirstBadVersion(int k) {
        this.k = k;
    }

    public boolean isBadVersion(int version) {
        return version >= k;
    }

    public int firstBadVersion(int n) {
        if (n == 1 && isBadVersion(n)) {
            return 1;
        }
        if (isBadVersion(n) && !isBadVersion(n - 1)) {
            return n;
        }

        int m = 1 + (n - 1) / 2;
        while (m > 1 && m < n) {
            var prev = isBadVersion(m - 1);
            var curr = isBadVersion(m);
            if (!prev && curr) {
                return m;
            }

            if (curr) {
                m = (m - 1) / 2;
            } else {
                m = (m + n) / 2;
            }
        }

        if (m == 1) {
            return 1;
        }

        while (!isBadVersion(m)) {
            m++;
        }

        return m;
    }
}
