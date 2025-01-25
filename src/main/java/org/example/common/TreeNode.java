package org.example.common;

import java.util.LinkedList;
import java.util.Queue;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode() {}
    public TreeNode(int val) { this.val = val; }
    public TreeNode(int val, TreeNode left, TreeNode right) {
      this.val = val;
      this.left = left;
      this.right = right;
    }

    public Queue<Integer> traversalInLevelOrder() {
        Queue<Integer> queue = new LinkedList<>();
        Queue<TreeNode> workQueue = new LinkedList<>();
        workQueue.add(this);
        TreeNode e = workQueue.poll();
        while (e != null) {
            queue.add(e.val);
            if (e.left != null) {
                workQueue.add(e.left);
            }
            if (e.right != null) {
                workQueue.add(e.right);
            }
            e = workQueue.poll();
        }
        return queue;
    }

    public static TreeNode fromArray(Integer[] input) {
        if (input.length < 1) {
            return null;
        }

        TreeNode root = new TreeNode(input[0]);

        int i = 1;
        Queue<TreeNode> initQueue = new LinkedList<>();
        initQueue.add(root);

        while (i < input.length - 1) {

            TreeNode node = initQueue.poll();

            if (input[i] != null) {
                TreeNode left = new TreeNode(input[i]);
                node.left = left;
                initQueue.add(left);
            }

            if ((i + 1 < input.length) && input[i + 1] != null) {
                TreeNode right = new TreeNode(input[i + 1]);
                node.right = right;
                initQueue.add(right);
            }

            i += 2;

        }

        return root;
    }

    @Override
    public String toString() {
        Queue<String> queue = new LinkedList<>();
        Queue<TreeNode> workQueue = new LinkedList<>();
        workQueue.add(this);
        TreeNode e = workQueue.poll();
        while (e != null) {
            queue.add(String.valueOf(e.val));
            if (e.left == null && e.right == null) {
                e = workQueue.poll();
                continue;
            }
            if (e.left != null) {
                workQueue.add(e.left);
            } else {
                queue.add("null");
            }
            if (e.right != null) {
                workQueue.add(e.right);
            } else {
                queue.add("null");
            }
            e = workQueue.poll();
        }
        return String.format("%s", queue);
    }
}
