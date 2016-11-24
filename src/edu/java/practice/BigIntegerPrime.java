package edu.java.practice;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by Dewei on 11/23/2016.
 */
public class BigIntegerPrime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger n = in.nextBigInteger();
        in.close();
        System.out.print(n.isProbablePrime(100)?"prime":"not prime");
     }
}
