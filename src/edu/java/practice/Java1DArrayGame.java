package edu.java.practice;

import java.util.Scanner;

/**
 * Created by Dewei on 11/24/2016.
 */
public class Java1DArrayGame {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        while (n>0){
            int length=in.nextInt();
            int m=in.nextInt();
            int[] arr1d=new int[length];
            for(int i=0;i<length;i++){
                arr1d[i]=in.nextInt();
            }
            //check game
            boolean win=false;
            for(int i=0;i<length;i++){
                if(arr1d[i]!=0){
                    break;
                }
                //jump out,win
                if(i+m>length-1||i==length-1){
                    win=true;
                    break;
                }
                else if(arr1d[i]==0&&i+m<length&&arr1d[i+m]==0){
                    i=i+m;
                    System.out.println(i);
                }
                //else if(arr1d[i]==0&&i+m<length&&arr1d[i+m]==0)
                //else i++
            }
            System.out.println(win?"YES":"NO");

            n--;
        }
    }
}
