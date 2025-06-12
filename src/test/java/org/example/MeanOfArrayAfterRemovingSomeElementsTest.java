package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MeanOfArrayAfterRemovingSomeElementsTest {

    @Test
    void trimMean() {
        MeanOfArrayAfterRemovingSomeElements mean = new MeanOfArrayAfterRemovingSomeElements();

        int[] arr = {1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,3};

        Assertions.assertEquals(2.0, mean.trimMean(arr), 0.00001);
    }

    @Test
    void trimMean2() {
        MeanOfArrayAfterRemovingSomeElements mean = new MeanOfArrayAfterRemovingSomeElements();

        int[] arr = {6,2,7,5,1,2,0,3,10,2,5,0,5,5,0,8,7,6,8,0};

        Assertions.assertEquals(4.0, mean.trimMean(arr), 0.00001);
    }

    @Test
    void trimMean3() {
        MeanOfArrayAfterRemovingSomeElements mean = new MeanOfArrayAfterRemovingSomeElements();

        int[] arr = {6,0,7,0,7,5,7,8,3,4,0,7,8,1,6,8,1,1,2,4,8,1,9,5,4,3,8,5,10,8,6,6,1,0,6,10,8,2,3,4};

        Assertions.assertEquals(4.77778, mean.trimMean(arr), 0.00001);
    }
}