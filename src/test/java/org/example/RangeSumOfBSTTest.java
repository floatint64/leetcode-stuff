package org.example;

import org.example.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RangeSumOfBSTTest {

    @Test
    void rangeSumBST() {

        RangeSumOfBST rangeSumOfBST = new RangeSumOfBST();

        TreeNode root = new TreeNode(10, new TreeNode(5, new TreeNode(3), new TreeNode(7)), new TreeNode(15, null, new TreeNode(18)));

        int low = 7;
        int high = 15;

        Assertions.assertEquals(32, rangeSumOfBST.rangeSumBST(root, low, high));
    }

    @Test
    void rangeSumBST2() {

        RangeSumOfBST rangeSumOfBST = new RangeSumOfBST();

        TreeNode root = TreeNode.fromArray(new Integer[]{10, 5, 15, 3, 7, 13, 18, 1, 6});
        int low = 6;
        int high = 10;

        Assertions.assertEquals(23, rangeSumOfBST.rangeSumBST(root, low, high));
    }
}