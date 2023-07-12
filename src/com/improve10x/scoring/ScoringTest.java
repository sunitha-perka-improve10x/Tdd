package com.improve10x.scoring;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertArrayEquals;

public class ScoringTest {
    @Test
    public void nothing(){

    }
    @Test
    public void givenNull_returnAllZeros(){
        Scoring scoring = new Scoring();
        int[] allZeros = scoring.calculatingScores(null);
        assertArrayEquals(new int[3],allZeros);
    }
    @Test
    public void givenEmpty_returnAllZeros(){
        Scoring scoring = new Scoring();
        int[] allZeros = scoring.calculatingScores(" ");
        assertArrayEquals(new int[3],allZeros);
    }
    @Test
    public void givenA_returnOneZeroZero(){
        Scoring scoring = new Scoring();
        int[] onlyAScores = scoring.calculatingScores("A");
        assertArrayEquals(new int[]{1, 0, 0}, onlyAScores);
    }
    @Test
    public void givenB_returnZeroOneZero() {
        Scoring scoring = new Scoring();
        int[] onlyBScores = scoring.calculatingScores("B");
        assertArrayEquals(new int[]{0, 1, 0}, onlyBScores);
    }
    @Test
    public void givenC_returnZeroZeroOne() {
        Scoring scoring = new Scoring();
        int[] onlyCScores = scoring.calculatingScores("C");
        assertArrayEquals(new int[]{0, 0, 1}, onlyCScores);
    }
    @Test
    public void givenAB_returnOneOneZero() {
        Scoring scoring = new Scoring();
        int[] abScores = scoring.calculatingScores("AB");
        assertArrayEquals(new int[]{1, 1, 0}, abScores);
    }
    @Test
    public void givenABC_returnOneOneOne() {
        Scoring scoring = new Scoring();
        int[] abcScores = scoring.calculatingScores("ABC");
        assertArrayEquals(new int[]{1, 1, 1}, abcScores);
    }
    @Test
    public void givenAABC_returnTwoOneOne() {
        Scoring scoring = new Scoring();
        int[] aabcScores = scoring.calculatingScores("AABC");
        assertArrayEquals(new int[]{2, 1, 1}, aabcScores);
    }
    @Test
    public void givenABBC_returnOneTwoOne() {
        Scoring scoring = new Scoring();
        int[] abbcScores = scoring.calculatingScores("ABBC");
        assertArrayEquals(new int[]{1, 2, 1}, abbcScores);
    }
    @Test
    public void givenABBACCCCAC_returnThreeTwoFive() {
        Scoring scoring = new Scoring();
        int[] abbaccccac = scoring.calculatingScores("ABBACCCCAC");
        assertArrayEquals(new int[]{3, 2, 5}, abbaccccac);
    }



}
