package com.improve10x.encryption;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class EncryptionTest {

    @Test
    public void nothing(){

    }

    @Test
    public void givenNUll_returnAca(){
        Encryption encryption = new Encryption();
        String returnAca = encryption.encrypt(null);
        assertEquals("aca", returnAca);
    }

    @Test
    public void givenEmpty_returnAca(){
        Encryption encryption = new Encryption();
        String returnAca = encryption.encrypt("");
        assertEquals("aca", returnAca);
    }

    @Test
    public void givenB_returnBAca(){
        Encryption encryption = new Encryption();
        String returnAca = encryption.encrypt("b");
        assertEquals("baca", returnAca);
    }

    @Test
    public void givenZ_returnZAca(){
        Encryption encryption = new Encryption();
        String returnAca = encryption.encrypt("z");
        assertEquals("zaca", returnAca);
    }

    @Test
    public void givenA_return0Aca(){
        Encryption encryption = new Encryption();
        String returnAca = encryption.encrypt("a");
        assertEquals("0aca", returnAca);
    }

    @Test
    public void givenE_return1Aca(){
        Encryption encryption = new Encryption();
        String returnAca = encryption.encrypt("E");
        assertEquals("1aca", returnAca);
    }

    @Test
    public void givenI_return2Aca(){
        Encryption encryption = new Encryption();
        String returnAca = encryption.encrypt("i");
        assertEquals("2aca", returnAca);
    }

    @Test
    public void givenO_return3Aca(){
        Encryption encryption = new Encryption();
        String returnAca = encryption.encrypt("O");
        assertEquals("3aca", returnAca);
    }

    @Test
    public void givenU_return4Aca(){
        Encryption encryption = new Encryption();
        String returnAca = encryption.encrypt("u");
        assertEquals("4aca", returnAca);
    }
    @Test
    public void givenBc_returncbAca(){
        Encryption encryption = new Encryption();
        String returnAca = encryption.encrypt("bc");
        assertEquals("cbaca", returnAca);
    }

    @Test
    public void givenBa_return0Baca(){
        Encryption encryption = new Encryption();
        String returnAca = encryption.encrypt("Ba");
        assertEquals("0Baca", returnAca);
    }

    @Test
    public void givenaa_return00Aca(){
        Encryption encryption = new Encryption();
        String returnAca = encryption.encrypt("aa");
        assertEquals("00aca", returnAca);
    }

    @Test
    public void givensunitha_return0ht2n4saca(){
        Encryption encryption = new Encryption();
        String returnAca = encryption.encrypt("sunitha");
        assertEquals("0ht2n4saca", returnAca);
    }

    @Test
    public void givenanupama_return0m0p4n0aca(){
        Encryption encryption = new Encryption();
        String returnAca = encryption.encrypt("anupama");
        assertEquals("0m0p4n0aca", returnAca);
    }

    @Test
    public void givenAeiou_return43210aca(){
        Encryption encryption = new Encryption();
        String returnAca = encryption.encrypt("aeiou");
        assertEquals("43210aca", returnAca);
    }
}
