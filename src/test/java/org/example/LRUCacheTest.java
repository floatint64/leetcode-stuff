package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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
}