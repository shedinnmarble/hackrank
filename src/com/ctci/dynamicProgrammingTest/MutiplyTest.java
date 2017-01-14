package com.ctci.dynamicProgrammingTest;


import com.ctci.dynamicProgramming.Mutiply;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Created by Dewei on 12/10/2016.
 */
public class MutiplyTest {
    private Mutiply mutiply=new Mutiply();

    @Test
    public void testMutiply(){
        Assertions.assertEquals(0,mutiply.mutilply(3,0));
        Assertions.assertEquals(30,mutiply.mutilply(3,10));
        Assertions.assertEquals(20,mutiply.mutilply(4,5));
        Assertions.assertEquals(33,mutiply.mutilply(3,11));
    }
}
