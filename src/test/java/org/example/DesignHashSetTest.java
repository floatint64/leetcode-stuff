package org.example;

import org.example.common.CallSequenceTester;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class DesignHashSetTest {

    @Test
    void test() throws Exception {
        DesignHashSet design = new DesignHashSet();

        var methods = List.of(
                "add", "add", "contains", "contains", "add", "contains", "remove", "contains"
        );

        List<List<Object>> params = List.of(
                List.of(1),
                List.of(2),
                List.of(1),
                List.of(3),
                List.of(2),
                List.of(2),
                List.of(2),
                List.of(2)
        );

        List<Object> expected = Arrays.asList(null, null, true, false, null, true, null, false);

        CallSequenceTester.assertCallSequence(design, methods, params, expected);
    }
}