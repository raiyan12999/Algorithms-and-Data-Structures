package com.recursion;

import java.util.Scanner;

public class RecursiveNto1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        printNumber(input);
    }

    static void printNumber(int in){

        if(in == 0){
            return;
        }
        System.out.println(in);
        printNumber(in - 1);
    }
}
