package org.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        Arrays.sort(nums);

        int[] l = new int[nums.length];
        int[] r = new int[nums.length];
        int[] c = new int[nums.length];
        int i = 0;
        PriorityQueue<Integer> pos = new PriorityQueue<>((a, b) -> c[b] - c[a]);

        int left = 0, right = 1;

        while (left < nums.length) {
            if (right >= nums.length || nums[left] != nums[right]) {
                l[i] = left;
                r[i] = right - 1;
                c[i] = right - left;
                left = right;
                //pos.add(i);
                i++;
            }
            right++;
        }

        for (int j = 0; j < i; j++) {
            pos.add(j);
        }

        return pos.stream()
                .limit(k)
                .mapToInt(pi -> nums[l[pi]])
                .toArray();
    }
}
