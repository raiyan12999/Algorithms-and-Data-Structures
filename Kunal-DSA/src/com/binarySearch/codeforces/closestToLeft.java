package com.binarySearch.codeforces;

import java.util.Scanner;

public class closestToLeft {

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

        int target;

        for (int i = 0; i < queries.length; i++){
            target = queries[i];

            int ans = binarySearch(arr, target);
            System.out.println(ans);
        }

//        String ans = binarySearch(arr, target);
//        System.out.println(ans);


//        printArray(arr);
//        printArray(queries);
    }

    static int binarySearch(int[] nums, int target){

        int start = 0;
        int end = nums.length - 1;

        while (start <= end){

            int mid = start + (end - start)/2;

            if (nums[mid] < target){
                start = mid + 1;
            } else if (nums[mid] > target){
                end = mid - 1;
            } else {
                return mid + 1;
            }
        }

        return end + 1;
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

