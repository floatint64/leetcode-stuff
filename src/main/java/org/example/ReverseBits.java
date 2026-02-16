package org.example;

public class ReverseBits {

    private static final byte[] BYTE_REVERSES = new byte[256];

    static {
        for (int i = 0; i < BYTE_REVERSES.length; i++) {
            BYTE_REVERSES[i] = reverseBits((byte)i);
        }
    }

    private static byte reverseBits(byte b) {
        byte result = 0;

        for (int i = 7; i >= 0; i--) {
            int bit = (b >> i) & 1;
            result |= (byte)((byte)bit << (7 - i));
        }

        return result;
    }

    public int reverseBits(int n) {
        int result = 0;

        for (int i = 3; i >= 0; i--) {
            int b = BYTE_REVERSES[((byte) (n >> (i * 8))) & 0xff] & 0xFF;
            result |= b << (((3 - i)*8));
        }

        return result;
    }
}
