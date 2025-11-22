package org.example;

import org.example.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IncreasingOrderSearchTreeTest {

    @Test
    void increasingBST() {
        IncreasingOrderSearchTree inc = new IncreasingOrderSearchTree();

        TreeNode root = TreeNode.fromArray(new Integer[]{5,3,6,2,4,null,8,1,null,null,null,7,9});
        TreeNode expectedTree = TreeNode.fromArray(new Integer[]{1,null,2,null,3,null,4,null,5,null,6,null,7,null,8,null,9});

        var result = inc.increasingBST(root);

        Assertions.assertEquals(expectedTree.toString(), result.toString());
    }

    @Test
    void increasingBST2() {
        IncreasingOrderSearchTree inc = new IncreasingOrderSearchTree();

        TreeNode root = TreeNode.fromArray(new Integer[]{5,1,7});
        TreeNode expectedTree = TreeNode.fromArray(new Integer[]{1,null,5,null,7});

        var result = inc.increasingBST(root);

        Assertions.assertEquals(expectedTree.toString(), result.toString());
    }
    @Test
    void increasingBST3() {
        IncreasingOrderSearchTree inc = new IncreasingOrderSearchTree();

        TreeNode root = TreeNode.fromArray(new Integer[]{1});
        TreeNode expectedTree = TreeNode.fromArray(new Integer[]{1});

        var result = inc.increasingBST(root);

        Assertions.assertEquals(expectedTree.toString(), result.toString());
    }

    @Test
    void increasingBST4() {
        IncreasingOrderSearchTree inc = new IncreasingOrderSearchTree();

        TreeNode root = TreeNode.fromArray(new Integer[]{1,2,3,4,5,6,7});
        TreeNode expectedTree = TreeNode.fromArray(new Integer[]{4,null,2,null,5,null,1,null,6,null,3,null,7});

        var result = inc.increasingBST(root);

        Assertions.assertEquals(expectedTree.toString(), result.toString());
    }

    @Test
    void increasingBST5() {
        IncreasingOrderSearchTree inc = new IncreasingOrderSearchTree();

        TreeNode root = TreeNode.fromArray(new Integer[]{1,null,2});
        TreeNode expectedTree = TreeNode.fromArray(new Integer[]{1,null,2});

        var result = inc.increasingBST(root);

        Assertions.assertEquals(expectedTree.toString(), result.toString());
    }

    @Test
    void increasingBST6() {
        IncreasingOrderSearchTree inc = new IncreasingOrderSearchTree();

        TreeNode root = TreeNode.fromArray(new Integer[]{2,1,4,null,null,3,null});
        TreeNode expectedTree = TreeNode.fromArray(new Integer[]{1,null,2,null,3,null,4});

        var result = inc.increasingBST(root);

        Assertions.assertEquals(expectedTree.toString(), result.toString());
    }

    @Test
    void increasingBST7() {
        IncreasingOrderSearchTree inc = new IncreasingOrderSearchTree();

        TreeNode root = TreeNode.fromArray(new Integer[]{2,0,3,null,1,null,4});
        TreeNode expectedTree = TreeNode.fromArray(new Integer[]{0,null,1,null,2,null,3,null,4});

        var result = inc.increasingBST(root);

        Assertions.assertEquals(expectedTree.toString(), result.toString());
    }
}