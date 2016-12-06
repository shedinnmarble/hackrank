package com.ctci.arrays_string_test;

import com.ctci.arrays_string.CheckPermutation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Created by Dewei on 12/5/2016.
 */
public class CheckPermutationTest {
    private CheckPermutation checkPermutation=new CheckPermutation();
    @Test
    public void testPermutation(){
        Assertions.assertEquals(true,checkPermutation.isPermutation2("abc","bac"));
        Assertions.assertEquals(true,checkPermutation.isPermutation2("abc","cba"));
        Assertions.assertEquals(false,checkPermutation.isPermutation2("abc","a b"));
        Assertions.assertEquals(false,checkPermutation.isPermutation2("abc","abb"));
        Assertions.assertEquals(true,checkPermutation.isPermutation2("abc","abc"),"true result");
    }
}
