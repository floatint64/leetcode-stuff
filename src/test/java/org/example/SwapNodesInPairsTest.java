package org.example;

import org.example.common.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SwapNodesInPairsTest {

    @Test
    void swapPairs() {
        SwapNodesInPairs swapNodesInPairs = new SwapNodesInPairs();

        ListNode head = null;

        Assertions.assertNull(swapNodesInPairs.swapPairs(head));
    }

    @Test
    void swapPairs2() {
        SwapNodesInPairs swapNodesInPairs = new SwapNodesInPairs();

        ListNode head = new ListNode(1);

        Assertions.assertEquals(1, swapNodesInPairs.swapPairs(head).val);
    }

    @Test
    void swapPairs3() {
        SwapNodesInPairs swapNodesInPairs = new SwapNodesInPairs();

        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3)));

        int[] val = {2, 1, 3};
        int i = 0;

        head = swapNodesInPairs.swapPairs(head);

        while (head != null) {
            Assertions.assertEquals(val[i++], head.val);
            head = head.next;
        }
    }
}