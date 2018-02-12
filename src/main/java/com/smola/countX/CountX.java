package com.smola.countX;

public class CountX {
    int countX(String str) {
        if (str.isEmpty()) {
            return str.length();
        }
        if (str.charAt(0) == 'x'){
            return 1 + countX(str.substring(1));
        }
        return countX(str.substring(1));
    }
}
