package com.java.assignment;

import java.util.Scanner;

public class q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            int x = sc.nextInt();
            int[] cpy = new int[N];
            if (x == 1) {
                cpy[0] = arr[N - 1] + arr[0];
                for (int j = 1; j < N; j++) {
                    cpy[j] = arr[j] + arr[j - 1];
                }
                arr = cpy;
            } else {
                for (int j = 0; j < N; j++) {
                    cpy[j] = arr[j] * 2;
                }
                arr = cpy;

            }
        }
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
