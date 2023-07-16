package com.improve10x.lessthan100;

public class LessThanHundred {
    public boolean lessThanHundred(int a, int b) {
        boolean result = false;
        if (a+b < 100){
            result = true;
        }
        return result;
    }
}
