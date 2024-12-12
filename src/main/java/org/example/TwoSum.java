package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        ArrayList<Map.Entry<Integer, Integer>> sortedList = new ArrayList<>(nums.length);

        for (int i = 0; i < nums.length; i++) {
            sortedList.add(Map.entry(nums[i], i));
        }

        sortedList.sort(Comparator.comparing(Map.Entry::getKey));

        int l = 0;
        int r = nums.length - 1;

        while (l != r) {
            var sum = sortedList.get(l).getKey() + sortedList.get(r).getKey();
            if (sum > target) {
                r--;
            } else if (sum < target) {
                l++;
            } else {
                return new int[] {sortedList.get(l).getValue(), sortedList.get(r).getValue()};
            }
        }

        return new int[] {};
    }
}
