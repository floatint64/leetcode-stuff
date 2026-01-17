package org.example;

import org.example.common.Node;

public class MaximumDepthOfNAryTree {
    public int maxDepth(Node root) {
        return maxDepthSub(root, 1);
    }

    private static int maxDepthSub(Node root, int level) {
        if (root == null) {
            return level - 1;
        }

        int newMaxLevel = level;

        for (var child : root.children) {
            newMaxLevel = Math.max(newMaxLevel, maxDepthSub(child, level + 1));
        }

        return newMaxLevel;
    }
}
