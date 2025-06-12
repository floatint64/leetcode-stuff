package org.example;

import org.example.common.ListNode;

public class MergeTwoSortedLists {
    private static final ListNode FAKE_NODE = new ListNode(1000);

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if (list1 == null && list2 == null) {
            return null;
        }

        ListNode head = new ListNode(-1);
        ListNode tail = head;

        while (list1 != null || list2 != null) {
            ListNode left = list1 != null ? list1 : FAKE_NODE;
            ListNode right = list2 != null ? list2 : FAKE_NODE;

            ListNode curr = null;
            if (left.val <= right.val) {
                list1 = left != FAKE_NODE ? list1.next : null;
                curr = left;
            } else {
                list2 = right != FAKE_NODE ? list2.next : null;
                curr = right;
            }

            if (curr != FAKE_NODE) {
                tail.next = curr;
                tail = curr;
            }

        }

        return head.next;
    }
}
