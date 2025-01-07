package org.example;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class LRUCache {
    private HashMap<Integer, Integer> cache = new HashMap<>();
    private int capacity;
    private Queue<Integer> queue = new LinkedList<>();

    public LRUCache(int capacity) {
        this.capacity = capacity;
    }

    public int get(int key) {
        Integer val = cache.get(key);
        if (val != null) {
            queue.remove(key);
            queue.add(key);
        }
        return val == null ? -1 : val;
    }

    public void put(int key, int value) {
        if (cache.size() + 1 > capacity) {
            if (!queue.isEmpty()) {
                int queuedValue = queue.poll();
                cache.remove(queuedValue);
                queue.remove(queuedValue);
            }
        }
        cache.put(key, value);
        queue.remove(key);
        queue.add(key);
    }
}
