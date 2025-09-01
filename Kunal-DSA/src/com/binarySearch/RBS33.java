package com.binarySearch;

public class RBS33 {

    public static void main(String[] args) {
        int[] nums = {1,3};
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

                break;
            } else if (nums[mid] != nums[0] && nums[mid] <= nums[mid - 1]) {
                pivot = mid - 1;

                break;
            } else if(nums[mid] == nums[0]){
                if (nums[mid] > nums[mid + 1]){
                    pivot = mid;

                    break;
                } else if (nums[mid] < nums[mid + 1]){
                    pivot = mid + 1;

                    break;
                }

            } else if (nums[start] > nums[mid]){
                end = mid - 1;
            } else if (nums[start] < nums[mid]){
                start = mid + 1;
            }
        }

        start = 0;
        end = pivot;

        int ans1 = binarySearch(nums, target, start, end);

        start = pivot + 1;
        end = nums.length - 1;
        int ans2 = binarySearch(nums, target, start, end);

        if(ans1 != -1){
            return ans1;
        } else if(ans2 != -1){
            return ans2;
        }

        return ans1;
    }

    static int binarySearch(int[] nums, int target, int start, int end){

        while (start <= end){

            int mid = start + (end - start)/2;

            if (nums[mid] == target){
                return mid;
            } else if (nums[mid] < target){
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }
}
