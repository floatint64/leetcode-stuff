package org.example;

import org.example.common.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

class RotateListTest {

    @Test
    void rotateRight() {
        RotateList rotate = new RotateList();

        ListNode head = ListNode.fromIntStream(IntStream.of(1,2,3,4,5));
        ListNode expected = ListNode.fromIntStream(IntStream.of(4,5,1,2,3));
        int k = 2;

        Assertions.assertEquals(expected.toList(), rotate.rotateRight(head, k).toList());
    }

    @Test
    void rotateRight2() {
        RotateList rotate = new RotateList();

        ListNode head = ListNode.fromIntStream(IntStream.of(0,1,2));
        ListNode expected = ListNode.fromIntStream(IntStream.of(2,0,1));
        int k = 4;

        Assertions.assertEquals(expected.toList(), rotate.rotateRight(head, k).toList());
    }

    @Test
    void rotateRight3() {
        RotateList rotate = new RotateList();

        ListNode head = ListNode.fromIntStream(IntStream.of(0));
        ListNode expected = ListNode.fromIntStream(IntStream.of(0));
        int k = 100;

        Assertions.assertEquals(expected.toList(), rotate.rotateRight(head, k).toList());
    }

    @Test
    void rotateRight4() {
        RotateList rotate = new RotateList();

        ListNode head = ListNode.fromIntStream(IntStream.of(0,1));
        ListNode expected = ListNode.fromIntStream(IntStream.of(0,1));
        int k = 2;

        Assertions.assertEquals(expected.toList(), rotate.rotateRight(head, k).toList());
    }
}