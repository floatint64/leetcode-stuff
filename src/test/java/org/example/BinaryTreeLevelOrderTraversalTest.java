package org.example;

import org.example.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeLevelOrderTraversalTest {

    @Test
    void levelOrder() {
        BinaryTreeLevelOrderTraversal level = new BinaryTreeLevelOrderTraversal();

        TreeNode root = TreeNode.fromArray(new Integer[]{3,9,20,null,null,15,7});

        List<List<Integer>> expected = List.of(
                List.of(3),
                List.of(9, 20),
                List.of(15, 7)
        );

        Assertions.assertEquals(expected, level.levelOrder(root));
    }

    @Test
    void levelOrder2() {
        BinaryTreeLevelOrderTraversal level = new BinaryTreeLevelOrderTraversal();

        TreeNode root = TreeNode.fromArray(new Integer[]{0,1,1});

        List<List<Integer>> expected = List.of(
                List.of(0),
                List.of(1,1)
        );

        Assertions.assertEquals(expected, level.levelOrder(root));
    }

    @Test
    void levelOrder3() {
        BinaryTreeLevelOrderTraversal level = new BinaryTreeLevelOrderTraversal();

        TreeNode root = TreeNode.fromArray(new Integer[]{0,1,1,2,2,3,3});

        List<List<Integer>> expected = List.of(
                List.of(0),
                List.of(1,1),
                List.of(2,2,3,3)
        );

        Assertions.assertEquals(expected, level.levelOrder(root));
    }

    @Test
    void levelOrder4() {
        BinaryTreeLevelOrderTraversal level = new BinaryTreeLevelOrderTraversal();

        TreeNode root = TreeNode.fromArray(new Integer[]{0});

        List<List<Integer>> expected = List.of(
                List.of(0)
        );

        Assertions.assertEquals(expected, level.levelOrder(root));
    }

    @Test
    void levelOrder5() {
        BinaryTreeLevelOrderTraversal level = new BinaryTreeLevelOrderTraversal();

        TreeNode root = null;

        List<List<Integer>> expected = List.of();

        Assertions.assertEquals(expected, level.levelOrder(root));
    }

    @Test
    void levelOrder6() {
        BinaryTreeLevelOrderTraversal level = new BinaryTreeLevelOrderTraversal();

        TreeNode root = TreeNode.fromArray(new Integer[]{0,null,1});

        List<List<Integer>> expected = List.of(
                List.of(0),
                List.of(1)
        );

        Assertions.assertEquals(expected, level.levelOrder(root));
    }
}