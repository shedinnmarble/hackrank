package org.hackranck.java;

import java.util.BitSet;
import java.util.Scanner;

/**
 * Created by Dewei on 11/26/2016.
 */
public class JavaBitSet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();//size of the BitSet
        int m = in.nextInt();//number of operations
        BitSet b1 = new BitSet(n);
        BitSet b2 = new BitSet(n);
        while (m-- > 0) {
            String operation = in.next();
            int number1 = in.nextInt();
            int number2 = in.nextInt();
            switch (operation) {
                case "AND":
                    if (number1 == 1) {
                        b1.and(b2);
                    } else {
                        b2.and(b1);
                    }
                    break;
                case "SET":
                    if (number1 == 1) {
                        b1.set(number2);
                    } else {
                        b2.set(number2);
                    }
                    break;
                case "FLIP":
                    if (number1 == 1) {
                        b1.flip(number2);
                    } else {
                        b2.flip(number2);
                    }
                    break;
                case "OR":
                    if (number1 == 1) {
                        b1.or(b2);
                    } else {
                        b2.or(b1);
                    }
                    break;
                case "XOR":
                    if (number1 == 1) {
                        b1.xor(b2);
                    } else {
                        b2.xor(b1);
                    }
                    break;
            }
            System.out.println(String.format("%d %d", b1.cardinality(), b2.cardinality()));

        }
    }


}
