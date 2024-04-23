package com.java.Aug_24_2023.program;

import java.util.Arrays;

/**
 * create by  mohd salman
 * Date : 08/10/23
 * Time : 10:19 pm
 * Project_Name : java_core
 */

public class inverse_recursion {
    public static void main(String[] args) {
        int[] arr = new int[]{4, 0, 3, 1, 2};
        System.out.println(Arrays.toString(arr));
        int[] inver = Inversing(arr, 0);
        System.out.println(Arrays.toString(inver));
    }


    private static int[] Inversing(int[] arr, int indx) {
        int[] arr1 = new int[arr.length];
        if (arr.length-1 == indx) {
            return arr1;
        }
        int[] arr2 = Inversing(arr, indx + 1);
        for (int i = 0; i < arr2.length; i++) {
            arr1[i] = arr2[i];
        }
        arr1[arr[indx+1]] = indx+1;
        return arr1;
    }
}

    