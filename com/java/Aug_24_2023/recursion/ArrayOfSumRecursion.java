package com.java.Aug_24_2023.recursion;

/**
 * create by  mohd salman
 * Date : 28/09/23
 * Time : 5:53 am
 * Project_Name : java_core
 */

public class ArrayOfSumRecursion {
    public static void main(String[] args) {
        int[] arr = {3, 5, 2};
        System.out.println(sumOfArray(arr, 0));
    }

    private static int sumOfArray(int[] arr, int idx) {
        int ans = 0;
        if (arr.length == idx) {
            return ans;
        }
        ans = arr[idx] + sumOfArray(arr, idx + 1);
        return ans;
    }
}

    