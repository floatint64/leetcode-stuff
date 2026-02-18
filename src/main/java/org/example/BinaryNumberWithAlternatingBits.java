package org.example;

public class BinaryNumberWithAlternatingBits {
    public boolean hasAlternatingBits(int n) {
        boolean isSet;

        isSet = (n & 1) > 0;

        n >>= 1;

        while (n > 0) {
            int i = n & 1;
            if (i > 0 && isSet) {
                return false;
            } else if (i == 0 && !isSet){
                return false;
            } else {
                isSet = i > 0;
            }

            n >>= 1;
        }

        return true;
    }
}
