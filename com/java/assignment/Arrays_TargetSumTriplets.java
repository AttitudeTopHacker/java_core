package com.java.assignment;

import java.util.Arrays;
import java.util.Scanner;

/**
 * create by  mohd salman
 * Date : 17/09/23
 * Time : 12:30 am
 * Project_Name : java_core
 */

public class Arrays_TargetSumTriplets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        9
//        5 7 9 1 2 4 6 8 3
//        10
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int target = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {

//            for (int j = i + 1; j < arr.length; j++) {
//                for (int k = j + 1; k < arr.length; k++) {
//                    if (arr[i] + arr[j] + arr[k] == target) {
//                        System.out.println(arr[i]+", "+arr[j] +" and "+arr[k]);
//
//                    }
//                }
//            }
            for (int l = i + 1, r = arr.length - 1; l < r; ) {

                if (arr[i] + arr[l] + arr[r] == target) {
                    System.out.println(arr[i] + ", " + arr[l] + " and " + arr[r]);
                    l++;
                    r--;
                } else if (arr[i] + arr[l] + arr[r] < target) {
                    l++;
                } else {
                    r--;
                }
            }
        }
    }
}

    