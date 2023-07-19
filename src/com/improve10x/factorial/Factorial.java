package com.improve10x.factorial;

public class Factorial {
    public long findFactorial(int num) {
        long factorial = 1;
        if (num < 0){
            return  -1;
        } else if (num > 0) {
            for(int i = 1; i <=num; i++){
                factorial = factorial * i;
            }
        }
        return factorial;
    }
}
