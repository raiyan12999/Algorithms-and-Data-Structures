package com.recursion.cses;
import java.util.Scanner;

public class WeirdAlgorithm {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        System.out.print(input);
        System.out.print(" ");
        weirdAlgo(input);
    }

    static void weirdAlgo(int in){

        if(in == 1){
            return;
        } else if (in % 2 == 0){
            in = in / 2;
            System.out.print(in);
            System.out.print(" ");
            weirdAlgo(in);
        } else if(in % 2 != 0){
            in = (in * 3) + 1;
            System.out.print(in);
            System.out.print(" ");
            weirdAlgo(in);
        }


    }
}
