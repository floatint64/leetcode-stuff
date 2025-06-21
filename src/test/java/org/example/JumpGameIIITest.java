package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JumpGameIIITest {

    @Test
    void canReach() {
        JumpGameIII jump = new JumpGameIII();

        int[] arr = {4,2,3,0,3,1,2};
        int start = 5;

        Assertions.assertTrue(jump.canReach(arr, start));
    }

    @Test
    void canReach2() {
        JumpGameIII jump = new JumpGameIII();

        int[] arr = {4,2,3,0,3,1,2};
        int start = 0;

        Assertions.assertTrue(jump.canReach(arr, start));
    }

    @Test
    void canReach3() {
        JumpGameIII jump = new JumpGameIII();

        int[] arr = {3,0,2,1,2};
        int start = 2;

        Assertions.assertFalse(jump.canReach(arr, start));
    }

    @Test
    void canReach4() {
        JumpGameIII jump = new JumpGameIII();

        int[] arr = {3,0,2,1,2};
        int start = 1;

        Assertions.assertTrue(jump.canReach(arr, start));
    }

    @Test
    void canReach5() {
        JumpGameIII jump = new JumpGameIII();

        int[] arr = {3};
        int start = 0;

        Assertions.assertFalse(jump.canReach(arr, start));
    }

    @Test
    void canReach6() {
        JumpGameIII jump = new JumpGameIII();

        int[] arr = {0};
        int start = 0;

        Assertions.assertTrue(jump.canReach(arr, start));
    }

    @Test
    void canReach7() {
        JumpGameIII jump = new JumpGameIII();

        int[] arr = {0, 1, 2};
        int start = 1;

        Assertions.assertTrue(jump.canReach(arr, start));
    }
}