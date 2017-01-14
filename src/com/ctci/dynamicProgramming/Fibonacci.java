package com.ctci.dynamicProgramming;

/**
 * Created by Dewei on 12/6/2016.
 */
public class Fibonacci {


    public int fibonacciOriginal(int n){
        System.out.println(String.format("fibonacciBottomUp(%d)",n));
        if(n==0||n==1){
            System.out.println(String.format("fibonacciBottomUp(%d) return %d",n, n));
            return n;
        }

        int value= fibonacciOriginal(n-1)+fibonacciOriginal(n-2);
        System.out.println(String.format("f(%d)=fibonacciOriginal(%d-1)+fibonacciOriginal(%d-2)=%d",n,n,n,value));
        return value;
    }
    public int fibonacci(int i) {
        return fibonacci(i, new int[i + 1]);
    }

    private int fibonacci(int i, int[] memo) {
        if (i == 0 || i == 1) return i;
        if (memo[i] == 0) {
            System.out.println(String.format("fibonacciBottomUp(%d)",i));
            memo[i] = fibonacci(i - 1, memo) + fibonacci(i - 2, memo);
        }
        return memo[i];
    }

    public int fibonacciBottomUp(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        int[] memo = new int[n];
        memo[0] = 0;
        memo[1] = 1;
        for (int i = 2; i < n; i++) {
            memo[i] = memo[i - 1] + memo[i - 2];
        }

        int value= memo[n - 1] + memo[n - 2];

        return value;
    }

    public int fibnacciNoMemo(int n) throws Exception {
        if(n<0){
            throw new Exception("input can not less than 0");
        }
        if (n == 0) return 0;
        if (n == 1) return 1;
        int a = 0;
        int b = 1;
        for (int i = 2; i < n; i++) {
            int c = a + b;
            a = b;
            b = c;

        }
        return a + b;
    }

    public  int summation(int lower, int upper) {
        if (lower > upper) {
            return 0;
        } else {
            int returned = lower + summation(lower + 1, upper);
            System.out.println("Current lower bound: " + lower + " | " + "Upper bound: " + upper + " | " + "returned:" + returned);
            return returned;
        }
    }
}