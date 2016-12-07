package com.ctci.dynamicProgramming;

/**
 * Created by Dewei on 12/6/2016.
 * A child is running up a staircase with n steps and can hop either 1 step, 2 steps, or 3
 steps at a time. Implement a method to count how many possible ways the child can run up the
 stairs.
 */
public class CountWays {
    public int countWays(int n) {
        if (n < 0) {
            return 0;
        } else if (n == 0) {
            return 1;
        } else {
            return countWays(n - 1) + countWays(n - 2) + countWays(n - 3);
        }
    }
}
