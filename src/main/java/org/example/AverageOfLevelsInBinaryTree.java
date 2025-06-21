package org.example;

import org.example.common.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class AverageOfLevelsInBinaryTree {
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> queue = new ArrayDeque<>(10000);

        queue.add(root);

        List<Double> result = new ArrayList<>(10000);

        while (!queue.isEmpty()) {
            var levelSize = queue.size();

            var levelValue = 0L;

            for (int i = 0; i < levelSize; i++) {
                var node = queue.poll();
                levelValue += node.val;
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }

            result.add((double) levelValue / levelSize);
        }

        return result;
    }
}
