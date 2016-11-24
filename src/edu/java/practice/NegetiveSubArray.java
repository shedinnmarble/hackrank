package edu.java.practice;

import java.util.Scanner;

/**
 * Created by Dewei on 11/24/2016.
 * https://www.hackerrank.com/challenges/java-negative-subarray
 */
public class NegetiveSubArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        //check negitive subArray
        int sumOfNegetive=0;
        for(int i=0;i<n;i++){
            //check subarray
            if(arr[i]<0){
                sumOfNegetive++;
            }
            int subSum=arr[i];
            for(int j=i+1;j<n;j++){
                subSum+=arr[j];
                if(subSum<0){
                    sumOfNegetive++;
                }
            }
        }
        System.out.println(sumOfNegetive);
    }
}
