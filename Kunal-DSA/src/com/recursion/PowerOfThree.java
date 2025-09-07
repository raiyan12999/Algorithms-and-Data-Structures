package com.recursion;

public class PowerOfThree {

    public static void main(String[] args) {

        System.out.println(isPowerOfThree(81));
//        System.out.println(4/3);
    }

    static boolean isPowerOfThree(int n){

        for (int i = 3; i <= n; i = i * 3){
            if(i == n){
                return true;
            }

        }

        return false;
    }
}
