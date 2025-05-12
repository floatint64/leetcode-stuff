package org.example;

import org.example.common.TreeNode;

public class UnivaluedBinaryTree {
    public boolean isUnivalTree(TreeNode root) {
        return isUnivalTreeSub(root, root.val);
    }

    private static boolean isUnivalTreeSub(TreeNode root, int val) {
        if (root == null) {
            return true;
        }

        return root.val == val && isUnivalTreeSub(root.left, val) && isUnivalTreeSub(root.right, val);
    }
}
