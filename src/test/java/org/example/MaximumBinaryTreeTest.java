package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MaximumBinaryTreeTest {

    @Test
    void constructMaximumBinaryTree() {
        MaximumBinaryTree maximumBinaryTree = new MaximumBinaryTree();

        int[] nums = {3,2,1,6,0,5};

        Assertions.assertEquals(List.of(6, 3, 5, 2, 0, 1), maximumBinaryTree.constructMaximumBinaryTree(nums).traversalInLevelOrder());
    }

    @Test
    void constructMaximumBinaryTree2() {
        MaximumBinaryTree maximumBinaryTree = new MaximumBinaryTree();

        int[] nums = {3,2,1};

        Assertions.assertEquals(List.of(3,2,1), maximumBinaryTree.constructMaximumBinaryTree(nums).traversalInLevelOrder());
    }
}