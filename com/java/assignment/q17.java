package com.java.assignment;

import java.util.Arrays;
import java.util.Scanner;

public class q17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int q = sc.nextInt();

        for (int i = 0; i < q; i++) {
            int money = sc.nextInt();
            int item = sc.nextInt();
            int count = 0;
            int sum = 0;
            for (int j = 0; j < N; j++) {
                sum = sum + arr[j];
                if (sum <= money||money<=arr[j]) {
                    count++;
                }
            }
            if (count >= item) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
