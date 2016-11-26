package org.hackranck.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by Dewei on 11/24/2016.
 * https://www.hackerrank.com/challenges/java-arraylist
 */
public class JavaArraylist {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());

        Object[] arrayObject = new Object[n + 1];
        for (int i = 1; i < n + 1; i++) {
            arrayObject[i] = in.nextLine().split(" ");
        }
        int queries = in.nextInt();
        while (queries > 0) {
            int x = in.nextInt();
            int y = in.nextInt();
            String[] ay = (String[]) arrayObject[x];
            try {
                System.out.println(ay[y]);
            } catch (Exception e) {
                System.out.println("ERROR!");
            }

            queries--;
        }
    }
}
