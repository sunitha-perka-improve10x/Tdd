package com.improve10x.palindrome;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PalindromeTest {

        @Test
        public void givenA_returnA() {
            Palindrome palindrome = new Palindrome();
            boolean palindromeA = palindrome.findPalindrome("a");
            assertEquals(true, palindromeA);
        }

        @Test
        public void givenAb_returnbA() {
            Palindrome palindrome = new Palindrome();
            boolean palindromeAb = palindrome.findPalindrome("ab");
            assertEquals(false, palindromeAb);
        }

        @Test
        public void givenDad_returnDad() {
            Palindrome palindrome = new Palindrome();
            boolean palindromeDad = palindrome.findPalindrome("dad");
            assertEquals(true, palindromeDad);
        }

        @Test
        public void givenNull_returnFalse() {
            Palindrome palindrome = new Palindrome();
            boolean palindromeNull = palindrome.findPalindrome("null");
            assertEquals(false, palindromeNull);
        }

        @Test
        public void givenEmpty_returnTrue() {
            Palindrome palindrome = new Palindrome();
            boolean palindromeEmpty = palindrome.findPalindrome("");
            assertEquals(true, palindromeEmpty);
        }
    }

