package com.smola.factorial;

public class Factorial {
    public int factorial(int n) {
        if(n == 0){
            return 1;
        }
        return n * factorial(n -1 );
    }
}
