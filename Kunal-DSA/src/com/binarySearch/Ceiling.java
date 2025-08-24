package com.binarySearch;


public class Ceiling {
    public static void main(String[] args) {

        int[] arr = {1,3,5,6};
        int target = 5;

        int ans = searchInsert(arr, target);
        System.out.println(ans);

    }

    // return the index
    // return -1 if it doesn't exist
    static int searchInsert(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;

        while (start <= end){
            int mid = start + (end - start)/2;

            if (target == nums[mid]){
                return nums[mid];
            } else if (target < nums[mid]){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        if (start < nums.length){
            return nums[start];
        } else {
            return nums[start - 1];
        }




    }
}
