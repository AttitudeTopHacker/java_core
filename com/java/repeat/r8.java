package com.java.repeat;

import com.java.Aug_24_2023.recursion.SwapFun;

import java.util.Arrays;

/**
 * create by  mohd salman
 * Date : 14/02/24
 * Time : 11:27 pm
 * Project_Name : java_core
 */

public class r8 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 4, 5, 2, 3, 6, 9, 8};
        int l = 0, r = arr.length - 1;
        System.out.println(Arrays.toString(arr));
        while (l < r) {
            if (arr[l] % 2 == 0 && arr[r] % 2 == 1) {
                SwapFun.swapping(arr, l, r);
                l++;
                r--;
            } else if (arr[l] % 2 == 1 && arr[r] % 2 == 1) {
                l++;
            } else {
                r--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

    