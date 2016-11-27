package org.hackranck.java;

/**
 * Created by Dewei on 11/26/2016.
 */
public class JavaVarArgs
{
    void add(int ... args){
        int sum=0;
        String s="";
        for(int arg:args){
            sum+=arg;
            s+= arg+"+";
        }
        String out=s.substring(0,s.length()-1);
        System.out.println(out+"="+sum);
    }
}
