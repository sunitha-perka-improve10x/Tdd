package com.improve10x.secondsmallestanarray;

public class SecondSmallestNumber {
    public int findSecondSmallestNumber(int[] arr) {
        int smallestNumber = 0;
        if (arr == null){
            smallestNumber = 0;
        }else {
            for (int i=0; i<arr.length; i++){
                for (int j=i+1; j<arr.length-i; j++){
                   if (arr[i]>arr[j]){
                       int temp = arr[i];
                       arr[i] = arr[j];
                       arr[j]= temp;
                   }
                }
            }
            smallestNumber = arr[1];
        }
    return smallestNumber;
    }

}
