package com.ctci.dynamicProgramming;

/**
 * Created by Dewei on 12/10/2016.
 */
public class Mutiply {
    public int mutilply(int a,int b){
        if(b==0){
            return 0;
        }
        if(b>0){
            return a + mutilply(a,b-1);
        }
        else
            return -mutilply(a,-b);
    }

}
