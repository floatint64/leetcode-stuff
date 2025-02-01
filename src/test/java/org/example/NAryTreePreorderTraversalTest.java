package org.example;

import org.example.common.Node;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NAryTreePreorderTraversalTest {

    @Test
    void preorder() {
        NAryTreePreorderTraversal nAryTreePreorderTraversal = new NAryTreePreorderTraversal();

        Node root = new Node(1, List.of(new Node(3, List.of(new Node(5), new Node(6))), new Node(2), new Node(4)));
        Assertions.assertEquals(List.of(1,3,5,6,2,4), nAryTreePreorderTraversal.preorder(root));
    }
}