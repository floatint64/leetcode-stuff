package org.example;

import org.example.common.ListNode;

import java.util.LinkedList;

public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {

        LinkedList<ListNode> queue = new LinkedList<>();

        while (head != null) {
            queue.addLast(head);
            head = head.next;
        }

        if (queue.size() == 1) {
            return true;
        }

        while (queue.size() >= 2) {
            if (queue.pollFirst().val != queue.pollLast().val) {
                return false;
            }
        }

        return true;
    }
}
