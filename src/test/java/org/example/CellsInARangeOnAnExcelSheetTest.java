package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CellsInARangeOnAnExcelSheetTest {

    @Test
    void cellsInRange() {
        CellsInARangeOnAnExcelSheet cells = new CellsInARangeOnAnExcelSheet();

        String s = "K1:L2";

        var expected = List.of(
                "K1","K2","L1","L2"
        );

        Assertions.assertEquals(expected, cells.cellsInRange(s));
    }

    @Test
    void cellsInRange2() {
        CellsInARangeOnAnExcelSheet cells = new CellsInARangeOnAnExcelSheet();

        String s = "A1:F1";

        var expected = List.of(
                "A1","B1","C1","D1","E1","F1"
        );

        Assertions.assertEquals(expected, cells.cellsInRange(s));
    }
}