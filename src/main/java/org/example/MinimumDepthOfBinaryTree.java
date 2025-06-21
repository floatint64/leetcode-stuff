package org.example;

import org.example.common.TreeNode;

import java.util.Deque;
import java.util.LinkedList;

public class MinimumDepthOfBinaryTree {
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        Deque<TreeNode> deque = new LinkedList<>();
        Deque<Integer> levelDeque = new LinkedList<>();

        deque.push(root);
        levelDeque.push(1);
        int minDepth = Integer.MAX_VALUE;

        while (!deque.isEmpty()) {
            var node = deque.poll();
            var level = levelDeque.poll();
            if (node.left == null && node.right == null) {
                minDepth = Math.min(minDepth, level);
            } else {
                if (node.left != null) {
                    deque.push(node.left);
                    levelDeque.push(level + 1);
                }
                if (node.right != null) {
                    deque.push(node.right);
                    levelDeque.push(level + 1);
                }
            }
        }

        return minDepth;
    }

    private static int minDepthSub(TreeNode root, int level) {
        if (root == null) {
            return Integer.MAX_VALUE;
        }

        if (root.left == null && root.right == null) {
            return level;
        }

        return Math.min(minDepthSub(root.left, level + 1), minDepthSub(root.right, level + 1));
    }
}
