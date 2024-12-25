package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrappingRainWaterTest {

    @Test
    void trap() {
        TrappingRainWater trappingRainWater = new TrappingRainWater();

        int[] height = new int[] {0,1,0,2,1,0,1,3,2,1,2,1};

        int r = trappingRainWater.trap(height);

        Assertions.assertEquals(6, r);
    }

    @Test
    void trap2() {
        TrappingRainWater trappingRainWater = new TrappingRainWater();

        int[] height = new int[] {4,2,0,3,2,5};

        int r = trappingRainWater.trap(height);

        Assertions.assertEquals(9, r);
    }

    @Test
    void trap3() {
        TrappingRainWater trappingRainWater = new TrappingRainWater();

        int[] height = new int[] {3, 0, 1, 0, 4, 0, 2};

        int r = trappingRainWater.trap(height);

        Assertions.assertEquals(10, r);
    }

    @Test
    void trap4() {
        TrappingRainWater trappingRainWater = new TrappingRainWater();

        int[] height = new int[] {3, 0, 2, 0, 4};

        int r = trappingRainWater.trap(height);

        Assertions.assertEquals(7, r);
    }

    @Test
    void trap5() {
        TrappingRainWater trappingRainWater = new TrappingRainWater();

        int[] height = new int[] {1, 2, 3, 4};

        int r = trappingRainWater.trap(height);

        Assertions.assertEquals(0, r);
    }

    @Test
    void trap6() {
        TrappingRainWater trappingRainWater = new TrappingRainWater();

        int[] height = new int[] {1, 1, 1};

        int r = trappingRainWater.trap(height);

        Assertions.assertEquals(0, r);
    }

    @Test
    void trap7() {
        TrappingRainWater trappingRainWater = new TrappingRainWater();

        int[] height = new int[] {3, 2, 1};

        int r = trappingRainWater.trap(height);

        Assertions.assertEquals(0, r);
    }

    @Test
    void trap8() {
        TrappingRainWater trappingRainWater = new TrappingRainWater();

        int[] height = new int[] {1, 2, 3};

        int r = trappingRainWater.trap(height);

        Assertions.assertEquals(0, r);
    }

    @Test
    void trap9() {
        TrappingRainWater trappingRainWater = new TrappingRainWater();

        int[] height = new int[] {1, 2, 3, 2, 1};

        int r = trappingRainWater.trap(height);

        Assertions.assertEquals(0, r);
    }
}