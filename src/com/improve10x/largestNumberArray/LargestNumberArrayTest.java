package com.improve10x.largestNumberArray;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LargestNumberArrayTest {
    @Test
    public void nothing(){
    }

    @Test
    public void givenZero_returnZero(){
    LargestNumber largestNumber = new LargestNumber();
    int zero = largestNumber.findLargestNumber(new int[]{0});
        Assertions.assertEquals(0,zero);
    }


}
