package com.array;

import java.math.BigInteger;

public class BigInt {

    public static void main(String[] args) {

        System.out.println(grainsOnSquare(3));
        System.out.println(grainsOnBoard());
    }

    static BigInteger grainsOnSquare(final int square) {
        BigInteger numOfGrains = BigInteger.ONE;
        for (int i = 1; i < square; i++){

            numOfGrains = numOfGrains.multiply(BigInteger.TWO);
        }
        return numOfGrains;

    }

    static BigInteger grainsOnBoard() {
        BigInteger numOfGrains = BigInteger.ONE;
        for (int i = 1; i < 64; i++){
            numOfGrains = numOfGrains.multiply(BigInteger.TWO);
        }

        return numOfGrains;
    }


}
