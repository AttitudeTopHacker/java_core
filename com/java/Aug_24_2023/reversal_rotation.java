package com.java.Aug_24_2023;

/**
 * create by  mohd salman
 * Date : 15/09/23
 * Time : 7:46 am
 * Project_Name : java_core
 */

public class reversal_rotation {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 5;

        int rot = k % (arr.length - 1);
        reversal_algorithm(arr, 0, (arr.length - 1));
        reversal_algorithm(arr, 0, rot - 1);
        reversal_algorithm(arr, rot, (arr.length - 1));
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
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

    