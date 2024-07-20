package com.java.codeAssignment.fourthAssignment;

import java.util.Scanner;

//
//First line contains a single integer N. Next N lines contain N space separated integers.
//Constraints
//
//N < 1000
//Output Format
//
//Print N lines with N space separated integers of the rotated array.
//Sample Input
//
//4
//        1 2 3 4
//        5 6 7 8
//        9 10 11 12
//        13 14 15 16
//
//Sample Output
//
//        4 8 12 16
//        3 7 11 15
//        2 6 10 14
//        1 5 9 13
//
//Explanation
//
//Rotate the array 90 degrees anticlockwise.


public class q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col;
        col = row;
        int[][] arr = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < row; i++) {
            ReverserMatrix(i, col, arr);
        }
        for (int i = 0; i <= row; i++) {
            for (int j = i; j < col; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

    private static void ReverserMatrix(int rowNumber, int col, int[][] arr) {
        int l = 0;
        int r = col - 1;
        while (l < r) {
            int temp = arr[rowNumber][l];
            arr[rowNumber][l] = arr[rowNumber][r];
            arr[rowNumber][r] = temp;
            l++;
            r--;
        }
    }
}
