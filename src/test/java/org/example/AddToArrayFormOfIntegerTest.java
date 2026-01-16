package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AddToArrayFormOfIntegerTest {

    @Test
    void addToArrayForm() {
        AddToArrayFormOfInteger add = new AddToArrayFormOfInteger();

        int[] num = {1,2,0,0};
        int k = 34;
        var expected = List.of(1,2,3,4);

        Assertions.assertEquals(expected, add.addToArrayForm(num, k));
    }

    @Test
    void addToArrayForm2() {
        AddToArrayFormOfInteger add = new AddToArrayFormOfInteger();

        int[] num = {2,7,4};
        int k = 181;
        var expected = List.of(4,5,5);

        Assertions.assertEquals(expected, add.addToArrayForm(num, k));
    }

    @Test
    void addToArrayForm3() {
        AddToArrayFormOfInteger add = new AddToArrayFormOfInteger();

        int[] num = {2,1,5};
        int k = 806;
        var expected = List.of(1,0,2,1);

        Assertions.assertEquals(expected, add.addToArrayForm(num, k));
    }

    @Test
    void addToArrayForm4() {
        AddToArrayFormOfInteger add = new AddToArrayFormOfInteger();

        int[] num = {9,9};
        int k = 1;
        var expected = List.of(1,0,0);

        Assertions.assertEquals(expected, add.addToArrayForm(num, k));
    }

    @Test
    void addToArrayForm5() {
        AddToArrayFormOfInteger add = new AddToArrayFormOfInteger();

        int[] num = {1};
        int k = 99;
        var expected = List.of(1,0,0);

        Assertions.assertEquals(expected, add.addToArrayForm(num, k));
    }

    @Test
    void addToArrayForm6() {
        AddToArrayFormOfInteger add = new AddToArrayFormOfInteger();

        int[] num = {1};
        int k = 1;
        var expected = List.of(2);

        Assertions.assertEquals(expected, add.addToArrayForm(num, k));
    }

    @Test
    void addToArrayForm7() {
        AddToArrayFormOfInteger add = new AddToArrayFormOfInteger();

        int[] num = {1,0,0};
        int k = 100;
        var expected = List.of(2,0,0);

        Assertions.assertEquals(expected, add.addToArrayForm(num, k));
    }

    @Test
    void addToArrayForm8() {
        AddToArrayFormOfInteger add = new AddToArrayFormOfInteger();

        int[] num = {0};
        int k = 0;
        var expected = List.of(0);

        Assertions.assertEquals(expected, add.addToArrayForm(num, k));
    }
}