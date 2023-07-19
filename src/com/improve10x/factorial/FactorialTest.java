package com.improve10x.factorial;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorialTest {

    @Test
    public void nothing(){

    }
    @Test
    public void givenNegativeNumber_returnNegativeNumber(){
        Factorial factorial = new Factorial();
        long factorialNumber = factorial.findFactorial(-1);
        assertEquals(-1, factorialNumber);
    }

    @Test
    public void givenZero_returnOne(){
        Factorial factorial = new Factorial();
        long factorialNumber = factorial.findFactorial(0);
        assertEquals(1, factorialNumber);
    }

    @Test
    public void given4_returnTwentyFour(){
        Factorial factorial = new Factorial();
        long factorialNumber = factorial.findFactorial(4);
        assertEquals(24, factorialNumber);
    }

    @Test
    public void givenFive_returnOneTwenty(){
        Factorial factorial = new Factorial();
        long factorialNumber = factorial.findFactorial(5);
        assertEquals(120, factorialNumber);
    }
}
