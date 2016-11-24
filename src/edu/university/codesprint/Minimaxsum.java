package edu.university.codesprint;

import com.sun.deploy.util.ArrayUtil;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Created by Dewei on 11/23/2016.
 */
public class Minimaxsum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();
        long c = in.nextLong();
        long d = in.nextLong();
        long e = in.nextLong();
        String f = in.nextLine();

        long sum1=b+c+d+e;
        long sum2=a+c+d+e;
        long sum3=a+b+d+e;
        long sum4=a+b+c+e;
        long sum5=a+b+c+d;
        List<Long> sumList=new ArrayList<>();
        sumList.add(sum1);
        sumList.add(sum2);
        sumList.add(sum3);
        sumList.add(sum4);
        sumList.add(sum5);

        System.out.print(Collections.min(sumList)+" ");
        System.out.print(Collections.max(sumList));

    }
}
