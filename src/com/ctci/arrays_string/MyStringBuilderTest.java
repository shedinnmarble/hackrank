package com.ctci.arrays_string;

import com.ctci.arrays_string.MyStringBuilder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Created by Dewei on 12/3/2016.
 */
public class MyStringBuilderTest {
    @Test
    public void testBasic1() {
        MyStringBuilder myStringBuilder = new MyStringBuilder();
        myStringBuilder.append("1");
        myStringBuilder.append("1");
        myStringBuilder.append("1");
        myStringBuilder.append("1");
        Assertions.assertEquals("1111", myStringBuilder.toString());
    }

    @Test
    public void testBasic2() {
        MyStringBuilder myStringBuilder = new MyStringBuilder();
        myStringBuilder.append("1");

        Assertions.assertEquals("1", myStringBuilder.toString());
    }

    @Test
    public void testBasic3() {
        MyStringBuilder myStringBuilder = new MyStringBuilder();
        myStringBuilder.append("123");
        myStringBuilder.append("456789");
        Assertions.assertEquals("123456789", myStringBuilder.toString());
    }
}
