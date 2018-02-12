package com.smola.count7;

class Count7 {
    int count7(int n){
        if (n == 0){
            return n;
        }
        if (n % 10 == 7){
            return 1 + count7(n/10);
        }
        return count7(n/10);
    }
}
