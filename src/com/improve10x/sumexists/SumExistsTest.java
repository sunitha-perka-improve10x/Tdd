package com.improve10x.sumexists;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class SumExistsTest {

    @Test
    public void nothing(){
    }

    @Test
    public void givenNull_returnNo(){
        Sumexists sumexists = new Sumexists();
        String sumOfTwo = sumexists.findSumofExists(null,0);
        assertEquals("no",sumOfTwo);
    }

    @Test
    public void givenEmpty_returnNo(){
        Sumexists sumexists = new Sumexists();
        String sumOfTwo = sumexists.findSumofExists(new int[]{},0);
        assertEquals("no",sumOfTwo);
    }

    @Test
    public void givenOneElement_returnNo(){
        Sumexists sumexists = new Sumexists();
        String sumOfTwo = sumexists.findSumofExists(new int[]{0},0);
        assertEquals("no",sumOfTwo);
    }

    @Test
    public void givenZeroOne_returnYes(){
        Sumexists sumexists = new Sumexists();
        String sumOfTwo = sumexists.findSumofExists(new int[]{0, 1},1);
        assertEquals("Yes",sumOfTwo);
    }

    @Test
    public void givenNegative_returnYes(){
        Sumexists sumexists = new Sumexists();
        String sumOfTwo = sumexists.findSumofExists(new int[]{-1, -1},-2);
        assertEquals("Yes",sumOfTwo);
    }

    @Test
    public void givenOneOne_returnYes(){
        Sumexists sumexists = new Sumexists();
        String sumOfTwo = sumexists.findSumofExists(new int[]{1, 1},2);
        assertEquals("Yes",sumOfTwo);
    }

    @Test
    public void givenNegative_returnNo(){
        Sumexists sumexists = new Sumexists();
        String sumOfTwo = sumexists.findSumofExists(new int[]{-1, -1, -3, -5},-10);
        assertEquals("No",sumOfTwo);
    }

    @Test
    public void givenOneOneTwoThree_returnYes(){
        Sumexists sumexists = new Sumexists();
        String sumOfTwo = sumexists.findSumofExists(new int[]{1, 1, 2, 3},5);
        assertEquals("Yes",sumOfTwo);
    }


    @Test
    public void given265811_returnYes(){
        Sumexists sumexists = new Sumexists();
        String sumOfTwo = sumexists.findSumofExists(new int[]{2, 6, 5, 8, 11},14);
        assertEquals("Yes",sumOfTwo);
    }

    @Test
    public void given26589_returnNo(){
        Sumexists sumexists = new Sumexists();
        String sumOfTwo = sumexists.findSumofExists(new int[]{2, 6, 5, 8, 9},9);
        assertEquals("No",sumOfTwo);
    }




}
