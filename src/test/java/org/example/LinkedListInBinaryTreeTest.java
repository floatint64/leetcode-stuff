package org.example;

import org.example.common.ListNode;
import org.example.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListInBinaryTreeTest {

    @Test
    void isSubPath() {
        LinkedListInBinaryTree link = new LinkedListInBinaryTree();
        ListNode head = new ListNode(4, new ListNode(6, new ListNode(8)));
        TreeNode root = new TreeNode(1, new TreeNode(4, null, new TreeNode(2, new TreeNode(1), null)), new TreeNode(4, new TreeNode(2, new TreeNode(6), new TreeNode(8, new TreeNode(1), new TreeNode(3))), null));

        Assertions.assertTrue(link.isSubPath(head, root));
    }
}