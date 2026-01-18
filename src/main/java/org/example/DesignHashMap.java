package org.example;

import java.util.Arrays;

public class DesignHashMap {
    private final int[] data = new int[1000001];

    DesignHashMap() {
        Arrays.fill(data, -1);
    }

    public void put(int key, int value) {
        data[key] = value;
    }

    public int get(int key) {
        return data[key];
    }

    public void remove(int key) {
        data[key] = -1;
    }
}
