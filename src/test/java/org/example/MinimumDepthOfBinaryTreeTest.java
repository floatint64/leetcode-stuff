package org.example;

import org.example.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumDepthOfBinaryTreeTest {

    @Test
    void minDepth() {
        MinimumDepthOfBinaryTree min = new MinimumDepthOfBinaryTree();

        TreeNode root = TreeNode.fromArray(new Integer[]{3,9,20,null,null,15,7});

        Assertions.assertEquals(2, min.minDepth(root));
    }

    @Test
    void minDepth2() {
        MinimumDepthOfBinaryTree min = new MinimumDepthOfBinaryTree();

        TreeNode root = TreeNode.fromArray(new Integer[]{2,null,3,null,4,null,5,null,6});

        Assertions.assertEquals(5, min.minDepth(root));
    }

    @Test
    void minDepth3() {
        MinimumDepthOfBinaryTree min = new MinimumDepthOfBinaryTree();

        TreeNode root = TreeNode.fromArray(new Integer[]{1});

        Assertions.assertEquals(1, min.minDepth(root));
    }

    @Test
    void minDepth4() {
        MinimumDepthOfBinaryTree min = new MinimumDepthOfBinaryTree();

        TreeNode root = null;

        Assertions.assertEquals(0, min.minDepth(root));
    }
}