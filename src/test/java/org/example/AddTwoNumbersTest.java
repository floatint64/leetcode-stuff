package org.example;

import org.example.common.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddTwoNumbersTest {

    @Test
    void addTwoNumbers() {
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();

        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));

        ListNode r = addTwoNumbers.addTwoNumbers(l1, l2);
        int[] val = {8, 0, 7};
        int i = val.length - 1;

        while (r != null) {
            Assertions.assertEquals(val[i--], r.val);
            r = r.next;
        }
    }

    @Test
    void addTwoNumbers2() {
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();

        ListNode l1 = new ListNode(9, new ListNode(9, new ListNode(9)));
        ListNode l2 = new ListNode(9, new ListNode(9));

        ListNode r = addTwoNumbers.addTwoNumbers(l1, l2);
        int[] val = {1, 0, 9, 8};
        int i = val.length - 1;

        while (r != null) {
            Assertions.assertEquals(val[i--], r.val);
            r = r.next;
        }
    }
}