package org.example;

public class CheckIfStringsCanBeMadeEqualWithOperationsI {
    public boolean canBeEqual(String s1, String s2) {
        if (s1.contentEquals(s2)) {
            return true;
        }
        StringBuilder sb1 = new StringBuilder(s1);
        StringBuilder sb2 = new StringBuilder(s1);

        char tmp = sb1.charAt(0);
        sb1.setCharAt(0, sb1.charAt(2));
        sb1.setCharAt(2, tmp);

        tmp = sb2.charAt(1);
        sb2.setCharAt(1, sb1.charAt(3));
        sb2.setCharAt(3, tmp);

        var outerCheck = s2.contentEquals(sb1) || s2.contentEquals(sb2);

        tmp = sb1.charAt(1);
        sb1.setCharAt(1, sb1.charAt(3));
        sb1.setCharAt(3, tmp);

        return outerCheck || s2.contentEquals(sb1);
    }
}
