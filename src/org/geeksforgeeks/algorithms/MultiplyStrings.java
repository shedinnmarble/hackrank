package org.geeksforgeeks.algorithms;

/**
 * Created by Dewei on 12/16/2016.
 */
public class MultiplyStrings {
    /*You are required to complete below function */
    String multiplyStrings(String s1, String s2) {
        //Your code here
        int a=Integer.parseInt(s1);
        int b=Integer.parseInt(s2);
        return String.format("%d",a*b);
    }
}
