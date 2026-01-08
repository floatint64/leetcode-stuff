package org.example;

import org.example.common.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesFromSortedListIITest {

    @Test
    void deleteDuplicates() {
        RemoveDuplicatesFromSortedListII remove = new RemoveDuplicatesFromSortedListII();

        ListNode head = new ListNode(1, new ListNode(1, new ListNode(3)));

        var expected = List.of(3);

        Assertions.assertEquals(expected, remove.deleteDuplicates(head).toList());
    }

    @Test
    void deleteDuplicates2() {
        RemoveDuplicatesFromSortedListII remove = new RemoveDuplicatesFromSortedListII();

        ListNode head = ListNode.fromIntStream(IntStream.of(1,2,3,3,4,4,5));

        var expected = List.of(1,2,5);

        Assertions.assertEquals(expected, remove.deleteDuplicates(head).toList());
    }

    @Test
    void deleteDuplicates3() {
        RemoveDuplicatesFromSortedListII remove = new RemoveDuplicatesFromSortedListII();

        ListNode head = ListNode.fromIntStream(IntStream.of(1,1,1,2,3));

        var expected = List.of(2,3);

        Assertions.assertEquals(expected, remove.deleteDuplicates(head).toList());
    }

    @Test
    void deleteDuplicates4() {
        RemoveDuplicatesFromSortedListII remove = new RemoveDuplicatesFromSortedListII();

        ListNode head = ListNode.fromIntStream(IntStream.of(1,1,1));

        Assertions.assertNull(remove.deleteDuplicates(head));
    }

    @Test
    void deleteDuplicates5() {
        RemoveDuplicatesFromSortedListII remove = new RemoveDuplicatesFromSortedListII();

        ListNode head = ListNode.fromIntStream(IntStream.of(1,1,1,2,1,1,1));

        var expected = List.of(2);

        Assertions.assertEquals(expected, remove.deleteDuplicates(head).toList());
    }

    @Test
    void deleteDuplicates6() {
        RemoveDuplicatesFromSortedListII remove = new RemoveDuplicatesFromSortedListII();

        ListNode head = ListNode.fromIntStream(IntStream.of(1,1,1,2,2,3,3,4));

        var expected = List.of(4);

        Assertions.assertEquals(expected, remove.deleteDuplicates(head).toList());
    }

    @Test
    void deleteDuplicates7() {
        RemoveDuplicatesFromSortedListII remove = new RemoveDuplicatesFromSortedListII();

        ListNode head = ListNode.fromIntStream(IntStream.of(1,2,2,3,3));

        var expected = List.of(1);

        Assertions.assertEquals(expected, remove.deleteDuplicates(head).toList());
    }

    @Test
    void deleteDuplicates8() {
        RemoveDuplicatesFromSortedListII remove = new RemoveDuplicatesFromSortedListII();

        ListNode head = null;

        Assertions.assertNull(remove.deleteDuplicates(head));
    }

    @Test
    void deleteDuplicates9() {
        RemoveDuplicatesFromSortedListII remove = new RemoveDuplicatesFromSortedListII();

        ListNode head = ListNode.fromIntStream(IntStream.of(1));

        var expected = List.of(1);

        Assertions.assertEquals(expected, remove.deleteDuplicates(head).toList());
    }

    @Test
    void deleteDuplicates10() {
        RemoveDuplicatesFromSortedListII remove = new RemoveDuplicatesFromSortedListII();

        ListNode head = ListNode.fromIntStream(IntStream.of(1,1,1,2,3,3,3,4,5,5,6));

        var expected = List.of(2,4,6);

        Assertions.assertEquals(expected, remove.deleteDuplicates(head).toList());
    }
}