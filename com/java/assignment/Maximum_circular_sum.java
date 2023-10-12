package com.java.assignment;

import java.util.Scanner;

/**
 * create by  mohd salman
 * Date : 18/09/23
 * Time : 5:50 pm
 * Project_Name : java_core
 */

public class Maximum_circular_sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] array = new int[N];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println(MaximumOfsum(array, N));
    }

    private static int MaximumOfsum(int[] array, int n) {
        int sum = 0, ans = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            sum = sum + array[i];
            ans = Math.max(sum, ans);
            if (sum < 0) {
                sum = 0;
            }
        }

        return sum;
    }
}

    