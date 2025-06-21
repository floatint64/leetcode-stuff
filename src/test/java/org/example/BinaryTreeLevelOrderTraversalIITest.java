package org.example;

import org.example.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeLevelOrderTraversalIITest {

    @Test
    void levelOrderBottom() {
        BinaryTreeLevelOrderTraversalII level = new BinaryTreeLevelOrderTraversalII();

        TreeNode root = TreeNode.fromArray(new Integer[]{3,9,20,null,null,15,7});

        var expected = List.of(
                List.of(15,7),
                List.of(9,20),
                List.of(3)
        );

        Assertions.assertEquals(expected, level.levelOrderBottom(root));
    }

    @Test
    void levelOrderBottom2() {
        BinaryTreeLevelOrderTraversalII level = new BinaryTreeLevelOrderTraversalII();

        TreeNode root = TreeNode.fromArray(new Integer[]{1,1,1});

        var expected = List.of(
                List.of(1,1),
                List.of(1)
        );

        Assertions.assertEquals(expected, level.levelOrderBottom(root));
    }

    @Test
    void levelOrderBottom3() {
        BinaryTreeLevelOrderTraversalII level = new BinaryTreeLevelOrderTraversalII();

        TreeNode root = TreeNode.fromArray(new Integer[]{1});

        var expected = List.of(
                List.of(1)
        );

        Assertions.assertEquals(expected, level.levelOrderBottom(root));
    }

    @Test
    void levelOrderBottom4() {
        BinaryTreeLevelOrderTraversalII level = new BinaryTreeLevelOrderTraversalII();

        TreeNode root = null;

        var expected = List.of();

        Assertions.assertEquals(expected, level.levelOrderBottom(root));
    }

    @Test
    void levelOrderBottom5() {
        BinaryTreeLevelOrderTraversalII level = new BinaryTreeLevelOrderTraversalII();

        TreeNode root = TreeNode.fromArray(new Integer[]{1,2,3,4,5});

        var expected = List.of(
                List.of(4,5),
                List.of(2,3),
                List.of(1)
        );

        Assertions.assertEquals(expected, level.levelOrderBottom(root));
    }
}