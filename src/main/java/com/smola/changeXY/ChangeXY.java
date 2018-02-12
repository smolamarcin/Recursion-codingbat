package com.smola.changeXY;

public class ChangeXY {
    String changeXY(String str) {
        if (str.isEmpty()) {
            return str;
        }
        if (str.charAt(0) == 'x') {
            return 'y' + changeXY(str.substring(1));
        }
        return str.charAt(0) + changeXY(str.substring(1));
    }
}
