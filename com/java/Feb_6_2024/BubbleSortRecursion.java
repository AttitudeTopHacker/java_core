package com.java.Feb_6_2024;

import java.util.Arrays;

/**
 * create by  mohd salman
 * Date : 10/02/24
 * Time : 6:24 pm
 * Project_Name : java_core
 */

public class BubbleSortRecursion {
    public static void main(String[] args) {
        int[] array = new int[]{3, 2, 7, 1, 8};
        BubbleSortRecursionFunction(array, 0);
        System.out.println(Arrays.toString(array));
    }

    private static void BubbleSortRecursionFunction(int[] array, int indx) {
        if (array.length == indx) {
            return;
        }
        for (int i = 0; i < array.length - 1 - indx; i++) {
            if (array[i] > array[i + 1]) {
                int temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
            }
        }
        BubbleSortRecursionFunction(array, indx + 1);
    }
}

    