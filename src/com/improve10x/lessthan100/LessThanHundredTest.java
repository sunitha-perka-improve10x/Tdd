package com.improve10x.lessthan100;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class LessThanHundredTest {

    @Test
    public void nothing() {

    }

    @Test
    public void negativeNumber() {
        LessThanHundred lessThanHundred = new LessThanHundred();
        boolean negativeNumber = lessThanHundred.lessThanHundred(-99, 0);
        assertEquals(true, negativeNumber);
    }

    @Test
    public void givenPositiveNumber() {
        LessThanHundred lessThanHundred = new LessThanHundred();
        boolean positiveNumber = lessThanHundred.lessThanHundred(100, 20);
        assertEquals(false, positiveNumber);

    }

    @Test
    public void lessThanHundred() {
        LessThanHundred lessThanHundred = new LessThanHundred();
        boolean isLessThanHundred = lessThanHundred.lessThanHundred(25, 10);
        assertEquals(true, isLessThanHundred);

    }

    @Test
    public void moreThanHundred() {
        LessThanHundred lessThanHundred = new LessThanHundred();
        boolean isMoreThanHundred = lessThanHundred.lessThanHundred(250, 25);
        assertEquals(false, isMoreThanHundred);
    }

}