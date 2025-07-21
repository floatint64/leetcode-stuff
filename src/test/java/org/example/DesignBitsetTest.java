package org.example;

import org.example.common.CallSequenceTester;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class DesignBitsetTest {

    @Test
    void fix() throws Exception {
        DesignBitset bitset = new DesignBitset(5);

        var methods = List.of(
                "fix",
                "fix",
                "flip",
                "all",
                "unfix",
                "flip",
                "one",
                "unfix",
                "count",
                "toString"
        );

        List<List<Object>> params = Arrays.asList(
                List.of(3),
                List.of(1),
                List.of(),
                List.of(),
                List.of(0),
                List.of(),
                List.of(),
                List.of(0),
                List.of(),
                List.of()
        );

        List<Object> expected = Arrays.asList(
                null,
                null,
                null,
                false,
                null,
                null,
                true,
                null,
                2,
                "01010"
        );

        CallSequenceTester.assertCallSequence(
                bitset,
                methods,
                params,
                expected
        );
    }

    @Test
    void fix2() throws Exception {
        DesignBitset bitset = new DesignBitset(5);

        var methods = List.of(
                "fix",
                "toString",
                "fix",
                "toString",
                "flip",
                "toString",
                "unfix",
                "toString",
                "flip",
                "toString",
                "flip",
                "toString",
                "unfix",
                "flip",
                "toString"
        );

        List<List<Object>> params = Arrays.asList(
                List.of(0),
                List.of(),
                List.of(1),
                List.of(),
                List.of(),
                List.of(),
                List.of(2),
                List.of(),
                List.of(),
                List.of(),
                List.of(),
                List.of(),
                List.of(0),
                List.of(),
                List.of()
        );

        List<Object> expected = Arrays.asList(
                null,
                "10000",
                null,
                "11000",
                null,
                "00111",
                null,
                "00011",
                null,
                "11100",
                null,
                "00011",
                null,
                null,
                "11100"
        );

        CallSequenceTester.assertCallSequence(
                bitset,
                methods,
                params,
                expected
        );
    }

    @Test
    void fix3() throws Exception {
        DesignBitset bitset = new DesignBitset(35);

        var methods = List.of(
                "flip",
                "unfix",
                "toString"
        );

        List<List<Object>> params = Arrays.asList(
                List.of(),
                List.of(34),
                List.of()
        );

        List<Object> expected = Arrays.asList(
                null,
                null,
                "11111111111111111111111111111111110"
        );

        CallSequenceTester.assertCallSequence(
                bitset,
                methods,
                params,
                expected
        );
    }
}