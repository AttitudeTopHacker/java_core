package com.java.Aug_24_2023;

import java.util.Scanner;

/**
 * create by  mohd salman
 * Date : 12/10/23
 * Time : 9:35 am
 * Project_Name : java_core
 */

public class rotatedTheBinarySearch {

    public static void main(String[] args) {
        int[] arr = new int[]{5, 6, 7, 8, 9, 10, 1, 2, 3, 4};
        int lo = 0;
        int hi = arr.length - 1;
        int target = (new Scanner(System.in)).nextInt();
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (arr[mid] == target) {
                System.out.println(target);
                break;
            } else if (arr[mid] < arr[hi]) {
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
        if (lo > hi) {
            System.out.println("not find :-");
        }

    }
}

    