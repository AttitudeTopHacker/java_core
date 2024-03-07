package com.java.repeat;

import java.util.Arrays;

/**
 * create by  mohd salman
 * Date : 02/02/24
 * Time : 10:57 pm
 * Project_Name : java_core
 */

public class r1 {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 2, 7, 1, 8};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;


                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}

    