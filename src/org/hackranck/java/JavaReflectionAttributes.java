package org.hackranck.java;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Dewei on 11/26/2016.
 */
public class JavaReflectionAttributes {
    public static void main(String[] args){
        Class student =Student.class;
        Method[] methods = student.getDeclaredMethods();

        ArrayList<String> methodList = new ArrayList<>();
        for(Method m:methods){
            methodList.add(m.getName());

        }
        Collections.sort(methodList);
        for(String name: methodList){
            System.out.println(name);
        }
    }
}
