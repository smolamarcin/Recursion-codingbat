package com.smola.reverseString;

public class ReverseString {
    String reverse(String str){
        if (str.isEmpty()){
            return str;
        }
        return reverse(str.substring(1))+str.charAt(0);
    }
}
