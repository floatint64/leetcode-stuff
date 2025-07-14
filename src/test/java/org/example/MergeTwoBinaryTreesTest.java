package org.example;

import org.example.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MergeTwoBinaryTreesTest {

    @Test
    void mergeTrees() {
        MergeTwoBinaryTrees merge = new MergeTwoBinaryTrees();

        TreeNode root1 = TreeNode.fromArray(new Integer[]{1,3,2,5,null});
        TreeNode root2 = TreeNode.fromArray(new Integer[]{2,1,3,null,4,null,7});

        TreeNode expected = TreeNode.fromArray(new Integer[]{3,4,5,5,4,null,7});

        Assertions.assertEquals(expected.traversalInLevelOrder(), merge.mergeTrees(root1, root2).traversalInLevelOrder());
    }

    @Test
    void mergeTrees2() {
        MergeTwoBinaryTrees merge = new MergeTwoBinaryTrees();

        TreeNode root1 = TreeNode.fromArray(new Integer[]{1});
        TreeNode root2 = TreeNode.fromArray(new Integer[]{1,2});

        TreeNode expected = TreeNode.fromArray(new Integer[]{2,2});

        Assertions.assertEquals(expected.traversalInLevelOrder(), merge.mergeTrees(root1, root2).traversalInLevelOrder());
    }
}