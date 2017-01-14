package com.ctci.dynamicProgrammingTest;

import com.ctci.dynamicProgramming.CountTxtFile;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Created by Dewei on 12/14/2016.
 */
public class TestCountFile {

    @Test
    public void testCountFile(){
        Assertions.assertEquals(2, CountTxtFile.numberOfJavaFile("D:\\G_Github\\DBMS\\Lerman"));
    }
}
