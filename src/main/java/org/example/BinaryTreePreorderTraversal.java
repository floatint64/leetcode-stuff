package org.example;

import org.example.common.TreeNode;

import java.util.*;

public class BinaryTreePreorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {

        if (root == null) {
            return List.of();
        }

        List<Integer> result = new ArrayList<>(100);

        Deque<TreeNode> stack = new LinkedList<>();

        stack.push(root);

        while (!stack.isEmpty()) {
            var node = stack.poll();
            result.add(node.val);

            if (node.right != null) {
                stack.push(node.right);
            }

            if (node.left != null) {
                stack.push(node.left);
            }
        }

        return result;
    }
}
