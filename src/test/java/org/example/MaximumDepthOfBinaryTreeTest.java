package org.example;

import org.example.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumDepthOfBinaryTreeTest {

    @Test
    void maxDepth() {

        MaximumDepthOfBinaryTree maximumDepthOfBinaryTree = new MaximumDepthOfBinaryTree();

        TreeNode root = TreeNode.fromArray(new Integer[] {3,9,20,null,null,15,7});

        Assertions.assertEquals(3, maximumDepthOfBinaryTree.maxDepth(root));
    }

    @Test
    void maxDepth2() {

        MaximumDepthOfBinaryTree maximumDepthOfBinaryTree = new MaximumDepthOfBinaryTree();

        TreeNode root = TreeNode.fromArray(new Integer[] {1,null,2});

        Assertions.assertEquals(2, maximumDepthOfBinaryTree.maxDepth(root));
    }

    @Test
    void maxDepth3() {

        MaximumDepthOfBinaryTree maximumDepthOfBinaryTree = new MaximumDepthOfBinaryTree();

        TreeNode root = TreeNode.fromArray(new Integer[] {1,2,3,4,null,null,5});

        Assertions.assertEquals(3, maximumDepthOfBinaryTree.maxDepth(root));
    }
}