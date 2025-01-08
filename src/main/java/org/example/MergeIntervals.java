package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparing(v -> v[0]));

        List<int[]> result = new ArrayList<>();

        for (int i = 0; i < intervals.length; i++) {

            int[] interval = intervals[i];

            if (!(!result.isEmpty() && result.get(result.size() - 1)[1] >= interval[1])) {

                int end = interval[1];
                for (int j = i + 1; j < intervals.length; j++) {
                    int[] nextInterval = intervals[j];
                    if (nextInterval[0] <= end) {
                        end = Math.max(end, nextInterval[1]);
                    }
                }
                result.add(new int[]{interval[0], end});
            }
        }

        return result.toArray(new int[][] {});
    }
}
