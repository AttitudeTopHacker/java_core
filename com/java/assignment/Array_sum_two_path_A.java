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
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T > 0) {
            int M = scanner.nextInt();
            int N = scanner.nextInt();
            int[] arr1 = new int[M];
            int[] arr2 = new int[N];
            for (int i = 0; i < arr1.length; i++) {
                arr1[i] = scanner.nextInt();
            }
            for (int i = 0; i < arr2.length; i++) {
                arr2[i] = scanner.nextInt();
            }
            System.out.println(TwoArrayPath(arr1, arr2, M, N));
            T--;
        }
    }

    private static int TwoArrayPath(int[] arr1, int[] arr2, int m, int n) {
        int i = 0, j = 0, arr1sum = 0, arr2sum = 0, ans = 0;
        for (; i < m && j < n; ) {
            if (arr1[i] < arr2[j]) {
                arr1sum += arr1[i];
                i++;
            } else if (arr2[j] < arr1[i]) {
                arr2sum += arr2[j];
                j++;
            } else {
                ans += Math.max(arr1sum, arr2sum);
                arr1sum = 0;
                arr2sum = 0;
                while (arr1[i] == arr2[j] && i < m && j < n) {
                    ans += arr1[i];
                    i++;
                    j++;
                }
            }
        }
        while (i < m) {
            arr1sum += arr1[i];
            i++;
        }
        while (j < n) {
            arr2sum += arr2[j];
            j++;
        }
        ans += Math.max(arr1sum, arr2sum);
        return ans;
    }
}

    