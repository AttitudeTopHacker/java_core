package com.java.repeat;

/**
 * create by  mohd salman
 * Date : 24/02/24
 * Time : 1:19 pm
 * Project_Name : java_core
 */

public class r24 {
    public static void main(String[] args) {
        int[] arr = new int[]{6, 7, 8, 9, 1, 2, 3, 4, 5,};
//        int[] arr = new int[]{1, 1, 1, 2, 2, 3, 1};                                                                                                                 0
        int lo = 0, hi = arr.length - 1, target = 2;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;

            if (arr[mid] == target) {
                System.out.println(arr[mid]);
                break;
            }
            /*if (arr[mid] == arr[lo] && arr[mid] == arr[hi]) {
                lo++;
                hi--;
            } else */if (arr[lo] <= arr[mid]) {
                if (arr[lo] <= target & arr[mid] >= target) {
                    hi = mid - 1;
                } else {
                    lo = mid + 1;
                }
            } else {
                if (arr[hi] >= target && arr[mid] <= target) {
                    lo = mid + 1;
                } else {
                    hi = mid - 1;
                }
            }
        }

    }

}

    