package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExcelSheetColumnNumberTest {

    @Test
    void titleToNumber() {
        ExcelSheetColumnNumber excel = new ExcelSheetColumnNumber();

        String s = "A";

        Assertions.assertEquals(1, excel.titleToNumber(s));
    }

    @Test
    void titleToNumber2() {
        ExcelSheetColumnNumber excel = new ExcelSheetColumnNumber();

        String s = "AB";

        Assertions.assertEquals(28, excel.titleToNumber(s));
    }

    @Test
    void titleToNumber3() {
        ExcelSheetColumnNumber excel = new ExcelSheetColumnNumber();

        String s = "ZY";

        Assertions.assertEquals(701, excel.titleToNumber(s));
    }
}