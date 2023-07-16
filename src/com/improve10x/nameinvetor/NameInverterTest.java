package com.improve10x.nameinvetor;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class NameInverterTest {
    private NameInverter nameInverter;

    @BeforeEach
    public void setup(){
        nameInverter = new NameInverter();
    }

    @Test
    public void nothing(){
    }

    //input - " " output - " "
    @Test
    public void givenEmpty_returnEmpty(){
        String inverterName= nameInverter.invertName("");
        assertEquals("",inverterName);
    }

    @Test
    public void givenSingleWord_returnSingleWord(){
        String inverterName  = nameInverter.invertName("name");
        assertEquals("name",inverterName);
    }

    @Test
    public void givenSingleWordWithTrailingSpaces_returnSingleWord(){
        String inverterName  = nameInverter.invertName("name  ");
        assertEquals("name",inverterName);
    }

    @Test
    public void givenSingleWordWithBeginningSpaces_returnSingleWord(){
        String inverterName  = nameInverter.invertName(" name  ");
        assertEquals("name",inverterName);
    }

    @Test
    public void givenFirstLast_returnInverterName(){
        String inverterName = nameInverter.invertName("first last");
        assertEquals("last, first",inverterName);
    }

    @Test
    public void givenHonorifics_ignoreHonorifics(){
        String inverterName = nameInverter.invertName("Mrs. first last");
        assertEquals("last, first", inverterName);
    }

    @Test
    public void givenMrHonorifics_ignoreHonorifics(){
        String inverterName = nameInverter.invertName("Mr. first last");
        assertEquals("last, first", inverterName);
    }

    @Test
    public void givenMultiPostNominals_stayAtEnd(){
        String inverterName = nameInverter.invertName("first last.Msc");
        assertEquals("last, first, Msc.", inverterName);
    }
}
