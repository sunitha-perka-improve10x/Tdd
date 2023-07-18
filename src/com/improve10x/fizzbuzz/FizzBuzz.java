package com.improve10x.fizzbuzz;

public class FizzBuzz {
    public String findFizzBuzz(int n) {
        String result = "";
        if (n % 3 == 0 && n % 5 == 0) {
            result = "FizzBuzz";
            } else if (n % 3 == 0) {
            result = "Fizz";

            } else if (n % 5 == 0) {
            result = "Buzz";
        } else {
            result = Integer.toString(n);
        }
        return result;
    }
}
