package com.java.Aug_24_2023.program;

/**
 * create by  mohd salman
 * Date : 15/09/23
 * Time : 9:18 pm
 * Project_Name : java_core
 */
//7 -8, 8, -9, 9, -10, 11, -12
public class kadens_Maximum_subarray_sum {
    public static void main(String[] args) {
        int[] arr = {-8, 8, -9, 9, -10, 11, -12};
        System.out.println(Kadens(arr));

    }

    private static int Kadens(int[] arr) {
        int ans = Integer.MIN_VALUE;
        int sum = 0;
        for (int j : arr) {
            sum += j;
            ans = Math.max(sum, ans);
            if (sum < 0)  //jab sum zero ya zero se kam  ho jaye tab sum me zero assign kro
                sum = 0;
        }
        return ans;
    }
}

    