package org.example;

import org.example.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfLeftLeavesTest {

    @Test
    void sumOfLeftLeaves() {
        SumOfLeftLeaves sum = new SumOfLeftLeaves();

        var root = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));

        Assertions.assertEquals(24, sum.sumOfLeftLeaves(root));
    }

    @Test
    void sumOfLeftLeaves2() {
        SumOfLeftLeaves sum = new SumOfLeftLeaves();

        var root = new TreeNode(1);

        Assertions.assertEquals(0, sum.sumOfLeftLeaves(root));
    }

    @Test
    void sumOfLeftLeaves3() {
        SumOfLeftLeaves sum = new SumOfLeftLeaves();

        var root = new TreeNode(1, new TreeNode(2, new TreeNode(4), null), new TreeNode(3, null, new TreeNode(5, new TreeNode(6), new TreeNode(7))));

        Assertions.assertEquals(10, sum.sumOfLeftLeaves(root));
    }
}