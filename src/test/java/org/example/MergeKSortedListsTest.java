package org.example;

import org.example.common.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class MergeKSortedListsTest {

    @Test
    void mergeKLists() {
        MergeKSortedLists merge = new MergeKSortedLists();

        ListNode[] lists = {
                new ListNode(1, new ListNode(2, new ListNode(3))),
                new ListNode(4, new ListNode(5, new ListNode(6)))
        };

        Assertions.assertEquals(List.of(1,2,3,4,5,6), merge.mergeKLists(lists).toList());

    }

    @Test
    void mergeKLists2() {
        MergeKSortedLists merge = new MergeKSortedLists();

        ListNode[] lists = {
                new ListNode(1, new ListNode(4, new ListNode(5))),
                new ListNode(1, new ListNode(3, new ListNode(4))),
                new ListNode(2, new ListNode(6))
        };

        Assertions.assertEquals(List.of(1,1,2,3,4,4,5,6), merge.mergeKLists(lists).toList());

    }

    @Test
    void mergeKLists3() {
        MergeKSortedLists merge = new MergeKSortedLists();

        ListNode[] lists = null;

        Assertions.assertNull(merge.mergeKLists(lists));

    }

    @Test
    void mergeKLists4() {
        MergeKSortedLists merge = new MergeKSortedLists();

        ListNode[] lists = {};

        Assertions.assertNull(merge.mergeKLists(lists));

    }

    @Test
    void mergeKLists5() {
        MergeKSortedLists merge = new MergeKSortedLists();

        ListNode[] lists = {
                new ListNode(1),
                new ListNode(1),
                new ListNode(1)
        };

        Assertions.assertEquals(List.of(1,1,1), merge.mergeKLists(lists).toList());

    }

    @Test
    void mergeKLists6() {
        MergeKSortedLists merge = new MergeKSortedLists();

        ListNode[] lists = {
                new ListNode(1),
                new ListNode(2),
                new ListNode(3)
        };

        Assertions.assertEquals(List.of(1,2,3), merge.mergeKLists(lists).toList());

    }

    @Test
    void mergeKLists7() {
        MergeKSortedLists merge = new MergeKSortedLists();

        ListNode[] lists = {
                new ListNode(1, new ListNode(2, new ListNode(3))),
                new ListNode(4, new ListNode(5, new ListNode(6))),
                new ListNode(1, new ListNode(3, new ListNode(7)))
        };

        Assertions.assertEquals(List.of(1,1,2,3,3,4,5,6,7), merge.mergeKLists(lists).toList());

    }

    @Test
    void mergeKLists8() {
        MergeKSortedLists merge = new MergeKSortedLists();

        ListNode[] lists = {
                new ListNode(1)
        };

        Assertions.assertEquals(List.of(1), merge.mergeKLists(lists).toList());

    }
}