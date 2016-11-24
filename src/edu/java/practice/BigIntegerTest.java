package edu.java.practice;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by Dewei on 11/23/2016.
 */
public class BigIntegerTest {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String a=in.nextLine();
        String b=in.nextLine();
        BigInteger bigA=new BigInteger(a);
        BigInteger bigB =new BigInteger(b);
        System.out.println(bigA.add(bigB).toString());
        System.out.println(bigA.multiply(bigB).toString());

    }
}
