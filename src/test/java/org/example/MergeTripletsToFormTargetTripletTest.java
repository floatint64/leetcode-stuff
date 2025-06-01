package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeTripletsToFormTargetTripletTest {

    @Test
    void mergeTriplets() {

        MergeTripletsToFormTargetTriplet merge = new MergeTripletsToFormTargetTriplet();

        int[][] triplets = {
                {2,5,3},{1,8,4},{1,7,5}
        };

        int[] target = {2,7,5};

        Assertions.assertTrue(merge.mergeTriplets(triplets, target));
    }

    @Test
    void mergeTriplets2() {

        MergeTripletsToFormTargetTriplet merge = new MergeTripletsToFormTargetTriplet();

        int[][] triplets = {
                {3,4,5},{4,5,6}
        };

        int[] target = {3,2,5};

        Assertions.assertFalse(merge.mergeTriplets(triplets, target));
    }

    @Test
    void mergeTriplets3() {

        MergeTripletsToFormTargetTriplet merge = new MergeTripletsToFormTargetTriplet();

        int[][] triplets = {
                {2,5,3},{2,3,4},{1,2,5},{5,2,3}
        };

        int[] target = {5,5,5};

        Assertions.assertTrue(merge.mergeTriplets(triplets, target));
    }

    @Test
    void mergeTriplets4() {

        MergeTripletsToFormTargetTriplet merge = new MergeTripletsToFormTargetTriplet();

        int[][] triplets = {
                {2,5,3}
        };

        int[] target = {2,5,3};

        Assertions.assertTrue(merge.mergeTriplets(triplets, target));
    }

    @Test
    void mergeTriplets5() {

        MergeTripletsToFormTargetTriplet merge = new MergeTripletsToFormTargetTriplet();

        int[][] triplets = {
                {2,5,3},{7,7,7}
        };

        int[] target = {5,5,5};

        Assertions.assertFalse(merge.mergeTriplets(triplets, target));
    }

    @Test
    void mergeTriplets6() {

        MergeTripletsToFormTargetTriplet merge = new MergeTripletsToFormTargetTriplet();

        int[][] triplets = {
                {1, 1, 1,}, {2,5,3}
        };

        int[] target = {2,5,3};

        Assertions.assertTrue(merge.mergeTriplets(triplets, target));
    }

    @Test
    void mergeTriplets7() {

        MergeTripletsToFormTargetTriplet merge = new MergeTripletsToFormTargetTriplet();

        int[][] triplets = {
                {1, 1, 1,}
        };

        int[] target = {2,2,2};

        Assertions.assertFalse(merge.mergeTriplets(triplets, target));
    }
}