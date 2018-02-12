package com.smola.bunnyEars;

class BunnyEars {
    int bunnyEars(int bunnies){
        if(bunnies == 0){
            return bunnies;
        }

        return 2+ bunnyEars(bunnies -1);
    }
}
