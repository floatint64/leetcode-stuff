package org.example;

import org.example.common.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {

        if (root == null) {
            return List.of();
        }

        List<List<Integer>> result = new ArrayList<>(2000);

        Queue<TreeNode> queue = new ArrayDeque<>();

        queue.add(root);

        while (!queue.isEmpty()) {
            var levelSize = queue.size();

            List<Integer> levelList = new ArrayList<>(levelSize);

            for (int i = 0; i < levelSize; i++) {
                var node = queue.poll();

                levelList.add(node.val);

                if (node.left != null) {
                    queue.add(node.left);
                }

                if (node.right != null) {
                    queue.add(node.right);
                }
            }

            result.add(levelList);
        }

        return result;
    }
}
