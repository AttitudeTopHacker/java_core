package com.java.Aug_24_2023;

/**
 * create by  mohd salman
 * Date : 12/10/23
 * Time : 11:58 am
 * Project_Name : java_core
 */

public class rotateArrayMinValue {
    public static void main(String[] args) {
//                            0  1  2  3  4  5   6   7   8  9 10 11
        int[] arr = new int[]{5, 6, 7, 8, 9, 10, 11, 12, 1, 2, 3, 4};
        System.out.println(findMin_value(arr));
    }

    private static int findMin_value(int[] arr) {
        int ans = -1;
        int lo = 0;
        int hi = arr.length - 1;
        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if (arr[mid] > arr[arr.length - 1]) {
                lo = mid + 1;
            } else if (arr[mid] <= arr[arr.length - 1]) {
                ans = mid;
                hi = mid - 1;
            }
        }
        return ans;
    }

}

    