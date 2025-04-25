package org.example;

import java.util.*;

public class HTMLEntityParser {
    static final Map<String, String> CHAR_MAP = new HashMap<>() {
        {put("&quot;", "\"");}
        {put("&apos;", "'");}
        {put("&amp;", "&");}
        {put("&gt;", ">");}
        {put("&lt;", "<");}
        {put("&frasl;", "/");}
    };

    public String entityParser(String text) {
        //int i = 0;
        StringBuilder sb = new StringBuilder(text.length());
        int i = 0;
        while (i < text.length()) {
            if (text.charAt(i) != '&') {
                sb.append(text.charAt(i));
                i++;
            } else {
                int j = i + 1;
                while (j < text.length() && (text.charAt(j) != ';' && text.charAt(j) != '&')) {
                    j++;
                }
                if (j < text.length() && text.charAt(j) == '&') {
                    sb.append(text, i, j);
                    i = j;
                } else if (j < text.length() && text.charAt(j) == ';') {
                    var sym = text.substring(i, j + 1);
                    var val = CHAR_MAP.get(sym);
                    if (val == null) {
                        val = sym;
                    }
                    sb.append(val);
                    i = j + 1;
                }
            }
        }

        return sb.toString();
    }
}
