package org.example;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MinimumAbsoluteDifference {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        var result = new LinkedList<List<Integer>>();

        Arrays.sort(arr);

        int minDiff = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length - 1; i++) {
            int diff = arr[i + 1] - arr[i];

            if (diff < minDiff) {
                minDiff = diff;
                result = new LinkedList<>();
                result.add(List.of(arr[i], arr[i + 1]));
            } else if (diff == minDiff) {
                result.add(List.of(arr[i], arr[i + 1]));
            }
        }


        return result;
    }
}
