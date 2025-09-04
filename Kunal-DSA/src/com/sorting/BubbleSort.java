package com.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};

        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] nums){

        boolean swapped;

        for (int i = 0; i < nums.length - 1; i++){
            swapped = false;
            for (int j = 0; j < nums.length - 1 - i; j++){
                if (nums[j] > nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
}
