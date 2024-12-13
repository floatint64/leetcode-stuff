package org.example;

import org.example.common.TreeNode;

public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        var left = invertTree(root.left);
        var right = invertTree(root.right);

        var tmp = root.left;
        root.left = root.right;
        root.right = tmp;

        return root;
    }
}
