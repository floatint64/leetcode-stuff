package org.example;

import org.example.common.TreeNode;

public class PathSum {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }

        return hasSum(root, targetSum, 0);
    }

    private static boolean hasSum(TreeNode root, int target, int current) {
        if (root == null) {
            return false;
        }

        if (current + root.val == target && root.left == null && root.right == null) {
            return true;
        }

        return hasSum(root.left, target, current + root.val)
                || hasSum(root.right, target, current + root.val);

    }
}
