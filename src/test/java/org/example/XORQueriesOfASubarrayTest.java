package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class XORQueriesOfASubarrayTest {

    @Test
    void xorQueries() {

        XORQueriesOfASubarray xorQueriesOfASubarray = new XORQueriesOfASubarray();

        int[] arr = {1,3,4,8};

        int[][] queries = {
                {0,1},{1,2},{0,3},{3,3}
        };

        int[] expected = {2,7,14,8};

        Assertions.assertArrayEquals(expected, xorQueriesOfASubarray.xorQueries(arr, queries));
    }

    @Test
    void xorQueries2() {

        XORQueriesOfASubarray xorQueriesOfASubarray = new XORQueriesOfASubarray();

        int[] arr = {4,8,2,10};

        int[][] queries = {
                {2,3},{1,3},{0,0},{0,3}
        };

        int[] expected = {8,0,4,4};

        Assertions.assertArrayEquals(expected, xorQueriesOfASubarray.xorQueries(arr, queries));
    }

    @Test
    void xorQueries3() {

        XORQueriesOfASubarray xorQueriesOfASubarray = new XORQueriesOfASubarray();

        int[] arr = {1,1};

        int[][] queries = {
                {0,0},{1,1},{0,1}
        };

        int[] expected = {1,1,0};

        Assertions.assertArrayEquals(expected, xorQueriesOfASubarray.xorQueries(arr, queries));
    }
}