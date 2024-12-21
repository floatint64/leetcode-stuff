package org.example;

import org.example.common.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListCycleTest {

    @Test
    void hasCycle() {
        LinkedListCycle linkedListCycle = new LinkedListCycle();
        ListNode loopPoint = new ListNode(2);
        loopPoint.next = new ListNode(0, new ListNode(-4, loopPoint));
        ListNode head = new ListNode(3, loopPoint);

        var isCycle = linkedListCycle.hasCycle(head);

        Assertions.assertTrue(isCycle);
    }

    @Test
    void hasCycle2() {
        LinkedListCycle linkedListCycle = new LinkedListCycle();
        ListNode loopPoint = new ListNode(1);
        loopPoint.next = new ListNode(2, loopPoint);
        ListNode head = loopPoint;

        var isCycle = linkedListCycle.hasCycle(head);

        Assertions.assertTrue(isCycle);
    }

    @Test
    void hasCycle3() {
        LinkedListCycle linkedListCycle = new LinkedListCycle();
        ListNode loopPoint = new ListNode(1);
        ListNode head = loopPoint;

        var isCycle = linkedListCycle.hasCycle(head);

        Assertions.assertFalse(isCycle);
    }

    @Test
    void hasCycle4() {
        LinkedListCycle linkedListCycle = new LinkedListCycle();
        ListNode loopPoint = new ListNode(1, new ListNode(2));
        ListNode head = loopPoint;

        var isCycle = linkedListCycle.hasCycle(head);

        Assertions.assertFalse(isCycle);
    }
}