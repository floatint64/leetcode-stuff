package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainerWithMostWaterTest {

    @Test
    void maxArea() {
        ContainerWithMostWater containerWithMostWater = new ContainerWithMostWater();
        int[] height = new int[] {1,8,6,2,5,4,8,3,7};

        int maxArea = containerWithMostWater.maxArea(height);

        Assertions.assertEquals(49, maxArea);
    }

    @Test
    void maxArea2() {
        ContainerWithMostWater containerWithMostWater = new ContainerWithMostWater();
        int[] height = new int[] {1,5,4,3};

        int maxArea = containerWithMostWater.maxArea(height);

        Assertions.assertEquals(6, maxArea);
    }

    @Test
    void maxArea3() {
        ContainerWithMostWater containerWithMostWater = new ContainerWithMostWater();
        int[] height = new int[] {3, 1, 2, 4, 5};

        int maxArea = containerWithMostWater.maxArea(height);

        Assertions.assertEquals(12, maxArea);
    }
}