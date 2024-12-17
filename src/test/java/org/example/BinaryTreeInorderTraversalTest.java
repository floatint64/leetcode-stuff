package org.example;

import org.example.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeInorderTraversalTest {

    @Test
    void inorderTraversal() {
        BinaryTreeInorderTraversal binaryTreeInorderTraversal = new BinaryTreeInorderTraversal();

        TreeNode root = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));

        List<Integer> exp = List.of(1, 3, 2);

        Assertions.assertEquals(exp, binaryTreeInorderTraversal.inorderTraversal(root));
    }

    @Test
    void inorderTraversal2() {
        BinaryTreeInorderTraversal binaryTreeInorderTraversal = new BinaryTreeInorderTraversal();

        TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(4), new TreeNode(5, new TreeNode(6), new TreeNode(7))), new TreeNode(3, null, new TreeNode(8, new TreeNode(9), null)));

        List<Integer> exp = List.of(4,2,6,5,7,1,3,9,8);

        Assertions.assertEquals(exp, binaryTreeInorderTraversal.inorderTraversal(root));
    }

    @Test
    void inorderTraversal3() {
        BinaryTreeInorderTraversal binaryTreeInorderTraversal = new BinaryTreeInorderTraversal();

        TreeNode root = null;

        List<Integer> exp = List.of();

        Assertions.assertEquals(exp, binaryTreeInorderTraversal.inorderTraversal(root));
    }

    @Test
    void inorderTraversal4() {
        BinaryTreeInorderTraversal binaryTreeInorderTraversal = new BinaryTreeInorderTraversal();

        TreeNode root = new TreeNode(1);

        List<Integer> exp = List.of(1);

        Assertions.assertEquals(exp, binaryTreeInorderTraversal.inorderTraversal(root));
    }
}