package com.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        int[] arr = {33, 5, 6, 23};

        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] nums){

        Arrays.sort(nums);
    }
}
