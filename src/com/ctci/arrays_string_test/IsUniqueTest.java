package com.ctci.arrays_string_test;

import com.ctci.arrays_string.IsUnique;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Created by Dewei on 12/5/2016.
 */
public class IsUniqueTest {
    IsUnique isUnique=new IsUnique();
    @Test
    public void testisUnique(){
        Assertions.assertEquals(false,isUnique.isUnique("#44"));
        Assertions.assertEquals(false,isUnique.isUnique("#117"));
        Assertions.assertEquals(true,isUnique.isUnique("#132"));
        Assertions.assertEquals(true,isUnique.isUnique(""));
        Assertions.assertEquals(true,isUnique.isUnique(null));
        Assertions.assertEquals(false,isUnique.isUnique("  "));
    }
    @Test
    public void testisUnique2(){
        Assertions.assertEquals(false,isUnique.isUnique2("#44"));
        Assertions.assertEquals(false,isUnique.isUnique2("#117"));
        Assertions.assertEquals(true,isUnique.isUnique2("#132"));
        Assertions.assertEquals(true,isUnique.isUnique2(""));
        Assertions.assertEquals(true,isUnique.isUnique2(null));
        Assertions.assertEquals(false,isUnique.isUnique2("  "));
        Assertions.assertEquals(true,isUnique.isUnique2("~!@#$%^&*()_+|`1234567890-=\\"));
    }
    @Test
    public void testisUniqueChar(){
        Assertions.assertEquals(false,isUnique.isUniqueChars("abcc"));
    }
}
