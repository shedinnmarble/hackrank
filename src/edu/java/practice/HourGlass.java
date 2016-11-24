package edu.java.practice;

import java.util.Scanner;

/**
 * Created by Dewei on 11/23/2016.
 * https://www.hackerrank.com/challenges/java-2d-array
 */
public class HourGlass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        int biggestSum=Integer.MIN_VALUE;
        //check rows
        for(int rows=0;rows<=3;rows++){

            //cols
            for(int cols=0;cols<=3;cols++){
                int tempSum=0;
                //remove the first col's second value
                tempSum+=arr[rows][cols]+arr[rows+2][cols];
                tempSum+=arr[rows][cols+1]+arr[rows+1][cols+1]+arr[rows+2][cols+1];
                //remove the third col's second value
                //so it looks like a hourglass
                tempSum+=arr[rows][cols+2]+arr[rows+2][cols+2];
                if(tempSum>biggestSum) biggestSum=tempSum;

            }

        }
        System.out.println(biggestSum);

    }
}
