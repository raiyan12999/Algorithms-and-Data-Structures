package com.binarySearch;

public class PeakInMounatin {

    public static void main(String[] args) {
        int[] arr = {0, 3, 4, 6, 5, 2, 1};
        int ans = peakIndexInMountainArray(arr);

        System.out.println(ans + " " + arr[ans]);
    }

    static int peakIndexInMountainArray(int[] arr) {

        int max = arr[0];
        int index = 0;

        for (int i = 1; i <= arr.length - 1; i++){
            if (arr[i] > max){
                max = arr[i];
                index = i;
            }
        }

        return index;


    }
}
