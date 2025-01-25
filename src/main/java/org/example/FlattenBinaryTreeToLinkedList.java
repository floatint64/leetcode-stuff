package org.example;

import org.example.common.TreeNode;

import java.util.Deque;
import java.util.LinkedList;

public class FlattenBinaryTreeToLinkedList {
    private void flattenSub(TreeNode root, Deque<TreeNode> stack) {
        if (root == null) {
            return;
        }

        stack.push(root);

        flattenSub(root.left, stack);
        flattenSub(root.right, stack);

        root.right = null;
        root.left = null;
    }

    public void flatten(TreeNode root) {
        Deque<TreeNode> traversalStack = new LinkedList<>();
        flattenSub(root, traversalStack);

        if (!traversalStack.isEmpty()) {
            TreeNode currNode = traversalStack.pollLast();

            while (!traversalStack.isEmpty()) {
                TreeNode polledNode = traversalStack.pollLast();
                currNode.right = polledNode;
                currNode = polledNode;
            }
        }
    }
}
