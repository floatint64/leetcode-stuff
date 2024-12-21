package org.example;

import org.example.common.ListNode;

public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }

        var l = head;
        var r = head.next;

        while (l != null) {
            if (r != null) {
                if (l == r) {
                    return true;
                } else {
                    if (r.next != null) {
                        r = r.next.next;
                    } else {
                        r = r.next;
                    }
                }
            }
            l = l.next;
        }

        return false;
    }
}
