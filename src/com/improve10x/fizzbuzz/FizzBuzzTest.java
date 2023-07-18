package com.improve10x.fizzbuzz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @Test
    public void nothing() {
    }

    @Test
    public void givenFive_returnBuzz(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String five = fizzBuzz.findFizzBuzz(5);
        assertEquals("Buzz",five);
    }
    @Test
    public void givenThree_returnFizz(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String Three = fizzBuzz.findFizzBuzz(3);
        assertEquals("Fizz",Three);

    }
}
