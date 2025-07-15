package org.example;

import org.example.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubtreeOfAnotherTreeTest {

    @Test
    void isSubtree() {
        SubtreeOfAnotherTree sub = new SubtreeOfAnotherTree();

        TreeNode root = TreeNode.fromArray(new Integer[]{3,4,5,1,2});
        TreeNode subRoot = TreeNode.fromArray(new Integer[]{4,1,2});

        Assertions.assertTrue(sub.isSubtree(root, subRoot));
    }

    @Test
    void isSubtree2() {
        SubtreeOfAnotherTree sub = new SubtreeOfAnotherTree();

        TreeNode root = TreeNode.fromArray(new Integer[]{3,4,5,1,2,null,null,null,null,null,0});
        TreeNode subRoot = TreeNode.fromArray(new Integer[]{4,1,2});

        Assertions.assertFalse(sub.isSubtree(root, subRoot));
    }

    @Test
    void isSubtree3() {
        SubtreeOfAnotherTree sub = new SubtreeOfAnotherTree();

        TreeNode root = TreeNode.fromArray(new Integer[]{1,1, null});
        TreeNode subRoot = TreeNode.fromArray(new Integer[]{1});

        Assertions.assertTrue(sub.isSubtree(root, subRoot));
    }
}