package com.ctci.dynamicProgrammingTest;

import com.ctci.dynamicProgramming.Fibonacci;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Dewei on 12/6/2016.
 */
public class FibonacciTest {
    private Fibonacci fibonacci = new Fibonacci();

    @Test
    public void test() {
        assertEquals(0, fibonacci.fibonacci(0));
        assertEquals(1, fibonacci.fibonacci(1));
        assertEquals(233, fibonacci.fibonacci(13));
        assertEquals(6765, fibonacci.fibonacci(20));

    }

    @Test
    public void testBottomUp() {
        assertEquals(0, fibonacci.fibonacciBottomUp(0));
        assertEquals(1, fibonacci.fibonacciBottomUp(1));
        assertEquals(233, fibonacci.fibonacciBottomUp(13));
        assertEquals(6765, fibonacci.fibonacciBottomUp(20));

    }

    @Test
    public void testNoMemo() throws Exception {
        assertEquals(0, fibonacci.fibnacciNoMemo(0));
        assertEquals(1, fibonacci.fibnacciNoMemo(1));
        assertEquals(233, fibonacci.fibnacciNoMemo(13));
        assertEquals(6765, fibonacci.fibnacciNoMemo(20));
        assertThrows(Exception.class, () -> fibonacci.fibnacciNoMemo(-1));

        Throwable exception = expectThrows(Exception.class, () -> fibonacci.fibnacciNoMemo(-11));
        assertEquals("input can not less than 0", exception.getMessage());

    }
}
