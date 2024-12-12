package org.example;

import org.example.common.TreeNode;

public class ValidateBinarySearchTree {
    boolean isBSTNode(TreeNode root, long l, long r) {
        if (root == null) {
            return true;
        }

        if (root.val >= l || root.val <= r) {
            return false;
        }

        return isBSTNode(root.left, root.val, r) && isBSTNode(root.right, l, root.val);
    }
    public boolean isValidBST(TreeNode root) {
        if (root.left == null && root.right == null) {
            return true;
        }
        return isBSTNode(root, Long.MAX_VALUE, Long.MIN_VALUE);
    }
}
