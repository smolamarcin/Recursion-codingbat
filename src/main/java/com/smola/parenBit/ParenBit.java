package com.smola.parenBit;

public class ParenBit {
    public String parenBit(String str) {
        int indexOfLastCharacterInString = str.length() - 1;
        int indexOfFirstCharacterInString = 0;
        if (str.charAt(indexOfFirstCharacterInString) == '(' && str.charAt(indexOfLastCharacterInString) == ')') {
            return str;
        }
        if (str.charAt(indexOfFirstCharacterInString) == '(') {
            return parenBit(str.substring(indexOfFirstCharacterInString, indexOfLastCharacterInString));
        }
        if (str.charAt(indexOfFirstCharacterInString) == ')') {
            return parenBit(str.substring(1));
        }


        return parenBit(str.substring(1));
    }
}
