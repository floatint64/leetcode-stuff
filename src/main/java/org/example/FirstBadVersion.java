package org.example;

public class FirstBadVersion {

    private final int k;
    public int counter;

    public FirstBadVersion(int k) {
        this.k = k;
    }

    public boolean isBadVersion(int version) {
        counter++;
        return version >= k;
    }

    private int firstBadVersionSub(int l, int r) {
        if (l == r) {
            return l;
        }

        if (l > r) {
            return l;
        }

        int m = l + (r - l) / 2;

        var isCurrBad = isBadVersion(m);
        if (isCurrBad && (m > 1 && !isBadVersion(m - 1))) {
            return m;
        }

        if (isCurrBad) {
            return firstBadVersionSub(l, m - 1);
        } else {
            return firstBadVersionSub(m + 1, r);
        }

    }

    public int firstBadVersion(int n) {
        return firstBadVersionSub(1, n);
    }
}
