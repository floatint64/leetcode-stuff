package org.example;

import org.example.common.TreeNode;

public class AddOneRowToTree {
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if (depth == 1) {
            return new TreeNode(val, root, null);
        }

        return addRow(root, 1, val, depth, true);
    }

    private static TreeNode addRow(TreeNode root, int level, int val, int depth, boolean isLeft) {
        if (root == null) {
            if (level == depth) {
                return new TreeNode(val);
            } else {
                return null;
            }
        }


        if (level == depth) {
            return new TreeNode(val, isLeft ? root : null, !isLeft ? root : null);
        }

        root.left = addRow(root.left, level + 1, val, depth, true);
        root.right = addRow(root.right, level + 1, val, depth, false);

        return root;
    }
}
