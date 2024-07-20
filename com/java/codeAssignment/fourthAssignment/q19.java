package com.java.codeAssignment.fourthAssignment;

import java.util.Scanner;

public class q19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] arr = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (j < i) {
                    System.out.print(0 + " ");
                } else System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
