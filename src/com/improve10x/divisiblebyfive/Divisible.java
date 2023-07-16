package com.improve10x.divisiblebyfive;

public class Divisible {
    public boolean isDivisibleByFive(int n) {
        boolean result = false;
        if (n % 5 == 0) {
            result = true;
        }
        return  result;
    }

}
