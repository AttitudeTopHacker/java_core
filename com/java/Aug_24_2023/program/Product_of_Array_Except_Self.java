package com.java.Aug_24_2023.program;

import java.util.Arrays;

/**
 * create by  mohd salman
 * Date : 15/09/23
 * Time : 1:09 pm
 * Project_Name : java_core
 */

public class Product_of_Array_Except_Self {
    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 2};
        int n = arr.length;
        int[] left = new int[n];
        int[] right = new int[n];
        left[0] = 1;
        right[n - 1] = 1;
        for (int i = 1; i < n; i++) {
            left[i] = left[i - 1] * arr[i - 1];
        }
        for (int i = n - 2; i >= 0; i--) {
            right[i] = right[i + 1] * arr[i + 1];
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = left[i] * right[i];
        }
        System.out.println(Arrays.toString(left));
        System.out.println(Arrays.toString(right));
        for (int j : arr) {
            System.out.println(j);
        }

    }
}

    