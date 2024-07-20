package com.java.codeAssignment.fourthAssignment;

import java.util.Scanner;

public class helpRamu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int c1 = sc.nextInt();
            int c2 = sc.nextInt();
            int c3 = sc.nextInt();
            int c4 = sc.nextInt();
            int N = sc.nextInt();// number of rikshaw
            int M = sc.nextInt();// number of cab
            int[] ricks = new int[N];
            int[] cabs = new int[M];

            for (int i = 0; i < N; i++) {
                ricks[i] = sc.nextInt();
            }
            for (int i = 0; i < M; i++) {
                cabs[i] = sc.nextInt();
            }
            System.out.println(Math.min(Minicost(ricks, N, c1, c2, c3) + Minicost(cabs, M, c1, c2, c3), c4));
        }
    }

    private static int Minicost(int[] ricks, int n, int c1, int c2, int c3) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += Math.min(c1 * ricks[i], c2);
        }
        return Math.min(sum, c3);
    }
}
