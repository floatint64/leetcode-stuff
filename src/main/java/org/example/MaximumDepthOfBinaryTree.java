package org.example;

import org.example.common.TreeNode;

public class MaximumDepthOfBinaryTree {
    public int maxDepth(TreeNode root) {
        return root == null ? 0 : 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}
