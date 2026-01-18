package org.example;

public class DesignHashSet {

    private final boolean[] data = new boolean[1000001];

    public DesignHashSet() {

    }

    public void add(int key) {
        data[key] = true;
    }

    public void remove(int key) {
        data[key] = false;
    }

    public boolean contains(int key) {
        return data[key];
    }
}
