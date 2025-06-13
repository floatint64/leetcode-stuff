package org.example;

import java.util.Arrays;

public class IntervalListIntersections {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        int[][] result = new int[firstList.length + secondList.length][2];
        int lastInsertPos = 0;

        int i = 0;
        int j = 0;

        while (i < firstList.length && j < secondList.length) {
            int intervalStart = Math.max(firstList[i][0], secondList[j][0]);
            int intervalEnd = Math.min(firstList[i][1], secondList[j][1]);
            if (intervalStart <= intervalEnd) {
                result[lastInsertPos][0] = intervalStart;
                result[lastInsertPos][1] = intervalEnd;
                lastInsertPos++;
                if (firstList[i][1] > secondList[j][1]) {
                    j++;
                } else {
                    i++;
                }
            } else {
                if (intervalStart > firstList[i][1]) {
                    i++;
                } else {
                    j++;
                }
            }
        }

        return Arrays.copyOfRange(result, 0, lastInsertPos);
    }
}
