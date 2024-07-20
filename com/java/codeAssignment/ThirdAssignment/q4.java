package com.java.codeAssignment.ThirdAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt(), i, j = arr.length - 1;
        i = 0;
        Arrays.sort(arr);
        while (i < j) {
            if (arr[i] + arr[j] == target) {
                System.out.println(arr[i] + " and " + arr[j]);
                i++;
                j--;
            } else if (arr[i] + arr[j] < target) {
                i++;
            } else {
                j--;
            }
        }
    }
}