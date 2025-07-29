package org.example;

public class ExcelSheetColumnNumber {
    public int titleToNumber(String columnTitle) {
        int result = 0;

        int i = 0;

        while (i < columnTitle.length()) {
            int n = (columnTitle.charAt(i) - 'A' + 1) * (int)Math.pow(26, columnTitle.length() - i - 1);
            result += n;
            i++;
        }

        return result;
    }
}
