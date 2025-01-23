package org.example;

import org.example.common.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ReorderListTest {

    @Test
    void reorderList() {
        ListNode root = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));

        ReorderList reorderList = new ReorderList();

        reorderList.reorderList(root);

        Assertions.assertEquals(List.of(1, 5, 2, 4, 3), root.toList());
    }

    @Test
    void reorderList2() {
        ListNode root = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));

        ReorderList reorderList = new ReorderList();

        reorderList.reorderList(root);

        Assertions.assertEquals(List.of(1, 4, 2, 3), root.toList());
    }

    @Test
    void reorderList3() {
        ListNode root = new ListNode(1);

        ReorderList reorderList = new ReorderList();

        reorderList.reorderList(root);

        Assertions.assertEquals(List.of(1), root.toList());
    }
}