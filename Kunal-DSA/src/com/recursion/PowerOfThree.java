package com.recursion;

public class PowerOfThree {

    public static void main(String[] args) {

        System.out.println(isPowerOfThree(80));
//        System.out.println(4/3);
    }

    static boolean isPowerOfThree(int n){

//        for (int i = 3; i <= n; i = i * 3){
//            if(i == n){
//                return true;
//            }
//
//        }
//
//        return false;

        long number = (long) n;
        long x = 1;
        boolean ans = compare(x, number);

        return ans;

    }

    static boolean compare(long x, long number){
        if ( x == number){
            return true;
        } else if (x > number){
            return false;
        }

        return compare(x * 3, number);
    }


}
