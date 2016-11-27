package org.hackranck.java;

import java.util.*;

/**
 * Created by Dewei on 11/25/2016.
 */
public class Ddequeue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        Set<Integer> set = new HashSet<>();
        long max = 0;
        int n = in.nextInt();
        int m = in.nextInt();
        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            deque.add(num);
            set.add(num);
            if (deque.size() == m) {
                if (set.size() > max) max = set.size();
                int first = deque.remove();
                if (!deque.contains(first)) set.remove(first);


//                long count = deque.stream().distinct().count();
//                if (count > max) {
//                    max = count;
//                }

            }
        }
        System.out.println(max);

    }
}
