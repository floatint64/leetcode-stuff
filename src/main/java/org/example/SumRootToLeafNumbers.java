package org.example;

import org.example.common.TreeNode;

public class SumRootToLeafNumbers {
    public int sumNumbers(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return sumNumbersSub(root, 0);
    }

    private int sumNumbersSub(TreeNode root, int prevVal) {

        if (root.left == null && root.right == null) {
            return prevVal * 10 + root.val;
        }

        return (root.left != null ? sumNumbersSub(root.left, prevVal * 10 + root.val) : 0)
                + (root.right != null ? sumNumbersSub(root.right, prevVal * 10 + root.val) : 0);
    }
}
