package org.example;

public class UTF8Validation {
    private static final int FOUR_BYTES_MASK = 30;//0xF0;
    private static final int THREE_BYTES_MASK = 14;//0xE0;
    private static final int TWO_BYTES_MASK = 6;//0xC0;
    private static final int ONE_BYTES_MASK = 0;//0x00;
    private static final int NEXT_BYTE_MASK = 0x02;

    private static int getBits(int n, int k) {
        return n >>> (8 - k);
    }

    private static int getByte(int n, int k) {
        return (n << ((4 - k) * 8) - 1) >>> (32 - (8 * k) - 1);
    }

    private static int[][] CHECK_MAP = new int[255][0];
    private static int[] MASK_BITS_COUNT = new int[] {1, 3, 4, 5};

    static {

        CHECK_MAP[ONE_BYTES_MASK] = new int[0];
        CHECK_MAP[TWO_BYTES_MASK] = new int[]{2};
        CHECK_MAP[THREE_BYTES_MASK] = new int[]{2, 3};
        CHECK_MAP[FOUR_BYTES_MASK] = new int[]{2, 3, 4};
    }


    public boolean validUtf8(int[] data) {

        for (int i = 0; i < data.length; i++) {

            int unit = data[i];
            boolean invalid = false;
            for (int j = 0; j < MASK_BITS_COUNT.length; j++) {
                int detectedBits = getBits(getByte(unit, 1), MASK_BITS_COUNT[j] + 1);
                var needChecks = CHECK_MAP[detectedBits];
                for (int k = 0; k < needChecks.length; k++) {
                    int bb = getByte(unit, needChecks[k]);
                    int b = getBits(getByte(unit, needChecks[k]), 2);
                    invalid = invalid || (getBits(getByte(unit, needChecks[k]), 2) == NEXT_BYTE_MASK);
                }
            }
            if (invalid) {
                return false;
            }
        }
        return true;
    }
}
