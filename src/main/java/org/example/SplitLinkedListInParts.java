package org.example;

import org.example.common.ListNode;

public class SplitLinkedListInParts {
    public ListNode[] splitListToParts(ListNode head, int k) {

        if (head == null) {
            return new ListNode[k];
        }

        var l = head;
        var r = head.next;
        int count = 1;

        while (r != null) {
            count++;
            r = r.next;
        }

        int nodesPerPart = count / k;
        int extraPartsCount = count % k;

        ListNode[] result = new ListNode[k];
        int pos = 0;

        for (int i = 0; i < extraPartsCount; i++) {
            result[pos++] = l;
            for (int j = 0; j < nodesPerPart; j++) {
                l = l.next;
            }
            var tmp = l;
            l = l.next;
            tmp.next = null;
        }

        while (l != null) {
            result[pos++] = l;
            for (int j = 0; j < nodesPerPart - 1; j++) {
                l = l.next;
            }
            var tmp = l;
            l = l.next;
            tmp.next = null;
        }

        return result;
    }
}
