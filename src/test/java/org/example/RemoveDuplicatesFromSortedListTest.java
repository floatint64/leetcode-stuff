package org.example;

import org.example.common.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesFromSortedListTest {

    @Test
    void deleteDuplicates() {
        RemoveDuplicatesFromSortedList remove = new RemoveDuplicatesFromSortedList();

        ListNode head = new ListNode(1, new ListNode(1, new ListNode(2)));
        var expected = List.of(1, 2);

        Assertions.assertEquals(expected, remove.deleteDuplicates(head).toList());
    }

    @Test
    void deleteDuplicates2() {
        RemoveDuplicatesFromSortedList remove = new RemoveDuplicatesFromSortedList();

        ListNode head = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3)))));
        var expected = List.of(1, 2, 3);

        Assertions.assertEquals(expected, remove.deleteDuplicates(head).toList());
    }

    @Test
    void deleteDuplicates3() {
        RemoveDuplicatesFromSortedList remove = new RemoveDuplicatesFromSortedList();

        ListNode head = new ListNode(1);
        var expected = List.of(1);

        Assertions.assertEquals(expected, remove.deleteDuplicates(head).toList());
    }

    @Test
    void deleteDuplicates4() {
        RemoveDuplicatesFromSortedList remove = new RemoveDuplicatesFromSortedList();

        ListNode head = new ListNode(1, new ListNode(1, new ListNode(1)));
        var expected = List.of(1);

        Assertions.assertEquals(expected, remove.deleteDuplicates(head).toList());
    }

    @Test
    void deleteDuplicates5() {
        RemoveDuplicatesFromSortedList remove = new RemoveDuplicatesFromSortedList();

        ListNode head = null;

        Assertions.assertNull(remove.deleteDuplicates(head));
    }
}