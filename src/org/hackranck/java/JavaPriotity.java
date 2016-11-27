package org.hackranck.java;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * Created by Dewei on 11/26/2016.
 */
public class JavaPriotity {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PriorityQueue<Student> p = new PriorityQueue<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                //CGPA desc, first name asc, ID asc
                if (o2.getCgpa() == o1.getCgpa()) {
                    //names are the same, ID asc
                    if (o1.getFname().equals(o2.getFname())) {
                        if (o1.getId() > o2.getId()) return 1;
                        if (o1.getId() < o2.getId()) return -1;
                        return 0;
                    } else {
                        //first name asc
                        return o1.getFname().compareTo(o2.getFname());
                    }
                } else {
                    if (o2.getCgpa() > o1.getCgpa()) return 1;
                    else return -1;
                }

            }
        });
        int totalEvents = Integer.parseInt(in.nextLine());
        while (totalEvents > 0) {
            String event = in.next();
            switch (event) {
                case "ENTER":
                    String fName = in.next();
                    double cgpa = in.nextDouble();
                    int token = in.nextInt();
                    p.add(new Student(token, fName, cgpa));
                    break;
                case "SERVED":
                    p.poll();

                    break;
            }
            //Complete your code

            totalEvents--;
        }
        if(p.isEmpty()){
            System.out.println("EMPTY");
            return;
        }
        while (!p.isEmpty()){
            System.out.println(p.remove().getFname());
        }
    }
}


