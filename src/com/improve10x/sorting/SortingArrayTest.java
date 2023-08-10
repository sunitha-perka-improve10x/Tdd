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
        int zero = sortingArray.findSortingArray(null);
        assertEquals(0, zero);
    }

    @Test
    public void givenEmpty_returnZero(){
        SortingArray sortingArray = new SortingArray();
        int zero = sortingArray.findSortingArray(new int[]{});
        assertEquals(0, zero);
    }

}
