package com.binarySearch;

public class Leetcode33 {
    public static void main(String[] args) {

        int[] nums = {25, 3, 4, 6, 8};
        int target = 3;

        int ans = search(nums, target);
        System.out.println(ans);

    }

    static int search(int[] nums, int target) {
        for(int i = 0; i <= nums.length - 1; i++){
            if (nums[i] == target){
                return i;
            }
        }

        return -1;

    }
}
