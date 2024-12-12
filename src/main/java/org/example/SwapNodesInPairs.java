package org.example;

import org.example.common.ListNode;

public class SwapNodesInPairs {
    public ListNode swapPairs(ListNode head) {
        if (head == null) {
            return null;
        } else if (head.next == null) {
            return head;
        }

        var next = head.next;
        var nextOfNext = next.next;
        next.next = head;
        head.next = swapPairs(nextOfNext);
        return next;
    }
}
