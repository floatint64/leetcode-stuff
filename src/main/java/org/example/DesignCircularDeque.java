package org.example;

public class DesignCircularDeque {

    private int[] arr;
    private int head;
    private int tail;
    private final int k;
    private int count = 0;


    public DesignCircularDeque(int k) {
        arr = new int[k];
        int m = (arr.length) / 2;
        head = m;
        tail = m;
        this.k = k;
    }

    public boolean insertFront(int value) {
        if (count >= k) {
            return false;
        }

        if (head < 0) {
            head = arr.length - 1;
        }

        if (head == tail) {
            tail++;
        }

        arr[head--] = value;
        count++;
        return true;
    }

    public boolean insertLast(int value) {
        if (count >= k) {
            return false;
        }

        if (tail >= arr.length) {
            tail = 0;
        }

        if (head == tail) {
            head--;
        }

        arr[tail++] = value;
        count++;
        return true;
    }

    public boolean deleteFront() {
        if (count < 1) {
            return false;
        }

        if (head == arr.length - 1) {
            head = 0;
        } else {
            head++;
        }

        count--;

        return true;
    }

    public boolean deleteLast() {
        if (count < 1) {
            return false;
        }

        if (tail == 0) {
            tail = arr.length - 1;
        } else {
            tail--;
        }

        count--;

        return true;
    }

    public int getFront() {
        if (count == 0) {
            return -1;
        }

        int idx = head + 1 >= arr.length ? 0 : head + 1;

        return arr[idx];
    }

    public int getRear() {
        if (count == 0) {
            return -1;
        }

        int idx = tail - 1 < 0 ? arr.length - 1 : tail - 1;

        return arr[idx];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == k;
    }
}
