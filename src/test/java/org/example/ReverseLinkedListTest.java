package org.example;

import org.example.common.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ReverseLinkedListTest {

    @Test
    void reverseList() {
        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();

        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3)));

        List<Integer> vals = List.of(3, 2, 1);

        Assertions.assertEquals(vals, reverseLinkedList.reverseList(head).toList());
    }

    @Test
    void reverseList2() {
        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();

        ListNode head = new ListNode(1, new ListNode(2));

        List<Integer> vals = List.of(2, 1);

        Assertions.assertEquals(vals, reverseLinkedList.reverseList(head).toList());
    }

    @Test
    void reverseList3() {
        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();

        ListNode head = null;

        Assertions.assertNull(reverseLinkedList.reverseList(head));
    }
}