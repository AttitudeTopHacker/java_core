package com.java.Aug_24_2023.recursion;

/**
 * create by  mohd salman
 * Date : 11/10/23
 * Time : 7:11 pm
 * Project_Name : java_core
 */

public class SwapFun {

    public static void swapping(int[] arr, int first, int second) {
        int tmp = arr[first];
        arr[first] = arr[second];
        arr[second] = tmp;
    }
}

    