package org.example;

public class DesignBitset {
    private int[] words;
    private int fixCount = 0;
    private int flipCount = 0;
    private int size = 0;
    private int wordsCount = 0;
    private int[] bitMask = new int[32];

    public DesignBitset(int size) {
        this.size = size;
        this.wordsCount = (int)Math.ceil((double)size / 32);
        this.words = new int[this.wordsCount];
        for (int i = 0; i < 32; i++){
            bitMask[i] = 1 << i;
        }
    }

    public void fix(int idx) {
        if ((flipCount & 1) > 0) {
            flip();
            flipCount = 0;
        }
        int wordIdx = getWordIdx(idx);
        int bitIdx = getBitIndex(idx, wordIdx);
        int old = words[wordIdx] & bitMask[bitIdx];
        words[wordIdx] |= bitMask[bitIdx];
        if (old == 0) {
            fixCount++;
        }
    }

    public void unfix(int idx) {
        if ((flipCount & 1) > 0) {
            flip();
            flipCount = 0;
        }
        int wordIdx = getWordIdx(idx);
        int bitIdx = getBitIndex(idx, wordIdx);
        int old = words[wordIdx] & bitMask[bitIdx];
        words[wordIdx] &= ~bitMask[bitIdx];
        if (old != 0) {
            fixCount--;
        }
    }

    public void flip() {
        fixCount = size - fixCount;
        for (int i = 0; i < size; i++) {
            int wordIdx = getWordIdx(i);
            int bitIdx = getBitIndex(i, wordIdx);
            int old = words[wordIdx] & bitMask[bitIdx];
            if (old == 0) {
                words[wordIdx] |= bitMask[bitIdx];
            } else {
                words[wordIdx] &= ~bitMask[bitIdx];
            }
        }
    }

    public boolean all() {
        if ((flipCount & 1) > 0) {
            return (size - fixCount) == size;
        } else {
            return fixCount == size;
        }
    }

    public boolean one() {
        if ((flipCount & 1) == 0) {
            return fixCount > 0;
        } else {
            return size - fixCount > 0;
        }
    }

    public int count() {
        if ((flipCount & 1) == 0) {
            return fixCount;
        } else {
            return size - fixCount;
        }
    }

    public String toString() {
        if ((flipCount & 1) > 0) {
            flip();
            flipCount = 0;
        }
        StringBuilder sb = new StringBuilder(size);

        for (int i = 0; i < size; i++){
            int wordIdx = getWordIdx(i);
            int bitIdx = getBitIndex(i, wordIdx);
            sb.append((words[wordIdx] & bitMask[bitIdx]) >>> bitIdx);
        }


        return sb.toString();
    }

    private int getWordIdx(int index) {
        return index / 32;
    }

    private int getBitIndex(int index, int wordIndex) {
        return index % 32;
    }
}
