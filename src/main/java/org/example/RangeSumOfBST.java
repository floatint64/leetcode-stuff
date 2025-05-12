package org.example;

import org.example.common.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class RangeSumOfBST {
    public int rangeSumBST(TreeNode root, int low, int high) {
        int res = 0;
        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);

        while (!queue.isEmpty()) {
            var node = queue.poll();
            if (low <= node.val && node.val <= high) {
                res += node.val;
            }

            if (node.left != null) {
                queue.add(node.left);
            }

            if (node.right != null) {
                queue.add(node.right);
            }
        }

        return res;
    }
}
