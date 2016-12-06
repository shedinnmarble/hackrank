package com.ctci.arrays_string;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Dewei on 12/5/2016.
 * Given two strings, write a method to decide if one is a permutation of the
 other.
 */
public class CheckPermutation {
    //abc, a
    public boolean isPermutation(String origin, String permutation) {
        //1,2,3.  the permutation can 1,2 2,1
        ArrayList<Character> characters = new ArrayList<>();
        for (int i = 0; i < origin.length(); i++) {
            characters.add(origin.charAt(i));
        }
        for (int i = 0; i < permutation.length(); i++) {

            if (characters.size() == 0 || !characters.remove((Character) permutation.charAt(i))) {
                return false;
            }
        }
        return true;
    }
    public boolean isPermutation2(String origin, String permutation) {
        char[] originChars=origin.toCharArray();
        char[] permutationChars=permutation.toCharArray();
        Arrays.sort(originChars);
        Arrays.sort(permutationChars);
        return new String(originChars).equals(new String(permutationChars));
    }

}
