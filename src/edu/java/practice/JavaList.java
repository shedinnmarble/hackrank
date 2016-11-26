package edu.java.practice;

import com.daxiang.utilizaition.Stopwatch;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Dewei on 11/24/2016.
 */
public class JavaList {
    public static void main(String[] args) {
        Stopwatch timer=new Stopwatch();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> arrayList = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            arrayList.add(in.nextInt());
        }
        int query = in.nextInt();
        while (query-- > 0) {
            String operation = in.next();
            if (operation.equals("Insert")) {
                int index = in.nextInt();
                int data = in.nextInt();
                arrayList.add(index, data);
            }
            if (operation.equals("Delete")) {
                int index = in.nextInt();
                arrayList.remove(index);
            }
        }
        for (Integer data :
                arrayList) {
            System.out.print(data + " ");
        }

        System.out.printf("running time is %.2f",timer.elapsedTime());
    }
}
