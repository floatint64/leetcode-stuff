package org.example;

import org.example.common.ListNode;

public class RemoveDuplicatesFromSortedListII {
    public ListNode deleteDuplicates(ListNode head) {

        if (head == null) {
            return null;
        }

        if (head.next == null) {
            return head;
        }

        var l = head;
        var r = head.next;
        int cnt = 1;
        ListNode ret = null;
        ListNode tail = null;

        while (l != null) {
            if (r != null && l.val == r.val) {
                cnt++;
                r = r.next;
            } else {
                if (cnt > 1) {
                    l = r;
                    if (r != null) {
                        r = r.next;
                    }
                    cnt = 1;
                } else {
                    if (ret == null) {
                        ret = l;
                        tail = l;
                    } else {
                        tail.next = l;
                        tail = l;
                    }

                    l = r;

                    if (r != null) {
                        r = r.next;
                    }
                }
            }
        }

        if (tail != null) {
            tail.next = null;
        }

        return ret;
    }
}
