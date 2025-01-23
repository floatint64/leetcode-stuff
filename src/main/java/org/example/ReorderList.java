package org.example;

import org.example.common.ListNode;

import java.util.Deque;
import java.util.LinkedList;

public class ReorderList {
    public void reorderList(ListNode head) {

        if (head == null || head.next == null) {
            return;
        }

        ListNode l = head;
        ListNode r = head.next;

        while (r != null) {
            l = l.next;
            if (r.next != null) {
                if (r.next.next != null) {
                    r = r.next.next;
                } else {
                    r = r.next;
                }
            } else {
                r = r.next;
            }
        }

        // l is mid

        Deque<ListNode> nodeStack = new LinkedList<>();

        ListNode mid = l;

        while (mid != null) {
            nodeStack.push(mid);
            mid = mid.next;
        }

        ListNode currNode = head;

        while (!nodeStack.isEmpty()) {
            ListNode next = currNode.next;
            ListNode popped = nodeStack.pop();
            currNode.next = popped;
            popped.next = next;
            currNode = next;
        }
        currNode.next = null;
    }
}
