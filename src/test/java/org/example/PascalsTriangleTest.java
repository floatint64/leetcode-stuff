package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PascalsTriangleTest {

    @Test
    void generate() {
        PascalsTriangle pascal = new PascalsTriangle();

        var expected = List.of(
                List.of(1),
                List.of(1,1),
                List.of(1,2,1),
                List.of(1,3,3,1)
        );

        Assertions.assertEquals(expected, pascal.generate(4));
    }

    @Test
    void generate2() {
        PascalsTriangle pascal = new PascalsTriangle();

        var expected = List.of(
                List.of(1),
                List.of(1,1),
                List.of(1,2,1),
                List.of(1,3,3,1),
                List.of(1,4,6,4,1)
        );

        Assertions.assertEquals(expected, pascal.generate(5));
    }
}