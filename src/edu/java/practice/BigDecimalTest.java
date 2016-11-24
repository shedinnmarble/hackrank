package edu.java.practice;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Created by Dewei on 11/23/2016.
 */
public class BigDecimalTest {
    public static void main(String[] args) {
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();
        Arrays.sort(s, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1==null ||o2==null){
                    return 0;
                }
                BigDecimal bO1=new BigDecimal(o1);
                BigDecimal bO2=new BigDecimal(o2);
                int result=bO2.compareTo(bO1);
                return result;
            }
        });
        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }
}
