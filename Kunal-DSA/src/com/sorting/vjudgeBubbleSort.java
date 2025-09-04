package com.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class vjudgeBubbleSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] arr = new int[N];

        for (int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
        }

//        System.out.println(Arrays.toString(arr));
        printArray(arr);
        bubble(arr);
        printArray(arr);
//        System.out.println("Sorted array: " + Arrays.toString(arr));
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
//                System.out.println(Arrays.toString(nums));
            }

            if(!swapped){
                break;
            }
        }
    }

    static void printArray(int[] nums){
        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i]);
            if(i < nums.length){
                System.out.print(" ");
            }
        }
//        System.out.println();
    }
}
