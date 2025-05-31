package org.example;

public class ContiguousArray {
    public int findMaxLength(int[] nums) {

        int maxVal = 0;

        int i = 0;

        int[] counts = {0, 0};

        while (i < nums.length) {
            int currNum = nums[i];
            do {
                counts[currNum]++;
                i++;
            } while (i < nums.length && nums[i] == currNum);

            if (i < nums.length) {
                currNum = nums[i];
                do {
                    counts[currNum]++;
                    i++;
                } while (i < nums.length && nums[i] == currNum);
            }

            maxVal = Math.max(maxVal, 2 * Math.min(counts[0], counts[1]));
            if (counts[0] > counts[1]) {
                counts[1] = 0;
            } else {
                counts[0] = 0;
            }
        }

        return maxVal;
    }
}
