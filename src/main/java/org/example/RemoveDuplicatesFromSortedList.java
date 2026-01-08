package org.example;

import org.example.common.ListNode;

public class RemoveDuplicatesFromSortedList {
    public ListNode deleteDuplicates(ListNode head) {

        if (head == null) {
            return null;
        }

        if (head.next == null) {
            return head;
        }

        var l = head;
        var r = head.next;

        while (l != null) {
            if (r != null && l.val == r.val) {
                r = r.next;
            } else {
                l.next = r;
                l = r;
                if (r != null) {
                    r = r.next;
                }
            }
        }

        return head;
    }
}
