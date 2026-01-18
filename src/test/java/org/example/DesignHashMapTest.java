package org.example;

import org.example.common.CallSequenceTester;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DesignHashMapTest {

    @Test
    void test() throws Exception {
        DesignHashMap design = new DesignHashMap();

        var methods = List.of(
                "put", "put", "get", "get", "put", "get", "remove", "get"
        );

        List<List<Object>> params = List.of(
                List.of(1,1),
                List.of(2,2),
                List.of(1),
                List.of(3),
                List.of(2,1),
                List.of(2),
                List.of(2),
                List.of(2)
        );

        List<Object> expected = Arrays.asList(null, null, 1, -1, null, 1, null, -1);

        CallSequenceTester.assertCallSequence(design, methods, params, expected);
    }
}