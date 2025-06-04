package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FindGoodDaysToRobTheBankTest {

    @Test
    void goodDaysToRobBank() {
        FindGoodDaysToRobTheBank find = new FindGoodDaysToRobTheBank();

        int[] security = {5,3,3,3,5,6,2};
        int time = 2;

        Assertions.assertEquals(List.of(2, 3), find.goodDaysToRobBank(security, time));
    }

    @Test
    void goodDaysToRobBank2() {
        FindGoodDaysToRobTheBank find = new FindGoodDaysToRobTheBank();

        int[] security = {1,1,1,1,1};
        int time = 0;

        Assertions.assertEquals(List.of(0,1,2,3,4), find.goodDaysToRobBank(security, time));
    }

    @Test
    void goodDaysToRobBank3() {
        FindGoodDaysToRobTheBank find = new FindGoodDaysToRobTheBank();

        int[] security = {1,2,3,4,5,6};
        int time = 2;

        Assertions.assertEquals(List.of(), find.goodDaysToRobBank(security, time));
    }

    @Test
    void goodDaysToRobBank4() {
        FindGoodDaysToRobTheBank find = new FindGoodDaysToRobTheBank();

        int[] security = {77,9,111,138,139,183,112,127,38,123,198,86,163,50,140,106,99,140,152,176,124,181,14,113,53,186,76,165,32,26,137,4,186,193,130,157,173,52,27,101,154,129,34,200,51,184,127,147,197,151,190,95,62,182,77,34,174,162,7,84,105,103,128};
        int time = 2;

        Assertions.assertEquals(List.of(16, 38, 58), find.goodDaysToRobBank(security, time));
    }

    @Test
    void goodDaysToRobBank5() {
        FindGoodDaysToRobTheBank find = new FindGoodDaysToRobTheBank();

        int[] security = {1,2,5,4,1,0,2,4,5,3,1,2,4,3,2,4,8};
        int time = 2;

        Assertions.assertEquals(List.of(5,10,14), find.goodDaysToRobBank(security, time));
    }
}