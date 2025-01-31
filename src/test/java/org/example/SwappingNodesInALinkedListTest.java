package org.example;

import org.example.common.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SwappingNodesInALinkedListTest {

    @Test
    void swapNodes() {

        SwappingNodesInALinkedList swapping = new SwappingNodesInALinkedList();

        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));

        Assertions.assertEquals(List.of(1,4,3,2,5), swapping.swapNodes(head, 2).toList());

    }
}