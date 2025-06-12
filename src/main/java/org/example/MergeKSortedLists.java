package org.example;

import org.example.common.ListNode;

public class MergeKSortedLists {
    private final static ListNode FAKE_NODE = new ListNode(Integer.MAX_VALUE);

    public ListNode mergeKLists(ListNode[] lists) {

        if (lists == null) {
            return null;
        }

        ListNode head = new ListNode();
        ListNode tail = head;

        ListNode curr = FAKE_NODE;
        int currIdx = -1;
        for (int i = 0; i < lists.length; i++) {
            if (lists[i] != null && lists[i].val < curr.val) {
                curr = lists[i];
                currIdx = i;
            }
        }
        if (currIdx >= 0) {
            lists[currIdx] = lists[currIdx] != null ? lists[currIdx].next : null;
        }

        while (curr != FAKE_NODE) {
            tail.next = curr;
            tail = curr;
            curr = FAKE_NODE;
            currIdx = -1;
            for (int i = 0; i < lists.length; i++) {
                if (lists[i] != null && lists[i].val < curr.val) {
                    curr = lists[i];
                    currIdx = i;
                }
            }
            if (currIdx >= 0) {
                lists[currIdx] = lists[currIdx] != null ? lists[currIdx].next : null;
            }
        }

        return head.next;
    }
}
