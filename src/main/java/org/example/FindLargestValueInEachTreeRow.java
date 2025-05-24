package org.example;

import org.example.common.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindLargestValueInEachTreeRow {

    private final int[] LEVEL_MAX = new int[10000];
    private int MAX_LEVEL = -1;

    public FindLargestValueInEachTreeRow() {
        Arrays.fill(LEVEL_MAX, Integer.MIN_VALUE);
    }

    public List<Integer> largestValues(TreeNode root) {
        var result = new ArrayList<Integer>();

        largestValuesSub(root, 0);

        if (MAX_LEVEL >= 0) {
            for (int i = 0; i <= MAX_LEVEL; i++) {
                result.add(LEVEL_MAX[i]);
            }
        }

        return result;
    }

    private void largestValuesSub(TreeNode root, int level) {
        if (root == null) {
            return;
        }

        MAX_LEVEL = Math.max(MAX_LEVEL, level);
        LEVEL_MAX[level] = Math.max(LEVEL_MAX[level], root.val);

        largestValuesSub(root.left, level + 1);
        largestValuesSub(root.right, level + 1);
    }
}
