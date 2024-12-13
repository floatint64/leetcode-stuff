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

}
