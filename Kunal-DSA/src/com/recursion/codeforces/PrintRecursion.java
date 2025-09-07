package com.recursion.codeforces;

import java.util.Scanner;
public class PrintRecursion {

    static int counter = 0;

    public static void main(String[] args) {

        Scanner n = new Scanner(System.in);
        int input = n.nextInt();


        printLine(input);
    }

    static void printLine(int in){

        counter ++;

        if (counter == in){
            System.out.println("I love Recursion");

            return;
        }

        System.out.println("I love Recursion");
        printLine(in);

    }
}
