package com.improve10x.largestNumberArray;

public class LargestNumber {
    public int findLargestNumber(int[] arr) {
        int largestNum = 0;
        for(int i=0; i<arr.length; i++){
            if (arr[i] > largestNum)
            largestNum = arr [i];
        }
        return largestNum;
    }
}

