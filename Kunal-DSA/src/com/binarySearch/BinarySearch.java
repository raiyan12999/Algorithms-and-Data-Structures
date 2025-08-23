package com.binarySearch;

public class BinarySearch {
    public static void main(String[] args) {

        int[] arr = {-2, -1, 3, 6, 7, 9, 22, 45, 68};
        int target = 10009;

        int ans = binarySearch(arr, target);
        System.out.println(ans);

    }

    // return the index
    // return -1 if it doesn't exist
    static int binarySearch(int[] arr, int target){

        int start = 0;
        int end = arr.length - 1;

        while(start <= end){

            int mid = start + (end - start)/2;
            if (target == arr[mid]){
                return mid;
            } else if (target < arr[mid]){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }
}