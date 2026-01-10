package org.example;

import org.example.common.ListNode;

public class DeleteTheMiddleNodeOfALinkedList {
    public ListNode deleteMiddle(ListNode head) {

        if (head == null || head.next == null) {
            return null;
        }

        ListNode prev = null;
        var l = head;
        var r = head.next;

        while (r != null) {
            prev = l;
            l = l.next;
            if (r.next != null) {
                r = r.next.next;
            } else {
                r = null;
            }
        }

        prev.next = l.next;

        return head;
    }
}
