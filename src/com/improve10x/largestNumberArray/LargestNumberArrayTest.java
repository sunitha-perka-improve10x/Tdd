package com.improve10x.largestNumberArray;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class LargestNumberArrayTest {
    @Test
    public void nothing(){
    }

    @Test
    public void givenZero_returnZero(){
    LargestNumber largestNumber = new LargestNumber();
    int zero = largestNumber.findLargestNumber(new int[]{0});
        assertEquals(0,zero);
    }
    @Test
    public void givenEmpty_returnZero(){
        LargestNumber largestNumber = new LargestNumber();
        int empty = largestNumber.findLargestNumber(new int[]{});
        assertEquals(0, empty);
    }
    @Test
    public void givenNull_returnZero(){
        LargestNumber largestNumber = new LargestNumber();
        int nullValue= largestNumber.findLargestNumber(null);
        assertEquals(0, nullValue);
    }
}
