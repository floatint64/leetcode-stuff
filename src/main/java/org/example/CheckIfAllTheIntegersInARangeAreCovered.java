package org.example;

import java.util.Arrays;
import java.util.Comparator;

public class CheckIfAllTheIntegersInARangeAreCovered {
    public boolean isCovered(int[][] ranges, int left, int right) {

        Arrays.sort(ranges, Comparator.comparingInt(a -> a[0]));

        int[] prefix = new int[52];

        for (int[] range : ranges) {
            int l = range[0];
            int r = range[1];
            for (int i = l; i <= r; i++) {
                prefix[i] = prefix[i - 1] + 1;
            }
        }

        int pref = prefix[right] == 0 || prefix[left] == 0 ? 0 : prefix[right] - prefix[left] + 1;
        int len = right - left + 1;

        return pref == len;
    }
}
