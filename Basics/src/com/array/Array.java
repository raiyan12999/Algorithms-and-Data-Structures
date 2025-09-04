package com.array;

import java.util.Arrays;

public class Array {

    public static void main(String[] args) {

        int[] nums = new int[3];
        for (int i = 0; i < 3; i++){
            nums[i] = i+3;
        }

        for (int i : nums){
            System.out.println(i);
        }

        int[] arr1 = new int[]{3, 6, 9};
        int[] arr2 = {6, 7, 9};

        for (int i : arr1){
            System.out.println(i);
        }
        for (int i : arr2){
            System.out.println(i);
        }

        int[] arr3 = {323, 3, 52,35, 3};

        // printing arrays using toString() method
        System.out.println(Arrays.toString(arr1));

        // Sorting an array
        Arrays.sort(arr3);
        System.out.println(Arrays.toString(arr3));


        int index = Arrays.binarySearch(arr3, 35);
        System.out.println(index);
    }



}
