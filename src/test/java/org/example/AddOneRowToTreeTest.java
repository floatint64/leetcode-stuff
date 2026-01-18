package org.example;

import org.example.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class AddOneRowToTreeTest {

    @Test
    void addOneRow() {
        AddOneRowToTree add = new AddOneRowToTree();

        TreeNode root = TreeNode.fromArray(new Integer[]{4,2,6,3,1,5});
        int val = 1;
        int depth = 2;
        List<Integer> expected = Arrays.asList(4,1,1,2,null,null,6,3,1,5);

        Assertions.assertEquals(expected, add.addOneRow(root, val, depth).toListWithoutLastNulls());
    }

    @Test
    void addOneRow2() {
        AddOneRowToTree add = new AddOneRowToTree();

        TreeNode root = TreeNode.fromArray(new Integer[]{4,2,null,3,1});
        int val = 1;
        int depth = 3;
        List<Integer> expected = Arrays.asList(4,2,null,1,1,3,null,null,1);

        Assertions.assertEquals(expected, add.addOneRow(root, val, depth).toListWithoutLastNulls());
    }

    @Test
    void addOneRow3() {
        AddOneRowToTree add = new AddOneRowToTree();

        TreeNode root = TreeNode.fromArray(new Integer[]{4,2,5});
        int val = 10;
        int depth = 1;
        List<Integer> expected = Arrays.asList(10,4,null,2,5);

        Assertions.assertEquals(expected, add.addOneRow(root, val, depth).toListWithoutLastNulls());
    }

    @Test
    void addOneRow4() {
        AddOneRowToTree add = new AddOneRowToTree();

        TreeNode root = TreeNode.fromArray(new Integer[]{1});
        int val = 2;
        int depth = 2;
        List<Integer> expected = Arrays.asList(1,2,2);

        Assertions.assertEquals(expected, add.addOneRow(root, val, depth).toListWithoutLastNulls());
    }

    @Test
    void addOneRow5() {
        AddOneRowToTree add = new AddOneRowToTree();

        TreeNode root = TreeNode.fromArray(new Integer[]{1,2});
        int val = 3;
        int depth = 3;
        List<Integer> expected = Arrays.asList(1,2,null,3,3);

        Assertions.assertEquals(expected, add.addOneRow(root, val, depth).toListWithoutLastNulls());
    }

    @Test
    void addOneRow6() {
        AddOneRowToTree add = new AddOneRowToTree();

        TreeNode root = TreeNode.fromArray(new Integer[]{1,2,2});
        int val = 3;
        int depth = 3;
        List<Integer> expected = Arrays.asList(1,2,2,3,3,3,3);

        Assertions.assertEquals(expected, add.addOneRow(root, val, depth).toListWithoutLastNulls());
    }

    @Test
    void addOneRow7() {
        AddOneRowToTree add = new AddOneRowToTree();

        TreeNode root = TreeNode.fromArray(new Integer[]{1,null,2});
        int val = 3;
        int depth = 3;
        List<Integer> expected = Arrays.asList(1,null,2,3,3);

        Assertions.assertEquals(expected, add.addOneRow(root, val, depth).toListWithoutLastNulls());
    }
}