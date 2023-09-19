package com.java.assignment;

import java.util.Scanner;

/**
 * create by  mohd salman
 * Date : 19/09/23
 * Time : 7:34 am
 * Project_Name : java_core
 */

public class circularsum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T > 0) {
            int N = scanner.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = scanner.nextInt();
            }
            int firstk = kdanes(arr, N);
            int total = 0;
            for (int i = 0; i < N; i++) {
                total += arr[i];
                arr[i] *= (-1);
            }

            int secondk = kdanes(arr, N);
            int circular = total + secondk;
            System.out.println(Math.max(circular, firstk));
            T--;
        }
    }


    private static int kdanes(int[] arr, int N) {

        int sum = 0, ans = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            sum += arr[i];
            ans = Math.max(ans, sum);
            if (sum < 0) {
                sum = 0;
            }

        }
        return ans;
    }
}

    