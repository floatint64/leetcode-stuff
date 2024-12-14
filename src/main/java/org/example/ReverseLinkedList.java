package org.example;

import org.example.common.ListNode;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {

        ListNode prev = null;
        ListNode cur = head;
        ListNode next = null;

        while (cur != null) {
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }

        return prev;
    }
}
