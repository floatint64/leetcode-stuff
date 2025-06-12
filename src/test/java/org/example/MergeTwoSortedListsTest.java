package org.example;

import org.example.common.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MergeTwoSortedListsTest {

    @Test
    void mergeTwoLists() {

        MergeTwoSortedLists merge = new MergeTwoSortedLists();

        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(3)));

        ListNode list2 = new ListNode(3, new ListNode(4, new ListNode(5)));

        Assertions.assertEquals(List.of(1,2,3,3,4,5), merge.mergeTwoLists(list1, list2).toList());
    }

    @Test
    void mergeTwoLists2() {

        MergeTwoSortedLists merge = new MergeTwoSortedLists();

        ListNode list1 = new ListNode(1, new ListNode(3, new ListNode(5)));

        ListNode list2 = new ListNode(2, new ListNode(4, new ListNode(6)));

        Assertions.assertEquals(List.of(1,2,3,4,5,6), merge.mergeTwoLists(list1, list2).toList());
    }

    @Test
    void mergeTwoLists3() {

        MergeTwoSortedLists merge = new MergeTwoSortedLists();

        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));

        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));

        Assertions.assertEquals(List.of(1,1,2,3,4,4), merge.mergeTwoLists(list1, list2).toList());
    }

    @Test
    void mergeTwoLists4() {

        MergeTwoSortedLists merge = new MergeTwoSortedLists();

        ListNode list1 = null;

        ListNode list2 = null;

        Assertions.assertNull(merge.mergeTwoLists(list1, list2));
    }

    @Test
    void mergeTwoLists5() {

        MergeTwoSortedLists merge = new MergeTwoSortedLists();

        ListNode list1 = null;

        ListNode list2 = new ListNode(0);

        Assertions.assertEquals(List.of(0), merge.mergeTwoLists(list1, list2).toList());
    }

    @Test
    void mergeTwoLists6() {

        MergeTwoSortedLists merge = new MergeTwoSortedLists();

        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(5)));

        ListNode list1 = new ListNode(2, new ListNode(4, new ListNode(6)));

        Assertions.assertEquals(List.of(1,2,3,4,5,6), merge.mergeTwoLists(list1, list2).toList());
    }
    @Test
    void mergeTwoLists7() {

        MergeTwoSortedLists merge = new MergeTwoSortedLists();

        ListNode list2 = new ListNode(1, new ListNode(1, new ListNode(1)));

        ListNode list1 = new ListNode(2, new ListNode(2, new ListNode(2)));

        Assertions.assertEquals(List.of(1,1,1,2,2,2), merge.mergeTwoLists(list1, list2).toList());
    }

    @Test
    void mergeTwoLists8() {

        MergeTwoSortedLists merge = new MergeTwoSortedLists();

        ListNode list2 = new ListNode(1, new ListNode(1, new ListNode(1)));

        ListNode list1 = new ListNode(1, new ListNode(1, new ListNode(1)));

        Assertions.assertEquals(List.of(1,1,1,1,1,1), merge.mergeTwoLists(list1, list2).toList());
    }

}