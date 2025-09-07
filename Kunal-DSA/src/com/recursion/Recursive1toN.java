package com.recursion;

import java.util.Scanner;

public class Recursive1toN {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        printNumber(input);
    }

    static void printNumber(int in){

        if(in == 0){
            return;
        }
        printNumber(in - 1);
        System.out.println(in);

    }
}

