package com.improve10x.fizzbuzz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @Test
    public void nothing() {
    }

    @Test
    public void givenFive_returnBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String five = fizzBuzz.findFizzBuzz(5);
        assertEquals("Buzz", five);
    }

    @Test
    public void givenThree_returnFizz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String Three = fizzBuzz.findFizzBuzz(3);
        assertEquals("Fizz", Three);
    }

    @Test
    public void givenFive_returnB() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String NegativeFive = fizzBuzz.findFizzBuzz(-5);
        assertEquals("Buzz", NegativeFive);
    }

    @Test
    public void givenZero_returnEmpty() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String zero = fizzBuzz.findFizzBuzz(0);
        assertEquals("", zero);
    }

    @Test
    public void givenMinusTen_returnMinusTen() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String ten = fizzBuzz.findFizzBuzz(0);
        assertEquals("", ten);
    }

    @Test
    public void givenFifteen_returnFizzBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String fifteen = fizzBuzz.findFizzBuzz(15);
        assertEquals("FizzBuzz", fifteen);
    }
}
