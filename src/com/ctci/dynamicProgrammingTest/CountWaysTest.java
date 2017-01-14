package com.ctci.dynamicProgrammingTest;

import com.ctci.dynamicProgramming.CountWays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
 * Created by Dewei on 12/6/2016.
 */
public class CountWaysTest {
    private CountWays countWays = new CountWays();

    @Test
    public void test() {
            assertEquals(4,countWays.countWays(3));
        assertEquals(44,countWays.countWays(7));
    }
}
