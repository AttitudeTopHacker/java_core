package com.java.repeat;

import java.util.Arrays;

/**
 * create by  mohd salman
 * Date : 19/02/24
 * Time : 8:15 am
 * Project_Name : java_core
 */

public class r13 {
    public static void main(String[] args) {
        int[] ar = new int[]{4, 0, 3, 1, 2};
        System.out.println(Arrays.toString(Inv(ar, 0)));
    }

    private static int[] Inv(int[] ar, int index) {
        int[] arr = new int[ar.length];
        if (ar.length - 1 == index) {
            return arr;
        }
        int[] arr1 = Inv(ar, index + 1);
        for (int i = 0; i < arr1.length; i++) {
            arr[i] = arr1[i];

        }
        arr[ar[index + 1]] = index + 1;
        return arr;
    }

}

    