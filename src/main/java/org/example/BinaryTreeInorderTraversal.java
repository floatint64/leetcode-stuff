package org.example;

import org.example.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> result = new ArrayList<>();

        java.util.LinkedList<TreeNode> parentsStack = new java.util.LinkedList<>();

        TreeNode currentNode = root;

        while (currentNode != null) {

            var left = currentNode.left;
            var right = currentNode.right;

            if (left == null && right == null) {
                result.add(currentNode.val);
            } else {
                if (right != null) {
                    parentsStack.push(right);
                    currentNode.right = null;
                }

                parentsStack.push(currentNode);

                if (left != null) {
                    parentsStack.push(left);
                    currentNode.left = null;
                }
            }

            if (parentsStack.size() > 0) {
                currentNode = parentsStack.pop();
            } else {
                currentNode = null;
            }
        }

        return result;
    }
}
