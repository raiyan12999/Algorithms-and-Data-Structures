package com.binarySearch.codeforces;

import java.util.Scanner;

public class aBinarySearch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];
        int[] queries = new int[k];

        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < queries.length; i++){
            queries[i] = sc.nextInt();
        }

//        printArray(arr);
//        printArray(queries);
    }

    static void printArray(int[] nums){

        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i]);

            if(i < nums.length){
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
