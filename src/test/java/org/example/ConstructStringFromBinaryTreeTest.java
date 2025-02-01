package org.example;

import org.example.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructStringFromBinaryTreeTest {

    @Test
    void tree2str() {
        ConstructStringFromBinaryTree toStr = new ConstructStringFromBinaryTree();

        TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(4), null), new TreeNode(3));

        Assertions.assertEquals("1(2(4))(3)", toStr.tree2str(root));
    }

    @Test
    void tree2str2() {
        ConstructStringFromBinaryTree toStr = new ConstructStringFromBinaryTree();

        TreeNode root = new TreeNode(1, new TreeNode(2, null, new TreeNode(4)), new TreeNode(3));

        Assertions.assertEquals("1(2()(4))(3)", toStr.tree2str(root));
    }
}