package org.example;

import org.example.common.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeLinkedListTest {

    @Test
    void isPalindrome() {
        PalindromeLinkedList pal = new PalindromeLinkedList();

        ListNode head = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(1, new ListNode(1)))));

        Assertions.assertTrue(pal.isPalindrome(head));
    }

    @Test
    void isPalindrome2() {
        PalindromeLinkedList pal = new PalindromeLinkedList();

        ListNode head = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(1))));

        Assertions.assertFalse(pal.isPalindrome(head));
    }

    @Test
    void isPalindrome3() {
        PalindromeLinkedList pal = new PalindromeLinkedList();

        ListNode head = new ListNode(1, new ListNode(1, new ListNode(1)));

        Assertions.assertTrue(pal.isPalindrome(head));
    }

    @Test
    void isPalindrome4() {
        PalindromeLinkedList pal = new PalindromeLinkedList();

        ListNode head = new ListNode(1, new ListNode(2));

        Assertions.assertFalse(pal.isPalindrome(head));
    }
}