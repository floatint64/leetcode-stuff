package org.example;

import org.example.common.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {


        Queue<TreeNode> pq = new LinkedList<>();
        Queue<TreeNode> qq = new LinkedList<>();


        if (p != null) {
            pq.add(p);
        }

        if (q != null) {
            qq.add(q);
        }

        while (!pq.isEmpty() || !qq.isEmpty()) {
            if (pq.size() != qq.size()) {
                return false;
            }

            TreeNode currP = pq.poll();
            TreeNode currQ = qq.poll();

            if (currP.val != currQ.val) {
                return false;
            } else {
                if (currP.left == null && currQ.left != null) {
                    return false;
                }
                if (currP.right == null && currQ.right != null) {
                    return false;
                }
            }


            if (currP.left != null) {
                pq.add(currP.left);
            }

            if (currP.right != null) {
                pq.add(currP.right);
            }

            if (currQ.left != null) {
                qq.add(currQ.left);
            }

            if (currQ.right != null) {
                qq.add(currQ.right);
            }

        }

        return true;
    }
}
