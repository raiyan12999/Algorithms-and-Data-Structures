package com.recursion;

public class RecursiveFunction {

    public static void main(String[] args) {
        print(6);
    }

    static void print(int n){
        System.out.println(n);

        print(n + 1);
    }
}
