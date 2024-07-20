package com.java.codeAssignment.fourthAssignment;

import java.util.Arrays;
import java.util.Scanner;

//
//Given a 2D array, sort each of its rows and print the result.
//        Input Format
//
//First line contains 2 integers - r & c. Next r lines contains c integers each denoting the matrix elements.
//        Constraints
//
//1 <= R,C <= 100
//Output Format
//
//Print the modified matrix
//Sample Input
//
//4 5
//        13 5 13 9 11
//        5 10 11 4 6
//        6 10 17 12 16
//        8 11 7 18 5
//
//Sample Output
//
//5 9 11 13 13
//        4 5 6 10 11
//        6 10 12 16 17
//        5 7 8 11 18
//

public class q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        int[][] arr = new int[R][C];
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int row = 0; row < R; row++) {
            sortArray(arr, row);
        }
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

    private static void sortArray(int[][] arr, int R) {
        int N = arr[R].length;
        int[] arr1 = new int[N];
        for (int i = 0; i < N; i++) {
            arr1[i] = arr[R][i];
        }
        Arrays.sort(arr1);
        for (int i = 0; i < N; i++) {
            arr[R][i] = arr1[i];
        }

    }
}
