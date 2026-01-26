package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MinimumAbsoluteDifferenceTest {

    @Test
    void minimumAbsDifference() {
        MinimumAbsoluteDifference min = new MinimumAbsoluteDifference();

        int[] arr = {4,2,1,3};
        var expected = List.of(
                List.of(1,2),
                List.of(2,3),
                List.of(3,4)
        );

        Assertions.assertEquals(expected, min.minimumAbsDifference(arr));
    }

    @Test
    void minimumAbsDifference2() {
        MinimumAbsoluteDifference min = new MinimumAbsoluteDifference();

        int[] arr = {1,3,6,10,15};
        var expected = List.of(
                List.of(1,3)
        );

        Assertions.assertEquals(expected, min.minimumAbsDifference(arr));
    }

    @Test
    void minimumAbsDifference3() {
        MinimumAbsoluteDifference min = new MinimumAbsoluteDifference();

        int[] arr = {3,8,-10,23,19,-4,-14,27};
        var expected = List.of(
                List.of(-14,-10),
                List.of(19,23),
                List.of(23,27)
        );

        Assertions.assertEquals(expected, min.minimumAbsDifference(arr));
    }

    @Test
    void minimumAbsDifference4() {
        MinimumAbsoluteDifference min = new MinimumAbsoluteDifference();

        int[] arr = {-1,-2};
        var expected = List.of(
                List.of(-2,-1)
        );

        Assertions.assertEquals(expected, min.minimumAbsDifference(arr));
    }
}