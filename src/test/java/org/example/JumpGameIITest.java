package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JumpGameIITest {

    @Test
    void jump() {
        JumpGameII jump = new JumpGameII();

        int[] nums = {2,3,1,1,4};

        Assertions.assertEquals(2, jump.jump(nums));
    }

    @Test
    void jump2() {
        JumpGameII jump = new JumpGameII();

        int[] nums = {2,3,0,1,4};

        Assertions.assertEquals(2, jump.jump(nums));
    }

    @Test
    void jump3() {
        JumpGameII jump = new JumpGameII();

        int[] nums = {0};

        Assertions.assertEquals(0, jump.jump(nums));
    }

    @Test
    void jump4() {
        JumpGameII jump = new JumpGameII();

        int[] nums = {2,1,1,1,1};

        Assertions.assertEquals(3, jump.jump(nums));
    }

    @Test
    void jump5() {
        JumpGameII jump = new JumpGameII();

        int[] nums = {4,1,0,5,0,0,0,2};

        Assertions.assertEquals(2, jump.jump(nums));
    }

    @Test
    void jump6() {
        JumpGameII jump = new JumpGameII();

        int[] nums = {3,2,1};

        Assertions.assertEquals(1, jump.jump(nums));
    }

    @Test
    void jump7() {
        JumpGameII jump = new JumpGameII();

        int[] nums = {2,3,1};

        Assertions.assertEquals(1, jump.jump(nums));
    }

    @Test
    void jump8() {
        JumpGameII jump = new JumpGameII();

        int[] nums = {4,1,1,3,1,1,1};

        Assertions.assertEquals(2, jump.jump(nums));
    }
}