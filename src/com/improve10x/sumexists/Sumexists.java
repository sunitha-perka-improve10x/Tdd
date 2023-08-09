package com.improve10x.sumexists;

public class Sumexists {

    public String findSumofExists(int[] arr, int sum) {
        if (arr == null || arr.length <=1) {
            return "no";
        }
        for(int i = 0; i<arr.length; i++ ){
            for (int n=i; n<arr.length; n++){
                if(arr[i] + arr[n] == sum){
                    return "Yes";
                }
            }

        }

        return "No";
    }
}
