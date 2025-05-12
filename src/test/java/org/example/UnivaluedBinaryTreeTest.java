package org.example;

import org.example.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UnivaluedBinaryTreeTest {

    @Test
    void isUnivalTree() {

        UnivaluedBinaryTree univaluedBinaryTree = new UnivaluedBinaryTree();

        TreeNode root = TreeNode.fromArray(new Integer[]{1,1,1,1,1,1});

        Assertions.assertTrue(univaluedBinaryTree.isUnivalTree(root));
    }

    @Test
    void isUnivalTree2() {

        UnivaluedBinaryTree univaluedBinaryTree = new UnivaluedBinaryTree();

        TreeNode root = TreeNode.fromArray(new Integer[]{2,2,2,5,2});

        Assertions.assertFalse(univaluedBinaryTree.isUnivalTree(root));
    }
}