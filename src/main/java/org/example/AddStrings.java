package org.example;

public class AddStrings {
    public String addStrings(String num1, String num2) {
         String maxNum = null;
         String minNum = null;

         if (num1.length() > num2.length()) {
             maxNum = num1;
             minNum = num2;
         } else {
             maxNum = num2;
             minNum = num1;
         }

         StringBuilder result = new StringBuilder(maxNum);

         int overflow = 0;

         int maxNumIdx = maxNum.length() - 1;
         for (int i = minNum.length() - 1; i >= 0; i--) {
             int val = minNum.charAt(i) - '0' + result.charAt(maxNumIdx) - '0' + overflow;
             if (val >= 10) {
                 val %= 10;
                 overflow = 1;
             } else {
                 overflow = 0;
             }
             result.setCharAt(maxNumIdx--, (char)(val + '0'));
         }

         while (overflow > 0) {
             if (maxNumIdx >= 0) {
                 int val = result.charAt(maxNumIdx) - '0' + overflow;
                 if (val >= 10) {
                     val %= 10;
                     overflow = 1;
                 } else {
                     overflow = 0;
                 }
                 result.setCharAt(maxNumIdx--, (char) (val + '0'));
             } else {
                 result.insert(0, 1);
                 overflow = 0;
             }
         }

         return result.toString();
    }
}
