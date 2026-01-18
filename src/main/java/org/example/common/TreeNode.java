package org.example.common;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
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

    public List<Integer> toListWithoutLastNulls() {
        List<Integer> result = new ArrayList<>();

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(this);
        int nonNullCount = 1;

        while (!queue.isEmpty() && nonNullCount > 0) {
            TreeNode current = queue.poll();

            if (current == null) {
                result.add(null);
                continue;
            }

            result.add(current.val);
            nonNullCount--;

            queue.offer(current.left);
            queue.offer(current.right);

            if (current.left != null) nonNullCount++;
            if (current.right != null) nonNullCount++;
        }

        return result;
    }

    public static TreeNode fromArray(Integer[] values) {
        if (values == null || values.length == 0 || values[0] == null) {
            return null;
        }

        TreeNode root = new TreeNode(values[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        int index = 1;

        while (!queue.isEmpty() && index < values.length) {
            TreeNode current = queue.poll();

            if (index < values.length) {
                Integer leftVal = values[index++];
                if (leftVal != null) {
                    current.left = new TreeNode(leftVal);
                    queue.offer(current.left);
                }
            }

            if (index < values.length) {
                Integer rightVal = values[index++];
                if (rightVal != null) {
                    current.right = new TreeNode(rightVal);
                    queue.offer(current.right);
                }
            }
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
