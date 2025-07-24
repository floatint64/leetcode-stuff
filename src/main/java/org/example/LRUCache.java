package org.example;

import java.util.*;

public class LRUCache {
    private int capacity;

    private final int[] cache = new int[10001];
    private final Queue<Integer> keys;

    public LRUCache(int capacity) {
        Arrays.fill(cache, -1);
        this.capacity = capacity;
        keys = new ArrayDeque<>(capacity);
    }

    public int get(int key) {
        if (cache[key] == -1) {
            return -1;
        }

        keys.remove(key);
        keys.add(key);

        return cache[key];
    }

    public void put(int key, int value) {
        if (cache[key] != -1) {
            keys.remove(key);
            keys.add(key);
            cache[key] = value;
            return;
        }

        if (keys.size() + 1 > capacity) {
            var lastKey = keys.poll();
            cache[lastKey] = -1;
        }

        keys.add(key);
        cache[key] = value;
    }
}
