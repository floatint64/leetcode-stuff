package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumDifferenceBetweenAdjacentElementsInACircularArrayTest {

    @Test
    void maxAdjacentDistance() {
        MaximumDifferenceBetweenAdjacentElementsInACircularArray max = new MaximumDifferenceBetweenAdjacentElementsInACircularArray();

        Assertions.assertEquals(3, max.maxAdjacentDistance(new int[] {1,2,4}));
    }

    @Test
    void maxAdjacentDistance2() {
        MaximumDifferenceBetweenAdjacentElementsInACircularArray max = new MaximumDifferenceBetweenAdjacentElementsInACircularArray();

        Assertions.assertEquals(5, max.maxAdjacentDistance(new int[] {-5,-10,-5}));
    }

    @Test
    void maxAdjacentDistance3() {
        MaximumDifferenceBetweenAdjacentElementsInACircularArray max = new MaximumDifferenceBetweenAdjacentElementsInACircularArray();

        Assertions.assertEquals(4, max.maxAdjacentDistance(new int[] {1,5}));
    }

    @Test
    void maxAdjacentDistance4() {
        MaximumDifferenceBetweenAdjacentElementsInACircularArray max = new MaximumDifferenceBetweenAdjacentElementsInACircularArray();

        Assertions.assertEquals(2, max.maxAdjacentDistance(new int[] {-4,-2,-3}));
    }
}