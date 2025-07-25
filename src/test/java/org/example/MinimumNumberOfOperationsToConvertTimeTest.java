package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumNumberOfOperationsToConvertTimeTest {

    @Test
    void convertTime() {
        MinimumNumberOfOperationsToConvertTime min = new MinimumNumberOfOperationsToConvertTime();

        String current = "02:30";
        String correct = "04:35";

        Assertions.assertEquals(3, min.convertTime(current, correct));
    }

    @Test
    void convertTime2() {
        MinimumNumberOfOperationsToConvertTime min = new MinimumNumberOfOperationsToConvertTime();

        String current = "11:00";
        String correct = "11:01";

        Assertions.assertEquals(1, min.convertTime(current, correct));
    }

    @Test
    void convertTime3() {
        MinimumNumberOfOperationsToConvertTime min = new MinimumNumberOfOperationsToConvertTime();

        String current = "11:59";
        String correct = "12:10";

        Assertions.assertEquals(3, min.convertTime(current, correct));
    }
}