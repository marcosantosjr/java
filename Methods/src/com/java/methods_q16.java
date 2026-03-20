package com.java;

public class methods_q16 {
    static void main() {
        int nums[] = {10, 11, 33, 67, 50};

        System.out.println(secondLargest(nums));

    }

    static int secondLargest(int nums[]){
        int first = 0;
        int second = 0;

        for (int i = 0; i < nums.length; i++){
            if (first < nums[i]) {
                second = first;
                first = nums[i];
            } else if (second < nums[i]){
                second = nums[i];
            }
        }

        return second;
    }
}
