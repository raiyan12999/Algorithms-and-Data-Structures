package com.recursion;

public class InitialOne {

    public static void main(String[] args) {
        print1(5);
    }

    static void print1(int n){
        System.out.println(n);

        print2(4);
    }

    static void print2(int n){
        System.out.println(n);

        print3(3);
    }

    static void print3(int n){
        System.out.println(n);
    }
}
