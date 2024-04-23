package com.java.Aug_24_2023.program;

import java.util.Arrays;
import java.util.Scanner;

/**
 * create by  mohd salman
 * Date : 16/09/23
 * Time : 1:22 pm
 * Project_Name : java_core
 */

public class inverse_Recursive {
    public static void main(String[] args) {
        int N = new Scanner(System.in).nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Scanner(System.in).nextInt();
        }

        int[] br = new int[arr.length];
        inverseArray_recursive(arr, 0,br);

    }

    private static void inverseArray_recursive(int[] arr, int i ,int[] br) {

        if (i >= arr.length) {
            System.out.println(Arrays.toString(br));
            return;
        }
        br[arr[i]] = i;
        inverseArray_recursive(arr, i+1,br);

    }
}

    