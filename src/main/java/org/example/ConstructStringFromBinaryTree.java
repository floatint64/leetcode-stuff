package org.example;

import org.example.common.TreeNode;

public class ConstructStringFromBinaryTree {
    private void visitNode(TreeNode root, StringBuilder sb) {

        if (root == null) {
            return;
        }

        sb.append(root.val);
        if (root.left == null && root.right == null){
            return;
        }

        sb.append('(');
        visitNode(root.left, sb);
        sb.append(')');

        if (root.right != null) {
            sb.append('(');
            visitNode(root.right, sb);
            sb.append(')');
        }
    }

    public String tree2str(TreeNode root) {
        StringBuilder sb = new StringBuilder(50000);
        visitNode(root, sb);
        return sb.toString();
    }
}
