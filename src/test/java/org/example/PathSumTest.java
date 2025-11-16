package org.example;

import org.example.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PathSumTest {

    @Test
    void hasPathSum() {
        PathSum pathSum = new PathSum();

        TreeNode root = TreeNode.fromArray(new Integer[]{5,4,8,11,null,13,4,7,2,null,null,null,1});
        int target = 22;

        Assertions.assertTrue(pathSum.hasPathSum(root, target));
    }

    @Test
    void hasPathSum2() {
        PathSum pathSum = new PathSum();

        TreeNode root = TreeNode.fromArray(new Integer[]{1,2,3});
        int target = 5;

        Assertions.assertFalse(pathSum.hasPathSum(root, target));
    }

    @Test
    void hasPathSum3() {
        PathSum pathSum = new PathSum();

        TreeNode root = null;
        int target = 0;

        Assertions.assertFalse(pathSum.hasPathSum(root, target));
    }

    @Test
    void hasPathSum4() {
        PathSum pathSum = new PathSum();

        TreeNode root = TreeNode.fromArray(new Integer[]{1,2, null});
        int target = 1;

        Assertions.assertFalse(pathSum.hasPathSum(root, target));
    }
}