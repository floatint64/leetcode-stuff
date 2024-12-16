package org.example;

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {

        int first = 0;
        int second = 1;

        int counter = 1;
        while (second < nums.length) {
            if (nums[first] < nums[second]) {
                counter++;
                nums[++first] = nums[second];
            }
            second++;
        }

        return counter;
    }
}
