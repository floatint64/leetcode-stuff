package org.example;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationsOfAPhoneNumber {

    private static String[] KBD = new String['9' + 1];

    static {
        KBD['2'] = "abc";
        KBD['3'] = "def";
        KBD['4'] = "ghi";
        KBD['5'] = "jkl";
        KBD['6'] = "mno";
        KBD['7'] = "pqrs";
        KBD['8'] = "tuv";
        KBD['9'] = "wxyz";
    }

    public List<String> letterCombinations(String digits) {
        var result = new ArrayList<String>((int)Math.pow(4, digits.length()));
        StringBuilder buffer = new StringBuilder(16);

        combineStrings(0, digits, buffer, result);

        return result;
    }

    private void combineStrings(int letterIdx, String digits, StringBuilder buffer, List<String> result) {
        if (letterIdx >= digits.length()) {
            result.add(buffer.toString());
            return;
        }

        var letterSet = KBD[digits.charAt(letterIdx)];
        for (int i = 0; i < letterSet.length(); i++) {
            buffer.append(letterSet.charAt(i));
            combineStrings(letterIdx + 1, digits, buffer, result);
            buffer.deleteCharAt(buffer.length() - 1);
        }
    }
}
