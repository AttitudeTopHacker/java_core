package com.java.Aug_24_2023;

/**
 * create by  mohd salman
 * Date : 15/09/23
 * Time : 9:08 pm
 * Project_Name : java_core
 */

public class Maximum_SubArray_Sum {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(subarray(arr));
    }

    private static int subarray(int[] arr) {
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length - 1; i++) {
            int sum = 0;
            for (int j = i; j < arr.length - 1; j++) {
                sum += arr[j];
                if (sum > ans)
                    ans = sum;
            }
        }
        return ans;
    }
}

    