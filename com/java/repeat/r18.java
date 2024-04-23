package com.java.repeat;

import com.java.Aug_24_2023.recursion.SwapFun;

import java.util.Arrays;

/**
 * create by  mohd salman
 * Date : 20/02/24
 * Time : 7:15 am
 * Project_Name : java_core
 */

public class r18 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 2};
        int k = arr.length - 2;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] < arr[i - 1]) {
                k--;
            } else {
                break;
            }
        }
        if (k == -1) {
            ReverseArray(arr, 0, arr.length-1);
            return;
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[k] <= arr[i]) {
                SwapFun.swapping(arr, k, i);
                ReverseArray(arr, k+1, arr.length-1);
                break;
            }
        }



    }

    private static void ReverseArray(int[] arr, int start, int end) {

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}

//
//    [1,3,2]
//     k =1
//     k =2
//    [2,1,3]

//r18
//[1, 2, 3]