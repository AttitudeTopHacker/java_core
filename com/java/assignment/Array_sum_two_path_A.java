package com.java.assignment;

import java.util.Scanner;

/**
 * create by  mohd salman
 * Date : 18/09/23
 * Time : 5:17 pm
 * Project_Name : java_core
 */

public class Array_sum_two_path_A {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int T = scanner.nextInt();
//        while (T > 0) {
//            int M = scanner.nextInt();
//            int N = scanner.nextInt();
//            int[] arr1 = new int[M];
//            int[] arr2 = new int[N];
//            for (int i = 0; i < arr1.length; i++) {
//                arr1[i] = scanner.nextInt();
//            }
//            for (int i = 0; i < arr2.length; i++) {
//                arr2[i] = scanner.nextInt();
//            }
//            System.out.println(TwoArrayPath(arr1, arr2, M, N));
//            T--;
//        }
        int[] arr1 = {2, 3, 7, 10, 12, 15, 30, 34};
        int[] arr2 = {1, 5, 7, 8, 10, 15, 16, 19};
        System.out.println(Maximum_SumPath(arr1, arr2, arr1.length, arr2.length));
    }

    private static int Maximum_SumPath(int[] arr1, int[] arr2, int m, int n) {
        int ans = 0;
        int i = 0, j = 0, s1 = 0, s2 = 0;
        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
//                sum1 += arr1[i];
                i++;
            } else if (arr2[j] < arr1[i]) {
//                sum2 += arr2[j];
                j++;
            } else {

//                 else {
//                    ans += Math.max(arr1sum, arr2sum);
//                    arr1sum = 0;
//                    arr2sum = 0;
//                    while (arr1[i] == arr2[j] && i < m && j < n) {
//                        ans += arr1[i];
//                        i++;
//                        j++;
//                    }
//                }
                int sum1 = 0;
                for (int k = s1; k <= i; k++) {
                    sum1 += arr1[k];


                }
                int sum2 = 0;
                for (int k = s2; k <= j; k++) {
                    sum2 += arr2[k];
                }
                ans += Math.max(sum1, sum2);
                i++;
                j++;
                s1 = i;
                s2 = j;
            }

        }
        int sum1 = 0;
        for (int k = s1; k < n; k++) {
            sum1 += arr1[k];
        }
        int sum2 = 0;
        for (int k = s2; k < m; k++) {
            sum2 += arr2[k];
        }
        ans += Math.max(sum1, sum2);

        return ans;
    }


}

    