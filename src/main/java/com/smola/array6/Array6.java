package com.smola.array6;

public class Array6 {
    boolean array6(int[] nums, int index){
        if (index >= nums.length){
            return false;
        }
        if (nums[index] == 6){
            return true;
        }
        return array6(nums,index+1);
    }
}