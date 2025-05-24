package org.example;

import org.example.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FindLargestValueInEachTreeRowTest {

    @Test
    void largestValues() {
        FindLargestValueInEachTreeRow findLargestValueInEachTreeRow = new FindLargestValueInEachTreeRow();

        TreeNode root = TreeNode.fromArray(new Integer[] {1,3,2,5,3,null,9});

        var expected = List.of(1, 3, 9);

        Assertions.assertEquals(expected, findLargestValueInEachTreeRow.largestValues(root));
    }

    @Test
    void largestValues2() {
        FindLargestValueInEachTreeRow findLargestValueInEachTreeRow = new FindLargestValueInEachTreeRow();

        TreeNode root = TreeNode.fromArray(new Integer[] {1,2,3});

        var expected = List.of(1, 3);

        Assertions.assertEquals(expected, findLargestValueInEachTreeRow.largestValues(root));
    }

    @Test
    void largestValues3() {
        FindLargestValueInEachTreeRow findLargestValueInEachTreeRow = new FindLargestValueInEachTreeRow();

        TreeNode root = null;

        var expected = List.of();

        Assertions.assertEquals(expected, findLargestValueInEachTreeRow.largestValues(root));
    }

    @Test
    void largestValues4() {
        FindLargestValueInEachTreeRow findLargestValueInEachTreeRow = new FindLargestValueInEachTreeRow();

        TreeNode root = new TreeNode(1);

        var expected = List.of(1);

        Assertions.assertEquals(expected, findLargestValueInEachTreeRow.largestValues(root));
    }
}