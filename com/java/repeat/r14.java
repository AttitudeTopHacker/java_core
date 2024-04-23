package com.java.repeat;

/**
 * create by  mohd salman
 * Date : 19/02/24
 * Time : 1:11 pm
 * Project_Name : java_core
 */

public class r14 {
    public static void main(String[] args) {
        int[] arr = {-8, 8, -9, 9, -10, 11, -12};
        System.out.println(TheSubMaxValue(arr));
    }

    private static int TheSubMaxValue(int[] arr) {
        int ans = Integer.MIN_VALUE, sum = 0;
//        System.out.println(ans);
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            ans = Math.max(ans, sum);
            if (sum < 0) {
                sum = 0;
            }
        }
        return ans;
    }
}

    