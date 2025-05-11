package org.example;

import org.example.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreePreorderTraversalTest {

    @Test
    void preorderTraversal() {
        BinaryTreePreorderTraversal binaryTreePreorderTraversal = new BinaryTreePreorderTraversal();

        TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(3), new TreeNode(4)), new TreeNode(5));

        List<Integer> exp = List.of(1, 2, 3, 4, 5);

        Assertions.assertEquals(exp, binaryTreePreorderTraversal.preorderTraversal(root));
    }

    @Test
    void preorderTraversal2() {
        BinaryTreePreorderTraversal binaryTreePreorderTraversal = new BinaryTreePreorderTraversal();

        TreeNode root = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));

        List<Integer> exp = List.of(1, 2, 3);

        Assertions.assertEquals(exp, binaryTreePreorderTraversal.preorderTraversal(root));
    }

    @Test
    void preorderTraversal3() {
        BinaryTreePreorderTraversal binaryTreePreorderTraversal = new BinaryTreePreorderTraversal();

        TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(4), new TreeNode(5, new TreeNode(6), new TreeNode(7))), new TreeNode(3, null, new TreeNode(8, new TreeNode(9), null)));

        List<Integer> exp = List.of(1,2,4,5,6,7,3,8,9);

        Assertions.assertEquals(exp, binaryTreePreorderTraversal.preorderTraversal(root));
    }

    @Test
    void preorderTraversal4() {
        BinaryTreePreorderTraversal binaryTreePreorderTraversal = new BinaryTreePreorderTraversal();

        TreeNode root = new TreeNode(1);

        List<Integer> exp = List.of(1);

        Assertions.assertEquals(exp, binaryTreePreorderTraversal.preorderTraversal(root));
    }

    @Test
    void preorderTraversal5() {
        BinaryTreePreorderTraversal binaryTreePreorderTraversal = new BinaryTreePreorderTraversal();

        TreeNode root = null;

        List<Integer> exp = List.of();

        Assertions.assertEquals(exp, binaryTreePreorderTraversal.preorderTraversal(root));
    }
}