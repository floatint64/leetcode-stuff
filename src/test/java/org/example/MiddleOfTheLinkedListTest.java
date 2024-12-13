package org.example;

import org.example.common.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MiddleOfTheLinkedListTest {

    @Test
    void middleNode() {
        MiddleOfTheLinkedList middleOfTheLinkedList = new MiddleOfTheLinkedList();

        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));

        int[] vals = {3, 4, 5};
        int i = 0;

        head = middleOfTheLinkedList.middleNode(head);

        while (head != null) {
            Assertions.assertEquals(vals[i++], head.val);
            head = head.next;
        }
    }

    @Test
    void middleNode2() {
        MiddleOfTheLinkedList middleOfTheLinkedList = new MiddleOfTheLinkedList();

        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6))))));

        int[] vals = {4, 5, 6};
        int i = 0;

        head = middleOfTheLinkedList.middleNode(head);

        while (head != null) {
            Assertions.assertEquals(vals[i++], head.val);
            head = head.next;
        }
    }
}