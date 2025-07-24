package org.example;

import org.example.common.CallSequenceTester;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LRUCacheTest {

    @Test
    void lru() {
        LRUCache cache = new LRUCache(2);
        cache.put(1, 0);
        cache.put(2, 2);
        cache.get(1);
        cache.put(3, 3);
        Assertions.assertEquals(-1, cache.get(2));
        cache.put(4, 4);
        cache.get(1);
        cache.get(3);
        cache.get(4);
    }

    @Test
    void lru2() {
        LRUCache cache = new LRUCache(2);
        cache.get(2);
        cache.put(2, 6);
        cache.get(1);
        cache.put(1, 5);
        cache.put(1, 2);
        Assertions.assertEquals(2, cache.get(1));
        Assertions.assertEquals(6, cache.get(2));
    }

    @Test
    void lru3() throws Exception {
        LRUCache lru = new LRUCache(2);

        var methods = List.of(
                "put","put","get","put","get","put","get","get","get"
        );

        List<List<Object>> params = List.of(
                List.of(1,1),
                List.of(2,2),
                List.of(1),
                List.of(3,3),
                List.of(2),
                List.of(4,4),
                List.of(1),
                List.of(3),
                List.of(4)
        );

        List<Object> expected = Arrays.asList(
                null, null, 1, null, -1, null, -1, 3, 4
        );

        CallSequenceTester.assertCallSequence(
                lru,
                methods,
                params,
                expected
        );
    }
}