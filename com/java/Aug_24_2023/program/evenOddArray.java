package com.java.Aug_24_2023.program;
import java.util.Arrays;

/**
 * create by  mohd salman
 * Date : 05/10/23
 * Time : 12:05 pm
 * Project_Name : java_core
 */

public class evenOddArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 6, 6};
        parityFun(arr);
        System.out.println(Arrays.toString(arr));

    }

    private static void parityFun(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            if (arr[left] % 2 == 0 && arr[right] % 2 == 1) {
                swap1(left, right, arr);
                right--;
                left++;
            }
            if (arr[right] % 2 == 0) {right--;
            }
            if (arr[left] % 2 == 1) {
                left++;
            }
        }
    }

    private static void swap1(int left, int right, int[] arr) {
        int tmp = arr[left];
        arr[left] = arr[right];
        arr[right] = tmp;

    }
}

    