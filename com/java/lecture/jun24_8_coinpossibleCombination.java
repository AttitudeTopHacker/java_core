package com.java.lecture;

public class jun24_8_coinpossibleCombination {
    public static void main(String[] args) {
        int [] arr = {2,3,5};
        PossiblecCoinCombiantion(arr,10,0,"" ,0);


    }

    private static void PossiblecCoinCombiantion(int[] arr, int n, int sum, String ans, int index) {
        if(n == sum) {
            System.out.println(ans);
            return;
        }
        if (n<sum){
            return;
        }
        for(int i =index;i<arr.length;i++) {

             PossiblecCoinCombiantion(arr,n,sum+arr[i],ans+arr[i],i);
        }

    }
}
