package org.example;

import org.example.common.TreeNode;

public class SumOfLeftLeaves {
    public int sumOfLeftLeaves(TreeNode root) {
        return sumSub(root, false);
    }

    private static int sumSub(TreeNode root, boolean isLeft) {
        if (root == null) {
            return 0;
        }

        if (isLeft && root.left == null && root.right == null) {
            return root.val;
        }

        return sumSub(root.left, true) + sumSub(root.right, false);
    }
}
