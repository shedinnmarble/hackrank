package com.ctci.arrays_string;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Dewei on 12/5/2016.
 * Is Unique: Implement an algorithm to determine if a string has all unique characters. What if you
 * cannot use additional data structures?
 * Hints: #44, #7 7 7, #732
 */
public class IsUnique {

    //ASCII Standard has 128 characters,
    // the ASCII extend include the 128 characters and intatal is 256 chars
    public boolean isUnique(String s) {
        //set can't not hold duplicated value, so check the length of the set and the string
        if (s == null || s.isEmpty()) return true;
        Set<Character> characterSet = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            characterSet.add(s.charAt(i));
        }
        boolean result = characterSet.size() == s.length();
        return result;
    }

    /**
     * a good solution to slove it
     *
     * @param input
     * @return true,
     */
    public boolean isUnique2(String input) {
        if (input == null || input.isEmpty()) return true;
        if (input.length() > 256) return false;
        boolean[] char_int = new boolean[256];
        for (int i = 0; i < input.length(); i++) {
            int char_val = input.charAt(i);
            if (char_int[char_val]) {
                return false;
            }
            char_int[char_val] = true;
        }
        return true;
    }

    public boolean isUniqueChars(String str) {
        int checker = 0;
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i) - 'a';
            int temp=(checker & (1 << val));
            if ( temp> 0) {
                return false;
            }
            checker |= (1 << val);
        }
        return true;
    }
}
