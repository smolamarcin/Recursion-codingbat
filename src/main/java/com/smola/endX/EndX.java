package com.smola.endX;

public class EndX {
    public String endX(String str) {
        if (str.isEmpty()) {
            return str;
        }
        if (str.charAt(0) == 'x') {
            return endX(str.substring(1)) + 'x';
        }
        return str.charAt(0) + endX(str.substring(1));
    }
}
