package com.java.repeat;

import java.util.Arrays;

/**
 * create by  mohd salman
 * Date : 04/02/24
 * Time : 11:24 pm
 * Project_Name : java_core
 */

public class r2 {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 2, 8, 6, 1, 5};
        System.out.println(Arrays.toString(arr));
        int min, j;
        for (int i = 0; i < arr.length; i++) {
            min = i;
            for (j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;

        }
        System.out.println(Arrays.toString(arr));
    }

}

    