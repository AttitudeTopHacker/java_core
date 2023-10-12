package com.java.Aug_24_2023.recursion;

import java.util.Arrays;

/**
 * create by  mohd salman
 * Date : 29/09/23
 * Time : 8:01 am
 * Project_Name : java_core
 */

public class FindAllIndex {
    public static void main(String[] args) {
//                            0  1  2  3  4  5  6  7  8  9  10 11 12 13 14 15
        int[] arr = new int[]{3, 3, 3, 5, 3, 2, 6, 3, 2, 2, 2, 6, 7, 6, 6, 6};
        showIndex(arr, 6, 0);
        int[] arr1 = ReturnIndexes(arr, 6, 0);
        System.out.println(Arrays.toString(arr1));
    }

    private static int[] ReturnIndexes(int[] arr, int input, int index) {
        int[] arr1 = new int[arr.length];
        if (arr[index] == input) {
//
        }
        return arr1;

    }

    private static void showIndex(int[] arr, int input, int indx) {
        if (arr.length == indx) {
            return;
        }
        if (arr[indx] == input) {
            System.out.print(indx + " ");
        }
        showIndex(arr, input, indx + 1);
    }
}

    