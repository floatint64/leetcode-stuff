package org.example;

public class BitwiseOROfEvenNumbersInAnArray {
    public int evenNumberBitwiseORs(int[] nums) {
        int result = 0;

        for (var i : nums) {
            if ((i & 1) == 0) {
                result |= i;
            }
        }

        return result;
    }
}
