package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExcelSheetColumnTitleTest {

    @Test
    void convertToTitle() {
        ExcelSheetColumnTitle excel = new ExcelSheetColumnTitle();

        Assertions.assertEquals("A", excel.convertToTitle(1));
    }

    @Test
    void convertToTitle2() {
        ExcelSheetColumnTitle excel = new ExcelSheetColumnTitle();

        Assertions.assertEquals("AB", excel.convertToTitle(28));
    }

    @Test
    void convertToTitle3() {
        ExcelSheetColumnTitle excel = new ExcelSheetColumnTitle();

        Assertions.assertEquals("ZY", excel.convertToTitle(701));
    }
}