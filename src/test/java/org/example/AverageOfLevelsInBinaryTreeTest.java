package org.example;

import org.example.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class AverageOfLevelsInBinaryTreeTest {

    @Test
    void averageOfLevels() {
        AverageOfLevelsInBinaryTree avg = new AverageOfLevelsInBinaryTree();

        TreeNode root = TreeNode.fromArray(new Integer[]{3,9,20,null,null,15,7});

        var result = avg.averageOfLevels(root).stream().mapToDouble(x -> x).toArray();
        Assertions.assertArrayEquals(new double[]{3.00000,14.50000,11.00000}, result, 0.00001);
    }

    @Test
    void averageOfLevels2() {
        AverageOfLevelsInBinaryTree avg = new AverageOfLevelsInBinaryTree();

        TreeNode root = TreeNode.fromArray(new Integer[]{3,9,20,15,7});

        var result = avg.averageOfLevels(root).stream().mapToDouble(x -> x).toArray();
        Assertions.assertArrayEquals(new double[]{3.00000,14.50000,11.00000}, result, 0.00001);
    }

    @Test
    void averageOfLevels3() {
        AverageOfLevelsInBinaryTree avg = new AverageOfLevelsInBinaryTree();

        TreeNode root = TreeNode.fromArray(new Integer[]{0});

        var result = avg.averageOfLevels(root).stream().mapToDouble(x -> x).toArray();
        Assertions.assertArrayEquals(new double[]{0.00000}, result, 0.00001);
    }

    @Test
    void averageOfLevels4() {
        AverageOfLevelsInBinaryTree avg = new AverageOfLevelsInBinaryTree();

        TreeNode root = TreeNode.fromArray(new Integer[]{0, 1, null});

        var result = avg.averageOfLevels(root).stream().mapToDouble(x -> x).toArray();
        Assertions.assertArrayEquals(new double[]{0.00000, 1.00000}, result, 0.00001);
    }

    @Test
    void averageOfLevels5() {
        AverageOfLevelsInBinaryTree avg = new AverageOfLevelsInBinaryTree();

        TreeNode root = TreeNode.fromArray(new Integer[]{2147483647,2147483647,2147483647});

        var result = avg.averageOfLevels(root).stream().mapToDouble(x -> x).toArray();
        Assertions.assertArrayEquals(new double[]{2147483647.00000,2147483647.00000}, result, 0.00001);
    }
}