package org.example;

import org.example.common.TreeNode;

public class SubtreeOfAnotherTree {
    private static boolean dfs(TreeNode root, TreeNode subRoot) {
        if (root == null && subRoot == null) {
            return true;
        } else if (root == null || subRoot == null) {
            return false;
        }

        return root.val == subRoot.val && dfs(root.left, subRoot.left) && dfs(root.right, subRoot.right);
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null) {
            return false;
        } else if (subRoot == null) {
            return true;
        }

        if (dfs(root, subRoot)) {
            return true;
        }

        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }
}
