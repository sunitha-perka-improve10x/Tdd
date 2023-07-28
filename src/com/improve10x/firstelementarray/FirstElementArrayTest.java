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
}
