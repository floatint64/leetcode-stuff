package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PascalsTriangleIITest {

    @Test
    void getRow() {
        PascalsTriangleII pascalsTriangleII = new PascalsTriangleII();

        var expected = List.of(1,3,3,1);

        Assertions.assertEquals(expected, pascalsTriangleII.getRow(3));
    }
}