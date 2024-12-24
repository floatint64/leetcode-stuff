package org.example;

import org.example.common.ListNode;

public class ConvertBinaryNumberInALinkedListToInteger {
    public int getDecimalValue(ListNode head) {

        var curNode = head;
        int bitsCount = 31;

        long result = 0;

        while (curNode != null) {
            long tmp = (long)curNode.val << bitsCount;
            result = result | (tmp);
            curNode = curNode.next;
            bitsCount--;
        }

        int modBits = bitsCount + 1;
        return (int)(result >> modBits);
    }
}
