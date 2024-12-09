package org.example;

import org.example.common.ListNode;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        ListNode currResultNode = result;

        ListNode currL1 = l1;
        ListNode currL2 = l2;

        boolean overflow = false;
        while (currL1 != null && currL2 != null) {
            int sum = currL1.val + currL2.val + (overflow ? 1 : 0);
            overflow = sum >= 10;

            currResultNode.val = overflow ? sum - 10 : sum;
            if (currL1.next != null || currL2.next != null) {
                ListNode tmp = new ListNode();
                currResultNode.next = tmp;
                currResultNode = tmp;
            }

            currL1 = currL1.next;
            currL2 = currL2.next;
        }

        if (currL1 != null || currL2 != null) {
            ListNode lMod = currL1 == null ? currL2 : currL1;
            while (lMod != null) {
                int sum = lMod.val + (overflow ? 1 : 0);
                overflow = sum >= 10;
                currResultNode.val = overflow ? sum - 10 : sum;
                if(lMod.next != null) {
                    ListNode tmp = new ListNode();
                    currResultNode.next = tmp;
                    currResultNode = tmp;
                }
                lMod = lMod.next;
            }
        }

        if (overflow) {
            ListNode tmp = new ListNode();
            currResultNode.next = tmp;
            currResultNode = tmp;
            currResultNode.val = 1;
        }

        return result;
    }
}
