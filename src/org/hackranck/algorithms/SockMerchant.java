package org.hackranck.algorithms;

import java.util.*;

/**
 * Created by Dewei on 11/25/2016.
 */
public class SockMerchant {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c[] = new int[n];

        for (int c_i = 0; c_i < n; c_i++) {
            c[c_i] = in.nextInt();
        }
        int number = getMatchedSocks(c);
        System.out.println(number);
    }

    private static int getMatchedSocks(int[] c) {
        Map<Integer, Integer> socksMap = new HashMap<>();
        for (int sock :
                c) {
            if (socksMap.containsKey(sock)) {
                socksMap.put(sock, socksMap.get(sock) + 1);
            } else {
                socksMap.put(sock, 1);
            }
        }
        int sumOfMatched=0;
        for (Integer key :
                socksMap.keySet()) {
            sumOfMatched+=socksMap.get(key)/2;
        }
        return sumOfMatched;
    }
}
