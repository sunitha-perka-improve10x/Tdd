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
    @Test
    public void givenZero_returnOne(){
        SortingArray sortingArray = new SortingArray();
        int zero = sortingArray.findSortingArray(new int[]{0});
        assertEquals(0, zero);
    }
    @Test
    public void givenOne_returnOne() {
        SortingArray sortingArray = new SortingArray();
        int zero = sortingArray.findSortingArray(new int[]{1});
        assertEquals(1, zero);
    }
    @Test
    public void givenOneTwo_returnOne() {
        SortingArray sortingArray = new SortingArray();
        int zero = sortingArray.findSortingArray(new int[]{1, 2});
        assertEquals(1, zero);
    }
}