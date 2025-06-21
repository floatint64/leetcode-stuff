package org.example;

import org.example.common.TreeNode;

import java.util.*;

public class BinaryTreeLevelOrderTraversalII {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {

        if (root == null) {
            return List.of();
        }

        LinkedList<List<Integer>> result = new LinkedList<>();

        Deque<TreeNode> stack = new ArrayDeque<>(2000);

        stack.push(root);

        while (!stack.isEmpty()) {
            var levelSize = stack.size();

            LinkedList<Integer> level = new LinkedList<>();

            for (int i = 0; i < levelSize; i++) {
                var node = stack.pollLast();
                level.addFirst(node.val);
                if (node.right != null) {
                    stack.push(node.right);
                }
                if (node.left != null) {
                    stack.push(node.left);
                }
            }

            result.addFirst(level);
        }

        return result;
    }
}
