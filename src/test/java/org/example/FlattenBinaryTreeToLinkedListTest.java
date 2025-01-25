package org.example;

import org.example.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlattenBinaryTreeToLinkedListTest {

    @Test
    void flatten() {
        FlattenBinaryTreeToLinkedList flatten = new FlattenBinaryTreeToLinkedList();

        TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(3), new TreeNode(4)), new TreeNode(5, null, new TreeNode(6)));

        flatten.flatten(root);
        Assertions.assertEquals("[1, null, 2, null, 3, null, 4, null, 5, null, 6]", root.toString());
    }

    @Test
    void flatten2() {
        FlattenBinaryTreeToLinkedList flatten = new FlattenBinaryTreeToLinkedList();

        TreeNode root = new TreeNode(1, null, new TreeNode(2, null, new TreeNode(3, null, new TreeNode(4))));

        flatten.flatten(root);

        Assertions.assertEquals("[1, null, 2, null, 3, null, 4]", root.toString());
    }

    @Test
    void flatten3() {
        FlattenBinaryTreeToLinkedList flatten = new FlattenBinaryTreeToLinkedList();

        TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(3, new TreeNode(4), null), null), null);

        flatten.flatten(root);

        Assertions.assertEquals("[1, null, 2, null, 3, null, 4]", root.toString());
    }

    @Test
    void flatten4() {
        FlattenBinaryTreeToLinkedList flatten = new FlattenBinaryTreeToLinkedList();

        TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(3, new TreeNode(5), null), new TreeNode(4)), null);

        flatten.flatten(root);

        Assertions.assertEquals("[1, null, 2, null, 3, null, 5, null, 4]", root.toString());
    }
}