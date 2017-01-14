package com.ctci.dynamicProgrammingTest;


import com.ctci.dynamicProgramming.MagicIndex;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Dewei on 12/7/2016.
 */
public class MagicIndexTest {
    private MagicIndex magicIndex=new MagicIndex();
    @Test
    public void test(){
        assertEquals(true,magicIndex.isExistsMagicIndex(new int[]{0}));
        assertEquals(true,magicIndex.isExistsMagicIndex(new int[]{1,3,3,3}));
        assertEquals(false,magicIndex.isExistsMagicIndex(new int[]{1,3,3}));
    }
    @Test
    public void testBinary(){
        assertEquals(0,magicIndex.isExistsmagicIndexBinarySearch(new int[]{0},0,1-1));
        assertEquals(3,magicIndex.isExistsmagicIndexBinarySearch(new int[]{1,3,3,3},0,4-1));
        assertEquals(-1,magicIndex.isExistsmagicIndexBinarySearch(new int[]{1,3,3},0,3-1));
    }
}
