package org.example;

public class ExcelSheetColumnTitle {
    public String convertToTitle(int columnNumber) {

        StringBuilder sb = new StringBuilder();

        while (columnNumber != 0) {
            int n = (columnNumber - 1) % 26;
            sb.append((char)(n + 'A'));
            columnNumber = (columnNumber - 1) / 26;
        }


        return sb.reverse().toString();
    }
}
