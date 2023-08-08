package com.improve10x.secondsmallestanarray;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class SecondSmallestAnArrayTest {

    @Test
    public void nothing(){

    }

    @Test
    public void givenNull_returnZero(){
     SecondSmallestNumber secondSmallestNumber = new SecondSmallestNumber();
     int smallestNumber = secondSmallestNumber.findSecondSmallestNumber(null);
        assertEquals(0, smallestNumber);
    }
    @Test
    public void giveOneTwoFour_returnTwo(){
        SecondSmallestNumber secondSmallestNumber = new SecondSmallestNumber();
        int smallestNumber = secondSmallestNumber.findSecondSmallestNumber(new int[]{1, 2, 4});
        assertEquals(2,smallestNumber);
    }
    @Test
    public void givenNegativeNumber_returnMinusThree() {
        SecondSmallestNumber secondSmallestNumber = new SecondSmallestNumber();
        int smallestNumber = secondSmallestNumber.findSecondSmallestNumber(new int[]{-1, -2, -3, -4});
        assertEquals(-2, smallestNumber);
    }

}
