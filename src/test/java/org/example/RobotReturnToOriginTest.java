package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RobotReturnToOriginTest {

    @Test
    void judgeCircle() {
        RobotReturnToOrigin r = new RobotReturnToOrigin();

        var moves = "UD";
        var expected = true;

        Assertions.assertEquals(expected, r.judgeCircle(moves));
    }

    @Test
    void judgeCircle2() {
        RobotReturnToOrigin r = new RobotReturnToOrigin();

        var moves = "LL";
        var expected = false;

        Assertions.assertEquals(expected, r.judgeCircle(moves));
    }
}