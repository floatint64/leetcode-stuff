package org.example;

import org.example.common.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {

        if (root.left == null && root.right == null) {
            return true;
        }

        if (root.left == null || root.right == null) {
            return false;
        }

        Queue<TreeNode> lq = new LinkedList<>();
        Queue<TreeNode> rq = new LinkedList<>();

        lq.add(root.left);
        rq.add(root.right);


        TreeNode l = lq.poll();
        TreeNode r = rq.poll();

        while (l != null && r != null) {

            if (l.val != r.val) {
                return false;
            }

            if ((l.left != null && r.right == null) || (l.left == null && r.right != null)) {
                return false;
            }

            if ((l.right != null && r.left == null) || (l.right == null && r.left != null)) {
                return false;
            }

            if (l.left != null) {
                lq.add(l.left);
                rq.add(r.right);
            }

            if (l.right != null) {
                lq.add(l.right);
                rq.add(r.left);
            }

            if (!lq.isEmpty() && !rq.isEmpty()) {
                l = lq.poll();
                r = rq.poll();
            } else {
                l = null;
                r = null;
            }
        }

        return true;
    }
}
