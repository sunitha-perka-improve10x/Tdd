package com.improve10x.fibonacci;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

public class FibonacciTest {
    @Test
    public void nothing(){
        /*
        fibonacci series-0,1,1,2,3,5---
    input n= -10 _ output = -1
    input n= 0 _ output= 0
    input n= 1, _ output= 1
    input n= 2, _ output= 1
         */
    }
    @Test
    public void givenNegativeNumberReturnNegativeOne(){
        Fibonacci fibonacci = new Fibonacci();
        int negativeFibonacci = fibonacci.find(-10);
        assertEquals(-1,negativeFibonacci);
    }
    @Test
    public void givenZeroReturnZero(){
        Fibonacci fibonacci = new Fibonacci();
        int zerothFibonacci = fibonacci.find(0);
        assertEquals(0, zerothFibonacci);
    }
    @Test
    public void givenOneReturnOne(){
        Fibonacci fibonacci = new Fibonacci();
        int oneFibonacci = fibonacci.find(1);
        assertEquals(1, oneFibonacci);
    }
    @Test
    public void givenTwoReturnOne(){
        Fibonacci fibonacci = new Fibonacci();
        int twoFibonacci = fibonacci.find(2);
        assertEquals(1, twoFibonacci);
    }
}
