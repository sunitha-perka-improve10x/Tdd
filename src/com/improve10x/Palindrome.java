package com.improve10x;

public class Palindrome {
    public boolean findPalindrome(String name) {
        String reverse = "";
        for (int i = name.length()-1; i >=0; i--){
            reverse += name.charAt(i);
        }
        if (name == null){
            return false;
        } else if (name == "") {
            return true;
        } else if (name.equals(reverse)) {
            return true;
        }
        return false;
    }
}
