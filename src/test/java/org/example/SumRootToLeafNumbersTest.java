package org.example;

import org.example.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumRootToLeafNumbersTest {

    @Test
    void sumNumbers() {
        SumRootToLeafNumbers sum = new SumRootToLeafNumbers();

        TreeNode root = new TreeNode(1, new TreeNode(2), new TreeNode(3));

        Assertions.assertEquals(25, sum.sumNumbers(root));
    }

    @Test
    void sumNumbers2() {
        SumRootToLeafNumbers sum = new SumRootToLeafNumbers();

        TreeNode root = TreeNode.fromArray(new Integer[]{4,9,0,5,1});

        Assertions.assertEquals(1026, sum.sumNumbers(root));
    }

    @Test
    void sumNumbers3() {
        SumRootToLeafNumbers sum = new SumRootToLeafNumbers();

        TreeNode root = TreeNode.fromArray(new Integer[]{1});

        Assertions.assertEquals(1, sum.sumNumbers(root));
    }

    @Test
    void sumNumbers4() {
        SumRootToLeafNumbers sum = new SumRootToLeafNumbers();

        TreeNode root = TreeNode.fromArray(new Integer[]{1,null,0});

        Assertions.assertEquals(10, sum.sumNumbers(root));
    }

    @Test
    void sumNumbers5() {
        SumRootToLeafNumbers sum = new SumRootToLeafNumbers();

        TreeNode root = TreeNode.fromArray(new Integer[]{1,0,null});

        Assertions.assertEquals(10, sum.sumNumbers(root));
    }

    @Test
    void sumNumbers6() {
        SumRootToLeafNumbers sum = new SumRootToLeafNumbers();

        TreeNode root = TreeNode.fromArray(new Integer[]{1,2,3,4,5,6,7});

        Assertions.assertEquals(522, sum.sumNumbers(root));
    }

    @Test
    void sumNumbers7() {
        SumRootToLeafNumbers sum = new SumRootToLeafNumbers();

        TreeNode root = TreeNode.fromArray(new Integer[]{1,null,2,null,3});

        Assertions.assertEquals(123, sum.sumNumbers(root));
    }
}