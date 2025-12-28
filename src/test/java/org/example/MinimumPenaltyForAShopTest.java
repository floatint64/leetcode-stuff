package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumPenaltyForAShopTest {

    @Test
    void bestClosingTime() {
        MinimumPenaltyForAShop min = new MinimumPenaltyForAShop();

        String customers = "YYNY";

        Assertions.assertEquals(2, min.bestClosingTime(customers));
    }

    @Test
    void bestClosingTime2() {
        MinimumPenaltyForAShop min = new MinimumPenaltyForAShop();

        String customers = "NNNNN";

        Assertions.assertEquals(0, min.bestClosingTime(customers));
    }

    @Test
    void bestClosingTime3() {
        MinimumPenaltyForAShop min = new MinimumPenaltyForAShop();

        String customers = "YYYY";

        Assertions.assertEquals(4, min.bestClosingTime(customers));
    }

    @Test
    void bestClosingTime4() {
        MinimumPenaltyForAShop min = new MinimumPenaltyForAShop();

        String customers = "NYYYNNNYNN";

        Assertions.assertEquals(4, min.bestClosingTime(customers));
    }

    @Test
    void bestClosingTime5() {
        MinimumPenaltyForAShop min = new MinimumPenaltyForAShop();

        String customers = "YYNYNYN";

        Assertions.assertEquals(2, min.bestClosingTime(customers));
    }
}