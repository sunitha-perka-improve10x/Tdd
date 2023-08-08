package com.improve10x.sumexists;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SumExistsTest {

    @Test
    public void nothing(){
    }

    @Test
    public void givenNull_returnNo(){
        Sumexists sumexists = new Sumexists();
        String sumOfTwo = sumexists.findSumofExists(null,0);
        Assertions.assertEquals("no",sumOfTwo);
    }
}
