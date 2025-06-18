package org.example;

import org.example.common.ListNode;
import org.example.common.TreeNode;

public class LinkedListInBinaryTree {

    private static boolean dfs(ListNode head, TreeNode root) {
        if (head == null) {
            return true;
        }

        if (root == null) {
            return false;
        }

        if (head.val == root.val) {
            return dfs(head.next, root.left) | dfs(head.next, root.right);
        }

        return false;
    }

    public boolean isSubPath(ListNode head, TreeNode root) {
        if (root == null) {
            return false;
        }

        return dfs(head, root) | isSubPath(head, root.left) | isSubPath(head, root.right);
    }
}
