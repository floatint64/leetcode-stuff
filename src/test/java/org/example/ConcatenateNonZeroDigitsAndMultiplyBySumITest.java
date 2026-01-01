package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConcatenateNonZeroDigitsAndMultiplyBySumITest {

    @Test
    void sumAndMultiply() {
        ConcatenateNonZeroDigitsAndMultiplyBySumI concat = new ConcatenateNonZeroDigitsAndMultiplyBySumI();

        Assertions.assertEquals(12340, concat.sumAndMultiply(10203004));
    }

    @Test
    void sumAndMultiply2() {
        ConcatenateNonZeroDigitsAndMultiplyBySumI concat = new ConcatenateNonZeroDigitsAndMultiplyBySumI();

        Assertions.assertEquals(1, concat.sumAndMultiply(1000));
    }

    @Test
    void sumAndMultiply3() {
        ConcatenateNonZeroDigitsAndMultiplyBySumI concat = new ConcatenateNonZeroDigitsAndMultiplyBySumI();

        Assertions.assertEquals(1116, concat.sumAndMultiply(903));
    }

    @Test
    void sumAndMultiply4() {
        ConcatenateNonZeroDigitsAndMultiplyBySumI concat = new ConcatenateNonZeroDigitsAndMultiplyBySumI();

        Assertions.assertEquals(0, concat.sumAndMultiply(0));
    }
}