package org.example;

import org.example.common.Node;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumDepthOfNAryTreeTest {

    @Test
    void maxDepth() {
        MaximumDepthOfNAryTree max = new MaximumDepthOfNAryTree();

        Node root = Node.fromArray(new Integer[]{1,null,3,2,4,null,5,6});

        Assertions.assertEquals(3, max.maxDepth(root));
    }

    @Test
    void maxDepth2() {
        MaximumDepthOfNAryTree max = new MaximumDepthOfNAryTree();

        Node root = Node.fromArray(new Integer[]{1,null,2,3,4,5,null,null,6,7,null,8,null,9,10,null,null,11,null,12,null,13,null,null,14});

        Assertions.assertEquals(5, max.maxDepth(root));
    }

    @Test
    void maxDepth3() {
        MaximumDepthOfNAryTree max = new MaximumDepthOfNAryTree();

        Node root = null;

        Assertions.assertEquals(0, max.maxDepth(root));
    }

    @Test
    void maxDepth4() {
        MaximumDepthOfNAryTree max = new MaximumDepthOfNAryTree();

        Node root = new Node(10);

        Assertions.assertEquals(1, max.maxDepth(root));
    }
}