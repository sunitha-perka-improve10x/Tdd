package com.improve10x.sorting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class SortingArrayTest {

    @Test
    public void nothing(){
    }

    @Test
    public void givenNull_returnZero(){
        SortingArray sortingArray = new SortingArray();
        int zero = sortingArray.findSortingArray(null,1);
        assertEquals(0, zero);

    }
}
