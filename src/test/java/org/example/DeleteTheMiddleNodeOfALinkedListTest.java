package org.example;

import org.example.common.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

class DeleteTheMiddleNodeOfALinkedListTest {

    @Test
    void deleteMiddle() {
        DeleteTheMiddleNodeOfALinkedList delete = new DeleteTheMiddleNodeOfALinkedList();

        ListNode head = ListNode.fromIntStream(IntStream.of(1,2,3,4));

        var expected = List.of(1,2,4);

        Assertions.assertEquals(expected, delete.deleteMiddle(head).toList());
    }

    @Test
    void deleteMiddle2() {
        DeleteTheMiddleNodeOfALinkedList delete = new DeleteTheMiddleNodeOfALinkedList();

        ListNode head = ListNode.fromIntStream(IntStream.of(1,2));

        var expected = List.of(1);

        Assertions.assertEquals(expected, delete.deleteMiddle(head).toList());
    }

    @Test
    void deleteMiddle3() {
        DeleteTheMiddleNodeOfALinkedList delete = new DeleteTheMiddleNodeOfALinkedList();

        ListNode head = ListNode.fromIntStream(IntStream.of(1));

        Assertions.assertNull(delete.deleteMiddle(head));
    }

    @Test
    void deleteMiddle4() {
        DeleteTheMiddleNodeOfALinkedList delete = new DeleteTheMiddleNodeOfALinkedList();

        ListNode head = null;

        Assertions.assertNull(delete.deleteMiddle(head));
    }

    @Test
    void deleteMiddle5() {
        DeleteTheMiddleNodeOfALinkedList delete = new DeleteTheMiddleNodeOfALinkedList();

        ListNode head = ListNode.fromIntStream(IntStream.of(1,3,4,7,1,2,6));

        var expected = List.of(1,3,4,1,2,6);

        Assertions.assertEquals(expected, delete.deleteMiddle(head).toList());
    }
}