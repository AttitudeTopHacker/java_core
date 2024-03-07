package com.java.Feb_6_2024;

import java.util.Arrays;

/**
 * create by  mohd salman
 * Date : 09/02/24
 * Time : 8:09 pm
 * Project_Name : java_core
 */

public class allIndexes {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 3, 4, 5, 3, 2, 6, 7, 8};
        System.out.println(Arrays.toString(AllIndex(arr, 3, 0, 0)));
    }

    private static int[] AllIndex(int[] arr, int data, int indx, int counter) {

        if (arr.length == indx) {
            return new int[counter];
        }
        if (data == arr[indx]) {
            counter++;
        }
        int[] al = AllIndex(arr, data, indx + 1, counter);
        if (data == arr[indx]) {
            al[counter - 1] = indx;
        }
        return al;
    }


}

    