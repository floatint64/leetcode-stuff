package org.example;

import org.example.common.TreeNode;

public class MaximumLevelSumOfABinaryTree {
    public int maxLevelSum(TreeNode root) {
        int[] levelSums = new int[10001];
        int[] levelMax = new int[1];

        levelSum(root, levelSums, levelMax, 0);

        int max = Integer.MIN_VALUE;
        int maxi = 0;

        for (int i = 0; i <= levelMax[0]; i++) {
            if (levelSums[i] > max){
                maxi = i;
                max = levelSums[i];
            }
        }

        return maxi + 1;
    }

    private static void levelSum(TreeNode root, int[] levelSums, int[] levelMax, int currentLevel) {
        if (root == null) {
            return;
        }

        levelSums[currentLevel] += root.val;

        levelSum(root.left, levelSums, levelMax, currentLevel + 1);
        levelSum(root.right, levelSums, levelMax, currentLevel + 1);

        levelMax[0] = Math.max(levelMax[0], currentLevel);
    }
}
