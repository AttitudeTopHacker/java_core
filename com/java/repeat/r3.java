package com.java.repeat;


import java.util.Arrays;

/**
 * create by  mohd salman
 * Date : 05/02/24
 * Time : 12:37 am
 * Project_Name : java_core
 */

public class r3 {
    public static void main(String[] args) {
        int[] ar3 = new int[]{3, 6, 1, 9, 4};
        System.out.println(Arrays.toString(ar3));
        int j;
        for (int i = 1; i < ar3.length; i++) {
            j = i;
            while (j > 0 && ar3[j] > ar3[j - 1]) {
                int temp = ar3[j];
                ar3[j] = ar3[j - 1];
                ar3[j - 1] = temp;
                j--;
            }
        }
        System.out.println(Arrays.toString(ar3));

    }

}

    