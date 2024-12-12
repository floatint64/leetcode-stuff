package org.example;

import org.example.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidateBinarySearchTreeTest {

    @Test
    void isValidBST() {
        ValidateBinarySearchTree validateBinarySearchTree = new ValidateBinarySearchTree();

        TreeNode root = new TreeNode(2, new TreeNode(1), new TreeNode(3));

        Assertions.assertTrue(validateBinarySearchTree.isValidBST(root));
    }

    @Test
    void isValidBST2() {
        ValidateBinarySearchTree validateBinarySearchTree = new ValidateBinarySearchTree();

        TreeNode root = new TreeNode(5, new TreeNode(1), new TreeNode(4, new TreeNode(3), new TreeNode(6)));

        Assertions.assertFalse(validateBinarySearchTree.isValidBST(root));
    }

}