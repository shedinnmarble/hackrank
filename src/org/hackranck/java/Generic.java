package org.hackranck.java;

import java.lang.reflect.Array;

/**
 * Created by Dewei on 11/25/2016.
 */
public class Generic<T> {
    //Write your code here
    public <T > void printArray(T[] array){
        for (T value    :
                array) {
            System.out.println(value);
        }
    }
}
