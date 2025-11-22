package org.example;

import org.example.common.TreeNode;

public class IncreasingOrderSearchTree {

    public TreeNode increasingBST(TreeNode root) {
        TreeNode[] head = {root};
        TreeNode[] tail = {root};

        rebuildTree(root, head, tail);

        return head[0];
    }

    public void rebuildTree(TreeNode root, TreeNode[] head, TreeNode[] tail) {
        if (root == null) {
            head[0] = null;
            tail[0] = null;
            return;
        }

        if (root.left == null && root.right == null) {
            head[0] = root;
            tail[0] = root;
            return;
        }

        rebuildTree(root.left, head, tail);

        var leftHead = head[0];
        var leftTail = tail[0];

        rebuildTree(root.right, head, tail);

        if (leftTail != null) {
            leftTail.right = root;
            leftTail.left = null;
        }

        root.left = null;
        root.right = head[0];

        if (tail[0] == null) {
            tail[0] = root;
        }

        if (leftHead == null) {
            head[0] = root;
        } else {
            head[0] = leftHead;
        }
    }
}
