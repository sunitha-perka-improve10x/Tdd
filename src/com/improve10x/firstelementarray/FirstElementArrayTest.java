package com.improve10x.firstelementarray;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class FirstElementArrayTest {

    @Test
    public void nothing(){

    }
    @Test
    public void givenZeros_returnZero(){
        FirstElement firstElement = new FirstElement();
        int zero = firstElement.FindFirstElement(new int[]{0, 0, 0});
        assertEquals(0, zero);
    }
    @Test
    public void givenMinusOne_returnMinusOne(){
        FirstElement firstElement = new FirstElement();
        int minusOne = firstElement.FindFirstElement(new int[]{-1, -1});
        assertEquals(-1,minusOne);
    }
    @Test
    public void givenOne_returnOne(){
        FirstElement firstElement = new FirstElement();
        int one = firstElement.FindFirstElement(new int[]{1, 1});
        assertEquals(1, one);
    }
    @Test
    public void givenOneTwoThree_returnOne(){
        FirstElement firstElement = new FirstElement();
        int oneTwoThree = firstElement.FindFirstElement(new int[]{1, 2, 3});
        assertEquals(1, oneTwoThree);
    }

}

