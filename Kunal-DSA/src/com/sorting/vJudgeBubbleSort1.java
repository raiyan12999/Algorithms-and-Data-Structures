
package com.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class vJudgeBubbleSort1{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] arr = new int[N];

        for (int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
        }

        // Print the unsorted one
        bubble(arr);

    }

    static void bubble(int[] nums){

        boolean swapped;
        int swaps = 0;

        for (int i = 0; i < nums.length - 1; i++){
            swapped = false;
            for (int j = 0; j < nums.length - 1 - i; j++){
                if (nums[j] > nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                    swapped = true;
                    swaps++;
                }
//                System.out.println(Arrays.toString(nums));
            }

            if(!swapped){
                break;
            }
        }

        System.out.println("Array is sorted in " + swaps + " swaps.");
        System.out.println("First Element: " + nums[0]);
        System.out.println("Last Element: " + nums[nums.length - 1]);
    }


}
