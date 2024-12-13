package org.example;

import org.example.common.ListNode;

public class MiddleOfTheLinkedList {
    public ListNode middleNode(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        var first = head;
        var second = head.next;

        while (second != null) {
            first = first.next;
            if (second != null) {
                if (second.next != null) {
                    second = second.next.next;
                } else {
                    second = second.next;
                }
            }
        }

        return first;
    }
}
