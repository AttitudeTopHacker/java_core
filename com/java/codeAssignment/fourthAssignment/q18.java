package com.java.codeAssignment.fourthAssignment;

//
//Given a boolean matrix mat[M][N] of size M X N, modify it such that if a matrix cell mat[i][j] is 1 (or true) then make all the cells of ith row and jth column as 1.
//Input Format
//
//First line contains two integers m and n denoting the dimensions of the matrix Next m lines contains n integers each.
//        Constraints
//
//1 <= m*n <= 106
//Output Format
//
//Print the modified matrix
//Sample Input
//
//2 2
//        1 0
//        0 0
//
//Sample Output
//
//1 1
//        1 0
//

import java.util.Arrays;
import java.util.Scanner;

public class q18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] mat = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        int[] Row = new int[N];
        int[] Col = new int[M];



        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (mat[i][j] == 1) {
                    Row[i] = 1;
                    Col[j] = 1;
                }
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (Row[i] == 1|| Col[j] == 1  ) {
                   mat[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

    }
}
