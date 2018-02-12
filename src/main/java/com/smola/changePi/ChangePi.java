package com.smola.changePi;

public class ChangePi {
    String changePi (String str){
        if (str.length() <=1){
            return str;
        }
        if (str.substring(0,2).equals("pi")){
            return String.valueOf(3.14) +changePi(str.substring(2));
        }
        return str.charAt(0) + changePi(str.substring(1));
    }
}
