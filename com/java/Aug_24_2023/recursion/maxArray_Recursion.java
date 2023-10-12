package com.java.Aug_24_2023.recursion;

/**
 * create by  mohd salman
 * Date : 29/09/23
 * Time : 6:35 am
 * Project_Name : java_core
 */

public class maxArray_Recursion {
    public static void main(String[] args) {

        System.out.println(MaxArrRecursion(new int[]{3, 2, 6, 9, 11, 20, 4, 8, 7}, 0));
    }

    private static int MaxArrRecursion(int[] arr, int indx) {

        if (arr.length == indx) {
            return 0;
        }
        return Math.max(arr[indx], MaxArrRecursion(arr, indx + 1));
    }
}

    