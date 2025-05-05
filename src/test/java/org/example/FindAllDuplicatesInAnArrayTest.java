package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FindAllDuplicatesInAnArrayTest {

    @Test
    void findDuplicates() {
        FindAllDuplicatesInAnArray findAllDuplicatesInAnArray = new FindAllDuplicatesInAnArray();

        int[] nums = new int[] {4,3,2,7,8,2,3,1};

        Assertions.assertEquals(List.of(2, 3), findAllDuplicatesInAnArray.findDuplicates(nums));
    }

    @Test
    void findDuplicates2() {
        FindAllDuplicatesInAnArray findAllDuplicatesInAnArray = new FindAllDuplicatesInAnArray();

        int[] nums = new int[] {1,1,2};

        Assertions.assertEquals(List.of(1), findAllDuplicatesInAnArray.findDuplicates(nums));
    }

    @Test
    void findDuplicates3() {
        FindAllDuplicatesInAnArray findAllDuplicatesInAnArray = new FindAllDuplicatesInAnArray();

        int[] nums = new int[] {1};

        Assertions.assertEquals(List.of(), findAllDuplicatesInAnArray.findDuplicates(nums));
    }


    @Test
    void findDuplicates4() {
        FindAllDuplicatesInAnArray findAllDuplicatesInAnArray = new FindAllDuplicatesInAnArray();

        int[] nums = new int[] {1, 1};

        Assertions.assertEquals(List.of(1), findAllDuplicatesInAnArray.findDuplicates(nums));
    }
}