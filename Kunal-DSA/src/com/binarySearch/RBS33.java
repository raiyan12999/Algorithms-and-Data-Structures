package com.binarySearch;

public class RBS33 {

    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
        int ans = search(nums, target);
        System.out.println(ans);
    }

    static int search(int[] nums, int target){

        int pivot = 0;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end){
            int mid = start + (end - start)/2;

            if (nums[mid] > nums[mid + 1]){
                pivot = mid;

                return pivot;
            } else if (nums[mid] < nums[mid - 1]){
                pivot = mid - 1;

                return pivot;
            } else if (nums[start] > nums[mid]){
                end = mid - 1;
            } else if (nums[start] < nums[mid]){
                start = mid + 1;
            }
        }

        return pivot;
    }
}
