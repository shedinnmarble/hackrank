package org.hackranck.java;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by Dewei on 11/25/2016.
 */
public class JavaHashSet {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];

        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();

        }
        Set<String> pairs=new HashSet<>();
        for(int i=0;i<t;i++){
            pairs.add(pair_left[i]+" "+pair_right[i]);
            System.out.println(pairs.size());
        }

    }
}
