package com.java.repeat;


import com.java.Aug_24_2023.recursion.SwapFun;

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

        for (int i = 1; i < ar3.length; i++) {
            int j = i;
            while (j > 0 && ar3[j] < ar3[j - 1]) {
                SwapFun.swapping(ar3, j, j - 1);
                j--;
            }
        }
        System.out.println(Arrays.toString(ar3));

    }

}

    