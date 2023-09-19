package com.java.Aug_24_2023;

import java.util.Scanner;

/**
 * create by  mohd salman
 * Date : 15/09/23
 * Time : 9:46 pm
 * Project_Name : java_core
 */

public class water_rain_trapping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();
        while (T > 0) {
            int N = scanner.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = scanner.nextInt();
            }
            System.out.println(WatarTrappingSum(arr, N));
            T--;
        }

    }

    private static int WatarTrappingSum(int[] arr, int N) {
        int[] left = new int[N];
        int[] right = new int[N];
        left[0] = arr[0];
        for (int i = 1; i < N; i++) {
            left[i] = Math.max(left[i - 1], arr[i]);
        }
        right[N - 1] = arr[N - 1];
        for (int i = N - 2; i >= 0; i--) {
            right[i] = Math.max(right[i + 1], arr[i]);
        }
        int sum = 0;

        for (int i = 0; i < N; i++) {
            sum = sum + Math.min(left[i], right[i]) - arr[i];
        }
        return sum;
    }

}
    