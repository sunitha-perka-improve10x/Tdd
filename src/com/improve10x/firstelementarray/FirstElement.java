package com.improve10x.firstelementarray;

public class FirstElement {

    public int FindFirstElement(int[] numbers) {
        if (numbers.length<1){
            return 0;
        }
        return numbers[0];

    }
}
