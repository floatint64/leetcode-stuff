package org.example;

import org.example.common.TreeNode;

public class SumOfRootToLeafBinaryNumbers {
    public int sumRootToLeaf(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return sumNumbersSub(root, 0);
    }

    private int sumNumbersSub(TreeNode root, int prevVal) {

        if (root.left == null && root.right == null) {
            return (prevVal << 1) | root.val;
        }

        return (root.left != null ? sumNumbersSub(root.left, (prevVal << 1) | root.val) : 0)
                + (root.right != null ? sumNumbersSub(root.right, (prevVal << 1) | root.val) : 0);
    }
}
