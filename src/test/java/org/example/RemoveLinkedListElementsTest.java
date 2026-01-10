package org.example;

import org.example.common.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

class RemoveLinkedListElementsTest {

    @Test
    void removeElements() {
        RemoveLinkedListElements remove = new RemoveLinkedListElements();

        var head = ListNode.fromIntStream(IntStream.of(1,2,6,3,4,5,6));
        int val = 6;
        var expected = List.of(1,2,3,4,5);

        Assertions.assertEquals(expected, remove.removeElements(head, val).toList());
    }

    @Test
    void removeElements2() {
        RemoveLinkedListElements remove = new RemoveLinkedListElements();

        ListNode head = null;
        int val = 1;

        Assertions.assertNull(remove.removeElements(head, val));
    }

    @Test
    void removeElements3() {
        RemoveLinkedListElements remove = new RemoveLinkedListElements();

        var head = ListNode.fromIntStream(IntStream.of(7,7,7,7));
        int val = 7;

        Assertions.assertNull(remove.removeElements(head, val));
    }

    @Test
    void removeElements4() {
        RemoveLinkedListElements remove = new RemoveLinkedListElements();

        var head = ListNode.fromIntStream(IntStream.of(1,1,1,3,1,1,1));
        int val = 1;
        var expected = List.of(3);

        Assertions.assertEquals(expected, remove.removeElements(head, val).toList());
    }

    @Test
    void removeElements5() {
        RemoveLinkedListElements remove = new RemoveLinkedListElements();

        var head = ListNode.fromIntStream(IntStream.of(1,1,2));
        int val = 1;
        var expected = List.of(2);

        Assertions.assertEquals(expected, remove.removeElements(head, val).toList());
    }

    @Test
    void removeElements6() {
        RemoveLinkedListElements remove = new RemoveLinkedListElements();

        var head = ListNode.fromIntStream(IntStream.of(2,1,1));
        int val = 1;
        var expected = List.of(2);

        Assertions.assertEquals(expected, remove.removeElements(head, val).toList());
    }
}