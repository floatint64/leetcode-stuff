package org.example;

public class DesignBitset {
    private StringBuilder bits;
    private StringBuilder flippedBits;
    private final int size;
    private int setCount;

    public DesignBitset(int size) {
        this.size = size;

        bits = new StringBuilder(size);
        flippedBits = new StringBuilder(size);

        for (int i = 0; i < size; i++) {
            bits.append('0');
            flippedBits.append('1');
        }
    }

    public void fix(int idx) {
        if (bits.charAt(idx) == '0') {
            setCount++;
            bits.setCharAt(idx, '1');
            flippedBits.setCharAt(idx, '0');
        }
    }

    public void unfix(int idx) {
        if (bits.charAt(idx) == '1') {
            setCount--;
            bits.setCharAt(idx, '0');
            flippedBits.setCharAt(idx, '1');
        }
    }

    public void flip() {
        StringBuilder tmp = bits;
        bits = flippedBits;
        flippedBits= tmp;
        setCount = size - setCount;
    }

    public boolean all() {
        return size == setCount;
    }

    public boolean one() {
        return setCount > 0;
    }

    public int count() {
        return setCount;
    }

    public String toString() {
        return bits.toString();
    }
}
