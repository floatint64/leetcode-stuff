package org.example;

import org.example.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SymmetricTreeTest {

    @Test
    void isSymmetric() {

        SymmetricTree symmetricTree = new SymmetricTree();

        TreeNode root = new TreeNode(1, new TreeNode(2, null, new TreeNode(3)), new TreeNode(2, null, new TreeNode(3)));

        Assertions.assertFalse(symmetricTree.isSymmetric(root));
    }

    @Test
    void isSymmetric2() {

        SymmetricTree symmetricTree = new SymmetricTree();

        TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(3), new TreeNode(4)), new TreeNode(2, new TreeNode(4), new TreeNode(3)));

        Assertions.assertTrue(symmetricTree.isSymmetric(root));
    }

    @Test
    void isSymmetric3() {

        SymmetricTree symmetricTree = new SymmetricTree();

        TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(2), null), new TreeNode(2, new TreeNode(2), null));

        Assertions.assertFalse(symmetricTree.isSymmetric(root));
    }

    @Test
    void isSymmetric4() {

        SymmetricTree symmetricTree = new SymmetricTree();

        TreeNode root = new TreeNode(1, new TreeNode(0), null);

        Assertions.assertFalse(symmetricTree.isSymmetric(root));
    }

    @Test
    void isSymmetric5() {

        SymmetricTree symmetricTree = new SymmetricTree();

        TreeNode root = TreeNode.fromArray(new Integer[] {9,-42,-42,null,76,76,null,null,13,null,13});

        Assertions.assertFalse(symmetricTree.isSymmetric(root));
    }
}