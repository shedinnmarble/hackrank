package com.ctci.dynamicProgramming;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Dewei on 12/6/2016.
 * A child is running up a staircase with n steps and can hop either 1 step, 2 steps, or 3
 steps at a time. Implement a method to count how many possible ways the child can run up the
 stairs.
 */
public class CountWays {
    public int countWays(int n){
        Map<Integer, Integer> arr = new HashMap<>();
       return countWays(n,arr);
    }
    public int countWays(int n,  Map<Integer, Integer>  momi) {
        if (n < 0) {
            return 0;
        } else if (n == 0) {
            momi.put(0,1);
        }
        if(momi.containsKey(n)){
            return momi.get(n);
        }
           int count= countWays(n - 1) + countWays(n - 2) + countWays(n - 3);
           momi.put(n,count);

        return momi.get(n);
    }
}
