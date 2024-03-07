package com.java.Aug_24_2023;

import java.util.Arrays;

/**
 * create by  mohd salman
 * Date : 15/09/23
 * Time : 7:46 am
 * Project_Name : java_core
 */

public class reversal_rotation {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        int k = 43;

        int rot = k % (arr.length - 1);
        reversal_algorithm(arr, 0, (arr.length - 1));
        reversal_algorithm(arr, 0, rot - 1);
        reversal_algorithm(arr, rot, (arr.length - 1));
        System.out.println(Arrays.toString(arr));
    }


    private static void reversal_algorithm(int[] arr, int i, int j) {
        while (i < j) {
            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
            i++;
            j--;
        }

    }
}

//    [5, 6, 7, 8, 1, 2, 3, 4]