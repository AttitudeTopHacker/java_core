package com.java.assignment;

import java.util.Scanner;

/**
 * create by  mohd salman
 * Date : 19/09/23
 * Time : 2:34 pm
 * Project_Name : java_core
 */

public class majority_element {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }
        Majors(arr, N);
    }

    private static void Majors(int[] arr, int n) {
        int maxCount = 0;
        int index = -1;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j])
                    count++;
            }
            if (count > maxCount) {
                maxCount = count;
                index = i;
            }
        }
        if (maxCount > n / 2)
            System.out.println(arr[index]);

    }
}

    