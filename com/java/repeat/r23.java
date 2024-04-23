package com.java.repeat;

import com.java.Aug_24_2023.recursion.SwapFun;

import java.util.Arrays;

/**
 * create by  mohd salman
 * Date : 21/02/24
 * Time : 1:27 pm
 * Project_Name : java_core
 */

public class r23 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        int k = 43;
        int n = arr.length;
        k = k % n;
        ReversalOder(arr, 0, n - 1);
        ReversalOder(arr, 0, k-1);
        ReversalOder(arr, k, n - 1);
        System.out.println(Arrays.toString(arr));
    }
    private static void ReversalOder(int[] arr, int start, int last) {
        while (start < last) {
            SwapFun.swapping(arr, start, last);
            start++;
            last--;
            
        }

    }


}

    