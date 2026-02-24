package org.example;

import org.example.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfRootToLeafBinaryNumbersTest {

    @Test
    void sumRootToLeaf() {
        SumOfRootToLeafBinaryNumbers s = new SumOfRootToLeafBinaryNumbers();

        var root = TreeNode.fromArray(new Integer[]{1,0,1,0,1,0,1});
        int expected = 22;

        Assertions.assertEquals(expected, s.sumRootToLeaf(root));
    }

    @Test
    void sumRootToLeaf2() {
        SumOfRootToLeafBinaryNumbers s = new SumOfRootToLeafBinaryNumbers();

        var root = TreeNode.fromArray(new Integer[]{0});
        int expected = 0;

        Assertions.assertEquals(expected, s.sumRootToLeaf(root));
    }

    @Test
    void sumRootToLeaf3() {
        SumOfRootToLeafBinaryNumbers s = new SumOfRootToLeafBinaryNumbers();

        var root = TreeNode.fromArray(new Integer[]{1,1,1});
        int expected = 6;

        Assertions.assertEquals(expected, s.sumRootToLeaf(root));
    }

    @Test
    void sumRootToLeaf4() {
        SumOfRootToLeafBinaryNumbers s = new SumOfRootToLeafBinaryNumbers();

        var root = TreeNode.fromArray(new Integer[]{1,1,null});
        int expected = 3;

        Assertions.assertEquals(expected, s.sumRootToLeaf(root));
    }
}