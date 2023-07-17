package com.improve10x.minutestoseconds;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class MinutesToSecondsTest {

    @Test
    public void nothing(){
    }
    @Test
    public void minutesToSeconds(){
        MinutesToSeconds minutesToSeconds = new MinutesToSeconds();
        int minutes = minutesToSeconds.minutesSeconds(300);
        assertEquals(18000,minutes);
    }

    @Test
    public void givenOneEighty(){
        MinutesToSeconds minutesToSeconds = new MinutesToSeconds();
        int minutes = minutesToSeconds.minutesSeconds(180);
        assertEquals(10800,minutes);
    }

    @Test
    public void givenOneTwenty(){
        MinutesToSeconds minutesToSeconds = new MinutesToSeconds();
        int minutes = minutesToSeconds.minutesSeconds(120);
        assertEquals(7200,minutes);
    }

    @Test
    public void givenFiveForty(){
        MinutesToSeconds minutesToSeconds = new MinutesToSeconds();
        int minutes = minutesToSeconds.minutesSeconds(540);
        assertEquals(32400,minutes);
    }

}
