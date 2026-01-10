package org.example;

import org.example.common.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DeleteNodesFromLinkedListPresentInArrayTest {

    @Test
    void modifiedList() {
        DeleteNodesFromLinkedListPresentInArray delete = new DeleteNodesFromLinkedListPresentInArray();

        var head = ListNode.fromArray(new int[]{1,2,3,4,5});
        int[] nums = {1,2,3};
        var expected = List.of(4,5);

        Assertions.assertEquals(expected, delete.modifiedList(nums, head).toList());
    }

    @Test
    void modifiedList2() {
        DeleteNodesFromLinkedListPresentInArray delete = new DeleteNodesFromLinkedListPresentInArray();

        var head = ListNode.fromArray(new int[]{1,2,1,2,1,2});
        int[] nums = {1};
        var expected = List.of(2,2,2);

        Assertions.assertEquals(expected, delete.modifiedList(nums, head).toList());
    }

    @Test
    void modifiedList3() {
        DeleteNodesFromLinkedListPresentInArray delete = new DeleteNodesFromLinkedListPresentInArray();

        var head = ListNode.fromArray(new int[]{1,2,3,4});
        int[] nums = {5};
        var expected = List.of(1,2,3,4);

        Assertions.assertEquals(expected, delete.modifiedList(nums, head).toList());
    }

    @Test
    void modifiedList4() {
        DeleteNodesFromLinkedListPresentInArray delete = new DeleteNodesFromLinkedListPresentInArray();

        var head = ListNode.fromArray(new int[]{1});
        int[] nums = {1};

        Assertions.assertNull(delete.modifiedList(nums, head));
    }
}