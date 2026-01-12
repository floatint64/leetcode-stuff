package org.example;

import org.example.common.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DeleteNodeInALinkedListTest {

    @Test
    void deleteNode() {
        DeleteNodeInALinkedList delete = new DeleteNodeInALinkedList();

        ListNode head = new ListNode(4);
        ListNode node = new ListNode(5);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(9);

        head.next = node;
        node.next = node2;
        node2.next = node3;

        var expected = List.of(4,1,9);

        delete.deleteNode(node);

        Assertions.assertEquals(expected, head.toList());
    }

    @Test
    void deleteNode2() {
        DeleteNodeInALinkedList delete = new DeleteNodeInALinkedList();

        ListNode head = new ListNode(4);
        ListNode node = new ListNode(5);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(9);

        head.next = node;
        node.next = node2;
        node2.next = node3;

        var expected = List.of(4,5,9);

        delete.deleteNode(node2);

        Assertions.assertEquals(expected, head.toList());
    }
}