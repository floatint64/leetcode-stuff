package org.example;

import org.example.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SameTreeTest {

    @Test
    void isSameTree() {

        SameTree sameTree = new SameTree();

        TreeNode p = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        TreeNode q = new TreeNode(1, new TreeNode(2), new TreeNode(3));

        Assertions.assertTrue(sameTree.isSameTree(p, q));
    }

    @Test
    void isSameTree2() {

        SameTree sameTree = new SameTree();

        TreeNode p = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        TreeNode q = new TreeNode(2, new TreeNode(1), new TreeNode(3));

        Assertions.assertFalse(sameTree.isSameTree(p, q));
    }

    @Test
    void isSameTree3() {

        SameTree sameTree = new SameTree();

        TreeNode p = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        TreeNode q = new TreeNode(1, null, new TreeNode(3));

        Assertions.assertFalse(sameTree.isSameTree(p, q));
    }

    @Test
    void isSameTree4() {

        SameTree sameTree = new SameTree();

        TreeNode p = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        TreeNode q = new TreeNode(1, new TreeNode(2), null);

        Assertions.assertFalse(sameTree.isSameTree(p, q));
    }

    @Test
    void isSameTree5() {

        SameTree sameTree = new SameTree();

        TreeNode p = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        TreeNode q = null;

        Assertions.assertFalse(sameTree.isSameTree(p, q));
    }

    @Test
    void isSameTree6() {

        SameTree sameTree = new SameTree();

        TreeNode p = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        TreeNode q = new TreeNode(1, null, null);

        Assertions.assertFalse(sameTree.isSameTree(p, q));
    }

    @Test
    void isSameTree7() {

        SameTree sameTree = new SameTree();

        TreeNode p = new TreeNode(1, new TreeNode(2), null);
        TreeNode q = new TreeNode(1, null, new TreeNode(2));

        Assertions.assertFalse(sameTree.isSameTree(p, q));
    }
}