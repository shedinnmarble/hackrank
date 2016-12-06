package com.ctci.arrays_string;

/**
 * Created by Dewei on 12/3/2016.
 */
public class MyStringBuilder {
    private char[] value;
    private int count = 0;
    private int index = 0;

    public MyStringBuilder() {
        value = new char[16];
    }

    public void append(String s) {
        assureArrayLength(value.length+s.length());
        for (int i = 0; i < s.length(); i++) {
            value[index++] = s.charAt(i);
            count++;
        }
    }
    private void  assureArrayLength(int minLength){
       if(minLength>0){
           if(minLength-value.length>0){
               increase(minLength);
           }
       }
    }
    private void increase(int newSize) {
        char[] newArr = new char[newSize];
        for (int i = 0; i < count; i++) {
            newArr[i] = value[i];
        }
        value = newArr;
    }

    @Override
    public String toString() {

        return new String(value, 0, count);
    }
}
