package org.example;

import com.sun.source.tree.Tree;
import org.example.common.ListNode;
import org.example.common.TreeNode;

public class LinkedListInBinaryTree {
    private boolean isSub(ListNode prevHead, ListNode head, TreeNode root) {
        if (head == null) {
            return true;
        }

        if (root == null) {
            return false;
        }

        if (head.val == root.val) {
            return isSub(head, head.next, root.left) || isSub(head, head.next, root.right);
        }

        if (prevHead != head) {
            return isSub(prevHead, prevHead, root);// || isSub(originalHead, originalHead, root);
        } else {
            return isSub(prevHead, prevHead, root.left) || isSub(prevHead, prevHead, root.right);
        }
    }

    public boolean isSubPath(ListNode head, TreeNode root) {
        if (root == null) {
            return false;
        }
        return isSub(head, head, root);
    }
}
