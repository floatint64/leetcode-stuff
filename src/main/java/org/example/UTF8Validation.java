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


    public boolean validUtf8(int[] data) {


        int i = 0;

        while (i < data.length) {
            int unit = data[i];

            int b = getByte(unit, 1);

            if (getBits(b, 1) == ONE_BYTES_MASK) {
              i++;
            } else if (getBits(b, 3) == TWO_BYTES_MASK) {
                if (i + 1 < data.length && getBits(getByte(data[i + 1], 1), 2) == NEXT_BYTE_MASK) {
                    i += 2;
                } else {
                    return false;
                }
            } else if (getBits(b, 4) == THREE_BYTES_MASK) {
                if (i + 2 < data.length && getBits(getByte(data[i + 1], 1), 2) == NEXT_BYTE_MASK &&
                        getBits(getByte(data[i + 2], 1), 2) == NEXT_BYTE_MASK) {
                    i += 3;
                } else {
                    return false;
                }
            } else if (getBits(b, 5) == FOUR_BYTES_MASK) {
                if (i + 3 < data.length && getBits(getByte(data[i + 1], 1), 2) == NEXT_BYTE_MASK &&
                        getBits(getByte(data[i + 2], 1), 2) == NEXT_BYTE_MASK &&
                        getBits(getByte(data[i + 3], 1), 2) == NEXT_BYTE_MASK) {
                    i += 4;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }

        return true;
    }
}
