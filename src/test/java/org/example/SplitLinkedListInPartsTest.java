package org.example;

import org.example.common.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

class SplitLinkedListInPartsTest {

    @Test
    void splitListToParts() {
        SplitLinkedListInParts split = new SplitLinkedListInParts();

        ListNode head = ListNode.fromIntStream(IntStream.of(1,2,3));
        int k = 5;

        ListNode[] expected = {
                ListNode.fromIntStream(IntStream.of(1)),
                ListNode.fromIntStream(IntStream.of(2)),
                ListNode.fromIntStream(IntStream.of(3)),
                null,
                null
        };
        var result = split.splitListToParts(head, k);

        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    void splitListToParts2() {
        SplitLinkedListInParts split = new SplitLinkedListInParts();

        ListNode head = ListNode.fromIntStream(IntStream.of(1,2,3,4,5,6,7,8,9,10));
        int k = 3;

        ListNode[] expected = {
                ListNode.fromIntStream(IntStream.of(1,2,3,4)),
                ListNode.fromIntStream(IntStream.of(5,6,7)),
                ListNode.fromIntStream(IntStream.of(8,9,10))
        };
        var result = split.splitListToParts(head, k);

        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    void splitListToParts3() {
        SplitLinkedListInParts split = new SplitLinkedListInParts();

        ListNode head = null;
        int k = 5;

        ListNode[] expected = {
                null,
                null,
                null,
                null,
                null
        };
        var result = split.splitListToParts(head, k);

        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    void splitListToParts4() {
        SplitLinkedListInParts split = new SplitLinkedListInParts();

        ListNode head = ListNode.fromIntStream(IntStream.of(1,2,3));
        int k = 1;

        ListNode[] expected = {
                ListNode.fromIntStream(IntStream.of(1,2,3))
        };
        var result = split.splitListToParts(head, k);

        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    void splitListToParts5() {
        SplitLinkedListInParts split = new SplitLinkedListInParts();

        ListNode head = null;
        int k = 3;

        ListNode[] expected = {
                null,
                null,
                null
        };
        var result = split.splitListToParts(head, k);

        Assertions.assertArrayEquals(expected, result);
    }
}