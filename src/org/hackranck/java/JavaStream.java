package org.hackranck.java;

/**
 * Created by Dewei on 11/26/2016.
 */
interface PerformOperation {
    boolean check(int a);
}

class MyMath {
    public static boolean checker(PerformOperation p, int num) {
        return p.check(num);
    }

    public static PerformOperation is_odd() {
        return x -> x % 2 == 1;
    }

    public static PerformOperation is_prime() {
        return x -> java.math.BigInteger.valueOf(x).isProbablePrime(1);
    }

    public static PerformOperation is_palindrome() {
        return (int a) -> Integer.toString(a).equals(new StringBuilder(Integer.toString(a)).reverse().toString());
    }
}
