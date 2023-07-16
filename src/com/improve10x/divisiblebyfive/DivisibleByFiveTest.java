package com.improve10x.divisiblebyfive;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class DivisibleByFiveTest {
    private Divisible divisible;

    @Test
    public  void setUp(){
        Divisible divisible = new Divisible();

    }

    @Test
    public void nothing(){

    }

    @Test
    public void givenNegativeNumberFive_returnZero(){
        boolean negativeDivisible = divisible.isDivisibleByFive(-5);
        assertEquals(true, negativeDivisible);

    }
    @Test
    public void given25_returnZero(){
        boolean twentyFiveDivisible = divisible.isDivisibleByFive(25);
        assertEquals(true, twentyFiveDivisible);
    }
    @Test
    public void given47_returnTwo(){
        boolean fortySeventhDivisible = divisible.isDivisibleByFive(47);
        assertEquals(false, fortySeventhDivisible);
    }
    @Test
    public void given9_returnFour(){
        boolean ninthDivisible = divisible.isDivisibleByFive(9);
        assertEquals(false, ninthDivisible);
    }
}
