package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllDuplicatesInAnArray {
    public List<Integer> findDuplicates(int[] nums) {

        Arrays.sort(nums);

        int left = 0;
        int right = 1;

        List<Integer> res = new ArrayList<>(nums.length);

        while (left < nums.length - 1) {
            if (right >= nums.length || nums[left] != nums[right]) {
                if (right - left == 2) {
                    res.add(nums[left]);
                }
                left = right;
                right = left + 1;
            } else {
                right++;
            }
        }

        return res;
    }
}
