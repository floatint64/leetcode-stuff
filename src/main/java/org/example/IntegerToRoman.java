package org.example;

import java.util.TreeMap;

public class IntegerToRoman {
    static final TreeMap<Integer, String> ROMAN_NUMS = new TreeMap<Integer, String>(){
        {put(1, "I");}
        {put(5, "V");}
        {put(10, "X");}
        {put(50, "L");}
        {put(100, "C");}
        {put(500, "D");}
        {put(1000, "M");}
        //
        {put(4, "IV");}
        {put(9, "IX");}
        {put(40, "XL");}
        {put(90, "XC");}
        {put(400, "CD");}
        {put(900, "CM");}
    };

    public String intToRoman(int num) {
        if (num == 0) {
            return "";
        } else if (ROMAN_NUMS.containsKey(num)) {
            return ROMAN_NUMS.get(num);
        }

        var maxSubstract = ROMAN_NUMS.lowerEntry(num);
        if (maxSubstract == null) {
            maxSubstract = ROMAN_NUMS.floorEntry(num);
        }

        var n2 = num - maxSubstract.getKey();
        return maxSubstract.getValue() + intToRoman(n2);
    }
}
