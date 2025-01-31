package org.example;

import org.example.common.ListNode;

public class SwappingNodesInALinkedList {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode[] nodes = new ListNode[100000];

        int i = 0;

        ListNode currNode = head;
        while (currNode != null) {
            nodes[i++] = currNode;
            currNode = currNode.next;
        }

        ListNode tmp = nodes[k - 1];
        nodes[k - 1] = nodes[i - k];
        nodes[i - k] = tmp;

        currNode = nodes[0];

        for (int j = 1; j < i; j++) {
            currNode.next = nodes[j];
            currNode = nodes[j];
        }

        currNode.next = null;

        return nodes[0];
    }
}
