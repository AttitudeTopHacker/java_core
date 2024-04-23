package com.java.Aug_24_2023.recursion;


import com.java.Aug_24_2023.program.NewArray;

import java.util.Arrays;

/**
 * create by  mohd salman
 * Date : 29/09/23
 * Time : 8:45 am
 * Project_Name : java_core
 */

public class RecursionInverseArray {
    public static void main(String[] args) {
        int[] arr = NewArray.getSereisArray();
        System.out.println(Arrays.toString(arr));
        int[] br = Invers(arr, 0);
        System.out.println(Arrays.toString(br));
    }

    private static int[] Invers(int[] arr, int idx) {
//        [3, 2, 5, 1, 4, 0]
        int[] arr1 = new int[arr.length];

        if (arr.length == idx) {
            arr1[arr[0]] = 0;
            return arr1;
        }

        int[] arr3 = Invers(arr, idx + 1);
        System.arraycopy(arr3, 0, arr1, 0, arr3.length);
        arr1[arr[idx]] = idx;
        return arr1;
    }
}

    