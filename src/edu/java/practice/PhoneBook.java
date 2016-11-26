package edu.java.practice;

import com.daxiang.utilizaition.Stopwatch;

import java.util.*;
import java.util.concurrent.ConcurrentSkipListMap;

/**
 * Created by Dewei on 11/24/2016.
 */
public class PhoneBook {
    public static void main(String[] argh) {
        Stopwatch timer = new Stopwatch();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String, Integer> phonebook = new Hashtable<>();
        in.nextLine();
        for (int i = 0; i < n; i++) {
            String name = in.nextLine();
            int phone = in.nextInt();
            phonebook.put(name, phone);
            in.nextLine();
        }
        while (in.hasNext()) {
            String s = in.nextLine();

//            try {
//                int out = phonebook.get(s);
//                System.out.println(s + "=" + out);
//            } catch (Exception e) {
//                System.out.println("Not found");
//            }

            //runnning time 11.
            if (phonebook.containsKey(s)) {
                int out = phonebook.get(s);
                System.out.println(s + "=" + out);
            } else {
                System.out.println("Not found");
            }

        }
        System.out.printf("running time is %.2f seconds", timer.elapsedTime());
    }
}
