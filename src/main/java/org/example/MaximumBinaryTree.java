package org.example;

import org.example.common.TreeNode;

public class MaximumBinaryTree {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return constructSub(nums, 0, nums.length - 1);
    }

    private static TreeNode constructSub(int[] nums, int l, int r) {

        if (l > r) {
            return null;
        }

        int max = -1;
        int maxIndex = 0;

        for (int i = l; i <= r; i++) {
            if (nums[i] > max) {
                max = nums[i];
                maxIndex = i;
            }
        }

        var left = constructSub(nums, l, maxIndex - 1);
        var right = constructSub(nums, maxIndex + 1, r);

        return new TreeNode(max, left, right);
    }
}
