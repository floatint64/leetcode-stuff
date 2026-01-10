package org.example;

import org.example.common.ListNode;

public class DeleteNodesFromLinkedListPresentInArray {
    public ListNode modifiedList(int[] nums, ListNode head) {

        boolean[] numSet = new boolean[100001];

        for (var n : nums) {
            numSet[n] = true;
        }

        return modifyList(head, numSet);
    }

    private static ListNode modifyList(ListNode head, boolean[] numSet) {
        if (head == null) {
            return null;
        }

        if (numSet[head.val]) {
            return modifyList(head.next, numSet);
        }

        head.next = modifyList(head.next, numSet);
        return head;
    }
}
