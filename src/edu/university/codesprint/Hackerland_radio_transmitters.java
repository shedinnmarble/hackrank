package edu.university.codesprint;

/**
 * Created by Dewei on 11/23/2016.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] x = new int[n];
        for(int x_i=0; x_i < n; x_i++){
            x[x_i] = in.nextInt();
        }
        //sort
        //check range
        Arrays.sort(x);

        int sumOfT=1;
        int startPoint=x[0];
        boolean hasMiddle=false;
        boolean lasCoverd=true;
        int endPoint=x[0];
        for(int i=0;i<n;i++){

            //check duplicate
            if(i+1<n && x[i]==x[i+1]){
                continue;
            }
            int range=x[i]-startPoint;

            if(range==k){
                hasMiddle=true;
            }
            //check many houses

            if(range>k && !hasMiddle){
                sumOfT++;
                startPoint=x[i];
                hasMiddle=false;

                continue;
            }
            if(range>2*k && hasMiddle){
                sumOfT++;
                startPoint=x[i];
                hasMiddle=false;

                continue;
            }
        }

        System.out.println(sumOfT);
    }
}
