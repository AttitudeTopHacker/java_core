package com.java.Aug_24_2023.program;

/**
 * create by  mohd salman
 * Date : 12/10/23
 * Time : 2:26 pm
 * Project_Name : java_core
 */

public class rotateArrayDuplicate {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 1, 1, 2, 2, 3, 1};
        int target = 3;
        System.out.println(findElementIndex(arr, target));
    }

    private static int findElementIndex(int[] arr, int target) {

        int lo = 0;
        int hi = arr.length - 1;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (arr[mid] == target)
                return mid;
            if ((arr[mid] == arr[lo]) && arr[mid] == arr[hi]) {
                lo++;
                hi--;
            } else if (arr[mid] <= arr[hi]) {
                if (arr[mid] < target && arr[hi] >= target) {
                    lo = mid + 1;
                } else {
                    hi = mid - 1;
                }

            } else {
                if (arr[lo] <= target && arr[mid] > target) {
                    hi = mid - 1;
                } else {
                    lo = mid + 1;
                }
            }
        }
        return -1;
    }
}


    