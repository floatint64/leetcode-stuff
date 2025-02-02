package org.example;

import org.example.common.ListNode;
import org.example.common.TreeNode;

public class LinkedListInBinaryTree {
    private boolean isSubPathSub(ListNode head, ListNode headOriginal, TreeNode root) {
        if (head == null) {
            return true;
        } else if (root == null) {
            return false;
        }

        boolean currResult = head.val == root.val;

        if (currResult) {
            boolean leftResult = isSubPathSub(head.next, headOriginal, root.left);
            boolean rightResult = isSubPathSub(head.next, headOriginal, root.right);
            if (!(leftResult || rightResult)) {
                return isSubPathSub(headOriginal, headOriginal, root.left) || isSubPathSub(headOriginal, headOriginal, root.right);
            }
            return true;
        }

        return isSubPathSub(headOriginal, headOriginal, root.left) || isSubPathSub(headOriginal, headOriginal, root.right);
    }

    public boolean isSubPath(ListNode head, TreeNode root) {
        return isSubPathSub(head, head, root);
    }
}
