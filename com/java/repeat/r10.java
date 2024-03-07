package com.java.repeat;

import com.java.Aug_24_2023.recursion.SwapFun;

import java.util.Arrays;

/**
 * create by  mohd salman
 * Date : 15/02/24
 * Time : 12:39 pm
 * Project_Name : java_core
 */

public class r10 {
    public static void main(String[] args) {
        int[] array = new int[]{2, 5, 1, 7, 3};
        for (int i = 1; i < array.length; i++) {
            int j = i;
            while (j > 0 && array[j] > array[j - 1]) {
                SwapFun.swapping(array, j, j - 1);
                j--;
            }
        }
        System.out.println(Arrays.toString(array));
    }

}

    