package org.example;

import org.example.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class InvertBinaryTreeTest {

    @Test
    void invertTree() {
        InvertBinaryTree invertBinaryTree = new InvertBinaryTree();

        TreeNode root = new TreeNode(2, new TreeNode(1), new TreeNode(3));

        List<Integer> val = List.of(2, 3, 1);

        Assertions.assertEquals(val, invertBinaryTree.invertTree(root).traversalInLevelOrder());
    }

    @Test
    void invertTree2() {
        InvertBinaryTree invertBinaryTree = new InvertBinaryTree();

        TreeNode root = new TreeNode(4, new TreeNode(2, new TreeNode(1), new TreeNode(3)), new TreeNode(7, new TreeNode(6), new TreeNode(9)));

        List<Integer> val = List.of(4, 7, 2, 9, 6, 3, 1);

        Assertions.assertEquals(val, invertBinaryTree.invertTree(root).traversalInLevelOrder());
    }
}