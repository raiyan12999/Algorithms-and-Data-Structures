package com.binarySearch;

public class Sqrt {

    public static void main(String[] args) {
        int x = 3599;

        int ans = mySqrt(x);

        System.out.println(ans);
    }

    static int mySqrt(int x) {

        if (x == 0){
            return x;
        }

        int start = 0;
        int end = x - 1;

        int[] arr = new int[x];

        for (int i = 0; i <= end; i++){
            arr[i] = i + 1;
        }

        while (start <= end){
            int mid = start + (end - start)/2;

            if (arr[mid]*arr[mid] < x){
                start = mid + 1;
            } else if (arr[mid] * arr[mid] > x){
                end = mid - 1;
            } else {
                return arr[mid];
            }
        }

        return arr[end];

    }
}
