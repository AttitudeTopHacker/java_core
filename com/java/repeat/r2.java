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
        int i = 0, j, minIndex;
        while (i < arr.length) {
            minIndex = i;
            j = i + 1;
            while (j < arr.length) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }

                j++;
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
            i++;
        }
        System.out.println(Arrays.toString(arr));
    }

}

    